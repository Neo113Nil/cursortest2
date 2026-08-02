package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.c0;
import com.facebook.internal.d0;
import com.facebook.login.LoginClient;
import defpackage.cw3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new a(2);
    public l c;
    public final String d;

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        this.b = loginClient;
        this.d = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void b() {
        l lVar = this.c;
        if (lVar != null) {
            lVar.d = false;
            lVar.c = null;
            this.c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getF() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0054 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056 A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0024, B:26:0x002d, B:32:0x0056, B:36:0x0060, B:43:0x004d, B:40:0x003d), top: B:6:0x0024, inners: #1 }] */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(LoginClient.Request request) {
        int i;
        int i2;
        boolean z;
        request.getClass();
        Context f = d().f();
        if (f == null) {
            f = com.facebook.w.a();
        }
        l lVar = new l(f, request.d, String.valueOf(request.e), request.s);
        this.c = lVar;
        synchronized (lVar) {
            i = 0;
            if (!lVar.d) {
                int i3 = lVar.j;
                d0 d0Var = d0.a;
                if (!cw3.a.contains(d0.class)) {
                    try {
                        i2 = d0.a.h(d0.b, new int[]{i3}).a;
                    } catch (Throwable th) {
                        cw3.a(d0.class, th);
                    }
                    if (i2 == -1) {
                        Intent e = d0.e(lVar.a);
                        if (e == null) {
                            z = false;
                        } else {
                            lVar.d = true;
                            lVar.a.bindService(e, lVar, 1);
                            z = true;
                        }
                    }
                }
                i2 = 0;
                if (i2 == -1) {
                }
            }
            z = false;
        }
        if (!z) {
            return 0;
        }
        c0 c0Var = d().e;
        if (c0Var != null) {
            View view = ((LoginFragment) c0Var.b).e;
            if (view == null) {
                Intrinsics.i("progressBar");
                throw null;
            }
            view.setVisibility(0);
        }
        m mVar = new m(i, this, request);
        l lVar2 = this.c;
        if (lVar2 != null) {
            lVar2.c = mVar;
        }
        return 1;
    }

    public final void n(Bundle bundle, LoginClient.Request request) {
        LoginClient.Result result;
        AccessToken j;
        String str;
        String string;
        AuthenticationToken authenticationToken;
        request.getClass();
        bundle.getClass();
        try {
            j = com.facebook.appevents.g.j(bundle, request.d);
            str = request.s;
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (com.facebook.q e) {
            LoginClient.Request request2 = d().g;
            String message = e.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            result = new LoginClient.Result(request2, 3, null, null, TextUtils.join(": ", arrayList), null);
        }
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                authenticationToken = new AuthenticationToken(string, str);
                result = new LoginClient.Result(request, 1, j, authenticationToken, null, null);
                d().d(result);
            } catch (Exception e2) {
                throw new com.facebook.q(e2.getMessage());
            }
        }
        authenticationToken = null;
        result = new LoginClient.Result(request, 1, j, authenticationToken, null, null);
        d().d(result);
    }

    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.d = "get_token";
    }
}
