package io.sentry;

import io.sentry.H2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7226y2 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f68676a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f68677b;

    /* renamed from: c, reason: collision with root package name */
    private final String f68678c;

    /* renamed from: d, reason: collision with root package name */
    private final String f68679d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final H2 f68680e;

    /* renamed from: f, reason: collision with root package name */
    private final int f68681f;

    /* renamed from: g, reason: collision with root package name */
    private final Callable<Integer> f68682g;

    /* renamed from: h, reason: collision with root package name */
    private final String f68683h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f68684i;

    /* renamed from: io.sentry.y2$a */
    public static final class a implements InterfaceC7174n0<C7226y2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7226y2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            int i11 = 0;
            H2 h22 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "item_count":
                        num = interfaceC7131c1.A1();
                        break;
                    case "length":
                        i11 = interfaceC7131c1.nextInt();
                        break;
                    case "filename":
                        str2 = interfaceC7131c1.k0();
                        break;
                    case "attachment_type":
                        str3 = interfaceC7131c1.k0();
                        break;
                    case "type":
                        h22 = (H2) interfaceC7131c1.S(iLogger, new H2.a());
                        break;
                    case "content_type":
                        str = interfaceC7131c1.k0();
                        break;
                    case "platform":
                        str4 = interfaceC7131c1.k0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            if (h22 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                iLogger.a(I2.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            }
            C7226y2 c7226y2 = new C7226y2(h22, i11, str, str2, str3, str4, num);
            c7226y2.f(hashMap);
            interfaceC7131c1.endObject();
            return c7226y2;
        }
    }

    C7226y2() {
        throw null;
    }

    public C7226y2(@NotNull H2 h22, int i11, String str, String str2, String str3, String str4, Integer num) {
        this.f68680e = h22;
        this.f68676a = str;
        this.f68681f = i11;
        this.f68678c = str2;
        this.f68682g = null;
        this.f68683h = str3;
        this.f68679d = str4;
        this.f68677b = num;
    }

    public final String a() {
        return this.f68683h;
    }

    public final String b() {
        return this.f68676a;
    }

    public final String c() {
        return this.f68678c;
    }

    public final int d() {
        Callable<Integer> callable = this.f68682g;
        if (callable == null) {
            return this.f68681f;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @NotNull
    public final H2 e() {
        return this.f68680e;
    }

    public final void f(Map<String, Object> map) {
        this.f68684i = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        String str = this.f68676a;
        if (str != null) {
            c7212v0.g("content_type");
            c7212v0.p(str);
        }
        String str2 = this.f68678c;
        if (str2 != null) {
            c7212v0.g("filename");
            c7212v0.p(str2);
        }
        c7212v0.g("type");
        c7212v0.m(iLogger, this.f68680e);
        String str3 = this.f68683h;
        if (str3 != null) {
            c7212v0.g("attachment_type");
            c7212v0.p(str3);
        }
        String str4 = this.f68679d;
        if (str4 != null) {
            c7212v0.g("platform");
            c7212v0.p(str4);
        }
        Integer num = this.f68677b;
        if (num != null) {
            c7212v0.g("item_count");
            c7212v0.o(num);
        }
        c7212v0.g("length");
        c7212v0.l(d());
        HashMap hashMap = this.f68684i;
        if (hashMap != null) {
            for (String str5 : hashMap.keySet()) {
                I1.w.e(this.f68684i, str5, c7212v0, str5, iLogger);
            }
        }
        c7212v0.d();
    }

    C7226y2(@NotNull H2 h22, Callable<Integer> callable, String str, String str2, String str3) {
        this(h22, callable, str, str2, str3, (String) null, (Integer) null);
    }

    C7226y2(@NotNull H2 h22, Callable<Integer> callable, String str, String str2, String str3, String str4, Integer num) {
        io.sentry.util.p.b(h22, "type is required");
        this.f68680e = h22;
        this.f68676a = str;
        this.f68681f = -1;
        this.f68678c = str2;
        this.f68682g = callable;
        this.f68683h = str3;
        this.f68679d = str4;
        this.f68677b = num;
    }
}
