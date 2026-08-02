package com.vk.voip.ui.share.link.pager.view;

import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.qr;
import xsna.zrp;

/* compiled from: VoipShareLinkPagerState.kt */
/* loaded from: classes7.dex */
public final class VoipShareLinkPagerState {
    public final c a;
    public final ArrayList b;
    public final TypeControl c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipShareLinkPagerState.kt */
    public static final class TypeControl {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeControl[] $VALUES;
        public static final TypeControl SHARE;
        public static final TypeControl SHARE_REFRESH;
        public static final TypeControl SINGLE_SHARE;

        static {
            TypeControl typeControl = new TypeControl("SHARE_REFRESH", 0);
            SHARE_REFRESH = typeControl;
            TypeControl typeControl2 = new TypeControl("SHARE", 1);
            SHARE = typeControl2;
            TypeControl typeControl3 = new TypeControl("SINGLE_SHARE", 2);
            SINGLE_SHARE = typeControl3;
            TypeControl[] typeControlArr = {typeControl, typeControl2, typeControl3};
            $VALUES = typeControlArr;
            $ENTRIES = new asp(typeControlArr);
        }

        public TypeControl() {
            throw null;
        }

        public static TypeControl valueOf(String str) {
            return (TypeControl) Enum.valueOf(TypeControl.class, str);
        }

        public static TypeControl[] values() {
            return (TypeControl[]) $VALUES.clone();
        }
    }

    public VoipShareLinkPagerState(c cVar, ArrayList arrayList, TypeControl typeControl) {
        this.a = cVar;
        this.b = arrayList;
        this.c = typeControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipShareLinkPagerState)) {
            return false;
        }
        VoipShareLinkPagerState voipShareLinkPagerState = (VoipShareLinkPagerState) obj;
        return epx.f(this.a, voipShareLinkPagerState.a) && this.b.equals(voipShareLinkPagerState.b) && this.c == voipShareLinkPagerState.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VoipShareLinkPagerState(selected=" + this.a + ", tabList=" + this.b + ", typeControl=" + this.c + ')';
    }
}
