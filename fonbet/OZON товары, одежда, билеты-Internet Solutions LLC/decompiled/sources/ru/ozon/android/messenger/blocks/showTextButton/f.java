package ru.ozon.android.messenger.blocks.showTextButton;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.showTextButton.a;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.showTextButton.ShowTextButtonComposeKt$ShowHiddenTextContent$1$1", f = "ShowTextButtonCompose.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<a, Unit> f86397d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f86398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    f(Function1<? super a, Unit> function1, ButtonV3DTO buttonV3DTO, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f86397d = function1;
        this.f86398e = buttonV3DTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f86397d, this.f86398e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f86397d.invoke(new a.b(new k(this.f86398e, false)));
        return Unit.f71690a;
    }
}
