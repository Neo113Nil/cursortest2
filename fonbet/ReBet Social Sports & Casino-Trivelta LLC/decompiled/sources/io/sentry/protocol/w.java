package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class w implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52483a;

    /* renamed from: b, reason: collision with root package name */
    public String f52484b;

    /* renamed from: c, reason: collision with root package name */
    public String f52485c;

    /* renamed from: d, reason: collision with root package name */
    public Map f52486d;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            w wVar = new w();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "raw_description":
                        wVar.f52485c = interfaceC4809q1.a1();
                        break;
                    case "name":
                        wVar.f52483a = interfaceC4809q1.a1();
                        break;
                    case "version":
                        wVar.f52484b = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            wVar.g(concurrentHashMap);
            interfaceC4809q1.t();
            return wVar;
        }
    }

    public w() {
    }

    public String d() {
        return this.f52483a;
    }

    public String e() {
        return this.f52484b;
    }

    public void f(String str) {
        this.f52483a = str;
    }

    public void g(Map map) {
        this.f52486d = map;
    }

    public void h(String str) {
        this.f52484b = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52483a != null) {
            interfaceC4813r1.d("name").e(this.f52483a);
        }
        if (this.f52484b != null) {
            interfaceC4813r1.d("version").e(this.f52484b);
        }
        if (this.f52485c != null) {
            interfaceC4813r1.d("raw_description").e(this.f52485c);
        }
        Map map = this.f52486d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52486d.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public w(w wVar) {
        this.f52483a = wVar.f52483a;
        this.f52484b = wVar.f52484b;
        this.f52485c = wVar.f52485c;
        this.f52486d = AbstractC4845c.b(wVar.f52486d);
    }
}
