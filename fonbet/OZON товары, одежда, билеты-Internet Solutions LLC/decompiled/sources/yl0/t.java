package yl0;

import Sc.InterfaceC4008j;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f106799a = Sc.k.b(a.f106801b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f106800b = Sc.k.b(b.f106802b);

    static final class a extends AbstractC7737t implements Function0<ExecutorService> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f106801b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(1);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Handler> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f106802b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @NotNull
    public static ExecutorService a() {
        Object value = f106799a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-executorService>(...)");
        return (ExecutorService) value;
    }

    @NotNull
    public static Handler b() {
        return (Handler) f106800b.getValue();
    }
}
