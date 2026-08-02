package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class P8 implements ProtobufConverter {
    public static C0526u9 a(O8 o82) {
        C0526u9 c0526u9 = new C0526u9();
        c0526u9.f14725d = new int[o82.f12683b.size()];
        Iterator it = o82.f12683b.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            c0526u9.f14725d[i5] = ((Integer) it.next()).intValue();
            i5++;
        }
        c0526u9.f14724c = o82.f12685d;
        c0526u9.f14723b = o82.f12684c;
        c0526u9.f14722a = o82.f12682a;
        return c0526u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((O8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0526u9 c0526u9 = (C0526u9) obj;
        return new O8(c0526u9.f14722a, c0526u9.f14723b, c0526u9.f14724c, CollectionUtils.hashSetFromIntArray(c0526u9.f14725d));
    }
}
