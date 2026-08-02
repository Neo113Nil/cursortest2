package ru.ozon.android.messenger.blocks.input.pickerlauncher;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.s;
import android.net.Uri;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.input.pickerlauncher.f;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import xe.M;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.pickerlauncher.AttachmentsPickerLauncherImpl$subscribeOnPickerEventBus$1", f = "AttachmentsPickerLauncher.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85549d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f85550e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f85551a;

        a(b bVar) {
            this.f85551a = bVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            C11115c c11115c;
            C11115c c11115c2;
            C11115c c11115c3;
            ru.ozon.android.messenger.framework.navigation.controller.d dVar2 = (ru.ozon.android.messenger.framework.navigation.controller.d) obj;
            boolean z11 = dVar2 instanceof d.k;
            b bVar = this.f85551a;
            if (z11) {
                c11115c3 = bVar.f85540d;
                Object n11 = c11115c3.n(new f.a(((d.k) dVar2).a()), dVar);
                return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
            }
            if (dVar2 instanceof d.l) {
                c11115c2 = bVar.f85540d;
                Object n12 = c11115c2.n(new f.b(((d.l) dVar2).a()), dVar);
                return n12 == Wc.a.COROUTINE_SUSPENDED ? n12 : Unit.f71690a;
            }
            if (!(dVar2 instanceof d.m)) {
                if (dVar2 instanceof d.f) {
                    b.c(bVar, (d.f) dVar2);
                }
                return Unit.f71690a;
            }
            c11115c = bVar.f85540d;
            Uri data = ((d.m) dVar2).a();
            Intrinsics.checkNotNullParameter(data, "data");
            Object n13 = c11115c.n(new f.b(C7714v.a0(data)), dVar);
            return n13 == Wc.a.COROUTINE_SUSPENDED ? n13 : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f85550e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f85550e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.navigation.controller.a aVar;
        B0<ru.ozon.android.messenger.framework.navigation.controller.d> b11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85549d;
        if (i11 == 0) {
            s.b(obj);
            b bVar = this.f85550e;
            aVar = bVar.f85537a;
            ru.ozon.android.messenger.framework.navigation.controller.b bVar2 = aVar instanceof ru.ozon.android.messenger.framework.navigation.controller.b ? (ru.ozon.android.messenger.framework.navigation.controller.b) aVar : null;
            if (bVar2 == null || (b11 = bVar2.b()) == null) {
                return Unit.f71690a;
            }
            a aVar3 = new a(bVar);
            this.f85549d = 1;
            if (b11.collect(aVar3, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
