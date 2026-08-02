package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s1p extends v1p {
    @Override // defpackage.v1p, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte c(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            hc5.h(ljg.j(i, "Index < 0: "));
            return (byte) 0;
        }
        hc5.h(lnb.k(i, "Index > length: ", ", 47"));
        return (byte) 0;
    }

    @Override // defpackage.v1p, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte d(int i) {
        return this.c[i];
    }

    @Override // defpackage.v1p, com.google.android.gms.internal.consent_sdk.zzpm
    public final int m() {
        return 47;
    }
}
