package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate;

import Nc.C3669c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteEntityViewHolderDelegate$bindFavoriteEntityButton$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ FavoriteEntityViewHolderDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityViewHolderDelegate$bindFavoriteEntityButton$1(FavoriteEntityViewHolderDelegate favoriteEntityViewHolderDelegate) {
        super(1);
        this.this$0 = favoriteEntityViewHolderDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        C3669c c3669c;
        FavoriteEntity favoriteEntity;
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.revertAndreBindViewState();
        c3669c = this.this$0.clickSubject;
        favoriteEntity = this.this$0.currentFavoriteEntity;
        if (favoriteEntity == null) {
            return;
        }
        c3669c.onNext(favoriteEntity);
    }
}
