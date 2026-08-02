package jm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<Throwable, Unit> f70226a = a.f70227b;

    static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f70227b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable it = th2;
            Intrinsics.checkNotNullParameter(it, "it");
            throw new IllegalStateException("Error not implemented");
        }
    }

    @NotNull
    public static final Function1<Throwable, Unit> a() {
        return f70226a;
    }
}
