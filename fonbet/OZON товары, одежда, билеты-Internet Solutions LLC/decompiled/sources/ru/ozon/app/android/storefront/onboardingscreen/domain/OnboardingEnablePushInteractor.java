package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.f1;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingEnablePushInteractor;", "", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingPushApi;", "onboardingPushApi", "<init>", "(Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingPushApi;)V", "", "link", "", "params", "LSc/r;", "", "enablePushNotifications-0E7RQCE", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "enablePushNotifications", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingPushApi;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingEnablePushInteractor {

    @NotNull
    private final OnboardingPushApi onboardingPushApi;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingEnablePushInteractor$Companion;", "", "<init>", "()V", "TIMEOUT_MILLIS", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OnboardingEnablePushInteractor(@NotNull OnboardingPushApi onboardingPushApi) {
        Intrinsics.checkNotNullParameter(onboardingPushApi, "onboardingPushApi");
        this.onboardingPushApi = onboardingPushApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0047, B:13:0x004b, B:14:0x004f, B:21:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: enablePushNotifications-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1020enablePushNotifications0E7RQCE(@NotNull String str, Map<String, ? extends Object> map, @NotNull d<? super r<Boolean>> dVar) {
        OnboardingEnablePushInteractor$enablePushNotifications$1 onboardingEnablePushInteractor$enablePushNotifications$1;
        int i11;
        try {
            if (dVar instanceof OnboardingEnablePushInteractor$enablePushNotifications$1) {
                onboardingEnablePushInteractor$enablePushNotifications$1 = (OnboardingEnablePushInteractor$enablePushNotifications$1) dVar;
                int i12 = onboardingEnablePushInteractor$enablePushNotifications$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    onboardingEnablePushInteractor$enablePushNotifications$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = onboardingEnablePushInteractor$enablePushNotifications$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = onboardingEnablePushInteractor$enablePushNotifications$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        OnboardingEnablePushInteractor$enablePushNotifications$2$1 onboardingEnablePushInteractor$enablePushNotifications$2$1 = new OnboardingEnablePushInteractor$enablePushNotifications$2$1(this, str, map, null);
                        onboardingEnablePushInteractor$enablePushNotifications$1.label = 1;
                        obj = f1.c(1500L, onboardingEnablePushInteractor$enablePushNotifications$2$1, onboardingEnablePushInteractor$enablePushNotifications$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Boolean bool = (Boolean) obj;
                    Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    r.Companion companion2 = r.INSTANCE;
                    return valueOf;
                }
            }
            if (i11 != 0) {
            }
            Boolean bool2 = (Boolean) obj;
            Boolean valueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
            r.Companion companion22 = r.INSTANCE;
            return valueOf2;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(th2);
        }
        onboardingEnablePushInteractor$enablePushNotifications$1 = new OnboardingEnablePushInteractor$enablePushNotifications$1(this, dVar);
        Object obj2 = onboardingEnablePushInteractor$enablePushNotifications$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = onboardingEnablePushInteractor$enablePushNotifications$1.label;
    }
}
