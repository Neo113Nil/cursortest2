package ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isFavorite", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1", f = "SisBrandFavoriteButtonDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    final /* synthetic */ SisBrandFavoriteButton $button;
    final /* synthetic */ Function0<Unit> $updateColorsOnScroll;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ SisBrandFavoriteButtonDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1(SisBrandFavoriteButton sisBrandFavoriteButton, SisBrandFavoriteButtonDelegateImpl sisBrandFavoriteButtonDelegateImpl, Function0<Unit> function0, d<? super SisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1> dVar) {
        super(2, dVar);
        this.$button = sisBrandFavoriteButton;
        this.this$0 = sisBrandFavoriteButtonDelegateImpl;
        this.$updateColorsOnScroll = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1 sisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1 = new SisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1(this.$button, this.this$0, this.$updateColorsOnScroll, dVar);
        sisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1.Z$0 = ((Boolean) obj).booleanValue();
        return sisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$button.setFavorite(this.Z$0);
        SisBrandFavoriteButtonDelegateImpl sisBrandFavoriteButtonDelegateImpl = this.this$0;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.$button;
        function1 = sisBrandFavoriteButtonDelegateImpl.actionHandler;
        sisBrandFavoriteButtonDelegateImpl.bindButton(sisBrandFavoriteButton, function1);
        Function0<Unit> function0 = this.$updateColorsOnScroll;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((SisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
