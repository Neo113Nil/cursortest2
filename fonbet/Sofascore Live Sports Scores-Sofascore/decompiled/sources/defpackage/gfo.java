package defpackage;

import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgoa;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzinq;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gfo implements zzgoa {
    public final zzgfw a;
    public final zzgfw b;
    public final zzgfw c;
    public final zzgfw d;
    public final zzinq e;
    public final zzinq f;
    public final File g;
    public final ExecutorService h;
    public final zzgrh i;

    public gfo(zzgfw zzgfwVar, zzgfw zzgfwVar2, zzinq zzinqVar, zzgfw zzgfwVar3, zzgfw zzgfwVar4, zzinq zzinqVar2, File file, ExecutorService executorService, zzgrh zzgrhVar) {
        this.a = zzgfwVar;
        this.c = zzgfwVar2;
        this.e = zzinqVar;
        this.b = zzgfwVar3;
        this.d = zzgfwVar4;
        this.f = zzinqVar2;
        this.g = file;
        this.h = executorService;
        this.i = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb a(zzggt zzggtVar, byte[] bArr) {
        emo b = this.d.b(bArr);
        this.i.e(15305, b);
        return zzhcy.h(zzhcq.r(b), new ffo(this, zzggtVar, 0), slo.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb b(zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        emo b = ((zzgfw) this.f.zzb()).b(bArr);
        zzgrh zzgrhVar = this.i;
        zzgrhVar.e(15307, b);
        emo b2 = this.d.b(bArr2);
        zzgrhVar.e(15305, b2);
        return zzhcy.h(zzhcq.r(new olo(zzgxm.y(new ddb[]{b, b2}), true)), new ffo(this, zzggtVar, 1), slo.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb zza() {
        return zzhcy.c(this.h, new q7o(this, 15));
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ddb zzb() {
        emo a = this.a.a();
        this.i.e(15302, a);
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzgoa
    public final ddb zze() {
        ilo i = zzhcy.i(zzhcq.r(this.a.a()), new lrn(this, 12), slo.a);
        this.i.e(15314, i);
        return i;
    }
}
