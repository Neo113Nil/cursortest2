package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class mqm {
    public static final void a(RecyclerView recyclerView, snm snmVar, int i, emm emmVar, e5m e5mVar) {
        rgm u1mVar;
        recyclerView.getClass();
        snmVar.getClass();
        emmVar.getClass();
        asf asfVar = new asf();
        recyclerView.getClass();
        int i2 = snmVar == null ? -1 : ikm.a[snmVar.ordinal()];
        if (i2 == 1) {
            u1mVar = new u1m(new kdm(recyclerView), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null);
        } else {
            if (i2 != 2) {
                a70.p(U3.i.n);
                return;
            }
            u1mVar = new cum(new kdm(recyclerView), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null);
        }
        u1mVar.h = new hpm(emmVar, i, asfVar, recyclerView, snmVar, e5mVar);
    }

    public static /* synthetic */ void setUpOverScroll$default(RecyclerView recyclerView, snm snmVar, int i, emm emmVar, e5m e5mVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            e5mVar = null;
        }
        a(recyclerView, snmVar, i, emmVar, e5mVar);
    }
}
