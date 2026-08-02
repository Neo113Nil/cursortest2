package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\bH&J\b\u0010\u0013\u001a\u00020\bH&J\b\u0010\u0014\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListView;", "", "currentList", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "getCurrentList", "()Ljava/util/List;", "loadItems", "", "list", "scrollCommentUuid", "", "scrollToComment", "aboveKeyboard", "", "showError", "throwable", "", "showSendError", "deleteComment", "onDetach", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CommentsListView {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void scrollToComment$default(CommentsListView commentsListView, String str, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToComment");
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            commentsListView.scrollToComment(str, z11);
        }
    }

    void deleteComment();

    @NotNull
    List<CommentsAdapterVO> getCurrentList();

    void loadItems(@NotNull List<? extends CommentsAdapterVO> list, String scrollCommentUuid);

    void onDetach();

    void scrollToComment(@NotNull String scrollCommentUuid, boolean aboveKeyboard);

    void showError(@NotNull Throwable throwable);

    void showSendError();
}
