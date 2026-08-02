package defpackage;

import com.google.android.gms.internal.consent_sdk.zzpm;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.consent_sdk.zzqs;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class v1p extends zzpm {
    public final byte[] c;

    public v1p(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte d(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public int m() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final int n(int i, int i2) {
        Charset charset = zzqs.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final s1p o() {
        zzpm.h(m());
        byte[] bArr = this.c;
        s1p s1pVar = new s1p(bArr);
        zzpm.h(bArr.length);
        return s1pVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final void p(zzpv zzpvVar) {
        zzpvVar.a(m(), this.c);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final boolean q(zzpm zzpmVar) {
        if (!(zzpmVar instanceof v1p)) {
            return zzpmVar.q(this);
        }
        int m = m();
        if (m > zzpmVar.m()) {
            zzl.c(m, m());
            return false;
        }
        if (m > zzpmVar.m()) {
            a70.p(dmi.k(m, zzpmVar.m(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = ((v1p) zzpmVar).c;
        int i = 0;
        int i2 = 0;
        while (i < m) {
            if (this.c[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
