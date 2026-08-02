package ru.ozon.android.messenger.framework.data.repository;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;

/* loaded from: classes10.dex */
public final class J implements InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.models.A> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2408n0 f88353a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.mapper.c f88354b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f88355a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.mapper.c f88356b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$getEvents$$inlined$map$1$2", f = "ChatRepositoryImpl.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.data.repository.J$a$a, reason: collision with other inner class name */
        public static final class C1629a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f88357d;

            /* renamed from: e, reason: collision with root package name */
            int f88358e;

            public C1629a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f88357d = obj;
                this.f88358e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, ru.ozon.android.messenger.framework.data.remote.mapper.c cVar) {
            this.f88355a = interfaceC2397i;
            this.f88356b = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1629a c1629a;
            int i11;
            if (dVar instanceof C1629a) {
                c1629a = (C1629a) dVar;
                int i12 = c1629a.f88358e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1629a.f88358e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1629a.f88357d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1629a.f88358e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        ru.ozon.android.messenger.framework.presentation.models.A a11 = this.f88356b.a((SocketEventDTO) obj);
                        c1629a.f88358e = 1;
                        if (this.f88355a.emit(a11, c1629a) == aVar) {
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
            c1629a = new C1629a(dVar);
            Object obj22 = c1629a.f88357d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1629a.f88358e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public J(C2408n0 c2408n0, ru.ozon.android.messenger.framework.data.remote.mapper.c cVar) {
        this.f88353a = c2408n0;
        this.f88354b = cVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.A> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f88353a.collect(new a(interfaceC2397i, this.f88354b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
