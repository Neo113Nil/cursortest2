package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.comment.data.NewCommentResponse;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CommentViewModelImpl$sendComment$1 extends C7735q implements Function1<NewCommentResponse, Unit> {
    CommentViewModelImpl$sendComment$1(Object obj) {
        super(1, obj, CommentViewModelImpl.class, "processSendingSuccess", "processSendingSuccess(Lru/ozon/app/android/checkoutcomposer/comment/data/NewCommentResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NewCommentResponse newCommentResponse) {
        invoke2(newCommentResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NewCommentResponse p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CommentViewModelImpl) this.receiver).processSendingSuccess(p02);
    }
}
