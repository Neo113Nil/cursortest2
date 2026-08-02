package defpackage;

import com.google.android.gms.internal.pal.zzkb;
import com.google.android.gms.internal.pal.zzpa;
import com.google.android.gms.internal.pal.zzpr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class buo implements cuo {
    public final /* synthetic */ zzpr a;
    public final /* synthetic */ zzpa b;

    public buo(zzpr zzprVar, zzpa zzpaVar) {
        this.a = zzprVar;
        this.b = zzpaVar;
    }

    @Override // defpackage.cuo
    public final zzkb zzb() {
        zzpr zzprVar = this.a;
        return new pvo(zzprVar, zzprVar.b);
    }

    @Override // defpackage.cuo
    public final Class zzc() {
        return this.a.getClass();
    }

    @Override // defpackage.cuo
    public final Class zzd() {
        return this.b.getClass();
    }
}
