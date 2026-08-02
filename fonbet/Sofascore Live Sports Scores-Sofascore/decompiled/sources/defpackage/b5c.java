package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b5c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ e5c t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5c(e5c e5cVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = e5cVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        e5c e5cVar = this.t;
        switch (i) {
            case 0:
                return new b5c(e5cVar, i2, rq3Var, 0);
            default:
                return new b5c(e5cVar, i2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((b5c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r10 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        if (r10 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        if (r10 == r6) goto L35;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        e5c e5cVar = this.t;
        switch (i) {
            case 0:
                u8c u8cVar = e5cVar.b;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = u8cVar.a(i2, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj);
                            return (w31) obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                MediaPost mediaPost = (MediaPost) obj;
                if (mediaPost == null) {
                    return null;
                }
                this.s = 2;
                obj = u8c.d(u8cVar, mediaPost, null, this, 14);
                break;
            default:
                u8c u8cVar2 = e5cVar.b;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = u8cVar2.a(i2, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y6a.M(obj);
                            return (w31) obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                MediaPost mediaPost2 = (MediaPost) obj;
                if (mediaPost2 == null) {
                    return null;
                }
                this.s = 2;
                obj = u8c.d(u8cVar2, mediaPost2, null, this, 14);
                break;
        }
    }
}
