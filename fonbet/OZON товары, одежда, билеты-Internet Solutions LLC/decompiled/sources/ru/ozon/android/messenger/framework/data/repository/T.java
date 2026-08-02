package ru.ozon.android.messenger.framework.data.repository;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.utils.i;
import xe.C10727i;
import xe.l1;

/* loaded from: classes10.dex */
public final class T implements S {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.database.draft.s f88394a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.mapper.a f88395b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.I f88396c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$1", f = "DraftsRepository.kt", l = {50}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88397d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return T.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88397d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f88397d = 1;
                if (T.this.j(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$loadDraftForChat$2", f = "DraftsRepository.kt", l = {56, 57}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.blocks.input.b>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        T f88399d;

        /* renamed from: e, reason: collision with root package name */
        String f88400e;

        /* renamed from: f, reason: collision with root package name */
        int f88401f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f88403h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f88403h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return T.this.new b(this.f88403h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.blocks.input.b>> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[Catch: all -> 0x0017, CancellationException -> 0x001b, TryCatch #2 {CancellationException -> 0x001b, all -> 0x0017, blocks: (B:7:0x0010, B:9:0x005d, B:11:0x0061, B:12:0x007f, B:20:0x006d, B:24:0x002b, B:26:0x0046, B:31:0x0037), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0017, CancellationException -> 0x001b, TryCatch #2 {CancellationException -> 0x001b, all -> 0x0017, blocks: (B:7:0x0010, B:9:0x005d, B:11:0x0061, B:12:0x007f, B:20:0x006d, B:24:0x002b, B:26:0x0046, B:31:0x0037), top: B:2:0x0006 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a11;
            T t2;
            String chatId;
            T t11;
            ru.ozon.android.messenger.framework.data.local.database.draft.model.a aVar;
            ru.ozon.android.messenger.blocks.input.b bVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88401f;
            try {
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            if (i11 == 0) {
                Sc.s.b(obj);
                t2 = T.this;
                chatId = this.f88403h;
                r.Companion companion2 = Sc.r.INSTANCE;
                this.f88399d = t2;
                this.f88400e = chatId;
                this.f88401f = 1;
                if (l1.a(this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = this.f88400e;
                    T t12 = this.f88399d;
                    Sc.s.b(obj);
                    chatId = str;
                    t11 = t12;
                    aVar = (ru.ozon.android.messenger.framework.data.local.database.draft.model.a) obj;
                    if (aVar == null) {
                        t11.f88395b.getClass();
                        bVar = ru.ozon.android.messenger.framework.data.local.mapper.a.b(aVar);
                    } else {
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        bVar = new ru.ozon.android.messenger.blocks.input.b(chatId, 0L, "", null, kotlin.collections.K.f71697a);
                    }
                    a11 = new i.b(bVar);
                    r.Companion companion3 = Sc.r.INSTANCE;
                    Throwable b11 = Sc.r.b(a11);
                    return b11 != null ? a11 : new i.a.d("DraftsRepository, loadDraftForChat failed", b11);
                }
                chatId = this.f88400e;
                T t13 = this.f88399d;
                Sc.s.b(obj);
                t2 = t13;
            }
            InterfaceC2395h<ru.ozon.android.messenger.framework.data.local.database.draft.model.a> e12 = t2.f88394a.e(chatId);
            this.f88399d = t2;
            this.f88400e = chatId;
            this.f88401f = 2;
            Object w11 = C2399j.w(e12, this);
            if (w11 != aVar2) {
                t11 = t2;
                obj = w11;
                aVar = (ru.ozon.android.messenger.framework.data.local.database.draft.model.a) obj;
                if (aVar == null) {
                }
                a11 = new i.b(bVar);
                r.Companion companion32 = Sc.r.INSTANCE;
                Throwable b112 = Sc.r.b(a11);
                if (b112 != null) {
                }
            }
            return aVar2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$removeAttachment$2", f = "DraftsRepository.kt", l = {102}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88404d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f88405e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f88407g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = T.this.new c(this.f88407g, dVar);
            cVar.f88405e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88404d;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    T t2 = T.this;
                    String str = this.f88407g;
                    r.Companion companion = Sc.r.INSTANCE;
                    ru.ozon.android.messenger.framework.data.local.database.draft.s sVar = t2.f88394a;
                    this.f88404d = 1;
                    if (sVar.g(str, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$saveAttachmentsDataForChat$2", f = "DraftsRepository.kt", l = {92}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88408d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f88409e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88411g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> f88412h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f88413i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list, long j11, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f88411g = str;
            this.f88412h = list;
            this.f88413i = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = T.this.new d(this.f88411g, this.f88412h, this.f88413i, dVar);
            dVar2.f88409e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            String str;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88408d;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    T t2 = T.this;
                    List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list = this.f88412h;
                    long j11 = this.f88413i;
                    r.Companion companion = Sc.r.INSTANCE;
                    ru.ozon.android.messenger.framework.data.local.database.draft.s sVar = t2.f88394a;
                    List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list2 = list;
                    ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        str = this.f88411g;
                        if (!hasNext) {
                            break;
                        }
                        ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next();
                        t2.f88395b.getClass();
                        arrayList.add(ru.ozon.android.messenger.framework.data.local.mapper.a.a(str, bVar));
                    }
                    this.f88408d = 1;
                    if (sVar.b(str, arrayList, j11, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$saveCustomBlockDataForChat$2", f = "DraftsRepository.kt", l = {112}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88414d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f88415e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88417g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CustomBlockDTO f88418h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f88419i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, CustomBlockDTO customBlockDTO, long j11, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f88417g = str;
            this.f88418h = customBlockDTO;
            this.f88419i = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = T.this.new e(this.f88417g, this.f88418h, this.f88419i, dVar);
            eVar.f88415e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88414d;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    T t2 = T.this;
                    String chatId = this.f88417g;
                    CustomBlockDTO customBlock = this.f88418h;
                    long j11 = this.f88419i;
                    r.Companion companion = Sc.r.INSTANCE;
                    ru.ozon.android.messenger.framework.data.local.database.draft.s sVar = t2.f88394a;
                    t2.f88395b.getClass();
                    Intrinsics.checkNotNullParameter(chatId, "chatId");
                    Intrinsics.checkNotNullParameter(customBlock, "customBlock");
                    ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar = new ru.ozon.android.messenger.framework.data.local.database.draft.entity.b(0, chatId, customBlock);
                    this.f88414d = 1;
                    if (sVar.c(chatId, bVar, j11, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$saveTextDataForDraft$2", f = "DraftsRepository.kt", l = {82}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88420d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f88421e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88423g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f88424h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f88425i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, long j11, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f88423g = str;
            this.f88424h = str2;
            this.f88425i = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = T.this.new f(this.f88423g, this.f88424h, this.f88425i, dVar);
            fVar.f88421e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88420d;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    T t2 = T.this;
                    String str = this.f88423g;
                    String str2 = this.f88424h;
                    long j11 = this.f88425i;
                    r.Companion companion = Sc.r.INSTANCE;
                    ru.ozon.android.messenger.framework.data.local.database.draft.s sVar = t2.f88394a;
                    this.f88420d = 1;
                    if (sVar.a(str, str2, j11, this) == aVar) {
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

    public T(@NotNull ru.ozon.android.messenger.framework.data.local.database.draft.s dataSource, @NotNull ru.ozon.android.messenger.framework.data.local.mapper.a mapper, @NotNull xe.I ioDispatcher) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f88394a = dataSource;
        this.f88395b = mapper;
        this.f88396c = ioDispatcher;
        C10727i.c(xe.N.a(ioDispatcher), null, null, new a(null), 3);
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.S
    public final Object a(@NotNull String str, @NotNull String str2, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f88396c, new f(str, str2, j11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.S
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.blocks.input.b>> dVar) {
        return C10727i.f(this.f88396c, new b(str, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.S
    public final Object c(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object f7 = C10727i.f(this.f88396c, new V(this, str, null), cVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.S
    public final Object d(@NotNull String str, @NotNull CustomBlockDTO customBlockDTO, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f88396c, new e(str, customBlockDTO, j11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.S
    public final Object e(@NotNull String str, @NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f88396c, new d(str, list, j11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.S
    public final Object f(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f88396c, new U(this, null), cVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.repository.S
    public final Object g(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f88396c, new c(str, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(11:11|12|13|(4:16|(3:18|19|(2:21|22)(1:24))(1:26)|25|14)|27|28|29|30|(1:32)|33|34)(2:36|37))(2:38|39))(3:44|45|(2:47|22)(1:48))|40|(10:42|13|(1:14)|27|28|29|30|(0)|33|34)(6:43|29|30|(0)|33|34)))|53|6|7|(0)(0)|40|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0031, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        r0 = Sc.r.INSTANCE;
        r7 = Sc.s.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: all -> 0x002e, CancellationException -> 0x0031, TryCatch #2 {CancellationException -> 0x0031, all -> 0x002e, blocks: (B:12:0x002a, B:14:0x0067, B:16:0x006d, B:19:0x007f, B:28:0x0092, B:29:0x0096, B:39:0x003e, B:40:0x0053, B:42:0x005d, B:45:0x0045), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d A[Catch: all -> 0x002e, CancellationException -> 0x0031, TryCatch #2 {CancellationException -> 0x0031, all -> 0x002e, blocks: (B:12:0x002a, B:14:0x0067, B:16:0x006d, B:19:0x007f, B:28:0x0092, B:29:0x0096, B:39:0x003e, B:40:0x0053, B:42:0x005d, B:45:0x0045), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        W w11;
        int i11;
        Throwable b11;
        T t2;
        Map map;
        Unit unit;
        T t11;
        Iterator it;
        if (cVar instanceof W) {
            w11 = (W) cVar;
            int i12 = w11.f88437h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                w11.f88437h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = w11.f88435f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = w11.f88437h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    r.Companion companion = Sc.r.INSTANCE;
                    w11.f88433d = this;
                    w11.f88437h = 1;
                    obj = f(w11);
                    if (obj == aVar) {
                        return aVar;
                    }
                    t2 = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = w11.f88434e;
                        t11 = w11.f88433d;
                        Sc.s.b(obj);
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((ru.ozon.android.messenger.blocks.input.b) entry.getValue()).e()) {
                                String str = (String) entry.getKey();
                                w11.f88433d = t11;
                                w11.f88434e = it;
                                w11.f88437h = 2;
                                if (t11.c(str, w11) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        unit = Unit.f71690a;
                        Object a11 = Sc.r.a(unit);
                        b11 = Sc.r.b(a11);
                        if (b11 != null) {
                            a11 = Sc.r.a(Sc.s.a(b11));
                        }
                        return Unit.f71690a;
                    }
                    t2 = w11.f88433d;
                    Sc.s.b(obj);
                }
                map = (Map) ((ru.ozon.android.messenger.utils.i) obj).a();
                if (map != null) {
                    unit = null;
                    Object a112 = Sc.r.a(unit);
                    b11 = Sc.r.b(a112);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                t11 = t2;
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                }
                unit = Unit.f71690a;
                Object a1122 = Sc.r.a(unit);
                b11 = Sc.r.b(a1122);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        w11 = new W(this, cVar);
        Object obj2 = w11.f88435f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = w11.f88437h;
        if (i11 != 0) {
        }
        map = (Map) ((ru.ozon.android.messenger.utils.i) obj2).a();
        if (map != null) {
        }
    }
}
