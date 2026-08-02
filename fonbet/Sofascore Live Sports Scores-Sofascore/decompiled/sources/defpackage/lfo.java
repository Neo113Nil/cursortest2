package defpackage;

import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgmd;
import com.google.android.gms.internal.ads.zzgoa;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzhcy;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lfo implements zzgoa {
    public final zzgmd a;
    public final ExecutorService b;
    public final zzgrh c;

    public lfo(zzgmd zzgmdVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.a = zzgmdVar;
        this.b = executorService;
        this.c = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb a(zzggt zzggtVar, byte[] bArr) {
        emo c = zzhcy.c(this.b, new t3n(8, this, zzggtVar, bArr));
        this.c.e(15305, c);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb b(zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        emo c = zzhcy.c(this.b, new r0o(this, zzggtVar, bArr, bArr2, 7));
        this.c.e(15321, c);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb zza() {
        return zzhcy.a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb zzb() {
        emo c = zzhcy.c(this.b, new kfo(this, 1));
        this.c.e(15302, c);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.zzgoa
    public final ddb zze() {
        emo c = zzhcy.c(this.b, new kfo(this, 0));
        this.c.e(15314, c);
        return c;
    }
}
