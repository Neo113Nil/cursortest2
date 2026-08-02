package com.vk.voip.ui.asr.ui.list;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.gn90;
import xsna.h0u0;
import xsna.qn90;
import xsna.tr;
import xsna.yzt0;

/* compiled from: PastAsrListViewState.kt */
/* loaded from: classes7.dex */
public final class a implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: PastAsrListViewState.kt */
    /* renamed from: com.vk.voip.ui.asr.ui.list.a$a, reason: collision with other inner class name */
    public static final class C2010a implements fm50<gn90.a> {
        public final yzt0<qn90> a;

        public C2010a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2010a) && epx.f(this.a, ((C2010a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(listState="), this.a, ')');
        }
    }

    /* compiled from: PastAsrListViewState.kt */
    public static final class b implements fm50<gn90.b> {
        public final yzt0<Throwable> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: PastAsrListViewState.kt */
    public static final class c implements fm50<gn90.c> {
        public static final c a = new c();
    }

    /* compiled from: PastAsrListViewState.kt */
    public static final class d implements fm50<gn90.d> {
        public static final d a = new d();
    }

    public a(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
