package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class C implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f52284a;

    @Nullable
    private String[] activeProfiles;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            C c10 = new C();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("active_profiles")) {
                    List list = (List) interfaceC4809q1.H1();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c10.activeProfiles = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            c10.b(concurrentHashMap);
            interfaceC4809q1.t();
            return c10;
        }
    }

    public C() {
    }

    public void b(Map map) {
        this.f52284a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.activeProfiles, ((C) obj).activeProfiles);
    }

    public int hashCode() {
        return Arrays.hashCode(this.activeProfiles);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.activeProfiles != null) {
            interfaceC4813r1.d("active_profiles").j(iLogger, this.activeProfiles);
        }
        Map map = this.f52284a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52284a.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public C(C c10) {
        this.activeProfiles = c10.activeProfiles;
        this.f52284a = AbstractC4845c.b(c10.f52284a);
    }
}
