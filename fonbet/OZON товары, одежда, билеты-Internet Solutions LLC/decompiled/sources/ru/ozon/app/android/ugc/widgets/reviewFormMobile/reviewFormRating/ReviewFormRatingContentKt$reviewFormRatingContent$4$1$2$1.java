package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import S0.InterfaceC3978p0;
import Sc.s;
import Z1.h;
import a00.C4911f;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingContentKt$reviewFormRatingContent$4;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1", f = "ReviewFormRatingContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ Z1.d $density;
    final /* synthetic */ InterfaceC3978p0<h> $fullScreenHeightDp$delegate;
    final /* synthetic */ i<ReviewFormRatingVO> $this_content;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1(C4911f c4911f, i<ReviewFormRatingVO> iVar, Z1.d dVar, InterfaceC3978p0<h> interfaceC3978p0, d<? super ReviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1> dVar2) {
        super(2, dVar2);
        this.$container = c4911f;
        this.$this_content = iVar;
        this.$density = dVar;
        this.$fullScreenHeightDp$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1(this.$container, this.$this_content, this.$density, this.$fullScreenHeightDp$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        View view;
        float invoke$lambda$1;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ComponentCallbacksC5392m c11 = this.$container.c();
        if (c11 != null && (view = c11.getView()) != null) {
            i<ReviewFormRatingVO> iVar = this.$this_content;
            Z1.d dVar = this.$density;
            InterfaceC3978p0<h> interfaceC3978p0 = this.$fullScreenHeightDp$delegate;
            RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view);
            ViewExtKt.showOrGone(ComposerViewExtensionKt.composerBottomContainer(view), Boolean.valueOf(!iVar.b().getIsRatingFullScreen()));
            if (composerRecyclerViewOrNull != null) {
                ScrollExtKt.scrollEnable(composerRecyclerViewOrNull, !iVar.b().getIsRatingFullScreen());
            }
            if (iVar.b().getIsRatingFullScreen()) {
                invoke$lambda$1 = ReviewFormRatingContentKt$reviewFormRatingContent$4.AnonymousClass1.invoke$lambda$1(interfaceC3978p0);
                if (h.b(invoke$lambda$1, 0)) {
                    int height = (composerRecyclerViewOrNull != null ? composerRecyclerViewOrNull.getHeight() : 0) - ComposerViewExtensionKt.composerTopContainer(view).getHeight();
                    if (height > 0) {
                        ReviewFormRatingContentKt$reviewFormRatingContent$4.AnonymousClass1.invoke$lambda$2(interfaceC3978p0, h.a(dVar.B(height)).d());
                    }
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
