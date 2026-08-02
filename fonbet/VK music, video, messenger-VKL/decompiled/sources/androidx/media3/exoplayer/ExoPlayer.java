package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import xsna.by1;
import xsna.chp0;
import xsna.dvf;
import xsna.et;
import xsna.fih0;
import xsna.fxc0;
import xsna.hwa0;
import xsna.izf0;
import xsna.jza0;
import xsna.nc4;
import xsna.o3i0;
import xsna.p06;
import xsna.shl;
import xsna.u5q;
import xsna.y2r0;
import xsna.zhn0;

/* loaded from: classes12.dex */
public interface ExoPlayer extends jza0 {
    public static final int a;

    public static final class b {
        public final boolean A;
        public final Context a;
        public dvf b;
        public zhn0<izf0> c;
        public zhn0<i.a> d;
        public zhn0<chp0> e;
        public zhn0<e> f;
        public zhn0<p06> g;
        public final et h;
        public Looper i;
        public final int j;
        public final nc4 k;
        public final int l;
        public final boolean m;
        public final o3i0 n;
        public final fih0 o;
        public shl p;
        public final long q;
        public long r;
        public int s;
        public int t;
        public int u;
        public int v;
        public boolean w;

        @Nullable
        public hwa0 x;
        public boolean y;
        public final String z;

        public b(final Context context) {
            this(context, new zhn0() { // from class: xsna.o5q
                @Override // xsna.zhn0
                public final Object get() {
                    return new qll(context);
                }
            }, new zhn0() { // from class: xsna.s5q
                @Override // xsna.zhn0
                public final Object get() {
                    return new androidx.media3.exoplayer.source.e(context, new uel());
                }
            });
        }

        public final androidx.media3.exoplayer.c a() {
            fxc0.z(!this.y);
            this.y = true;
            return new androidx.media3.exoplayer.c(this, null);
        }

        public final void b(final e eVar) {
            fxc0.z(!this.y);
            eVar.getClass();
            this.f = new zhn0() { // from class: xsna.w5q
                @Override // xsna.zhn0
                public final Object get() {
                    return androidx.media3.exoplayer.e.this;
                }
            };
        }

        public final void c(Looper looper) {
            fxc0.z(!this.y);
            looper.getClass();
            this.i = looper;
        }

        public final void d(final chp0 chp0Var) {
            fxc0.z(!this.y);
            chp0Var.getClass();
            this.e = new zhn0() { // from class: xsna.x5q
                @Override // xsna.zhn0
                public final Object get() {
                    return chp0.this;
                }
            };
        }

        public b(final Context context, final izf0 izf0Var) {
            this(context, new zhn0() { // from class: xsna.p5q
                @Override // xsna.zhn0
                public final Object get() {
                    return izf0.this;
                }
            }, new zhn0() { // from class: xsna.q5q
                @Override // xsna.zhn0
                public final Object get() {
                    return new androidx.media3.exoplayer.source.e(context, new uel());
                }
            });
        }

        public b(final Context context, zhn0<izf0> zhn0Var, zhn0<i.a> zhn0Var2) {
            zhn0<chp0> zhn0Var3 = new zhn0() { // from class: xsna.t5q
                @Override // xsna.zhn0
                public final Object get() {
                    return new npl(context);
                }
            };
            u5q u5qVar = new u5q();
            zhn0<p06> zhn0Var4 = new zhn0() { // from class: xsna.v5q
                @Override // xsna.zhn0
                public final Object get() {
                    pbl pblVar;
                    Context context2 = context;
                    com.google.common.collect.g gVar = pbl.p;
                    synchronized (pbl.class) {
                        try {
                            if (pbl.v == null) {
                                Long valueOf = Long.valueOf(C.TIME_UNSET);
                                Context applicationContext = context2 == null ? null : context2.getApplicationContext();
                                HashMap hashMap = new HashMap(8);
                                hashMap.put(0, 1000000L);
                                hashMap.put(2, valueOf);
                                hashMap.put(3, valueOf);
                                hashMap.put(4, valueOf);
                                hashMap.put(5, valueOf);
                                hashMap.put(10, valueOf);
                                hashMap.put(9, valueOf);
                                hashMap.put(7, valueOf);
                                pbl.v = new pbl(applicationContext, hashMap);
                            }
                            pblVar = pbl.v;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return pblVar;
                }
            };
            et etVar = new et(15);
            context.getClass();
            this.a = context;
            this.c = zhn0Var;
            this.d = zhn0Var2;
            this.e = zhn0Var3;
            this.f = u5qVar;
            this.g = zhn0Var4;
            this.h = etVar;
            String str = y2r0.a;
            Looper myLooper = Looper.myLooper();
            this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.k = nc4.c;
            this.l = 1;
            this.m = true;
            this.n = o3i0.d;
            this.o = fih0.b;
            this.p = new shl(y2r0.S(20L), y2r0.S(500L));
            this.b = dvf.a;
            this.q = 500L;
            this.r = 2000L;
            this.s = 600000;
            this.t = ExoPlayer.a;
            this.u = 60000;
            this.v = 600000;
            this.w = true;
            this.z = "";
            this.j = -1000;
            if (Build.VERSION.SDK_INT >= 35) {
            }
            this.A = true;
        }
    }

    public static class c {
        public static final c a = new c();
    }

    static {
        a = y2r0.P() ? 30000 : 10000;
    }

    @Override // xsna.jza0
    @Nullable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    ExoPlaybackException b();

    boolean isScrubbingModeEnabled();

    void q(by1 by1Var);

    void r(androidx.media3.exoplayer.source.i iVar);

    void release();

    void setImageOutput(@Nullable ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);

    public interface a {
        default void h() {
        }
    }
}
