package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import defpackage.k13;
import defpackage.o13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class H4 {
    public static final ArrayList a(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackingInfo trackingInfo = (TrackingInfo) it.next();
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : trackers) {
                if (Intrinsics.c(((TrackersV2) obj).getType(), str)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                TrackersV2 trackersV2 = (TrackersV2) it2.next();
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList4 = new ArrayList(k13.r(imExts, 10));
                for (String str2 : imExts) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + str2);
                }
                o13.v(CollectionsKt.w0(arrayList4, url), arrayList3);
            }
            o13.v(arrayList3, arrayList);
        }
        return arrayList;
    }

    public static final ArrayList a(G g, String str) {
        g.getClass();
        str.getClass();
        List list = g.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.c(((Trackers) obj).getType(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o13.v(((Trackers) it.next()).getUrl(), arrayList2);
        }
        return arrayList2.isEmpty() ? a(str, g.g) : arrayList2;
    }
}
