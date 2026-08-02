package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hpm implements h8m {
    public final /* synthetic */ emm a;
    public final /* synthetic */ int b;
    public final /* synthetic */ asf c;
    public final /* synthetic */ RecyclerView d;
    public final /* synthetic */ snm e;
    public final /* synthetic */ e5m f;

    public hpm(emm emmVar, int i, asf asfVar, RecyclerView recyclerView, snm snmVar, e5m e5mVar) {
        this.a = emmVar;
        this.b = i;
        this.c = asfVar;
        this.d = recyclerView;
        this.e = snmVar;
        this.f = e5mVar;
    }

    @Override // defpackage.h8m
    public final void a(int i, float f) {
        if (i == 0) {
            return;
        }
        if (this.a != emm.AFTER_USER_LIFTS_FINGER || i == 3) {
            int i2 = this.b;
            float f2 = -i2;
            snm snmVar = this.e;
            RecyclerView recyclerView = this.d;
            asf asfVar = this.c;
            e5m e5mVar = this.f;
            if (f < f2 && !asfVar.a) {
                asfVar.a = true;
                if (lz.A(recyclerView) && snmVar == snm.HORIZONTAL) {
                    if (e5mVar != null) {
                        e5mVar.b();
                        return;
                    }
                    return;
                } else {
                    if (e5mVar != null) {
                        e5mVar.a();
                        return;
                    }
                    return;
                }
            }
            if (f <= i2 || asfVar.a) {
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    asfVar.a = false;
                    return;
                }
                return;
            }
            asfVar.a = true;
            if (lz.A(recyclerView) && snmVar == snm.HORIZONTAL) {
                if (e5mVar != null) {
                    e5mVar.a();
                }
            } else if (e5mVar != null) {
                e5mVar.b();
            }
        }
    }
}
