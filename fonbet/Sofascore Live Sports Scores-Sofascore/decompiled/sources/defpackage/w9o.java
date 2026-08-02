package defpackage;

import com.google.android.gms.internal.fido.zzbo;
import com.google.android.gms.internal.fido.zzft;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w9o extends zzft implements Serializable {
    public final byte[] b;

    public w9o(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int d() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length < 4) {
            a70.r(zzbo.a("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i2 = bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int g() {
        return this.b.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final boolean h(zzft zzftVar) {
        int length = zzftVar.i().length;
        byte[] bArr = this.b;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == zzftVar.i()[i];
        }
        return z;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] i() {
        return this.b;
    }
}
