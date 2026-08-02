package com.vk.ads.easypromote.impl.domain;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EasyPromoteConfig.kt */
/* loaded from: classes14.dex */
public final class BudgetLevel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BudgetLevel[] $VALUES;
    public static final BudgetLevel BAD;
    public static final BudgetLevel BEST;
    public static final BudgetLevel GOOD;
    public static final BudgetLevel MID;
    public static final BudgetLevel VERY_GOOD;
    private final int budgetThreshold;
    private final int description;

    static {
        BudgetLevel budgetLevel = new BudgetLevel("BAD", 0, 250, R.string.easy_promote_settings_budget_bad);
        BAD = budgetLevel;
        BudgetLevel budgetLevel2 = new BudgetLevel("MID", 1, 400, R.string.easy_promote_settings_budget_mid);
        MID = budgetLevel2;
        BudgetLevel budgetLevel3 = new BudgetLevel("GOOD", 2, 800, R.string.easy_promote_settings_budget_good);
        GOOD = budgetLevel3;
        BudgetLevel budgetLevel4 = new BudgetLevel("VERY_GOOD", 3, 2000, R.string.easy_promote_settings_budget_very_good);
        VERY_GOOD = budgetLevel4;
        BudgetLevel budgetLevel5 = new BudgetLevel("BEST", 4, Integer.MAX_VALUE, R.string.easy_promote_settings_budget_best);
        BEST = budgetLevel5;
        BudgetLevel[] budgetLevelArr = {budgetLevel, budgetLevel2, budgetLevel3, budgetLevel4, budgetLevel5};
        $VALUES = budgetLevelArr;
        $ENTRIES = new asp(budgetLevelArr);
    }

    public BudgetLevel(String str, int i, int i2, int i3) {
        this.budgetThreshold = i2;
        this.description = i3;
    }

    public static zrp<BudgetLevel> j() {
        return $ENTRIES;
    }

    public static BudgetLevel valueOf(String str) {
        return (BudgetLevel) Enum.valueOf(BudgetLevel.class, str);
    }

    public static BudgetLevel[] values() {
        return (BudgetLevel[]) $VALUES.clone();
    }

    public final int h() {
        return this.budgetThreshold;
    }

    public final int i() {
        return this.description;
    }
}
