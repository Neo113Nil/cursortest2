package androidx.work;

import androidx.work.WorkInfo;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import xsna.drm0;
import xsna.erm0;
import xsna.fxx0;
import xsna.izi0;
import xsna.j5g;
import xsna.m100;
import xsna.p6j;
import xsna.swe0;

/* compiled from: WorkRequest.kt */
/* loaded from: classes.dex */
public abstract class e {
    public final UUID a;
    public final fxx0 b;
    public final Set<String> c;

    /* compiled from: WorkRequest.kt */
    public static abstract class a<B extends a<B, ?>, W extends e> {
        public boolean a;
        public UUID b = UUID.randomUUID();
        public fxx0 c;
        public final Set<String> d;

        public a(Class<? extends b> cls) {
            this.c = new fxx0(this.b.toString(), (WorkInfo.State) null, cls.getName(), (String) null, (Data) null, (Data) null, 0L, 0L, 0L, (p6j) null, 0, (BackoffPolicy) null, 0L, 0L, 0L, 0L, false, (OutOfQuotaPolicy) null, 0, 0L, 0, 0, (String) null, 16777210);
            this.d = izi0.i(cls.getName());
        }

        public final B a(String str) {
            this.d.add(str);
            return d();
        }

        public final W b() {
            W c = c();
            p6j p6jVar = this.c.j;
            boolean z = p6jVar.b() || p6jVar.e || p6jVar.c || p6jVar.d;
            fxx0 fxx0Var = this.c;
            if (fxx0Var.q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (fxx0Var.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (fxx0Var.x == null) {
                List c0 = drm0.c0(fxx0Var.c, new String[]{"."}, 0, 6);
                String str = c0.size() == 1 ? (String) c0.get(0) : (String) j5g.i0(c0);
                if (str.length() > 127) {
                    str = erm0.D0(127, str);
                }
                fxx0Var.x = str;
            }
            UUID randomUUID = UUID.randomUUID();
            this.b = randomUUID;
            String uuid = randomUUID.toString();
            fxx0 fxx0Var2 = this.c;
            this.c = new fxx0(uuid, fxx0Var2.b, fxx0Var2.c, fxx0Var2.d, new Data(fxx0Var2.e), new Data(fxx0Var2.f), fxx0Var2.g, fxx0Var2.h, fxx0Var2.i, new p6j(fxx0Var2.j), fxx0Var2.k, fxx0Var2.l, fxx0Var2.m, fxx0Var2.n, fxx0Var2.o, fxx0Var2.p, fxx0Var2.q, fxx0Var2.r, fxx0Var2.s, fxx0Var2.u, fxx0Var2.v, fxx0Var2.w, fxx0Var2.x, 524288);
            return c;
        }

        public abstract W c();

        public abstract B d();

        public final a e(BackoffPolicy backoffPolicy, long j) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.a = true;
            fxx0 fxx0Var = this.c;
            fxx0Var.l = backoffPolicy;
            long millis = timeUnit.toMillis(j);
            if (millis > 18000000) {
                m100.c().getClass();
            }
            if (millis < 10000) {
                m100.c().getClass();
            }
            fxx0Var.m = swe0.i(millis, 10000L, 18000000L);
            return d();
        }

        public final B f(p6j p6jVar) {
            this.c.j = p6jVar;
            return d();
        }

        public final B g(long j, TimeUnit timeUnit) {
            this.c.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B h(Data data) {
            this.c.e = data;
            return d();
        }
    }

    public e(UUID uuid, fxx0 fxx0Var, Set<String> set) {
        this.a = uuid;
        this.b = fxx0Var;
        this.c = set;
    }
}
