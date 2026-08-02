package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tkm extends ltk {
    public final pc2 b = pc2.a;
    public final hof c;
    public final hof d;
    public final aeh e;
    public final jof f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends hoi implements ct8 {
        public int r;
        public /* synthetic */ b98 s;
        public /* synthetic */ Object t;
        public final /* synthetic */ tkm u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rq3 rq3Var, tkm tkmVar) {
            super(3, rq3Var);
            this.u = tkmVar;
        }

        @Override // defpackage.ct8
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            a aVar = new a((rq3) obj3, this.u);
            aVar.s = (b98) obj;
            aVar.t = obj2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            Object obj2 = lu3.a;
            int i = this.r;
            if (i == 0) {
                y6a.M(obj);
                b98 b98Var = this.s;
                List list = (List) this.t;
                tkm tkmVar = this.u;
                hof hofVar = tkmVar.c;
                hof hofVar2 = tkmVar.d;
                igm igmVar = new igm(tkmVar, list, null);
                this.r = 1;
                kik.n(b98Var);
                Object r = s9a.r(new ts2(hofVar2, hofVar, b98Var, igmVar, (rq3) null, 2), this);
                if (r != lu3.a) {
                    r = Unit.a;
                }
                if (r != lu3.a) {
                    r = Unit.a;
                }
                if (r == obj2) {
                    return obj2;
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

    public tkm() {
        pog pogVar = new pog(new ckm(this, null));
        iz2 z = un0.z(this);
        kif kifVar = weh.a;
        this.c = un0.H(pogVar, z, kifVar, 1);
        this.d = un0.H(new pog(new kim(this, null)), un0.z(this), kifVar, 1);
        aeh b = beh.b(0, 0, null, 7);
        this.e = b;
        this.f = un0.K(la8.a(b, new a(null, this)), un0.z(this), kifVar, km5.a);
    }
}
