package defpackage;

import com.blaze.blazesdk.shared.results.g0;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ixl extends hoi implements Function2 {
    public final /* synthetic */ g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixl(g0 g0Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = g0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ixl(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ixl(this.r, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        j1m.a.getClass();
        Object obj2 = this.r;
        obj2.getClass();
        Objects.toString(obj2);
        if (obj2 instanceof yqm) {
            lwl.a(((yqm) obj2).b(), vul.ERROR, new ndk(obj2, 15));
        }
        return Unit.a;
    }
}
