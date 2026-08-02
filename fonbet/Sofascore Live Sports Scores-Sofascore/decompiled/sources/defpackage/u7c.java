package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u7c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ u8c u;
    public final /* synthetic */ MediaPost v;
    public final /* synthetic */ Event w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7c(u8c u8cVar, MediaPost mediaPost, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = u8cVar;
        this.v = mediaPost;
        this.w = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                u7c u7cVar = new u7c(this.u, this.v, this.w, rq3Var, 0);
                u7cVar.t = obj;
                return u7cVar;
            case 1:
                u7c u7cVar2 = new u7c(this.u, this.v, this.w, rq3Var, 1);
                u7cVar2.t = obj;
                return u7cVar2;
            case 2:
                u7c u7cVar3 = new u7c(this.u, this.v, this.w, rq3Var, 2);
                u7cVar3.t = obj;
                return u7cVar3;
            case 3:
                u7c u7cVar4 = new u7c(this.u, this.v, this.w, rq3Var, 3);
                u7cVar4.t = obj;
                return u7cVar4;
            case 4:
                u7c u7cVar5 = new u7c(this.u, this.v, this.w, rq3Var, 4);
                u7cVar5.t = obj;
                return u7cVar5;
            case 5:
                u7c u7cVar6 = new u7c(this.u, this.v, this.w, rq3Var, 5);
                u7cVar6.t = obj;
                return u7cVar6;
            case 6:
                u7c u7cVar7 = new u7c(this.u, this.v, this.w, rq3Var, 6);
                u7cVar7.t = obj;
                return u7cVar7;
            case 7:
                u7c u7cVar8 = new u7c(this.u, this.v, this.w, rq3Var, 7);
                u7cVar8.t = obj;
                return u7cVar8;
            case 8:
                u7c u7cVar9 = new u7c(this.u, this.v, this.w, rq3Var, 8);
                u7cVar9.t = obj;
                return u7cVar9;
            case 9:
                u7c u7cVar10 = new u7c(this.u, this.v, this.w, rq3Var, 9);
                u7cVar10.t = obj;
                return u7cVar10;
            default:
                u7c u7cVar11 = new u7c(this.u, this.v, this.w, rq3Var, 10);
                u7cVar11.t = obj;
                return u7cVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((u7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        MediaPost mediaPost = this.v;
        u8c u8cVar = this.u;
        Event event = this.w;
        switch (i) {
            case 0:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar2 = this.u;
                MediaPost mediaPost2 = this.v;
                t7c t7cVar = new t7c(null, ku3Var, u8cVar2, mediaPost2);
                this.t = null;
                this.s = 1;
                Object r = s9a.r(new f54(mediaPost2, t7cVar, this.w, u8cVar2, (rq3) null), this);
                return r == lu3Var ? lu3Var : r;
            case 1:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                MediaPost mediaPost3 = this.v;
                u8c u8cVar3 = this.u;
                z7c z7cVar = new z7c(mediaPost3, ku3Var2, u8cVar3, null, 0);
                this.t = null;
                this.s = 1;
                Object b = u8cVar3.b(mediaPost3, event, z7cVar, this);
                return b == lu3Var2 ? lu3Var2 : b;
            case 2:
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                a8c a8cVar = new a8c(null, ku3Var3, u8cVar, mediaPost);
                this.t = null;
                this.s = 1;
                Object b2 = u8cVar.b(mediaPost, event, a8cVar, this);
                return b2 == lu3Var3 ? lu3Var3 : b2;
            case 3:
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                d8c d8cVar = new d8c(null, ku3Var4, u8cVar, mediaPost);
                this.t = null;
                this.s = 1;
                Object b3 = u8cVar.b(mediaPost, event, d8cVar, this);
                return b3 == lu3Var4 ? lu3Var4 : b3;
            case 4:
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar4 = this.u;
                MediaPost mediaPost4 = this.v;
                k8c k8cVar = new k8c(null, ku3Var5, u8cVar4, mediaPost4);
                this.t = null;
                this.s = 1;
                Object r2 = s9a.r(new lua(mediaPost4, k8cVar, this.w, u8cVar4, null), this);
                return r2 == lu3Var5 ? lu3Var5 : r2;
            case 5:
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                n8c n8cVar = new n8c(null, ku3Var6, u8cVar, mediaPost);
                this.t = null;
                this.s = 1;
                Object b4 = u8cVar.b(mediaPost, event, n8cVar, this);
                return b4 == lu3Var6 ? lu3Var6 : b4;
            case 6:
                ku3 ku3Var7 = (ku3) this.t;
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                o8c o8cVar = new o8c(null, ku3Var7, u8cVar, mediaPost);
                this.t = null;
                this.s = 1;
                Object b5 = u8cVar.b(mediaPost, event, o8cVar, this);
                return b5 == lu3Var7 ? lu3Var7 : b5;
            case 7:
                ku3 ku3Var8 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                MediaPost mediaPost5 = this.v;
                u8c u8cVar5 = this.u;
                z7c z7cVar2 = new z7c(mediaPost5, ku3Var8, u8cVar5, null, 1);
                this.t = null;
                this.s = 1;
                Object b6 = u8cVar5.b(mediaPost5, event, z7cVar2, this);
                return b6 == lu3Var8 ? lu3Var8 : b6;
            case 8:
                ku3 ku3Var9 = (ku3) this.t;
                lu3 lu3Var9 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                p8c p8cVar = new p8c(null, ku3Var9, u8cVar, mediaPost);
                this.t = null;
                this.s = 1;
                Object b7 = u8cVar.b(mediaPost, event, p8cVar, this);
                return b7 == lu3Var9 ? lu3Var9 : b7;
            case 9:
                ku3 ku3Var10 = (ku3) this.t;
                lu3 lu3Var10 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar6 = this.u;
                MediaPost mediaPost6 = this.v;
                q8c q8cVar = new q8c(null, ku3Var10, u8cVar6, mediaPost6);
                this.t = null;
                this.s = 1;
                Object r3 = s9a.r(new f54(mediaPost6, q8cVar, this.w, u8cVar6, (rq3) null), this);
                return r3 == lu3Var10 ? lu3Var10 : r3;
            default:
                ku3 ku3Var11 = (ku3) this.t;
                lu3 lu3Var11 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                MediaPost mediaPost7 = this.v;
                u8c u8cVar7 = this.u;
                z7c z7cVar3 = new z7c(mediaPost7, ku3Var11, u8cVar7, null, 2);
                this.t = null;
                this.s = 1;
                Object b8 = u8cVar7.b(mediaPost7, event, z7cVar3, this);
                return b8 == lu3Var11 ? lu3Var11 : b8;
        }
    }
}
