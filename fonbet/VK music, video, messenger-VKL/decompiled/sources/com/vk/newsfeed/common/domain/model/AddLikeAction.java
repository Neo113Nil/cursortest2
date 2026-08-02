package com.vk.newsfeed.common.domain.model;

import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.zrp;

/* compiled from: PostAction.kt */
/* loaded from: classes4.dex */
public final class AddLikeAction {
    public final LikableItemType a;
    public final long b;
    public final UserId c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final TriggerType h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostAction.kt */
    public static final class TriggerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TriggerType[] $VALUES;
        public static final TriggerType BUTTON;
        public static final TriggerType DOUBLE_TAP;
        public static final TriggerType REACTIONS_MODAL;
        public static final TriggerType REACTIONS_POPUP;
        private final String value;

        static {
            TriggerType triggerType = new TriggerType("BUTTON", 0, "button");
            BUTTON = triggerType;
            TriggerType triggerType2 = new TriggerType("DOUBLE_TAP", 1, "double_tap");
            DOUBLE_TAP = triggerType2;
            TriggerType triggerType3 = new TriggerType("REACTIONS_MODAL", 2, "reactions_modal");
            REACTIONS_MODAL = triggerType3;
            TriggerType triggerType4 = new TriggerType("REACTIONS_POPUP", 3, "reactions_popup");
            REACTIONS_POPUP = triggerType4;
            TriggerType[] triggerTypeArr = {triggerType, triggerType2, triggerType3, triggerType4};
            $VALUES = triggerTypeArr;
            $ENTRIES = new asp(triggerTypeArr);
        }

        public TriggerType(String str, int i, String str2) {
            this.value = str2;
        }

        public static TriggerType valueOf(String str) {
            return (TriggerType) Enum.valueOf(TriggerType.class, str);
        }

        public static TriggerType[] values() {
            return (TriggerType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public AddLikeAction(LikableItemType likableItemType, long j, UserId userId, Integer num, String str, String str2, String str3, TriggerType triggerType) {
        this.a = likableItemType;
        this.b = j;
        this.c = userId;
        this.d = num;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = triggerType;
    }

    public final String a() {
        return this.e;
    }

    public final long b() {
        return this.b;
    }

    public final LikableItemType c() {
        return this.a;
    }

    public final UserId d() {
        return this.c;
    }

    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddLikeAction) {
            AddLikeAction addLikeAction = (AddLikeAction) obj;
            if (this.a == addLikeAction.a && this.b == addLikeAction.b && epx.f(this.c, addLikeAction.c) && epx.f(this.d, addLikeAction.d) && epx.f(this.e, addLikeAction.e) && epx.f(this.f, addLikeAction.f) && epx.f(this.g, addLikeAction.g) && this.h == addLikeAction.h) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final TriggerType h() {
        return this.h;
    }

    public final int hashCode() {
        int a = bh10.a(this.a.hashCode() * 31, 31, this.b);
        UserId userId = this.c;
        int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TriggerType triggerType = this.h;
        return hashCode5 + (triggerType != null ? triggerType.hashCode() : 0);
    }

    public final String toString() {
        return "AddLikeAction(itemType=" + this.a + ", itemId=" + ((Object) ("LikableItemId(value=" + this.b + ')')) + ", ownerId=" + this.c + ", reactionId=" + this.d + ", accessKey=" + this.e + ", ref=" + this.f + ", trackCode=" + this.g + ", triggerType=" + this.h + ')';
    }
}
