package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xjm extends hoi implements Function2 {
    public final /* synthetic */ hoi A;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ u6b y;
    public final /* synthetic */ xa3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xjm(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, boolean z, boolean z2, Function0 function0, Function1 function1, u6b u6bVar, xa3 xa3Var, ct8 ct8Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = blazeBaseInlinePlayerContainer;
        this.u = z;
        this.v = z2;
        this.w = function0;
        this.x = function1;
        this.y = u6bVar;
        this.z = xa3Var;
        this.A = (hoi) ct8Var;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [ct8, hoi] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        xjm xjmVar = new xjm(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, rq3Var);
        xjmVar.s = obj;
        return xjmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xjm) create((List) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer.access$prepareViewingRecordWithFailureHandling(r5, r6, r7, r8, r9, r10, r11, r12) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Type inference failed for: r12v2, types: [ct8, hoi] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xjm xjmVar;
        Exception exc;
        Object a;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            List list = (List) this.s;
            try {
                BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer = this.t;
                boolean z = this.u;
                boolean z2 = this.v;
                Function0 function0 = this.w;
                Function1 function1 = this.x;
                fim fimVar = new fim(this.y, this.z, this.A, null);
                this.r = 1;
                xjmVar = this;
            } catch (Exception e) {
                e = e;
                xjmVar = this;
            }
            try {
            } catch (Exception e2) {
                e = e2;
                exc = e;
                if (!(exc instanceof CancellationException)) {
                }
            }
        } else if (i == 1) {
            try {
                y6a.M(obj);
            } catch (Exception e3) {
                exc = e3;
                xjmVar = this;
                if (!(exc instanceof CancellationException)) {
                    return Unit.a;
                }
                xjmVar.r = 2;
                a = xjmVar.t.a(xjmVar.x, xjmVar.w, xjmVar.v, xjmVar);
            }
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
