package io.sentry;

import com.facebook.react.modules.dialog.AlertFragment;
import io.sentry.C4798p3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4815r3 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public List f52552a;

    /* renamed from: b, reason: collision with root package name */
    public Map f52553b;

    /* renamed from: io.sentry.r3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4815r3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            List list = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(AlertFragment.ARG_ITEMS)) {
                    list = interfaceC4809q1.P1(iLogger, new C4798p3.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            interfaceC4809q1.t();
            if (list != null) {
                C4815r3 c4815r3 = new C4815r3(list);
                c4815r3.b(hashMap);
                return c4815r3;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.b(EnumC4788n3.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C4815r3(List list) {
        this.f52552a = list;
    }

    public List a() {
        return this.f52552a;
    }

    public void b(Map map) {
        this.f52553b = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(AlertFragment.ARG_ITEMS).j(iLogger, this.f52552a);
        Map map = this.f52553b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52553b.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
