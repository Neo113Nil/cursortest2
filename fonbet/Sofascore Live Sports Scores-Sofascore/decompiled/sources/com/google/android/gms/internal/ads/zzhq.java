package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhq extends zzhk {
    public zzhw e;
    public byte[] f;
    public int g;
    public int h;

    public zzhq() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        byte[] decode;
        k(zzhwVar);
        this.e = zzhwVar;
        Uri normalizeScheme = zzhwVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzguk.e(scheme, "Unsupported scheme: %s", "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = zzfm.a;
        String[] split = schemeSpecificPart.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
        if (split.length != 2) {
            throw new zzat("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                decode = Base64.decode(str2, 0);
                this.f = decode;
            } catch (IllegalArgumentException e) {
                throw new zzat("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e, true, 0);
            }
        } else {
            decode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.f = decode;
        }
        long j = zzhwVar.c;
        int length = decode.length;
        if (j > length) {
            this.f = null;
            throw new zzht();
        }
        int i = (int) j;
        this.g = i;
        int i2 = length - i;
        this.h = i2;
        long j2 = zzhwVar.d;
        if (j2 != -1) {
            this.h = (int) Math.min(i2, j2);
        }
        l(zzhwVar);
        return j2 != -1 ? j2 : this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = zzfm.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        m(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        zzhw zzhwVar = this.e;
        if (zzhwVar != null) {
            return zzhwVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        if (this.f != null) {
            this.f = null;
            n();
        }
        this.e = null;
    }
}
