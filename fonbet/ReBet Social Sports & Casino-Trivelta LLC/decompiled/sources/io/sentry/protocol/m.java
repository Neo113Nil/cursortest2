package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final transient Thread f52407a;

    /* renamed from: b, reason: collision with root package name */
    public String f52408b;

    /* renamed from: c, reason: collision with root package name */
    public String f52409c;

    /* renamed from: d, reason: collision with root package name */
    public String f52410d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f52411e;

    /* renamed from: f, reason: collision with root package name */
    public Map f52412f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52413g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f52414h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f52415i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f52416j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f52417k;

    /* renamed from: l, reason: collision with root package name */
    public Map f52418l;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            m mVar = new m();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "description":
                        mVar.f52409c = interfaceC4809q1.a1();
                        break;
                    case "exception_id":
                        mVar.f52415i = interfaceC4809q1.Q0();
                        break;
                    case "data":
                        mVar.f52413g = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        break;
                    case "meta":
                        mVar.f52412f = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        break;
                    case "type":
                        mVar.f52408b = interfaceC4809q1.a1();
                        break;
                    case "handled":
                        mVar.f52411e = interfaceC4809q1.p0();
                        break;
                    case "synthetic":
                        mVar.f52414h = interfaceC4809q1.p0();
                        break;
                    case "is_exception_group":
                        mVar.f52417k = interfaceC4809q1.p0();
                        break;
                    case "help_link":
                        mVar.f52410d = interfaceC4809q1.a1();
                        break;
                    case "parent_id":
                        mVar.f52416j = interfaceC4809q1.Q0();
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
            mVar.s(hashMap);
            return mVar;
        }
    }

    public m() {
        this(null);
    }

    public String k() {
        return this.f52408b;
    }

    public Boolean l() {
        return this.f52411e;
    }

    public void m(Integer num) {
        this.f52415i = num;
    }

    public void n(Boolean bool) {
        this.f52411e = bool;
    }

    public void o(Map map) {
        this.f52412f = AbstractC4845c.c(map);
    }

    public void p(Integer num) {
        this.f52416j = num;
    }

    public void q(Boolean bool) {
        this.f52414h = bool;
    }

    public void r(String str) {
        this.f52408b = str;
    }

    public void s(Map map) {
        this.f52418l = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52408b != null) {
            interfaceC4813r1.d("type").e(this.f52408b);
        }
        if (this.f52409c != null) {
            interfaceC4813r1.d("description").e(this.f52409c);
        }
        if (this.f52410d != null) {
            interfaceC4813r1.d("help_link").e(this.f52410d);
        }
        if (this.f52411e != null) {
            interfaceC4813r1.d("handled").k(this.f52411e);
        }
        if (this.f52412f != null) {
            interfaceC4813r1.d("meta").j(iLogger, this.f52412f);
        }
        if (this.f52413g != null) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52413g);
        }
        if (this.f52414h != null) {
            interfaceC4813r1.d("synthetic").k(this.f52414h);
        }
        if (this.f52415i != null) {
            interfaceC4813r1.d("exception_id").j(iLogger, this.f52415i);
        }
        if (this.f52416j != null) {
            interfaceC4813r1.d("parent_id").j(iLogger, this.f52416j);
        }
        if (this.f52417k != null) {
            interfaceC4813r1.d("is_exception_group").k(this.f52417k);
        }
        Map map = this.f52418l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52418l.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public m(Thread thread) {
        this.f52407a = thread;
    }
}
