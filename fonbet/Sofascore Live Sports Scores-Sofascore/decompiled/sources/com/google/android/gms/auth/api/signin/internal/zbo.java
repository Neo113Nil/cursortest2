package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.n3n;
import defpackage.o3n;
import defpackage.p2n;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String e;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zbt zbtVar = (zbt) this;
            zbtVar.S1();
            zbn.a(zbtVar.a).b();
            return true;
        }
        zbt zbtVar2 = (zbt) this;
        zbtVar2.S1();
        RevocationBoundService revocationBoundService = zbtVar2.a;
        Storage a = Storage.a(revocationBoundService);
        GoogleSignInAccount b = a.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.k;
        if (b != null) {
            String e2 = a.e("defaultGoogleSignInAccount");
            if (!TextUtils.isEmpty(e2) && (e = a.e(Storage.f("googleSignInOptions", e2))) != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.Y0(e);
                } catch (JSONException unused) {
                }
            }
            googleSignInOptions = null;
        }
        Preconditions.i(googleSignInOptions);
        Api api = Auth.a;
        GoogleApi.Settings.Builder builder = new GoogleApi.Settings.Builder();
        builder.a = new ApiExceptionMapper();
        GoogleSignInClient googleSignInClient = new GoogleSignInClient(revocationBoundService, api, googleSignInOptions, builder.a());
        Context context = googleSignInClient.a;
        zabq zabqVar = googleSignInClient.i;
        if (b != null) {
            boolean z = googleSignInClient.i() == 3;
            Logger logger = zbm.a;
            Object[] objArr = new Object[0];
            if (logger.c <= 3) {
                logger.a("Revoking access", objArr);
            }
            String e3 = Storage.a(context).e("refreshToken");
            zbm.a(context);
            if (!z) {
                o3n o3nVar = new o3n(zabqVar);
                zabqVar.c.g(1, o3nVar);
                basePendingResult2 = o3nVar;
            } else if (e3 == null) {
                Logger logger2 = zbb.c;
                Status status = new Status(4, null, null, null);
                Preconditions.a("Status code must not be SUCCESS", !status.Y0());
                BasePendingResult p2nVar = new p2n(status);
                p2nVar.a(status);
                basePendingResult2 = p2nVar;
            } else {
                zbb zbbVar = new zbb(e3);
                new Thread(zbbVar).start();
                basePendingResult2 = zbbVar.b;
            }
            d dVar = new d();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            basePendingResult2.c(new c(basePendingResult2, taskCompletionSource, dVar));
            taskCompletionSource.getTask();
        } else {
            boolean z2 = googleSignInClient.i() == 3;
            Logger logger3 = zbm.a;
            Object[] objArr2 = new Object[0];
            if (logger3.c <= 3) {
                logger3.a("Signing out", objArr2);
            }
            zbm.a(context);
            if (z2) {
                Result result = Status.e;
                Preconditions.j(result, "Result must not be null");
                BasePendingResult statusPendingResult = new StatusPendingResult(zabqVar);
                statusPendingResult.a(result);
                basePendingResult = statusPendingResult;
            } else {
                n3n n3nVar = new n3n(zabqVar);
                zabqVar.c.g(1, n3nVar);
                basePendingResult = n3nVar;
            }
            d dVar2 = new d();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            basePendingResult.c(new c(basePendingResult, taskCompletionSource2, dVar2));
            taskCompletionSource2.getTask();
        }
        return true;
    }
}
