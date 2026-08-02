package com.facebook.login;

import T7.C1674n;
import T7.Y;
import T7.d0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractActivityC2168s;
import com.facebook.login.LoginClient;
import com.google.android.material.shape.i;
import com.twilio.voice.EventKeys;
import d8.n;
import d8.y;
import g6.C4357q;
import g6.EnumC4347g;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 72\u00020\u0001:\u000289B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u00101\u001a\u00020(8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b!\u0010,R\u001a\u00106\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", i.f35755A, "()Z", "", com.google.crypto.tink.integration.android.b.f37029b, "()V", "Lcom/facebook/login/LoginClient$Request;", "request", "", "N", "(Lcom/facebook/login/LoginClient$Request;)I", "Landroid/os/Bundle;", EventKeys.VALUES_KEY, "Lg6/q;", "error", "f0", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lg6/q;)V", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "LT7/d0;", "f", "LT7/d0;", "getLoginDialog", "()LT7/d0;", "setLoginDialog", "(LT7/d0;)V", "loginDialog", "", "g", "Ljava/lang/String;", "getE2e", "()Ljava/lang/String;", "setE2e", "(Ljava/lang/String;)V", "e2e", C4527h.f48087o, "nameForLogging", "Lg6/g;", "Lg6/g;", "Z", "()Lg6/g;", "tokenSource", "j", "a", "c", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public d0 loginDialog;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String e2e;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final EnumC4347g tokenSource;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new b();

    public final class a extends d0.a {

        /* renamed from: h, reason: collision with root package name */
        public String f31054h;

        /* renamed from: i, reason: collision with root package name */
        public n f31055i;

        /* renamed from: j, reason: collision with root package name */
        public y f31056j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f31057k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f31058l;

        /* renamed from: m, reason: collision with root package name */
        public String f31059m;

        /* renamed from: n, reason: collision with root package name */
        public String f31060n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ WebViewLoginMethodHandler f31061o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebViewLoginMethodHandler this$0, Context context, String applicationId, Bundle parameters) {
            super(context, applicationId, "oauth", parameters);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f31061o = this$0;
            this.f31054h = "fbconnect://success";
            this.f31055i = n.NATIVE_WITH_FALLBACK;
            this.f31056j = y.FACEBOOK;
        }

        @Override // T7.d0.a
        public d0 a() {
            Bundle f10 = f();
            if (f10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            f10.putString("redirect_uri", this.f31054h);
            f10.putString("client_id", c());
            f10.putString("e2e", j());
            f10.putString("response_type", this.f31056j == y.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            f10.putString("return_scopes", "true");
            f10.putString("auth_type", i());
            f10.putString("login_behavior", this.f31055i.name());
            if (this.f31057k) {
                f10.putString("fx_app", this.f31056j.toString());
            }
            if (this.f31058l) {
                f10.putString("skip_dedupe", "true");
            }
            d0.b bVar = d0.f11079m;
            Context d10 = d();
            if (d10 != null) {
                return bVar.d(d10, "oauth", f10, g(), this.f31056j, e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        public final String i() {
            String str = this.f31060n;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("authType");
            throw null;
        }

        public final String j() {
            String str = this.f31059m;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("e2e");
            throw null;
        }

        public final a k(String authType) {
            Intrinsics.checkNotNullParameter(authType, "authType");
            l(authType);
            return this;
        }

        public final void l(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f31060n = str;
        }

        public final a m(String e2e) {
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            n(e2e);
            return this;
        }

        public final void n(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f31059m = str;
        }

        public final a o(boolean z10) {
            this.f31057k = z10;
            return this;
        }

        public final a p(boolean z10) {
            this.f31054h = z10 ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a q(n loginBehavior) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            this.f31055i = loginBehavior;
            return this;
        }

        public final a r(y targetApp) {
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            this.f31056j = targetApp;
            return this;
        }

        public final a s(boolean z10) {
            this.f31058l = z10;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new WebViewLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i10) {
            return new WebViewLoginMethodHandler[i10];
        }
    }

    public static final class d implements d0.d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LoginClient.Request f31063b;

        public d(LoginClient.Request request) {
            this.f31063b = request;
        }

        @Override // T7.d0.d
        public void a(Bundle bundle, C4357q c4357q) {
            WebViewLoginMethodHandler.this.f0(this.f31063b, bundle, c4357q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "web_view";
        this.tokenSource = EnumC4347g.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int N(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle U10 = U(request);
        d dVar = new d(request);
        String a10 = LoginClient.INSTANCE.a();
        this.e2e = a10;
        a("e2e", a10);
        AbstractActivityC2168s i10 = d().i();
        if (i10 == null) {
            return 0;
        }
        boolean X10 = Y.X(i10);
        a aVar = new a(this, i10, request.getApplicationId(), U10);
        String str = this.e2e;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.loginDialog = aVar.m(str).p(X10).k(request.getAuthType()).q(request.getLoginBehavior()).r(request.getLoginTargetApp()).o(request.getIsFamilyLogin()).s(request.getShouldSkipAccountDeduplication()).h(dVar).a();
        C1674n c1674n = new C1674n();
        c1674n.setRetainInstance(true);
        c1674n.n0(this.loginDialog);
        c1674n.show(i10.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: Z, reason: from getter */
    public EnumC4347g getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void b() {
        d0 d0Var = this.loginDialog;
        if (d0Var != null) {
            if (d0Var != null) {
                d0Var.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void f0(LoginClient.Request request, Bundle values, C4357q error) {
        Intrinsics.checkNotNullParameter(request, "request");
        super.d0(request, values, error);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean i() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeString(this.e2e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "web_view";
        this.tokenSource = EnumC4347g.WEB_VIEW;
        this.e2e = source.readString();
    }
}
