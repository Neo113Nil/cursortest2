package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wxn implements zzlk {
    public final /* synthetic */ zzez a;

    public wxn(zzez zzezVar) {
        this.a = zzezVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int a(String str) {
        return this.a.b(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void b(Bundle bundle) {
        zzez zzezVar = this.a;
        zzezVar.c(new wyn(zzezVar, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void c(String str) {
        zzez zzezVar = this.a;
        zzezVar.c(new ezn(zzezVar, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void d(String str, Bundle bundle, String str2) {
        this.a.e(bundle, str, str2, true);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map e(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void f(String str, Bundle bundle, String str2) {
        zzez zzezVar = this.a;
        zzezVar.c(new zyn(zzezVar, str, str2, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List g(String str, String str2) {
        return this.a.g(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.c(new y0o(zzezVar, zzcmVar, 3, false));
        return zzcmVar.S1(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.c(new y0o(zzezVar, zzcmVar, 4, false));
        return zzcmVar.S1(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.c(new y0o(zzezVar, zzcmVar, 1));
        return zzcmVar.S1(50L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.c(new y0o(zzezVar, zzcmVar, 0));
        return zzcmVar.S1(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.a.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        zzez zzezVar = this.a;
        zzezVar.c(new ezn(zzezVar, str, 2));
    }
}
