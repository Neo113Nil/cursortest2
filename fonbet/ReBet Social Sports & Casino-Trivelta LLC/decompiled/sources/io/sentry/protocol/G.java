package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.H;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class G implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f52295a;

    /* renamed from: b, reason: collision with root package name */
    public final List f52296b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52297c;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            String str = null;
            List list = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("rendering_system")) {
                    str = interfaceC4809q1.a1();
                } else if (f02.equals("windows")) {
                    list = interfaceC4809q1.P1(iLogger, new H.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            interfaceC4809q1.t();
            G g10 = new G(str, list);
            g10.a(hashMap);
            return g10;
        }
    }

    public G(String str, List list) {
        this.f52295a = str;
        this.f52296b = list;
    }

    public void a(Map map) {
        this.f52297c = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52295a != null) {
            interfaceC4813r1.d("rendering_system").e(this.f52295a);
        }
        if (this.f52296b != null) {
            interfaceC4813r1.d("windows").j(iLogger, this.f52296b);
        }
        Map map = this.f52297c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52297c.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
