package ru.ozon.app.android.composer.network.cache.interceptor.cacheError;

import Sc.r;
import Sc.s;
import We.B;
import We.G;
import We.L;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.OzonLogger;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u0000 \u00132\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "", "<init>", "()V", "LWe/B$a;", "LWe/L;", "execute", "(LWe/B$a;)LWe/L;", "", "", "errors", "", "removeErrors", "(Ljava/util/List;)V", "Lru/ozon/app/android/logger/OzonLogger;", "logErrors", "(Lru/ozon/app/android/logger/OzonLogger;Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "Companion", "Disabled", "Enabled", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CatchErrorsStrategy {

    @NotNull
    protected static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy$Companion;", "", "<init>", "()V", "LOG_ERRORS_TAG", "", "ERRORS_CHECK_TAG", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy$Disabled;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "<init>", "()V", "LWe/B$a;", "LWe/L;", "execute", "(LWe/B$a;)LWe/L;", "", "", "errors", "", "removeErrors", "(Ljava/util/List;)V", "Lru/ozon/app/android/logger/OzonLogger;", "logErrors", "(Lru/ozon/app/android/logger/OzonLogger;Ljava/util/List;)V", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Disabled extends CatchErrorsStrategy {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        @NotNull
        private static final List<Throwable> errors = K.f71697a;
        public static final int $stable = 8;

        private Disabled() {
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        @NotNull
        public L execute(@NotNull B.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            return aVar.proceed(aVar.request());
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        @NotNull
        public List<Throwable> getErrors() {
            return errors;
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        public void logErrors(@NotNull OzonLogger ozonLogger, @NotNull List<? extends Throwable> errors2) {
            Intrinsics.checkNotNullParameter(ozonLogger, "<this>");
            Intrinsics.checkNotNullParameter(errors2, "errors");
            ozonLogger.setTag("errors", "Error catching disabled");
            ozonLogger.log(4, "Check errors", "Error catching disabled");
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        public void removeErrors(@NotNull List<? extends Throwable> errors2) {
            Intrinsics.checkNotNullParameter(errors2, "errors");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy$Enabled;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "<init>", "()V", "LWe/B$a;", "LWe/L;", "execute", "(LWe/B$a;)LWe/L;", "", "", "errors", "", "removeErrors", "(Ljava/util/List;)V", "Lru/ozon/app/android/logger/OzonLogger;", "logErrors", "(Lru/ozon/app/android/logger/OzonLogger;Ljava/util/List;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Enabled extends CatchErrorsStrategy {

        @NotNull
        private List<? extends Throwable> errors = K.f71697a;

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        @NotNull
        public L execute(@NotNull B.a aVar) {
            Object a11;
            Object a12;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            try {
                r.Companion companion = r.INSTANCE;
                a11 = aVar.request();
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            Throwable b11 = r.b(a11);
            if (b11 != null) {
                this.errors = C7714v.q0(new Exception("request() failed \ncause = " + b11, b11), getErrors());
            }
            s.b(a11);
            G g10 = (G) a11;
            try {
                a12 = aVar.proceed(g10);
            } catch (Throwable th3) {
                r.Companion companion3 = r.INSTANCE;
                a12 = s.a(th3);
            }
            Throwable b12 = r.b(a12);
            if (b12 != null) {
                this.errors = C7714v.q0(new Exception("url = " + g10.j() + " \ncause = " + b12, b12), getErrors());
            }
            s.b(a12);
            return (L) a12;
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        @NotNull
        public List<Throwable> getErrors() {
            return this.errors;
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        public void logErrors(@NotNull OzonLogger ozonLogger, @NotNull List<? extends Throwable> errors) {
            Intrinsics.checkNotNullParameter(ozonLogger, "<this>");
            Intrinsics.checkNotNullParameter(errors, "errors");
            if (!C7714v.s(errors)) {
                ozonLogger.setTag("errors", "No errors");
                ozonLogger.log(4, "Check errors", "No caught errors");
            } else {
                ozonLogger.setTag("errors", "Has errors");
                Iterator<? extends Throwable> it = errors.iterator();
                while (it.hasNext()) {
                    ozonLogger.log(6, "Check errors", it.next().toString());
                }
            }
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy
        public void removeErrors(@NotNull List<? extends Throwable> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.errors = C7714v.l0(getErrors(), errors);
        }
    }

    @NotNull
    public abstract L execute(@NotNull B.a aVar);

    @NotNull
    public abstract List<Throwable> getErrors();

    public abstract void logErrors(@NotNull OzonLogger ozonLogger, @NotNull List<? extends Throwable> list);

    public abstract void removeErrors(@NotNull List<? extends Throwable> errors);
}
