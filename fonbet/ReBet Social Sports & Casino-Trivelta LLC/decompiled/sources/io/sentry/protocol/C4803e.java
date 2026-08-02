package io.sentry.protocol;

import io.sentry.F3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4803e implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public r f52341a;

    /* renamed from: b, reason: collision with root package name */
    public List f52342b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52343c;

    /* renamed from: io.sentry.protocol.e$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4803e a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            C4803e c4803e = new C4803e();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("images")) {
                    c4803e.f52342b = interfaceC4809q1.P1(iLogger, new DebugImage.a());
                } else if (f02.equals("sdk_info")) {
                    c4803e.f52341a = (r) interfaceC4809q1.x0(iLogger, new r.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            interfaceC4809q1.t();
            c4803e.f(hashMap);
            return c4803e;
        }
    }

    public static C4803e c(C4803e c4803e, F3 f32) {
        ArrayList arrayList = new ArrayList();
        if (f32.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(f32.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : f32.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c4803e == null) {
            c4803e = new C4803e();
        }
        if (c4803e.d() == null) {
            c4803e.e(arrayList);
            return c4803e;
        }
        c4803e.d().addAll(arrayList);
        return c4803e;
    }

    public List d() {
        return this.f52342b;
    }

    public void e(List list) {
        this.f52342b = list != null ? new ArrayList(list) : null;
    }

    public void f(Map map) {
        this.f52343c = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52341a != null) {
            interfaceC4813r1.d("sdk_info").j(iLogger, this.f52341a);
        }
        if (this.f52342b != null) {
            interfaceC4813r1.d("images").j(iLogger, this.f52342b);
        }
        Map map = this.f52343c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52343c.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
