package io.sentry.protocol;

import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52480a;

    /* renamed from: b, reason: collision with root package name */
    public String f52481b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52482c;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("name")) {
                    str = interfaceC4809q1.M0();
                } else if (f02.equals("version")) {
                    str2 = interfaceC4809q1.M0();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            interfaceC4809q1.t();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 != null) {
                v vVar = new v(str, str2);
                vVar.c(hashMap);
                return vVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.b(EnumC4788n3.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public v(String str, String str2) {
        this.f52480a = (String) io.sentry.util.w.c(str, "name is required.");
        this.f52481b = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public String a() {
        return this.f52480a;
    }

    public String b() {
        return this.f52481b;
    }

    public void c(Map map) {
        this.f52482c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (Objects.equals(this.f52480a, vVar.f52480a) && Objects.equals(this.f52481b, vVar.f52481b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f52480a, this.f52481b);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("name").e(this.f52480a);
        interfaceC4813r1.d("version").e(this.f52481b);
        Map map = this.f52482c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52482c.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
