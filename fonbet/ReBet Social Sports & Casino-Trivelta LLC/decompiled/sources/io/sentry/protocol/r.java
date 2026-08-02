package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52460a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f52461b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f52462c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f52463d;

    /* renamed from: e, reason: collision with root package name */
    public Map f52464e;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            r rVar = new r();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "sdk_name":
                        rVar.f52460a = interfaceC4809q1.a1();
                        break;
                    case "version_patchlevel":
                        rVar.f52463d = interfaceC4809q1.Q0();
                        break;
                    case "version_major":
                        rVar.f52461b = interfaceC4809q1.Q0();
                        break;
                    case "version_minor":
                        rVar.f52462c = interfaceC4809q1.Q0();
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
            rVar.e(hashMap);
            return rVar;
        }
    }

    public void e(Map map) {
        this.f52464e = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52460a != null) {
            interfaceC4813r1.d("sdk_name").e(this.f52460a);
        }
        if (this.f52461b != null) {
            interfaceC4813r1.d("version_major").i(this.f52461b);
        }
        if (this.f52462c != null) {
            interfaceC4813r1.d("version_minor").i(this.f52462c);
        }
        if (this.f52463d != null) {
            interfaceC4813r1.d("version_patchlevel").i(this.f52463d);
        }
        Map map = this.f52464e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52464e.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
