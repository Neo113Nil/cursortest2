package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class le4 extends k21 {
    public xe4 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        byte[] decode;
        e();
        this.e = xe4Var;
        Uri uri = xe4Var.a;
        long j = xe4Var.g;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        z1a.q(scheme, "Unsupported scheme: %s", "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = nik.a;
        String[] split = schemeSpecificPart.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
        if (split.length != 2) {
            throw new s9e(dmi.m(normalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                decode = Base64.decode(str2, 0);
                this.f = decode;
            } catch (IllegalArgumentException e) {
                throw new s9e(dmi.q("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            decode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.f = decode;
        }
        long j2 = xe4Var.f;
        if (j2 > decode.length) {
            this.f = null;
            throw new te4(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = decode.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        g(xe4Var);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.re4
    public final void close() {
        if (this.f != null) {
            this.f = null;
            d();
        }
        this.e = null;
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        xe4 xe4Var = this.e;
        if (xe4Var != null) {
            return xe4Var.a;
        }
        return null;
    }

    @Override // defpackage.ge4
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
        String str = nik.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        c(min);
        return min;
    }
}
