package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zbb implements zv0 {
    public final hv9 a;
    public final int b;

    public zbb(int i, vvf vvfVar) {
        this.b = i;
        this.a = vvfVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zbb b(int i, j9e j9eVar) {
        zv0 lgiVar;
        String str;
        int i2 = 4;
        yqo.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = j9eVar.c;
        int i4 = -2;
        int i5 = 0;
        while (j9eVar.a() > 8) {
            int o = j9eVar.o();
            int o2 = j9eVar.b + j9eVar.o();
            j9eVar.M(o2);
            if (o != 1414744396) {
                hw0 hw0Var = null;
                switch (o) {
                    case 1718776947:
                        if (i4 == 2) {
                            j9eVar.O(i2);
                            int o3 = j9eVar.o();
                            int o4 = j9eVar.o();
                            j9eVar.O(i2);
                            int o5 = j9eVar.o();
                            switch (o5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                qm8 qm8Var = new qm8();
                                qm8Var.u = o3;
                                qm8Var.v = o4;
                                qm8Var.n = sjc.p(str);
                                lgiVar = new lgi(new b(qm8Var));
                                break;
                            } else {
                                fn0.r(o5, "Ignoring track with unsupported compression ");
                                lgiVar = hw0Var;
                                break;
                            }
                        } else {
                            if (i4 == 1) {
                                int t = j9eVar.t();
                                String str2 = t != 1 ? t != 85 ? t != 255 ? t != 8192 ? t != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
                                if (str2 != null) {
                                    int t2 = j9eVar.t();
                                    int o6 = j9eVar.o();
                                    j9eVar.O(6);
                                    int t3 = j9eVar.t();
                                    String str3 = nik.a;
                                    int E = nik.E(t3, ByteOrder.LITTLE_ENDIAN);
                                    int t4 = j9eVar.a() > 0 ? j9eVar.t() : 0;
                                    qm8 qm8Var2 = new qm8();
                                    qm8Var2.n = sjc.p(str2);
                                    qm8Var2.F = t2;
                                    qm8Var2.G = o6;
                                    if (str2.equals(MimeTypes.AUDIO_RAW) && E != 0) {
                                        qm8Var2.H = E;
                                    }
                                    if (str2.equals(MimeTypes.AUDIO_AAC) && t4 > 0) {
                                        byte[] bArr = new byte[t4];
                                        j9eVar.k(bArr, 0, t4);
                                        qm8Var2.q = hv9.z(bArr);
                                    }
                                    lgiVar = new lgi(new b(qm8Var2));
                                    break;
                                } else {
                                    fn0.r(t, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                tgj.d0("Ignoring strf box for unsupported track type: ".concat(nik.J(i4)));
                            }
                            lgiVar = hw0Var;
                        }
                    case 1751742049:
                        int o7 = j9eVar.o();
                        j9eVar.O(8);
                        int o8 = j9eVar.o();
                        int o9 = j9eVar.o();
                        j9eVar.O(i2);
                        j9eVar.o();
                        j9eVar.O(12);
                        lgiVar = new fw0(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = j9eVar.o();
                        j9eVar.O(12);
                        j9eVar.o();
                        int o11 = j9eVar.o();
                        int o12 = j9eVar.o();
                        j9eVar.O(i2);
                        int o13 = j9eVar.o();
                        int o14 = j9eVar.o();
                        j9eVar.O(i2);
                        hw0Var = new hw0(o10, o11, o12, o13, o14, j9eVar.o());
                        lgiVar = hw0Var;
                        break;
                    case 1852994675:
                        lgiVar = new pgi(j9eVar.y(j9eVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        lgiVar = hw0Var;
                        break;
                }
            } else {
                lgiVar = b(j9eVar.o(), j9eVar);
            }
            if (lgiVar != null) {
                if (lgiVar.getType() == 1752331379) {
                    i4 = ((hw0) lgiVar).a();
                }
                int i6 = i5 + 1;
                int b = vu9.b(objArr.length, i6);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i5] = lgiVar;
                i5 = i6;
            }
            j9eVar.N(o2);
            j9eVar.M(i3);
            i2 = 4;
        }
        return new zbb(i, hv9.r(i5, objArr));
    }

    public final zv0 a(Class cls) {
        av9 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            zv0 zv0Var = (zv0) listIterator.next();
            if (zv0Var.getClass() == cls) {
                return zv0Var;
            }
        }
        return null;
    }

    @Override // defpackage.zv0
    public final int getType() {
        return this.b;
    }
}
