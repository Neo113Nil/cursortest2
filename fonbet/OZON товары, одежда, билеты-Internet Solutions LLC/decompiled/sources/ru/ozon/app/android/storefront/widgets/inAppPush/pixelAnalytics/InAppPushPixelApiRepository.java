package ru.ozon.app.android.storefront.widgets.inAppPush.pixelAnalytics;

import He.b;
import Wc.a;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/pixelAnalytics/InAppPushPixelApiRepository;", "", "Lru/ozon/app/android/storefront/widgets/inAppPush/pixelAnalytics/InAppPushPixelApi;", "pixelApi", "<init>", "(Lru/ozon/app/android/storefront/widgets/inAppPush/pixelAnalytics/InAppPushPixelApi;)V", "", ImagesContract.URL, "", "track", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/storefront/widgets/inAppPush/pixelAnalytics/InAppPushPixelApi;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPushPixelApiRepository {

    @NotNull
    private final InAppPushPixelApi pixelApi;

    public InAppPushPixelApiRepository(@NotNull InAppPushPixelApi pixelApi) {
        Intrinsics.checkNotNullParameter(pixelApi, "pixelApi");
        this.pixelApi = pixelApi;
    }

    public final Object track(@NotNull String str, @NotNull d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new InAppPushPixelApiRepository$track$2(this, str, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
