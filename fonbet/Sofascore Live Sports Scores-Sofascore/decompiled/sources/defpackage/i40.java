package defpackage;

import android.app.Application;
import android.view.Choreographer;
import android.view.View;
import com.facebook.login.w;
import com.google.android.gms.internal.ads.zzgca;
import com.sofascore.local_persistance.BrandingConfig;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i40 extends hoi implements Function2 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i40(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new i40(2, rq3Var, 0);
            case 1:
                return new i40(2, rq3Var, 1);
            case 2:
                return new i40(2, rq3Var, 2);
            case 3:
                return new i40(2, rq3Var, 3);
            case 4:
                return new i40(2, rq3Var, 4);
            case 5:
                return new i40(2, rq3Var, 5);
            case 6:
                return new i40(2, rq3Var, 6);
            case 7:
                return new i40(2, rq3Var, 7);
            case 8:
                return new i40(2, rq3Var, 8);
            case 9:
                return new i40(2, rq3Var, 9);
            default:
                return new i40(2, rq3Var, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((i40) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                ((i40) create((BrandingConfig) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return null;
            case 2:
                return ((i40) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((i40) create((z88) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((i40) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((i40) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((i40) create(Integer.valueOf(((Number) obj).intValue()), (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((i40) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((i40) create((oug) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((i40) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((i40) create((zzgca) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return Choreographer.getInstance();
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                we2 we2Var = uoh.a;
                we2 we2Var2 = uoh.a;
                synchronized (we2Var2) {
                    we2Var2.clear();
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                try {
                    w.b.a().b();
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    s38.a().c(e2);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                Iterator it = ee3.a.iterator();
                while (it.hasNext()) {
                    s11 s11Var = (s11) it.next();
                    View view = s11Var.c;
                    lj2 lj2Var = s11Var.b;
                    if (!s11Var.a.r && (lj2Var.r() instanceof oed) && view.isAttachedToWindow() && view.getGlobalVisibleRect(s11Var.d, s11Var.e)) {
                        p2g p2gVar = w2g.b;
                        lj2Var.resumeWith(Unit.a);
                    }
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                v8a.d = true;
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            default:
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                zzgca G = zzgca.G();
                G.getClass();
                return G;
        }
    }
}
