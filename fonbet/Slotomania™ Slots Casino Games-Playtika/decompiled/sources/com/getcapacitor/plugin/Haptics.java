package com.getcapacitor.plugin;

import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.plugin.haptics.HapticsImpactType;
import com.getcapacitor.plugin.haptics.HapticsImplementation;
import com.getcapacitor.plugin.haptics.HapticsNotificationType;

@NativePlugin
/* loaded from: classes8.dex */
public class Haptics extends Plugin {
    private HapticsImplementation implementation;

    @Override // com.getcapacitor.Plugin
    public void load() {
        this.implementation = new HapticsImplementation(getContext());
    }

    @PluginMethod
    public void vibrate(PluginCall pluginCall) {
        this.implementation.vibrate(pluginCall.getInt("duration", 300).intValue());
        pluginCall.resolve();
    }

    @PluginMethod
    public void impact(PluginCall pluginCall) {
        this.implementation.performHaptics(HapticsImpactType.fromString(pluginCall.getString("style")));
        pluginCall.resolve();
    }

    @PluginMethod
    public void notification(PluginCall pluginCall) {
        this.implementation.performHaptics(HapticsNotificationType.fromString(pluginCall.getString("type")));
        pluginCall.resolve();
    }

    @PluginMethod
    public void selectionStart(PluginCall pluginCall) {
        this.implementation.selectionStart();
        pluginCall.resolve();
    }

    @PluginMethod
    public void selectionChanged(PluginCall pluginCall) {
        this.implementation.selectionChanged();
        pluginCall.resolve();
    }

    @PluginMethod
    public void selectionEnd(PluginCall pluginCall) {
        this.implementation.selectionEnd();
        pluginCall.resolve();
    }
}
