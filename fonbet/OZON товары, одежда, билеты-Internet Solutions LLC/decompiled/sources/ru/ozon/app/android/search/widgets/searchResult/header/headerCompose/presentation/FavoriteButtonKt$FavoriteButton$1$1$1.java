package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import S0.InterfaceC3978p0;
import Vg.e;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.ComposeWidgetInfo;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FavoriteButtonKt$FavoriteButton$1$1$1 extends AbstractC7737t implements Function1<Context, FavoriteButtonView> {
    final /* synthetic */ e.a $builder;
    final /* synthetic */ InterfaceC3978p0<FavoriteEntityComposeDelegate> $favoriteButtonDelegate;
    final /* synthetic */ FavoriteEntityComposeDelegateFactory $favoriteEntityComposeDelegateFactory;
    final /* synthetic */ FavoriteEntityInteractor $favoriteEntityInteractor;
    final /* synthetic */ ComposeWidgetInfo $widgetInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteButtonKt$FavoriteButton$1$1$1(InterfaceC3978p0<FavoriteEntityComposeDelegate> interfaceC3978p0, FavoriteEntityComposeDelegateFactory favoriteEntityComposeDelegateFactory, ComposeWidgetInfo composeWidgetInfo, FavoriteEntityInteractor favoriteEntityInteractor, e.a aVar) {
        super(1);
        this.$favoriteButtonDelegate = interfaceC3978p0;
        this.$favoriteEntityComposeDelegateFactory = favoriteEntityComposeDelegateFactory;
        this.$widgetInfo = composeWidgetInfo;
        this.$favoriteEntityInteractor = favoriteEntityInteractor;
        this.$builder = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FavoriteButtonView invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FavoriteButtonView favoriteButtonView = new FavoriteButtonView(context, null, 0, 6, null);
        this.$favoriteButtonDelegate.setValue(this.$favoriteEntityComposeDelegateFactory.mo698creatensP1ncM(favoriteButtonView, this.$widgetInfo, this.$favoriteEntityInteractor, this.$builder));
        return favoriteButtonView;
    }
}
