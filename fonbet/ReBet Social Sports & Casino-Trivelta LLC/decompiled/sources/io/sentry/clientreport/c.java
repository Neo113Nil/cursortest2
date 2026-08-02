package io.sentry.clientreport;

import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4779m;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.clientreport.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f51985a;

    /* renamed from: b, reason: collision with root package name */
    public final List f51986b;

    /* renamed from: c, reason: collision with root package name */
    public Map f51987c;

    public static final class a implements InterfaceC4859w0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC4788n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            interfaceC4809q1.m();
            Date date = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("discarded_events")) {
                    arrayList.addAll(interfaceC4809q1.P1(iLogger, new g.a()));
                } else if (f02.equals(EventKeys.TIMESTAMP)) {
                    date = interfaceC4809q1.j0(iLogger);
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            interfaceC4809q1.t();
            if (date == null) {
                throw c(EventKeys.TIMESTAMP, iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            c cVar = new c(date, arrayList);
            cVar.b(hashMap);
            return cVar;
        }
    }

    public c(Date date, List list) {
        this.f51985a = date;
        this.f51986b = list;
    }

    public List a() {
        return this.f51986b;
    }

    public void b(Map map) {
        this.f51987c = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.TIMESTAMP).e(AbstractC4779m.g(this.f51985a));
        interfaceC4813r1.d("discarded_events").j(iLogger, this.f51986b);
        Map map = this.f51987c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f51987c.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
