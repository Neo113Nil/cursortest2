package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbqv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uon extends IHsdpServiceCallback.Stub {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzbqv b;

    public uon(zzbqv zzbqvVar, String str) {
        this.a = str;
        this.b = zzbqvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
    public final void onDismissed(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjg.Ee)).booleanValue()) {
            this.b.e("hsdp_on_dismissed", bundle, this.a);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
    public final void onError(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjg.Ee)).booleanValue()) {
            this.b.e("hsdp_on_error", bundle, this.a);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
    public final void onShown(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjg.Ee)).booleanValue()) {
            this.b.e("hsdp_on_shown", bundle, this.a);
        }
    }
}
