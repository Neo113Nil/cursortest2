package com.vk.newsfeed.common.recycler.animators;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemAnimation.kt */
/* loaded from: classes4.dex */
public final class ItemAnimationType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemAnimationType[] $VALUES;
    public static final ItemAnimationType Add;
    public static final ItemAnimationType Change;
    public static final ItemAnimationType Move;
    public static final ItemAnimationType Remove;

    static {
        ItemAnimationType itemAnimationType = new ItemAnimationType("Remove", 0);
        Remove = itemAnimationType;
        ItemAnimationType itemAnimationType2 = new ItemAnimationType("Add", 1);
        Add = itemAnimationType2;
        ItemAnimationType itemAnimationType3 = new ItemAnimationType("Move", 2);
        Move = itemAnimationType3;
        ItemAnimationType itemAnimationType4 = new ItemAnimationType("Change", 3);
        Change = itemAnimationType4;
        ItemAnimationType[] itemAnimationTypeArr = {itemAnimationType, itemAnimationType2, itemAnimationType3, itemAnimationType4};
        $VALUES = itemAnimationTypeArr;
        $ENTRIES = new asp(itemAnimationTypeArr);
    }

    public ItemAnimationType() {
        throw null;
    }

    public static ItemAnimationType valueOf(String str) {
        return (ItemAnimationType) Enum.valueOf(ItemAnimationType.class, str);
    }

    public static ItemAnimationType[] values() {
        return (ItemAnimationType[]) $VALUES.clone();
    }
}
