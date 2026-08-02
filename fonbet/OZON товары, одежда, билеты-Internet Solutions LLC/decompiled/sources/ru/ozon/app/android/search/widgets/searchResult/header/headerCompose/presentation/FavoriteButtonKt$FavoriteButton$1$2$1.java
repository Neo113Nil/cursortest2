package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "favoriteButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FavoriteButtonKt$FavoriteButton$1$2$1 extends AbstractC7737t implements Function1<FavoriteButtonView, Unit> {
    final /* synthetic */ InterfaceC3978p0<FavoriteEntityComposeDelegate> $favoriteButtonDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteButtonKt$FavoriteButton$1$2$1(InterfaceC3978p0<FavoriteEntityComposeDelegate> interfaceC3978p0) {
        super(1);
        this.$favoriteButtonDelegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteButtonView favoriteButtonView) {
        invoke2(favoriteButtonView);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteButtonView favoriteButtonView) {
        Intrinsics.checkNotNullParameter(favoriteButtonView, "favoriteButtonView");
        FavoriteEntityComposeDelegate value = this.$favoriteButtonDelegate.getValue();
        if (value != null) {
            value.attachFavButtonView(favoriteButtonView);
        }
    }
}
