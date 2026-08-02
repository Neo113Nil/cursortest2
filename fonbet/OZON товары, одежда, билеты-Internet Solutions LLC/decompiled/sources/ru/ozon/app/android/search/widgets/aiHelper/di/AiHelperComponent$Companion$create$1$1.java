package ru.ozon.app.android.search.widgets.aiHelper.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.data.markdown.MarkDownApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.search.widgets.aiHelper.data.AiHelperMapper;
import ru.ozon.app.android.search.widgets.aiHelper.presentation.SearchAiViewModel;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/search/widgets/aiHelper/di/AiHelperComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/aiHelper/di/AiHelperComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "markDownApi", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperMapper;", "mapper", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/SearchAiViewModel;", "getViewModel", "()Lru/ozon/app/android/search/widgets/aiHelper/presentation/SearchAiViewModel;", "viewModel", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiHelperComponent$Companion$create$1$1 implements AiHelperComponent {
    private final ActionComponentApi actionComponentApi;
    private final ContextComponentDependencies contextComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new AiHelperComponent$Companion$create$1$1$mapper$2(this));
    private final MarkDownApi markDownApi;

    AiHelperComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.markDownApi = (MarkDownApi) c7475g.getComponent(MarkDownApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
    }

    private final ActionV2Repository getActionV2Repository() {
        return this.actionComponentApi.getActionRepository();
    }

    @Override // ru.ozon.app.android.search.widgets.aiHelper.di.AiHelperComponent
    public AiHelperMapper getMapper() {
        return (AiHelperMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.aiHelper.di.AiHelperComponent
    public SearchAiViewModel getViewModel() {
        return new SearchAiViewModel(getActionV2Repository());
    }
}
