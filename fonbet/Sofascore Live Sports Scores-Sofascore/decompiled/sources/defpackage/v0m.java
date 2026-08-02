package defpackage;

import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.models.ui.AdInfoType;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.app_configurations.models.ads.a;
import com.blaze.blazesdk.app_configurations.models.ads.b;
import com.blaze.blazesdk.app_configurations.models.ads.c;
import com.blaze.blazesdk.app_configurations.models.ads.e;
import com.blaze.blazesdk.app_configurations.models.ads.f;
import com.blaze.blazesdk.app_configurations.models.ads.g;
import com.blaze.blazesdk.app_configurations.models.ads.h;
import com.blaze.blazesdk.app_configurations.models.ads.i;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v0m implements i7m {
    public int a;
    public g b;
    public b c;
    public i d;

    public static c.a a(BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, List list) {
        ArrayList arrayList;
        Date date = new Date();
        Object obj = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                c.a aVar = (c.a) obj2;
                if (date.compareTo(aVar.b) > 0 && date.compareTo(aVar.c) < 0) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        int i = ssl.b[blazeMomentsAdsConfigType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    zzl.b();
                    return null;
                }
            } else if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((c.a) next).a instanceof a) {
                        obj = next;
                        break;
                    }
                }
                return (c.a) obj;
            }
        } else if (arrayList != null) {
            return (c.a) CollectionsKt.firstOrNull(arrayList);
        }
        return null;
    }

    public static c.b b(BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, List list) {
        ArrayList arrayList;
        Date date = new Date();
        Object obj = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                c.b bVar = (c.b) obj2;
                if (date.compareTo(bVar.b) > 0 && date.compareTo(bVar.c) < 0) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        int i = ssl.a[blazeStoriesAdsConfigType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        zzl.b();
                        return null;
                    }
                } else if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((c.b) next).a instanceof f) {
                            obj = next;
                            break;
                        }
                    }
                    return (c.b) obj;
                }
            } else if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((c.b) next2).a instanceof e) {
                        obj = next2;
                        break;
                    }
                }
                return (c.b) obj;
            }
        } else if (arrayList != null) {
            return (c.b) CollectionsKt.firstOrNull(arrayList);
        }
        return null;
    }

    public static c.C0006c c(BlazeVideosAdsConfigType blazeVideosAdsConfigType, List list) {
        ArrayList arrayList;
        Date date = new Date();
        Object obj = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                c.C0006c c0006c = (c.C0006c) obj2;
                if (date.compareTo(c0006c.b) > 0 && date.compareTo(c0006c.c) < 0) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        int i = ssl.c[blazeVideosAdsConfigType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    zzl.b();
                    return null;
                }
            } else if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((c.C0006c) next).a instanceof h) {
                        obj = next;
                        break;
                    }
                }
                return (c.C0006c) obj;
            }
        } else if (arrayList != null) {
            return (c.C0006c) CollectionsKt.firstOrNull(arrayList);
        }
        return null;
    }

    public static com.blaze.blazesdk.players.models.c d(BlazeAdInfoModel blazeAdInfoModel) {
        String str;
        if (blazeAdInfoModel == null || blazeAdInfoModel.a != AdInfoType.IMA || (str = blazeAdInfoModel.b) == null) {
            return null;
        }
        return new com.blaze.blazesdk.players.models.c(false, false, new com.blaze.blazesdk.players.models.a(new com.blaze.blazesdk.ads.ima.models.b(str, blazeAdInfoModel.d, blazeAdInfoModel.context)), 3, null);
    }

    public static n4m e(int i, BlazeAdRequestData blazeAdRequestData, String str, boolean z) {
        return new n4m(fc6.C(), new gim.c(new pxm(true, new di(i, blazeAdRequestData, str, z))), p7m.a, null, null, null, null, null, null, null, false, false, null, false, 0, 0, null, null, null, null, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8388600, null);
    }

    public final ArrayList f(ArrayList arrayList, int i, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, boolean z) {
        c cVar;
        List list;
        c.a a;
        b bVar;
        c cVar2;
        blazeMomentsAdsConfigType.getClass();
        tul tulVar = jdm.d;
        c.a a2 = a(blazeMomentsAdsConfigType, (tulVar == null || (cVar2 = tulVar.c) == null) ? null : cVar2.b);
        if (a2 == null) {
            return arrayList;
        }
        b bVar2 = a2.a;
        this.c = bVar2;
        this.a = a2.d;
        if (!(bVar2 instanceof a)) {
            zzl.b();
            return null;
        }
        StringBuilder sb = new StringBuilder("every ");
        int i2 = ((a) bVar2).a;
        String h = fc6.h(i2, " moments", sb);
        ArrayList arrayList2 = new ArrayList(arrayList);
        n4m n4mVar = (n4m) CollectionsKt.firstOrNull(arrayList);
        BlazeAdInfoModel blazeAdInfoModel = n4mVar != null ? n4mVar.s : null;
        if (blazeAdInfoModel != null && (cVar = blazeAdInfoModel.c) != null && (list = cVar.b) != null && (a = a(BlazeMomentsAdsConfigType.EVERY_X_MOMENTS, list)) != null && (bVar = a.a) != null && (bVar instanceof a)) {
            i2 = ((a) bVar).a;
        }
        dsf dsfVar = new dsf();
        com.blaze.blazesdk.players.models.c d = d(blazeAdInfoModel);
        if (d != null) {
            int i3 = i + i2;
            if (i2 > 0 && i3 >= 0) {
                while (i3 < arrayList2.size()) {
                    n4m n4mVar2 = (n4m) CollectionsKt.a0(i3, arrayList2);
                    if (n4mVar2 != null) {
                        n4mVar2.q = (com.blaze.blazesdk.players.models.c) ParcelableExtensionKt.blazeDeepCopy(d);
                    }
                    dsfVar.a++;
                    if (n4mVar2 != null) {
                        arrayList2.set(i3, n4mVar2);
                    }
                    i3 += i2;
                }
            }
        } else if (i2 > 0 && i >= 0) {
            for (int i4 = i + i2; i4 < arrayList2.size(); i4 += i2 + 1) {
                n4m e = e(dsfVar.a, new BlazeAdRequestData(blazeAdInfoModel, null, 2, null), h, z);
                dsfVar.a++;
                arrayList2.add(i4, e);
            }
        }
        return arrayList2;
    }
}
