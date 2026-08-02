package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton;

import xsna.asp;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: MsgSkeletonItemInfo.kt */
/* loaded from: classes2.dex */
public final class MsgSkeletonItemInfo {
    public final float a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final AvatarState e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgSkeletonItemInfo.kt */
    public static final class AvatarState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AvatarState[] $VALUES;
        public static final AvatarState GONE;
        public static final AvatarState INVISIBLE;
        public static final AvatarState VISIBLE;

        static {
            AvatarState avatarState = new AvatarState("VISIBLE", 0);
            VISIBLE = avatarState;
            AvatarState avatarState2 = new AvatarState("INVISIBLE", 1);
            INVISIBLE = avatarState2;
            AvatarState avatarState3 = new AvatarState("GONE", 2);
            GONE = avatarState3;
            AvatarState[] avatarStateArr = {avatarState, avatarState2, avatarState3};
            $VALUES = avatarStateArr;
            $ENTRIES = new asp(avatarStateArr);
        }

        public AvatarState() {
            throw null;
        }

        public static AvatarState valueOf(String str) {
            return (AvatarState) Enum.valueOf(AvatarState.class, str);
        }

        public static AvatarState[] values() {
            return (AvatarState[]) $VALUES.clone();
        }
    }

    public MsgSkeletonItemInfo(float f, int i, boolean z, boolean z2, AvatarState avatarState) {
        this.a = f;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = avatarState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgSkeletonItemInfo)) {
            return false;
        }
        MsgSkeletonItemInfo msgSkeletonItemInfo = (MsgSkeletonItemInfo) obj;
        return Float.compare(this.a, msgSkeletonItemInfo.a) == 0 && this.b == msgSkeletonItemInfo.b && this.c == msgSkeletonItemInfo.c && this.d == msgSkeletonItemInfo.d && this.e == msgSkeletonItemInfo.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(shy.a(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "MsgSkeletonItemInfo(bubbleWidthPercent=" + this.a + ", bubbleHeight=" + this.b + ", isIncoming=" + this.c + ", isChannel=" + this.d + ", avatarState=" + this.e + ')';
    }
}
