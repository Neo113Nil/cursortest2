package defpackage;

import android.app.Application;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.n4m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class irm {
    public static void a(List list, BlazeCachingLevel blazeCachingLevel, Function1 function1, axm axmVar) {
        list.getClass();
        blazeCachingLevel.getClass();
        function1.getClass();
        axmVar.getClass();
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (n4m n4mVar : CollectionsKt.L0(list, blazeCachingLevel.getNumOfItemsToPrefetchBeforePlaying())) {
                List list2 = (List) function1.invoke(n4mVar);
                n4m.a aVar = n4mVar.c;
                if (aVar instanceof n4m.a.C1353a) {
                    arrayList2.add(((n4m.a.C1353a) aVar).a);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((String) it.next());
                        }
                    }
                } else if (aVar instanceof n4m.a.b) {
                    arrayList2.add(((n4m.a.b) aVar).d());
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((String) it2.next());
                        }
                    }
                    yom k = fgm.k(n4mVar);
                    if (k != null) {
                        arrayList.add(k);
                    }
                }
            }
            Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            if (application$blazesdk_release != null) {
                pf5.e(arrayList2, application$blazesdk_release);
            }
            pf5 pf5Var = pf5.a;
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                yom yomVar = (yom) it3.next();
                if (yomVar != null) {
                    arrayList3.add(yomVar);
                }
            }
            pf5.f(arrayList3, axmVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void b(List list, BlazeCachingLevel blazeCachingLevel, axm axmVar) {
        list.getClass();
        blazeCachingLevel.getClass();
        axmVar.getClass();
        List L0 = CollectionsKt.L0(list, blazeCachingLevel.getNumOfItemsToPrefetchBeforePlaying());
        ArrayList arrayList = new ArrayList(k13.r(L0, 10));
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            arrayList.add(((xlm) it.next()).c);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            n4m n4mVar = (n4m) it2.next();
            if (n4mVar != null) {
                arrayList2.add(n4mVar);
            }
        }
        a(arrayList2, blazeCachingLevel, new w5m(21), axmVar);
    }

    public static /* synthetic */ void prefetchPlayables$default(irm irmVar, List list, BlazeCachingLevel blazeCachingLevel, Function1 function1, axm axmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeCachingLevel = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
        }
        irmVar.getClass();
        a(list, blazeCachingLevel, function1, axmVar);
    }

    public static /* synthetic */ void prefetchPlaylists$default(irm irmVar, List list, BlazeCachingLevel blazeCachingLevel, axm axmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeCachingLevel = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
        }
        irmVar.getClass();
        b(list, blazeCachingLevel, axmVar);
    }
}
