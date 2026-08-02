package com.vk.im.channelcreation.impl;

import defpackage.q0;
import xsna.ao50;
import xsna.epx;
import xsna.urd0;

/* compiled from: ChannelCreationViewState.kt */
/* loaded from: classes2.dex */
public final class j implements ao50 {
    public final boolean a;
    public final a b;
    public final a c;

    /* compiled from: ChannelCreationViewState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;

        public a() {
            this(0);
        }

        public static a a(a aVar, String str, String str2, boolean z, int i) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            String str3 = aVar.b;
            if ((i & 4) != 0) {
                str2 = aVar.c;
            }
            if ((i & 8) != 0) {
                z = aVar.d;
            }
            aVar.getClass();
            return new a(str, str3, str2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelData(avatar=");
            sb.append(this.a);
            sb.append(", originalAvatar=");
            sb.append(this.b);
            sb.append(", channelName=");
            sb.append(this.c);
            sb.append(", isCommentsEnabled=");
            return q0.a(sb, this.d, ')');
        }

        public /* synthetic */ a(int i) {
            this("", "", "", true);
        }

        public a(String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }
    }

    public j() {
        this(false, 7);
    }

    public static j a(j jVar, a aVar, a aVar2, int i) {
        boolean z = jVar.a;
        if ((i & 4) != 0) {
            aVar2 = jVar.c;
        }
        jVar.getClass();
        return new j(z, aVar, aVar2);
    }

    public final boolean b() {
        return this.b.c.length() > 0;
    }

    public final boolean c() {
        a aVar = this.c;
        a aVar2 = this.b;
        return !epx.f(aVar2, aVar) && aVar2.c.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "ChannelCreationViewState(isTermsVisible=" + this.a + ", channelData=" + this.b + ", originalChannelData=" + this.c + ')';
    }

    public j(boolean z, a aVar, a aVar2) {
        this.a = z;
        this.b = aVar;
        this.c = aVar2;
    }

    public /* synthetic */ j(boolean z, int i) {
        this((i & 1) != 0 ? false : z, new a(0), null);
    }
}
