package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class v88 {
    static {
        int i = tj6.a;
        c7k c7kVar = c7k.a;
        int i2 = rj6.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Function0 function0, xtc xtcVar, uah uahVar, long j, long j2, i88 i88Var, tc3 tc3Var, of3 of3Var, int i, int i2) {
        Function0 function02;
        int i3;
        xtc xtcVar2;
        uah uahVar2;
        long j3;
        i88 i88Var2;
        tc3 tc3Var2;
        eqf u;
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(748201188);
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (av8Var.i(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                uahVar2 = uahVar;
                i3 |= av8Var.g(uahVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            } else {
                uahVar2 = uahVar;
            }
            if ((i & 3072) == 0) {
                i3 |= av8Var.f(j) ? a.o : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    if (av8Var.f(j3)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    j3 = j2;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                j3 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    i88Var2 = i88Var;
                    if (av8Var.g(i88Var2)) {
                        i4 = 131072;
                        i3 |= i4;
                    }
                } else {
                    i88Var2 = i88Var;
                }
                i4 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i3 |= i4;
            } else {
                i88Var2 = i88Var;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= av8Var.g(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((12582912 & i) != 0) {
                tc3Var2 = tc3Var;
                i3 |= av8Var.i(tc3Var2) ? 8388608 : 4194304;
            } else {
                tc3Var2 = tc3Var;
            }
            if (av8Var.T(i3 & 1, (4793491 & i3) == 4793490)) {
                av8Var.W();
            } else {
                av8Var.Y();
                if ((i & 1) == 0 || av8Var.B()) {
                    xtc xtcVar3 = i6 != 0 ? utc.a : xtcVar2;
                    if ((i2 & 16) != 0) {
                        j3 = i23.b(j, av8Var);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        i88Var2 = new i88(em6.a, em6.d, em6.b, em6.c);
                    }
                    xtcVar2 = xtcVar3;
                } else {
                    av8Var.W();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
                av8Var.t();
                int i7 = i3;
                int i8 = i7 << 9;
                b(function02, d7k.a(sj6.a, av8Var), dm6.a, xtcVar2, uahVar2, j, j3, i88Var2, tc3Var2, av8Var, (i7 & 14) | 3456 | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (i7 >> 21) & 14);
            }
            xtc xtcVar4 = xtcVar2;
            long j4 = j3;
            i88 i88Var3 = i88Var2;
            u = av8Var.u();
            if (u == null) {
                u.d = new tw2(function0, xtcVar4, uahVar, j, j4, i88Var3, tc3Var, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if (av8Var.T(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        xtc xtcVar42 = xtcVar2;
        long j42 = j3;
        i88 i88Var32 = i88Var2;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(Function0 function0, dfj dfjVar, float f, xtc xtcVar, uah uahVar, long j, long j2, i88 i88Var, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        uah uahVar2;
        tc3 tc3Var2;
        int i4;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(121669932);
        if ((i & 6) == 0) {
            i3 = (av8Var2.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.g(dfjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.d(f) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var2.d(56.0f) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            uahVar2 = uahVar;
            i3 |= av8Var2.g(uahVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            uahVar2 = uahVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= av8Var2.f(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= av8Var2.f(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= av8Var2.g(i88Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= av8Var2.g(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            tc3Var2 = tc3Var;
            i4 = i2 | (av8Var2.i(tc3Var2) ? 4 : 2);
        } else {
            tc3Var2 = tc3Var;
            i4 = i2;
        }
        int i5 = i3;
        boolean z = true;
        if (av8Var2.T(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            av8Var2.Y();
            if ((i & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            av8Var2.d0(-282833393);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            av8Var2.s(false);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new gl7(15);
                av8Var2.n0(O2);
            }
            xtc a = o3h.a(xtcVar, false, (Function1) O2);
            float f2 = i88Var.a;
            int i6 = i5 >> 21;
            int i7 = i6 & 112;
            boolean g = av8Var2.g(wzcVar);
            Object O3 = av8Var2.O();
            if (g || O3 == a99Var) {
                O3 = new l88(i88Var.a, i88Var.b, i88Var.d, i88Var.c);
                av8Var2.n0(O3);
            }
            l88 l88Var = (l88) O3;
            boolean i8 = av8Var2.i(l88Var);
            if (((i7 ^ 48) <= 32 || !av8Var2.g(i88Var)) && (i6 & 48) != 32) {
                z = false;
            }
            boolean z2 = i8 | z;
            Object O4 = av8Var2.O();
            if (z2 || O4 == a99Var) {
                O4 = new yp7(l88Var, i88Var, (rq3) null, 9);
                av8Var2.n0(O4);
            }
            hz8.o(av8Var2, i88Var, (Function2) O4);
            boolean g2 = av8Var2.g(wzcVar) | av8Var2.i(l88Var);
            Object O5 = av8Var2.O();
            int i9 = 6;
            if (g2 || O5 == a99Var) {
                O5 = new zi7(wzcVar, l88Var, (rq3) null, i9);
                av8Var2.n0(O5);
            }
            hz8.o(av8Var2, wzcVar, (Function2) O5);
            int i10 = i5 >> 6;
            av8Var = av8Var2;
            uni.c(function0, a, false, uahVar2, j, j2, f2, ((p75) ((eoh) l88Var.e.c.b).getValue()).a, null, wzcVar, yqo.H(-1779603465, av8Var2, new u88(j2, dfjVar, f, tc3Var2)), av8Var, (i5 & 14) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 260);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s88(function0, dfjVar, f, xtcVar, uahVar, j, j2, i88Var, tc3Var, i, i2);
        }
    }
}
