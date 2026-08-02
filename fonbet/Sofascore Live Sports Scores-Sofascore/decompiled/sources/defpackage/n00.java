package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n00 implements myd {
    public final kx4 a;
    public long b = 9205357640488583168L;
    public final mg5 c;
    public final e1d d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final bw4 i;

    public n00(Context context, kx4 kx4Var, long j, t3e t3eVar) {
        this.a = kx4Var;
        mg5 mg5Var = new mg5(context, hkg.s0(j));
        this.c = mg5Var;
        this.d = e.e(Unit.a, f7a.k);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        m00 m00Var = new m00(this, 0);
        fze fzeVar = koi.a;
        ooi ooiVar = new ooi(null, null, m00Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new jhi(ooiVar, this, mg5Var) : new h09(ooiVar, this, mg5Var, t3eVar);
    }

    @Override // defpackage.myd
    public final xv4 a() {
        return this.i;
    }

    @Override // defpackage.myd
    public final boolean b() {
        mg5 mg5Var = this.c;
        EdgeEffect edgeEffect = mg5Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? qz.l(edgeEffect) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = mg5Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? qz.l(edgeEffect2) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = mg5Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? qz.l(edgeEffect3) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = mg5Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? qz.l(edgeEffect4) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        if (r20.invoke(r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.myd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, Function2 function2, rq3 rq3Var) {
        k00 k00Var;
        int i;
        long d;
        if (rq3Var instanceof k00) {
            k00Var = (k00) rq3Var;
            int i2 = k00Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k00Var.u = i2 - Integer.MIN_VALUE;
                Object obj = k00Var.s;
                Object obj2 = lu3.a;
                i = k00Var.u;
                mg5 mg5Var = this.c;
                if (i != 0) {
                    y6a.M(obj);
                    if (njh.g(this.g)) {
                        Object vmkVar = new vmk(j);
                        k00Var.u = 1;
                    } else {
                        boolean g = mg5.g(mg5Var.f);
                        kx4 kx4Var = this.a;
                        long i3 = t6a.i((!g || vmk.b(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (!mg5.g(mg5Var.g) || vmk.b(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : -n4o.t(mg5Var.d(), -vmk.b(j), Float.intBitsToFloat((int) (this.g >> 32)), kx4Var) : n4o.t(mg5Var.c(), vmk.b(j), Float.intBitsToFloat((int) (this.g >> 32)), kx4Var), (!mg5.g(mg5Var.d) || vmk.c(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (!mg5.g(mg5Var.e) || vmk.c(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : -n4o.t(mg5Var.b(), -vmk.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), kx4Var) : n4o.t(mg5Var.e(), vmk.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), kx4Var));
                        if (i3 != 0) {
                            g();
                        }
                        d = vmk.d(j, i3);
                        Object vmkVar2 = new vmk(d);
                        k00Var.r = d;
                        k00Var.u = 2;
                        obj = function2.invoke(vmkVar2, k00Var);
                    }
                    return obj2;
                }
                if (i == 1) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d = k00Var.r;
                y6a.M(obj);
                long d2 = vmk.d(d, ((vmk) obj).a);
                this.f = false;
                if (vmk.b(d2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect c = mg5Var.c();
                    int b = wzb.b(vmk.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c.onAbsorb(b);
                    } else if (c.isFinished()) {
                        c.onAbsorb(b);
                    }
                } else if (vmk.b(d2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect d3 = mg5Var.d();
                    int i4 = -wzb.b(vmk.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d3.onAbsorb(i4);
                    } else if (d3.isFinished()) {
                        d3.onAbsorb(i4);
                    }
                }
                if (vmk.c(d2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect e = mg5Var.e();
                    int b2 = wzb.b(vmk.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e.onAbsorb(b2);
                    } else if (e.isFinished()) {
                        e.onAbsorb(b2);
                    }
                } else if (vmk.c(d2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect b3 = mg5Var.b();
                    int i5 = -wzb.b(vmk.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b3.onAbsorb(i5);
                    } else if (b3.isFinished()) {
                        b3.onAbsorb(i5);
                    }
                }
                e();
                return Unit.a;
            }
        }
        k00Var = new k00(this, (sq3) rq3Var);
        Object obj3 = k00Var.s;
        Object obj22 = lu3.a;
        i = k00Var.u;
        mg5 mg5Var2 = this.c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    @Override // defpackage.myd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(int i, long j, Function1 function1) {
        long j2;
        float intBitsToFloat;
        int i2;
        float j3;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long h;
        boolean z;
        boolean z2;
        long j4;
        float f;
        float f2;
        boolean z3;
        int i3;
        boolean z4;
        if (njh.g(this.g)) {
            return ((dnd) function1.invoke(new dnd(j))).a;
        }
        boolean z5 = this.f;
        boolean z6 = true;
        mg5 mg5Var = this.c;
        if (!z5) {
            if (mg5.g(mg5Var.f)) {
                i(0L);
            }
            if (mg5.g(mg5Var.g)) {
                j(0L);
            }
            if (mg5.g(mg5Var.d)) {
                k(0L);
            }
            if (mg5.g(mg5Var.e)) {
                h(0L);
            }
            this.f = true;
        }
        int i4 = v10.a;
        float f3 = i == 2 ? 4.0f : 1.0f;
        long j5 = dnd.j(j, f3);
        int i5 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i5) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (!mg5.g(mg5Var.d) || Float.intBitsToFloat(i5) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                j2 = 4294967295L;
                if (mg5.g(mg5Var.e) && Float.intBitsToFloat(i5) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float h2 = h(j5);
                    if (!mg5.g(mg5Var.e)) {
                        mg5Var.b().finish();
                    }
                    intBitsToFloat = h2 == Float.intBitsToFloat((int) (j5 & 4294967295L)) ? Float.intBitsToFloat(i5) : h2 / f3;
                }
            } else {
                float k = k(j5);
                j2 = 4294967295L;
                if (!mg5.g(mg5Var.d)) {
                    mg5Var.e().finish();
                }
                intBitsToFloat = k == Float.intBitsToFloat((int) (j5 & 4294967295L)) ? Float.intBitsToFloat(i5) : k / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (mg5.g(mg5Var.f) && Float.intBitsToFloat(i2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    j3 = i(j5);
                    if (!mg5.g(mg5Var.f)) {
                        mg5Var.c().finish();
                    }
                    if (j3 == Float.intBitsToFloat((int) (j5 >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = j3 / f3;
                } else if (mg5.g(mg5Var.g) && Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    j3 = j(j5);
                    if (!mg5.g(mg5Var.g)) {
                        mg5Var.d().finish();
                    }
                    if (j3 == Float.intBitsToFloat((int) (j5 >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = j3 / f3;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
                if (!dnd.c(floatToRawIntBits, 0L)) {
                    g();
                }
                h = dnd.h(j, floatToRawIntBits);
                long j6 = ((dnd) function1.invoke(new dnd(h))).a;
                long h3 = dnd.h(h, j6);
                if ((Float.intBitsToFloat((int) (h >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (h & j2)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((Float.intBitsToFloat((int) (j6 >> 32)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (j6 & j2)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (mg5.g(mg5Var.f) || mg5.g(mg5Var.d) || mg5.g(mg5Var.g) || mg5.g(mg5Var.e)))) {
                    e();
                }
                if (i == 1) {
                    int i6 = (int) (h3 >> 32);
                    if (Float.intBitsToFloat(i6) > 0.5f) {
                        j4 = h3;
                        i(j4);
                    } else {
                        j4 = h3;
                        if (Float.intBitsToFloat(i6) >= -0.5f) {
                            f = 0.5f;
                            f2 = -0.5f;
                            z3 = false;
                            i3 = (int) (j4 & j2);
                            if (Float.intBitsToFloat(i3) <= f) {
                                k(j4);
                            } else if (Float.intBitsToFloat(i3) < f2) {
                                h(j4);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (!dnd.c(h, 0L)) {
                                        if (!mg5.f(mg5Var.f) || Float.intBitsToFloat(i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            z2 = false;
                                        } else {
                                            EdgeEffect c = mg5Var.c();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i2);
                                            if (c instanceof g09) {
                                                g09 g09Var = (g09) c;
                                                float f4 = g09Var.b + intBitsToFloat3;
                                                g09Var.b = f4;
                                                if (Math.abs(f4) > g09Var.a) {
                                                    g09Var.onRelease();
                                                }
                                            } else {
                                                c.onRelease();
                                            }
                                            z2 = mg5.f(mg5Var.f);
                                        }
                                        if (mg5.f(mg5Var.g) && Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            EdgeEffect d = mg5Var.d();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i2);
                                            if (d instanceof g09) {
                                                g09 g09Var2 = (g09) d;
                                                float f5 = g09Var2.b + intBitsToFloat4;
                                                g09Var2.b = f5;
                                                if (Math.abs(f5) > g09Var2.a) {
                                                    g09Var2.onRelease();
                                                }
                                            } else {
                                                d.onRelease();
                                            }
                                            z2 = z2 || mg5.f(mg5Var.g);
                                        }
                                        if (mg5.f(mg5Var.d) && Float.intBitsToFloat(i5) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            EdgeEffect e = mg5Var.e();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i5);
                                            if (e instanceof g09) {
                                                g09 g09Var3 = (g09) e;
                                                float f6 = g09Var3.b + intBitsToFloat5;
                                                g09Var3.b = f6;
                                                if (Math.abs(f6) > g09Var3.a) {
                                                    g09Var3.onRelease();
                                                }
                                            } else {
                                                e.onRelease();
                                            }
                                            z2 = z2 || mg5.f(mg5Var.d);
                                        }
                                        if (mg5.f(mg5Var.e) && Float.intBitsToFloat(i5) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            EdgeEffect b = mg5Var.b();
                                            float intBitsToFloat6 = Float.intBitsToFloat(i5);
                                            if (b instanceof g09) {
                                                g09 g09Var4 = (g09) b;
                                                float f7 = g09Var4.b + intBitsToFloat6;
                                                g09Var4.b = f7;
                                                if (Math.abs(f7) > g09Var4.a) {
                                                    g09Var4.onRelease();
                                                }
                                            } else {
                                                b.onRelease();
                                            }
                                            z2 = z2 || mg5.f(mg5Var.e);
                                        }
                                        if (!z2 && !z) {
                                            z6 = false;
                                        }
                                        z = z6;
                                    }
                                    if (z) {
                                        g();
                                    }
                                    return dnd.i(floatToRawIntBits, j6);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (!dnd.c(h, 0L)) {
                            }
                            if (z) {
                            }
                            return dnd.i(floatToRawIntBits, j6);
                        }
                        j(j4);
                    }
                    z3 = true;
                    f = 0.5f;
                    f2 = -0.5f;
                    i3 = (int) (j4 & j2);
                    if (Float.intBitsToFloat(i3) <= f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (!dnd.c(h, 0L)) {
                    }
                    if (z) {
                    }
                    return dnd.i(floatToRawIntBits, j6);
                }
                z = false;
                if (!dnd.c(h, 0L)) {
                }
                if (z) {
                }
                return dnd.i(floatToRawIntBits, j6);
            }
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
            if (!dnd.c(floatToRawIntBits, 0L)) {
            }
            h = dnd.h(j, floatToRawIntBits);
            long j62 = ((dnd) function1.invoke(new dnd(h))).a;
            long h32 = dnd.h(h, j62);
            if (Float.intBitsToFloat((int) (h >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            e();
            if (i == 1) {
            }
            z = false;
            if (!dnd.c(h, 0L)) {
            }
            if (z) {
            }
            return dnd.i(floatToRawIntBits, j62);
        }
        j2 = 4294967295L;
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        if (!dnd.c(floatToRawIntBits, 0L)) {
        }
        h = dnd.h(j, floatToRawIntBits);
        long j622 = ((dnd) function1.invoke(new dnd(h))).a;
        long h322 = dnd.h(h, j622);
        if (Float.intBitsToFloat((int) (h >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        e();
        if (i == 1) {
        }
        z = false;
        if (!dnd.c(h, 0L)) {
        }
        if (z) {
        }
        return dnd.i(floatToRawIntBits, j622);
    }

    public final void e() {
        boolean z;
        mg5 mg5Var = this.c;
        EdgeEffect edgeEffect = mg5Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = mg5Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = mg5Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = mg5Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            g();
        }
    }

    public final long f() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = yaa.u(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void g() {
        if (this.e) {
            ((eoh) this.d).setValue(Unit.a);
        }
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = qz.t(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i2 >= 31 ? qz.l(b) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = qz.t(c, intBitsToFloat2, f);
        } else {
            c.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? qz.l(c) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = qz.t(d, f, intBitsToFloat);
        } else {
            d.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? qz.l(d) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float k(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = qz.t(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? qz.l(e) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void l(long j) {
        boolean c = njh.c(this.g, 0L);
        boolean c2 = njh.c(j, this.g);
        this.g = j;
        if (!c2) {
            long b = (wzb.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (wzb.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
            mg5 mg5Var = this.c;
            mg5Var.c = b;
            EdgeEffect edgeEffect = mg5Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect2 = mg5Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect3 = mg5Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect4 = mg5Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect5 = mg5Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect6 = mg5Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect7 = mg5Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect8 = mg5Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & b), (int) (b >> 32));
            }
        }
        if (c || c2) {
            return;
        }
        e();
    }
}
