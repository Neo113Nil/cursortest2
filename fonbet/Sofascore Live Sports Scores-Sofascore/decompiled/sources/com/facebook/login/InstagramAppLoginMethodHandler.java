package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.b0;
import com.facebook.internal.d0;
import com.facebook.login.LoginClient;
import defpackage.cw3;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new a(3);
    public final String d;
    public final com.facebook.j e;

    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.d = "instagram_login";
        this.e = com.facebook.j.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        int i;
        Object obj;
        request.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            com.facebook.w wVar = com.facebook.w.a;
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        Context f = d().f();
        if (f == null) {
            f = com.facebook.w.a();
        }
        String str = request.d;
        Set set = request.b;
        boolean a = request.a();
        int i2 = request.c;
        int i3 = i2 == 0 ? 1 : i2;
        String c = c(request.g);
        String str2 = request.j;
        String str3 = request.l;
        boolean z = request.m;
        boolean z2 = request.o;
        boolean z3 = request.p;
        d0 d0Var = d0.a;
        Set set2 = cw3.a;
        Intent intent = null;
        if (set2.contains(d0.class)) {
            i = 1;
        } else {
            try {
                str.getClass();
                set.getClass();
                str2.getClass();
                b0 b0Var = new b0(1);
                d0 d0Var2 = d0.a;
                i = 1;
                obj = d0.class;
                try {
                    Intent d = d0.d(b0Var, str, set, jSONObject2, a, i3, c, str2, false, str3, z, 2, z2, z3, "", null, null, false, null, 3670016);
                    if (!set2.contains(obj) && d != null) {
                        try {
                            ResolveInfo resolveActivity = f.getPackageManager().resolveActivity(d, 0);
                            if (resolveActivity != null) {
                                String str4 = resolveActivity.activityInfo.packageName;
                                str4.getClass();
                                if (com.facebook.internal.l.a(f, str4)) {
                                    intent = d;
                                }
                            }
                        } catch (Throwable th) {
                            cw3.a(obj, th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cw3.a(obj, th);
                    Intent intent2 = intent;
                    a("e2e", jSONObject2);
                    com.appsflyer.internal.i.a(i);
                    return s(intent2) ? 1 : 0;
                }
            } catch (Throwable th3) {
                th = th3;
                i = 1;
                obj = d0.class;
            }
        }
        Intent intent22 = intent;
        a("e2e", jSONObject2);
        com.appsflyer.internal.i.a(i);
        return s(intent22) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* renamed from: o, reason: from getter */
    public final com.facebook.j getE() {
        return this.e;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
    }

    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.d = "instagram_login";
        this.e = com.facebook.j.INSTAGRAM_APPLICATION_WEB;
    }
}
