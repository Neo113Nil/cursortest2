package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import defpackage.k13;
import defpackage.km5;
import defpackage.o13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Ti {
    public static final List a(com.inmobi.media.ads.network.common.model.Ad ad, String str) {
        ad.getClass();
        str.getClass();
        List<Trackers> trackers$media_release = ad.getTrackers$media_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : trackers$media_release) {
            if (Intrinsics.c(((Trackers) obj).getType(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o13.v(((Trackers) it.next()).getUrl(), arrayList2);
        }
        List<TrackingInfo> trackingInfo$media_release = ad.getTrackingInfo$media_release();
        ArrayList arrayList3 = new ArrayList();
        for (TrackingInfo trackingInfo : trackingInfo$media_release) {
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : trackers) {
                if (Intrinsics.c(((TrackersV2) obj2).getType(), str)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                TrackersV2 trackersV2 = (TrackersV2) it2.next();
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList6 = new ArrayList(k13.r(imExts, 10));
                for (String str2 : imExts) {
                    arrayList6.add(trackingInfo.getImBaseUrl() + str2);
                }
                o13.v(CollectionsKt.w0(arrayList6, url), arrayList5);
            }
            o13.v(arrayList5, arrayList3);
        }
        boolean isEmpty = arrayList3.isEmpty();
        List list = arrayList3;
        if (isEmpty) {
            list = km5.a;
        }
        return CollectionsKt.w0(arrayList2, list);
    }
}
