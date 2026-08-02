package ru.ozon.android.messenger.framework.presentation.ai;

import J0.C3326o1;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiSourcesCurtainKt$AiSourcesCurtain$1$1$1$1", f = "AiSourcesCurtain.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class L0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89289d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3326o1 f89290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L0(C3326o1 c3326o1, kotlin.coroutines.d<? super L0> dVar) {
        super(2, dVar);
        this.f89290e = c3326o1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new L0(this.f89290e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89289d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f89289d = 1;
            if (this.f89290e.g(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
