package com.vk.superapp.api.dto.geo.coder.serializers.versions.v1;

import com.google.gson.Gson;
import com.vk.superapp.api.dto.geo.coder.GeoCodingResponseV1;
import com.vk.superapp.api.dto.geo.coder.serializers.GeoCodingDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b9y;
import xsna.c5g;
import xsna.hay;
import xsna.l8y;
import xsna.x9y;
import xsna.z8y;

/* compiled from: GeoCodingV1Deserializer.kt */
/* loaded from: classes6.dex */
public final class GeoCodingV1Deserializer implements GeoCodingDeserializer<GeoCodingResponseV1> {
    @Override // xsna.a9y
    public final Object a(b9y b9yVar, z8y z8yVar) {
        Gson gson = new Gson();
        x9y h = b9yVar.h();
        b9y q = h.q("request");
        GeoCodingResponseV1.a aVar = null;
        if (q != null) {
            if (q instanceof hay) {
                aVar = new GeoCodingResponseV1.a.C1862a(q.k());
            } else if (q instanceof l8y) {
                l8y g = q.g();
                ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                Iterator it = g.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((b9y) it.next()).e()));
                }
                aVar = new GeoCodingResponseV1.a.b(arrayList);
            }
        }
        return new GeoCodingResponseV1(aVar, (GeoCodingResponseV1.Results[]) gson.fromJson((b9y) h.q("results").g(), GeoCodingResponseV1.Results[].class));
    }
}
