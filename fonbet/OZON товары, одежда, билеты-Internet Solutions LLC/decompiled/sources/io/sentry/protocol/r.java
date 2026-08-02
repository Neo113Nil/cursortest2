package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7212v0;
import io.sentry.G2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.protocol.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f68313a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f68314b;

    /* renamed from: c, reason: collision with root package name */
    private CopyOnWriteArraySet f68315c;

    /* renamed from: d, reason: collision with root package name */
    private CopyOnWriteArraySet f68316d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f68317e;

    public static final class a implements InterfaceC7174n0<r> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final r a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            interfaceC7131c1.beginObject();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "name":
                        str = interfaceC7131c1.nextString();
                        break;
                    case "version":
                        str2 = interfaceC7131c1.nextString();
                        break;
                    case "packages":
                        ArrayList J02 = interfaceC7131c1.J0(iLogger, new u.a());
                        if (J02 == null) {
                            break;
                        } else {
                            arrayList.addAll(J02);
                            break;
                        }
                    case "integrations":
                        List list = (List) interfaceC7131c1.U1();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(I2.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.a(I2.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            r rVar = new r(str, str2);
            rVar.f68315c = new CopyOnWriteArraySet(arrayList);
            rVar.f68316d = new CopyOnWriteArraySet(arrayList2);
            rVar.f(hashMap);
            return rVar;
        }
    }

    public r(@NotNull String str, @NotNull String str2) {
        this.f68313a = str;
        this.f68314b = str2;
    }

    @NotNull
    public final String c() {
        return this.f68313a;
    }

    @NotNull
    public final String d() {
        return this.f68314b;
    }

    public final void e(@NotNull String str) {
        io.sentry.util.p.b(str, "name is required.");
        this.f68313a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f68313a.equals(rVar.f68313a) && this.f68314b.equals(rVar.f68314b)) {
                return true;
            }
        }
        return false;
    }

    public final void f(Map<String, Object> map) {
        this.f68317e = (HashMap) map;
    }

    public final void g(@NotNull String str) {
        io.sentry.util.p.b(str, "version is required.");
        this.f68314b = str;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68313a, this.f68314b});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c7212v0.p(this.f68313a);
        c7212v0.g("version");
        c7212v0.p(this.f68314b);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f68315c;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = G2.d().f();
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f68316d;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = G2.d().e();
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            c7212v0.g("packages");
            c7212v0.m(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            c7212v0.g("integrations");
            c7212v0.m(iLogger, copyOnWriteArraySet2);
        }
        HashMap hashMap = this.f68317e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68317e, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
