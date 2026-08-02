package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ehz;
import xsna.f5o0;
import xsna.fhz;
import xsna.grf0;
import xsna.o100;
import xsna.ouf0;
import xsna.t6m;
import xsna.wyz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzav extends b {
    private static final a.g zza;
    private static final a.AbstractC0111a zzb;
    private static final a zzc;
    private static final o100 zzd;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzaj zzajVar = new zzaj();
        zzb = zzajVar;
        zzc = new a("DeviceSuggestions.API", zzajVar, gVar);
        zzd = new o100("InternalDeviceSuggestionsClient", null);
    }

    public zzav(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.U6, b.a.c);
    }

    public final Task<Void> clearClientData() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.cast.zzat
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzai) ((zzaf) obj).getService()).zzh(new zzaq(zzav.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = new Feature[]{wyz0.e};
        a.e = 37604;
        return doWrite(a.a());
    }

    public final Task<Void> registerCallback(t6m t6mVar) {
        ehz registerListener = registerListener(t6mVar, "DeviceSuggestionsCallback");
        final zzam zzamVar = new zzam(this, registerListener);
        ouf0 ouf0Var = new ouf0() { // from class: com.google.android.gms.internal.cast.zzau
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzai) ((zzaf) obj).getService()).zze(new zzan(zzav.this, (TaskCompletionSource) obj2), zzamVar);
            }
        };
        ouf0 ouf0Var2 = new ouf0() { // from class: com.google.android.gms.internal.cast.zzar
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzai) ((zzaf) obj).getService()).zzf(new zzao(zzav.this, (TaskCompletionSource) obj2), zzamVar);
            }
        };
        grf0.a a = grf0.a();
        a.a = ouf0Var;
        a.b = ouf0Var2;
        a.c = registerListener;
        a.d = new Feature[]{wyz0.e};
        a.f = 37601;
        return doRegisterEventListener(a.a());
    }

    public final Task<Void> requestDeviceSuggestions() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.cast.zzas
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzai) ((zzaf) obj).getService()).zzg(new zzap(zzav.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = new Feature[]{wyz0.e};
        a.e = 37603;
        return doRead(a.a());
    }

    public final Task<Boolean> unregisterCallback(t6m t6mVar) {
        return doUnregisterEventListener(fhz.c(t6mVar, "DeviceSuggestionsCallback"), 37602);
    }

    public zzav(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.U6, b.a.c);
    }
}
