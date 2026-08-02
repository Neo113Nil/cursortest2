package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wxm extends hoi implements Function2 {
    public syl r;
    public udm s;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ syl w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxm(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        wxm wxmVar = new wxm(this.w, rq3Var);
        wxmVar.v = obj;
        return wxmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wxm wxmVar = new wxm(this.w, (rq3) obj2);
        wxmVar.v = (Pair) obj;
        return wxmVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (r12.w(r4, r13, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r5.t(r6, r7, r9, r11) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        udm udmVar;
        wxm wxmVar;
        syl sylVar;
        long j;
        udm udmVar2;
        mpm mpmVar;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                return Unit.a;
            }
            j = this.t;
            udmVar = this.s;
            sylVar = this.r;
            udmVar2 = (udm) this.v;
            y6a.M(obj);
            wxmVar = this;
            mpmVar = sylVar.t;
            if (mpmVar != null) {
                int currentItem = udmVar.j.getCurrentItem();
                wxmVar.v = udmVar2;
                wxmVar.r = null;
                wxmVar.s = null;
                wxmVar.u = 2;
            }
            return Unit.a;
        }
        y6a.M(obj);
        Pair pair = (Pair) this.v;
        long longValue = ((Number) pair.a).longValue();
        long longValue2 = ((Number) pair.b).longValue();
        syl sylVar2 = this.w;
        udmVar = sylVar2.q;
        if (sylVar2.H()) {
            mpm mpmVar2 = sylVar2.t;
            if (mpmVar2 != null) {
                int currentItem2 = udmVar.j.getCurrentItem();
                this.v = udmVar;
                this.r = sylVar2;
                this.s = udmVar;
                this.t = longValue;
                this.u = 1;
                wxmVar = this;
            } else {
                wxmVar = this;
            }
            sylVar = sylVar2;
            j = longValue;
            udmVar2 = udmVar;
            mpmVar = sylVar.t;
            if (mpmVar != null) {
            }
        }
        return Unit.a;
    }
}
