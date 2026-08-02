package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FavoriteItemKt$FavoriteItem$1$1$1$2$1 extends AbstractC7737t implements Function1<SisBrandFavoriteButtonView, Unit> {
    final /* synthetic */ FavoriteCell $item;
    final /* synthetic */ InterfaceC3978p0<SisBrandFavoriteButtonDelegate> $sisBrandFavoriteButtonDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteItemKt$FavoriteItem$1$1$1$2$1(InterfaceC3978p0<SisBrandFavoriteButtonDelegate> interfaceC3978p0, FavoriteCell favoriteCell) {
        super(1);
        this.$sisBrandFavoriteButtonDelegate = interfaceC3978p0;
        this.$item = favoriteCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SisBrandFavoriteButtonView sisBrandFavoriteButtonView) {
        invoke2(sisBrandFavoriteButtonView);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SisBrandFavoriteButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SisBrandFavoriteButtonDelegate value = this.$sisBrandFavoriteButtonDelegate.getValue();
        if (value != null) {
            SisBrandFavoriteButtonDelegate.DefaultImpls.bind$default(value, this.$item.getFavoriteButton(), null, 2, null);
        }
    }
}
