package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class rz0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sz0 sz0Var, xtc xtcVar, int i, int i2, boolean z, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        xtc xtcVar3;
        int i11;
        int i12;
        boolean z3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(760585709);
        int i13 = (av8Var.g(sz0Var) ? 4 : 2) | i3;
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 = i13 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i13 | (av8Var.g(xtcVar2) ? 32 : 16);
        }
        int i15 = i4 & 4;
        if (i15 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 = i;
            i5 |= av8Var.e(i6) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i7 = i4 & 8;
            if (i7 == 0) {
                i9 = i5 | 3072;
                i8 = i2;
            } else {
                i8 = i2;
                i9 = i5 | (av8Var.e(i8) ? a.o : 1024);
            }
            i10 = i4 & 16;
            if (i10 == 0) {
                i9 |= 24576;
            } else if ((i3 & 24576) == 0) {
                z2 = z;
                i9 |= av8Var.h(z2) ? 16384 : 8192;
                int i16 = 1;
                if (av8Var.T(i9 & 1, (i9 & 9363) != 9362)) {
                    utc utcVar = utc.a;
                    if (i14 != 0) {
                        xtcVar2 = utcVar;
                    }
                    int i17 = i15 != 0 ? 8 : i6;
                    int i18 = i7 != 0 ? 0 : i8;
                    boolean z4 = i10 != 0 ? false : z2;
                    if (((Boolean) av8Var.k(f5a.a)).booleanValue()) {
                        av8Var.d0(-1637562219);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1638245676);
                        xtc g = bkh.g(bkh.d(xtcVar2, 1.0f), i18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        if (z4) {
                            g = g.z(gz8.x(utcVar, null, null, 3));
                        }
                        ry ryVar = ry.v;
                        boolean z5 = ((i9 & 14) == 4) | ((i9 & 896) == 256);
                        Object O = av8Var.O();
                        if (z5 || O == nf3.a) {
                            O = new tj(i17, sz0Var, i16);
                            av8Var.n0(O);
                        }
                        td4.b((Function1) O, g, ryVar, null, null, av8Var, 0, 24);
                        av8Var.s(false);
                    }
                    i11 = i17;
                    xtcVar3 = xtcVar2;
                    i12 = i18;
                    z3 = z4;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    i11 = i6;
                    i12 = i8;
                    z3 = z2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new qz0(sz0Var, xtcVar3, i11, i12, z3, i3, i4);
                    return;
                }
                return;
            }
            z2 = z;
            int i162 = 1;
            if (av8Var.T(i9 & 1, (i9 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        i6 = i;
        i7 = i4 & 8;
        if (i7 == 0) {
        }
        i10 = i4 & 16;
        if (i10 == 0) {
        }
        z2 = z;
        int i1622 = 1;
        if (av8Var.T(i9 & 1, (i9 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }
}
