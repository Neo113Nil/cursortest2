package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m0 implements InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.models.l> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f90296a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9467e f90297b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f90298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9467e f90299b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$special$$inlined$map$1$2", f = "ChatViewModel.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.m0$a$a, reason: collision with other inner class name */
        public static final class C1667a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f90300d;

            /* renamed from: e, reason: collision with root package name */
            int f90301e;

            public C1667a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f90300d = obj;
                this.f90301e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, C9467e c9467e) {
            this.f90298a = interfaceC2397i;
            this.f90299b = c9467e;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1667a c1667a;
            int i11;
            ru.ozon.android.messenger.framework.presentation.mapper.a aVar;
            if (dVar instanceof C1667a) {
                c1667a = (C1667a) dVar;
                int i12 = c1667a.f90301e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1667a.f90301e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1667a.f90300d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1667a.f90301e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        aVar = this.f90299b.f90228u;
                        aVar.getClass();
                        ru.ozon.android.messenger.framework.presentation.models.l b11 = ru.ozon.android.messenger.framework.presentation.mapper.a.b((ru.ozon.android.messenger.framework.domain.model.b) obj);
                        c1667a.f90301e = 1;
                        if (this.f90298a.emit(b11, c1667a) == aVar2) {
                            return aVar2;
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
            c1667a = new C1667a(dVar);
            Object obj22 = c1667a.f90300d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1667a.f90301e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public m0(InterfaceC2395h interfaceC2395h, C9467e c9467e) {
        this.f90296a = interfaceC2395h;
        this.f90297b = c9467e;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.l> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f90296a.collect(new a(interfaceC2397i, this.f90297b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
