package ru.ozon.app.android.pdp.widgets.descriptionAccordion.core;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.data.DescriptionAccordionDTO;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper$constructLayout$1", f = "DescriptionAccordionViewMapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DescriptionAccordionViewMapper$constructLayout$1 extends j implements Function2<TranslateViewModel.TranslateState, d<? super Unit>, Object> {
    final /* synthetic */ TranslateViewModel $translateViewModel;
    final /* synthetic */ l $viewObject;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DescriptionAccordionViewMapper$constructLayout$1(l lVar, TranslateViewModel translateViewModel, d<? super DescriptionAccordionViewMapper$constructLayout$1> dVar) {
        super(2, dVar);
        this.$viewObject = lVar;
        this.$translateViewModel = translateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DescriptionAccordionViewMapper$constructLayout$1 descriptionAccordionViewMapper$constructLayout$1 = new DescriptionAccordionViewMapper$constructLayout$1(this.$viewObject, this.$translateViewModel, dVar);
        descriptionAccordionViewMapper$constructLayout$1.L$0 = obj;
        return descriptionAccordionViewMapper$constructLayout$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String a11;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if ((((TranslateViewModel.TranslateState) this.L$0) instanceof TranslateViewModel.TranslateState.Translated) && (a11 = this.$viewObject.c().c().a()) != null) {
            this.$translateViewModel.fetchAsyncWidget(a11, DescriptionAccordionDTO.class);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TranslateViewModel.TranslateState translateState, d<? super Unit> dVar) {
        return ((DescriptionAccordionViewMapper$constructLayout$1) create(translateState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
