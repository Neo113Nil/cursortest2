package ru.ozon.android.messenger.framework.data.repository;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.A;

/* loaded from: classes10.dex */
public final class l0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f88572a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f88573a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UpdateGlobalCounterRepository$start$lambda$0$$inlined$filterIsInstance$1$2", f = "UpdateGlobalCounterRepository.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.data.repository.l0$a$a, reason: collision with other inner class name */
        public static final class C1631a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f88574d;

            /* renamed from: e, reason: collision with root package name */
            int f88575e;

            public C1631a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f88574d = obj;
                this.f88575e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f88573a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1631a c1631a;
            int i11;
            if (dVar instanceof C1631a) {
                c1631a = (C1631a) dVar;
                int i12 = c1631a.f88575e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1631a.f88575e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1631a.f88574d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1631a.f88575e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        if (obj instanceof A.h) {
                            c1631a.f88575e = 1;
                            if (this.f88573a.emit(obj, c1631a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c1631a = new C1631a(dVar);
            Object obj22 = c1631a.f88574d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1631a.f88575e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public l0(InterfaceC2395h interfaceC2395h) {
        this.f88572a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Object> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f88572a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
