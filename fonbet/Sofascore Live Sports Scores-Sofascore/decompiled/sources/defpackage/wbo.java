package defpackage;

import com.google.android.gms.internal.ads.zzgdh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wbo extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ zzgdh t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wbo(zzgdh zzgdhVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = zzgdhVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        zzgdh zzgdhVar = this.t;
        switch (i) {
            case 0:
                return new wbo(zzgdhVar, rq3Var, 0);
            case 1:
                return new wbo(zzgdhVar, rq3Var, 1);
            case 2:
                return new wbo(zzgdhVar, rq3Var, 2);
            case 3:
                return new wbo(zzgdhVar, rq3Var, 3);
            case 4:
                return new wbo(zzgdhVar, rq3Var, 4);
            default:
                return new wbo(zzgdhVar, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((wbo) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        zzgdh zzgdhVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                y6a.M(obj);
                if (i2 == 0) {
                    this.s = 1;
                    if (zzgdhVar.f(this) == lu3Var) {
                    }
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                y6a.M(obj);
                if (i3 == 0) {
                    this.s = 1;
                    if (zzgdhVar.j(this) == lu3Var2) {
                    }
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                y6a.M(obj);
                if (i4 == 0) {
                    this.s = 1;
                    if (zzgdhVar.h(this) == lu3Var3) {
                    }
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                y6a.M(obj);
                if (i5 == 0) {
                    this.s = 1;
                    if (zzgdhVar.d(this) == lu3Var4) {
                    }
                }
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                y6a.M(obj);
                if (i6 == 0) {
                    this.s = 1;
                    if (zzgdhVar.i(this) == lu3Var5) {
                    }
                }
                break;
            default:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                y6a.M(obj);
                if (i7 == 0) {
                    this.s = 1;
                    if (zzgdhVar.g(this) == lu3Var6) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}
