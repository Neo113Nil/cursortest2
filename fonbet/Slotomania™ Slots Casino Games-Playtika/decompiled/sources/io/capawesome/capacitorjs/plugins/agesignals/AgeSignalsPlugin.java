package io.capawesome.capacitorjs.plugins.agesignals;

import com.getcapacitor.Logger;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import io.capawesome.capacitorjs.plugins.agesignals.classes.results.CheckAgeSignalsResult;
import io.capawesome.capacitorjs.plugins.agesignals.interfaces.NonEmptyResultCallback;
import io.capawesome.capacitorjs.plugins.agesignals.interfaces.Result;

@NativePlugin
/* loaded from: classes.dex */
public class AgeSignalsPlugin extends Plugin {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ERROR_UNKNOWN_ERROR = "An unknown error occurred.";
    public static final String TAG = "AgeSignals";
    private AgeSignals implementation;

    @Override // com.getcapacitor.Plugin
    public void load() {
        try {
            this.implementation = new AgeSignals(this);
        } catch (Exception e) {
            Logger.error(TAG, "Failed to load AgeSignals plugin.", e);
        }
    }

    @PluginMethod
    public void checkAgeSignals(final PluginCall pluginCall) {
        try {
            this.implementation.checkAgeSignals(new NonEmptyResultCallback<CheckAgeSignalsResult>() { // from class: io.capawesome.capacitorjs.plugins.agesignals.AgeSignalsPlugin.1
                @Override // io.capawesome.capacitorjs.plugins.agesignals.interfaces.NonEmptyResultCallback
                public void success(CheckAgeSignalsResult checkAgeSignalsResult) {
                    AgeSignalsPlugin.this.resolveCall(pluginCall, checkAgeSignalsResult);
                }

                @Override // io.capawesome.capacitorjs.plugins.agesignals.interfaces.Callback
                public void error(Exception exc) {
                    AgeSignalsPlugin.this.rejectCall(pluginCall, exc);
                }
            });
        } catch (Exception e) {
            rejectCall(pluginCall, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rejectCall(PluginCall pluginCall, Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = ERROR_UNKNOWN_ERROR;
        }
        Logger.error(TAG, message, exc);
        pluginCall.reject(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveCall(PluginCall pluginCall, Result result) {
        if (result == null) {
            pluginCall.resolve();
        } else {
            pluginCall.resolve(result.toJSObject());
        }
    }
}
