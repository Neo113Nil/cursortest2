package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.b0;
import com.facebook.internal.d0;
import com.facebook.login.LoginClient;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.cw3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new a(4);
    public final String d;

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.d = "katana_proxy_auth";
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
        request.getClass();
        boolean z = com.facebook.w.o && com.facebook.internal.h.c() != null && com.appsflyer.internal.i.b(request.a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            com.facebook.w wVar = com.facebook.w.a;
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        d().f();
        String str = request.d;
        Set set = request.b;
        boolean a = request.a();
        int i = request.c;
        int i2 = i == 0 ? 1 : i;
        String c = c(request.g);
        String str2 = request.j;
        String str3 = request.l;
        boolean z2 = request.m;
        boolean z3 = request.o;
        boolean z4 = request.p;
        String str4 = request.s;
        int i3 = request.v;
        if (i3 != 0) {
            com.appsflyer.internal.i.r(i3);
        }
        String str5 = request.e;
        String str6 = request.f;
        boolean z5 = request.q;
        String str7 = request.r;
        d0 d0Var = d0.a;
        ArrayList<Intent> arrayList = null;
        if (!cw3.a.contains(d0.class)) {
            try {
                str.getClass();
                set.getClass();
                str2.getClass();
                ArrayList arrayList2 = d0.b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    b0 b0Var = (b0) it.next();
                    d0 d0Var2 = d0.a;
                    boolean z6 = z4;
                    boolean z7 = z3;
                    String str8 = str4;
                    String str9 = str5;
                    Intent d = d0.d(b0Var, str, set, jSONObject2, a, i2, c, str2, z, str3, z2, 1, z7, z6, str8, str9, str6, z5, str7, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    if (d != null) {
                        arrayList3.add(d);
                    }
                    z3 = z7;
                    z4 = z6;
                    str4 = str8;
                    str5 = str9;
                }
                arrayList = arrayList3;
            } catch (Throwable th) {
                cw3.a(d0.class, th);
            }
        }
        a("e2e", jSONObject2);
        int i4 = 0;
        for (Intent intent : arrayList) {
            i4++;
            com.appsflyer.internal.i.a(1);
            if (s(intent)) {
                return i4;
            }
        }
        return 0;
    }

    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.d = "katana_proxy_auth";
    }
}
