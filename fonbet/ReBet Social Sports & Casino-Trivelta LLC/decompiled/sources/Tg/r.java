package Tg;

import Ph.C0;
import Ph.F0;
import Ph.InterfaceC1456i0;
import fh.AbstractC4283a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC7015a f11944a = AbstractC4283a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1456i0 f11945d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1456i0 interfaceC1456i0) {
            super(1);
            this.f11945d = interfaceC1456i0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            this.f11945d.dispose();
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ph.A f11946d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ph.A a10) {
            super(1);
            this.f11946d = a10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            if (th2 == null) {
                r.f11944a.b("Cancelling request because engine Job completed");
                this.f11946d.y1();
                return;
            }
            r.f11944a.b("Cancelling request because engine Job failed with error: " + th2);
            F0.c(this.f11946d, "Engine failed", th2);
        }
    }

    public static final void c(Ph.A a10, C0 c02) {
        a10.invokeOnCompletion(new a(c02.invokeOnCompletion(new b(a10))));
    }
}
