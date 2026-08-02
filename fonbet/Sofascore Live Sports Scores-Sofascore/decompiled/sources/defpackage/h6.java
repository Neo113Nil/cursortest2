package defpackage;

import android.widget.ImageView;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.chat.view.ChatMessageInputView;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h6 implements rq4, e0g {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ h6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.e0g
    public void k() {
        ((g6b) this.b).d(this);
    }

    @Override // defpackage.e0g
    public void m() {
        ((g6b) this.b).a(this);
    }

    @Override // defpackage.e0g
    public Object n(xof xofVar) {
        return bea.n((g6b) this.b, xofVar);
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((g6b) obj).d(this);
                ((k6) obj2).j.cancel();
                break;
            case 1:
                js2 js2Var = ((ChatMessageInputView) obj).d;
                if (((ImageView) js2Var.b).getViewTreeObserver().isAlive()) {
                    ((ImageView) js2Var.b).getViewTreeObserver().removeOnGlobalLayoutListener((hr2) obj2);
                    break;
                }
                break;
            case 2:
                ((g6b) obj).d(this);
                ((a9a) obj2).destroy();
                break;
            case 3:
                ((g6b) obj).d(this);
                LinkedHashMap linkedHashMap = nk.a;
                AdType.Interstitial adType = ((zrh) obj2).getAdType();
                adType.getClass();
                nk.a.remove(adType);
                break;
            case 4:
                ((g6b) obj).d(this);
                h6b h6bVar = (h6b) obj2;
                g6b t = qea.t(h6bVar);
                if (t != null) {
                    t.d(h6bVar);
                    break;
                }
                break;
            case 5:
                ((yda) obj2).e(null);
                break;
            default:
                ((g6b) obj).d(this);
                g9i g9iVar = ((p6j) obj2).j;
                if (g9iVar != null) {
                    g9iVar.e(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h6(g6b g6bVar, o8 o8Var, o8 o8Var2, int i) {
        this.a = i;
        this.b = g6bVar;
        this.c = o8Var2;
    }
}
