package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core;

import A00.a;
import S0.A1;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel;
import v0.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$2$1", f = "ReviewGalleryPreviewComposeWidget.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ A1<a> $composerEvent$delegate;
    final /* synthetic */ I $listState;
    final /* synthetic */ A1<ReviewGalleryPreviewViewModel.Previews> $previews$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$2$1(I i11, A1<? extends a> a12, A1<ReviewGalleryPreviewViewModel.Previews> a13, d<? super ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$2$1> dVar) {
        super(2, dVar);
        this.$listState = i11;
        this.$composerEvent$delegate = a12;
        this.$previews$delegate = a13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$2$1(this.$listState, this.$composerEvent$delegate, this.$previews$delegate, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4.getClearScrollState() != false) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a invoke$lambda$3;
        a invoke$lambda$32;
        ReviewGalleryPreviewViewModel.Previews invoke$lambda$2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            invoke$lambda$3 = ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1.AnonymousClass4.AnonymousClass3.AnonymousClass1.invoke$lambda$3(this.$composerEvent$delegate);
            if (!(invoke$lambda$3 instanceof a.u.b)) {
                invoke$lambda$32 = ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1.AnonymousClass4.AnonymousClass3.AnonymousClass1.invoke$lambda$3(this.$composerEvent$delegate);
                if (!Intrinsics.d(invoke$lambda$32, a.u.c.f253a)) {
                    invoke$lambda$2 = ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1.AnonymousClass4.AnonymousClass3.AnonymousClass1.invoke$lambda$2(this.$previews$delegate);
                }
            }
            I i12 = this.$listState;
            this.label = 1;
            int i13 = I.f101468y;
            if (i12.G(0, 0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
