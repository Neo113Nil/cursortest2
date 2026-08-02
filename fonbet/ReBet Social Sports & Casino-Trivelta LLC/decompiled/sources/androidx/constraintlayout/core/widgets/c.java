package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public e f17880a;

    /* renamed from: b, reason: collision with root package name */
    public e f17881b;

    /* renamed from: c, reason: collision with root package name */
    public e f17882c;

    /* renamed from: d, reason: collision with root package name */
    public e f17883d;

    /* renamed from: e, reason: collision with root package name */
    public e f17884e;

    /* renamed from: f, reason: collision with root package name */
    public e f17885f;

    /* renamed from: g, reason: collision with root package name */
    public e f17886g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f17887h;

    /* renamed from: i, reason: collision with root package name */
    public int f17888i;

    /* renamed from: j, reason: collision with root package name */
    public int f17889j;

    /* renamed from: k, reason: collision with root package name */
    public float f17890k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public int f17891l;

    /* renamed from: m, reason: collision with root package name */
    public int f17892m;

    /* renamed from: n, reason: collision with root package name */
    public int f17893n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17894o;

    /* renamed from: p, reason: collision with root package name */
    public int f17895p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17896q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17897r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17898s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17899t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17900u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17901v;

    public c(e eVar, int i10, boolean z10) {
        this.f17880a = eVar;
        this.f17895p = i10;
        this.f17896q = z10;
    }

    public static boolean c(e eVar, int i10) {
        if (eVar.V() == 8 || eVar.mListDimensionBehaviors[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.mResolvedMatchConstraintDefault[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f17901v) {
            b();
        }
        this.f17901v = true;
    }

    public final void b() {
        int i10 = this.f17895p * 2;
        e eVar = this.f17880a;
        this.f17894o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f17888i++;
            e[] eVarArr = eVar.mNextChainWidget;
            int i11 = this.f17895p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.mListNextMatchConstraintsWidget[i11] = null;
            if (eVar.V() != 8) {
                this.f17891l++;
                e.b u10 = eVar.u(this.f17895p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u10 != bVar) {
                    this.f17892m += eVar.E(this.f17895p);
                }
                int f10 = this.f17892m + eVar.mListAnchors[i10].f();
                this.f17892m = f10;
                int i12 = i10 + 1;
                this.f17892m = f10 + eVar.mListAnchors[i12].f();
                int f11 = this.f17893n + eVar.mListAnchors[i10].f();
                this.f17893n = f11;
                this.f17893n = f11 + eVar.mListAnchors[i12].f();
                if (this.f17881b == null) {
                    this.f17881b = eVar;
                }
                this.f17883d = eVar;
                e.b[] bVarArr = eVar.mListDimensionBehaviors;
                int i13 = this.f17895p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.mResolvedMatchConstraintDefault[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f17889j++;
                        float f12 = eVar.mWeight[i13];
                        if (f12 > 0.0f) {
                            this.f17890k += f12;
                        }
                        if (c(eVar, i13)) {
                            if (f12 < 0.0f) {
                                this.f17897r = true;
                            } else {
                                this.f17898s = true;
                            }
                            if (this.f17887h == null) {
                                this.f17887h = new ArrayList();
                            }
                            this.f17887h.add(eVar);
                        }
                        if (this.f17885f == null) {
                            this.f17885f = eVar;
                        }
                        e eVar4 = this.f17886g;
                        if (eVar4 != null) {
                            eVar4.mListNextMatchConstraintsWidget[this.f17895p] = eVar;
                        }
                        this.f17886g = eVar;
                    }
                    if (this.f17895p == 0) {
                        if (eVar.f17987u != 0) {
                            this.f17894o = false;
                        } else if (eVar.f17991w != 0 || eVar.f17993x != 0) {
                            this.f17894o = false;
                        }
                    } else if (eVar.f17989v != 0) {
                        this.f17894o = false;
                    } else if (eVar.f17997z != 0 || eVar.f17921A != 0) {
                        this.f17894o = false;
                    }
                    if (eVar.f17943W != 0.0f) {
                        this.f17894o = false;
                        this.f17900u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.mNextChainWidget[this.f17895p] = eVar;
            }
            d dVar = eVar.mListAnchors[i10 + 1].f17907f;
            if (dVar != null) {
                e eVar5 = dVar.f17905d;
                d dVar2 = eVar5.mListAnchors[i10].f17907f;
                if (dVar2 != null && dVar2.f17905d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f17881b;
        if (eVar6 != null) {
            this.f17892m -= eVar6.mListAnchors[i10].f();
        }
        e eVar7 = this.f17883d;
        if (eVar7 != null) {
            this.f17892m -= eVar7.mListAnchors[i10 + 1].f();
        }
        this.f17882c = eVar;
        if (this.f17895p == 0 && this.f17896q) {
            this.f17884e = eVar;
        } else {
            this.f17884e = this.f17880a;
        }
        this.f17899t = this.f17898s && this.f17897r;
    }
}
