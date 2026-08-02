package ru.ozon.app.android.composer.throttle;

import BF.a;
import CJ.b;
import Nc.C3669c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\rR,\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "", "<init>", "()V", "", "throttle", "LNc/c;", "Lkotlin/Function0;", "", "getThrottleSubject", "(J)LNc/c;", "block", "run", "(JLkotlin/jvm/functions/Function0;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "throttleSubjects", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandlersInhibitor {

    @NotNull
    private final ConcurrentHashMap<Long, C3669c<Function0<Unit>>> throttleSubjects = new ConcurrentHashMap<>();

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/throttle/HandlersInhibitor$Companion;", "", "<init>", "()V", "THROTTLE_TIME", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final C3669c<Function0<Unit>> getThrottleSubject(long throttle) {
        ConcurrentHashMap<Long, C3669c<Function0<Unit>>> concurrentHashMap = this.throttleSubjects;
        Long valueOf = Long.valueOf(throttle);
        C3669c<Function0<Unit>> c3669c = concurrentHashMap.get(valueOf);
        if (c3669c == null) {
            c3669c = C3669c.d();
            c3669c.throttleFirst(throttle, TimeUnit.MILLISECONDS).serialize().subscribe(new b(HandlersInhibitor$getThrottleSubject$1$1$1.INSTANCE, 3), new a(new HandlersInhibitor$getThrottleSubject$1$1$2(Lm0.a.f17149a), 3));
            C3669c<Function0<Unit>> putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, c3669c);
            if (putIfAbsent != null) {
                c3669c = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(c3669c, "getOrPut(...)");
        return c3669c;
    }

    public static /* synthetic */ void run$default(HandlersInhibitor handlersInhibitor, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        handlersInhibitor.run(j11, function0);
    }

    public final void run(long throttle, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        getThrottleSubject(throttle).onNext(block);
    }
}
