package com.vk.voip.ui.broadcast.list.ui;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.ko90;
import xsna.qo90;
import xsna.tr;
import xsna.yzt0;

/* compiled from: PastBroadcastsViewState.kt */
/* loaded from: classes7.dex */
public final class a implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: PastBroadcastsViewState.kt */
    /* renamed from: com.vk.voip.ui.broadcast.list.ui.a$a, reason: collision with other inner class name */
    public static final class C2011a implements fm50<qo90.a> {
        public final yzt0<ko90> a;

        public C2011a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2011a) && epx.f(this.a, ((C2011a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(listState="), this.a, ')');
        }
    }

    /* compiled from: PastBroadcastsViewState.kt */
    public static final class b implements fm50<qo90.b> {
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

    /* compiled from: PastBroadcastsViewState.kt */
    public static final class c implements fm50<qo90.c> {
        public static final c a = new c();
    }

    /* compiled from: PastBroadcastsViewState.kt */
    public static final class d implements fm50<qo90.d> {
        public static final d a = new d();
    }

    public a(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
