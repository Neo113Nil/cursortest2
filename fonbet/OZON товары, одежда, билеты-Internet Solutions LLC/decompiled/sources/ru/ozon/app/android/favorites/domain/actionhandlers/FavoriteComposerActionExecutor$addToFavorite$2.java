package ru.ozon.app.android.favorites.domain.actionhandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteComposerActionExecutor$addToFavorite$2 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ long $sku;
    final /* synthetic */ FavoriteComposerActionExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteComposerActionExecutor$addToFavorite$2(FavoriteComposerActionExecutor favoriteComposerActionExecutor, long j11) {
        super(1);
        this.this$0 = favoriteComposerActionExecutor;
        this.$sku = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        FavoriteManager favoriteManager;
        favoriteManager = this.this$0.favoriteManager;
        FavoriteManager.DefaultImpls.removeFromFavorites$default(favoriteManager, this.$sku, null, 2, null);
    }
}
