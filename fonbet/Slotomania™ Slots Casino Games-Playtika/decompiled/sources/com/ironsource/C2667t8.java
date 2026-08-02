package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.t8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2667t8 implements InterfaceC2541m7 {
    private static Map<String, Object> a = new HashMap();

    /* renamed from: com.ironsource.t8$a */
    public static class a {
        String a;
        String b;
        String c;
        Context d;
        String e;
        String f;

        a a(String str) {
            this.b = str;
            return this;
        }

        a b(String str) {
            this.f = str;
            return this;
        }

        a c(String str) {
            this.c = str;
            return this;
        }

        a d(String str) {
            this.a = str;
            return this;
        }

        a e(String str) {
            this.e = str;
            return this;
        }

        a a(Context context) {
            this.d = context;
            return this;
        }

        public C2667t8 a() {
            return new C2667t8(this);
        }
    }

    private C2667t8(a aVar) {
        a(aVar);
        a(aVar.d);
    }

    private void a(Context context) {
        a.put(B5.e, U3.b(context));
        a.put(B5.f, U3.d(context));
    }

    public static void b(String str) {
        a.put(B5.f, SDKUtils.encodeString(str));
    }

    private void a(a aVar) {
        Context context = aVar.d;
        X4 b = X4.b(context);
        a.put(B5.j, SDKUtils.encodeString(b.e()));
        a.put(B5.k, SDKUtils.encodeString(b.f()));
        a.put(B5.l, Integer.valueOf(b.a()));
        a.put(B5.m, SDKUtils.encodeString(b.d()));
        a.put(B5.n, SDKUtils.encodeString(b.c()));
        a.put(B5.d, SDKUtils.encodeString(context.getPackageName()));
        a.put(B5.g, SDKUtils.encodeString(aVar.b));
        a.put("sessionid", SDKUtils.encodeString(aVar.a));
        a.put(B5.b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        a.put("env", B5.t);
        a.put("origin", "n");
        if (!TextUtils.isEmpty(aVar.e)) {
            a.put(B5.i, SDKUtils.encodeString(aVar.e));
        }
        if (TextUtils.isEmpty(aVar.f)) {
            return;
        }
        a.put(B5.K, aVar.f);
    }

    @Override // com.ironsource.InterfaceC2541m7
    public Map<String, Object> a() {
        return a;
    }

    public static void a(String str) {
        a.put(B5.e, SDKUtils.encodeString(str));
    }
}
