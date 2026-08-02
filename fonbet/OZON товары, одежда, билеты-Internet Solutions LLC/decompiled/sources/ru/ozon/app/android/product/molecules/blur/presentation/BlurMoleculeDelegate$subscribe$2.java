package ru.ozon.app.android.product.molecules.blur.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "adultConfirmed", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate$subscribe$2", f = "BlurMoleculeDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BlurMoleculeDelegate$subscribe$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BlurMoleculeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlurMoleculeDelegate$subscribe$2(BlurMoleculeDelegate blurMoleculeDelegate, d<? super BlurMoleculeDelegate$subscribe$2> dVar) {
        super(2, dVar);
        this.this$0 = blurMoleculeDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BlurMoleculeDelegate$subscribe$2 blurMoleculeDelegate$subscribe$2 = new BlurMoleculeDelegate$subscribe$2(this.this$0, dVar);
        blurMoleculeDelegate$subscribe$2.L$0 = obj;
        return blurMoleculeDelegate$subscribe$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, d<? super Unit> dVar) {
        return ((BlurMoleculeDelegate$subscribe$2) create(bool, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BlurMoleculeView blurMoleculeView;
        Function0<Unit> onAdultConfirmed;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Boolean bool = (Boolean) this.L$0;
        if (bool.booleanValue() && (onAdultConfirmed = this.this$0.getOnAdultConfirmed()) != null) {
            onAdultConfirmed.invoke();
        }
        blurMoleculeView = this.this$0.moleculeView;
        if (blurMoleculeView != null) {
            blurMoleculeView.setVisibility(!bool.booleanValue() ? 0 : 8);
        }
        return Unit.f71690a;
    }
}
