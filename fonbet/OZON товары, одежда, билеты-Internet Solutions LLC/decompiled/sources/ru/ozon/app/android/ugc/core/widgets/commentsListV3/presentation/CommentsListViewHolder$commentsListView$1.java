package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class CommentsListViewHolder$commentsListView$1 extends C7735q implements Function2<String, Map<String, ? extends String>, Unit> {
    CommentsListViewHolder$commentsListView$1(Object obj) {
        super(2, obj, CommentsListViewHolder.class, "showDeleteCommentBottomSheetDialog", "showDeleteCommentBottomSheetDialog(Ljava/lang/String;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Map<String, ? extends String> map) {
        invoke2(str, (Map<String, String>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02, Map<String, String> p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((CommentsListViewHolder) this.receiver).showDeleteCommentBottomSheetDialog(p02, p12);
    }
}
