package ru.ozon.app.android.network.di.module;

import Ld0.c;
import Lm0.a;
import Tc.b;
import We.B;
import Xe.C4889a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nf.C8590c;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8924g;
import pf0.h;
import ru.ozon.app.android.network.history.NetworkHistoryInterceptor;
import ru.ozon.app.android.network.interceptors.AutoTestTraceIdInterceptor;
import ru.ozon.app.android.network.interceptors.CustomHeadersInterceptor;
import ru.ozon.app.android.network.interceptors.DomainCheckInterceptor;
import ru.ozon.app.android.network.interceptors.DynamicUrlInterceptor;
import ru.ozon.app.android.network.interceptors.LongPollingTimeoutInterceptor;
import ru.ozon.app.android.network.interceptors.PageViewIdInterceptor;
import ru.ozon.app.android.network.interceptors.PreviousPageInterceptor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkInterceptorsModule;", "", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NetworkInterceptorsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\fJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013Ja\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\b\b\u0001\u0010!\u001a\u00020\n2\b\b\u0001\u0010\"\u001a\u00020\nH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(JE\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0007¢\u0006\u0004\b.\u0010/J9\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u00100\u001a\u00020\n2\u000e\b\u0001\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u00102\u001a\u00020\nH\u0007¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkInterceptorsModule$Companion;", "", "<init>", "()V", "Lnf/c;", "provideHttpLoggingInterceptor", "()Lnf/c;", "LOb0/a;", "ozonIdAppApi", "", "LWe/B;", "provideOzonIdInterceptors", "(LOb0/a;)Ljava/util/List;", "provideOzonIdNetworkInterceptors", "Lru/ozon/app/android/network/interceptors/LongPollingTimeoutInterceptor;", "timeoutInterceptor", "Lru/ozon/app/android/network/interceptors/DomainCheckInterceptor;", "domainCheckInterceptor", "provideLeadingHostInterceptors", "(Lru/ozon/app/android/network/interceptors/LongPollingTimeoutInterceptor;Lru/ozon/app/android/network/interceptors/DomainCheckInterceptor;)Ljava/util/List;", "Lru/ozon/app/android/network/interceptors/AutoTestTraceIdInterceptor;", "autoTestTraceIdInterceptor", "Lru/ozon/app/android/network/history/NetworkHistoryInterceptor;", "networkHistoryInterceptor", "Lru/ozon/app/android/network/interceptors/CustomHeadersInterceptor;", "customHeadersInterceptor", "Lru/ozon/app/android/network/interceptors/PreviousPageInterceptor;", "previousPageInterceptor", "Lru/ozon/app/android/network/interceptors/PageViewIdInterceptor;", "pageViewIdInterceptor", "Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;", "dynamicUrlInterceptor", "httpLoggingInterceptorWithLimits", "encodingInterceptor", "geoRequestsLogInterceptor", "provideTrailingHostInterceptors", "(Lru/ozon/app/android/network/interceptors/AutoTestTraceIdInterceptor;Lru/ozon/app/android/network/history/NetworkHistoryInterceptor;Lru/ozon/app/android/network/interceptors/CustomHeadersInterceptor;Lru/ozon/app/android/network/interceptors/PreviousPageInterceptor;Lru/ozon/app/android/network/interceptors/PageViewIdInterceptor;Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;Lnf/c;LWe/B;LWe/B;)Ljava/util/List;", "LLd0/c;", "limbDiStore", "provideDomainReachabilityInterceptor", "(LLd0/c;)LWe/B;", "leadingInterceptors", "ozonIdInterceptors", "trailingInterceptors", "provideMainInterceptors", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "provideAcceptEncodingInterceptor", "()LWe/B;", "logRequestsInterceptor", "ozonIdNetworkInterceptors", "domainReachabilityInterceptor", "provideNetworkInterceptors", "(LWe/B;Ljava/util/List;LWe/B;)Ljava/util/List;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final B provideAcceptEncodingInterceptor() {
            return C4889a.f34418a;
        }

        @NotNull
        public final B provideDomainReachabilityInterceptor(@NotNull c limbDiStore) {
            Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
            return ((InterfaceC8924g) limbDiStore.e(h.class)).u().d();
        }

        @NotNull
        public final C8590c provideHttpLoggingInterceptor() {
            C8590c c8590c = new C8590c(new NetworkInterceptorsModule$Companion$provideHttpLoggingInterceptor$1(a.f17149a), 2);
            c8590c.a(C8590c.a.HEADERS);
            return c8590c;
        }

        @NotNull
        public final List<B> provideLeadingHostInterceptors(@NotNull LongPollingTimeoutInterceptor timeoutInterceptor, @NotNull DomainCheckInterceptor domainCheckInterceptor) {
            Intrinsics.checkNotNullParameter(timeoutInterceptor, "timeoutInterceptor");
            Intrinsics.checkNotNullParameter(domainCheckInterceptor, "domainCheckInterceptor");
            return C7714v.b0(timeoutInterceptor, domainCheckInterceptor);
        }

        @NotNull
        public final List<B> provideMainInterceptors(@NotNull List<B> leadingInterceptors, @NotNull List<B> ozonIdInterceptors, @NotNull List<B> trailingInterceptors) {
            Intrinsics.checkNotNullParameter(leadingInterceptors, "leadingInterceptors");
            Intrinsics.checkNotNullParameter(ozonIdInterceptors, "ozonIdInterceptors");
            Intrinsics.checkNotNullParameter(trailingInterceptors, "trailingInterceptors");
            b builder = C7714v.B();
            builder.addAll(leadingInterceptors);
            builder.addAll(ozonIdInterceptors);
            builder.addAll(trailingInterceptors);
            Intrinsics.checkNotNullParameter(builder, "builder");
            return builder.B();
        }

        @NotNull
        public final List<B> provideNetworkInterceptors(@NotNull B logRequestsInterceptor, @NotNull List<B> ozonIdNetworkInterceptors, @NotNull B domainReachabilityInterceptor) {
            Intrinsics.checkNotNullParameter(logRequestsInterceptor, "logRequestsInterceptor");
            Intrinsics.checkNotNullParameter(ozonIdNetworkInterceptors, "ozonIdNetworkInterceptors");
            Intrinsics.checkNotNullParameter(domainReachabilityInterceptor, "domainReachabilityInterceptor");
            return C7714v.q0(domainReachabilityInterceptor, C7714v.p0(ozonIdNetworkInterceptors, C7714v.a0(logRequestsInterceptor)));
        }

        @NotNull
        public final List<B> provideOzonIdInterceptors(@NotNull Ob0.a ozonIdAppApi) {
            Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
            return ozonIdAppApi.getInterceptors();
        }

        @NotNull
        public final List<B> provideOzonIdNetworkInterceptors(@NotNull Ob0.a ozonIdAppApi) {
            Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
            return ozonIdAppApi.getNetworkInterceptors();
        }

        @NotNull
        public final List<B> provideTrailingHostInterceptors(@NotNull AutoTestTraceIdInterceptor autoTestTraceIdInterceptor, @NotNull NetworkHistoryInterceptor networkHistoryInterceptor, @NotNull CustomHeadersInterceptor customHeadersInterceptor, @NotNull PreviousPageInterceptor previousPageInterceptor, @NotNull PageViewIdInterceptor pageViewIdInterceptor, @NotNull DynamicUrlInterceptor dynamicUrlInterceptor, @NotNull C8590c httpLoggingInterceptorWithLimits, @NotNull B encodingInterceptor, @NotNull B geoRequestsLogInterceptor) {
            Intrinsics.checkNotNullParameter(autoTestTraceIdInterceptor, "autoTestTraceIdInterceptor");
            Intrinsics.checkNotNullParameter(networkHistoryInterceptor, "networkHistoryInterceptor");
            Intrinsics.checkNotNullParameter(customHeadersInterceptor, "customHeadersInterceptor");
            Intrinsics.checkNotNullParameter(previousPageInterceptor, "previousPageInterceptor");
            Intrinsics.checkNotNullParameter(pageViewIdInterceptor, "pageViewIdInterceptor");
            Intrinsics.checkNotNullParameter(dynamicUrlInterceptor, "dynamicUrlInterceptor");
            Intrinsics.checkNotNullParameter(httpLoggingInterceptorWithLimits, "httpLoggingInterceptorWithLimits");
            Intrinsics.checkNotNullParameter(encodingInterceptor, "encodingInterceptor");
            Intrinsics.checkNotNullParameter(geoRequestsLogInterceptor, "geoRequestsLogInterceptor");
            return C7714v.b0(autoTestTraceIdInterceptor, networkHistoryInterceptor, customHeadersInterceptor, previousPageInterceptor, pageViewIdInterceptor, dynamicUrlInterceptor, httpLoggingInterceptorWithLimits, encodingInterceptor, geoRequestsLogInterceptor);
        }

        private Companion() {
        }
    }
}
