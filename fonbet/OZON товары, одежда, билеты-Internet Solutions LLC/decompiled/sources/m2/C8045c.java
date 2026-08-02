package m2;

import java.util.ArrayList;
import m2.e;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8045c {

    /* renamed from: a, reason: collision with root package name */
    protected e f74068a;

    /* renamed from: b, reason: collision with root package name */
    protected e f74069b;

    /* renamed from: c, reason: collision with root package name */
    protected e f74070c;

    /* renamed from: d, reason: collision with root package name */
    protected e f74071d;

    /* renamed from: e, reason: collision with root package name */
    protected e f74072e;

    /* renamed from: f, reason: collision with root package name */
    protected e f74073f;

    /* renamed from: g, reason: collision with root package name */
    protected e f74074g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f74075h;

    /* renamed from: i, reason: collision with root package name */
    protected int f74076i;

    /* renamed from: j, reason: collision with root package name */
    protected int f74077j;

    /* renamed from: k, reason: collision with root package name */
    protected float f74078k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    private int f74079l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f74080m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f74081n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f74082o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f74083p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f74084q;

    public C8045c(e eVar, int i11, boolean z11) {
        this.f74068a = eVar;
        this.f74079l = i11;
        this.f74080m = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        e eVar;
        int i11;
        if (!this.f74084q) {
            int i12 = this.f74079l;
            int i13 = i12 * 2;
            e eVar2 = this.f74068a;
            e eVar3 = eVar2;
            e eVar4 = eVar3;
            boolean z11 = false;
            while (!z11) {
                this.f74076i++;
                eVar3.f74153q0[i12] = null;
                eVar3.f74151p0[i12] = null;
                int M11 = eVar3.M();
                d[] dVarArr = eVar3.f74112S;
                if (M11 != 8) {
                    eVar3.t(i12);
                    e.b bVar = e.b.MATCH_CONSTRAINT;
                    dVarArr[i13].f();
                    int i14 = i13 + 1;
                    dVarArr[i14].f();
                    dVarArr[i13].f();
                    dVarArr[i14].f();
                    if (this.f74069b == null) {
                        this.f74069b = eVar3;
                    }
                    this.f74071d = eVar3;
                    if (eVar3.f74115V[i12] == bVar) {
                        int[] iArr = eVar3.f74160u;
                        int i15 = iArr[i12];
                        if (i15 == 0 || i15 == 3 || i15 == 2) {
                            this.f74077j++;
                            float f7 = eVar3.f74149o0[i12];
                            if (f7 > 0.0f) {
                                this.f74078k += f7;
                            }
                            if (eVar3.M() != 8 && eVar3.f74115V[i12] == bVar && ((i11 = iArr[i12]) == 0 || i11 == 3)) {
                                if (f7 < 0.0f) {
                                    this.f74081n = true;
                                } else {
                                    this.f74082o = true;
                                }
                                if (this.f74075h == null) {
                                    this.f74075h = new ArrayList<>();
                                }
                                this.f74075h.add(eVar3);
                            }
                            if (this.f74073f == null) {
                                this.f74073f = eVar3;
                            }
                            e eVar5 = this.f74074g;
                            if (eVar5 != null) {
                                eVar5.f74151p0[i12] = eVar3;
                            }
                            this.f74074g = eVar3;
                        }
                        if (i12 == 0) {
                            if (eVar3.f74156s == 0 && eVar3.f74162v == 0) {
                                int i16 = eVar3.f74163w;
                            }
                        } else if (eVar3.f74158t == 0 && eVar3.f74165y == 0) {
                            int i17 = eVar3.f74166z;
                        }
                    }
                }
                if (eVar4 != eVar3) {
                    eVar4.f74153q0[i12] = eVar3;
                }
                d dVar = dVarArr[i13 + 1].f74090f;
                if (dVar != null) {
                    e eVar6 = dVar.f74088d;
                    d dVar2 = eVar6.f74112S[i13].f74090f;
                    if (dVar2 != null && dVar2.f74088d == eVar3) {
                        eVar = eVar6;
                        if (eVar != null) {
                            z11 = true;
                            eVar = eVar3;
                        }
                        eVar4 = eVar3;
                        eVar3 = eVar;
                    }
                }
                eVar = null;
                if (eVar != null) {
                }
                eVar4 = eVar3;
                eVar3 = eVar;
            }
            e eVar7 = this.f74069b;
            if (eVar7 != null) {
                eVar7.f74112S[i13].f();
            }
            e eVar8 = this.f74071d;
            if (eVar8 != null) {
                eVar8.f74112S[i13 + 1].f();
            }
            this.f74070c = eVar3;
            if (i12 == 0 && this.f74080m) {
                this.f74072e = eVar3;
            } else {
                this.f74072e = eVar2;
            }
            this.f74083p = this.f74082o && this.f74081n;
        }
        this.f74084q = true;
    }
}
