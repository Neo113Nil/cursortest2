package com.vungle.ads.internal.network.converters;

import com.vungle.ads.internal.network.j;
import defpackage.n4o;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b implements a {
    @Override // com.vungle.ads.internal.network.converters.a
    public final Object a(j jVar) {
        try {
            jVar.close();
            Unit unit = Unit.a;
            jVar.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n4o.x(jVar, th);
                throw th2;
            }
        }
    }
}
