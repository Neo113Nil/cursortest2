package defpackage;

import android.content.Context;
import com.blaze.blazesdk.players.models.H;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t2m implements e5m {
    public final /* synthetic */ obm a;

    public t2m(obm obmVar) {
        this.a = obmVar;
    }

    @Override // defpackage.e5m
    public final void a() {
        int i = obm.D;
        obm obmVar = this.a;
        ((ilm) obmVar.getViewModel()).getClass();
        Context context = obmVar.q.a.getContext();
        if (context != null) {
            cnb.triggerHapticFeedback$default(context, null, 1, null);
        }
        obmVar.j(H.SKIP);
    }

    @Override // defpackage.e5m
    public final void b() {
        int i = obm.D;
        obm obmVar = this.a;
        ((ilm) obmVar.getViewModel()).getClass();
        Context context = obmVar.q.a.getContext();
        if (context != null) {
            cnb.triggerHapticFeedback$default(context, null, 1, null);
        }
        obmVar.j(H.SWIPE);
    }
}
