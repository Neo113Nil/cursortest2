package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class at1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public znh w;
    public int x;
    public final /* synthetic */ znh y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ at1(znh znhVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.y = znhVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new at1(this.y, rq3Var, 0);
            default:
                return new at1(this.y, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((at1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        if (defpackage.n4o.y(600, r17) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (defpackage.n4o.y(600, r17) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (defpackage.n4o.y(600, r17) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bb, code lost:
    
        if (defpackage.n4o.y(600, r17) != r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d1, code lost:
    
        if (defpackage.n4o.y(600, r17) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ea, code lost:
    
        if (defpackage.n4o.y(900, r17) == r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f1 -> B:11:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01ea -> B:46:0x01ee). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        znh znhVar;
        int i7;
        int i8;
        int i9;
        int i10;
        znh znhVar2;
        int i11;
        int i12;
        znh znhVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        znh znhVar4;
        znh znhVar5;
        int i17 = this.r;
        long j = 200;
        znh znhVar6 = this.y;
        switch (i17) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i18 = this.x;
                if (i18 == 0) {
                    y6a.M(obj);
                    i = 3;
                    i2 = 0;
                    if (i2 < i) {
                    }
                } else if (i18 == 1) {
                    int i19 = this.v;
                    int i20 = this.u;
                    int i21 = this.t;
                    int i22 = this.s;
                    znh znhVar7 = this.w;
                    y6a.M(obj);
                    i7 = i22;
                    znhVar = znhVar7;
                    i9 = i20;
                    i8 = i21;
                    i10 = i19;
                    znhVar.i(1);
                    this.w = znhVar;
                    this.s = i7;
                    this.t = i8;
                    this.u = i9;
                    this.v = i10;
                    this.x = 2;
                    if (n4o.y(600L, this) != lu3Var) {
                    }
                } else if (i18 == 2) {
                    i5 = this.v;
                    i4 = this.u;
                    i3 = this.t;
                    i = this.s;
                    znhVar6 = this.w;
                    y6a.M(obj);
                    znhVar6.i(2);
                    this.w = znhVar6;
                    this.s = i;
                    this.t = i3;
                    this.u = i4;
                    this.v = i5;
                    this.x = 3;
                } else if (i18 == 3) {
                    i5 = this.v;
                    i4 = this.u;
                    i3 = this.t;
                    i = this.s;
                    znhVar6 = this.w;
                    y6a.M(obj);
                    znhVar6.i(3);
                    this.w = znhVar6;
                    this.s = i;
                    this.t = i3;
                    this.u = i4;
                    this.v = i5;
                    this.x = 4;
                    break;
                } else if (i18 == 4) {
                    i5 = this.v;
                    i4 = this.u;
                    i3 = this.t;
                    i = this.s;
                    znhVar6 = this.w;
                    y6a.M(obj);
                    int i23 = i4;
                    int i24 = i5;
                    i6 = i3;
                    znhVar6.i(0);
                    this.w = znhVar6;
                    this.s = i;
                    this.t = i6;
                    this.u = i23;
                    this.v = i24;
                    this.x = 5;
                    break;
                } else if (i18 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i6 = this.t;
                    int i25 = this.s;
                    znh znhVar8 = this.w;
                    y6a.M(obj);
                    i = i25;
                    znhVar6 = znhVar8;
                    i2 = i6 + 1;
                    if (i2 < i) {
                        break;
                    } else {
                        this.w = znhVar6;
                        this.s = i;
                        this.t = i2;
                        this.u = i2;
                        this.v = 0;
                        this.x = 1;
                        if (n4o.y(200L, this) != lu3Var) {
                            i7 = i;
                            znhVar = znhVar6;
                            i9 = i2;
                            i8 = i9;
                            i10 = 0;
                            znhVar.i(1);
                            this.w = znhVar;
                            this.s = i7;
                            this.t = i8;
                            this.u = i9;
                            this.v = i10;
                            this.x = 2;
                            if (n4o.y(600L, this) != lu3Var) {
                                i5 = i10;
                                i4 = i9;
                                i3 = i8;
                                i = i7;
                                znhVar6 = znhVar;
                                znhVar6.i(2);
                                this.w = znhVar6;
                                this.s = i;
                                this.t = i3;
                                this.u = i4;
                                this.v = i5;
                                this.x = 3;
                                break;
                            }
                        }
                        break;
                    }
                }
            default:
                lu3 lu3Var2 = lu3.a;
                int i26 = this.x;
                if (i26 == 0) {
                    y6a.M(obj);
                    znhVar2 = znhVar6;
                    i11 = 3;
                    i12 = 0;
                    if (i12 >= i11) {
                    }
                } else if (i26 == 1) {
                    i15 = this.v;
                    i14 = this.u;
                    i12 = this.t;
                    i11 = this.s;
                    znhVar5 = this.w;
                    y6a.M(obj);
                    znhVar5.i(1);
                    this.w = znhVar5;
                    this.s = i11;
                    this.t = i12;
                    this.u = i14;
                    this.v = i15;
                    this.x = 2;
                } else if (i26 == 2) {
                    i15 = this.v;
                    i14 = this.u;
                    i12 = this.t;
                    i11 = this.s;
                    znhVar5 = this.w;
                    y6a.M(obj);
                    znhVar5.i(2);
                    this.w = znhVar5;
                    this.s = i11;
                    this.t = i12;
                    this.u = i14;
                    this.v = i15;
                    this.x = 3;
                    break;
                } else if (i26 == 3) {
                    i15 = this.v;
                    i14 = this.u;
                    i12 = this.t;
                    i11 = this.s;
                    znhVar5 = this.w;
                    y6a.M(obj);
                    i13 = i11;
                    znhVar3 = znhVar5;
                    znhVar3.i(3);
                    this.w = znhVar3;
                    this.s = i13;
                    this.t = i12;
                    this.u = i14;
                    this.v = i15;
                    this.x = 4;
                    break;
                } else if (i26 == 4) {
                    i15 = this.v;
                    i14 = this.u;
                    i12 = this.t;
                    int i27 = this.s;
                    znhVar3 = this.w;
                    y6a.M(obj);
                    i13 = i27;
                    int i28 = i14;
                    int i29 = i15;
                    i16 = i12;
                    znhVar3.i(0);
                    this.w = znhVar3;
                    this.s = i13;
                    this.t = i16;
                    this.u = i28;
                    this.v = i29;
                    this.x = 5;
                    if (n4o.y(900L, this) != lu3Var2) {
                        znhVar4 = znhVar3;
                        i11 = i13;
                        znh znhVar9 = znhVar4;
                        i12 = i16 + 1;
                        znhVar2 = znhVar9;
                        j = 200;
                        if (i12 >= i11) {
                        }
                    }
                } else if (i26 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i16 = this.t;
                    int i30 = this.s;
                    znhVar4 = this.w;
                    y6a.M(obj);
                    i11 = i30;
                    znh znhVar92 = znhVar4;
                    i12 = i16 + 1;
                    znhVar2 = znhVar92;
                    j = 200;
                    if (i12 >= i11) {
                        break;
                    } else {
                        this.w = znhVar2;
                        this.s = i11;
                        this.t = i12;
                        this.u = i12;
                        this.v = 0;
                        this.x = 1;
                        if (n4o.y(j, this) != lu3Var2) {
                            znhVar5 = znhVar2;
                            i14 = i12;
                            i15 = 0;
                            znhVar5.i(1);
                            this.w = znhVar5;
                            this.s = i11;
                            this.t = i12;
                            this.u = i14;
                            this.v = i15;
                            this.x = 2;
                            break;
                        }
                        break;
                    }
                }
        }
        return Unit.a;
    }
}
