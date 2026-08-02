package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentsListViewHolder$showDeleteCommentBottomSheetDialog$1 extends AbstractC7737t implements Function2<String, Bundle, Unit> {
    final /* synthetic */ String $commentUuid;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ CommentsListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsListViewHolder$showDeleteCommentBottomSheetDialog$1(CommentsListViewHolder commentsListViewHolder, String str, Map<String, String> map) {
        super(2);
        this.this$0 = commentsListViewHolder;
        this.$commentUuid = str;
        this.$params = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
        invoke2(str, bundle);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Bundle bundle) {
        CommentsViewModel commentsViewModel;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getString("review_uuid_extra") != null) {
            CommentsListViewHolder commentsListViewHolder = this.this$0;
            String str2 = this.$commentUuid;
            Map<String, String> map = this.$params;
            commentsViewModel = commentsListViewHolder.viewModel;
            commentsViewModel.deleteComment(str2, map);
        }
    }
}
