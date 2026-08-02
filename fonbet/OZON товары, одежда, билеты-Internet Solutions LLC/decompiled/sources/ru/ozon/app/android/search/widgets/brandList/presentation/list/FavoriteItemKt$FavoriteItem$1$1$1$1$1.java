package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import S0.InterfaceC3978p0;
import Vg.e;
import a00.C4911f;
import android.content.Context;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FavoriteItemKt$FavoriteItem$1$1$1$1$1 extends AbstractC7737t implements Function1<Context, SisBrandFavoriteButtonView> {
    final /* synthetic */ e.a $builder;
    final /* synthetic */ FavoriteCell $item;
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ C4911f $ownerContainer;
    final /* synthetic */ InterfaceC3978p0<SisBrandFavoriteButtonDelegate> $sisBrandFavoriteButtonDelegate;
    final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateFactory $sisBrandFavoriteButtonDelegateFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteItemKt$FavoriteItem$1$1$1$1$1(InterfaceC3978p0<SisBrandFavoriteButtonDelegate> interfaceC3978p0, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, J j11, e.a aVar, C4911f c4911f, FavoriteCell favoriteCell) {
        super(1);
        this.$sisBrandFavoriteButtonDelegate = interfaceC3978p0;
        this.$sisBrandFavoriteButtonDelegateFactory = composeSisBrandFavoriteButtonDelegateFactory;
        this.$lifecycleOwner = j11;
        this.$builder = aVar;
        this.$ownerContainer = c4911f;
        this.$item = favoriteCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SisBrandFavoriteButtonView invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SisBrandFavoriteButtonView sisBrandFavoriteButtonView = new SisBrandFavoriteButtonView(context, null, 0, 0, 14, null);
        InterfaceC3978p0<SisBrandFavoriteButtonDelegate> interfaceC3978p0 = this.$sisBrandFavoriteButtonDelegate;
        ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory = this.$sisBrandFavoriteButtonDelegateFactory;
        interfaceC3978p0.setValue(composeSisBrandFavoriteButtonDelegateFactory != null ? composeSisBrandFavoriteButtonDelegateFactory.mo996createwXMEtSA(sisBrandFavoriteButtonView, this.$lifecycleOwner, this.$builder, this.$ownerContainer) : null);
        SisBrandFavoriteButtonDelegate value = this.$sisBrandFavoriteButtonDelegate.getValue();
        if (value != null) {
            SisBrandFavoriteButtonDelegate.DefaultImpls.bind$default(value, this.$item.getFavoriteButton(), null, 2, null);
        }
        return sisBrandFavoriteButtonView;
    }
}
