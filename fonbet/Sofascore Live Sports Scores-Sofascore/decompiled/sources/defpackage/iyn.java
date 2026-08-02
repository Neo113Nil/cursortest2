package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iyn extends IHsdpPrewarmServiceCallback.Stub {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ jyn c;

    public iyn(jyn jynVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = jynVar;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onError(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjg.Ee)).booleanValue()) {
            this.c.a(this.b, bundle, this.a, "0");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onPrewarmCompleted(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjg.Ee)).booleanValue()) {
            this.c.a(this.b, bundle, this.a, "1");
        }
    }
}
