package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.FieldTrialList;

/* loaded from: classes10.dex */
class FieldTrialListJni implements FieldTrialList.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    FieldTrialListJni() {
    }

    public static FieldTrialList.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (FieldTrialList.Natives) jniTestInstanceHolder.value;
        }
        return new FieldTrialListJni();
    }

    public static void setInstanceForTesting(FieldTrialList.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public boolean createFieldTrial(String trialName, String groupName) {
        return GEN_JNI.org_chromium_base_FieldTrialList_createFieldTrial(trialName, groupName);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public String findFullName(String trialName) {
        return (String) GEN_JNI.org_chromium_base_FieldTrialList_findFullName(trialName);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public String getVariationParameter(String trialName, String parameterKey) {
        return (String) GEN_JNI.org_chromium_base_FieldTrialList_getVariationParameter(trialName, parameterKey);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public void logActiveTrials() {
        GEN_JNI.org_chromium_base_FieldTrialList_logActiveTrials();
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public boolean trialExists(String trialName) {
        return GEN_JNI.org_chromium_base_FieldTrialList_trialExists(trialName);
    }
}
