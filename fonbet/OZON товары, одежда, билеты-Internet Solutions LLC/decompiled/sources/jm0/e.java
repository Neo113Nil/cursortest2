package jm0;

import Sc.InterfaceC4008j;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70214a = Sc.k.b(c.f70221b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70215b = Sc.k.b(d.f70222b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70216c = Sc.k.b(b.f70220b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70217d = Sc.k.b(a.f70219b);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f70218e = 0;

    static final class a extends AbstractC7737t implements Function0<jm0.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f70219b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final jm0.d invoke() {
            return new jm0.d();
        }
    }

    static final class b extends AbstractC7737t implements Function0<g> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f70220b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final g invoke() {
            return new g(new Handler(Looper.getMainLooper()));
        }
    }

    static final class c extends AbstractC7737t implements Function0<ScheduledThreadPoolExecutor> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f70221b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ScheduledThreadPoolExecutor invoke() {
            return new ScheduledThreadPoolExecutor(1);
        }
    }

    static final class d extends AbstractC7737t implements Function0<ThreadPoolExecutor> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f70222b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    }

    static {
        int i11 = l.f70229a;
    }

    public static final ScheduledThreadPoolExecutor a() {
        return (ScheduledThreadPoolExecutor) f70214a.getValue();
    }

    public static final ThreadPoolExecutor b() {
        return (ThreadPoolExecutor) f70215b.getValue();
    }

    @NotNull
    public static jm0.b c() {
        synchronized (h.f70225a) {
        }
        return (jm0.b) f70217d.getValue();
    }

    @NotNull
    public static jm0.b d() {
        synchronized (h.f70225a) {
        }
        return (jm0.b) f70216c.getValue();
    }
}
