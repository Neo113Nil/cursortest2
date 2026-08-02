package ru.ozon.android.messenger.blocks.input.viewmodel;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.InputBlockViewModel$subscribeOnPickerEvents$1", f = "InputBlockViewModel.kt", l = {339}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85658d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f85659e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f85660a;

        a(h hVar) {
            this.f85660a = hVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ((ru.ozon.android.messenger.blocks.input.attachments.manager.d) this.f85660a.f85626c).o((ru.ozon.android.messenger.blocks.input.pickerlauncher.f) obj);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(h hVar, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f85659e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f85659e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.blocks.input.pickerlauncher.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85658d;
        if (i11 == 0) {
            s.b(obj);
            h hVar = this.f85659e;
            aVar = hVar.f85627d;
            InterfaceC2395h<ru.ozon.android.messenger.blocks.input.pickerlauncher.f> d11 = ((ru.ozon.android.messenger.blocks.input.pickerlauncher.b) aVar).d();
            a aVar3 = new a(hVar);
            this.f85658d = 1;
            if (d11.collect(aVar3, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
