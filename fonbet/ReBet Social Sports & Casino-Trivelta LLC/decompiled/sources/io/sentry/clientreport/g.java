package io.sentry.clientreport;

import com.twilio.voice.EventKeys;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f51992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f51993b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f51994c;

    /* renamed from: d, reason: collision with root package name */
    public Map f51995d;

    public static final class a implements InterfaceC4859w0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC4788n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            String str = null;
            String str2 = null;
            Long l10 = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "quantity":
                        l10 = interfaceC4809q1.U0();
                        break;
                    case "reason":
                        str = interfaceC4809q1.a1();
                        break;
                    case "category":
                        str2 = interfaceC4809q1.a1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            interfaceC4809q1.t();
            if (str == null) {
                throw c(EventKeys.REASON, iLogger);
            }
            if (str2 == null) {
                throw c("category", iLogger);
            }
            if (l10 == null) {
                throw c("quantity", iLogger);
            }
            g gVar = new g(str, str2, l10);
            gVar.d(hashMap);
            return gVar;
        }
    }

    public g(String str, String str2, Long l10) {
        this.f51992a = str;
        this.f51993b = str2;
        this.f51994c = l10;
    }

    public String a() {
        return this.f51993b;
    }

    public Long b() {
        return this.f51994c;
    }

    public String c() {
        return this.f51992a;
    }

    public void d(Map map) {
        this.f51995d = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.REASON).e(this.f51992a);
        interfaceC4813r1.d("category").e(this.f51993b);
        interfaceC4813r1.d("quantity").i(this.f51994c);
        Map map = this.f51995d;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f51995d.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f51992a + "', category='" + this.f51993b + "', quantity=" + this.f51994c + '}';
    }
}
