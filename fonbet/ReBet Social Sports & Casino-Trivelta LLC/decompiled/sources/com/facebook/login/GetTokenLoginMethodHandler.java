package com.facebook.login;

import T7.N;
import T7.Y;
import W9.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.crypto.tink.integration.android.b;
import d8.C4036l;
import g6.C4331C;
import g6.C4357q;
import g6.EnumC4347g;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", b.f37029b, "()V", "Lcom/facebook/login/LoginClient$Request;", "request", "", "N", "(Lcom/facebook/login/LoginClient$Request;)I", "Landroid/os/Bundle;", "result", "Y", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)V", "Z", "U", "describeContents", "()I", "Ld8/l;", d.f13160a, "Ld8/l;", "getTokenClient", "", e.f29601m, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "nameForLogging", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public C4036l getTokenClient;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new GetTokenLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i10) {
            return new GetTokenLoginMethodHandler[i10];
        }
    }

    public static final class c implements Y.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f30991a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GetTokenLoginMethodHandler f30992b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LoginClient.Request f30993c;

        public c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f30991a = bundle;
            this.f30992b = getTokenLoginMethodHandler;
            this.f30993c = request;
        }

        @Override // T7.Y.a
        public void a(C4357q c4357q) {
            this.f30992b.d().f(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, this.f30992b.d().getPendingRequest(), "Caught exception", c4357q == null ? null : c4357q.getMessage(), null, 8, null));
        }

        @Override // T7.Y.a
        public void b(JSONObject jSONObject) {
            try {
                this.f30991a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString(StackTraceHelper.ID_KEY));
                this.f30992b.Z(this.f30993c, this.f30991a);
            } catch (JSONException e10) {
                this.f30992b.d().f(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, this.f30992b.d().getPendingRequest(), "Caught exception", e10.getMessage(), null, 8, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "get_token";
    }

    public static final void a0(GetTokenLoginMethodHandler this$0, LoginClient.Request request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        this$0.Y(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int N(final LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Context i10 = d().i();
        if (i10 == null) {
            i10 = C4331C.l();
        }
        C4036l c4036l = new C4036l(i10, request);
        this.getTokenClient = c4036l;
        if (Intrinsics.areEqual(Boolean.valueOf(c4036l.h()), Boolean.FALSE)) {
            return 0;
        }
        d().Y();
        N.b bVar = new N.b() { // from class: d8.m
            @Override // T7.N.b
            public final void a(Bundle bundle) {
                GetTokenLoginMethodHandler.a0(GetTokenLoginMethodHandler.this, request, bundle);
            }
        };
        C4036l c4036l2 = this.getTokenClient;
        if (c4036l2 == null) {
            return 1;
        }
        c4036l2.g(bVar);
        return 1;
    }

    public final void U(LoginClient.Request request, Bundle result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            Z(request, result);
            return;
        }
        d().Y();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Y y10 = Y.f11042a;
        Y.G(string2, new c(result, this, request));
    }

    public final void Y(LoginClient.Request request, Bundle result) {
        Intrinsics.checkNotNullParameter(request, "request");
        C4036l c4036l = this.getTokenClient;
        if (c4036l != null) {
            c4036l.g(null);
        }
        this.getTokenClient = null;
        d().Z();
        if (result != null) {
            List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = CollectionsKt.emptyList();
            }
            Set<String> permissions = request.getPermissions();
            if (permissions == null) {
                permissions = SetsKt.emptySet();
            }
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (permissions.contains("openid") && (string == null || string.length() == 0)) {
                d().j0();
                return;
            }
            if (stringArrayList.containsAll(permissions)) {
                U(request, result);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : permissions) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.f0(hashSet);
        }
        d().j0();
    }

    public final void Z(LoginClient.Request request, Bundle result) {
        LoginClient.Result d10;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            d10 = LoginClient.Result.INSTANCE.b(request, companion.a(result, EnumC4347g.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.c(result, request.getNonce()));
        } catch (C4357q e10) {
            d10 = LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, d().getPendingRequest(), null, e10.getMessage(), null, 8, null);
        }
        d().g(d10);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void b() {
        C4036l c4036l = this.getTokenClient;
        if (c4036l == null) {
            return;
        }
        c4036l.b();
        c4036l.g(null);
        this.getTokenClient = null;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "get_token";
    }
}
