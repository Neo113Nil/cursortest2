package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzgmf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzinq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class feo implements zzggu {
    public final zzinq a;
    public final zzinq b;
    public final zzinq c;
    public final boolean d;
    public final long e;

    public feo(zzinq zzinqVar, zzinq zzinqVar2, zzinq zzinqVar3, boolean z, long j) {
        this.a = zzinqVar;
        this.b = zzinqVar2;
        this.c = zzinqVar3;
        this.d = z;
        this.e = j;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb a(Context context, View view, Activity activity) {
        return ((zzgmf) this.b.zzb()).a(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb b(Context context, String str, View view) {
        return ((zzgmf) this.b.zzb()).b(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb c(Context context) {
        return ((zzgmf) this.b.zzb()).c(context);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final void d(InputEvent inputEvent) {
        ((zzgmf) this.b.zzb()).d(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final String zza() {
        return ((zzgmf) this.b.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb zzb() {
        boolean z = this.d;
        slo sloVar = slo.a;
        if (z) {
            final int i = 1;
            hlo h = zzhcy.h(zzhcy.e(zzhcq.r(((meo) this.a.zzb()).a()), Throwable.class, ahn.v, sloVar), new zzhcg(this) { // from class: beo
                public final /* synthetic */ feo b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ddb zza(Object obj) {
                    int i2 = i;
                    feo feoVar = this.b;
                    switch (i2) {
                        case 0:
                            return ((zzgmf) feoVar.b.zzb()).zzb();
                        case 1:
                            return ((zzgnz) feoVar.c.zzb()).zza();
                        default:
                            return ((zzgmf) feoVar.b.zzb()).zzb();
                    }
                }
            }, sloVar);
            final int i2 = 2;
            return zzhcy.h(h, new zzhcg(this) { // from class: beo
                public final /* synthetic */ feo b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ddb zza(Object obj) {
                    int i22 = i2;
                    feo feoVar = this.b;
                    switch (i22) {
                        case 0:
                            return ((zzgmf) feoVar.b.zzb()).zzb();
                        case 1:
                            return ((zzgnz) feoVar.c.zzb()).zza();
                        default:
                            return ((zzgmf) feoVar.b.zzb()).zzb();
                    }
                }
            }, sloVar);
        }
        final int i3 = 0;
        hlo h2 = zzhcy.h(zzhcy.e(zzhcq.r(((zzgnz) this.c.zzb()).zza()), Throwable.class, ahn.w, sloVar), new zzhcg(this) { // from class: beo
            public final /* synthetic */ feo b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ddb zza(Object obj) {
                int i22 = i3;
                feo feoVar = this.b;
                switch (i22) {
                    case 0:
                        return ((zzgmf) feoVar.b.zzb()).zzb();
                    case 1:
                        return ((zzgnz) feoVar.c.zzb()).zza();
                    default:
                        return ((zzgmf) feoVar.b.zzb()).zzb();
                }
            }
        }, sloVar);
        h2.addListener(new x3o(this, 20), sloVar);
        return h2;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final int zzg() {
        return ((zzgmf) this.b.zzb()).zzg();
    }
}
