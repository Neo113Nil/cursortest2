package p5;

import L5.ScreenshotContext;
import Q5.ViewContext;
import com.twilio.voice.EventKeys;
import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;

/* renamed from: p5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6048c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f63047a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6207a f63048b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f63049c;

    public C6048c(InterfaceC6300r tracer, InterfaceC6207a clock, N5.a configurationsManager) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        this.f63047a = tracer;
        this.f63048b = clock;
        this.f63049c = configurationsManager;
    }

    public final InterfaceC6290h a(C6047b input) {
        Intrinsics.checkNotNullParameter(input, "input");
        E5.b.f3006a.a("creating span for event type: " + input.a());
        AbstractC4212b b10 = F5.b.b();
        ViewContext g10 = input.g();
        if (g10 == null) {
            g10 = this.f63049c.k().c().w();
        }
        b10.a();
        String b11 = b10.b(ViewContext.INSTANCE.serializer(), g10);
        Long e10 = input.e();
        long longValue = e10 != null ? e10.longValue() : this.f63048b.a();
        String f10 = this.f63049c.f();
        long d10 = this.f63049c.k().d();
        InterfaceC6290h a10 = this.f63047a.a(input.a()).a();
        a10.h("type", input.a());
        a10.h(EventKeys.TIMESTAMP, String.valueOf(longValue));
        a10.h("current_view_context", b11);
        a10.h("session_id", f10);
        a10.k("session_creation_time", d10);
        if (input.b() != null) {
            AbstractC4212b b12 = F5.b.b();
            ScreenshotContext b13 = input.b();
            b12.a();
            a10.h("screenshot_context", b12.b(ScreenshotContext.INSTANCE.serializer(), b13));
        }
        a10.k("severity", input.c().getLevel());
        String f11 = input.f();
        if (f11 != null) {
            a10.h("trace_id", f11);
        }
        String d11 = input.d();
        if (d11 != null) {
            a10.h("span_id", d11);
        }
        Intrinsics.checkNotNull(a10);
        return a10;
    }
}
