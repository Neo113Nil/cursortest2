package ru.ozon.app.android.favorites.ui.atomactionsheethandlers;

import GZ.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.utils.FavoritesListsException;
import ru.ozon.app.android.favorites.domain.utils.FavoritesListExtentionsKt;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CreateFavoritesListDelegate$createFavoritesList$2 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ CreateFavoritesListDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateFavoritesListDelegate$createFavoritesList$2(CreateFavoritesListDelegate createFavoritesListDelegate) {
        super(1);
        this.this$0 = createFavoritesListDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ComposerReferences composerReferences;
        String link;
        g gVar;
        composerReferences = this.this$0.references;
        if (composerReferences == null) {
            Intrinsics.n("references");
            throw null;
        }
        composerReferences.getController().hideLoader();
        if (!(th2 instanceof FavoritesListsException)) {
            CreateFavoritesListDelegate createFavoritesListDelegate = this.this$0;
            Intrinsics.f(th2);
            CreateFavoritesListDelegate.showMessage$default(createFavoritesListDelegate, FavoritesListExtentionsKt.toMessage(th2), Integer.valueOf(R$drawable.ic_warning), 0L, null, 12, null);
        } else {
            AtomActionDTO action = ((FavoritesListsException) th2).getAction();
            if (action == null || (link = action.getLink()) == null) {
                return;
            }
            gVar = this.this$0.ozonRouter;
            gVar.b(link, 28416, U.c());
        }
    }
}
