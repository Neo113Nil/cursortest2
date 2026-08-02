package com.ironsource;

import com.ironsource.InterfaceC4509q7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import xsna.bh10;
import xsna.epx;
import xsna.jr;
import xsna.s3q0;

/* renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4624wf implements InterfaceC4509q7, InterfaceC4509q7.a {
    private final InterfaceC4488p4 a;
    private final Q8 b;
    private final Map<String, C4570tf> c = new LinkedHashMap();

    /* renamed from: com.ironsource.wf$a */
    public static final class a {
        private int a;
        private long b;
        private Long c;

        public a(int i, long j, Long l) {
            this.a = i;
            this.b = j;
            this.c = l;
        }

        public final int a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final Long c() {
            return this.c;
        }

        public final int d() {
            return this.a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final Long f() {
            return this.c;
        }

        public int hashCode() {
            int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
            Long l = this.c;
            return a + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            int i = this.a;
            long j = this.b;
            Long l = this.c;
            StringBuilder b = jr.b(i, "ShowCountCappingInfo(currentNumberOfShows=", ", currentTime=", j);
            b.append(", currentTimeThreshold=");
            b.append(l);
            b.append(")");
            return b.toString();
        }

        public final a a(int i, long j, Long l) {
            return new a(i, j, l);
        }

        public static /* synthetic */ a a(a aVar, int i, long j, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.b;
            }
            if ((i2 & 4) != 0) {
                l = aVar.c;
            }
            return aVar.a(i, j, l);
        }

        public final void a(int i) {
            this.a = i;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void a(Long l) {
            this.c = l;
        }
    }

    public C4624wf(InterfaceC4488p4 interfaceC4488p4, Q8 q8) {
        this.a = interfaceC4488p4;
        this.b = q8;
    }

    private final a c(String str) {
        return new a(this.b.a(str), this.a.a(), this.b.b(str));
    }

    public final Map<String, C4570tf> a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L13;
     */
    @Override // com.ironsource.InterfaceC4509q7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String str) {
        C4570tf c4570tf = this.c.get(str);
        if (c4570tf == null) {
            return;
        }
        a c = c(str);
        if (c.d() != 0) {
            long e = c.e();
            Long f = c.f();
        }
        this.b.a(H3.a(c4570tf.b(), null, 1, null) + c.e(), str);
        c.a(0);
        c.a(c.d() + 1);
        this.b.a(c.d(), str);
    }

    @Override // com.ironsource.InterfaceC4509q7
    public G3 a(String str) {
        C4570tf c4570tf = this.c.get(str);
        return c4570tf == null ? new G3(false, null, 2, null) : a(c4570tf, str) ? new G3(true, I3.ShowCount) : new G3(false, null, 2, null);
    }

    private final boolean a(C4570tf c4570tf, String str) {
        a c = c(str);
        Long f = c.f();
        if (f != null) {
            long longValue = f.longValue();
            if (c.d() >= c4570tf.a() && this.a.a() < longValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4509q7.a
    public Object a(String str, I3 i3, InterfaceC4473o7 interfaceC4473o7) {
        Object c = interfaceC4473o7.c();
        if (!(c instanceof Result.Failure)) {
            C4570tf c4570tf = (C4570tf) c;
            if (c4570tf != null) {
                this.c.put(str, c4570tf);
            }
            return s3q0.a;
        }
        Throwable a2 = Result.a(c);
        if (a2 != null) {
            return new Result.Failure(a2);
        }
        return s3q0.a;
    }
}
