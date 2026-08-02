package io.sentry.protocol;

import io.sentry.C4778l3;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class s implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52465a;

    /* renamed from: b, reason: collision with root package name */
    public String f52466b;

    /* renamed from: c, reason: collision with root package name */
    public Set f52467c;

    /* renamed from: d, reason: collision with root package name */
    public Set f52468d;

    /* renamed from: e, reason: collision with root package name */
    public Map f52469e;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            interfaceC4809q1.m();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "name":
                        str = interfaceC4809q1.M0();
                        break;
                    case "version":
                        str2 = interfaceC4809q1.M0();
                        break;
                    case "packages":
                        List P12 = interfaceC4809q1.P1(iLogger, new v.a());
                        if (P12 == null) {
                            break;
                        } else {
                            arrayList.addAll(P12);
                            break;
                        }
                    case "integrations":
                        List list = (List) interfaceC4809q1.H1();
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
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            interfaceC4809q1.t();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            s sVar = new s(str, str2);
            sVar.f52467c = new CopyOnWriteArraySet(arrayList);
            sVar.f52468d = new CopyOnWriteArraySet(arrayList2);
            sVar.i(hashMap);
            return sVar;
        }
    }

    public s(String str, String str2) {
        this.f52465a = (String) io.sentry.util.w.c(str, "name is required.");
        this.f52466b = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public static s k(s sVar, String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        if (sVar == null) {
            return new s(str, str2);
        }
        sVar.h(str);
        sVar.j(str2);
        return sVar;
    }

    public void c(String str, String str2) {
        C4778l3.d().b(str, str2);
    }

    public Set d() {
        Set set = this.f52468d;
        return set != null ? set : C4778l3.d().e();
    }

    public String e() {
        return this.f52465a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f52465a.equals(sVar.f52465a) && this.f52466b.equals(sVar.f52466b)) {
                return true;
            }
        }
        return false;
    }

    public Set f() {
        Set set = this.f52467c;
        return set != null ? set : C4778l3.d().f();
    }

    public String g() {
        return this.f52466b;
    }

    public void h(String str) {
        this.f52465a = (String) io.sentry.util.w.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52465a, this.f52466b);
    }

    public void i(Map map) {
        this.f52469e = map;
    }

    public void j(String str) {
        this.f52466b = (String) io.sentry.util.w.c(str, "version is required.");
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("name").e(this.f52465a);
        interfaceC4813r1.d("version").e(this.f52466b);
        Set f10 = f();
        Set d10 = d();
        if (!f10.isEmpty()) {
            interfaceC4813r1.d("packages").j(iLogger, f10);
        }
        if (!d10.isEmpty()) {
            interfaceC4813r1.d("integrations").j(iLogger, d10);
        }
        Map map = this.f52469e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52469e.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
