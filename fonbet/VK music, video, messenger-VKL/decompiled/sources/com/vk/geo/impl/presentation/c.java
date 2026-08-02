package com.vk.geo.impl.presentation;

import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.presentation.b;
import java.util.concurrent.atomic.AtomicReference;
import xsna.izs;
import xsna.s3q0;

/* compiled from: GeoFeature.kt */
/* loaded from: classes2.dex */
public final class c implements izs<Coordinate, s3q0> {
    public final /* synthetic */ b b;

    public c(b bVar) {
        this.b = bVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Coordinate coordinate) {
        long j = coordinate.j();
        AtomicReference<b.a> atomicReference = this.b.w;
        while (true) {
            b.a aVar = atomicReference.get();
            b.a a = b.a.C1082a.a(null, new Coordinate(j), new ZoomLevel(16.0f), 1);
            while (!atomicReference.compareAndSet(aVar, a)) {
                if (atomicReference.get() != aVar) {
                    break;
                }
            }
            return s3q0.a;
        }
    }
}
