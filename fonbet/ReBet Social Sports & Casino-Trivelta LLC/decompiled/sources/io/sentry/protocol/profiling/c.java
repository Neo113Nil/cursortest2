package io.sentry.protocol.profiling;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52451a;

    /* renamed from: b, reason: collision with root package name */
    public int f52452b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52453c;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            c cVar = new c();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.PRIORITY)) {
                    cVar.f52452b = interfaceC4809q1.nextInt();
                } else if (f02.equals("name")) {
                    cVar.f52451a = interfaceC4809q1.a1();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            cVar.e(hashMap);
            interfaceC4809q1.t();
            return cVar;
        }
    }

    public void c(String str) {
        this.f52451a = str;
    }

    public void d(int i10) {
        this.f52452b = i10;
    }

    public void e(Map map) {
        this.f52453c = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52451a != null) {
            interfaceC4813r1.d("name").j(iLogger, this.f52451a);
        }
        interfaceC4813r1.d(EventKeys.PRIORITY).j(iLogger, Integer.valueOf(this.f52452b));
        Map map = this.f52453c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52453c.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
