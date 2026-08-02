package com.vk.superapp.api.dto.geo.coder.serializers.versions.v1;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.superapp.api.dto.geo.coder.GeoCodingResponseV1;
import com.vk.superapp.api.dto.geo.coder.serializers.GeoCodingSerializer;
import xsna.b9y;
import xsna.bay;
import xsna.tay;
import xsna.x9y;

/* compiled from: GeoCodingV1Serializer.kt */
/* loaded from: classes6.dex */
public final class GeoCodingV1Serializer implements GeoCodingSerializer<GeoCodingResponseV1> {
    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        GeoCodingResponseV1 geoCodingResponseV1 = (GeoCodingResponseV1) obj;
        x9y x9yVar = new x9y();
        GeoCodingResponseV1.a a = geoCodingResponseV1.a();
        if (a instanceof GeoCodingResponseV1.a.C1862a) {
            x9yVar.l(bay.e(((GeoCodingResponseV1.a.C1862a) a).a), "request");
        } else if (a instanceof GeoCodingResponseV1.a.b) {
            x9yVar.l(((TreeTypeAdapter.a) tayVar).b(((GeoCodingResponseV1.a.b) a).a), "request");
        }
        x9yVar.l(((TreeTypeAdapter.a) tayVar).b(geoCodingResponseV1.b()), "results");
        return x9yVar;
    }
}
