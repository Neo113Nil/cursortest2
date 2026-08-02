package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentTextareaBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea.view.BulletedTextListView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea.TextareaVH$subscribeToInformerListUpdate$1$1", f = "TextareaVH.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TextareaVH$subscribeToInformerListUpdate$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextareaVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextareaVH$subscribeToInformerListUpdate$1$1(TextareaVH textareaVH, d<? super TextareaVH$subscribeToInformerListUpdate$1$1> dVar) {
        super(2, dVar);
        this.this$0 = textareaVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TextareaVH$subscribeToInformerListUpdate$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeliveryReviewFormViewModel deliveryReviewFormViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            deliveryReviewFormViewModel = this.this$0.deliveryReviewFormViewModel;
            M0<List<TextDTO>> informerList = deliveryReviewFormViewModel.getInformerList();
            final TextareaVH textareaVH = this.this$0;
            InterfaceC2397i<? super List<TextDTO>> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea.TextareaVH$subscribeToInformerListUpdate$1$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((List<TextDTO>) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(List<TextDTO> list, d<? super Unit> dVar) {
                    ItemDeliveryReviewComponentTextareaBinding itemDeliveryReviewComponentTextareaBinding;
                    itemDeliveryReviewComponentTextareaBinding = TextareaVH.this.binding;
                    TextareaVH textareaVH2 = TextareaVH.this;
                    if (list.isEmpty()) {
                        BulletedTextListView informersBTv = itemDeliveryReviewComponentTextareaBinding.informersBTv;
                        Intrinsics.checkNotNullExpressionValue(informersBTv, "informersBTv");
                        ViewExtKt.gone(informersBTv);
                        textareaVH2.updateTitleVisibility();
                    } else {
                        BulletedTextListView informersBTv2 = itemDeliveryReviewComponentTextareaBinding.informersBTv;
                        Intrinsics.checkNotNullExpressionValue(informersBTv2, "informersBTv");
                        ViewExtKt.show(informersBTv2);
                        TextView titleTv = itemDeliveryReviewComponentTextareaBinding.titleTv;
                        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
                        ViewExtKt.gone(titleTv);
                        itemDeliveryReviewComponentTextareaBinding.informersBTv.setItems(list);
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (informerList.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TextareaVH$subscribeToInformerListUpdate$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
