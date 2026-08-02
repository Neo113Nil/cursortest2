package ru.ozon.app.android.common.serviceCarousel.presentation;

import He.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import h3.C6788a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselApi;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselApi;", "api", "<init>", "(Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselApi;)V", "", "onCleared", "()V", "", "", "params", "trackFreshNewLabelClick", "(Ljava/util/Map;)V", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselApi;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ServiceCarouselViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final ServiceCarouselApi api;

    public ServiceCarouselViewModel(@NotNull ServiceCarouselApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    public final void trackFreshNewLabelClick(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new ServiceCarouselViewModel$trackFreshNewLabelClick$1(this, params, null), 2);
    }
}
