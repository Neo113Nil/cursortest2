package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzdxf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y38 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y38(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                z38 z38Var = (z38) this.b;
                b48 b48Var = z38Var.f;
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                e48 e48Var = b48Var.k;
                if (e48Var != null) {
                    ((d55) e48Var).g(c48.a);
                }
                b48Var.a(z38Var.d);
                b48Var.j = null;
                b48Var.k = null;
                return true;
            case 1:
                qcb qcbVar = (qcb) this.b;
                ocb ocbVar = qcbVar.r;
                Handler handler = qcbVar.v;
                ec0 ec0Var = qcbVar.z;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && ec0Var != null && ec0Var.isShowing() && x >= 0 && x < ec0Var.getWidth() && y >= 0 && y < ec0Var.getHeight()) {
                    handler.postDelayed(ocbVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(ocbVar);
                }
                return false;
            case 2:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.b).onTouchEvent(motionEvent);
                }
                return false;
            default:
                zzdxf zzdxfVar = (zzdxf) this.b;
                if (((Boolean) zzba.zzc().a(zzbjg.Hb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    zzdxfVar.r.a = motionEvent;
                }
                zzdxfVar.j.zza();
                if (view != 0) {
                    view.performClick();
                }
                return false;
        }
    }
}
