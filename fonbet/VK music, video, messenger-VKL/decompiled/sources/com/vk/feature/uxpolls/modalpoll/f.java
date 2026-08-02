package com.vk.feature.uxpolls.modalpoll;

import defpackage.q0;
import xsna.epx;
import xsna.km50;
import xsna.oq;

/* compiled from: UxPollsMvi.kt */
/* loaded from: classes18.dex */
public final class f implements km50 {
    public final a b;
    public final boolean c;

    /* compiled from: UxPollsMvi.kt */
    public static abstract class a implements km50 {

        /* compiled from: UxPollsMvi.kt */
        /* renamed from: com.vk.feature.uxpolls.modalpoll.f$a$a, reason: collision with other inner class name */
        public static final class C1029a extends a {
            public final Throwable b;

            public C1029a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1029a) && epx.f(this.b, ((C1029a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: UxPollsMvi.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: UxPollsMvi.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    public f() {
        this(0);
    }

    public static f a(f fVar, a aVar, int i) {
        if ((i & 1) != 0) {
            aVar = fVar.b;
        }
        boolean z = (i & 2) != 0 ? fVar.c : true;
        fVar.getClass();
        return new f(aVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.b, fVar.b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollsState(contentState=");
        sb.append(this.b);
        sb.append(", pollCompleted=");
        return q0.a(sb, this.c, ')');
    }

    public f(a aVar, boolean z) {
        this.b = aVar;
        this.c = z;
    }

    public /* synthetic */ f(int i) {
        this(a.b.b, false);
    }
}
