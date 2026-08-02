package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class E0 implements InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.models.l> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f89243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89244b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f89245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9414c0 f89246b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$special$$inlined$map$1$2", f = "AiAssistantViewModel.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.E0$a$a, reason: collision with other inner class name */
        public static final class C1643a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f89247d;

            /* renamed from: e, reason: collision with root package name */
            int f89248e;

            public C1643a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f89247d = obj;
                this.f89248e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, C9414c0 c9414c0) {
            this.f89245a = interfaceC2397i;
            this.f89246b = c9414c0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1643a c1643a;
            int i11;
            ru.ozon.android.messenger.framework.presentation.mapper.a aVar;
            if (dVar instanceof C1643a) {
                c1643a = (C1643a) dVar;
                int i12 = c1643a.f89248e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1643a.f89248e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1643a.f89247d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1643a.f89248e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        aVar = this.f89246b.f89511n;
                        aVar.getClass();
                        ru.ozon.android.messenger.framework.presentation.models.l b11 = ru.ozon.android.messenger.framework.presentation.mapper.a.b((ru.ozon.android.messenger.framework.domain.model.b) obj);
                        c1643a.f89248e = 1;
                        if (this.f89245a.emit(b11, c1643a) == aVar2) {
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
            c1643a = new C1643a(dVar);
            Object obj22 = c1643a.f89247d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1643a.f89248e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public E0(InterfaceC2395h interfaceC2395h, C9414c0 c9414c0) {
        this.f89243a = interfaceC2395h;
        this.f89244b = c9414c0;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.l> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f89243a.collect(new a(interfaceC2397i, this.f89244b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
