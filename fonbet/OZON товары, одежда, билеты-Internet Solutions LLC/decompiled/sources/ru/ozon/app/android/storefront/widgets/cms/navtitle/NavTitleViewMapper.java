package ru.ozon.app.android.storefront.widgets.cms.navtitle;

import Pc.a;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.storefront.navBar.R$layout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleDTO;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleVO;", "LPc/a;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleMapper;", "pMapper", "<init>", "(LPc/a;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "mapper", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleMapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavTitleViewMapper extends WidgetViewMapper<NavTitleDTO, NavTitleVO> {

    @NotNull
    private final Function2<View, ComposerReferences, NavTitleViewHolder> holderProducer;

    @NotNull
    private final NavTitleMapper mapper;

    public NavTitleViewMapper(@NotNull a<NavTitleMapper> pMapper) {
        Intrinsics.checkNotNullParameter(pMapper, "pMapper");
        NavTitleMapper navTitleMapper = pMapper.get();
        Intrinsics.checkNotNullExpressionValue(navTitleMapper, "get(...)");
        this.mapper = navTitleMapper;
        this.holderProducer = NavTitleViewMapper$holderProducer$1.INSTANCE;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(R$layout.widget_nav_title);
        return h11 == null ? ViewGroupExtKt.inflate(parent, R$layout.widget_nav_title) : h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NavTitleVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NavTitleDTO, d, List<NavTitleVO>> getMapper() {
        return this.mapper;
    }
}
