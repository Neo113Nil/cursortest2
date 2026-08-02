package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import java.util.List;
import java.util.Map;
import org.chromium.base.CommandLine;

/* loaded from: classes10.dex */
class CommandLineJni implements CommandLine.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CommandLineJni() {
    }

    public static CommandLine.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CommandLine.Natives) jniTestInstanceHolder.value;
        }
        return new CommandLineJni();
    }

    public static void setInstanceForTesting(CommandLine.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitchWithValue(String switchString, String value) {
        GEN_JNI.org_chromium_base_CommandLine_appendSwitchWithValue(switchString, value);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitchesAndArguments(String[] array) {
        GEN_JNI.org_chromium_base_CommandLine_appendSwitchesAndArguments(array);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public String getSwitchValue(String switchString) {
        return (String) GEN_JNI.org_chromium_base_CommandLine_getSwitchValue(switchString);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public Map getSwitches() {
        return (Map) GEN_JNI.org_chromium_base_CommandLine_getSwitches();
    }

    @Override // org.chromium.base.CommandLine.Natives
    public boolean hasSwitch(String switchString) {
        return GEN_JNI.org_chromium_base_CommandLine_hasSwitch(switchString);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void init(List args) {
        GEN_JNI.org_chromium_base_CommandLine_init(args);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void removeSwitch(String switchString) {
        GEN_JNI.org_chromium_base_CommandLine_removeSwitch(switchString);
    }
}
