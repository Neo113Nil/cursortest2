package io.sentry;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class w3 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.t f68656a;

    /* renamed from: b, reason: collision with root package name */
    private String f68657b;

    /* renamed from: c, reason: collision with root package name */
    private String f68658c;

    /* renamed from: d, reason: collision with root package name */
    private String f68659d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f68660e;

    public static final class a implements InterfaceC7174n0<w3> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final w3 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            io.sentry.protocol.t tVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "comments":
                        str3 = interfaceC7131c1.k0();
                        break;
                    case "name":
                        str = interfaceC7131c1.k0();
                        break;
                    case "email":
                        str2 = interfaceC7131c1.k0();
                        break;
                    case "event_id":
                        tVar = t.a.b(interfaceC7131c1);
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
            if (tVar != null) {
                w3 w3Var = new w3(tVar, str, str2, str3);
                w3Var.a(hashMap);
                return w3Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.a(I2.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public w3(io.sentry.protocol.t tVar, String str, String str2, String str3) {
        this.f68656a = tVar;
        this.f68657b = str;
        this.f68658c = str2;
        this.f68659d = str3;
    }

    public final void a(Map<String, Object> map) {
        this.f68660e = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("event_id");
        this.f68656a.serialize(c7212v0, iLogger);
        String str = this.f68657b;
        if (str != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(str);
        }
        String str2 = this.f68658c;
        if (str2 != null) {
            c7212v0.g(Scopes.EMAIL);
            c7212v0.p(str2);
        }
        String str3 = this.f68659d;
        if (str3 != null) {
            c7212v0.g("comments");
            c7212v0.p(str3);
        }
        HashMap hashMap = this.f68660e;
        if (hashMap != null) {
            for (String str4 : hashMap.keySet()) {
                I1.w.e(this.f68660e, str4, c7212v0, str4, iLogger);
            }
        }
        c7212v0.d();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFeedback{eventId=");
        sb2.append(this.f68656a);
        sb2.append(", name='");
        sb2.append(this.f68657b);
        sb2.append("', email='");
        sb2.append(this.f68658c);
        sb2.append("', comments='");
        return C.o0.c(sb2, this.f68659d, "'}");
    }
}
