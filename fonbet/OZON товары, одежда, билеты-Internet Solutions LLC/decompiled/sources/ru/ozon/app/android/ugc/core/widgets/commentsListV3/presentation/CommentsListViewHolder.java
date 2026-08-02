package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import Sc.o;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.os.Bundle;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ActionName;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.R$string;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.deletereview.DeleteReviewBottomFragment;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001P\b\u0001\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SBS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\b\u0012\u0004\u0012\u00020%0(*\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010 J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010 J\u000f\u00102\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010 J\u001f\u00106\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b6\u00107J3\u0010>\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u00022\n\u0010:\u001a\u000608j\u0002`92\u000e\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010AR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010GR\u0014\u0010H\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u001c0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsView;", "commentsView", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModel", "", "isTeenMode", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsView;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;ZLru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;)V", "", "commentUuid", "", "params", "", "showDeleteCommentBottomSheetDialog", "(Ljava/lang/String;Ljava/util/Map;)V", "checkReportAction", "()V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "disableReportButton", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "", "position", "", "disableControl", "(Ljava/util/List;I)Ljava/util/List;", "onAttach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsView;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "LVg/d;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "Z", "activateCommentField", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListView;", "commentsListView", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListView;", "ru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListViewHolder$observer$1", "observer", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListViewHolder$observer$1;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsListViewHolder extends k<CommentsListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final boolean activateCommentField;

    @NotNull
    private final CommentsListView commentsListView;

    @NotNull
    private final CommentsView commentsView;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final boolean isTeenMode;

    @NotNull
    private final CommentsListViewHolder$observer$1 observer;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel;

    @NotNull
    private final CommentsViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewHolder$observer$1] */
    public CommentsListViewHolder(@NotNull CommentsView commentsView, @NotNull CommentsViewModel viewModel, @NotNull ComposerReferences ref, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel, boolean z11, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage) {
        super(commentsView);
        Bundle arguments;
        Intrinsics.checkNotNullParameter(commentsView, "commentsView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(ugcCachedActionsSharedViewModel, "ugcCachedActionsSharedViewModel");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        this.commentsView = commentsView;
        this.viewModel = viewModel;
        this.ref = ref;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.sellerFavoriteService = sellerFavoriteService;
        this.ugcCachedActionsSharedViewModel = ugcCachedActionsSharedViewModel;
        this.isTeenMode = z11;
        ComponentCallbacksC5392m c11 = ref.getContainer().c();
        this.activateCommentField = (c11 == null || (arguments = c11.getArguments()) == null) ? false : arguments.getBoolean("activateCommentField");
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new CommentsListViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.commentsListView = new CommentsListViewImpl(commentsView, ref.getController(), ref.getContainer().j(), subscribeAuthorsIdStorage, tokenizedAnalytics, new CommentsListViewHolder$commentsListView$2(this), new CommentsListViewHolder$commentsListView$1(this), buildHandler);
        this.observer = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewHolder$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                CommentsListView commentsListView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                CommentsListVO boundData = CommentsListViewHolder.this.getBoundData();
                if (boundData != null) {
                    commentsListView = CommentsListViewHolder.this.commentsListView;
                    boundData.setCachedComments(commentsListView.getCurrentList());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkReportAction() {
        List<CommentsAdapterVO> currentList = this.commentsListView.getCurrentList();
        ArrayList arrayList = new ArrayList(C7714v.z(currentList, 10));
        for (CommentsAdapterVO commentsAdapterVO : currentList) {
            if (Intrinsics.d(this.ugcCachedActionsSharedViewModel.isActionSelected(commentsAdapterVO.getUuid(), "reportButtonEnabled"), Boolean.TRUE)) {
                if (commentsAdapterVO instanceof CommentVO) {
                    commentsAdapterVO = CommentVO.copy$default((CommentVO) commentsAdapterVO, 0L, null, null, null, null, false, false, false, false, null, null, null, null, false, false, false, null, null, 261119, null);
                } else {
                    if (!(commentsAdapterVO instanceof CommentV3VO)) {
                        throw new o();
                    }
                    commentsAdapterVO = disableReportButton((CommentV3VO) commentsAdapterVO);
                }
            }
            arrayList.add(commentsAdapterVO);
        }
        this.commentsListView.loadItems(arrayList, null);
    }

    private final List<CommentV3DTO.Control> disableControl(List<CommentV3DTO.Control> list, int i11) {
        ArrayList W02 = C7714v.W0(list);
        W02.set(i11, ((CommentV3DTO.Control) W02.get(i11)).disableControl());
        return W02;
    }

    private final CommentV3VO disableReportButton(CommentV3VO commentV3VO) {
        AtomActionDTO action;
        CommentV3VO commentV3VO2 = commentV3VO;
        CommentV3VO.Content.FooterVO footer = commentV3VO2.getFooter(commentV3VO2);
        if (footer != null) {
            List[] elements = {footer.getLeftControls(), footer.getRightControls()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator it = C7705l.B(elements).iterator();
            while (it.hasNext()) {
                List<CommentV3DTO.Control> list = (List) it.next();
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    CommonControlSettings commonControl = ((CommentV3DTO.Control) obj).getCommonControl();
                    if (Intrinsics.d((commonControl == null || (action = commonControl.getAction()) == null) ? null : action.getId(), ActionName.COMMENT_REPORT.getAction())) {
                        List<CommentV3VO.Content> items = commentV3VO2.getItems();
                        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
                        for (CommentV3VO.Content content : items) {
                            if ((content instanceof CommentV3VO.Content.FooterVO ? (CommentV3VO.Content.FooterVO) content : null) != null) {
                                CommentV3VO.Content.FooterVO copy$default = CommentV3VO.Content.FooterVO.copy$default((CommentV3VO.Content.FooterVO) content, list == footer.getLeftControls() ? disableControl(footer.getLeftControls(), i11) : footer.getLeftControls(), list == footer.getRightControls() ? disableControl(footer.getRightControls(), i11) : footer.getRightControls(), null, null, 12, null);
                                if (copy$default != null) {
                                    content = copy$default;
                                }
                            }
                            arrayList.add(content);
                        }
                        return CommentV3VO.copy$default(commentV3VO2, 0L, null, null, arrayList, false, null, 55, null);
                    }
                    commentV3VO2 = commentV3VO;
                    i11 = i12;
                }
                commentV3VO2 = commentV3VO;
            }
        }
        return commentV3VO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$updateSellerSubscription(CommentsViewModel commentsViewModel, Map map, kotlin.coroutines.d dVar) {
        commentsViewModel.updateSellerSubscription(map);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeleteCommentBottomSheetDialog(String commentUuid, Map<String, String> params) {
        DeleteReviewBottomFragment.Companion.newInstance$default(DeleteReviewBottomFragment.INSTANCE, commentUuid, this.isTeenMode ? StringProvider.getString(R$string.reviews_delete_comment_title_teen_mode) : StringProvider.getString(R$string.reviews_delete_comment_title), 0L, 4, null).show(this.ref.getContainer().k(), CommentsListViewHolder.class.getName());
        ComponentCallbacksC5392m c11 = this.ref.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "delete_comment_request_key", new CommentsListViewHolder$showDeleteCommentBottomSheetDialog$1(this, commentUuid, params));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.ref.getContainer().f().getLifecycle().a(this.observer);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getActionFlow(), new CommentsListViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.ugcCachedActionsSharedViewModel.getActionsChanged(), new CommentsListViewHolder$onAttachViewModel$2(this, null)), K.a(lifecycle));
        ComponentCallbacksC5392m c11 = this.ref.getContainer().c();
        if (c11 != null) {
            C2399j.C(new C2408n0(this.viewModel.getShowLoading(), new CommentsListViewHolder$onAttachViewModel$3$1(this, null)), K.a(c11));
        }
        C2399j.C(new C2408n0(C5427n.a(n.a(this.sellerFavoriteService.favoritesChangeEvents()), lifecycle.getLifecycle(), AbstractC5434v.b.STARTED), new CommentsListViewHolder$onAttachViewModel$4(this.viewModel)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onDetachViewModel(lifecycle);
        this.commentsListView.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.viewModel.setCommentsVisible(true);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.viewModel.setCommentsVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CommentsListVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        List<CommentsAdapterVO> cachedComments = item.getCachedComments();
        if (cachedComments == null) {
            this.viewModel.loadComments(item, this.activateCommentField);
            CommentsListDTO.EmptyStateDTO emptyState = item.getEmptyState();
            if (emptyState != null) {
                this.commentsView.bindEmptyState(emptyState);
                return;
            }
            return;
        }
        boolean isEmpty = cachedComments.isEmpty();
        if (isEmpty) {
            CommentsListDTO.EmptyStateDTO emptyState2 = item.getEmptyState();
            if (emptyState2 != null) {
                this.commentsView.bindEmptyState(emptyState2);
            }
        } else {
            this.commentsListView.loadItems(cachedComments, null);
        }
        this.commentsView.showOrGoneEmptyState(item.getEmptyState(), isEmpty);
        item.setCachedComments(null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CommentsListVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
        }
    }
}
