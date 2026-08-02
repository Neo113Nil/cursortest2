package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentActionHandler;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/BaseCommentFooterActionHandler;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel;", "commentModalViewModelProvider", "<init>", "(LPc/a;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommentActionHandler extends BaseCommentFooterActionHandler {

    @NotNull
    private final String actionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentActionHandler(@NotNull a<CommentFooterViewModel> commentModalViewModelProvider) {
        super(commentModalViewModelProvider);
        Intrinsics.checkNotNullParameter(commentModalViewModelProvider, "commentModalViewModelProvider");
        this.actionId = "comment";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }
}
