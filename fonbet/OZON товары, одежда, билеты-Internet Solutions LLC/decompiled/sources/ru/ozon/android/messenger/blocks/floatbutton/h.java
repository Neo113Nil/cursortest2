package ru.ozon.android.messenger.blocks.floatbutton;

import S0.InterfaceC3978p0;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.floatbutton.FloatButtonViewKt$FloatButtonView$2$1$1$1", f = "FloatButtonView.kt", l = {66, 68}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85224d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f85225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(InterfaceC3978p0<Boolean> interfaceC3978p0, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f85225e = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f85225e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (xe.Y.b(5000, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (xe.Y.b(1500, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85224d;
        InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f85225e;
        if (i11 == 0) {
            s.b(obj);
            this.f85224d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                interfaceC3978p0.setValue(Boolean.FALSE);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        interfaceC3978p0.setValue(Boolean.TRUE);
        this.f85224d = 2;
    }
}
