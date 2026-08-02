package c5;

import I5.a;
import L5.ScreenshotContext;
import Ph.P;
import Q5.b;
import android.app.Application;
import b5.c;
import b5.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6300r;
import s5.C6339a;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2889b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f27601a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f27602b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f27603c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f27604d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f27605e;

    /* renamed from: f, reason: collision with root package name */
    public final P f27606f;

    /* renamed from: g, reason: collision with root package name */
    public final d f27607g;

    public C2889b(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f27601a = tracer;
        this.f27602b = application;
        this.f27603c = configurationsManager;
        this.f27604d = clock;
        this.f27605e = spanFactory;
        this.f27606f = scope;
        this.f27607g = new d() { // from class: c5.a
            @Override // b5.d
            public final void a(Object obj) {
                C2889b.r(C2889b.this, (ScreenshotContext) obj);
            }
        };
    }

    public static final void r(C2889b c2889b, ScreenshotContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c2889b.B(it);
    }

    public final void B(ScreenshotContext screenshot) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        E5.b.f3006a.f("reporting screenshot: " + screenshot);
        k().a(new C6047b(a.j.f5360c.a(), b.f.f9377b, null, null, screenshot, null, null, 108, null)).end();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E5.b.f3006a.f("Screenshot instrumentation stopped");
    }

    public C6048c k() {
        return this.f27605e;
    }

    @Override // b5.c
    public void r0() {
        E5.b.f3006a.f("Screenshot instrumentation started");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2889b(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}
