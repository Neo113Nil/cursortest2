package io.sentry;

import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4811q3 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52543a;

    /* renamed from: b, reason: collision with root package name */
    public Object f52544b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52545c;

    /* renamed from: io.sentry.q3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4811q3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            String str = null;
            Object obj = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("type")) {
                    str = interfaceC4809q1.a1();
                } else if (f02.equals(EventKeys.VALUE_KEY)) {
                    obj = interfaceC4809q1.H1();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            interfaceC4809q1.t();
            if (str != null) {
                C4811q3 c4811q3 = new C4811q3(str, obj);
                c4811q3.a(hashMap);
                return c4811q3;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.b(EnumC4788n3.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C4811q3(String str, Object obj) {
        this.f52543a = str;
        if (obj == null || !str.equals("string")) {
            this.f52544b = obj;
        } else {
            this.f52544b = obj.toString();
        }
    }

    public void a(Map map) {
        this.f52545c = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("type").j(iLogger, this.f52543a);
        interfaceC4813r1.d(EventKeys.VALUE_KEY).j(iLogger, this.f52544b);
        Map map = this.f52545c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52545c.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
