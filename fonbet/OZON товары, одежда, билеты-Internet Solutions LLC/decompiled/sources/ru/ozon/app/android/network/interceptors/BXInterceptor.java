package ru.ozon.app.android.network.interceptors;

import Lm0.a;
import We.B;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4870l;
import We.L;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LWe/B;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "onIntercept", "Companion", "LogChain", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BXInterceptor implements B {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final boolean logDisabled = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/network/interceptors/BXInterceptor$Companion;", "", "<init>", "()V", "", "MAX_INTERCEPTOR_DURATION_TIME_MILLIS", "J", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0013J \u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/network/interceptors/BXInterceptor$LogChain;", "LWe/B$a;", "base", "<init>", "(LWe/B$a;)V", "LWe/G;", "request", "LWe/L;", "proceed", "(LWe/G;)LWe/L;", "LWe/g;", "call", "()LWe/g;", "LWe/l;", "connection", "()LWe/l;", "", "readTimeoutMillis", "()I", "()LWe/G;", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withReadTimeout", "(ILjava/util/concurrent/TimeUnit;)LWe/B$a;", "withWriteTimeout", "writeTimeoutMillis", "LWe/B$a;", "", "proceedTimeMillis", "J", "getProceedTimeMillis", "()J", "setProceedTimeMillis", "(J)V", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    private static final class LogChain implements B.a {

        @NotNull
        private final B.a base;
        private long proceedTimeMillis;

        public LogChain(@NotNull B.a base) {
            Intrinsics.checkNotNullParameter(base, "base");
            this.base = base;
        }

        @Override // We.B.a
        @NotNull
        public InterfaceC4865g call() {
            return this.base.call();
        }

        @Override // We.B.a
        public InterfaceC4870l connection() {
            return this.base.connection();
        }

        public final long getProceedTimeMillis() {
            return this.proceedTimeMillis;
        }

        @Override // We.B.a
        @NotNull
        public L proceed(@NotNull G request) {
            Intrinsics.checkNotNullParameter(request, "request");
            long currentTimeMillis = System.currentTimeMillis();
            L proceed = this.base.proceed(request);
            this.proceedTimeMillis = System.currentTimeMillis() - currentTimeMillis;
            return proceed;
        }

        @Override // We.B.a
        public int readTimeoutMillis() {
            return this.base.readTimeoutMillis();
        }

        @Override // We.B.a
        @NotNull
        public G request() {
            return this.base.request();
        }

        @Override // We.B.a
        @NotNull
        public B.a withReadTimeout(int timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this.base.withReadTimeout(timeout, unit);
        }

        @Override // We.B.a
        @NotNull
        public B.a withWriteTimeout(int timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this.base.withWriteTimeout(timeout, unit);
        }

        @Override // We.B.a
        public int writeTimeoutMillis() {
            return this.base.writeTimeoutMillis();
        }
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (logDisabled) {
            return onIntercept(chain);
        }
        LogChain logChain = new LogChain(chain);
        long currentTimeMillis = System.currentTimeMillis();
        L onIntercept = onIntercept(logChain);
        long currentTimeMillis2 = (System.currentTimeMillis() - currentTimeMillis) - logChain.getProceedTimeMillis();
        if (currentTimeMillis2 > 5) {
            a.f17149a.d("Interceptor " + getClass() + " " + currentTimeMillis2 + " ms", new Object[0]);
        }
        return onIntercept;
    }

    @NotNull
    protected abstract L onIntercept(@NotNull B.a chain);
}
