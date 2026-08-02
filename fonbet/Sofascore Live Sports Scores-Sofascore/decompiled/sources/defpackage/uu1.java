package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import com.inmobi.media.C3321bj;
import com.inmobi.media.C3381e2;
import com.inmobi.media.C3829va;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.sofascore.results.bettingtips.BettingTipsActivity;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.j;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class uu1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uu1(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                zu1 zu1Var = (zu1) ((lkj) obj).b.get(i2);
                int i3 = BettingTipsActivity.Q;
                ((BettingTipsActivity) obj2).T(zu1Var);
                return;
            case 1:
                yb3 yb3Var = (yb3) obj2;
                Serializable serializable = (Serializable) ((t9d) obj).a;
                String str = (String) yb3Var.a.get(Integer.valueOf(i2));
                if (str == null) {
                    return;
                }
                ge geVar = (ge) yb3Var.e.get(str);
                if ((geVar != null ? geVar.a : null) == null) {
                    yb3Var.g.remove(str);
                    yb3Var.f.put(str, serializable);
                    return;
                }
                xd xdVar = geVar.a;
                xdVar.getClass();
                if (yb3Var.d.remove(str)) {
                    xdVar.onActivityResult(serializable);
                    return;
                }
                return;
            case 2:
                ((yb3) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 3:
                ((C3321bj) obj2).onGreatestScrollPercentageIncreased(i2, (Bundle) obj);
                return;
            case 4:
                ((x9f) ((z05) obj2).c).a(i2, obj);
                return;
            case 5:
                cc5 cc5Var = (cc5) obj2;
                ((ec5) obj).c(cc5Var.a, cc5Var.b, i2);
                return;
            case 6:
                fsf fsfVar = (fsf) obj2;
                Context context = (Context) obj;
                if (cw3.a.contains(bx9.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    ((cx9) fsfVar.a).a(px9.SUBS, new ax9(context, i2, 1));
                    return;
                } catch (Throwable th) {
                    cw3.a(bx9.class, th);
                    return;
                }
            case 7:
                pdb pdbVar = (pdb) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    tdb tdbVar = (tdb) it.next();
                    if (!tdbVar.d) {
                        if (i2 != -1) {
                            tdbVar.b.a(i2);
                        }
                        tdbVar.c = true;
                        pdbVar.invoke(tdbVar.a);
                    }
                }
                return;
            case 8:
                qdb qdbVar = (qdb) obj;
                Iterator it2 = ((CopyOnWriteArraySet) obj2).iterator();
                while (it2.hasNext()) {
                    udb udbVar = (udb) it2.next();
                    if (!udbVar.d) {
                        if (i2 != -1) {
                            udbVar.b.a(i2);
                        }
                        udbVar.c = true;
                        qdbVar.invoke(udbVar.a);
                    }
                }
                return;
            case 9:
                Pair pair = (Pair) obj;
                ((cn4) ((odc) obj2).b.j).c(((Integer) pair.first).intValue(), (scc) pair.second, i2);
                return;
            case 10:
                SdkProperties.lambda$notifyInitializationFailed$3((InitializationListener) obj2, i2, (String) obj);
                return;
            case 11:
                C3381e2.a((C3381e2) obj2, (GestureDetectorOnGestureListenerC3889xi) obj, i2);
                return;
            case 12:
                zgm.o((zgm) obj2, (List) obj, i2);
                return;
            case 13:
                i.a((j) obj2, (Bitmap) obj, i2);
                return;
            default:
                C3829va.a((GestureDetectorOnGestureListenerC3889xi) obj2, (C3829va) obj, i2);
                return;
        }
    }

    public /* synthetic */ uu1(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
