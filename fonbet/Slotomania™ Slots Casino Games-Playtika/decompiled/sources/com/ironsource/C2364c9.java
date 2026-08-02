package com.ironsource;

import com.ironsource.C2346b9;
import com.ironsource.InterfaceC2592p4;
import com.ironsource.Lb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2364c9 {
    private final InterfaceC2592p4 a;
    private final Lb.a b;
    private Long c;
    private Long d;
    private Lb e;
    private C2346b9 f;

    /* JADX WARN: Multi-variable type inference failed */
    public C2364c9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final C2346b9 a() {
        return this.f;
    }

    public final C2346b9 b() {
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.c;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (this.e == null) {
                    return null;
                }
                long a = this.a.a();
                Lb lb = this.b.get();
                C2346b9 c2346b9 = new C2346b9(a - longValue, new C2346b9.a(Math.max(0L, lb.d() - r1.d()), Math.max(0L, lb.e() - r1.e()), Math.max(0L, lb.f() - r1.f())), longValue2 / 1024);
                this.f = c2346b9;
                return c2346b9;
            }
        }
        return null;
    }

    public C2364c9(InterfaceC2592p4 currentTimeProvider, Lb.a memoryInfoProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(memoryInfoProvider, "memoryInfoProvider");
        this.a = currentTimeProvider;
        this.b = memoryInfoProvider;
    }

    public final void a(String serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.c = Long.valueOf(serverResponse.length());
        this.e = this.b.get();
        this.d = Long.valueOf(this.a.a());
    }

    public /* synthetic */ C2364c9(InterfaceC2592p4 interfaceC2592p4, Lb.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC2592p4.a() : interfaceC2592p4, (i & 2) != 0 ? new Lb.a.C0178a() : aVar);
    }
}
