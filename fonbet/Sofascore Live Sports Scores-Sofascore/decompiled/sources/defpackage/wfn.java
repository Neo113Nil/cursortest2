package defpackage;

import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.BuildConfig;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wfn implements nfn {
    public final zzgxm a;
    public final int b;

    public wfn(int i, s sVar) {
        this.b = i;
        this.a = sVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static wfn a(int i, zzeu zzeuVar) {
        String str;
        nfn xfnVar;
        String str2;
        zzgxj zzgxjVar = new zzgxj();
        int i2 = zzeuVar.c;
        int i3 = -2;
        while (zzeuVar.B() > 8) {
            int c = zzeuVar.c();
            int c2 = zzeuVar.b + zzeuVar.c();
            zzeuVar.C(c2);
            if (c != 1414744396) {
                switch (c) {
                    case 1718776947:
                        if (i3 == 2) {
                            zzeuVar.E(4);
                            int c3 = zzeuVar.c();
                            int c4 = zzeuVar.c();
                            zzeuVar.E(4);
                            int c5 = zzeuVar.c();
                            switch (c5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                zzt zztVar = new zzt();
                                zztVar.u = c3;
                                zztVar.v = c4;
                                zztVar.d(str2);
                                xfnVar = new xfn(new zzv(zztVar));
                                break;
                            } else {
                                x5n.p(c5, "Ignoring track with unsupported compression ", new StringBuilder(String.valueOf(c5).length() + 44));
                                xfnVar = null;
                                break;
                            }
                        } else {
                            if (i3 == 1) {
                                int K = zzeuVar.K();
                                String str3 = K != 1 ? K != 85 ? K != 255 ? K != 8192 ? K != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
                                if (str3 != null) {
                                    int K2 = zzeuVar.K();
                                    int c6 = zzeuVar.c();
                                    zzeuVar.E(6);
                                    int b = zzfm.b(zzeuVar.K(), ByteOrder.LITTLE_ENDIAN);
                                    int K3 = zzeuVar.B() > 0 ? zzeuVar.K() : 0;
                                    zzt zztVar2 = new zzt();
                                    zztVar2.d(str3);
                                    zztVar2.G = K2;
                                    zztVar2.I = c6;
                                    if (str3.equals(MimeTypes.AUDIO_RAW) && b != 0) {
                                        zztVar2.J = b;
                                    }
                                    if (str3.equals(MimeTypes.AUDIO_AAC) && K3 > 0) {
                                        byte[] bArr = new byte[K3];
                                        zzeuVar.F(0, K3, bArr);
                                        zztVar2.q = zzgxm.t(bArr);
                                    }
                                    xfnVar = new xfn(new zzv(zztVar2));
                                    break;
                                } else {
                                    x5n.p(K, "Ignoring track with unsupported format tag ", new StringBuilder(String.valueOf(K).length() + 43));
                                }
                            } else {
                                String str4 = zzfm.a;
                                switch (i3) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = BuildConfig.FLAVOR;
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = TtmlNode.TAG_METADATA;
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                zzeh.c("Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            xfnVar = null;
                        }
                    case 1751742049:
                        int c7 = zzeuVar.c();
                        zzeuVar.E(8);
                        int c8 = zzeuVar.c();
                        int c9 = zzeuVar.c();
                        zzeuVar.E(4);
                        zzeuVar.c();
                        zzeuVar.E(12);
                        xfnVar = new tfn(c7, c8, c9);
                        break;
                    case 1752331379:
                        int c10 = zzeuVar.c();
                        zzeuVar.E(12);
                        zzeuVar.c();
                        int c11 = zzeuVar.c();
                        int c12 = zzeuVar.c();
                        zzeuVar.E(4);
                        int c13 = zzeuVar.c();
                        int c14 = zzeuVar.c();
                        zzeuVar.E(4);
                        xfnVar = new ufn(c10, c11, c12, c13, c14, zzeuVar.c());
                        break;
                    case 1852994675:
                        xfnVar = new yfn(zzeuVar.k(zzeuVar.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        xfnVar = null;
                        break;
                }
            } else {
                xfnVar = a(zzeuVar.c(), zzeuVar);
            }
            if (xfnVar != null) {
                if (xfnVar.zza() == 1752331379) {
                    i3 = ((ufn) xfnVar).a();
                }
                zzgxjVar.c(xfnVar);
            }
            zzeuVar.D(c2);
            zzeuVar.C(i2);
        }
        return new wfn(i, zzgxjVar.f());
    }

    public final nfn b(Class cls) {
        zzgxm zzgxmVar = this.a;
        int size = zzgxmVar.size();
        int i = 0;
        while (i < size) {
            nfn nfnVar = (nfn) zzgxmVar.get(i);
            i++;
            if (nfnVar.getClass() == cls) {
                return nfnVar;
            }
        }
        return null;
    }

    @Override // defpackage.nfn
    public final int zza() {
        return this.b;
    }
}
