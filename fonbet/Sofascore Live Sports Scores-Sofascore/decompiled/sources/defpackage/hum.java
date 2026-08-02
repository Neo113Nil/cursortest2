package defpackage;

import android.view.View;
import com.blaze.blazesdk.players.models.H;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hum extends zz1 {
    public final /* synthetic */ obm a;

    public hum(obm obmVar) {
        this.a = obmVar;
    }

    @Override // defpackage.zz1
    public final void c(int i, View view) {
        obm obmVar = this.a;
        if (i == 1) {
            int i2 = obm.D;
            ilm ilmVar = (ilm) obmVar.getViewModel();
            xvl xvlVar = xvl.DRAGGING_BOTTOM_SHEET;
            ilmVar.getClass();
            xvlVar.getClass();
            ilmVar.z0 = xvlVar;
            ((ilm) obmVar.getViewModel()).B(false);
            return;
        }
        if (i == 3) {
            int i3 = obm.D;
            ilm ilmVar2 = (ilm) obmVar.getViewModel();
            xvl xvlVar2 = xvl.IDLE;
            ilmVar2.getClass();
            xvlVar2.getClass();
            ilmVar2.z0 = xvlVar2;
            ((ilm) obmVar.getViewModel()).B(true);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            int i4 = obm.D;
            cnb.triggerHapticFeedback$default(obmVar.getActivity(), null, 1, null);
            obmVar.j(H.SWIPE_DOWN);
            return;
        }
        int i5 = obm.D;
        ilm ilmVar3 = (ilm) obmVar.getViewModel();
        xvl xvlVar3 = xvl.IDLE;
        ilmVar3.getClass();
        xvlVar3.getClass();
        ilmVar3.z0 = xvlVar3;
    }

    @Override // defpackage.zz1
    public final void b(View view) {
    }
}
