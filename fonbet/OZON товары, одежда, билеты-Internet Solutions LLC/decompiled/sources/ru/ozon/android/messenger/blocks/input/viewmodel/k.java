package ru.ozon.android.messenger.blocks.input.viewmodel;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.input.attachments.manager.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.InputBlockViewModel$subscribeOnAttachmentManager$1", f = "InputBlockViewModel.kt", l = {323}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85655d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f85656e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f85657a;

        a(h hVar) {
            this.f85657a = hVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            c cVar;
            a.C1497a c1497a = (a.C1497a) obj;
            h hVar = this.f85657a;
            cVar = hVar.f85632i;
            ru.ozon.android.messenger.utils.coroutines.d.a(hVar.d0(), new j(cVar.a(c1497a.a()), c1497a));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(h hVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f85656e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f85656e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85655d;
        if (i11 == 0) {
            s.b(obj);
            h hVar = this.f85656e;
            InterfaceC2395h<a.C1497a> s11 = ((ru.ozon.android.messenger.blocks.input.attachments.manager.d) hVar.f85626c).s();
            a aVar2 = new a(hVar);
            this.f85655d = 1;
            if (s11.collect(aVar2, this) == aVar) {
                return aVar;
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
