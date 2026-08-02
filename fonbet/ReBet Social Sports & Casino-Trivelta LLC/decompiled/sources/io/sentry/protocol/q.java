package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class q implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52454a;

    /* renamed from: b, reason: collision with root package name */
    public Map f52455b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f52456c;

    /* renamed from: d, reason: collision with root package name */
    public Long f52457d;

    /* renamed from: e, reason: collision with root package name */
    public Object f52458e;

    /* renamed from: f, reason: collision with root package name */
    public Map f52459f;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            q qVar = new q();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "status_code":
                        qVar.f52456c = interfaceC4809q1.Q0();
                        break;
                    case "data":
                        qVar.f52458e = interfaceC4809q1.H1();
                        break;
                    case "headers":
                        Map map = (Map) interfaceC4809q1.H1();
                        if (map == null) {
                            break;
                        } else {
                            qVar.f52455b = AbstractC4845c.b(map);
                            break;
                        }
                    case "cookies":
                        qVar.f52454a = interfaceC4809q1.a1();
                        break;
                    case "body_size":
                        qVar.f52457d = interfaceC4809q1.U0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            qVar.f(concurrentHashMap);
            interfaceC4809q1.t();
            return qVar;
        }
    }

    public q() {
    }

    public void f(Map map) {
        this.f52459f = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52454a != null) {
            interfaceC4813r1.d("cookies").e(this.f52454a);
        }
        if (this.f52455b != null) {
            interfaceC4813r1.d("headers").j(iLogger, this.f52455b);
        }
        if (this.f52456c != null) {
            interfaceC4813r1.d("status_code").j(iLogger, this.f52456c);
        }
        if (this.f52457d != null) {
            interfaceC4813r1.d("body_size").j(iLogger, this.f52457d);
        }
        if (this.f52458e != null) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52458e);
        }
        Map map = this.f52459f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52459f.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public q(q qVar) {
        this.f52454a = qVar.f52454a;
        this.f52455b = AbstractC4845c.b(qVar.f52455b);
        this.f52459f = AbstractC4845c.b(qVar.f52459f);
        this.f52456c = qVar.f52456c;
        this.f52457d = qVar.f52457d;
        this.f52458e = qVar.f52458e;
    }
}
