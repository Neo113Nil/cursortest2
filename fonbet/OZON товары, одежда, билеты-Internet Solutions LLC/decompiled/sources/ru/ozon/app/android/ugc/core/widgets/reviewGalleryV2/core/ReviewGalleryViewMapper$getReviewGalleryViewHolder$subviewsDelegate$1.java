package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryViewMapper$getReviewGalleryViewHolder$subviewsDelegate$1 extends AbstractC7737t implements Function0<FavoriteProductV4Delegate> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ ReviewGalleryViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryViewMapper$getReviewGalleryViewHolder$subviewsDelegate$1(ReviewGalleryViewMapper reviewGalleryViewMapper, ComposerReferences composerReferences) {
        super(0);
        this.this$0 = reviewGalleryViewMapper;
        this.$refs = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FavoriteProductV4Delegate invoke() {
        return this.this$0.component().getFavMoleculeDelegateProvider().provideV4Delegate(this.$refs, this.this$0.component().getTokenizedAnalytics());
    }
}
