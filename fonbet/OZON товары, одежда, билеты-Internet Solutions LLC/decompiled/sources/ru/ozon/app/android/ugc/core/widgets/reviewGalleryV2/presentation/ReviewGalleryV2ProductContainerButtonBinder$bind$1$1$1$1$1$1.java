package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1$1$1$1", f = "ReviewGalleryV2ProductContainerButtonBinder.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomActionDTO $action;
    final /* synthetic */ IconButtonV3DTO $atom;
    final /* synthetic */ boolean $inCartForView;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ ReviewGalleryV2ProductContainerButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1$1$1$1(ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, boolean z11, Long l11, d<? super ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryV2ProductContainerButtonBinder;
        this.$atom = iconButtonV3DTO;
        this.$action = atomActionDTO;
        this.$inCartForView = z11;
        this.$widgetId = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1$1$1$1(this.this$0, this.$atom, this.$action, this.$inCartForView, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object onAddToCart;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder = this.this$0;
            IconButtonV3DTO iconButtonV3DTO = this.$atom;
            AtomActionDTO atomActionDTO = this.$action;
            boolean z11 = this.$inCartForView;
            Long l11 = this.$widgetId;
            this.label = 1;
            onAddToCart = reviewGalleryV2ProductContainerButtonBinder.onAddToCart(iconButtonV3DTO, atomActionDTO, z11, l11, this);
            if (onAddToCart == aVar) {
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
        return ((ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
