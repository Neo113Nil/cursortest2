package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhz implements zzhr {
    public zziq b;
    public String c;
    public boolean f;
    public final zzik a = new zzik();
    public int d = 8000;
    public int e = 8000;

    @Override // com.google.android.gms.internal.ads.zzhr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzid zza() {
        zzid zzidVar = new zzid(this.c, this.d, this.e, this.f, this.a);
        zziq zziqVar = this.b;
        if (zziqVar != null) {
            zzidVar.c(zziqVar);
        }
        return zzidVar;
    }
}
