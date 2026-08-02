package ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepositoryImpl", f = "CommentsRepository.kt", l = {151, 168}, m = "sendComment")
/* loaded from: classes2.dex */
final class CommentsRepositoryImpl$sendComment$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommentsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsRepositoryImpl$sendComment$1(CommentsRepositoryImpl commentsRepositoryImpl, d<? super CommentsRepositoryImpl$sendComment$1> dVar) {
        super(dVar);
        this.this$0 = commentsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.sendComment(null, null, null, null, null, this);
    }
}
