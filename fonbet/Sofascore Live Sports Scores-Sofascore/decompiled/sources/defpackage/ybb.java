package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ybb implements yv0 {
    public final hv9 a;
    public final int b;

    public ybb(int i, vvf vvfVar) {
        this.b = i;
        this.a = vvfVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ybb b(int i, nkk nkkVar) {
        yv0 kgiVar;
        String str;
        int i2;
        int i3 = 4;
        yqo.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = nkkVar.c;
        int i5 = 0;
        int i6 = -2;
        int i7 = 0;
        while (nkkVar.c() > 8) {
            int h = nkkVar.h();
            int h2 = nkkVar.b + nkkVar.h();
            nkkVar.D(h2);
            if (h != 1414744396) {
                gw0 gw0Var = null;
                switch (h) {
                    case 1718776947:
                        if (i6 == 2) {
                            nkkVar.F(i3);
                            int h3 = nkkVar.h();
                            int h4 = nkkVar.h();
                            nkkVar.F(i3);
                            switch (nkkVar.h()) {
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
                                pm8 pm8Var = new pm8();
                                pm8Var.p = h3;
                                pm8Var.q = h4;
                                pm8Var.k = str;
                                kgiVar = new kgi(new sm8(pm8Var));
                                break;
                            } else {
                                m6k.f0();
                                kgiVar = gw0Var;
                                break;
                            }
                        } else {
                            if (i6 == 1) {
                                int l = nkkVar.l();
                                String str2 = l != 1 ? l != 85 ? l != 255 ? l != 8192 ? l != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
                                if (str2 != null) {
                                    int l2 = nkkVar.l();
                                    int h5 = nkkVar.h();
                                    nkkVar.F(6);
                                    int o = lik.o(nkkVar.x());
                                    int l3 = nkkVar.l();
                                    byte[] bArr = new byte[l3];
                                    nkkVar.e(bArr, i5, l3);
                                    pm8 pm8Var2 = new pm8();
                                    pm8Var2.k = str2;
                                    pm8Var2.x = l2;
                                    pm8Var2.y = h5;
                                    if (MimeTypes.AUDIO_RAW.equals(str2) && o != 0) {
                                        pm8Var2.z = o;
                                    }
                                    if (MimeTypes.AUDIO_AAC.equals(str2) && l3 > 0) {
                                        pm8Var2.m = hv9.z(bArr);
                                    }
                                    kgiVar = new kgi(new sm8(pm8Var2));
                                    break;
                                } else {
                                    m6k.f0();
                                }
                            } else {
                                "Ignoring strf box for unsupported track type: ".concat(lik.t(i6));
                                m6k.f0();
                            }
                            kgiVar = gw0Var;
                        }
                    case 1751742049:
                        int h6 = nkkVar.h();
                        nkkVar.F(8);
                        int h7 = nkkVar.h();
                        int h8 = nkkVar.h();
                        nkkVar.F(i3);
                        nkkVar.h();
                        nkkVar.F(12);
                        kgiVar = new ew0(h6, h7, h8);
                        break;
                    case 1752331379:
                        int h9 = nkkVar.h();
                        nkkVar.F(12);
                        nkkVar.h();
                        int h10 = nkkVar.h();
                        int h11 = nkkVar.h();
                        nkkVar.F(i3);
                        int h12 = nkkVar.h();
                        int h13 = nkkVar.h();
                        nkkVar.F(8);
                        gw0Var = new gw0(h9, h10, h11, h12, h13);
                        kgiVar = gw0Var;
                        break;
                    case 1852994675:
                        kgiVar = new ogi(nkkVar.q(nkkVar.c(), xp2.c));
                        break;
                    default:
                        kgiVar = gw0Var;
                        break;
                }
            } else {
                kgiVar = b(nkkVar.h(), nkkVar);
            }
            if (kgiVar != null) {
                if (kgiVar.getType() == 1752331379) {
                    int i8 = ((gw0) kgiVar).a;
                    if (i8 == 1935960438) {
                        i6 = 2;
                    } else if (i8 != 1935963489) {
                        if (i8 != 1937012852) {
                            Integer.toHexString(i8);
                            m6k.f0();
                            i2 = -1;
                        } else {
                            i2 = 3;
                        }
                        i6 = i2;
                    } else {
                        i6 = 1;
                    }
                }
                int i9 = i7 + 1;
                int b = vu9.b(objArr.length, i9);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i7] = kgiVar;
                i7 = i9;
            }
            nkkVar.E(h2);
            nkkVar.D(i4);
            i3 = 4;
            i5 = 0;
        }
        return new ybb(i, hv9.r(i7, objArr));
    }

    public final yv0 a(Class cls) {
        av9 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            yv0 yv0Var = (yv0) listIterator.next();
            if (yv0Var.getClass() == cls) {
                return yv0Var;
            }
        }
        return null;
    }

    @Override // defpackage.yv0
    public final int getType() {
        return this.b;
    }
}
