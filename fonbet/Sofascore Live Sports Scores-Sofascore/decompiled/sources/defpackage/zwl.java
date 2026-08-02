package defpackage;

import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import defpackage.n4m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zwl {
    public final itl a;

    public zwl(@NotNull itl itlVar) {
        itlVar.getClass();
        this.a = itlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        if (r8.isEmpty() != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n4m a(n4m n4mVar) {
        VideoModel videoModel;
        ArrayList arrayList;
        qrl qrlVar;
        Object obj;
        Object obj2;
        n4mVar.getClass();
        gim gimVar = n4mVar.b;
        if (!(gimVar instanceof gim.c) && !(gimVar instanceof gim.a)) {
            n4m.a aVar = null;
            if (!(gimVar instanceof gim.d) && !(gimVar instanceof gim.b) && !(gimVar instanceof gim.e)) {
                zzl.b();
                return null;
            }
            q7m q7mVar = (q7m) this.a;
            q7mVar.getClass();
            gim.e eVar = gimVar instanceof gim.e ? (gim.e) gimVar : null;
            if (eVar != null && (videoModel = eVar.a) != null) {
                trm trmVar = videoModel.d;
                rvl rvlVar = videoModel.f;
                ArrayList f = yfa.f(rvlVar.b.a);
                ArrayList f2 = yfa.f(trmVar.a);
                if (!f.isEmpty() && !f2.isEmpty()) {
                    arrayList = new ArrayList();
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        qrl qrlVar2 = (qrl) next;
                        if (!f2.isEmpty()) {
                            Iterator it2 = f2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.c((qrl) it2.next(), qrlVar2)) {
                                    arrayList.add(next);
                                    break;
                                }
                            }
                        }
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                    int i = q7mVar.a;
                    if (i == 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (((qrl) obj3).a() != null) {
                                arrayList2.add(obj3);
                            }
                        }
                        qrlVar = (qrl) CollectionsKt.firstOrNull(CollectionsKt.H0(arrayList2, new o4m()));
                    } else if (i != 2) {
                        qrlVar = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (((qrl) obj4).a() != null) {
                                arrayList3.add(obj4);
                            }
                        }
                        qrlVar = (qrl) CollectionsKt.j0(CollectionsKt.H0(arrayList3, new z0m()));
                    }
                    if (qrlVar != null) {
                        n4m.a aVar2 = n4mVar.c;
                        if (!Intrinsics.c(aVar2 instanceof n4m.a.b ? ((n4m.a.b) aVar2).a() : aVar2 instanceof n4m.a.C1353a ? ((n4m.a.C1353a) aVar2).c : null, qrlVar)) {
                            nfm nfmVar = rvlVar.b;
                            nfmVar.getClass();
                            List list = nfmVar.a;
                            list.getClass();
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it3.next();
                                if (Intrinsics.c(((atm) obj).d, qrlVar)) {
                                    break;
                                }
                            }
                            atm atmVar = (atm) obj;
                            List list2 = trmVar.a;
                            list2.getClass();
                            Iterator it4 = list2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it4.next();
                                if (Intrinsics.c(((atm) obj2).d, qrlVar)) {
                                    break;
                                }
                            }
                            atm atmVar2 = (atm) obj2;
                            if ((atmVar != null ? atmVar.a : null) != null) {
                                if ((atmVar2 != null ? atmVar2.a : null) != null) {
                                    aVar = fgm.a(rvlVar, atmVar, atmVar2, Double.valueOf(videoModel.c));
                                }
                            }
                        }
                    }
                }
            }
            n4m.a aVar3 = aVar;
            if (aVar3 != null) {
                return n4m.copy$default(n4mVar, null, null, aVar3, null, null, null, null, null, null, null, false, false, null, false, 0, 0, null, null, null, null, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8388603, null);
            }
        }
        return n4mVar;
    }
}
