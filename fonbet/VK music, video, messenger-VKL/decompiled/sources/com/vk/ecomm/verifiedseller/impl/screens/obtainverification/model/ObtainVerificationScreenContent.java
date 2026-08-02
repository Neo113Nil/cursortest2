package com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model;

import defpackage.q0;
import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.o4q0;
import xsna.qow;
import xsna.qoy;
import xsna.qr;
import xsna.tlo0;
import xsna.u11;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ObtainVerificationScreenContent.kt */
/* loaded from: classes18.dex */
public final class ObtainVerificationScreenContent {
    public final String a;
    public final String b;
    public final tlo0.h c;
    public final tlo0.h d;
    public final ArrayList e;
    public final a f;
    public final o4q0 g;
    public final CurrentModalType h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ObtainVerificationScreenContent.kt */
    public static final class CurrentModalType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CurrentModalType[] $VALUES;
        public static final CurrentModalType ERROR;
        public static final CurrentModalType NONE;
        public static final CurrentModalType UNLINK;
        public static final CurrentModalType UNLINKED;

        static {
            CurrentModalType currentModalType = new CurrentModalType("UNLINK", 0);
            UNLINK = currentModalType;
            CurrentModalType currentModalType2 = new CurrentModalType("UNLINKED", 1);
            UNLINKED = currentModalType2;
            CurrentModalType currentModalType3 = new CurrentModalType("ERROR", 2);
            ERROR = currentModalType3;
            CurrentModalType currentModalType4 = new CurrentModalType("NONE", 3);
            NONE = currentModalType4;
            CurrentModalType[] currentModalTypeArr = {currentModalType, currentModalType2, currentModalType3, currentModalType4};
            $VALUES = currentModalTypeArr;
            $ENTRIES = new asp(currentModalTypeArr);
        }

        public CurrentModalType() {
            throw null;
        }

        public static CurrentModalType valueOf(String str) {
            return (CurrentModalType) Enum.valueOf(CurrentModalType.class, str);
        }

        public static CurrentModalType[] values() {
            return (CurrentModalType[]) $VALUES.clone();
        }
    }

    /* compiled from: ObtainVerificationScreenContent.kt */
    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProceedButton(text=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", isRefreshing=");
            return q0.a(sb, this.c, ')');
        }
    }

    public ObtainVerificationScreenContent(String str, String str2, tlo0.h hVar, tlo0.h hVar2, ArrayList arrayList, a aVar, o4q0 o4q0Var, CurrentModalType currentModalType) {
        this.a = str;
        this.b = str2;
        this.c = hVar;
        this.d = hVar2;
        this.e = arrayList;
        this.f = aVar;
        this.g = o4q0Var;
        this.h = currentModalType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObtainVerificationScreenContent)) {
            return false;
        }
        ObtainVerificationScreenContent obtainVerificationScreenContent = (ObtainVerificationScreenContent) obj;
        return this.a.equals(obtainVerificationScreenContent.a) && this.b.equals(obtainVerificationScreenContent.b) && this.c.equals(obtainVerificationScreenContent.c) && this.d.equals(obtainVerificationScreenContent.d) && this.e.equals(obtainVerificationScreenContent.e) && this.f.equals(obtainVerificationScreenContent.f) && epx.f(this.g, obtainVerificationScreenContent.g) && this.h == obtainVerificationScreenContent.h;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + qr.a(this.e, u11.c(u11.c(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c.a), 31, this.d.a), 31)) * 31;
        o4q0 o4q0Var = this.g;
        return this.h.hashCode() + ((hashCode + (o4q0Var == null ? 0 : o4q0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ObtainVerificationScreenContent(imageUrlLight=" + this.a + ", imageUrlDark=" + this.b + ", title=" + this.c + ", description=" + this.d + ", conditions=" + ((Object) qow.b(this.e)) + ", button=" + this.f + ", unlinkBidProfileModalData=" + this.g + ", currentModalType=" + this.h + ')';
    }
}
