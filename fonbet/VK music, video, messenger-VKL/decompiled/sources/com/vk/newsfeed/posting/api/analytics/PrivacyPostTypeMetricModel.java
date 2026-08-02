package com.vk.newsfeed.posting.api.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivacyPostTypeMetricModel.kt */
/* loaded from: classes4.dex */
public final class PrivacyPostTypeMetricModel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PrivacyPostTypeMetricModel[] $VALUES;
    public static final PrivacyPostTypeMetricModel ALL_USERS;
    public static final PrivacyPostTypeMetricModel BEST_FRIENDS;
    public static final PrivacyPostTypeMetricModel FRIENDS_ONLY;

    static {
        PrivacyPostTypeMetricModel privacyPostTypeMetricModel = new PrivacyPostTypeMetricModel("ALL_USERS", 0);
        ALL_USERS = privacyPostTypeMetricModel;
        PrivacyPostTypeMetricModel privacyPostTypeMetricModel2 = new PrivacyPostTypeMetricModel("FRIENDS_ONLY", 1);
        FRIENDS_ONLY = privacyPostTypeMetricModel2;
        PrivacyPostTypeMetricModel privacyPostTypeMetricModel3 = new PrivacyPostTypeMetricModel("BEST_FRIENDS", 2);
        BEST_FRIENDS = privacyPostTypeMetricModel3;
        PrivacyPostTypeMetricModel[] privacyPostTypeMetricModelArr = {privacyPostTypeMetricModel, privacyPostTypeMetricModel2, privacyPostTypeMetricModel3};
        $VALUES = privacyPostTypeMetricModelArr;
        $ENTRIES = new asp(privacyPostTypeMetricModelArr);
    }

    public PrivacyPostTypeMetricModel() {
        throw null;
    }

    public static PrivacyPostTypeMetricModel valueOf(String str) {
        return (PrivacyPostTypeMetricModel) Enum.valueOf(PrivacyPostTypeMetricModel.class, str);
    }

    public static PrivacyPostTypeMetricModel[] values() {
        return (PrivacyPostTypeMetricModel[]) $VALUES.clone();
    }
}
