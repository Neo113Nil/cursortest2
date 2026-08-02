package ru.ozon.app.android.search.catalog.components.clusters.di;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.search.catalog.components.clusters.core.ClustersMapper;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersScrollViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/search/catalog/components/clusters/di/ClustersWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/search/catalog/components/clusters/di/ClustersWidgetComponent;", "Lru/ozon/app/android/search/catalog/components/clusters/core/ClustersMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/search/catalog/components/clusters/core/ClustersMapper;", "mapper", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersScrollViewModel;", "getViewModel", "()Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersScrollViewModel;", "viewModel", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClustersWidgetComponent$Companion$create$1$1 implements ClustersWidgetComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new ClustersWidgetComponent$Companion$create$1$1$mapper$2(this));

    ClustersWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    private final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    public Context getContext() {
        return getContextComponentDependencies().getContext();
    }

    @Override // ru.ozon.app.android.search.catalog.components.clusters.di.ClustersWidgetComponent
    public ClustersMapper getMapper() {
        return (ClustersMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.search.catalog.components.clusters.di.ClustersWidgetComponent
    public ClustersScrollViewModel getViewModel() {
        return new ClustersScrollViewModel();
    }
}
