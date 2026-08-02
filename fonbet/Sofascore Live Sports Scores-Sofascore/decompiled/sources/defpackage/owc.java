package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class owc extends hoi implements Function2 {
    public final /* synthetic */ qwc A;
    public final /* synthetic */ float B;
    public final /* synthetic */ svg C;
    public asf r;
    public asf s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ csf w;
    public final /* synthetic */ fsf x;
    public final /* synthetic */ fsf y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owc(csf csfVar, fsf fsfVar, fsf fsfVar2, float f, qwc qwcVar, float f2, svg svgVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = csfVar;
        this.x = fsfVar;
        this.y = fsfVar2;
        this.z = f;
        this.A = qwcVar;
        this.B = f2;
        this.C = svgVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        owc owcVar = new owc(this.w, this.x, this.y, this.z, this.A, this.B, this.C, rq3Var);
        owcVar.v = obj;
        return owcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((owc) create((qvg) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0192 -> B:7:0x0193). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qvg qvgVar;
        asf asfVar;
        csf csfVar;
        fsf fsfVar;
        fsf fsfVar2;
        int i;
        qvg qvgVar2;
        int i2;
        asf asfVar2;
        int i3;
        int i4;
        asf asfVar3;
        fsf fsfVar3;
        asf asfVar4;
        owc owcVar = this;
        lu3 lu3Var = lu3.a;
        int i5 = owcVar.u;
        fsf fsfVar4 = owcVar.y;
        asf asfVar5 = null;
        csf csfVar2 = owcVar.w;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        fsf fsfVar5 = owcVar.x;
        if (i5 == 0) {
            y6a.M(obj);
            qvgVar = (qvg) owcVar.v;
            asf asfVar6 = new asf();
            asfVar6.a = true;
            asfVar = asfVar6;
            if (!asfVar.a) {
            }
        } else if (i5 == 1) {
            asf asfVar7 = owcVar.s;
            asf asfVar8 = owcVar.r;
            qvg qvgVar3 = (qvg) owcVar.v;
            y6a.M(obj);
            i2 = 2;
            i = 1;
            asfVar3 = null;
            fsfVar3 = fsfVar5;
            qvgVar2 = qvgVar3;
            i3 = 3;
            asfVar4 = asfVar8;
            asfVar7.a = ((Boolean) obj).booleanValue();
            owcVar = this;
            qvgVar = qvgVar2;
            i8 = i;
            asfVar5 = asfVar3;
            asfVar = asfVar4;
            i6 = i3;
            fsfVar5 = fsfVar3;
            i7 = i2;
            if (!asfVar.a) {
            }
        } else if (i5 == 2) {
            i4 = owcVar.t;
            asfVar2 = owcVar.r;
            qvg qvgVar4 = (qvg) owcVar.v;
            y6a.M(obj);
            fsfVar = fsfVar4;
            csfVar = csfVar2;
            i2 = 2;
            i = 1;
            fsfVar2 = fsfVar5;
            qvgVar2 = qvgVar4;
            i3 = 3;
            if (asfVar2.a) {
            }
        } else {
            if (i5 != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            asf asfVar9 = owcVar.s;
            asf asfVar10 = owcVar.r;
            qvg qvgVar5 = (qvg) owcVar.v;
            y6a.M(obj);
            i2 = 2;
            i = 1;
            asfVar3 = null;
            fsfVar3 = fsfVar5;
            qvgVar2 = qvgVar5;
            i3 = 3;
            asfVar4 = asfVar10;
            asfVar2 = asfVar9;
            Object m = obj;
            asfVar2.a = ((Boolean) m).booleanValue();
            qvgVar = qvgVar2;
            i8 = i;
            asfVar5 = asfVar3;
            asfVar = asfVar4;
            i6 = i3;
            fsfVar5 = fsfVar3;
            i7 = i2;
            if (!asfVar.a) {
                asfVar.a = false;
                float floatValue = csfVar2.a - ((Number) ((eoh) ((d80) fsfVar5.a).b).getValue()).floatValue();
                boolean z = ((mwc) fsfVar4.a).c;
                qwc qwcVar = owcVar.A;
                if (!z) {
                    float abs = Math.abs(floatValue);
                    float f = owcVar.z;
                    if (abs >= f) {
                        float signum = Math.signum(floatValue) * f;
                        qwcVar.k(qvgVar, signum);
                        d80 d80Var = (d80) fsfVar5.a;
                        d80 B = t62.B(d80Var, ((Number) ((eoh) d80Var.b).getValue()).floatValue() + signum, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                        fsfVar5.a = B;
                        int b = wzb.b(Math.abs(csfVar2.a - ((Number) ((eoh) B.b).getValue()).floatValue()) / owcVar.B);
                        if (b > 100) {
                            b = 100;
                        }
                        d80 d80Var2 = (d80) fsfVar5.a;
                        float f2 = csfVar2.a;
                        qwc qwcVar2 = owcVar.A;
                        int i9 = b;
                        fsf fsfVar6 = fsfVar4;
                        csf csfVar3 = csfVar2;
                        fsfVar2 = fsfVar5;
                        ke keVar = new ke(qwcVar2, fsfVar6, csfVar3, owcVar.C, asfVar, 10);
                        fsfVar = fsfVar6;
                        csfVar = csfVar3;
                        asfVar2 = asfVar;
                        owcVar.v = qvgVar;
                        owcVar.r = asfVar2;
                        owcVar.s = asfVar5;
                        owcVar.t = i9;
                        owcVar.u = i7;
                        qwcVar2.getClass();
                        csf csfVar4 = new csf();
                        csfVar4.a = ((Number) ((eoh) d80Var2.b).getValue()).floatValue();
                        Float f3 = new Float(f2);
                        i4k h0 = s02.h0(i9, 0, jg5.d, i7);
                        qvgVar2 = qvgVar;
                        lwc lwcVar = new lwc(csfVar4, qwcVar2, qvgVar2, keVar, 0);
                        i2 = i7;
                        i3 = 3;
                        i = 1;
                        Object o = d2a.o(d80Var2, f3, h0, true, lwcVar, owcVar);
                        if (o != lu3.a) {
                            o = Unit.a;
                        }
                        if (o != lu3Var) {
                            i4 = i9;
                            if (asfVar2.a) {
                                owcVar.v = qvgVar2;
                                owcVar.r = asfVar2;
                                owcVar.s = asfVar2;
                                owcVar.u = i3;
                                asfVar3 = asfVar5;
                                fsfVar3 = fsfVar2;
                                fsfVar4 = fsfVar;
                                csfVar2 = csfVar;
                                m = qwc.m(owcVar.A, fsfVar4, csfVar2, owcVar.C, fsfVar3, 50 - i4, owcVar);
                                if (m != lu3Var) {
                                    asfVar4 = asfVar2;
                                    asfVar2.a = ((Boolean) m).booleanValue();
                                    qvgVar = qvgVar2;
                                    i8 = i;
                                    asfVar5 = asfVar3;
                                    asfVar = asfVar4;
                                    i6 = i3;
                                    fsfVar5 = fsfVar3;
                                    i7 = i2;
                                    if (!asfVar.a) {
                                        return Unit.a;
                                    }
                                }
                            } else {
                                i6 = i3;
                                i7 = i2;
                                qvgVar = qvgVar2;
                                i8 = i;
                                fsfVar5 = fsfVar2;
                                fsfVar4 = fsfVar;
                                csfVar2 = csfVar;
                                asfVar = asfVar2;
                                if (!asfVar.a) {
                                }
                            }
                        }
                        return lu3Var;
                    }
                }
                i2 = i7;
                i = i8;
                asfVar3 = asfVar5;
                fsfVar3 = fsfVar5;
                asf asfVar11 = asfVar;
                qvgVar2 = qvgVar;
                i3 = i6;
                qwcVar.k(qvgVar2, floatValue);
                owcVar.v = qvgVar2;
                owcVar.r = asfVar11;
                owcVar.s = asfVar11;
                owcVar.u = i;
                Object m2 = qwc.m(owcVar.A, fsfVar4, csfVar2, owcVar.C, fsfVar3, 50L, owcVar);
                if (m2 != lu3Var) {
                    asfVar4 = asfVar11;
                    asfVar11.a = ((Boolean) m2).booleanValue();
                    owcVar = this;
                    qvgVar = qvgVar2;
                    i8 = i;
                    asfVar5 = asfVar3;
                    asfVar = asfVar4;
                    i6 = i3;
                    fsfVar5 = fsfVar3;
                    i7 = i2;
                    if (!asfVar.a) {
                    }
                }
                return lu3Var;
            }
        }
    }
}
