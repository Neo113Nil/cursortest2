package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3Mapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3ViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/di/EmptyStateV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/di/EmptyStateV3Component;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3ViewModel;", "getEmptyStateV3ViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3ViewModel;", "emptyStateV3ViewModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV3Component$Companion$create$1$1 implements EmptyStateV3Component {
    private final ActionComponentApi actionComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new EmptyStateV3Component$Companion$create$1$1$mapper$2(this));

    EmptyStateV3Component$Companion$create$1$1(C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.di.EmptyStateV3Component
    public EmptyStateV3ViewModel getEmptyStateV3ViewModel() {
        return new EmptyStateV3ViewModel(this.actionComponentApi.getActionRepository());
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.di.EmptyStateV3Component
    public EmptyStateV3Mapper getMapper() {
        return (EmptyStateV3Mapper) this.mapper.getValue();
    }
}
