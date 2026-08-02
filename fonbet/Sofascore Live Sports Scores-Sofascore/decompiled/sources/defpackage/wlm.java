package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wlm extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ u6b x;
    public final /* synthetic */ xa3 y;
    public final /* synthetic */ hoi z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wlm(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Function1 function1, boolean z, boolean z2, Function0 function0, u6b u6bVar, xa3 xa3Var, ct8 ct8Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = blazeBaseInlinePlayerContainer;
        this.t = function1;
        this.u = z;
        this.v = z2;
        this.w = function0;
        this.x = u6bVar;
        this.y = xa3Var;
        this.z = (hoi) ct8Var;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [ct8, hoi] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new wlm(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wlm) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [ct8, hoi] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ?? r11 = this.z;
            BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer = this.s;
            boolean z = this.u;
            boolean z2 = this.v;
            Function0 function0 = this.w;
            Function1 function1 = this.t;
            xjm xjmVar = new xjm(blazeBaseInlinePlayerContainer, z, z2, function0, function1, this.x, this.y, r11, null);
            this.r = 1;
            if (BlazeBaseInlinePlayerContainer.access$preloadContentWithEmptyOrFailureHandling(blazeBaseInlinePlayerContainer, false, function1, xjmVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
