package defpackage;

import android.graphics.Bitmap;
import android.view.ActionMode;
import android.view.View;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class le implements n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ le(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n55
    public final void d() {
        g9i g9iVar;
        Object value;
        Object value2;
        uee ueeVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ie ieVar = ((ee) obj).a;
                if (ieVar != null) {
                    ieVar.b();
                    break;
                } else {
                    a70.r("Launcher has not been initialized");
                    break;
                }
            case 1:
                f25 f25Var = (f25) obj;
                f25Var.dismiss();
                f25Var.h.e();
                break;
            case 2:
                b2f b2fVar = (b2f) obj;
                b2fVar.e();
                b2fVar.setTag(R.id.view_tree_lifecycle_owner, null);
                b2fVar.q.removeViewImmediate(b2fVar);
                break;
            case 3:
                t30 t30Var = (t30) obj;
                a5f a5fVar = t30Var.e;
                imf imfVar = (imf) a5fVar.i;
                if (imfVar != null) {
                    imfVar.f();
                }
                a5fVar.a();
                ActionMode actionMode = t30Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                t30Var.h = null;
                break;
            case 4:
                Bitmap bitmap = (Bitmap) ((fsf) obj).a;
                if (bitmap != null) {
                    bitmap.recycle();
                    break;
                }
                break;
            case 5:
                jo1 jo1Var = (jo1) ((eoh) ((ko1) obj).c).getValue();
                if (jo1Var != null) {
                    jo1Var.close();
                    break;
                }
                break;
            case 6:
                lcj lcjVar = (lcj) obj;
                u8j u8jVar = lcjVar.e.a;
                if (u8jVar != null && (g9iVar = u8jVar.u) != null) {
                    g9iVar.e(null);
                    u8jVar.u = null;
                }
                lcjVar.j = null;
                break;
            case 7:
                lj2 lj2Var = ((ykj) obj).c;
                if (lj2Var != null) {
                    lj2Var.a(null);
                    break;
                }
                break;
            case 8:
                ((s55) obj).b.invoke();
                break;
            case 9:
                ((tbj) obj).m();
                break;
            case 10:
                oj6 oj6Var = (oj6) obj;
                View view = oj6Var.b;
                if (oj6Var.a) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(oj6Var);
                    oj6Var.a = false;
                }
                view.removeOnAttachStateChangeListener(oj6Var);
                break;
            case 11:
                fdi fdiVar = ((jz6) obj).h;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, bz6.a));
            case 12:
                ((sqa) obj).d = null;
                break;
            case 13:
                era eraVar = (era) obj;
                en0 en0Var = eraVar.c;
                if (en0Var != null) {
                    en0Var.b = false;
                }
                eraVar.c = null;
                break;
            case 14:
                ((ara) obj).f = true;
                break;
            case 15:
                rsc rscVar = (rsc) obj;
                rscVar.dismiss();
                rscVar.i.e();
                break;
            case 16:
                fdi fdiVar2 = ((h4d) obj).d;
                for (wg wgVar : ((tee) fdiVar2.getValue()).values()) {
                    if (wgVar instanceof ug) {
                        ((ug) wgVar).a.destroy();
                    }
                }
                do {
                    value2 = fdiVar2.getValue();
                    ueeVar = uee.g;
                    ueeVar.getClass();
                } while (!fdiVar2.k(value2, ueeVar));
            case 17:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((yda) it.next()).e(null);
                }
                break;
            case 18:
                ((o0h) ((t01) obj)).a0(null);
                break;
            default:
                ((g9i) obj).e(null);
                break;
        }
    }
}
