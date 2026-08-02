package r20;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: r20.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9165b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f82863a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f82864b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82865c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f82866d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f82867e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f82868f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f82869g;

    public C9165b(Function1 onCleanAppData, Function1 onCookiesClean, boolean z11) {
        Intrinsics.checkNotNullParameter(onCleanAppData, "onCleanAppData");
        Intrinsics.checkNotNullParameter(onCookiesClean, "onCookiesClean");
        Intrinsics.checkNotNullParameter(onCleanAppData, "onCleanAppData");
        Intrinsics.checkNotNullParameter(onCookiesClean, "onCookiesClean");
        this.f82863a = z11;
        this.f82864b = true;
        this.f82865c = true;
        this.f82866d = true;
        this.f82867e = onCleanAppData;
        this.f82868f = onCookiesClean;
        this.f82869g = true;
    }

    @NotNull
    public final Function1<kotlin.coroutines.d<? super Unit>, Object> a() {
        return this.f82867e;
    }

    public final boolean b() {
        return this.f82863a;
    }

    public final boolean c() {
        return this.f82865c;
    }

    public final boolean d() {
        return this.f82864b;
    }

    public final boolean e() {
        return this.f82866d;
    }

    public final boolean f() {
        return this.f82869g;
    }
}
