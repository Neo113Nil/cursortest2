package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "model", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MessengerProductFavoriteButtonViewHolder$setCurrentButtonView$1$2 extends AbstractC7737t implements Function2<FavoriteProductMolecule, View, Unit> {
    final /* synthetic */ MessengerProductFavoriteButtonViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.MessengerProductFavoriteButtonViewHolder$setCurrentButtonView$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<FavoriteProductMolecule, Unit> {
        final /* synthetic */ MessengerProductFavoriteButtonViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MessengerProductFavoriteButtonViewHolder messengerProductFavoriteButtonViewHolder) {
            super(1);
            this.this$0 = messengerProductFavoriteButtonViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductMolecule favoriteProductMolecule) {
            invoke2(favoriteProductMolecule);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FavoriteProductMolecule it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.changeButton(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerProductFavoriteButtonViewHolder$setCurrentButtonView$1$2(MessengerProductFavoriteButtonViewHolder messengerProductFavoriteButtonViewHolder) {
        super(2);
        this.this$0 = messengerProductFavoriteButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductMolecule favoriteProductMolecule, View view) {
        invoke2(favoriteProductMolecule, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteProductMolecule model, View view) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        AtomActionDTO action = FavoriteProductMoleculeKt.getButton(model).getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        if (atomAction instanceof AtomAction.ComposerAction) {
            MessengerProductFavoriteButtonViewHolder messengerProductFavoriteButtonViewHolder = this.this$0;
            messengerProductFavoriteButtonViewHolder.processRegularButtonAction(model, view, new AnonymousClass1(messengerProductFavoriteButtonViewHolder));
        } else if (atomAction != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(atomAction);
        }
    }
}
