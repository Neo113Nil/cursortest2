package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.data.OfflineTravelModeDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.di.OfflineTravelModelComponent;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/data/OfflineTravelModeDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModeVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/di/OfflineTravelModelComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/di/OfflineTravelModelComponent;)V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/data/OfflineTravelModeDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/di/OfflineTravelModelComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfflineTravelModelViewMapper extends r<OfflineTravelModeDTO, OfflineTravelModeVI> {

    @NotNull
    private final OfflineTravelModelComponent component;

    @NotNull
    private final r.a viewType;

    public OfflineTravelModelViewMapper(@NotNull OfflineTravelModelComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<OfflineTravelModeVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new OfflineTravelModelWidgetViewHolder(this.component.getViewModel(), this.component.getOfflineStorage());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OfflineTravelModeVI> map(@NotNull OfflineTravelModeDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
