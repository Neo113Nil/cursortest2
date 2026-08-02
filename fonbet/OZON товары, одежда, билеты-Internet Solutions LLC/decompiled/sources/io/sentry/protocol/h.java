package io.sentry.protocol;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f68232a;

    /* renamed from: b, reason: collision with root package name */
    private String f68233b;

    /* renamed from: c, reason: collision with root package name */
    private String f68234c;

    /* renamed from: d, reason: collision with root package name */
    private t f68235d;

    /* renamed from: e, reason: collision with root package name */
    private t f68236e;

    /* renamed from: f, reason: collision with root package name */
    private String f68237f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractMap f68238g;

    public static final class a implements InterfaceC7174n0<h> {
        @NotNull
        public static h b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            t tVar = null;
            t tVar2 = null;
            String str4 = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "associated_event_id":
                        tVar = t.a.b(interfaceC7131c1);
                        break;
                    case "replay_id":
                        tVar2 = t.a.b(interfaceC7131c1);
                        break;
                    case "url":
                        str4 = interfaceC7131c1.k0();
                        break;
                    case "name":
                        str3 = interfaceC7131c1.k0();
                        break;
                    case "contact_email":
                        str2 = interfaceC7131c1.k0();
                        break;
                    case "message":
                        str = interfaceC7131c1.k0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            interfaceC7131c1.endObject();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.a(I2.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            h hVar = new h(str);
            hVar.f68233b = str2;
            hVar.f68234c = str3;
            hVar.f68235d = tVar;
            hVar.f68236e = tVar2;
            hVar.f68237f = str4;
            hVar.f68238g = hashMap;
            return hVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ h a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public h(@NotNull String str) {
        if (str.length() > 4096) {
            this.f68232a = str.substring(0, 4096);
        } else {
            this.f68232a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return io.sentry.util.p.a(this.f68232a, hVar.f68232a) && io.sentry.util.p.a(this.f68233b, hVar.f68233b) && io.sentry.util.p.a(this.f68234c, hVar.f68234c) && io.sentry.util.p.a(this.f68235d, hVar.f68235d) && io.sentry.util.p.a(this.f68236e, hVar.f68236e) && io.sentry.util.p.a(this.f68237f, hVar.f68237f) && io.sentry.util.p.a(this.f68238g, hVar.f68238g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68232a, this.f68233b, this.f68234c, this.f68235d, this.f68236e, this.f68237f, this.f68238g});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("message");
        c7212v0.p(this.f68232a);
        if (this.f68233b != null) {
            c7212v0.g("contact_email");
            c7212v0.p(this.f68233b);
        }
        if (this.f68234c != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68234c);
        }
        if (this.f68235d != null) {
            c7212v0.g("associated_event_id");
            this.f68235d.serialize(c7212v0, iLogger);
        }
        if (this.f68236e != null) {
            c7212v0.g("replay_id");
            this.f68236e.serialize(c7212v0, iLogger);
        }
        if (this.f68237f != null) {
            c7212v0.g(ImagesContract.URL);
            c7212v0.p(this.f68237f);
        }
        AbstractMap abstractMap = this.f68238g;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.f68238g.get(str);
                c7212v0.g(str);
                c7212v0.m(iLogger, obj);
            }
        }
        c7212v0.d();
    }

    public final String toString() {
        return "Feedback{message='" + this.f68232a + "', contactEmail='" + this.f68233b + "', name='" + this.f68234c + "', associatedEventId=" + this.f68235d + ", replayId=" + this.f68236e + ", url='" + this.f68237f + "', unknown=" + this.f68238g + '}';
    }

    public h(@NotNull h hVar) {
        this.f68232a = hVar.f68232a;
        this.f68233b = hVar.f68233b;
        this.f68234c = hVar.f68234c;
        this.f68235d = hVar.f68235d;
        this.f68236e = hVar.f68236e;
        this.f68237f = hVar.f68237f;
        this.f68238g = io.sentry.util.c.a(hVar.f68238g);
    }
}
