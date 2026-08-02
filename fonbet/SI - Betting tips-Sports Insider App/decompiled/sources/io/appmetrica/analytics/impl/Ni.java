package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ni implements so {

    /* renamed from: a, reason: collision with root package name */
    public final ro f12655a = new ro();

    @Override // io.appmetrica.analytics.impl.so
    public final qo a(Revenue revenue) {
        qo qoVar;
        ro roVar = this.f12655a;
        Sf sf2 = new Sf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            qoVar = new qo(sf2, true, "");
        } else {
            qoVar = new qo(sf2, false, "Invalid quantity value " + num);
        }
        List<qo> asList = Arrays.asList(qoVar);
        roVar.getClass();
        return roVar.a(asList);
    }
}
