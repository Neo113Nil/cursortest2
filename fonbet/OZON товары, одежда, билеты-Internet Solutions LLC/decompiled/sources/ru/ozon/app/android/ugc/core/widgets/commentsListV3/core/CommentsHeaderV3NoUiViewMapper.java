package ru.ozon.app.android.ugc.core.widgets.commentsListV3.core;

import A00.a;
import GU.b;
import Kk.c;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.SellerSubscribeUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorBaseKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsHeaderVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsHeaderView;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsListHeaderNoUiViewHolder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterStateUpdateKey;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u001e0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/core/CommentsHeaderV3NoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/di/CommentsListComponent;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "viewModel", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommentsHeaderV3NoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<CommentsListComponent, CommentsListDTO, CommentsHeaderVO> {
    private CommentsViewModel viewModel;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(SubscribeAuthorUpdateKey.class, UnsubscribeAuthorUpdateKey.class, SellerSubscribeUpdateKey.class, ActionsFooterStateUpdateKey.class, CommentsCountIncremented.class, CommentsCountDecremented.class);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(CommentsHeaderView commentsHeaderView, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return commentsHeaderView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CommentsHeaderVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.viewModel = (CommentsViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsHeaderV3NoUiViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CommentsViewModelImpl commentsViewModelImpl = CommentsHeaderV3NoUiViewMapper.this.component().getCommentsViewModelProvider().get();
                Intrinsics.g(commentsViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return commentsViewModelImpl;
            }
        }).a(CommentsViewModelImpl.class);
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        CommentsHeaderView commentsHeaderView = new CommentsHeaderView(L11);
        return new CommentsListHeaderNoUiViewHolder(commentsHeaderView, container, new b(commentsHeaderView, 0));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CommentsListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CommentsListComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public CommentsHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CommentsHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SubscribeAuthorBaseKey) {
            CommentsViewModel commentsViewModel = this.viewModel;
            if (commentsViewModel == null) {
                return null;
            }
            CommentsViewModel.DefaultImpls.updateCommentsSocialHeader$default(commentsViewModel, ((SubscribeAuthorBaseKey) update).getAuthorId(), null, null, 6, null);
            return null;
        }
        if (update instanceof SellerSubscribeUpdateKey) {
            CommentsViewModel commentsViewModel2 = this.viewModel;
            if (commentsViewModel2 == null) {
                return null;
            }
            SellerSubscribeUpdateKey sellerSubscribeUpdateKey = (SellerSubscribeUpdateKey) update;
            CommentsViewModel.DefaultImpls.updateCommentsSocialHeader$default(commentsViewModel2, null, sellerSubscribeUpdateKey.getSellerId(), Boolean.valueOf(sellerSubscribeUpdateKey.getIsSubscribed()), 1, null);
            return null;
        }
        if (!(update instanceof ActionsFooterStateUpdateKey)) {
            if (update instanceof CommentsCountIncremented) {
                return CommentsHeaderV3NoUiViewMapperKt.updateCount(oldItem, oldItem.getCount() + 1);
            }
            if (update instanceof CommentsCountDecremented) {
                return CommentsHeaderV3NoUiViewMapperKt.updateCount(oldItem, oldItem.getCount() - 1);
            }
            return null;
        }
        CommentsViewModel commentsViewModel3 = this.viewModel;
        if (commentsViewModel3 == null) {
            return null;
        }
        ActionsFooterStateUpdateKey actionsFooterStateUpdateKey = (ActionsFooterStateUpdateKey) update;
        commentsViewModel3.updateReactionState(actionsFooterStateUpdateKey.getReviewUuid(), actionsFooterStateUpdateKey.getIsSelected(), actionsFooterStateUpdateKey.getActionId());
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CommentsHeaderVO> map(@NotNull CommentsListDTO state, @NotNull d info) {
        String c11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        T00.a b11 = info.b();
        if (!Intrinsics.d((b11 == null || (c11 = b11.c()) == null) ? null : Boolean.valueOf(h.t(c11, "comments", false)), Boolean.TRUE)) {
            return K.f71697a;
        }
        return C7714v.a0(new CommentsHeaderVO(c.a(info.d(), N.b(CommentsHeaderVO.class).B()), state.getTitle(), state.getCountText(), state.getTotalCount(), state.getEmptyState() != null));
    }
}
