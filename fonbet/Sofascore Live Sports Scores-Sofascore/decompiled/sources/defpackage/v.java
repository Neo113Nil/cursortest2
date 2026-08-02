package defpackage;

import android.content.ContextWrapper;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v extends hoi implements Function2 {
    public final /* synthetic */ List r;
    public final /* synthetic */ ContextWrapper s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(List list, ContextWrapper contextWrapper, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = list;
        this.s = contextWrapper;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new v(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.r, this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Iterator it = CollectionsKt.W(this.r).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (pf5.j != null) {
                au3 au3Var = pf5.c;
                ContextWrapper contextWrapper = this.s;
                contextWrapper.getClass();
                au3Var.getClass();
                try {
                    it9 it9Var = new it9(contextWrapper);
                    it9Var.c = str;
                    it9Var.k = au3Var;
                    it9Var.l = au3Var;
                    it9Var.m = au3Var;
                    ot9 a = it9Var.a();
                    bpf a2 = zlm.a.a();
                    if (a2 != null) {
                        a2.a(a);
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
            }
        }
        return Unit.a;
    }
}
