package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.EnumC4783m3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4728b3 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f51891a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f51892b;

    /* renamed from: c, reason: collision with root package name */
    public final String f51893c;

    /* renamed from: d, reason: collision with root package name */
    public final String f51894d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC4783m3 f51895e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51896f;

    /* renamed from: g, reason: collision with root package name */
    public final Callable f51897g;

    /* renamed from: h, reason: collision with root package name */
    public final String f51898h;

    /* renamed from: i, reason: collision with root package name */
    public Map f51899i;

    /* renamed from: io.sentry.b3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4728b3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            HashMap hashMap = null;
            EnumC4783m3 enumC4783m3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            int i10 = 0;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "item_count":
                        num = interfaceC4809q1.Q0();
                        break;
                    case "length":
                        i10 = interfaceC4809q1.nextInt();
                        break;
                    case "filename":
                        str2 = interfaceC4809q1.a1();
                        break;
                    case "attachment_type":
                        str3 = interfaceC4809q1.a1();
                        break;
                    case "type":
                        enumC4783m3 = (EnumC4783m3) interfaceC4809q1.x0(iLogger, new EnumC4783m3.a());
                        break;
                    case "content_type":
                        str = interfaceC4809q1.a1();
                        break;
                    case "platform":
                        str4 = interfaceC4809q1.a1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            if (enumC4783m3 == null) {
                throw c("type", iLogger);
            }
            C4728b3 c4728b3 = new C4728b3(enumC4783m3, i10, str, str2, str3, str4, num);
            c4728b3.f(hashMap);
            interfaceC4809q1.t();
            return c4728b3;
        }

        public final Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC4788n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }
    }

    public C4728b3(EnumC4783m3 enumC4783m3, int i10, String str, String str2, String str3, String str4, Integer num) {
        this.f51895e = (EnumC4783m3) io.sentry.util.w.c(enumC4783m3, "type is required");
        this.f51891a = str;
        this.f51896f = i10;
        this.f51893c = str2;
        this.f51897g = null;
        this.f51898h = str3;
        this.f51894d = str4;
        this.f51892b = num;
    }

    public String a() {
        return this.f51898h;
    }

    public String b() {
        return this.f51891a;
    }

    public String c() {
        return this.f51893c;
    }

    public int d() {
        Callable callable = this.f51897g;
        if (callable == null) {
            return this.f51896f;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public EnumC4783m3 e() {
        return this.f51895e;
    }

    public void f(Map map) {
        this.f51899i = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f51891a != null) {
            interfaceC4813r1.d("content_type").e(this.f51891a);
        }
        if (this.f51893c != null) {
            interfaceC4813r1.d("filename").e(this.f51893c);
        }
        interfaceC4813r1.d("type").j(iLogger, this.f51895e);
        if (this.f51898h != null) {
            interfaceC4813r1.d("attachment_type").e(this.f51898h);
        }
        if (this.f51894d != null) {
            interfaceC4813r1.d(EventKeys.PLATFORM).e(this.f51894d);
        }
        if (this.f51892b != null) {
            interfaceC4813r1.d("item_count").i(this.f51892b);
        }
        interfaceC4813r1.d("length").a(d());
        Map map = this.f51899i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51899i.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public C4728b3(EnumC4783m3 enumC4783m3, Callable callable, String str, String str2, String str3) {
        this(enumC4783m3, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public C4728b3(EnumC4783m3 enumC4783m3, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        this.f51895e = (EnumC4783m3) io.sentry.util.w.c(enumC4783m3, "type is required");
        this.f51891a = str;
        this.f51896f = -1;
        this.f51893c = str2;
        this.f51897g = callable;
        this.f51898h = str3;
        this.f51894d = str4;
        this.f51892b = num;
    }

    public C4728b3(EnumC4783m3 enumC4783m3, Callable callable, String str, String str2) {
        this(enumC4783m3, callable, str, str2, null);
    }
}
