package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "uuid", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentsAdapter$onCreateViewHolder$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ CommentsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsAdapter$onCreateViewHolder$1(CommentsAdapter commentsAdapter) {
        super(1);
        this.this$0 = commentsAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String uuid) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        function2 = this.this$0.deleteComment;
        function2.invoke(uuid, U.c());
    }
}
