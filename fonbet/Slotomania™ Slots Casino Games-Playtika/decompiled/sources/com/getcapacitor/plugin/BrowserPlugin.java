package com.getcapacitor.plugin;

import android.content.ActivityNotFoundException;
import android.graphics.Color;
import android.net.Uri;
import com.getcapacitor.Logger;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.plugin.Browser;

@NativePlugin(name = "Browser")
/* loaded from: classes6.dex */
public class BrowserPlugin extends Plugin {
    private Browser implementation;

    @Override // com.getcapacitor.Plugin
    public void load() {
        Browser browser = new Browser(getContext());
        this.implementation = browser;
        browser.setBrowserEventListener(new Browser.BrowserEventListener() { // from class: com.getcapacitor.plugin.BrowserPlugin$$ExternalSyntheticLambda0
            @Override // com.getcapacitor.plugin.Browser.BrowserEventListener
            public final void onBrowserEvent(int i) {
                BrowserPlugin.this.onBrowserEvent(i);
            }
        });
    }

    @PluginMethod
    public void open(PluginCall pluginCall) {
        Integer valueOf;
        String string = pluginCall.getString("url");
        if (string == null) {
            pluginCall.reject("Must provide a URL to open");
            return;
        }
        if (string.isEmpty()) {
            pluginCall.reject("URL must not be empty");
            return;
        }
        try {
            Uri parse = Uri.parse(string);
            String string2 = pluginCall.getString("toolbarColor");
            try {
                if (string2 != null) {
                    try {
                        valueOf = Integer.valueOf(Color.parseColor(string2));
                    } catch (IllegalArgumentException unused) {
                        Logger.error(getLogTag(), "Invalid color provided for toolbarColor. Using default", null);
                    }
                    this.implementation.open(parse, valueOf);
                    pluginCall.resolve();
                    return;
                }
                this.implementation.open(parse, valueOf);
                pluginCall.resolve();
                return;
            } catch (ActivityNotFoundException e) {
                Logger.error(getLogTag(), e.getLocalizedMessage(), null);
                pluginCall.reject("Unable to display URL");
                return;
            }
            valueOf = null;
        } catch (Exception e2) {
            pluginCall.reject(e2.getLocalizedMessage());
        }
    }

    @PluginMethod
    public void close(PluginCall pluginCall) {
        pluginCall.unimplemented();
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnResume() {
        if (this.implementation.bindService()) {
            return;
        }
        Logger.error(getLogTag(), "Error binding to custom tabs service", null);
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnPause() {
        this.implementation.unbindService();
    }

    void onBrowserEvent(int i) {
        if (i == 1) {
            notifyListeners("browserPageLoaded", null);
        } else {
            if (i != 2) {
                return;
            }
            notifyListeners("browserFinished", null);
        }
    }
}
