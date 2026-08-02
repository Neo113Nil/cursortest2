package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation;

import Lm0.a;
import a00.C4911f;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.uikit.R$drawable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerCarouselAdapter$SellerViewHolder$onFavoritesClick$2 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ SellerVO $item;
    final /* synthetic */ SellerCarouselAdapter.SellerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerCarouselAdapter$SellerViewHolder$onFavoritesClick$2(SellerCarouselAdapter.SellerViewHolder sellerViewHolder, SellerVO sellerVO, C4911f c4911f) {
        super(1);
        this.this$0 = sellerViewHolder;
        this.$item = sellerVO;
        this.$container = c4911f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        Context context;
        context = this.this$0.context;
        String string = context.getString(this.$item.getIsFavorite() ? R$string.error_common_seller_favourite_remove_error_text_android : R$string.error_common_seller_favourite_add_error_text_android);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.this$0.showMessage(string, R$drawable.ic_warning, this.$container);
        a.f17149a.e(th2);
    }
}
