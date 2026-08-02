package org.chromium.base;

/* loaded from: classes10.dex */
public class FieldTrialList {

    interface Natives {
        boolean createFieldTrial(String trialName, String groupName);

        String findFullName(String trialName);

        String getVariationParameter(String trialName, String parameterKey);

        void logActiveTrials();

        boolean trialExists(String trialName);
    }

    private FieldTrialList() {
    }

    public static String findFullName(String trialName) {
        return FieldTrialListJni.get().findFullName(trialName);
    }

    public static boolean trialExists(String trialName) {
        return FieldTrialListJni.get().trialExists(trialName);
    }

    public static String getVariationParameter(String trialName, String parameterKey) {
        return FieldTrialListJni.get().getVariationParameter(trialName, parameterKey);
    }

    public static void logActiveTrials() {
        FieldTrialListJni.get().logActiveTrials();
    }

    public static boolean createFieldTrial(String trialName, String groupName) {
        return FieldTrialListJni.get().createFieldTrial(trialName, groupName);
    }
}
