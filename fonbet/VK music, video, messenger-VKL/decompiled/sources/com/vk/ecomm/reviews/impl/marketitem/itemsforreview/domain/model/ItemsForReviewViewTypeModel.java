package com.vk.ecomm.reviews.impl.marketitem.itemsforreview.domain.model;

import com.ironsource.C4504q2;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemsForReviewViewTypeModel.kt */
/* loaded from: classes18.dex */
public final class ItemsForReviewViewTypeModel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemsForReviewViewTypeModel[] $VALUES;
    public static final ItemsForReviewViewTypeModel COMMUNITY_MAIN;
    public static final ItemsForReviewViewTypeModel MARKET_MAIN;
    public static final ItemsForReviewViewTypeModel ORDER;
    private final String value;

    static {
        ItemsForReviewViewTypeModel itemsForReviewViewTypeModel = new ItemsForReviewViewTypeModel("COMMUNITY_MAIN", 0, "community_main");
        COMMUNITY_MAIN = itemsForReviewViewTypeModel;
        ItemsForReviewViewTypeModel itemsForReviewViewTypeModel2 = new ItemsForReviewViewTypeModel("MARKET_MAIN", 1, "market_main");
        MARKET_MAIN = itemsForReviewViewTypeModel2;
        ItemsForReviewViewTypeModel itemsForReviewViewTypeModel3 = new ItemsForReviewViewTypeModel("ORDER", 2, C4504q2.u);
        ORDER = itemsForReviewViewTypeModel3;
        ItemsForReviewViewTypeModel[] itemsForReviewViewTypeModelArr = {itemsForReviewViewTypeModel, itemsForReviewViewTypeModel2, itemsForReviewViewTypeModel3};
        $VALUES = itemsForReviewViewTypeModelArr;
        $ENTRIES = new asp(itemsForReviewViewTypeModelArr);
    }

    public ItemsForReviewViewTypeModel(String str, int i, String str2) {
        this.value = str2;
    }

    public static ItemsForReviewViewTypeModel valueOf(String str) {
        return (ItemsForReviewViewTypeModel) Enum.valueOf(ItemsForReviewViewTypeModel.class, str);
    }

    public static ItemsForReviewViewTypeModel[] values() {
        return (ItemsForReviewViewTypeModel[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
