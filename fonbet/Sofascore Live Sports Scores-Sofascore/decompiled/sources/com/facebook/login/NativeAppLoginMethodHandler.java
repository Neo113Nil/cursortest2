package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.internal.k0;
import com.facebook.login.LoginClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.de;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    public final com.facebook.j c;

    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        this.b = loginClient;
        this.c = com.facebook.j.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(int i, int i2, Intent intent) {
        String str;
        String string;
        String obj;
        String string2;
        Object obj2;
        LoginClient.Request request = d().g;
        if (intent == null) {
            n(new LoginClient.Result(request, 2, null, null, "Operation canceled", null));
            return true;
        }
        if (i2 != 0) {
            if (i2 != -1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("Unexpected resultCode from authorization.");
                n(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
                return true;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("Unexpected null from returned authorization data.");
                n(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList2), null));
                return true;
            }
            String string3 = extras.getString("error");
            if (string3 == null) {
                string3 = extras.getString("error_type");
            }
            Object obj3 = extras.get("error_code");
            r9 = obj3 != null ? obj3.toString() : null;
            String string4 = extras.getString("error_message");
            if (string4 == null) {
                string4 = extras.getString("error_description");
            }
            String string5 = extras.getString("e2e");
            if (!k0.A(string5)) {
                h(string5);
            }
            if (string3 != null || r9 != null || string4 != null || request == null) {
                q(request, string3, string4, r9);
                return true;
            }
            if (!extras.containsKey("code") || k0.A(extras.getString("code"))) {
                r(extras, request);
                return true;
            }
            com.facebook.w.c().execute(new com.appsflyer.internal.p(4, this, request, extras));
            return true;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null || (string = extras2.getString("error")) == null) {
            if (extras2 == null) {
                str = null;
                obj = (extras2 != null || (obj2 = extras2.get("error_code")) == null) ? null : obj2.toString();
                if ("CONNECTION_FAILURE".equals(obj)) {
                    n(new LoginClient.Result(request, 2, null, null, str, null));
                    return true;
                }
                if (extras2 != null && (string2 = extras2.getString("error_message")) != null) {
                    r9 = string2;
                } else if (extras2 != null) {
                    r9 = extras2.getString("error_description");
                }
                ArrayList arrayList3 = new ArrayList();
                if (str != null) {
                    arrayList3.add(str);
                }
                if (r9 != null) {
                    arrayList3.add(r9);
                }
                n(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList3), obj));
                return true;
            }
            string = extras2.getString("error_type");
        }
        str = string;
        if (extras2 != null) {
        }
        if ("CONNECTION_FAILURE".equals(obj)) {
        }
    }

    public final void n(LoginClient.Result result) {
        if (result != null) {
            d().d(result);
        } else {
            d().k();
        }
    }

    /* renamed from: o, reason: from getter */
    public com.facebook.j getC() {
        return this.c;
    }

    public final void q(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            CustomTabLoginMethodHandler.i = true;
            n(null);
            return;
        }
        if (CollectionsKt.R(kotlin.collections.b.j("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            n(null);
            return;
        }
        if (CollectionsKt.R(kotlin.collections.b.j("access_denied", "OAuthAccessDeniedException"), str)) {
            n(new LoginClient.Result(request, 2, null, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        n(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList), str3));
    }

    public final void r(Bundle bundle, LoginClient.Request request) {
        try {
            n(new LoginClient.Result(request, 1, com.facebook.appevents.g.k(request.b, bundle, getC(), request.d), com.facebook.appevents.g.l(bundle, request.s), null, null));
        } catch (com.facebook.q e) {
            String message = e.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            n(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public final boolean s(Intent intent) {
        if (intent == null) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = com.facebook.w.a().getPackageManager().queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        queryIntentActivities.getClass();
        if (queryIntentActivities.isEmpty()) {
            return false;
        }
        LoginFragment loginFragment = d().c;
        Unit unit = null;
        if (loginFragment == null) {
            loginFragment = null;
        }
        if (loginFragment != null) {
            de deVar = loginFragment.d;
            if (deVar == null) {
                Intrinsics.i("launcher");
                throw null;
            }
            deVar.a(intent, null);
            unit = Unit.a;
        }
        return unit != null;
    }

    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.c = com.facebook.j.FACEBOOK_APPLICATION_WEB;
    }
}
