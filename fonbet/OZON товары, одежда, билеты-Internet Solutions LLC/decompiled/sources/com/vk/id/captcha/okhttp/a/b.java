package com.vk.id.captcha.okhttp.a;

import We.B;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4870l;
import We.L;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
final class b implements B.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G f60571a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B.a f60572b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<B> f60573c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull G g10, @NotNull B.a aVar, @NotNull List<? extends B> list) {
        Intrinsics.checkNotNullParameter(g10, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f60571a = g10;
        this.f60572b = aVar;
        this.f60573c = list;
    }

    @Override // We.B.a
    @NotNull
    public final InterfaceC4865g call() {
        return this.f60572b.call();
    }

    @Override // We.B.a
    public final InterfaceC4870l connection() {
        return this.f60572b.connection();
    }

    @Override // We.B.a
    @NotNull
    public final L proceed(@NotNull G g10) {
        Intrinsics.checkNotNullParameter(g10, "");
        if (this.f60573c.isEmpty()) {
            return this.f60572b.proceed(g10);
        }
        B b11 = this.f60573c.get(0);
        List<B> list = this.f60573c;
        return b11.intercept(new b(g10, this.f60572b, list.subList(1, list.size())));
    }

    @Override // We.B.a
    public final int readTimeoutMillis() {
        return this.f60572b.readTimeoutMillis();
    }

    @Override // We.B.a
    @NotNull
    public final G request() {
        return this.f60571a;
    }

    @Override // We.B.a
    public final /* synthetic */ B.a withReadTimeout(int i11, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        return new b(this.f60571a, this.f60572b.withReadTimeout(i11, timeUnit), this.f60573c);
    }

    @Override // We.B.a
    public final /* synthetic */ B.a withWriteTimeout(int i11, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        return new b(this.f60571a, this.f60572b.withWriteTimeout(i11, timeUnit), this.f60573c);
    }

    @Override // We.B.a
    public final int writeTimeoutMillis() {
        return this.f60572b.writeTimeoutMillis();
    }
}
