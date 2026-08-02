package defpackage;

import com.sofascore.model.firebase.AdType;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c9a extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ AdType.Interstitial s;
    public final /* synthetic */ WeakReference t;
    public final /* synthetic */ g9a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9a(AdType.Interstitial interstitial, WeakReference weakReference, g9a g9aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = interstitial;
        this.t = weakReference;
        this.u = g9aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new c9a(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c9a) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        g9a g9aVar = this.u;
        zrh zrhVar = null;
        AdType.Interstitial interstitial = this.s;
        if (i == 0) {
            y6a.M(obj);
            LinkedHashMap linkedHashMap = nk.a;
            interstitial.getClass();
            LinkedHashMap linkedHashMap2 = nk.a;
            zrh zrhVar2 = (zrh) linkedHashMap2.get(interstitial);
            if (zrhVar2 == null || !zrhVar2.a()) {
                zrhVar2 = null;
            }
            if (!Intrinsics.c(linkedHashMap2.get(interstitial), zrhVar2)) {
                zrh zrhVar3 = (zrh) linkedHashMap2.get(interstitial);
                if (zrhVar3 != null) {
                    zrhVar3.release();
                }
                linkedHashMap2.remove(interstitial);
            }
            if (zrhVar2 == null) {
                WeakReference weakReference = this.t;
                if (weakReference != null) {
                    this.r = 1;
                    obj = g9aVar.m(weakReference, interstitial, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                }
            } else {
                zrhVar = zrhVar2;
            }
            if (zrhVar != null) {
                g9aVar.k(interstitial).j(new pn3(zrhVar));
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        zrhVar = (zrh) obj;
        if (zrhVar != null) {
        }
        return Unit.a;
    }
}
