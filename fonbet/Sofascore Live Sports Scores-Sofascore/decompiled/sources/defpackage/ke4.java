package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.net.URLDecoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ke4 extends j21 {
    public we4 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.qe4
    public final void close() {
        if (this.f != null) {
            this.f = null;
            d();
        }
        this.e = null;
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        we4 we4Var = this.e;
        if (we4Var != null) {
            return we4Var.a;
        }
        return null;
    }

    @Override // defpackage.qe4
    public final long k(we4 we4Var) {
        byte[] decode;
        e();
        this.e = we4Var;
        Uri uri = we4Var.a;
        long j = we4Var.f;
        String scheme = uri.getScheme();
        qx9.q("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = lik.a;
        String[] split = schemeSpecificPart.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
        if (split.length != 2) {
            throw new r9e(dmi.m(uri, "Unexpected URI format: "), null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                decode = Base64.decode(str, 0);
                this.f = decode;
            } catch (IllegalArgumentException e) {
                throw new r9e(dmi.q("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            decode = URLDecoder.decode(str, xp2.a.name()).getBytes(xp2.c);
            this.f = decode;
        }
        long j2 = we4Var.e;
        if (j2 > decode.length) {
            this.f = null;
            throw new se4(2008);
        }
        int i2 = (int) j2;
        this.g = i2;
        int length = decode.length - i2;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        f(we4Var);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.fe4, defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = lik.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        b(min);
        return min;
    }
}
