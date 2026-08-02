package ru.ozon.android.messenger.framework.data.repository;

import Sc.r;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class h0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.database.c f88534a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.mapper.c f88535b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.I f88536c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UndeliveredMessagesRepositoryImpl$removeUndeliveredMessagesByChatId$2", f = "UndeliveredMessagesRepository.kt", l = {92}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88537d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f88538e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88540g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f88540g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = h0.this.new a(this.f88540g, dVar);
            aVar.f88538e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88537d;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    h0 h0Var = h0.this;
                    String str = this.f88540g;
                    r.Companion companion = Sc.r.INSTANCE;
                    ru.ozon.android.messenger.framework.data.local.database.c cVar = h0Var.f88534a;
                    this.f88537d = 1;
                    if (cVar.a(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                a11 = Sc.r.a(Unit.f71690a);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            Throwable b11 = Sc.r.b(a11);
            if (b11 != null) {
                a11 = Sc.r.a(Sc.s.a(b11));
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UndeliveredMessagesRepositoryImpl$saveUndeliveredMessage$2", f = "UndeliveredMessagesRepository.kt", l = {72}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88541d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f88542e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f88544g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.models.c f88545h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f88546i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.data.remote.models.c cVar, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f88544g = qVar;
            this.f88545h = cVar;
            this.f88546i = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = h0.this.new b(this.f88544g, this.f88545h, this.f88546i, dVar);
            bVar.f88542e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88541d;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    h0 h0Var = h0.this;
                    ru.ozon.android.messenger.framework.presentation.models.q qVar = this.f88544g;
                    ru.ozon.android.messenger.framework.data.remote.models.c cVar = this.f88545h;
                    String str = this.f88546i;
                    r.Companion companion = Sc.r.INSTANCE;
                    ru.ozon.android.messenger.framework.data.local.database.c cVar2 = h0Var.f88534a;
                    h0Var.f88535b.getClass();
                    UndeliveredMessageEntity b11 = ru.ozon.android.messenger.framework.data.local.mapper.c.b(qVar, cVar, str);
                    this.f88541d = 1;
                    if (cVar2.f(b11, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                a11 = Sc.r.a(Unit.f71690a);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            Throwable b12 = Sc.r.b(a11);
            if (b12 != null) {
                a11 = Sc.r.a(Sc.s.a(b12));
            }
            return Unit.f71690a;
        }
    }

    public h0(@NotNull ru.ozon.android.messenger.framework.data.local.database.c dataSource, @NotNull ru.ozon.android.messenger.framework.data.local.mapper.c mapper, @NotNull xe.I ioDispatcher) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f88534a = dataSource;
        this.f88535b = mapper;
        this.f88536c = ioDispatcher;
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.c0
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f88536c, new a(str, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.c0
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f88536c, new d0(this, null), cVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.c0
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object f7 = C10727i.f(this.f88536c, new g0(this, str, null), cVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.c0
    public final Object e(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f88536c, new e0(this, str, null), cVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.c0
    public final Object f(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return C10727i.f(this.f88536c, new f0(this, str, null), jVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.c0
    public final Object g(@NotNull String str, @NotNull kotlin.coroutines.d dVar, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, @NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        Object f7 = C10727i.f(this.f88536c, new b(qVar, cVar, str, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
