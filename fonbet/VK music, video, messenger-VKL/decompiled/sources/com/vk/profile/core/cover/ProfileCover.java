package com.vk.profile.core.cover;

import xsna.asp;
import xsna.epx;
import xsna.hea0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ProfileCover.kt */
/* loaded from: classes5.dex */
public final class ProfileCover {
    public final boolean a;
    public final a b;
    public final Integer c;
    public final hea0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileCover.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode COLOR;
        public static final Mode COVER;
        public static final Mode GRADIENT;
        public static final Mode NONE;
        public static final Mode SOLID_COLOR;

        static {
            Mode mode = new Mode("NONE", 0);
            NONE = mode;
            Mode mode2 = new Mode("GRADIENT", 1);
            GRADIENT = mode2;
            Mode mode3 = new Mode("COVER", 2);
            COVER = mode3;
            Mode mode4 = new Mode("COLOR", 3);
            COLOR = mode4;
            Mode mode5 = new Mode("SOLID_COLOR", 4);
            SOLID_COLOR = mode5;
            Mode[] modeArr = {mode, mode2, mode3, mode4, mode5};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: ProfileCover.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gradient(start=");
            sb.append(this.a);
            sb.append(", end=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public ProfileCover(boolean z, a aVar, Integer num, hea0 hea0Var) {
        this.a = z;
        this.b = aVar;
        this.c = num;
        this.d = hea0Var;
    }

    public final Mode a() {
        boolean z = this.a;
        return (!z || this.d == null) ? (!z || this.b == null) ? (!z || this.c == null) ? z ? Mode.COLOR : Mode.NONE : Mode.SOLID_COLOR : Mode.GRADIENT : Mode.COVER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCover)) {
            return false;
        }
        ProfileCover profileCover = (ProfileCover) obj;
        return this.a == profileCover.a && epx.f(this.b, profileCover.b) && epx.f(this.c, profileCover.c) && epx.f(this.d, profileCover.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        hea0 hea0Var = this.d;
        return hashCode3 + (hea0Var != null ? hea0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileCover(enabled=" + this.a + ", gradient=" + this.b + ", solidColor=" + this.c + ", cover=" + this.d + ')';
    }
}
