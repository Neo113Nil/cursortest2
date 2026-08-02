package com.vk.clips.reports.impl.data;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsReportCategory.kt */
/* loaded from: classes16.dex */
public final class ClipsReportCategory {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsReportCategory[] $VALUES;
    public static final ClipsReportCategory ADULT_CONTENT;
    public static final ClipsReportCategory FRAUD;
    public static final ClipsReportCategory PROFILE;
    public static final ClipsReportCategory RESTRICTED_PRODUCT;
    public static final ClipsReportCategory SPAM;
    public static final ClipsReportCategory VIOLENCE_AND_HOSTILITY;
    private final String key;

    static {
        ClipsReportCategory clipsReportCategory = new ClipsReportCategory("SPAM", 0, "spam");
        SPAM = clipsReportCategory;
        ClipsReportCategory clipsReportCategory2 = new ClipsReportCategory("RESTRICTED_PRODUCT", 1, "restricted_product");
        RESTRICTED_PRODUCT = clipsReportCategory2;
        ClipsReportCategory clipsReportCategory3 = new ClipsReportCategory("FRAUD", 2, "fraud");
        FRAUD = clipsReportCategory3;
        ClipsReportCategory clipsReportCategory4 = new ClipsReportCategory("VIOLENCE_AND_HOSTILITY", 3, "violence_and_hostility");
        VIOLENCE_AND_HOSTILITY = clipsReportCategory4;
        ClipsReportCategory clipsReportCategory5 = new ClipsReportCategory("ADULT_CONTENT", 4, "adult_content");
        ADULT_CONTENT = clipsReportCategory5;
        ClipsReportCategory clipsReportCategory6 = new ClipsReportCategory("PROFILE", 5, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = clipsReportCategory6;
        ClipsReportCategory[] clipsReportCategoryArr = {clipsReportCategory, clipsReportCategory2, clipsReportCategory3, clipsReportCategory4, clipsReportCategory5, clipsReportCategory6};
        $VALUES = clipsReportCategoryArr;
        $ENTRIES = new asp(clipsReportCategoryArr);
    }

    public ClipsReportCategory(String str, int i, String str2) {
        this.key = str2;
    }

    public static ClipsReportCategory valueOf(String str) {
        return (ClipsReportCategory) Enum.valueOf(ClipsReportCategory.class, str);
    }

    public static ClipsReportCategory[] values() {
        return (ClipsReportCategory[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
