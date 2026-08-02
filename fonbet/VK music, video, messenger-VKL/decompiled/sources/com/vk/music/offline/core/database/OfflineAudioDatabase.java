package com.vk.music.offline.core.database;

import android.content.Context;
import androidx.room.RoomDatabase;
import xsna.bhv0;
import xsna.cb50;
import xsna.gw4;
import xsna.hm20;
import xsna.j8b0;
import xsna.jf5;
import xsna.km20;
import xsna.of4;
import xsna.qgb0;
import xsna.sin0;
import xsna.ukb;
import xsna.usp;
import xsna.xt4;

/* compiled from: OfflineAudioDatabase.kt */
/* loaded from: classes.dex */
public abstract class OfflineAudioDatabase extends RoomDatabase {
    public static volatile OfflineAudioDatabase m;
    public static final Object n = new Object();
    public static final a o = new a(1, 2);
    public static final b p = new b(2, 3);
    public static final c q = new c(3, 4);
    public static final d r = new d(4, 5);
    public static final e s = new e(5, 6);
    public static final f t = new f(6, 7);
    public static final g u = new g(7, 8);
    public static final h v = new h(8, 9);
    public static final i w = new i(9, 10);

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class a extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).c();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class b extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).d();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class c extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).e();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class d extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).f();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class e extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).g();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class f extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).h();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class g extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).i();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class h extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).j();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class i extends hm20 {
        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            new km20(sin0Var).b();
        }
    }

    /* compiled from: OfflineAudioDatabase.kt */
    public static final class j {
        public static OfflineAudioDatabase a(Context context) {
            OfflineAudioDatabase offlineAudioDatabase;
            OfflineAudioDatabase offlineAudioDatabase2 = OfflineAudioDatabase.m;
            if (offlineAudioDatabase2 != null) {
                return offlineAudioDatabase2;
            }
            synchronized (OfflineAudioDatabase.n) {
                offlineAudioDatabase = OfflineAudioDatabase.m;
                if (offlineAudioDatabase == null) {
                    RoomDatabase.a a = bhv0.a(context, "offline_audio", OfflineAudioDatabase.class);
                    a.p = true;
                    a.q = true;
                    a.a(OfflineAudioDatabase.o, OfflineAudioDatabase.p, OfflineAudioDatabase.q, OfflineAudioDatabase.r, OfflineAudioDatabase.s, OfflineAudioDatabase.t, OfflineAudioDatabase.u, OfflineAudioDatabase.v, OfflineAudioDatabase.w);
                    a.d.add(new com.vk.music.offline.core.database.a());
                    offlineAudioDatabase = (OfflineAudioDatabase) a.b();
                    OfflineAudioDatabase.m = offlineAudioDatabase;
                }
            }
            return offlineAudioDatabase;
        }
    }

    public abstract gw4 A();

    public abstract jf5 B();

    public abstract ukb C();

    public abstract usp D();

    public abstract cb50 E();

    public abstract j8b0 F();

    public abstract qgb0 G();

    public abstract of4 y();

    public abstract xt4 z();
}
