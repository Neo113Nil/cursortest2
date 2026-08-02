package com.ironsource;

import com.ironsource.InterfaceC4196m7;
import defpackage.ljg;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4347uf implements InterfaceC4196m7, InterfaceC4196m7.a {

    @NotNull
    private final InterfaceC4193m4 a;

    @NotNull
    private final N8 b;

    @NotNull
    private final Map<String, C4293rf> c;

    public C4347uf(@NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull N8 n8) {
        interfaceC4193m4.getClass();
        n8.getClass();
        this.a = interfaceC4193m4;
        this.b = n8;
        this.c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.b.a(str), this.a.a(), this.b.b(str));
    }

    @Override // com.ironsource.InterfaceC4196m7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull F3 f3, @NotNull InterfaceC4160k7 interfaceC4160k7) {
        str.getClass();
        f3.getClass();
        interfaceC4160k7.getClass();
        Object c = interfaceC4160k7.c();
        p2g p2gVar = w2g.b;
        if (c instanceof u2g) {
            Throwable a2 = w2g.a(c);
            return a2 != null ? new u2g(a2) : Unit.a;
        }
        C4293rf c4293rf = (C4293rf) c;
        if (c4293rf != null) {
            this.c.put(str, c4293rf);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L13;
     */
    @Override // com.ironsource.InterfaceC4196m7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(@NotNull String str) {
        str.getClass();
        C4293rf c4293rf = this.c.get(str);
        if (c4293rf == null) {
            return;
        }
        a c = c(str);
        if (c.d() != 0) {
            long e = c.e();
            Long f = c.f();
        }
        this.b.a(E3.a(c4293rf.b(), null, 1, null) + c.e(), str);
        c.a(0);
        c.a(c.d() + 1);
        this.b.a(c.d(), str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.uf$a */
    public static final class a {
        private int a;
        private long b;

        @Nullable
        private Long c;

        public a(int i, long j, @Nullable Long l) {
            this.a = i;
            this.b = j;
            this.c = l;
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

        public final long b() {
            return this.b;
        }

        @Nullable
        public final Long c() {
            return this.c;
        }

        public final int d() {
            return this.a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.c(this.c, aVar.c);
        }

        @Nullable
        public final Long f() {
            return this.c;
        }

        public int hashCode() {
            int c = ljg.c(Integer.hashCode(this.a) * 31, 31, this.b);
            Long l = this.c;
            return c + (l == null ? 0 : l.hashCode());
        }

        @NotNull
        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.a + ", currentTime=" + this.b + ", currentTimeThreshold=" + this.c + ")";
        }

        @NotNull
        public final a a(int i, long j, @Nullable Long l) {
            return new a(i, j, l);
        }

        public final int a() {
            return this.a;
        }

        public final void a(int i) {
            this.a = i;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void a(@Nullable Long l) {
            this.c = l;
        }
    }

    @Override // com.ironsource.InterfaceC4196m7
    @NotNull
    public D3 a(@NotNull String str) {
        str.getClass();
        C4293rf c4293rf = this.c.get(str);
        if (c4293rf == null) {
            return new D3(false, null, 2, null);
        }
        if (a(c4293rf, str)) {
            return new D3(true, F3.ShowCount);
        }
        return new D3(false, null, 2, null);
    }

    private final boolean a(C4293rf c4293rf, String str) {
        a c = c(str);
        Long f = c.f();
        if (f != null) {
            long longValue = f.longValue();
            if (c.d() >= c4293rf.a() && this.a.a() < longValue) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Map<String, C4293rf> a() {
        return this.c;
    }
}
