package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.m;
import io.sentry.protocol.z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52470a;

    /* renamed from: b, reason: collision with root package name */
    public String f52471b;

    /* renamed from: c, reason: collision with root package name */
    public String f52472c;

    /* renamed from: d, reason: collision with root package name */
    public Long f52473d;

    /* renamed from: e, reason: collision with root package name */
    public z f52474e;

    /* renamed from: f, reason: collision with root package name */
    public m f52475f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52476g;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            t tVar = new t();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "thread_id":
                        tVar.f52473d = interfaceC4809q1.U0();
                        break;
                    case "module":
                        tVar.f52472c = interfaceC4809q1.a1();
                        break;
                    case "type":
                        tVar.f52470a = interfaceC4809q1.a1();
                        break;
                    case "value":
                        tVar.f52471b = interfaceC4809q1.a1();
                        break;
                    case "mechanism":
                        tVar.f52475f = (m) interfaceC4809q1.x0(iLogger, new m.a());
                        break;
                    case "stacktrace":
                        tVar.f52474e = (z) interfaceC4809q1.x0(iLogger, new z.a());
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
            tVar.q(hashMap);
            return tVar;
        }
    }

    public m g() {
        return this.f52475f;
    }

    public String h() {
        return this.f52472c;
    }

    public z i() {
        return this.f52474e;
    }

    public Long j() {
        return this.f52473d;
    }

    public String k() {
        return this.f52470a;
    }

    public void l(m mVar) {
        this.f52475f = mVar;
    }

    public void m(String str) {
        this.f52472c = str;
    }

    public void n(z zVar) {
        this.f52474e = zVar;
    }

    public void o(Long l10) {
        this.f52473d = l10;
    }

    public void p(String str) {
        this.f52470a = str;
    }

    public void q(Map map) {
        this.f52476g = map;
    }

    public void r(String str) {
        this.f52471b = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52470a != null) {
            interfaceC4813r1.d("type").e(this.f52470a);
        }
        if (this.f52471b != null) {
            interfaceC4813r1.d(EventKeys.VALUE_KEY).e(this.f52471b);
        }
        if (this.f52472c != null) {
            interfaceC4813r1.d("module").e(this.f52472c);
        }
        if (this.f52473d != null) {
            interfaceC4813r1.d("thread_id").i(this.f52473d);
        }
        if (this.f52474e != null) {
            interfaceC4813r1.d("stacktrace").j(iLogger, this.f52474e);
        }
        if (this.f52475f != null) {
            interfaceC4813r1.d("mechanism").j(iLogger, this.f52475f);
        }
        Map map = this.f52476g;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52476g.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
