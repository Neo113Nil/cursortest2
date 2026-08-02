package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.p;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import xsna.ccc;
import xsna.fi20;
import xsna.g0q;
import xsna.h0q;
import xsna.qi20;
import xsna.rgp0;
import xsna.rsk;
import xsna.suk;
import xsna.w8s;
import xsna.xi90;
import xsna.xu1;
import xsna.y2r0;

/* compiled from: PlayerEmsgHandler.java */
/* loaded from: classes12.dex */
public final class e implements Handler.Callback {
    public final xu1 b;
    public final b c;
    public rsk g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final TreeMap<Long, Long> f = new TreeMap<>();
    public final Handler e = y2r0.o(this);
    public final h0q d = new h0q();

    /* compiled from: PlayerEmsgHandler.java */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* compiled from: PlayerEmsgHandler.java */
    public interface b {
    }

    /* compiled from: PlayerEmsgHandler.java */
    public final class c implements rgp0 {
        public final p a;
        public final w8s b = new w8s();
        public final qi20 c = new qi20(1);
        public long d = C.TIME_UNSET;

        public c(xu1 xu1Var) {
            this.a = new p(xu1Var, null, null);
        }

        @Override // xsna.rgp0
        public final void a(long j, int i, int i2, int i3, @Nullable rgp0.a aVar) {
            long i4;
            long j2;
            this.a.a(j, i, i2, i3, aVar);
            while (this.a.x(false)) {
                qi20 qi20Var = this.c;
                qi20Var.c();
                if (this.a.C(this.b, qi20Var, 0, false) == -4) {
                    qi20Var.h();
                } else {
                    qi20Var = null;
                }
                if (qi20Var != null) {
                    long j3 = qi20Var.g;
                    fi20 j4 = e.this.d.j(qi20Var);
                    if (j4 != null) {
                        g0q g0qVar = (g0q) j4.a[0];
                        String str = g0qVar.a;
                        String str2 = g0qVar.b;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            try {
                                j2 = y2r0.V(y2r0.r(g0qVar.e));
                            } catch (ParserException unused) {
                                j2 = -9223372036854775807L;
                            }
                            if (j2 != C.TIME_UNSET) {
                                a aVar2 = new a(j3, j2);
                                Handler handler = e.this.e;
                                handler.sendMessage(handler.obtainMessage(1, aVar2));
                            }
                        }
                    }
                }
            }
            p pVar = this.a;
            o oVar = pVar.a;
            synchronized (pVar) {
                int i5 = pVar.s;
                i4 = i5 == 0 ? -1L : pVar.i(i5);
            }
            oVar.a(i4);
        }

        @Override // xsna.rgp0
        public final void b(xi90 xi90Var, int i, int i2) {
            this.a.b(xi90Var, i, 0);
        }

        @Override // xsna.rgp0
        public final void c(androidx.media3.common.a aVar) {
            this.a.c(aVar);
        }

        @Override // xsna.rgp0
        public final int f(suk sukVar, int i, boolean z) throws IOException {
            return this.a.g(sukVar, i, z);
        }

        public final boolean h(long j) {
            boolean z;
            e eVar = e.this;
            rsk rskVar = eVar.g;
            b bVar = eVar.c;
            if (!rskVar.d) {
                return false;
            }
            if (eVar.i) {
                return true;
            }
            Map.Entry<Long, Long> ceilingEntry = eVar.f.ceilingEntry(Long.valueOf(rskVar.h));
            if (ceilingEntry == null || ceilingEntry.getValue().longValue() >= j) {
                z = false;
            } else {
                long longValue = ceilingEntry.getKey().longValue();
                DashMediaSource dashMediaSource = DashMediaSource.this;
                long j2 = dashMediaSource.M;
                if (j2 == C.TIME_UNSET || j2 < longValue) {
                    dashMediaSource.M = longValue;
                }
                z = true;
            }
            if (z && eVar.h) {
                eVar.i = true;
                eVar.h = false;
                DashMediaSource dashMediaSource2 = DashMediaSource.this;
                dashMediaSource2.D.removeCallbacks(dashMediaSource2.w);
                dashMediaSource2.A();
            }
            return z;
        }

        public final boolean i(ccc cccVar) {
            long j = this.d;
            boolean z = j != C.TIME_UNSET && j < cccVar.g;
            e eVar = e.this;
            if (eVar.g.d) {
                if (!eVar.i) {
                    if (z) {
                        if (eVar.h) {
                            eVar.i = true;
                            eVar.h = false;
                            DashMediaSource dashMediaSource = DashMediaSource.this;
                            dashMediaSource.D.removeCallbacks(dashMediaSource.w);
                            dashMediaSource.A();
                            return true;
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }

    public e(rsk rskVar, b bVar, xu1 xu1Var) {
        this.g = rskVar;
        this.c = bVar;
        this.b = xu1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.j) {
            if (message.what != 1) {
                return false;
            }
            a aVar = (a) message.obj;
            long j = aVar.a;
            long j2 = aVar.b;
            Long valueOf = Long.valueOf(j2);
            TreeMap<Long, Long> treeMap = this.f;
            Long l = treeMap.get(valueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
