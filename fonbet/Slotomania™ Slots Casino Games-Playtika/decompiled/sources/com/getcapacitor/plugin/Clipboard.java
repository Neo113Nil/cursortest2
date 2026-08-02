package com.getcapacitor.plugin;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.webkit.internal.AssetHelper;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin
/* loaded from: classes8.dex */
public class Clipboard extends Plugin {
    @PluginMethod
    public void write(PluginCall pluginCall) {
        ClipData newPlainText;
        String string = pluginCall.getString("string");
        String string2 = pluginCall.getString("image");
        String string3 = pluginCall.getString("url");
        String string4 = pluginCall.getString("label");
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (string != null) {
            newPlainText = ClipData.newPlainText(string4, string);
        } else if (string2 != null) {
            newPlainText = ClipData.newPlainText(string4, string2);
        } else {
            newPlainText = string3 != null ? ClipData.newPlainText(string4, string3) : null;
        }
        if (newPlainText != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        pluginCall.success();
    }

    @PluginMethod
    public void read(PluginCall pluginCall) {
        CharSequence charSequence;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean hasPrimaryClip = clipboardManager.hasPrimaryClip();
        String str = AssetHelper.DEFAULT_MIME_TYPE;
        if (!hasPrimaryClip) {
            charSequence = null;
        } else if (clipboardManager.getPrimaryClipDescription().hasMimeType(AssetHelper.DEFAULT_MIME_TYPE)) {
            Logger.debug(getLogTag(), "Got plaintxt");
            charSequence = clipboardManager.getPrimaryClip().getItemAt(0).getText();
        } else {
            Logger.debug(getLogTag(), "Not plaintext!");
            charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext()).toString();
        }
        JSObject jSObject = new JSObject();
        jSObject.put("value", (Object) (charSequence != null ? charSequence : ""));
        if (charSequence != null && charSequence.toString().startsWith("data:")) {
            str = charSequence.toString().split(";")[0].split(":")[1];
        }
        jSObject.put("type", str);
        pluginCall.success(jSObject);
    }
}
