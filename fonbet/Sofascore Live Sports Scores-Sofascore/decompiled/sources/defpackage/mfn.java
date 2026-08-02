package defpackage;

import com.google.android.gms.internal.ads.zzagw;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzahr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mfn extends zzagw {
    public final /* synthetic */ zzahk b;
    public final /* synthetic */ zzahr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfn(zzahr zzahrVar, zzahk zzahkVar, zzahk zzahkVar2) {
        super(zzahkVar);
        this.b = zzahkVar2;
        this.c = zzahrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagw, com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        zzahi b = this.b.b(j);
        zzahl zzahlVar = b.a;
        long j2 = zzahlVar.a;
        long j3 = zzahlVar.b;
        long j4 = this.c.a;
        zzahl zzahlVar2 = new zzahl(j2, j3 + j4);
        zzahl zzahlVar3 = b.b;
        return new zzahi(zzahlVar2, new zzahl(zzahlVar3.a, zzahlVar3.b + j4));
    }
}
