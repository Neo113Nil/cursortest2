package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r0 implements InterfaceC2395h<ru.ozon.android.messenger.blocks.input.d> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f90334a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f90335a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$special$$inlined$map$6$2", f = "ChatViewModel.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.r0$a$a, reason: collision with other inner class name */
        public static final class C1672a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f90336d;

            /* renamed from: e, reason: collision with root package name */
            int f90337e;

            public C1672a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f90336d = obj;
                this.f90337e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f90335a = interfaceC2397i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1672a c1672a;
            int i11;
            if (dVar instanceof C1672a) {
                c1672a = (C1672a) dVar;
                int i12 = c1672a.f90337e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1672a.f90337e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1672a.f90336d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1672a.f90337e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        Object l11 = kotlin.sequences.l.l(kotlin.sequences.l.w(kotlin.sequences.l.m(C7714v.w(((ru.ozon.android.messenger.framework.presentation.models.l) obj).a().a()), W.f90038b), X.f90039b));
                        c1672a.f90337e = 1;
                        if (this.f90335a.emit(l11, c1672a) == aVar) {
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
            c1672a = new C1672a(dVar);
            Object obj22 = c1672a.f90336d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1672a.f90337e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public r0(InterfaceC2395h interfaceC2395h) {
        this.f90334a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ru.ozon.android.messenger.blocks.input.d> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f90334a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
