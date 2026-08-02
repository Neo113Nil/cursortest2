package defpackage;

import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzinq;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nfo implements zzgpi {
    public final zzgfw a;
    public final zzgfw b;
    public final zzinq c;
    public final zzgrh d;
    public final ExecutorService e;

    public nfo(zzgfw zzgfwVar, zzgfw zzgfwVar2, zzinq zzinqVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.a = zzgfwVar;
        this.b = zzgfwVar2;
        this.c = zzinqVar;
        this.d = zzgrhVar;
        this.e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb a(zzggt zzggtVar, byte[] bArr) {
        emo b = this.b.b(bArr);
        this.d.e(20305, b);
        return zzhcy.h(zzhcq.r(b), new mfo(this, zzggtVar, 0), slo.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb b(zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        emo b = ((zzgfw) this.c.zzb()).b(bArr);
        zzgrh zzgrhVar = this.d;
        zzgrhVar.e(20307, b);
        emo b2 = this.b.b(bArr2);
        zzgrhVar.e(20305, b2);
        return zzhcy.h(zzhcq.r(new olo(zzgxm.y(new ddb[]{b, b2}), true)), new mfo(this, zzggtVar, 1), slo.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb zza() {
        return zzhcy.a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb zzb() {
        emo a = this.a.a();
        this.d.e(20302, a);
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzgpi
    public final ddb zze() {
        emo a = this.b.a();
        this.d.e(20304, a);
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzgpi
    public final emo zzf() {
        emo c = zzhcy.c(this.e, msg.g);
        this.d.e(20312, c);
        return c;
    }
}
