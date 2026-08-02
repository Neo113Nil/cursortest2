package androidx.recyclerview.widget;

import xsna.m0d0;
import xsna.svv;
import xsna.sy3;
import xsna.t670;

/* compiled from: PoolMode.kt */
/* loaded from: classes12.dex */
public abstract class i0 {
    public final m0d0 a;

    /* compiled from: PoolMode.kt */
    public static final class a extends i0 {
        public static final a b = new a(new sy3());

        public final String toString() {
            return "PoolMode[ASYNC_PREFETCH]";
        }
    }

    /* compiled from: PoolMode.kt */
    public static final class b extends i0 {
        public final String toString() {
            return "PoolMode[AsyncEarlyConsumePrefetch]";
        }
    }

    /* compiled from: PoolMode.kt */
    public static final class c extends i0 {
        public static final c b = new c(t670.e);

        public final String toString() {
            return "PoolMode[DEFAULT]";
        }
    }

    /* compiled from: PoolMode.kt */
    public static final class d extends i0 {
        public final String toString() {
            return "PoolMode[EarlyNonBlockingConsumePrefetch]";
        }
    }

    /* compiled from: PoolMode.kt */
    public static final class e extends i0 {
        public static final e b = new e(new svv());

        public final String toString() {
            return "PoolMode[IDLE_PREFETCH]";
        }
    }

    /* compiled from: PoolMode.kt */
    public static final class f extends i0 {
        public static final f b = new f(t670.e);

        public final String toString() {
            return "PoolMode[NONE]";
        }
    }

    public i0(m0d0 m0d0Var) {
        this.a = m0d0Var;
    }
}
