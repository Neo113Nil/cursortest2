package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p0 implements InterfaceC2395h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f90319a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f90320a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$special$$inlined$map$4$2", f = "ChatViewModel.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.p0$a$a, reason: collision with other inner class name */
        public static final class C1670a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f90321d;

            /* renamed from: e, reason: collision with root package name */
            int f90322e;

            public C1670a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f90321d = obj;
                this.f90322e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f90320a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1670a c1670a;
            int i11;
            if (dVar instanceof C1670a) {
                c1670a = (C1670a) dVar;
                int i12 = c1670a.f90322e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1670a.f90322e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1670a.f90321d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1670a.f90322e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        Boolean valueOf = Boolean.valueOf(!((C0) obj).a().isEmpty());
                        c1670a.f90322e = 1;
                        if (this.f90320a.emit(valueOf, c1670a) == aVar) {
                            return aVar;
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
            c1670a = new C1670a(dVar);
            Object obj22 = c1670a.f90321d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1670a.f90322e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public p0(InterfaceC2395h interfaceC2395h) {
        this.f90319a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Boolean> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f90319a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
