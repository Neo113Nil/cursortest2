package ru.ozon.app.android.ugc.core.widgets.commentsListV3.core;

import WZ.l;
import a00.h;
import a00.j;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewHolder;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsView;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CommentsListV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CommentsListViewHolder> {
    final /* synthetic */ CommentsListV3ViewMapper this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListV3ViewMapper$holderProducer$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<UgcCachedActionsSharedViewModel> {
        final /* synthetic */ CommentsListV3ViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CommentsListV3ViewMapper commentsListV3ViewMapper) {
            super(0);
            this.this$0 = commentsListV3ViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UgcCachedActionsSharedViewModel invoke() {
            return this.this$0.component().getUgcCachedActionsSharedViewModel().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsListV3ViewMapper$holderProducer$1(CommentsListV3ViewMapper commentsListV3ViewMapper) {
        super(2);
        this.this$0 = commentsListV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CommentsListViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        CommentsView commentsView = (CommentsView) view;
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final CommentsListV3ViewMapper commentsListV3ViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListV3ViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CommentsViewModelImpl commentsViewModelImpl = CommentsListV3ViewMapper.this.component().getCommentsViewModelProvider().get();
                Intrinsics.g(commentsViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return commentsViewModelImpl;
            }
        }).a(CommentsViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        CommentsViewModelImpl commentsViewModelImpl = (CommentsViewModelImpl) a12;
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        SellerFavoriteService sellerFavoriteService = this.this$0.component().getSellerFavoriteService();
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        w0 w0Var = (w0) j.a(viewModelOwnerProvider.b(), N.b(UgcCachedActionsSharedViewModel.class), new AnonymousClass2(this.this$0)).getValue();
        Intrinsics.checkNotNullExpressionValue(w0Var, "sharedViewModel(...)");
        return new CommentsListViewHolder(commentsView, commentsViewModelImpl, ref, tokenizedAnalytics, this.this$0.component().getCustomActionHandlersStoreFactory(), sellerFavoriteService, (UgcCachedActionsSharedViewModel) w0Var, this.this$0.component().getTeensModeService().isTeensModeOn(), this.this$0.component().getSubscribeAuthorsIdStorage());
    }
}
