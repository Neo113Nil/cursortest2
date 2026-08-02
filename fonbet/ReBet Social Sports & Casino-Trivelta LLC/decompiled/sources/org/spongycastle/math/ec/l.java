package org.spongycastle.math.ec;

import java.math.BigInteger;
import oj.InterfaceC5920b;

/* loaded from: classes5.dex */
public class l extends a {

    /* renamed from: a, reason: collision with root package name */
    public final d f62854a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5920b f62855b;

    public l(d dVar, InterfaceC5920b interfaceC5920b) {
        if (dVar == null || dVar.w() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f62854a = dVar;
        this.f62855b = interfaceC5920b;
    }

    @Override // org.spongycastle.math.ec.a
    public g b(g gVar, BigInteger bigInteger) {
        if (!this.f62854a.l(gVar.h())) {
            throw new IllegalStateException();
        }
        BigInteger[] decomposeScalar = this.f62855b.decomposeScalar(bigInteger.mod(gVar.h().w()));
        BigInteger bigInteger2 = decomposeScalar[0];
        BigInteger bigInteger3 = decomposeScalar[1];
        h pointMap = this.f62855b.getPointMap();
        return this.f62855b.hasEfficientPointMap() ? b.b(gVar, bigInteger2, pointMap, bigInteger3) : b.a(gVar, bigInteger2, pointMap.a(gVar), bigInteger3);
    }
}
