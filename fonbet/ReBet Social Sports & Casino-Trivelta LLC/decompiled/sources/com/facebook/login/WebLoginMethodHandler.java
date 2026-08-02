package com.facebook.login;

import T7.Y;
import W9.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.AbstractActivityC2168s;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import d8.EnumC4025a;
import d8.EnumC4028d;
import g6.C4331C;
import g6.C4333E;
import g6.C4357q;
import g6.C4358s;
import g6.EnumC4347g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 %2\u00020\u0001:\u0001&B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "Y", "()Ljava/lang/String;", "Lcom/facebook/login/LoginClient$Request;", "request", "Landroid/os/Bundle;", "U", "(Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", "parameters", "O", "(Landroid/os/Bundle;Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", EventKeys.VALUES_KEY, "Lg6/q;", "error", "", "d0", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lg6/q;)V", "a0", "token", "e0", "(Ljava/lang/String;)V", d.f13160a, "Ljava/lang/String;", "e2e", "Lg6/g;", "Z", "()Lg6/g;", "tokenSource", e.f29601m, "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String e2e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
    }

    public Bundle O(Bundle parameters, LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString("redirect_uri", getValidRedirectURI());
        if (request.Y()) {
            parameters.putString(PublisherMetadata.APP_ID, request.getApplicationId());
        } else {
            parameters.putString("client_id", request.getApplicationId());
        }
        parameters.putString("e2e", LoginClient.INSTANCE.a());
        if (request.Y()) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.getPermissions().contains("openid")) {
                parameters.putString("nonce", request.getNonce());
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.getCodeChallenge());
        EnumC4025a codeChallengeMethod = request.getCodeChallengeMethod();
        parameters.putString("code_challenge_method", codeChallengeMethod == null ? null : codeChallengeMethod.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.getAuthType());
        parameters.putString("login_behavior", request.getLoginBehavior().name());
        parameters.putString("sdk", Intrinsics.stringPlus("android-", C4331C.B()));
        if (Y() != null) {
            parameters.putString("sso", Y());
        }
        parameters.putString("cct_prefetching", C4331C.f46937q ? "1" : "0");
        if (request.getIsFamilyLogin()) {
            parameters.putString("fx_app", request.getLoginTargetApp().toString());
        }
        if (request.getShouldSkipAccountDeduplication()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.getMessengerPageId() != null) {
            parameters.putString("messenger_page_id", request.getMessengerPageId());
            parameters.putString("reset_messenger_state", request.getResetMessengerState() ? "1" : "0");
        }
        return parameters;
    }

    public Bundle U(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        Y y10 = Y.f11042a;
        if (!Y.e0(request.getPermissions())) {
            String join = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", join);
            a("scope", join);
        }
        EnumC4028d defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = EnumC4028d.NONE;
        }
        bundle.putString("default_audience", defaultAudience.b());
        bundle.putString("state", c(request.getAuthId()));
        AccessToken e10 = AccessToken.INSTANCE.e();
        String token = e10 == null ? null : e10.getToken();
        if (token == null || !Intrinsics.areEqual(token, a0())) {
            AbstractActivityC2168s i10 = d().i();
            if (i10 != null) {
                Y.i(i10);
            }
            a("access_token", "0");
        } else {
            bundle.putString("access_token", token);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", C4331C.p() ? "1" : "0");
        return bundle;
    }

    public String Y() {
        return null;
    }

    /* renamed from: Z */
    public abstract EnumC4347g getTokenSource();

    public final String a0() {
        Context i10 = d().i();
        if (i10 == null) {
            i10 = C4331C.l();
        }
        return i10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    public void d0(LoginClient.Request request, Bundle values, C4357q error) {
        String str;
        LoginClient.Result c10;
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient d10 = d();
        this.e2e = null;
        if (values != null) {
            if (values.containsKey("e2e")) {
                this.e2e = values.getString("e2e");
            }
            try {
                LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
                AccessToken b10 = companion.b(request.getPermissions(), values, getTokenSource(), request.getApplicationId());
                c10 = LoginClient.Result.INSTANCE.b(d10.getPendingRequest(), b10, companion.d(values, request.getNonce()));
                if (d10.i() != null) {
                    try {
                        CookieSyncManager.createInstance(d10.i()).sync();
                    } catch (Exception unused) {
                    }
                    if (b10 != null) {
                        e0(b10.getToken());
                    }
                }
            } catch (C4357q e10) {
                c10 = LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, d10.getPendingRequest(), null, e10.getMessage(), null, 8, null);
            }
        } else if (error instanceof C4358s) {
            c10 = LoginClient.Result.INSTANCE.a(d10.getPendingRequest(), "User canceled log in.");
        } else {
            this.e2e = null;
            String message = error == null ? null : error.getMessage();
            if (error instanceof C4333E) {
                FacebookRequestError c11 = ((C4333E) error).c();
                str = String.valueOf(c11.getErrorCode());
                message = c11.toString();
            } else {
                str = null;
            }
            c10 = LoginClient.Result.INSTANCE.c(d10.getPendingRequest(), null, message, str);
        }
        Y y10 = Y.f11042a;
        if (!Y.d0(this.e2e)) {
            h(this.e2e);
        }
        d10.g(c10);
    }

    public final void e0(String token) {
        Context i10 = d().i();
        if (i10 == null) {
            i10 = C4331C.l();
        }
        i10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", token).apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
