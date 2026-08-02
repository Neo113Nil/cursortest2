package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class q0 implements InterfaceC2395h<ru.ozon.android.messenger.blocks.pinneditem.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f90327a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f90328a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$special$$inlined$map$5$2", f = "ChatViewModel.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.q0$a$a, reason: collision with other inner class name */
        public static final class C1671a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f90329d;

            /* renamed from: e, reason: collision with root package name */
            int f90330e;

            public C1671a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f90329d = obj;
                this.f90330e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f90328a = interfaceC2397i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1671a c1671a;
            int i11;
            if (dVar instanceof C1671a) {
                c1671a = (C1671a) dVar;
                int i12 = c1671a.f90330e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1671a.f90330e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1671a.f90329d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1671a.f90330e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        Object l11 = kotlin.sequences.l.l(kotlin.sequences.l.w(kotlin.sequences.l.m(C7714v.w(((ru.ozon.android.messenger.framework.presentation.models.l) obj).a().a()), f0.f90252b), g0.f90255b));
                        c1671a.f90330e = 1;
                        if (this.f90328a.emit(l11, c1671a) == aVar) {
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
            c1671a = new C1671a(dVar);
            Object obj22 = c1671a.f90329d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1671a.f90330e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public q0(InterfaceC2395h interfaceC2395h) {
        this.f90327a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ru.ozon.android.messenger.blocks.pinneditem.g> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f90327a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
