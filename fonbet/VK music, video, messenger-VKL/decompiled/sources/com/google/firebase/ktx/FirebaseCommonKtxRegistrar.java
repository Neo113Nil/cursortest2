package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.b6z;
import xsna.b9i;
import xsna.e43;
import xsna.g0q0;
import xsna.gzl;
import xsna.i8i;
import xsna.lcg0;
import xsna.ovj;
import xsna.ozl;
import xsna.pf7;
import xsna.qu5;
import xsna.toe0;
import xsna.wv5;

/* compiled from: Firebase.kt */
@ozl
@Keep
/* loaded from: classes13.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    public static final class a<T> implements b9i {
        public static final a<T> b = new a<>();

        @Override // xsna.b9i
        public final Object c(lcg0 lcg0Var) {
            return qu5.b((Executor) lcg0Var.c(new toe0<>(wv5.class, Executor.class)));
        }
    }

    /* compiled from: Firebase.kt */
    public static final class b<T> implements b9i {
        public static final b<T> b = new b<>();

        @Override // xsna.b9i
        public final Object c(lcg0 lcg0Var) {
            return qu5.b((Executor) lcg0Var.c(new toe0<>(b6z.class, Executor.class)));
        }
    }

    /* compiled from: Firebase.kt */
    public static final class c<T> implements b9i {
        public static final c<T> b = new c<>();

        @Override // xsna.b9i
        public final Object c(lcg0 lcg0Var) {
            return qu5.b((Executor) lcg0Var.c(new toe0<>(pf7.class, Executor.class)));
        }
    }

    /* compiled from: Firebase.kt */
    public static final class d<T> implements b9i {
        public static final d<T> b = new d<>();

        @Override // xsna.b9i
        public final Object c(lcg0 lcg0Var) {
            return qu5.b((Executor) lcg0Var.c(new toe0<>(g0q0.class, Executor.class)));
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<i8i<?>> getComponents() {
        i8i.a b2 = i8i.b(new toe0(wv5.class, ovj.class));
        b2.a(new gzl((toe0<?>) new toe0(wv5.class, Executor.class), 1, 0));
        b2.f = a.b;
        i8i b3 = b2.b();
        i8i.a b4 = i8i.b(new toe0(b6z.class, ovj.class));
        b4.a(new gzl((toe0<?>) new toe0(b6z.class, Executor.class), 1, 0));
        b4.f = b.b;
        i8i b5 = b4.b();
        i8i.a b6 = i8i.b(new toe0(pf7.class, ovj.class));
        b6.a(new gzl((toe0<?>) new toe0(pf7.class, Executor.class), 1, 0));
        b6.f = c.b;
        i8i b7 = b6.b();
        i8i.a b8 = i8i.b(new toe0(g0q0.class, ovj.class));
        b8.a(new gzl((toe0<?>) new toe0(g0q0.class, Executor.class), 1, 0));
        b8.f = d.b;
        return e43.l(b3, b5, b7, b8.b());
    }
}
