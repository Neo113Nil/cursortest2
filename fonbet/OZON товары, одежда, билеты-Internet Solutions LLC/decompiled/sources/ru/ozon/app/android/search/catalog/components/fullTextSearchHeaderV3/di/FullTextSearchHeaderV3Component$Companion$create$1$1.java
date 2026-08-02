package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.data.markdown.MarkDownApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.minifyLink.di.MinifyLinkComponentApi;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.core.FullTextSearchHeaderV3Mapper;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/di/FullTextSearchHeaderV3Component$Companion$create$1$1", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/di/FullTextSearchHeaderV3Component;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/minifyLink/di/MinifyLinkComponentApi;", "minifyLinkComponentApi", "Lru/ozon/app/android/minifyLink/di/MinifyLinkComponentApi;", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "markDownApi", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/core/FullTextSearchHeaderV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/core/FullTextSearchHeaderV3Mapper;", "mapper", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "getViewModel", "()Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "viewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FullTextSearchHeaderV3Component$Companion$create$1$1 implements FullTextSearchHeaderV3Component {
    private final ContextComponentDependencies contextComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new FullTextSearchHeaderV3Component$Companion$create$1$1$mapper$2(this));
    private final MarkDownApi markDownApi;
    private final MinifyLinkComponentApi minifyLinkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    FullTextSearchHeaderV3Component$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.minifyLinkComponentApi = (MinifyLinkComponentApi) c7475g.getComponent(MinifyLinkComponentApi.class);
        this.markDownApi = (MarkDownApi) c7475g.getComponent(MarkDownApi.class);
    }

    @Override // ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di.FullTextSearchHeaderV3Component
    public FullTextSearchHeaderV3Mapper getMapper() {
        return (FullTextSearchHeaderV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di.FullTextSearchHeaderV3Component
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di.FullTextSearchHeaderV3Component
    public MinifyLinkViewModel getViewModel() {
        return new MinifyLinkViewModel(this.minifyLinkComponentApi.getMinifyLinkRepository());
    }
}
