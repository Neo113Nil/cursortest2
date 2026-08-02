package com.vk.newsfeed.impl.items.posting.item.modals;

import xsna.asp;
import xsna.epx;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: PostingItemModel.kt */
/* loaded from: classes4.dex */
public final class Onboarding {
    public final tlo0 a;
    public final ItemType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingItemModel.kt */
    public static final class ItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;
        public static final ItemType CommunityVideo;
        public static final ItemType Post;
        public static final ItemType UserVideo;

        static {
            ItemType itemType = new ItemType("CommunityVideo", 0);
            CommunityVideo = itemType;
            ItemType itemType2 = new ItemType("UserVideo", 1);
            UserVideo = itemType2;
            ItemType itemType3 = new ItemType("Post", 2);
            Post = itemType3;
            ItemType[] itemTypeArr = {itemType, itemType2, itemType3};
            $VALUES = itemTypeArr;
            $ENTRIES = new asp(itemTypeArr);
        }

        public ItemType() {
            throw null;
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    public Onboarding(tlo0 tlo0Var, ItemType itemType) {
        this.a = tlo0Var;
        this.b = itemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Onboarding)) {
            return false;
        }
        Onboarding onboarding = (Onboarding) obj;
        return epx.f(this.a, onboarding.a) && this.b == onboarding.b;
    }

    public final int hashCode() {
        tlo0 tlo0Var = this.a;
        return this.b.hashCode() + ((tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Onboarding(subtitle=" + this.a + ", itemType=" + this.b + ')';
    }
}
