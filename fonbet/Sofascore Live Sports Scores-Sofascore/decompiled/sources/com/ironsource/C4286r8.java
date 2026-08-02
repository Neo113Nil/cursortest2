package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.r8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4286r8 implements InterfaceC4142j7 {
    private static Map<String, Object> a = new HashMap();

    private C4286r8(a aVar) {
        a(aVar);
        a(aVar.d);
    }

    private void a(a aVar) {
        Context context = aVar.d;
        V4 b = V4.b(context);
        a.put(C4427z5.j, SDKUtils.encodeString(b.e()));
        a.put(C4427z5.k, SDKUtils.encodeString(b.f()));
        a.put(C4427z5.l, Integer.valueOf(b.a()));
        a.put(C4427z5.m, SDKUtils.encodeString(b.d()));
        a.put(C4427z5.n, SDKUtils.encodeString(b.c()));
        a.put(C4427z5.d, SDKUtils.encodeString(context.getPackageName()));
        a.put(C4427z5.g, SDKUtils.encodeString(aVar.b));
        a.put("sessionid", SDKUtils.encodeString(aVar.a));
        a.put(C4427z5.b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        a.put(C4427z5.o, C4427z5.t);
        a.put("origin", C4427z5.q);
        if (!TextUtils.isEmpty(aVar.e)) {
            a.put(C4427z5.i, SDKUtils.encodeString(aVar.e));
        }
        if (TextUtils.isEmpty(aVar.f)) {
            return;
        }
        a.put(C4427z5.K, aVar.f);
    }

    public static void b(String str) {
        a.put(C4427z5.f, SDKUtils.encodeString(str));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.r8$a */
    public static class a {
        String a;
        String b;
        String c;
        Context d;
        String e;
        String f;

        public C4286r8 a() {
            return new C4286r8(this, 0);
        }

        public a b(String str) {
            this.f = str;
            return this;
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(String str) {
            this.a = str;
            return this;
        }

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a a(Context context) {
            this.d = context;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ C4286r8(a aVar, int i) {
        this(aVar);
    }

    private void a(Context context) {
        a.put(C4427z5.e, R3.b(context));
        a.put(C4427z5.f, R3.d(context));
    }

    @Override // com.ironsource.InterfaceC4142j7
    public Map<String, Object> a() {
        return a;
    }

    public static void a(String str) {
        a.put(C4427z5.e, SDKUtils.encodeString(str));
    }
}
