package com.blaze.blazesdk.app_configurations.models.ads;

import com.blaze.blazesdk.app_configurations.models.ads.AdsConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.ads.c;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.km5;
import defpackage.ndd;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k {
    public static final c.b a(AdsConfigurationsDto adsConfigurationsDto) {
        g eVar;
        g gVar;
        if (adsConfigurationsDto.getStartTime() != null && adsConfigurationsDto.getEndTime() != null) {
            AdsConfigurationsDto.AdsLocationType adsLocationType = adsConfigurationsDto.getAdsLocationType();
            int i = adsLocationType == null ? -1 : j.b[adsLocationType.ordinal()];
            int i2 = 3;
            if (i != 1) {
                if (i == 2) {
                    Integer num = (Integer) CollectionsKt.firstOrNull(adsConfigurationsDto.getAdLocationsIndexes());
                    if (num != null) {
                        eVar = new d(num.intValue());
                        gVar = eVar;
                    }
                } else if (i == 3) {
                    gVar = new f(adsConfigurationsDto.getAdLocationsIndexes());
                }
                gVar = null;
            } else {
                Integer num2 = (Integer) CollectionsKt.firstOrNull(adsConfigurationsDto.getAdLocationsIndexes());
                if (num2 != null) {
                    eVar = new e(num2.intValue());
                    gVar = eVar;
                }
                gVar = null;
            }
            if (gVar != null) {
                Date startTime = adsConfigurationsDto.getStartTime();
                Date endTime = adsConfigurationsDto.getEndTime();
                Integer distanceOfItemsToLoadAdsInAdvance = adsConfigurationsDto.getDistanceOfItemsToLoadAdsInAdvance();
                if (distanceOfItemsToLoadAdsInAdvance != null) {
                    i2 = distanceOfItemsToLoadAdsInAdvance.intValue();
                } else if (gVar instanceof e) {
                    i2 = 2;
                } else if (!(gVar instanceof d) && !(gVar instanceof f)) {
                    zzl.b();
                }
                return new c.b(gVar, startTime, endTime, i2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c b(List list) {
        c.a aVar;
        Integer num;
        list.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AdsConfigurationsDto adsConfigurationsDto = (AdsConfigurationsDto) it.next();
                if (Intrinsics.c(adsConfigurationsDto.isActive(), Boolean.TRUE)) {
                    AdsConfigurationsDto.ConfigType type = adsConfigurationsDto.getType();
                    int i = type == null ? -1 : j.a[type.ordinal()];
                    if (i == -1) {
                        continue;
                    } else if (i != 1) {
                        if (i == 2) {
                            if (adsConfigurationsDto.getStartTime() != null && adsConfigurationsDto.getEndTime() != null && (num = (Integer) CollectionsKt.firstOrNull(adsConfigurationsDto.getAdLocationsIndexes())) != null) {
                                a aVar2 = new a(num.intValue());
                                Date startTime = adsConfigurationsDto.getStartTime();
                                Date endTime = adsConfigurationsDto.getEndTime();
                                Integer distanceOfItemsToLoadAdsInAdvance = adsConfigurationsDto.getDistanceOfItemsToLoadAdsInAdvance();
                                aVar = new c.a(aVar2, startTime, endTime, distanceOfItemsToLoadAdsInAdvance != null ? distanceOfItemsToLoadAdsInAdvance.intValue() : 2);
                                if (aVar == null) {
                                    arrayList2.add(aVar);
                                }
                            }
                            aVar = null;
                            if (aVar == null) {
                            }
                        } else {
                            if (i != 3) {
                                throw new ndd();
                            }
                            c.C0006c c = c(adsConfigurationsDto);
                            if (c != null) {
                                arrayList3.add(c);
                            }
                        }
                    } else {
                        c.b a = a(adsConfigurationsDto);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
            }
            return new c(arrayList, arrayList2, arrayList3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            km5 km5Var = km5.a;
            return new c(km5Var, km5Var, km5Var);
        }
    }

    public static final c.C0006c c(AdsConfigurationsDto adsConfigurationsDto) {
        Integer interval;
        if (adsConfigurationsDto.getStartTime() != null && adsConfigurationsDto.getEndTime() != null && (interval = adsConfigurationsDto.getInterval()) != null) {
            int intValue = interval.intValue();
            AdsConfigurationsDto.AdsLocationType adsLocationType = adsConfigurationsDto.getAdsLocationType();
            h hVar = (adsLocationType == null ? -1 : j.b[adsLocationType.ordinal()]) == 4 ? new h(km5.a, intValue) : null;
            if (hVar != null) {
                return new c.C0006c(hVar, adsConfigurationsDto.getStartTime(), adsConfigurationsDto.getEndTime());
            }
        }
        return null;
    }
}
