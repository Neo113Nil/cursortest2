package ru.ozon.app.android.delivery.customActionsHandlers.removePost;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.removePost.PostRepository", f = "PostRepository.kt", l = {10}, m = "removePost")
/* loaded from: classes11.dex */
final class PostRepository$removePost$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRepository$removePost$1(PostRepository postRepository, d<? super PostRepository$removePost$1> dVar) {
        super(dVar);
        this.this$0 = postRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.removePost(null, null, this);
    }
}
