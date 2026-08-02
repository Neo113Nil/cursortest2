package com.ironsource;

import com.ironsource.InterfaceC2595p7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2728wf implements InterfaceC2595p7, InterfaceC2595p7.a {
    private final InterfaceC2592p4 a;
    private final P8 b;
    private final Map<String, C2674tf> c;

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
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c);
        }

        public final Long f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
            Long l = this.c;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.a + ", currentTime=" + this.b + ", currentTimeThreshold=" + this.c + ")";
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

    public C2728wf(InterfaceC2592p4 currentTimeProvider, P8 serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.a = currentTimeProvider;
        this.b = serviceDataRepository;
        this.c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.b.a(str), this.a.a(), this.b.b(str));
    }

    public final Map<String, C2674tf> a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L13;
     */
    @Override // com.ironsource.InterfaceC2595p7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C2674tf c2674tf = this.c.get(identifier);
        if (c2674tf == null) {
            return;
        }
        a c = c(identifier);
        if (c.d() != 0) {
            long e = c.e();
            Long f = c.f();
        }
        this.b.a(c.e() + H3.a(c2674tf.b(), null, 1, null), identifier);
        c.a(0);
        c.a(c.d() + 1);
        this.b.a(c.d(), identifier);
    }

    @Override // com.ironsource.InterfaceC2595p7
    public G3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C2674tf c2674tf = this.c.get(identifier);
        return c2674tf == null ? new G3(false, null, 2, null) : a(c2674tf, identifier) ? new G3(true, I3.ShowCount) : new G3(false, null, 2, null);
    }

    private final boolean a(C2674tf c2674tf, String str) {
        a c = c(str);
        Long f = c.f();
        if (f != null) {
            long longValue = f.longValue();
            if (c.d() >= c2674tf.a() && this.a.a() < longValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC2595p7.a
    public Object a(String identifier, I3 cappingType, InterfaceC2559n7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object c = cappingConfig.c();
        if (Result.m11187isSuccessimpl(c)) {
            C2674tf c2674tf = (C2674tf) c;
            if (c2674tf != null) {
                this.c.put(identifier, c2674tf);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(Unit.INSTANCE);
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(c);
        if (m11183exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m11180constructorimpl(Unit.INSTANCE);
    }
}
