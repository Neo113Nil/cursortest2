package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class hpi {
    public static final hpi[] i = {new hpi(3, 5, 8, 8, 1, 3, 5, false), new hpi(5, 7, 10, 10, 1, 5, 7, false), new hpi(5, 7, 16, 6, 1, 5, 7, true), new hpi(8, 10, 12, 12, 1, 8, 10, false), new hpi(10, 11, 14, 6, 2, 10, 11, true), new hpi(12, 12, 14, 14, 1, 12, 12, false), new hpi(16, 14, 24, 10, 1, 16, 14, true), new hpi(18, 14, 16, 16, 1, 18, 14, false), new hpi(22, 18, 18, 18, 1, 22, 18, false), new hpi(22, 18, 16, 10, 2, 22, 18, true), new hpi(30, 20, 20, 20, 1, 30, 20, false), new hpi(32, 24, 16, 14, 2, 32, 24, true), new hpi(36, 24, 22, 22, 1, 36, 24, false), new hpi(44, 28, 24, 24, 1, 44, 28, false), new hpi(49, 28, 22, 14, 2, 49, 28, true), new hpi(62, 36, 14, 14, 4, 62, 36, false), new hpi(86, 42, 16, 16, 4, 86, 42, false), new hpi(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 48, 18, 18, 4, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 48, false), new hpi(144, 56, 20, 20, 4, 144, 56, false), new hpi(174, 68, 22, 22, 4, 174, 68, false), new hpi(204, 84, 24, 24, 4, 102, 42, false), new hpi(280, 112, 14, 14, 16, 140, 56, false), new hpi(368, 144, 16, 16, 16, 92, 36, false), new hpi(456, PsExtractor.AUDIO_STREAM, 18, 18, 16, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 48, false), new hpi(576, 224, 20, 20, 16, 144, 56, false), new hpi(696, 272, 22, 22, 16, 174, 68, false), new hpi(816, 336, 24, 24, 16, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 56, false), new hpi(1050, 408, 18, 18, 36, 175, 68, false), new hpi(1304, 496, 20, 20, 36, 163, 62, false), new ae4(1558, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 22, 22, 36, -1, 62, false)};
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public hpi(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public static hpi e(int i2, ipi ipiVar) {
        for (int i3 = 0; i3 < 30; i3++) {
            hpi hpiVar = i[i3];
            if (!(ipiVar == ipi.b && hpiVar.a) && ((ipiVar != ipi.c || hpiVar.a) && i2 <= hpiVar.b)) {
                return hpiVar;
            }
        }
        a70.p("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
        return null;
    }

    public int a(int i2) {
        return this.g;
    }

    public final int b() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                a70.r("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i3;
    }

    public int c() {
        return this.b / this.g;
    }

    public final int d() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        a70.r("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        int i2 = this.d;
        sb.append(i2);
        sb.append('x');
        int i3 = this.e;
        sb.append(i3);
        sb.append(", symbol size ");
        sb.append((b() * i2) + (b() << 1));
        sb.append('x');
        sb.append((d() * i3) + (d() << 1));
        sb.append(", symbol data size ");
        sb.append(b() * i2);
        sb.append('x');
        sb.append(d() * i3);
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }
}
