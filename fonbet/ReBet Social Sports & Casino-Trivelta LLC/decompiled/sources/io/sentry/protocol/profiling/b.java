package io.sentry.protocol.profiling;

import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4779m;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public double f52447a;

    /* renamed from: b, reason: collision with root package name */
    public int f52448b;

    /* renamed from: c, reason: collision with root package name */
    public String f52449c;

    /* renamed from: d, reason: collision with root package name */
    public Map f52450d;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            b bVar = new b();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "thread_id":
                        bVar.f52449c = interfaceC4809q1.a1();
                        break;
                    case "timestamp":
                        bVar.f52447a = interfaceC4809q1.nextDouble();
                        break;
                    case "stack_id":
                        bVar.f52448b = interfaceC4809q1.nextInt();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            bVar.g(hashMap);
            interfaceC4809q1.t();
            return bVar;
        }
    }

    public void d(int i10) {
        this.f52448b = i10;
    }

    public void e(String str) {
        this.f52449c = str;
    }

    public void f(double d10) {
        this.f52447a = d10;
    }

    public void g(Map map) {
        this.f52450d = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, AbstractC4779m.b(this.f52447a));
        interfaceC4813r1.d("stack_id").j(iLogger, Integer.valueOf(this.f52448b));
        if (this.f52449c != null) {
            interfaceC4813r1.d("thread_id").j(iLogger, this.f52449c);
        }
        Map map = this.f52450d;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52450d.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
