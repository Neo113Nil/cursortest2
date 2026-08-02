package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel", f = "ReviewFormViewModel.kt", l = {241, 506, 246, 262}, m = "sendReview")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$sendReview$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReviewFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormViewModel$sendReview$1(ReviewFormViewModel reviewFormViewModel, d<? super ReviewFormViewModel$sendReview$1> dVar) {
        super(dVar);
        this.this$0 = reviewFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object sendReview;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        sendReview = this.this$0.sendReview(null, null, null, false, this);
        return sendReview;
    }
}
