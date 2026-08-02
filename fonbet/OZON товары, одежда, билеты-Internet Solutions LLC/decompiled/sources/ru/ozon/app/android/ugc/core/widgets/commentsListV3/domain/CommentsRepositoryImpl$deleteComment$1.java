package ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepositoryImpl", f = "CommentsRepository.kt", l = {147}, m = "deleteComment-BWLJW6A")
/* loaded from: classes2.dex */
final class CommentsRepositoryImpl$deleteComment$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommentsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsRepositoryImpl$deleteComment$1(CommentsRepositoryImpl commentsRepositoryImpl, d<? super CommentsRepositoryImpl$deleteComment$1> dVar) {
        super(dVar);
        this.this$0 = commentsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo1479deleteCommentBWLJW6A = this.this$0.mo1479deleteCommentBWLJW6A(null, null, null, this);
        return mo1479deleteCommentBWLJW6A == a.COROUTINE_SUSPENDED ? mo1479deleteCommentBWLJW6A : r.a(mo1479deleteCommentBWLJW6A);
    }
}
