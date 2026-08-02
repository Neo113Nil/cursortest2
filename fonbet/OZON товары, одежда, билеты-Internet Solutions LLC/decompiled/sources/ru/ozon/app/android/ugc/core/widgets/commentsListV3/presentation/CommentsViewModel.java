package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.B0;
import Ae.InterfaceC2395h;
import Ae.M0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00042\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\rH&¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010\u000bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0014008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001c\u00104\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "", "", "comment", "", "sendComment", "(Ljava/lang/String;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "replyToComment", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)V", "closeReplyTo", "()V", "commentUuid", "", "params", "deleteComment", "(Ljava/lang/String;Ljava/util/Map;)V", "checkAuthorise", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "commentsListVO", "", "activateCommentField", "loadComments", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;Z)V", "authorId", "sellerId", "isSubscribe", "updateCommentsSocialHeader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "favorites", "updateSellerSubscription", "(Ljava/util/Map;)V", "uuid", "isSelected", "actionId", "updateReactionState", "(Ljava/lang/String;ZLjava/lang/String;)V", "hideKeyboard", "LAe/h;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "getActionFlow", "()LAe/h;", "actionFlow", "LAe/B0;", "getKeyboardVisibility", "()LAe/B0;", "keyboardVisibility", "LAe/M0;", "getShowLoading", "()LAe/M0;", "showLoading", "isCommentsVisible", "()Z", "setCommentsVisible", "(Z)V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CommentsViewModel {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void updateCommentsSocialHeader$default(CommentsViewModel commentsViewModel, String str, String str2, Boolean bool, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCommentsSocialHeader");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                bool = null;
            }
            commentsViewModel.updateCommentsSocialHeader(str, str2, bool);
        }
    }

    void checkAuthorise();

    void closeReplyTo();

    void deleteComment(@NotNull String commentUuid, @NotNull Map<String, String> params);

    @NotNull
    InterfaceC2395h<Action> getActionFlow();

    @NotNull
    B0<Boolean> getKeyboardVisibility();

    @NotNull
    M0<Boolean> getShowLoading();

    void hideKeyboard();

    boolean isCommentsVisible();

    void loadComments(@NotNull CommentsListVO commentsListVO, boolean activateCommentField);

    void replyToComment(@NotNull CommentsAdapterVO comment);

    void sendComment(@NotNull String comment);

    void setCommentsVisible(boolean z11);

    void updateCommentsSocialHeader(String authorId, String sellerId, Boolean isSubscribe);

    void updateReactionState(@NotNull String uuid, boolean isSelected, String actionId);

    void updateSellerSubscription(@NotNull Map<Long, Boolean> favorites);
}
