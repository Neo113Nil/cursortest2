package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.a65;
import xsna.b65;
import xsna.f5o0;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzbo extends b {
    public zzbo(@NonNull Activity activity, @Nullable b65 b65Var) {
        super(activity, a65.a, b65Var == null ? b65.c : b65Var, b.a.c);
    }

    public final Task<String> getSpatulaHeader() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        };
        a.e = 1520;
        return doRead(a.a());
    }

    public final Task<ProxyResponse> performProxyRequest(@NonNull final ProxyRequest proxyRequest) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                ProxyRequest proxyRequest2 = proxyRequest;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), proxyRequest2);
            }
        };
        a.e = 1518;
        return doWrite(a.a());
    }

    public zzbo(@NonNull Context context, @Nullable b65 b65Var) {
        super(context, a65.a, b65Var == null ? b65.c : b65Var, b.a.c);
    }
}
