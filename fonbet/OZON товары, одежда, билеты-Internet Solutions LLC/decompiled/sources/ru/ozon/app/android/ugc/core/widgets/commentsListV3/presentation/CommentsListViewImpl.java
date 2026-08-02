package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import IU.e;
import Lm0.a;
import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.R$string;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewImpl;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapter;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import z00.g;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001CB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012$\u0010\u0014\u001a \u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0013\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!*\b\u0012\u0004\u0012\u00020\u000e0!H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0!*\b\u0012\u0004\u0012\u00020\u000e0!H\u0002¢\u0006\u0004\b$\u0010#J'\u0010'\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0!2\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u00102J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u00102J\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListViewImpl;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListView;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsView;", "commentsView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "", "replyToComment", "Lkotlin/Function2;", "", "", "deleteComment", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsView;Ll10/b;Landroidx/fragment/app/m;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "", "getKeyboardHeight", "(Landroid/view/View;)I", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "removeSeparatorOnFirstAndLastComment", "(Ljava/util/List;)Ljava/util/List;", "updateSubscriptionStates", "list", "scrollCommentUuid", "loadItems", "(Ljava/util/List;Ljava/lang/String;)V", "", "aboveKeyboard", "scrollToComment", "(Ljava/lang/String;Z)V", "", "throwable", "showError", "(Ljava/lang/Throwable;)V", "showSendError", "()V", "onDetach", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsView;", "Ll10/b;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapter;", "commentsAdapter", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapter;", "Ljava/lang/Runnable;", "scrollToCommentRunnable", "Ljava/lang/Runnable;", "insets", "I", "getCurrentList", "()Ljava/util/List;", "currentList", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsListViewImpl implements CommentsListView {

    @NotNull
    private final CommentsAdapter commentsAdapter;

    @NotNull
    private final CommentsView commentsView;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final ComponentCallbacksC5392m fragment;
    private int insets;
    private Runnable scrollToCommentRunnable;

    @NotNull
    private final SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;
    public static final int $stable = 8;

    public CommentsListViewImpl(@NotNull CommentsView commentsView, @NotNull InterfaceC7851b controller, @NotNull ComponentCallbacksC5392m fragment, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage, @NotNull l tokenizedAnalytics, @NotNull Function1<? super CommentsAdapterVO, Unit> replyToComment, @NotNull Function2<? super String, ? super Map<String, String>, Unit> deleteComment, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        d f7;
        d f11;
        Intrinsics.checkNotNullParameter(commentsView, "commentsView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(replyToComment, "replyToComment");
        Intrinsics.checkNotNullParameter(deleteComment, "deleteComment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.commentsView = commentsView;
        this.controller = controller;
        this.fragment = fragment;
        this.subscribeAuthorsIdStorage = subscribeAuthorsIdStorage;
        CommentsAdapter commentsAdapter = new CommentsAdapter(replyToComment, deleteComment, actionHandler, tokenizedAnalytics, fragment);
        this.commentsAdapter = commentsAdapter;
        View view = fragment.getView();
        if (view != null) {
            C5353y0 n11 = Y.n(view);
            int i11 = 0;
            int i12 = (n11 == null || (f11 = n11.f(2)) == null) ? 0 : f11.f42129d;
            if (n11 != null && (f7 = n11.f(1)) != null) {
                i11 = f7.f42127b;
            }
            this.insets = i12 + i11;
        }
        commentsView.getCommentsRecycler().setAdapter(commentsAdapter);
    }

    private final int getKeyboardHeight(View view) {
        d f7;
        C5353y0 n11 = Y.n(view);
        if (n11 == null || (f7 = n11.f(8)) == null) {
            return 0;
        }
        return f7.f42129d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadItems$lambda$4(String str, CommentsListViewImpl commentsListViewImpl) {
        if (str != null) {
            CommentsListView.DefaultImpls.scrollToComment$default(commentsListViewImpl, str, false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<CommentsAdapterVO> removeSeparatorOnFirstAndLastComment(List<? extends CommentsAdapterVO> list) {
        int i11;
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((CommentsAdapterVO) it.next()) instanceof CommentVO) {
                break;
            }
            i12++;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            if (((CommentsAdapterVO) listIterator.previous()) instanceof CommentVO) {
                i11 = listIterator.nextIndex();
                break;
            }
        }
        if (i12 == -1) {
            return list;
        }
        ArrayList W02 = C7714v.W0(list);
        Object Q11 = C7714v.Q(i12, W02);
        CommentVO commentVO = Q11 instanceof CommentVO ? (CommentVO) Q11 : null;
        if (commentVO != null && (commentVO.getWithSeparator() || !commentVO.getIsFirst())) {
            W02.set(i12, CommentVO.copy$default(commentVO, 0L, null, null, null, null, false, false, false, false, null, null, null, null, false, true, false, null, null, 237567, null));
        }
        Object Q12 = C7714v.Q(i11, W02);
        CommentVO commentVO2 = Q12 instanceof CommentVO ? (CommentVO) Q12 : null;
        if (commentVO2 != null && !commentVO2.getIsLast()) {
            W02.set(i11, CommentVO.copy$default(commentVO2, 0L, null, null, null, null, false, false, false, false, null, null, null, null, false, false, true, null, null, 229375, null));
        }
        return W02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToComment$lambda$10$lambda$9$lambda$8(int i11, boolean z11, CommentsListViewImpl commentsListViewImpl, String str, CommentsView commentsView, int i12) {
        View view;
        RecyclerView composerRecyclerView;
        LinearLayout linearLayout;
        Window window;
        View decorView;
        if (i11 == 0 && z11) {
            commentsListViewImpl.scrollToComment(str, true);
            return;
        }
        RecyclerView.C findViewHolderForAdapterPosition = commentsView.getCommentsRecycler().findViewHolderForAdapterPosition(i12);
        if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        if (i12 == 0) {
            InterfaceC7851b.a.c(commentsListViewImpl.controller, "commentsList", Integer.valueOf(commentsListViewImpl.insets), 4);
            return;
        }
        int y11 = ((int) (view.getY() + commentsView.getY())) - commentsListViewImpl.insets;
        if (z11) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = view.getHeight() + iArr[1];
            r activity = commentsListViewImpl.fragment.getActivity();
            int height2 = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getHeight();
            View view2 = commentsListViewImpl.fragment.getView();
            y11 = ((view2 == null || (linearLayout = (LinearLayout) view2.findViewById(R$id.sendCommentLl)) == null) ? 0 : linearLayout.getHeight()) + ((height + i11) - height2) + commentsListViewImpl.insets;
        }
        Object parent = commentsView.getParent();
        View view3 = parent instanceof View ? (View) parent : null;
        if (view3 == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view3)) == null) {
            return;
        }
        composerRecyclerView.smoothScrollBy(0, y11);
    }

    private final void showNotification(NotificationDTO notification) {
        ViewGroup rootView = ContextExtKt.getRootView(this.fragment);
        if (rootView != null) {
            NotificationBar.Companion companion = NotificationBar.INSTANCE;
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
            if (asNotificationLayoutManager$default == null) {
                return;
            }
            NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notification, this.fragment, null, 8, null).show();
        }
    }

    private final List<CommentsAdapterVO> updateSubscriptionStates(List<? extends CommentsAdapterVO> list) {
        Boolean isAuthorSubscribed;
        List<? extends CommentsAdapterVO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (CommentsAdapterVO commentsAdapterVO : list2) {
            String authorId = commentsAdapterVO.getAuthorId();
            if (authorId != null && (isAuthorSubscribed = this.subscribeAuthorsIdStorage.isAuthorSubscribed(authorId)) != null) {
                commentsAdapterVO = commentsAdapterVO.updateSubscribeState(authorId, null, isAuthorSubscribed);
            }
            arrayList.add(commentsAdapterVO);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView
    public void deleteComment() {
        showNotification(new NotificationDTO(StringProvider.getString(R$string.reviews_removed_comment_notification_title), null, null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 478, null));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView
    @NotNull
    public List<CommentsAdapterVO> getCurrentList() {
        List<CommentsAdapterVO> currentList = this.commentsAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        return currentList;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView
    public void loadItems(@NotNull List<? extends CommentsAdapterVO> list, String scrollCommentUuid) {
        Intrinsics.checkNotNullParameter(list, "list");
        int dp_8 = C7714v.M(list) instanceof CommentV3VO ? Dimens.INSTANCE.getDP_8() : 0;
        RecyclerView commentsRecycler = this.commentsView.getCommentsRecycler();
        ViewGroup.LayoutParams layoutParams = commentsRecycler.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        int dp_1 = list.isEmpty() ? Dimens.INSTANCE.getDP_1() : -2;
        layoutParams.height = dp_1;
        if (i11 != dp_1 || i12 != layoutParams.width) {
            commentsRecycler.setLayoutParams(layoutParams);
        }
        commentsRecycler.setPadding(commentsRecycler.getPaddingLeft(), dp_8, commentsRecycler.getPaddingRight(), dp_8);
        this.commentsAdapter.submitList(updateSubscriptionStates(removeSeparatorOnFirstAndLastComment(list)), new e(0, scrollCommentUuid, this));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView
    public void onDetach() {
        this.commentsView.removeCallbacks(this.scrollToCommentRunnable);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView
    public void scrollToComment(@NotNull final String scrollCommentUuid, final boolean aboveKeyboard) {
        Intrinsics.checkNotNullParameter(scrollCommentUuid, "scrollCommentUuid");
        List<CommentsAdapterVO> currentList = this.commentsAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<CommentsAdapterVO> it = currentList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.d(it.next().getUuid(), scrollCommentUuid)) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (i11 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            final int intValue = valueOf.intValue();
            final CommentsView commentsView = this.commentsView;
            final int keyboardHeight = getKeyboardHeight(commentsView);
            Runnable runnable = new Runnable() { // from class: IU.d
                @Override // java.lang.Runnable
                public final void run() {
                    CommentsListViewImpl.scrollToComment$lambda$10$lambda$9$lambda$8(keyboardHeight, aboveKeyboard, this, scrollCommentUuid, commentsView, intValue);
                }
            };
            this.scrollToCommentRunnable = runnable;
            commentsView.postDelayed(runnable, 300L);
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView
    public void showError(@NotNull Throwable throwable) {
        NotificationDTO createUnknownErrorNotification;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        if (g.c(throwable)) {
            Context context = this.fragment.getContext();
            boolean z11 = false;
            if (context != null && AppTypeResolver.INSTANCE.isSelect(context)) {
                z11 = true;
            }
            createUnknownErrorNotification = NotificationBarHelperKt.createNetworkErrorNotificationDTO(z11);
        } else {
            createUnknownErrorNotification = NotificationsKt.createUnknownErrorNotification();
        }
        showNotification(createUnknownErrorNotification);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListView
    public void showSendError() {
        showNotification(NotificationsKt.createFailedToSendNotification());
    }
}
