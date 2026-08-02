package ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation;

import S0.InterfaceC3978p0;
import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation.ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1", f = "ToursDetailsAccordionContent.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isExpanded$delegate;
    final /* synthetic */ ToursDetailsAccordionVI $state;
    final /* synthetic */ l $tokenizedAnalytics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1(InterfaceC7851b interfaceC7851b, Context context, ToursDetailsAccordionVI toursDetailsAccordionVI, l lVar, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.$context = context;
        this.$state = toursDetailsAccordionVI;
        this.$tokenizedAnalytics = lVar;
        this.$isExpanded$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1(this.$controller, this.$context, this.$state, this.$tokenizedAnalytics, this.$isExpanded$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean ToursDetailsAccordionContent$lambda$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ToursDetailsAccordionContent$lambda$1 = ToursDetailsAccordionContentKt.ToursDetailsAccordionContent$lambda$1(this.$isExpanded$delegate);
            if (ToursDetailsAccordionContent$lambda$1) {
                this.label = 1;
                if (Y.b(150L, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        InterfaceC7851b.a.c(this.$controller, "toursDetailsAccordion", new Integer(UiExtKt.toPx(16, this.$context)), 4);
        t tokenizedEvent = this.$state.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.$tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
