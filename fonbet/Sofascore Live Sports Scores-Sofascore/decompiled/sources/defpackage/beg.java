package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.equativ.displaysdk.ad.interstitial.SASInterstitialActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class beg implements vdg {
    public static final KClass j = duf.a.getOrCreateKotlinClass(SASInterstitialActivity.class);
    public final Function1 a;
    public final ct8 b;
    public g9i c;
    public wdg d;
    public final Context e;
    public final wib f;
    public Handler g;
    public final hbg h;
    public rz8 i;

    public beg(Activity activity, hbg hbgVar) {
        wib wibVar = wib.f;
        vt vtVar = new vt(activity, 12);
        ybg ybgVar = new ybg(wibVar, activity, 1);
        Looper myLooper = Looper.myLooper();
        this.g = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.e = activity.getApplicationContext();
        this.f = wibVar;
        this.h = hbgVar;
        this.a = vtVar;
        this.b = ybgVar;
    }

    public final sbg a() {
        sbg b;
        g9i g9iVar = this.c;
        if (g9iVar != null && !g9iVar.t()) {
            return sbg.b;
        }
        wdg wdgVar = this.d;
        return (wdgVar == null || (b = wdgVar.getB()) == null) ? sbg.a : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        zdg zdgVar;
        int i;
        beg begVar;
        wdg wdgVar;
        if (sq3Var instanceof zdg) {
            zdgVar = (zdg) sq3Var;
            int i2 = zdgVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zdgVar.v = i2 - Integer.MIN_VALUE;
                Object obj = zdgVar.t;
                lu3 lu3Var = lu3.a;
                i = zdgVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    ejg p = ejg.p();
                    p.getClass();
                    Context context = this.e;
                    qcg qcgVar = new qcg(p, new b10(context), fig.c(context), qha.B());
                    rag ragVar = rag.INTERSTITIAL;
                    qgg qggVar = new qgg(ragVar, qcgVar, this.f);
                    xag xagVar = (xag) this.a.invoke(qggVar);
                    ((zag) xagVar).w.add(new aeg());
                    ebg ebgVar = (ebg) this.b.invoke(qcgVar, xagVar, qggVar);
                    List c = a.c(ragVar);
                    zdgVar.r = this;
                    zdgVar.s = this;
                    zdgVar.v = 2;
                    obj = ebgVar.d(this.h, wdg.class, c, zdgVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    begVar = this;
                } else {
                    if (i == 1) {
                        this = zdgVar.s;
                        begVar = zdgVar.r;
                        y6a.M(obj);
                        wdgVar = (wdg) obj;
                        wdgVar.setInterstitialAdapterListener(begVar);
                        this.d = wdgVar;
                        begVar.getClass();
                        return Unit.a;
                    }
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = zdgVar.s;
                    begVar = zdgVar.r;
                    y6a.M(obj);
                }
                wdgVar = (wdg) obj;
                wdgVar.setInterstitialAdapterListener(begVar);
                this.d = wdgVar;
                begVar.getClass();
                return Unit.a;
            }
        }
        zdgVar = new zdg(this, sq3Var);
        Object obj2 = zdgVar.t;
        lu3 lu3Var2 = lu3.a;
        i = zdgVar.v;
        if (i != 0) {
        }
        wdgVar = (wdg) obj2;
        wdgVar.setInterstitialAdapterListener(begVar);
        this.d = wdgVar;
        begVar.getClass();
        return Unit.a;
    }

    public final void c(Exception exc) {
        this.g.post(new ecg(1, exc, this));
    }
}
