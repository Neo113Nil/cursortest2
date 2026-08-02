package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import xe.C10727i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "packages", "", "setupPackages", "(Ljava/util/List;)V", "", "newIndex", "list", "cardRequestFocusCallback", "(ILjava/util/List;)V", "LAe/x0;", "_updateList", "LAe/x0;", "LAe/M0;", "updateList", "LAe/M0;", "getUpdateList", "()LAe/M0;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselViewModel extends w0 {

    @NotNull
    private final x0<List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>> _updateList;

    @NotNull
    private final M0<List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>> updateList;

    public ServicePackageCarouselViewModel() {
        x0<List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>> a11 = O0.a(K.f71697a);
        this._updateList = a11;
        this.updateList = C2399j.b(a11);
    }

    public final void cardRequestFocusCallback(int newIndex, @NotNull List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(ServicePackageCarouselVO.ServicePackageCarouselCardVO.copy$default((ServicePackageCarouselVO.ServicePackageCarouselCardVO) obj, 0, i11 == newIndex, null, null, null, null, null, null, null, null, null, 2045, null));
            i11 = i12;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ServicePackageCarouselViewModel$cardRequestFocusCallback$2$1(this, arrayList, null), 3);
    }

    @NotNull
    public final M0<List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>> getUpdateList() {
        return this.updateList;
    }

    public final void setupPackages(@NotNull List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ServicePackageCarouselViewModel$setupPackages$1(this, packages, null), 3);
    }
}
