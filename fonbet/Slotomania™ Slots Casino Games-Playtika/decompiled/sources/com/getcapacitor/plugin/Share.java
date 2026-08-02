package com.getcapacitor.plugin;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.webkit.internal.AssetHelper;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.safedk.android.utils.Logger;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;

@NativePlugin
/* loaded from: classes3.dex */
public class Share extends Plugin {
    public static void safedk_AppCompatActivity_startActivity_a955971bc7cfd53da954b60b6b0cd311(AppCompatActivity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/appcompat/app/AppCompatActivity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @PluginMethod
    public void share(PluginCall pluginCall) {
        String string = pluginCall.getString("title", "");
        String string2 = pluginCall.getString("text");
        String string3 = pluginCall.getString("url");
        String string4 = pluginCall.getString("dialogTitle", "Share");
        if (string2 == null && string3 == null) {
            pluginCall.error("Must provide a URL or Message");
            return;
        }
        if (string3 != null && !isFileUrl(string3) && !isHttpUrl(string3)) {
            pluginCall.error("Unsupported url");
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (string2 != null) {
            if (string3 != null && isHttpUrl(string3)) {
                string2 = string2 + ServerSentEventKt.SPACE + string3;
            }
            intent.putExtra("android.intent.extra.TEXT", string2);
            intent.setTypeAndNormalize(AssetHelper.DEFAULT_MIME_TYPE);
        }
        if (string3 != null && isHttpUrl(string3) && string2 == null) {
            intent.putExtra("android.intent.extra.TEXT", string3);
            intent.setTypeAndNormalize(AssetHelper.DEFAULT_MIME_TYPE);
        } else if (string3 != null && isFileUrl(string3)) {
            intent.setType(getMimeType(string3));
            Uri uriForFile = FileProvider.getUriForFile(getActivity(), getContext().getPackageName() + ".fileprovider", new File(Uri.parse(string3).getPath()));
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            if (Build.VERSION.SDK_INT >= 29) {
                intent.setData(uriForFile);
            }
            intent.setFlags(1);
        }
        if (string != null) {
            intent.putExtra("android.intent.extra.SUBJECT", string);
        }
        Intent createChooser = Intent.createChooser(intent, string4);
        createChooser.addCategory("android.intent.category.DEFAULT");
        safedk_AppCompatActivity_startActivity_a955971bc7cfd53da954b60b6b0cd311(getActivity(), createChooser);
        pluginCall.success();
    }

    private String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private boolean isFileUrl(String str) {
        return str.startsWith("file:");
    }

    private boolean isHttpUrl(String str) {
        return str.startsWith("http");
    }
}
