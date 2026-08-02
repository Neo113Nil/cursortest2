package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.dto.geo.GeoLocation;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import xsna.izs;
import xsna.pzl;
import xsna.wow;

/* compiled from: ClipsGeoPickerStateMapper.kt */
/* loaded from: classes16.dex */
public final class h implements izs<ClipsGeoPickerState, wow<j.a>> {
    public static final h b = new h();

    @Override // xsna.izs
    public final wow<j.a> invoke(ClipsGeoPickerState clipsGeoPickerState) {
        List<GeoLocation> list = clipsGeoPickerState.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (GeoLocation geoLocation : list) {
            String str = geoLocation.i;
            String str2 = geoLocation.k;
            String str3 = geoLocation.n;
            if (str == null) {
                str = "";
            }
            if (str3 != null && str3.length() != 0 && str2 != null && str2.length() != 0) {
                str2 = pzl.b(str3, " · ", str2);
            } else if (str3 != null && str3.length() != 0) {
                str2 = str3;
            } else if (str2 == null || str2.length() == 0) {
                str2 = "";
            }
            arrayList.add(new j.a(str, str2, geoLocation.b));
        }
        return new wow<>(arrayList);
    }
}
