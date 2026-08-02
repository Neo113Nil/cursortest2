package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lwk implements zli {
    public static final q74 e;
    public final j9e a = new j9e();
    public final j9e b = new j9e();
    public final kwk c;
    public Inflater d;

    static {
        av9 av9Var = hv9.b;
        e = new q74(vvf.e, C.TIME_UNSET, C.TIME_UNSET);
    }

    public lwk(List list) {
        int i;
        kwk kwkVar = new kwk(0);
        this.c = kwkVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = nik.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                kwkVar.f = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = kwkVar.f;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        tgj.e0("Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    tgj.d0("Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        kwkVar.g = Integer.parseInt(split2[0]);
                        kwkVar.h = Integer.parseInt(split2[1]);
                        kwkVar.d = true;
                    } catch (RuntimeException e3) {
                        tgj.e0("Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x00cc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028d  */
    @Override // defpackage.zli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(byte[] bArr, int i, int i2, yli yliVar, wn3 wn3Var) {
        q74 q74Var;
        boolean z;
        long j;
        boolean z2;
        int i3;
        boolean z3;
        m74 m74Var;
        long j2;
        long j3;
        vvf vvfVar;
        Rect rect;
        j9e j9eVar = this.a;
        j9eVar.L(bArr, i + i2);
        j9eVar.N(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = nik.a;
        if (j9eVar.a() > 0 && j9eVar.j() == 120) {
            j9e j9eVar2 = this.b;
            if (nik.M(j9eVar, j9eVar2, inflater)) {
                j9eVar.L(j9eVar2.a, j9eVar2.c);
            }
        }
        kwk kwkVar = this.c;
        long j4 = C.TIME_UNSET;
        kwkVar.b = C.TIME_UNSET;
        kwkVar.c = C.TIME_UNSET;
        boolean z4 = false;
        kwkVar.e = false;
        kwkVar.i = null;
        kwkVar.j = -1;
        kwkVar.k = -1;
        int a = j9eVar.a();
        if (a < 2 || j9eVar.H() != a) {
            q74Var = e;
        } else {
            if (kwkVar.f == null) {
                tgj.d0("Skipping SPU (no palette)");
            } else if (kwkVar.d) {
                int i4 = j9eVar.b - 2;
                j9eVar.N(j9eVar.H() + i4);
                while (true) {
                    if (j9eVar.a() < 4) {
                        j = j4;
                        z2 = z4;
                        z = z2;
                        i3 = 3;
                    } else {
                        int i5 = j9eVar.b;
                        int H = j9eVar.H() * 10000;
                        int H2 = j9eVar.H() + i4;
                        z = (H2 == i5 || H2 >= j9eVar.c) ? z4 : true;
                        int i6 = z ? H2 : j9eVar.c;
                        j = j4;
                        boolean z5 = true;
                        while (j9eVar.b < i6 && z5) {
                            long j5 = H;
                            int[] iArr = kwkVar.a;
                            boolean z6 = z4;
                            int A = j9eVar.A();
                            if (A != 255) {
                                switch (A) {
                                    case 0:
                                        z3 = true;
                                        break;
                                    case 1:
                                        kwkVar.b = j5;
                                        z3 = true;
                                        break;
                                    case 2:
                                        kwkVar.c = j5;
                                        z3 = true;
                                        break;
                                    case 3:
                                        if (j9eVar.a() >= 2) {
                                            int A2 = j9eVar.A();
                                            int A3 = j9eVar.A();
                                            iArr[3] = kwk.a(A2 >> 4, kwkVar.f);
                                            iArr[2] = kwk.a(A2 & 15, kwkVar.f);
                                            iArr[1] = kwk.a(A3 >> 4, kwkVar.f);
                                            iArr[z6 ? 1 : 0] = kwk.a(A3 & 15, kwkVar.f);
                                            kwkVar.e = true;
                                            z3 = true;
                                            break;
                                        } else {
                                            tgj.d0("Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (j9eVar.a() >= 2) {
                                            if (!kwkVar.e) {
                                                tgj.d0("Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int A4 = j9eVar.A();
                                                int A5 = j9eVar.A();
                                                iArr[3] = kwk.c(iArr[3], A4 >> 4);
                                                iArr[2] = kwk.c(iArr[2], A4 & 15);
                                                iArr[1] = kwk.c(iArr[1], A5 >> 4);
                                                iArr[z6 ? 1 : 0] = kwk.c(iArr[z6 ? 1 : 0], A5 & 15);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            tgj.d0("Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (j9eVar.a() >= 6) {
                                            int A6 = j9eVar.A();
                                            int A7 = j9eVar.A();
                                            int i7 = (A6 << 4) | (A7 >> 4);
                                            int A8 = ((A7 & 15) << 8) | j9eVar.A();
                                            int A9 = j9eVar.A();
                                            int A10 = j9eVar.A();
                                            kwkVar.i = new Rect(i7, (A9 << 4) | (A10 >> 4), A8 + 1, (((A10 & 15) << 8) | j9eVar.A()) + 1);
                                            z3 = true;
                                            break;
                                        } else {
                                            tgj.d0("Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (j9eVar.a() >= 4) {
                                            kwkVar.j = j9eVar.H();
                                            kwkVar.k = j9eVar.H();
                                            z3 = true;
                                            break;
                                        } else {
                                            tgj.d0("Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        fn0.r(A, "Unrecognized command: ");
                                        break;
                                }
                                z4 = z6 ? 1 : 0;
                                z5 = z3;
                            }
                            z3 = z6 ? 1 : 0;
                            z4 = z6 ? 1 : 0;
                            z5 = z3;
                        }
                        z2 = z4;
                        i3 = 3;
                        if (z) {
                            j9eVar.N(H2);
                        }
                    }
                    if (z) {
                        j4 = j;
                        z4 = z2;
                    } else {
                        if (kwkVar.f != null || !kwkVar.d || !kwkVar.e || (rect = kwkVar.i) == null || kwkVar.j == -1 || kwkVar.k == -1 || rect.width() < 2 || kwkVar.i.height() < 2) {
                            m74Var = null;
                        } else {
                            Rect rect2 = kwkVar.i;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            nm2 nm2Var = new nm2(i3);
                            j9eVar.N(kwkVar.j);
                            nm2Var.o(j9eVar);
                            kwkVar.b(nm2Var, true, rect2, iArr2);
                            j9eVar.N(kwkVar.k);
                            nm2Var.o(j9eVar);
                            kwkVar.b(nm2Var, z2, rect2, iArr2);
                            m74Var = new m74(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / kwkVar.h, 0, 0, rect2.left / kwkVar.g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / kwkVar.g, rect2.height() / kwkVar.h, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        }
                        j2 = kwkVar.c;
                        if (j2 == j) {
                            long j6 = kwkVar.b;
                            if (j6 != j && j2 > j6) {
                                j2 -= j6;
                            }
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        if (m74Var == null) {
                            vvfVar = hv9.z(m74Var);
                        } else {
                            av9 av9Var = hv9.b;
                            vvfVar = vvf.e;
                        }
                        q74Var = new q74(vvfVar, kwkVar.b, j3);
                    }
                }
            } else {
                tgj.d0("Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            z2 = false;
            i3 = 3;
            if (kwkVar.f != null) {
            }
            m74Var = null;
            j2 = kwkVar.c;
            if (j2 == j) {
            }
            if (m74Var == null) {
            }
            q74Var = new q74(vvfVar, kwkVar.b, j3);
        }
        wn3Var.accept(q74Var);
    }

    @Override // defpackage.zli
    public final int l() {
        return 2;
    }
}
