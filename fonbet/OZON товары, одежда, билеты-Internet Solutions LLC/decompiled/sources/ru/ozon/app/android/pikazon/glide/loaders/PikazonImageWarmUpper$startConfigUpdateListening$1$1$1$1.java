package ru.ozon.app.android.pikazon.glide.loaders;

import Sc.s;
import Ud0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pikazon.glide.loaders.PikazonImageWarmUpper$startConfigUpdateListening$1$1$1$1", f = "PikazonImageWarmUpper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class PikazonImageWarmUpper$startConfigUpdateListening$1$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ a.b $warmUpData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PikazonImageWarmUpper$startConfigUpdateListening$1$1$1$1(a.b bVar, d<? super PikazonImageWarmUpper$startConfigUpdateListening$1$1$1$1> dVar) {
        super(2, dVar);
        this.$warmUpData = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PikazonImageWarmUpper$startConfigUpdateListening$1$1$1$1(this.$warmUpData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PikazonImageWarmUpper.INSTANCE.m900warmUpIoAF18A(this.$warmUpData);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PikazonImageWarmUpper$startConfigUpdateListening$1$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
