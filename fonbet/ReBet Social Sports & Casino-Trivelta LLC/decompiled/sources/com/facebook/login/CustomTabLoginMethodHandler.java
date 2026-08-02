package com.facebook.login;

import T7.C1666f;
import T7.C1667g;
import T7.E;
import T7.Y;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookRequestError;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.google.android.material.shape.i;
import com.google.crypto.tink.integration.android.b;
import com.twilio.voice.EventKeys;
import d8.C4027c;
import g6.C4331C;
import g6.C4333E;
import g6.C4357q;
import g6.C4358s;
import g6.EnumC4347g;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 <2\u00020\u0001:\u0001=B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010,R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u001a\u00102\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b+\u0010\u000bR\u001a\u00107\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u000bR\u0016\u0010;\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u000b¨\u0006>"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "g", "()Ljava/lang/String;", "Y", "Lcom/facebook/login/LoginClient$Request;", "request", "", "N", "(Lcom/facebook/login/LoginClient$Request;)I", "requestCode", "resultCode", "Landroid/content/Intent;", EventKeys.DATA, "", "j", "(IILandroid/content/Intent;)Z", "Lorg/json/JSONObject;", "param", "", "l", "(Lorg/json/JSONObject;)V", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", EventKeys.URL, "i0", "(Ljava/lang/String;Lcom/facebook/login/LoginClient$Request;)V", "Landroid/os/Bundle;", EventKeys.VALUES_KEY, "k0", "(Landroid/os/Bundle;)Z", "f", "Ljava/lang/String;", "currentPackage", "expectedChallenge", C4527h.f48087o, "validRedirectURI", i.f35755A, "nameForLogging", "Lg6/g;", "Lg6/g;", "Z", "()Lg6/g;", "tokenSource", "h0", "developerDefinedRedirectURI", "g0", "chromePackage", "k", b.f37029b, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f30954l;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String currentPackage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String expectedChallenge;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String validRedirectURI;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final EnumC4347g tokenSource;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new CustomTabLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i10) {
            return new CustomTabLoginMethodHandler[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "custom_tab";
        this.tokenSource = EnumC4347g.CHROME_CUSTOM_TAB;
        this.expectedChallenge = Y.s(20);
        f30954l = false;
        C1667g c1667g = C1667g.f11132a;
        this.validRedirectURI = C1667g.c(h0());
    }

    public static final void j0(CustomTabLoginMethodHandler this$0, LoginClient.Request request, Bundle values) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(values, "$values");
        try {
            this$0.d0(request, this$0.k(request, values), null);
        } catch (C4357q e10) {
            this$0.d0(request, null, e10);
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int N(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient d10 = d();
        if (getValidRedirectURI().length() == 0) {
            return 0;
        }
        Bundle O10 = O(U(request), request);
        if (f30954l) {
            O10.putString("cct_over_app_switch", "1");
        }
        if (C4331C.f46937q) {
            if (request.Y()) {
                C4027c.f45057b.c(E.f10983c.a("oauth", O10));
            } else {
                C4027c.f45057b.c(C1666f.f11130b.a("oauth", O10));
            }
        }
        AbstractActivityC2168s i10 = d10.i();
        if (i10 == null) {
            return 0;
        }
        Intent intent = new Intent(i10, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f30278d, "oauth");
        intent.putExtra(CustomTabMainActivity.f30279e, O10);
        intent.putExtra(CustomTabMainActivity.f30280f, g0());
        intent.putExtra(CustomTabMainActivity.f30282h, request.getLoginTargetApp().toString());
        Fragment fragment = d10.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public String Y() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: Z, reason: from getter */
    public EnumC4347g getTokenSource() {
        return this.tokenSource;
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

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g, reason: from getter */
    public String getValidRedirectURI() {
        return this.validRedirectURI;
    }

    public final String g0() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String a10 = C1667g.a();
        this.currentPackage = a10;
        return a10;
    }

    public final String h0() {
        return super.getValidRedirectURI();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(String url, final LoginClient.Request request) {
        int parseInt;
        if (url == null) {
            return;
        }
        if (!StringsKt.startsWith$default(url, "fbconnect://cct.", false, 2, (Object) null) && !StringsKt.startsWith$default(url, super.getValidRedirectURI(), false, 2, (Object) null)) {
            return;
        }
        Uri parse = Uri.parse(url);
        Y y10 = Y.f11042a;
        final Bundle p02 = Y.p0(parse.getQuery());
        p02.putAll(Y.p0(parse.getFragment()));
        if (!k0(p02)) {
            super.d0(request, null, new C4357q("Invalid state parameter"));
            return;
        }
        String string = p02.getString("error");
        if (string == null) {
            string = p02.getString("error_type");
        }
        String string2 = p02.getString("error_msg");
        if (string2 == null) {
            string2 = p02.getString(EventKeys.ERROR_MESSAGE_KEY);
        }
        if (string2 == null) {
            string2 = p02.getString("error_description");
        }
        String string3 = p02.getString(EventKeys.ERROR_CODE_KEY);
        if (string3 != null) {
            try {
                parseInt = Integer.parseInt(string3);
            } catch (NumberFormatException unused) {
            }
            if (!Y.d0(string) && Y.d0(string2) && parseInt == -1) {
                if (p02.containsKey("access_token")) {
                    super.d0(request, p02, null);
                    return;
                } else {
                    C4331C.t().execute(new Runnable() { // from class: d8.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            CustomTabLoginMethodHandler.j0(CustomTabLoginMethodHandler.this, request, p02);
                        }
                    });
                    return;
                }
            }
            if (string == null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                super.d0(request, null, new C4358s());
                return;
            } else if (parseInt != 4201) {
                super.d0(request, null, new C4358s());
                return;
            } else {
                super.d0(request, null, new C4333E(new FacebookRequestError(parseInt, string, string2), string2));
                return;
            }
        }
        parseInt = -1;
        if (!Y.d0(string)) {
        }
        if (string == null) {
        }
        if (parseInt != 4201) {
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean j(int requestCode, int resultCode, Intent data) {
        if (data != null && data.getBooleanExtra(CustomTabMainActivity.f30284j, false)) {
            return super.j(requestCode, resultCode, data);
        }
        if (requestCode != 1) {
            return super.j(requestCode, resultCode, data);
        }
        LoginClient.Request pendingRequest = d().getPendingRequest();
        if (pendingRequest == null) {
            return false;
        }
        if (resultCode == -1) {
            i0(data != null ? data.getStringExtra(CustomTabMainActivity.f30281g) : null, pendingRequest);
            return true;
        }
        super.d0(pendingRequest, null, new C4358s());
        return false;
    }

    public final boolean k0(Bundle values) {
        try {
            String string = values.getString("state");
            if (string == null) {
                return false;
            }
            return Intrinsics.areEqual(new JSONObject(string).getString("7_challenge"), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void l(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put("7_challenge", this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeString(this.expectedChallenge);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = EnumC4347g.CHROME_CUSTOM_TAB;
        this.expectedChallenge = source.readString();
        C1667g c1667g = C1667g.f11132a;
        this.validRedirectURI = C1667g.c(h0());
    }
}
