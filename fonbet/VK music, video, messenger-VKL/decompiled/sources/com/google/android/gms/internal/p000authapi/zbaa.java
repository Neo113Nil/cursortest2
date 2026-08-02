package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.exc0;
import xsna.f5o0;
import xsna.ouf0;
import xsna.pqz0;
import xsna.pzg0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class zbaa extends b {
    private static final a.g zba;
    private static final a.AbstractC0111a zbb;
    private static final a zbc;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbyVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zbaa(@NonNull Activity activity, @NonNull pqz0 pqz0Var) {
        super(activity, (a<pqz0>) r0, new pqz0(r4), b.a.c);
        a aVar = zbc;
        String str = pqz0Var.b;
        if (str != null) {
            exc0.f(str);
        }
        String zba2 = zbat.zba();
        exc0.f(zba2);
    }

    public final Task<AuthorizationResult> authorize(@NonNull AuthorizationRequest authorizationRequest) {
        exc0.i(authorizationRequest);
        AuthorizationRequest.a b = AuthorizationRequest.b(authorizationRequest);
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(b.a, b.b, b.c, b.d, b.e, b.f, ((pqz0) getApiOptions()).b, b.g, b.h);
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zbas.zbc};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api.zbx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zbz zbzVar = new zbz(zbaa.this, (TaskCompletionSource) obj2);
                zbk zbkVar = (zbk) ((zbg) obj).getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                exc0.i(authorizationRequest3);
                zbkVar.zbc(zbzVar, authorizationRequest3);
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1534;
        return doRead(a.a());
    }

    public final AuthorizationResult getAuthorizationResultFromIntent(@Nullable Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.h);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : pzg0.a(byteArrayExtra, creator));
        if (status == null) {
            throw new ApiException(Status.j);
        }
        if (!status.i()) {
            throw new ApiException(status);
        }
        Parcelable.Creator<AuthorizationResult> creator2 = AuthorizationResult.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        AuthorizationResult authorizationResult = (AuthorizationResult) (byteArrayExtra2 != null ? pzg0.a(byteArrayExtra2, creator2) : null);
        if (authorizationResult != null) {
            return authorizationResult;
        }
        throw new ApiException(Status.h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zbaa(@NonNull Context context, @NonNull pqz0 pqz0Var) {
        super(context, (a<pqz0>) r0, new pqz0(r4), b.a.c);
        a aVar = zbc;
        String str = pqz0Var.b;
        if (str != null) {
            exc0.f(str);
        }
        String zba2 = zbat.zba();
        exc0.f(zba2);
    }
}
