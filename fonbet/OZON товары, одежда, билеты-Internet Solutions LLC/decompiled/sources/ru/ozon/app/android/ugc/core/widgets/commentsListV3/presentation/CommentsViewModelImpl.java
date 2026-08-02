package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsGateway;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import xe.C10727i;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001eJ+\u0010(\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00122\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u001eJ)\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u000204078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\r038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u00020\r0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010F\u001a\b\u0012\u0004\u0012\u00020\r0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bL\u0010N\"\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsGateway;", "gateway", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsGateway;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "commentsListVO", "", "activateCommentField", "", "loadComments", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;Z)V", "", "authorId", "sellerId", "isSubscribe", "updateCommentsSocialHeader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "", "favorites", "updateSellerSubscription", "(Ljava/util/Map;)V", "hideKeyboard", "()V", "comment", "sendComment", "(Ljava/lang/String;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "replyToComment", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)V", "closeReplyTo", "commentUuid", "params", "deleteComment", "(Ljava/lang/String;Ljava/util/Map;)V", "checkAuthorise", "uuid", "isSelected", "actionId", "updateReactionState", "(Ljava/lang/String;ZLjava/lang/String;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsGateway;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "LAe/w0;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "_actionFlow", "LAe/w0;", "LAe/h;", "actionFlow", "LAe/h;", "getActionFlow", "()LAe/h;", "_keyboardVisibility", "LAe/B0;", "keyboardVisibility", "LAe/B0;", "getKeyboardVisibility", "()LAe/B0;", "LAe/x0;", "_showLoading", "LAe/x0;", "LAe/M0;", "showLoading", "LAe/M0;", "getShowLoading", "()LAe/M0;", "currentComment", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "isCommentsVisible", "Z", "()Z", "setCommentsVisible", "(Z)V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsViewModelImpl extends w0 implements CommentsViewModel {

    @NotNull
    private final Ae.w0<Action> _actionFlow;

    @NotNull
    private final Ae.w0<Boolean> _keyboardVisibility;

    @NotNull
    private final x0<Boolean> _showLoading;

    @NotNull
    private final InterfaceC2395h<Action> actionFlow;

    @NotNull
    private final AuthStateStorage authManager;
    private CommentsAdapterVO currentComment;

    @NotNull
    private final CommentsGateway gateway;
    private boolean isCommentsVisible;

    @NotNull
    private final B0<Boolean> keyboardVisibility;

    @NotNull
    private final M0<Boolean> showLoading;

    @NotNull
    private final SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;

    public CommentsViewModelImpl(@NotNull CommentsGateway gateway, @NotNull AuthStateStorage authManager, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        this.gateway = gateway;
        this.authManager = authManager;
        this.subscribeAuthorsIdStorage = subscribeAuthorsIdStorage;
        C0 b11 = E0.b(0, 0, null, 7);
        this._actionFlow = b11;
        this.actionFlow = b11;
        C0 b12 = E0.b(1, 0, null, 6);
        this._keyboardVisibility = b12;
        this.keyboardVisibility = b12;
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._showLoading = a11;
        this.showLoading = a11;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void checkAuthorise() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$checkAuthorise$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void closeReplyTo() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$closeReplyTo$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void deleteComment(@NotNull String commentUuid, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(commentUuid, "commentUuid");
        Intrinsics.checkNotNullParameter(params, "params");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$deleteComment$1(this, commentUuid, params, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    @NotNull
    public InterfaceC2395h<Action> getActionFlow() {
        return this.actionFlow;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    @NotNull
    public B0<Boolean> getKeyboardVisibility() {
        return this.keyboardVisibility;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    @NotNull
    public M0<Boolean> getShowLoading() {
        return this.showLoading;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void hideKeyboard() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$hideKeyboard$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    /* renamed from: isCommentsVisible, reason: from getter */
    public boolean getIsCommentsVisible() {
        return this.isCommentsVisible;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void loadComments(@NotNull CommentsListVO commentsListVO, boolean activateCommentField) {
        Intrinsics.checkNotNullParameter(commentsListVO, "commentsListVO");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$loadComments$1(this, activateCommentField, commentsListVO, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void replyToComment(@NotNull CommentsAdapterVO comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$replyToComment$1(this, comment, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void sendComment(@NotNull String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$sendComment$1(this, comment, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void setCommentsVisible(boolean z11) {
        this.isCommentsVisible = z11;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void updateCommentsSocialHeader(String authorId, String sellerId, Boolean isSubscribe) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$updateCommentsSocialHeader$1(this, authorId, isSubscribe, sellerId, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void updateReactionState(@NotNull String uuid, boolean isSelected, String actionId) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CommentsViewModelImpl$updateReactionState$1(this, uuid, isSelected, actionId, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel
    public void updateSellerSubscription(@NotNull Map<Long, Boolean> favorites) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        for (Map.Entry<Long, Boolean> entry : favorites.entrySet()) {
            long longValue = entry.getKey().longValue();
            Boolean value = entry.getValue();
            value.booleanValue();
            CommentsViewModel.DefaultImpls.updateCommentsSocialHeader$default(this, null, String.valueOf(longValue), value, 1, null);
        }
    }
}
