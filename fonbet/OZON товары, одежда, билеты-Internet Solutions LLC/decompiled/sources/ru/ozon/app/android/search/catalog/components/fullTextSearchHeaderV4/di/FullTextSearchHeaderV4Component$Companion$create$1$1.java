package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.data.markdown.MarkDownApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.core.FullTextSearchHeaderV4WidgetMapper;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/di/FullTextSearchHeaderV4Component$Companion$create$1$1", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/di/FullTextSearchHeaderV4Component;", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "markDownApi", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentApi", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/core/FullTextSearchHeaderV4WidgetMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/core/FullTextSearchHeaderV4WidgetMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FullTextSearchHeaderV4Component$Companion$create$1$1 implements FullTextSearchHeaderV4Component {
    private final ContextComponentDependencies contextComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new FullTextSearchHeaderV4Component$Companion$create$1$1$mapper$2(this));
    private final MarkDownApi markDownApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    FullTextSearchHeaderV4Component$Companion$create$1$1(C7475g c7475g) {
        this.markDownApi = (MarkDownApi) c7475g.getComponent(MarkDownApi.class);
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    public final ContextComponentDependencies getContextComponentApi() {
        return this.contextComponentApi;
    }

    @Override // ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di.FullTextSearchHeaderV4Component
    public FullTextSearchHeaderV4WidgetMapper getMapper() {
        return (FullTextSearchHeaderV4WidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di.FullTextSearchHeaderV4Component
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
