package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzr extends e {
    private static final C3117a.g zza;
    private static final C3117a.AbstractC0488a zzb;
    private static final C3117a zzc;

    static {
        C3117a.g gVar = new C3117a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new C3117a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, (C3117a.d) C3117a.d.f32289J4, e.a.f32290c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(AbstractC3163x.a().d(zzac.zza).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        }).e(1564).a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        AbstractC3191o.m(str);
        AbstractC3191o.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(AbstractC3163x.a().d(zzac.zza).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        }).e(1565).a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC3163x.a().d(zzac.zza).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        }).e(1563).a());
    }

    public zzr(Context context) {
        super(context, zzc, C3117a.d.f32289J4, e.a.f32290c);
    }
}
