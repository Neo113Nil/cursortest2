package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.u;
import io.sentry.util.AbstractC4845c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52383a;

    /* renamed from: b, reason: collision with root package name */
    public String f52384b;

    /* renamed from: c, reason: collision with root package name */
    public String f52385c;

    /* renamed from: d, reason: collision with root package name */
    public u f52386d;

    /* renamed from: e, reason: collision with root package name */
    public u f52387e;

    /* renamed from: f, reason: collision with root package name */
    public String f52388f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52389g;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            String str = null;
            String str2 = null;
            String str3 = null;
            u uVar = null;
            u uVar2 = null;
            String str4 = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "associated_event_id":
                        uVar = new u.a().a(interfaceC4809q1, iLogger);
                        break;
                    case "replay_id":
                        uVar2 = new u.a().a(interfaceC4809q1, iLogger);
                        break;
                    case "url":
                        str4 = interfaceC4809q1.a1();
                        break;
                    case "name":
                        str3 = interfaceC4809q1.a1();
                        break;
                    case "contact_email":
                        str2 = interfaceC4809q1.a1();
                        break;
                    case "message":
                        str = interfaceC4809q1.a1();
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
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            i iVar = new i(str);
            iVar.f52384b = str2;
            iVar.f52385c = str3;
            iVar.f52386d = uVar;
            iVar.f52387e = uVar2;
            iVar.f52388f = str4;
            iVar.f52389g = hashMap;
            return iVar;
        }
    }

    public i(String str) {
        l(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return io.sentry.util.w.a(this.f52383a, iVar.f52383a) && io.sentry.util.w.a(this.f52384b, iVar.f52384b) && io.sentry.util.w.a(this.f52385c, iVar.f52385c) && io.sentry.util.w.a(this.f52386d, iVar.f52386d) && io.sentry.util.w.a(this.f52387e, iVar.f52387e) && io.sentry.util.w.a(this.f52388f, iVar.f52388f) && io.sentry.util.w.a(this.f52389g, iVar.f52389g);
    }

    public String g() {
        return this.f52383a;
    }

    public u h() {
        return this.f52387e;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52383a, this.f52384b, this.f52385c, this.f52386d, this.f52387e, this.f52388f, this.f52389g);
    }

    public String i() {
        return this.f52388f;
    }

    public void j(u uVar) {
        this.f52386d = uVar;
    }

    public void k(String str) {
        this.f52384b = str;
    }

    public void l(String str) {
        if (str.length() > 4096) {
            this.f52383a = str.substring(0, 4096);
        } else {
            this.f52383a = str;
        }
    }

    public void m(String str) {
        this.f52385c = str;
    }

    public void n(u uVar) {
        this.f52387e = uVar;
    }

    public void o(String str) {
        this.f52388f = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("message").e(this.f52383a);
        if (this.f52384b != null) {
            interfaceC4813r1.d("contact_email").e(this.f52384b);
        }
        if (this.f52385c != null) {
            interfaceC4813r1.d("name").e(this.f52385c);
        }
        if (this.f52386d != null) {
            interfaceC4813r1.d("associated_event_id");
            this.f52386d.serialize(interfaceC4813r1, iLogger);
        }
        if (this.f52387e != null) {
            interfaceC4813r1.d("replay_id");
            this.f52387e.serialize(interfaceC4813r1, iLogger);
        }
        if (this.f52388f != null) {
            interfaceC4813r1.d(EventKeys.URL).e(this.f52388f);
        }
        Map map = this.f52389g;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52389g.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public String toString() {
        return "Feedback{message='" + this.f52383a + "', contactEmail='" + this.f52384b + "', name='" + this.f52385c + "', associatedEventId=" + this.f52386d + ", replayId=" + this.f52387e + ", url='" + this.f52388f + "', unknown=" + this.f52389g + '}';
    }

    public i(i iVar) {
        this.f52383a = iVar.f52383a;
        this.f52384b = iVar.f52384b;
        this.f52385c = iVar.f52385c;
        this.f52386d = iVar.f52386d;
        this.f52387e = iVar.f52387e;
        this.f52388f = iVar.f52388f;
        this.f52389g = AbstractC4845c.b(iVar.f52389g);
    }
}
