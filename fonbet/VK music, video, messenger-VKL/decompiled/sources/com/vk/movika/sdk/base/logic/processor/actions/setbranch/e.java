package com.vk.movika.sdk.base.logic.processor.actions.setbranch;

import com.vk.movika.sdk.base.logic.processor.actions.setbranch.b;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.actions.e;
import com.vk.movika.sdk.base.model.s;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fpf0;
import xsna.j5g;

/* loaded from: classes3.dex */
public final class e extends b<e.C1305e> {
    public final XorWowRandom e;

    public e(XorWowRandom xorWowRandom, com.vk.ecomm.catalog.impl.geo.a aVar, com.vk.movika.sdk.base.logic.interactor.a aVar2, boolean z) {
        super(fpf0.a(e.C1305e.class), aVar, aVar2, z);
        this.e = xorWowRandom;
    }

    @Override // com.vk.movika.sdk.base.logic.processor.actions.setbranch.b
    public final b.a c(com.vk.movika.sdk.base.logic.e eVar, e.C1305e c1305e, s sVar) {
        e.C1305e c1305e2 = c1305e;
        Chapter a = sVar.a(eVar.b);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = a.e;
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((com.vk.movika.sdk.base.model.a) it.next()).d;
        }
        Object w0 = j5g.w0(arrayList, Random.b);
        if (d > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            double h = this.e.h(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, d);
            Iterator it2 = arrayList.iterator();
            double d2 = 0.0d;
            while (it2.hasNext()) {
                Object next = it2.next();
                double d3 = ((com.vk.movika.sdk.base.model.a) next).d;
                if (d3 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    d3 = 0.0d;
                }
                double d4 = d3 + d2;
                if (d4 - d2 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d2 > h || h > d4) {
                    d2 = d4;
                } else {
                    w0 = next;
                }
            }
        }
        com.vk.movika.sdk.base.model.a aVar = (com.vk.movika.sdk.base.model.a) w0;
        if (aVar != null) {
            return new b.a(aVar, c1305e2.a);
        }
        return null;
    }
}
