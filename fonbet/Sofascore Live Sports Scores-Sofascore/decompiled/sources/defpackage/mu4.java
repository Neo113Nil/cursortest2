package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mu4 {
    public final int a;
    public final List b;

    public mu4() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e2k a(int i, fig figVar) {
        String str = (String) figVar.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new qfe(new kxc(str, figVar.b(), "video/mp2t"));
            }
            if (i == 21) {
                return new qfe(new te5(3));
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new qfe(new k59(new sx2(b(figVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new qfe(new m59(new sx2(b(figVar))));
            }
            if (i == 45) {
                return new qfe(new mxc());
            }
            if (i == 89) {
                return new qfe(new te5((List) figVar.c, 1));
            }
            if (i == 172) {
                return new qfe(new g9(str, figVar.b(), "video/mp2t", 1));
            }
            if (i == 257) {
                return new qzg(new ejg("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new qfe(new md5(str, figVar.b(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new qfe(new kl(figVar.b(), str, "video/mp2t", false));
                    case 16:
                        return new qfe(new g59(new ejg(b(figVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new qfe(new kla(str, figVar.b()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new qfe(new g9(str, figVar.b(), "video/mp2t", 0));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new qzg(new ejg(MimeTypes.APPLICATION_SCTE35));
                                    case 135:
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new qfe(new md5(str, figVar.b(), 4096));
        }
        return new qfe(new d59(new ejg(b(figVar)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(fig figVar) {
        String str;
        int i;
        List list;
        boolean c = c(32);
        List list2 = this.b;
        if (c) {
            return list2;
        }
        j9e j9eVar = new j9e((byte[]) figVar.d);
        ArrayList arrayList = list2;
        while (j9eVar.a() > 0) {
            int A = j9eVar.A();
            int A2 = j9eVar.b + j9eVar.A();
            if (A == 134) {
                arrayList = new ArrayList();
                int A3 = j9eVar.A() & 31;
                for (int i2 = 0; i2 < A3; i2++) {
                    String y = j9eVar.y(3, StandardCharsets.UTF_8);
                    int A4 = j9eVar.A();
                    boolean z = (A4 & 128) != 0;
                    if (z) {
                        i = A4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte A5 = (byte) j9eVar.A();
                    j9eVar.O(1);
                    if (z) {
                        boolean z2 = (A5 & 64) != 0;
                        byte[] bArr = wz2.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    qm8 qm8Var = new qm8();
                    qm8Var.n = sjc.p(str);
                    qm8Var.d = y;
                    qm8Var.K = i;
                    qm8Var.q = list;
                    arrayList.add(new b(qm8Var));
                }
            }
            j9eVar.N(A2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean c(int i) {
        return (this.a & i) != 0;
    }

    public /* synthetic */ mu4(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public mu4(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
