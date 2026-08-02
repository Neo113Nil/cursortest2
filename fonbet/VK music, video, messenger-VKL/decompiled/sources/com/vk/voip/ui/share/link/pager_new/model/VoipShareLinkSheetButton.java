package com.vk.voip.ui.share.link.pager_new.model;

import xsna.asp;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: VoipShareLinkSheetButton.kt */
/* loaded from: classes7.dex */
public final class VoipShareLinkSheetButton {
    public final tlo0.f a;
    public final Type b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipShareLinkSheetButton.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ForceCall;
        public static final Type ShareInChat;
        public static final Type SystemSharing;

        static {
            Type type = new Type("ForceCall", 0);
            ForceCall = type;
            Type type2 = new Type("ShareInChat", 1);
            ShareInChat = type2;
            Type type3 = new Type("SystemSharing", 2);
            SystemSharing = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public VoipShareLinkSheetButton(tlo0.f fVar, Type type) {
        this.a = fVar;
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipShareLinkSheetButton)) {
            return false;
        }
        VoipShareLinkSheetButton voipShareLinkSheetButton = (VoipShareLinkSheetButton) obj;
        return this.a.equals(voipShareLinkSheetButton.a) && this.b == voipShareLinkSheetButton.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "VoipShareLinkSheetButton(text=" + this.a + ", type=" + this.b + ')';
    }
}
