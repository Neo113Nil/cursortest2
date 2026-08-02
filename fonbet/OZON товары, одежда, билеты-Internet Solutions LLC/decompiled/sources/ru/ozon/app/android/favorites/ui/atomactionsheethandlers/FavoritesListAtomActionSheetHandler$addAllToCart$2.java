package ru.ozon.app.android.favorites.ui.atomactionsheethandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.R$drawable;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.model.Action;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0013\u0010\u0002\u001a\u000f \u0005*\u0004\u0018\u00010\u00030\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesListAtomActionSheetHandler$addAllToCart$2 extends AbstractC7737t implements Function1<CartAddItemDTO, Unit> {
    final /* synthetic */ FavoritesListAtomActionSheetHandler this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler$addAllToCart$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ FavoritesListAtomActionSheetHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FavoritesListAtomActionSheetHandler favoritesListAtomActionSheetHandler) {
            super(0);
            this.this$0 = favoritesListAtomActionSheetHandler;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComposerReferences composerReferences;
            composerReferences = this.this$0.references;
            ComposerNavigator navigator = composerReferences.getNavigator();
            String uri = LinkGenerator.INSTANCE.cart().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesListAtomActionSheetHandler$addAllToCart$2(FavoritesListAtomActionSheetHandler favoritesListAtomActionSheetHandler) {
        super(1);
        this.this$0 = favoritesListAtomActionSheetHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartAddItemDTO cartAddItemDTO) {
        invoke2(cartAddItemDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartAddItemDTO cartAddItemDTO) {
        FavoritesListAtomActionSheetHandler.showMessage$default(this.this$0, StringProvider.getString(R$string.favorites_batch_action_success_android), Integer.valueOf(R$drawable.ic_add_to_cart_green), 0L, new Action(StringProvider.getString(R$string.favorites_batch_action_go_android), false, new AnonymousClass1(this.this$0), 2, null), 4, null);
    }
}
