package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import x9.AbstractC6807b;
import x9.C6808c;

/* loaded from: classes2.dex */
public final class zzbo extends e {
    public zzbo(@NonNull Activity activity, C6808c c6808c) {
        super(activity, AbstractC6807b.f67962a, (C3117a.d) (c6808c == null ? C6808c.f67966b : c6808c), e.a.f32290c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        }).e(1520).a());
    }

    public final Task<ProxyResponse> performProxyRequest(@NonNull final ProxyRequest proxyRequest) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                ProxyRequest proxyRequest2 = proxyRequest;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), proxyRequest2);
            }
        }).e(1518).a());
    }

    public zzbo(@NonNull Context context, C6808c c6808c) {
        super(context, AbstractC6807b.f67962a, c6808c == null ? C6808c.f67966b : c6808c, e.a.f32290c);
    }
}
