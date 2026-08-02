package io.sentry.rrweb;

import com.twilio.voice.EventKeys;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.rrweb.c;
import io.sentry.util.w;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public c f52641a;

    /* renamed from: b, reason: collision with root package name */
    public long f52642b = System.currentTimeMillis();

    public static final class a {
        public boolean a(b bVar, String str, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                bVar.f52641a = (c) w.c((c) interfaceC4809q1.x0(iLogger, new c.a()), "");
                return true;
            }
            if (!str.equals(EventKeys.TIMESTAMP)) {
                return false;
            }
            bVar.f52642b = interfaceC4809q1.nextLong();
            return true;
        }
    }

    /* renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    public static final class C0770b {
        public void a(b bVar, InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
            interfaceC4813r1.d("type").j(iLogger, bVar.f52641a);
            interfaceC4813r1.d(EventKeys.TIMESTAMP).a(bVar.f52642b);
        }
    }

    public b(c cVar) {
        this.f52641a = cVar;
    }

    public long e() {
        return this.f52642b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f52642b == bVar.f52642b && this.f52641a == bVar.f52641a;
    }

    public void f(long j10) {
        this.f52642b = j10;
    }

    public int hashCode() {
        return w.b(this.f52641a, Long.valueOf(this.f52642b));
    }
}
