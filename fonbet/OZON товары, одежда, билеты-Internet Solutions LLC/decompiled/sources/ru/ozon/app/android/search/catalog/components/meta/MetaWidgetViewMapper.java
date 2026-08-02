package ru.ozon.app.android.search.catalog.components.meta;

import A00.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteEntityUpdateKey;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.navigation.SearchRouter;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R.\u0010(\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 ¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/search/catalog/components/meta/MetaDO;", "Lru/ozon/app/android/search/catalog/components/meta/MetaVO;", "Lru/ozon/app/android/search/navigation/SearchRouter;", "router", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "<init>", "(Lru/ozon/app/android/search/navigation/SearchRouter;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;)V", "state", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/search/catalog/components/meta/MetaDO;Lru/ozon/app/android/search/catalog/components/meta/MetaVO;)Lru/ozon/composer/ui/widget/h;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetMapper;", "mapper", "Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetMapper;", "getMapper", "()Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetMapper;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetaWidgetViewMapper extends WidgetViewMapper<MetaDO, MetaVO> {

    @NotNull
    private final Function2<View, ComposerReferences, MetaWidgetViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final MetaWidgetMapper mapper;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, MetaVO, MetaVO> updateConsumer;

    public MetaWidgetViewMapper(@NotNull SearchRouter router, @NotNull FavoriteEntityInteractor favoriteEntityInteractor) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        this.layout = R$layout.widget_meta_layout;
        this.mapper = new MetaWidgetMapper();
        this.holderProducer = new MetaWidgetViewMapper$holderProducer$1(router, favoriteEntityInteractor);
        this.supportedUpdates = C7714v.a0(FavoriteEntityUpdateKey.class);
        this.updateConsumer = MetaWidgetViewMapper$updateConsumer$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<MetaVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, MetaVO, MetaVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<MetaDO, d, List<MetaVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull MetaDO state, @NotNull MetaVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.f.f94874b;
    }
}
