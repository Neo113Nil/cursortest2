package ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsGateway", f = "CommentsGateway.kt", l = {24}, m = "loadComments")
/* loaded from: classes2.dex */
final class CommentsGateway$loadComments$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommentsGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsGateway$loadComments$1(CommentsGateway commentsGateway, d<? super CommentsGateway$loadComments$1> dVar) {
        super(dVar);
        this.this$0 = commentsGateway;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.loadComments(null, this);
    }
}
