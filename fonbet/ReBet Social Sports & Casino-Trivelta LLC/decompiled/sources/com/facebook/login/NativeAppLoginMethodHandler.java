package com.facebook.login;

import T7.P;
import T7.Y;
import W9.d;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookRequestError;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.twilio.voice.EventKeys;
import d8.r;
import g6.C4331C;
import g6.C4333E;
import g6.C4357q;
import g6.EnumC4347g;
import j.AbstractC5086b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\"\u0010!J!\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001dJ\u0019\u0010)\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,R\u001a\u00102\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", EventKeys.DATA, "", "j", "(IILandroid/content/Intent;)Z", "Lcom/facebook/login/LoginClient$Request;", "request", "", "error", "errorMessage", "errorCode", "", "e0", "(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "extras", "f0", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)V", "d0", "(Lcom/facebook/login/LoginClient$Request;Landroid/content/Intent;)V", "Y", "(Landroid/os/Bundle;)Ljava/lang/String;", "Z", "intent", "j0", "(Landroid/content/Intent;I)Z", "h0", "Lcom/facebook/login/LoginClient$Result;", "outcome", "U", "(Lcom/facebook/login/LoginClient$Result;)V", "g0", "(Landroid/content/Intent;)Z", "Lg6/g;", d.f13160a, "Lg6/g;", "a0", "()Lg6/g;", "tokenSource", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final EnumC4347g tokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.tokenSource = EnumC4347g.FACEBOOK_APPLICATION_WEB;
    }

    public static final void i0(NativeAppLoginMethodHandler this$0, LoginClient.Request request, Bundle extras) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(extras, "$extras");
        try {
            this$0.f0(request, this$0.k(request, extras));
        } catch (C4333E e10) {
            FacebookRequestError c10 = e10.c();
            this$0.e0(request, c10.getErrorType(), c10.d(), String.valueOf(c10.getErrorCode()));
        } catch (C4357q e11) {
            this$0.e0(request, null, e11.getMessage(), null);
        }
    }

    public final void U(LoginClient.Result outcome) {
        if (outcome != null) {
            d().g(outcome);
        } else {
            d().j0();
        }
    }

    public String Y(Bundle extras) {
        String string = extras == null ? null : extras.getString("error");
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_type");
    }

    public String Z(Bundle extras) {
        String string = extras == null ? null : extras.getString(EventKeys.ERROR_MESSAGE_KEY);
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_description");
    }

    /* renamed from: a0, reason: from getter */
    public EnumC4347g getTokenSource() {
        return this.tokenSource;
    }

    public void d0(LoginClient.Request request, Intent data) {
        Object obj;
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle extras = data.getExtras();
        String Y10 = Y(extras);
        String str = null;
        if (extras != null && (obj = extras.get(EventKeys.ERROR_CODE_KEY)) != null) {
            str = obj.toString();
        }
        if (Intrinsics.areEqual(P.c(), str)) {
            U(LoginClient.Result.INSTANCE.c(request, Y10, Z(extras), str));
        } else {
            U(LoginClient.Result.INSTANCE.a(request, Y10));
        }
    }

    public void e0(LoginClient.Request request, String error, String errorMessage, String errorCode) {
        if (error != null && Intrinsics.areEqual(error, "logged_out")) {
            CustomTabLoginMethodHandler.f30954l = true;
            U(null);
        } else if (CollectionsKt.contains(P.d(), error)) {
            U(null);
        } else if (CollectionsKt.contains(P.e(), error)) {
            U(LoginClient.Result.INSTANCE.a(request, null));
        } else {
            U(LoginClient.Result.INSTANCE.c(request, error, errorMessage, errorCode));
        }
    }

    public void f0(LoginClient.Request request, Bundle extras) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            U(LoginClient.Result.INSTANCE.b(request, companion.b(request.getPermissions(), extras, getTokenSource(), request.getApplicationId()), companion.d(extras, request.getNonce())));
        } catch (C4357q e10) {
            U(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, request, null, e10.getMessage(), null, 8, null));
        }
    }

    public final boolean g0(Intent intent) {
        Intrinsics.checkNotNullExpressionValue(C4331C.l().getPackageManager().queryIntentActivities(intent, PKIFailureInfo.notAuthorized), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    public final void h0(final LoginClient.Request request, final Bundle extras) {
        if (extras.containsKey(EventKeys.ERROR_CODE)) {
            Y y10 = Y.f11042a;
            if (!Y.d0(extras.getString(EventKeys.ERROR_CODE))) {
                C4331C.t().execute(new Runnable() { // from class: d8.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeAppLoginMethodHandler.i0(NativeAppLoginMethodHandler.this, request, extras);
                    }
                });
                return;
            }
        }
        f0(request, extras);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean j(int requestCode, int resultCode, Intent data) {
        LoginClient.Request pendingRequest = d().getPendingRequest();
        if (data == null) {
            U(LoginClient.Result.INSTANCE.a(pendingRequest, "Operation canceled"));
        } else if (resultCode == 0) {
            d0(pendingRequest, data);
        } else if (resultCode != -1) {
            U(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = data.getExtras();
            if (extras == null) {
                U(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String Y10 = Y(extras);
            Object obj = extras.get(EventKeys.ERROR_CODE_KEY);
            String obj2 = obj == null ? null : obj.toString();
            String Z10 = Z(extras);
            String string = extras.getString("e2e");
            if (!Y.d0(string)) {
                h(string);
            }
            if (Y10 == null && obj2 == null && Z10 == null && pendingRequest != null) {
                h0(pendingRequest, extras);
            } else {
                e0(pendingRequest, Y10, Z10, obj2);
            }
        }
        return true;
    }

    public boolean j0(Intent intent, int requestCode) {
        AbstractC5086b j02;
        if (intent == null || !g0(intent)) {
            return false;
        }
        Fragment fragment = d().getFragment();
        Unit unit = null;
        r rVar = fragment instanceof r ? (r) fragment : null;
        if (rVar != null && (j02 = rVar.j0()) != null) {
            j02.b(intent);
            unit = Unit.INSTANCE;
        }
        return unit != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.tokenSource = EnumC4347g.FACEBOOK_APPLICATION_WEB;
    }
}
