package com.facebook.login;

import T7.Y;
import W9.d;
import X9.m;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import com.google.android.material.shape.i;
import com.google.crypto.tink.integration.android.b;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import d8.C4017B;
import g6.C4331C;
import g6.C4333E;
import g6.C4339K;
import g6.C4357q;
import g6.EnumC4347g;
import h6.C4470F;
import i3.C4527h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\r\b'\u0018\u0000 \"2\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020,2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u0016R4\u0010;\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0005R\u0014\u0010A\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010 ¨\u0006B"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", "request", "", "N", "(Lcom/facebook/login/LoginClient$Request;)I", "requestCode", "resultCode", "Landroid/content/Intent;", EventKeys.DATA, "", "j", "(IILandroid/content/Intent;)Z", i.f35755A, "()Z", "", b.f37029b, "()V", "Lorg/json/JSONObject;", "param", "l", "(Lorg/json/JSONObject;)V", "", "g", "()Ljava/lang/String;", "authId", "c", "(Ljava/lang/String;)Ljava/lang/String;", "key", "", EventKeys.VALUE_KEY, "a", "(Ljava/lang/String;Ljava/lang/Object;)V", "e2e", C4527h.f48087o, "(Ljava/lang/String;)V", "Landroid/os/Bundle;", EventKeys.VALUES_KEY, "k", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)Landroid/os/Bundle;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "", "Ljava/util/Map;", e.f29601m, "()Ljava/util/Map;", "setMethodLoggingExtras", "(Ljava/util/Map;)V", "methodLoggingExtras", "Lcom/facebook/login/LoginClient;", d.f13160a, "()Lcom/facebook/login/LoginClient;", m.f13664a, "f", "nameForLogging", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Map methodLoggingExtras;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public LoginClient loginClient;

    /* renamed from: com.facebook.login.LoginMethodHandler$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessToken a(Bundle bundle, EnumC4347g enumC4347g, String applicationId) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Y y10 = Y.f11042a;
            Date x10 = Y.x(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date x11 = Y.x(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new AccessToken(string2, applicationId, string, stringArrayList, null, null, enumC4347g, x10, new Date(), x11, bundle.getString("graph_domain"));
        }

        public final AccessToken b(Collection collection, Bundle bundle, EnumC4347g enumC4347g, String applicationId) {
            Collection collection2;
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Y y10 = Y.f11042a;
            Date x10 = Y.x(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date x11 = Y.x(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collection2 = collection;
            } else {
                Object[] array = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                collection2 = CollectionsKt.arrayListOf(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayList = null;
            } else {
                Object[] array2 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                arrayList = CollectionsKt.arrayListOf(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayList2 = null;
            } else {
                Object[] array3 = StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr3 = (String[]) array3;
                arrayList2 = CollectionsKt.arrayListOf(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (Y.d0(string)) {
                return null;
            }
            return new AccessToken(string, applicationId, e(bundle.getString("signed_request")), collection2, arrayList, arrayList2, enumC4347g, x10, new Date(), x11, bundle.getString("graph_domain"));
        }

        public final AuthenticationToken c(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e10) {
                throw new C4357q(e10.getMessage());
            }
        }

        public final AuthenticationToken d(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e10) {
                throw new C4357q(e10.getMessage(), e10);
            }
        }

        public final String e(String str) {
            Object[] array;
            if (str == null || str.length() == 0) {
                throw new C4357q("Authorization response does not contain the signed_request");
            }
            try {
                array = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            if (strArr.length == 2) {
                byte[] data = Base64.decode(strArr[1], 0);
                Intrinsics.checkNotNullExpressionValue(data, "data");
                String string = new JSONObject(new String(data, Charsets.UTF_8)).getString("user_id");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"user_id\")");
                return string;
            }
            throw new C4357q("Failed to retrieve user_id from signed_request");
        }

        public Companion() {
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        m(loginClient);
    }

    public boolean J() {
        return false;
    }

    public abstract int N(LoginClient.Request request);

    public void a(String key, Object value) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map map = this.methodLoggingExtras;
        if (map == null) {
            return;
        }
    }

    public void b() {
    }

    public String c(String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", getNameForLogging());
            l(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", Intrinsics.stringPlus("Error creating client state json: ", e10.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final LoginClient d() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        throw null;
    }

    /* renamed from: e, reason: from getter */
    public final Map getMethodLoggingExtras() {
        return this.methodLoggingExtras;
    }

    /* renamed from: f */
    public abstract String getNameForLogging();

    /* renamed from: g */
    public String getValidRedirectURI() {
        return "fb" + C4331C.m() + "://authorize/";
    }

    public void h(String e2e) {
        LoginClient.Request pendingRequest = d().getPendingRequest();
        String applicationId = pendingRequest == null ? null : pendingRequest.getApplicationId();
        if (applicationId == null) {
            applicationId = C4331C.m();
        }
        C4470F c4470f = new C4470F(d().i(), applicationId);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", e2e);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(PublisherMetadata.APP_ID, applicationId);
        c4470f.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean i() {
        return false;
    }

    public boolean j(int requestCode, int resultCode, Intent data) {
        return false;
    }

    public Bundle k(LoginClient.Request request, Bundle values) {
        GraphRequest a10;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String string = values.getString(EventKeys.ERROR_CODE);
        if (Y.d0(string)) {
            throw new C4357q("No code param found from the request");
        }
        if (string == null) {
            a10 = null;
        } else {
            C4017B c4017b = C4017B.f45022a;
            String validRedirectURI = getValidRedirectURI();
            String codeVerifier = request.getCodeVerifier();
            if (codeVerifier == null) {
                codeVerifier = "";
            }
            a10 = C4017B.a(string, validRedirectURI, codeVerifier);
        }
        if (a10 == null) {
            throw new C4357q("Failed to create code exchange request");
        }
        C4339K k10 = a10.k();
        FacebookRequestError b10 = k10.b();
        if (b10 != null) {
            throw new C4333E(b10, b10.d());
        }
        try {
            JSONObject c10 = k10.c();
            String string2 = c10 != null ? c10.getString("access_token") : null;
            if (c10 == null || Y.d0(string2)) {
                throw new C4357q("No access token found from result");
            }
            values.putString("access_token", string2);
            if (!c10.has("id_token")) {
                return values;
            }
            values.putString("id_token", c10.getString("id_token"));
            return values;
        } catch (JSONException e10) {
            throw new C4357q(Intrinsics.stringPlus("Fail to process code exchange response: ", e10.getMessage()));
        }
    }

    public void l(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public final void m(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.loginClient = loginClient;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Y y10 = Y.f11042a;
        Y.L0(dest, this.methodLoggingExtras);
    }

    public LoginMethodHandler(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Map w02 = Y.w0(source);
        this.methodLoggingExtras = w02 == null ? null : MapsKt.toMutableMap(w02);
    }
}
