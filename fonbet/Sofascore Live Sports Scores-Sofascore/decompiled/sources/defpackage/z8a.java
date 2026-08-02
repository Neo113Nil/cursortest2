package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.AdUnit;
import com.sofascore.model.firebase.BaseAdUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z8a extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ AppCompatActivity s;
    public final /* synthetic */ AdType.Interstitial t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8a(AppCompatActivity appCompatActivity, AdType.Interstitial interstitial, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = appCompatActivity;
        this.t = interstitial;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new z8a(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z8a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0121, code lost:
    
        if (r0 == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0177, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        if (r0 == r1) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdUnit adUnit;
        BaseAdUnit.GamAdUnit gam;
        Object r;
        AdUnit adUnit2;
        AdUnit adUnit3;
        BaseAdUnit.EquativAdUnit equativ;
        Object b;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        int i2 = 1;
        Object[] objArr = 0;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                b = obj;
                return (rp5) b;
            }
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            r = obj;
            return (a19) r;
        }
        y6a.M(obj);
        Object qp5Var = mx9.x(true) ? new qp5() : new z09();
        AppCompatActivity appCompatActivity = this.s;
        g6b lifecycle = appCompatActivity.getLifecycle();
        lifecycle.a(new h6(2, lifecycle, qp5Var));
        AdConfig f = it7.h.f(this.t);
        AdConfig.Interstitial interstitial = f instanceof AdConfig.Interstitial ? (AdConfig.Interstitial) f : null;
        if (!(qp5Var instanceof qp5)) {
            if (qp5Var instanceof z09) {
                yea yeaVar = j58.a;
                if (j58.l(true)) {
                    if (interstitial != null && (adUnit2 = interstitial.getAdUnit()) != null) {
                        gam = adUnit2.getNimbus();
                        if (gam != null) {
                            z09 z09Var = (z09) qp5Var;
                            Integer num = interstitial != null ? new Integer(interstitial.getExpirationSeconds()) : null;
                            this.r = 2;
                            r = s9a.r(new y09(appCompatActivity.getApplication(), z09Var, this.t, gam.getAdUnitId(), num, null), this);
                        }
                    }
                    gam = null;
                    if (gam != null) {
                    }
                } else {
                    if (interstitial != null && (adUnit = interstitial.getAdUnit()) != null) {
                        gam = adUnit.getGam();
                        if (gam != null) {
                        }
                    }
                    gam = null;
                    if (gam != null) {
                    }
                }
            }
            return null;
        }
        if (interstitial != null && (adUnit3 = interstitial.getAdUnit()) != null && (equativ = adUnit3.getEquativ()) != null) {
            qp5 qp5Var2 = (qp5) qp5Var;
            Integer num2 = new Integer(interstitial.getExpirationSeconds());
            this.r = 1;
            long pageId = equativ.getPageId();
            long formatId = equativ.getFormatId();
            qp5Var2.b = new beg(appCompatActivity, new hbg(pageId, formatId, null));
            oog oogVar = new oog(z9a.b(this));
            beg begVar = qp5Var2.b;
            if (begVar != null) {
                begVar.i = new op5(qp5Var2, String.valueOf(formatId), qp5Var2.a, num2, this.t, new pp5(oogVar));
            }
            beg begVar2 = qp5Var2.b;
            if (begVar2 != null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = Looper.getMainLooper();
                }
                begVar2.g = new Handler(myLooper);
                int ordinal = begVar2.a().ordinal();
                if (ordinal == 0) {
                    wdg wdgVar = begVar2.d;
                    if (wdgVar != null) {
                        wdgVar.onDestroy();
                    }
                    begVar2.d = null;
                    jeg jegVar = jeg.d;
                    begVar2.h.toString();
                    jegVar.f(2);
                    hs4 hs4Var = z45.a;
                    begVar2.c = xw3.L(s9a.c(hq4.c), null, null, new w9g(begVar2, objArr == true ? 1 : 0, i2), 3);
                } else if (ordinal == 1) {
                    begVar2.g.post(new xdg(begVar2, 1));
                } else if (ordinal == 2) {
                    begVar2.g.post(new xdg(begVar2, 3));
                } else {
                    if (ordinal != 3) {
                        zzl.b();
                        return null;
                    }
                    begVar2.g.post(new xdg(begVar2, 2));
                }
            }
            b = oogVar.b();
        }
        return null;
    }
}
