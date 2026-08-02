package defpackage;

import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import defpackage.n4m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class i6m {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList a(List list) {
        n4m n4mVar;
        ArrayList k = me4.k(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MomentModel momentModel = (MomentModel) it.next();
            momentModel.getClass();
            atm atmVar = (atm) CollectionsKt.firstOrNull(momentModel.f.b.a);
            if (atmVar != null) {
                n4m.a a = fgm.a(momentModel.f, atmVar, (atm) CollectionsKt.firstOrNull(momentModel.d.a), Double.valueOf(momentModel.c));
                if (a != null) {
                    n4mVar = new n4m(momentModel.id, new gim.b(momentModel), a, momentModel.title, momentModel.a, momentModel.b, null, momentModel.h, momentModel.e, null, false, false, Boolean.FALSE, false, 0, 0, null, null, momentModel.q, momentModel.r, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7594496, null);
                    if (n4mVar == null) {
                        k.add(n4mVar);
                    }
                }
            }
            n4mVar = null;
            if (n4mVar == null) {
            }
        }
        return k;
    }
}
