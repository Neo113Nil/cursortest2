package com.google.android.gms.internal.p000authapi;

import E9.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import z9.d;

/* loaded from: classes2.dex */
public final class zbad extends e {
    private static final C3117a.g zba;
    private static final C3117a.AbstractC0488a zbb;
    private static final C3117a zbc;
    private final String zbd;

    static {
        C3117a.g gVar = new C3117a.g();
        zba = gVar;
        zbw zbwVar = new zbw();
        zbb = zbwVar;
        zbc = new C3117a("Auth.Api.Identity.Authorization.API", zbwVar, gVar);
    }

    public zbad(@NonNull Activity activity, @NonNull d dVar) {
        super(activity, zbc, (C3117a.d) dVar, e.a.f32290c);
        this.zbd = zbaw.zba();
    }

    public final Task<AuthorizationResult> authorize(@NonNull AuthorizationRequest authorizationRequest) {
        AbstractC3191o.m(authorizationRequest);
        AuthorizationRequest.a N10 = AuthorizationRequest.N(authorizationRequest);
        N10.j(this.zbd);
        final AuthorizationRequest b10 = N10.b();
        return doRead(AbstractC3163x.a().d(zbav.zbc).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbac
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                ((zbj) zbfVar.getService()).zbc(new zbx(zbad.this, (TaskCompletionSource) obj2), (AuthorizationRequest) AbstractC3191o.m(b10), zbba.zba(zbfVar.getContext()));
            }
        }).c(false).e(1534).a());
    }

    public final Task<Void> clearToken(@NonNull ClearTokenRequest clearTokenRequest) {
        AbstractC3191o.m(clearTokenRequest);
        ClearTokenRequest.a h10 = clearTokenRequest.h();
        h10.b(this.zbd);
        final ClearTokenRequest a10 = h10.a();
        return doWrite(AbstractC3163x.a().d(zbav.zbe).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbab
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                ((zbj) zbfVar.getService()).zbe(new zbz(zbad.this, (TaskCompletionSource) obj2), (ClearTokenRequest) AbstractC3191o.m(a10), zbba.zba(zbfVar.getContext()));
            }
        }).e(1721).a());
    }

    public final AuthorizationResult getAuthorizationResultFromIntent(Intent intent) {
        if (intent == null) {
            throw new b(Status.f32277h);
        }
        Status status = (Status) c.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f32279j);
        }
        if (!status.l()) {
            throw new b(status);
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) c.b(intent, "authorization_result", AuthorizationResult.CREATOR);
        if (authorizationResult != null) {
            return authorizationResult;
        }
        throw new b(Status.f32277h);
    }

    public final Task<Void> revokeAccess(@NonNull RevokeAccessRequest revokeAccessRequest) {
        AbstractC3191o.m(revokeAccessRequest);
        RevokeAccessRequest.a h10 = revokeAccessRequest.h();
        h10.b(this.zbd);
        final RevokeAccessRequest a10 = h10.a();
        return doWrite(AbstractC3163x.a().d(zbav.zbd).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbaa
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                ((zbj) zbfVar.getService()).zbd(new zby(zbad.this, (TaskCompletionSource) obj2), (RevokeAccessRequest) AbstractC3191o.m(a10), zbba.zba(zbfVar.getContext()));
            }
        }).e(1721).a());
    }

    public zbad(@NonNull Context context, @NonNull d dVar) {
        super(context, zbc, dVar, e.a.f32290c);
        this.zbd = zbaw.zba();
    }
}
