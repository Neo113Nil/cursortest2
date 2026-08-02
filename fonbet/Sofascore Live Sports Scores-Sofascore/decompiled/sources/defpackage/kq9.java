package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class kq9 {
    public static final xtc a = bkh.l(utc.a, qlh.c);

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r7 & 4294967295L))) != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(d7e d7eVar, String str, xtc xtcVar, long j, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        xtc xtcVar4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2142239481);
        if ((i & 6) == 0) {
            i3 = (av8Var.i(d7eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i & 3072) == 0) {
                i3 |= av8Var.f(j) ? 2048 : 1024;
            }
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                av8Var.Y();
                int i5 = i & 1;
                xtc xtcVar5 = utc.a;
                if (i5 != 0 && !av8Var.B()) {
                    av8Var.W();
                } else if (i4 != 0) {
                    xtcVar2 = xtcVar5;
                }
                xtcVar3 = xtcVar2;
                av8Var.t();
                boolean z = (((i3 & 7168) ^ 3072) > 2048 && av8Var.f(j)) || (i3 & 3072) == 2048;
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (z || O == a99Var) {
                    O = e8k.a(j, r13.i) ? null : new ay1(j, 5);
                    av8Var.n0(O);
                }
                ay1 ay1Var = (ay1) O;
                if (str != null) {
                    av8Var.d0(-536990979);
                    boolean z2 = (i3 & 112) == 32;
                    Object O2 = av8Var.O();
                    if (z2 || O2 == a99Var) {
                        O2 = new jp1(str, 19);
                        av8Var.n0(O2);
                    }
                    xtcVar4 = o3h.a(xtcVar5, false, (Function1) O2);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-536832197);
                    av8Var.s(false);
                    xtcVar4 = xtcVar5;
                }
                if (!njh.c(d7eVar.i(), 9205357640488583168L)) {
                    long i6 = d7eVar.i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (i6 >> 32)))) {
                    }
                    e12.a(0, av8Var, fz8.Z(xtcVar3.z(xtcVar5), d7eVar, null, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var, 22).z(xtcVar4));
                }
                xtcVar5 = a;
                e12.a(0, av8Var, fz8.Z(xtcVar3.z(xtcVar5), d7eVar, null, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var, 22).z(xtcVar4));
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new iq9(d7eVar, str, xtcVar3, j, i, i2, 1);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i & 3072) == 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ImageVector imageVector, String str, xtc xtcVar, long j, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        long j2;
        long j3;
        xtc xtcVar3;
        eqf u;
        xtc xtcVar4;
        long j4;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-126890956);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (av8Var.f(j2)) {
                        i4 = a.o;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                av8Var.W();
                j3 = j2;
                xtcVar3 = xtcVar2;
            } else {
                av8Var.Y();
                if ((i & 1) == 0 || av8Var.B()) {
                    xtc xtcVar5 = i5 != 0 ? utc.a : xtcVar2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xtcVar4 = xtcVar5;
                        j4 = ((r13) av8Var.k(lo3.a)).a;
                        av8Var.t();
                        a(o6a.J(imageVector, av8Var), str, xtcVar4, j4, av8Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                        xtcVar3 = xtcVar4;
                        j3 = j4;
                    } else {
                        xtcVar4 = xtcVar5;
                    }
                } else {
                    av8Var.W();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    xtcVar4 = xtcVar2;
                }
                j4 = j2;
                av8Var.t();
                a(o6a.J(imageVector, av8Var), str, xtcVar4, j4, av8Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                xtcVar3 = xtcVar4;
                j3 = j4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new iq9(imageVector, str, xtcVar3, j3, i, i2, 0);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i & 3072) != 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }
}
