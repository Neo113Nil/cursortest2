package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bn2 extends v7l {
    public final ArrayList k;
    public int l;

    public bn2(wm3 wm3Var, int i) {
        super(wm3Var);
        wm3 wm3Var2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        wm3 wm3Var3 = this.b;
        wm3 n = wm3Var3.n(i);
        while (true) {
            wm3Var2 = wm3Var3;
            wm3Var3 = n;
            if (wm3Var3 == null) {
                break;
            } else {
                n = wm3Var3.n(this.f);
            }
        }
        this.b = wm3Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? wm3Var2.d : i2 == 1 ? wm3Var2.e : null);
        wm3 m = wm3Var2.m(this.f);
        while (m != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? m.d : i3 == 1 ? m.e : null);
            m = m.m(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v7l v7lVar = (v7l) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                v7lVar.b.b = this;
            } else if (i4 == 1) {
                v7lVar.b.c = this;
            }
        }
        if (this.f == 0 && this.b.U.w0 && arrayList.size() > 1) {
            this.b = ((v7l) mz1.h(arrayList, 1)).b;
        }
        int i5 = this.f;
        wm3 wm3Var4 = this.b;
        this.l = i5 == 0 ? wm3Var4.j0 : wm3Var4.k0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x038c, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    @Override // defpackage.rx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(rx4 rx4Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        vx4 vx4Var = this.h;
        if (vx4Var.j) {
            vx4 vx4Var2 = this.i;
            if (vx4Var2.j) {
                xm3 xm3Var = this.b.U;
                boolean z3 = xm3Var != null ? xm3Var.w0 : false;
                int i14 = vx4Var2.g - vx4Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((v7l) arrayList.get(i15)).b.h0 != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (((v7l) arrayList.get(i17)).b.h0 != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (i18 < 2) {
                    f = 0.0f;
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < size) {
                        v7l v7lVar = (v7l) arrayList.get(i19);
                        wm3 wm3Var = v7lVar.b;
                        boolean z4 = z3;
                        if (wm3Var.h0 == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += v7lVar.h.f;
                            }
                            b35 b35Var = v7lVar.e;
                            int i22 = b35Var.g;
                            i12 = i18;
                            boolean z5 = v7lVar.d != 3;
                            if (z5) {
                                int i23 = this.f;
                                if (i23 == 0 && !wm3Var.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !wm3Var.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (v7lVar.a == 1 && i12 == 0) {
                                    i13 = b35Var.m;
                                    i20++;
                                } else if (b35Var.j) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = wm3Var.l0[this.f];
                                    if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -v7lVar.i.f;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 < i16) {
                                i5 += -v7lVar.i.f;
                            }
                        }
                        i19++;
                        z3 = z4;
                        i18 = i12;
                        i2 = 8;
                    }
                    z = z3;
                    int i24 = i18;
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    } else {
                        i18 = i24 + 1;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i25 = vx4Var.g;
                if (z) {
                    i25 = vx4Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i14) {
                    i25 = z ? i25 + ((int) (((i5 - i14) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i14) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i14 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        v7l v7lVar2 = (v7l) arrayList.get(i27);
                        int i29 = i25;
                        wm3 wm3Var2 = v7lVar2.b;
                        int i30 = i3;
                        b35 b35Var2 = v7lVar2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (wm3Var2.h0 == 8 || v7lVar2.d != 3 || b35Var2.j) {
                            i11 = i27;
                        } else {
                            int i32 = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (((wm3Var2.l0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = wm3Var2.w;
                                i10 = wm3Var2.v;
                            } else {
                                i9 = wm3Var2.z;
                                i10 = wm3Var2.y;
                            }
                            i11 = i27;
                            int max = Math.max(i10, v7lVar2.a == 1 ? Math.min(i32, b35Var2.m) : i32);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i32) {
                                i28++;
                                i32 = max;
                            }
                            b35Var2.d(i32);
                        }
                        i27 = i11 + 1;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            v7l v7lVar3 = (v7l) arrayList.get(i34);
                            if (v7lVar3.b.h0 != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += v7lVar3.h.f;
                                }
                                i5 += v7lVar3.e.g;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -v7lVar3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i28 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i14) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        v7l v7lVar4 = (v7l) arrayList.get(z ? size - (i38 + 1) : i38);
                        wm3 wm3Var3 = v7lVar4.b;
                        vx4 vx4Var3 = v7lVar4.i;
                        vx4 vx4Var4 = v7lVar4.h;
                        if (wm3Var3.h0 == 8) {
                            vx4Var4.d(i37);
                            vx4Var3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - vx4Var4.f : i37 + vx4Var4.f;
                            }
                            if (z) {
                                vx4Var3.d(i37);
                            } else {
                                vx4Var4.d(i37);
                            }
                            b35 b35Var3 = v7lVar4.e;
                            int i39 = b35Var3.g;
                            if (v7lVar4.d == 3 && v7lVar4.a == 1) {
                                i39 = b35Var3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                vx4Var4.d(i37);
                            } else {
                                vx4Var3.d(i37);
                            }
                            v7lVar4.g = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-vx4Var3.f) : i37 + (-vx4Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        v7l v7lVar5 = (v7l) arrayList.get(z ? size - (i42 + 1) : i42);
                        wm3 wm3Var4 = v7lVar5.b;
                        vx4 vx4Var5 = v7lVar5.i;
                        vx4 vx4Var6 = v7lVar5.h;
                        if (wm3Var4.h0 == 8) {
                            vx4Var6.d(i41);
                            vx4Var5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - vx4Var6.f : i43 + vx4Var6.f;
                            }
                            if (z) {
                                vx4Var5.d(i43);
                            } else {
                                vx4Var6.d(i43);
                            }
                            b35 b35Var4 = v7lVar5.e;
                            int i44 = b35Var4.g;
                            if (v7lVar5.d == 3 && v7lVar5.a == 1) {
                                i44 = Math.min(i44, b35Var4.m);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                vx4Var6.d(i41);
                            } else {
                                vx4Var5.d(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-vx4Var5.f) : i41 + (-vx4Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.f;
                    wm3 wm3Var5 = this.b;
                    float f8 = i45 == 0 ? wm3Var5.e0 : wm3Var5.f0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i46 = (int) (((i14 - i5) * f8) + f2);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        v7l v7lVar6 = (v7l) arrayList.get(z ? size - (i48 + 1) : i48);
                        wm3 wm3Var6 = v7lVar6.b;
                        vx4 vx4Var7 = v7lVar6.i;
                        vx4 vx4Var8 = v7lVar6.h;
                        if (wm3Var6.h0 == 8) {
                            vx4Var8.d(i47);
                            vx4Var7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i15) {
                                i47 = z ? i47 - vx4Var8.f : i47 + vx4Var8.f;
                            }
                            if (z) {
                                vx4Var7.d(i47);
                            } else {
                                vx4Var8.d(i47);
                            }
                            b35 b35Var5 = v7lVar6.e;
                            int i49 = b35Var5.g;
                            if (v7lVar6.d == 3 && v7lVar6.a == 1) {
                                i49 = b35Var5.m;
                            }
                            i47 += i49;
                            if (z) {
                                vx4Var8.d(i47);
                            } else {
                                vx4Var7.d(i47);
                            }
                            if (i48 < i16 && i48 < i) {
                                i47 = z ? i47 - (-vx4Var7.f) : i47 + (-vx4Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.v7l
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((v7l) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        wm3 wm3Var = ((v7l) arrayList.get(0)).b;
        wm3 wm3Var2 = ((v7l) arrayList.get(size - 1)).b;
        int i = this.f;
        vx4 vx4Var = this.i;
        vx4 vx4Var2 = this.h;
        if (i == 0) {
            nl3 nl3Var = wm3Var.J;
            nl3 nl3Var2 = wm3Var2.L;
            vx4 i2 = v7l.i(nl3Var, 0);
            int e = nl3Var.e();
            wm3 m = m();
            if (m != null) {
                e = m.J.e();
            }
            if (i2 != null) {
                v7l.b(vx4Var2, i2, e);
            }
            vx4 i3 = v7l.i(nl3Var2, 0);
            int e2 = nl3Var2.e();
            wm3 n = n();
            if (n != null) {
                e2 = n.L.e();
            }
            if (i3 != null) {
                v7l.b(vx4Var, i3, -e2);
            }
        } else {
            nl3 nl3Var3 = wm3Var.K;
            nl3 nl3Var4 = wm3Var2.M;
            vx4 i4 = v7l.i(nl3Var3, 1);
            int e3 = nl3Var3.e();
            wm3 m2 = m();
            if (m2 != null) {
                e3 = m2.K.e();
            }
            if (i4 != null) {
                v7l.b(vx4Var2, i4, e3);
            }
            vx4 i5 = v7l.i(nl3Var4, 1);
            int e4 = nl3Var4.e();
            wm3 n2 = n();
            if (n2 != null) {
                e4 = n2.M.e();
            }
            if (i5 != null) {
                v7l.b(vx4Var, i5, -e4);
            }
        }
        vx4Var2.a = this;
        vx4Var.a = this;
    }

    @Override // defpackage.v7l
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((v7l) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.v7l
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((v7l) it.next()).f();
        }
    }

    @Override // defpackage.v7l
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((v7l) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.v7l
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((v7l) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final wm3 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            wm3 wm3Var = ((v7l) arrayList.get(i)).b;
            if (wm3Var.h0 != 8) {
                return wm3Var;
            }
            i++;
        }
    }

    public final wm3 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wm3 wm3Var = ((v7l) arrayList.get(size)).b;
            if (wm3Var.h0 != 8) {
                return wm3Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            v7l v7lVar = (v7l) it.next();
            sb.append("<");
            sb.append(v7lVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
