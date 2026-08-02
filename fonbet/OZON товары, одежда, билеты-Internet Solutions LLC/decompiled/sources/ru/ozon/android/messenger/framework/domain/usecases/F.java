package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.model.f;

/* loaded from: classes10.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f88961a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f88962b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.service.x f88963c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final K f88964d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o f88965e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C9385b f88966f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.service.c f88967g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.RemoveItemUseCase", f = "RemoveItemUseCase.kt", l = {48}, m = "removeItem")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        F f88968d;

        /* renamed from: e, reason: collision with root package name */
        String f88969e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88970f;

        /* renamed from: h, reason: collision with root package name */
        int f88972h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f88970f = obj;
            this.f88972h |= LinearLayoutManager.INVALID_OFFSET;
            return F.d(F.this, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.RemoveItemUseCase", f = "RemoveItemUseCase.kt", l = {42, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "removeUndeliveredMessage")
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        F f88973d;

        /* renamed from: e, reason: collision with root package name */
        String f88974e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88975f;

        /* renamed from: h, reason: collision with root package name */
        int f88977h;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f88975f = obj;
            this.f88977h |= LinearLayoutManager.INVALID_OFFSET;
            return F.e(F.this, this);
        }
    }

    public F(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull ru.ozon.android.messenger.framework.domain.service.x failedMessagesStateProvider, @NotNull K resolveMessageInfoUseCase, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o unreadMessagesDelegate, @NotNull C9385b appendDateWidgetsUseCase, @NotNull ru.ozon.android.messenger.framework.domain.service.c chatSendMessageDelegate) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(failedMessagesStateProvider, "failedMessagesStateProvider");
        Intrinsics.checkNotNullParameter(resolveMessageInfoUseCase, "resolveMessageInfoUseCase");
        Intrinsics.checkNotNullParameter(unreadMessagesDelegate, "unreadMessagesDelegate");
        Intrinsics.checkNotNullParameter(appendDateWidgetsUseCase, "appendDateWidgetsUseCase");
        Intrinsics.checkNotNullParameter(chatSendMessageDelegate, "chatSendMessageDelegate");
        this.f88961a = repository;
        this.f88962b = messagesRepository;
        this.f88963c = failedMessagesStateProvider;
        this.f88964d = resolveMessageInfoUseCase;
        this.f88965e = unreadMessagesDelegate;
        this.f88966f = appendDateWidgetsUseCase;
        this.f88967g = chatSendMessageDelegate;
    }

    public static final /* synthetic */ Object d(F f7, kotlin.coroutines.d dVar) {
        return f7.h(null, dVar);
    }

    public static final /* synthetic */ Object e(F f7, kotlin.coroutines.d dVar) {
        return f7.i(null, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(String str, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        F f7;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f88972h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f88972h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f88970f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f88972h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    aVar.f88968d = this;
                    aVar.f88969e = str;
                    aVar.f88972h = 1;
                    if (j(str, aVar) == aVar2) {
                        return aVar2;
                    }
                    f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = aVar.f88969e;
                    f7 = aVar.f88968d;
                    Sc.s.b(obj);
                }
                f7.f88962b.f(str);
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f88970f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f88972h;
        if (i11 != 0) {
        }
        f7.f88962b.f(str);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r2.f88961a.d(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(String str, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        int i11;
        F f7;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.f88977h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f88977h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f88975f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f88977h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    bVar.f88973d = this;
                    bVar.f88974e = str;
                    bVar.f88977h = 1;
                    if (this.f88962b.h(str, bVar) != aVar) {
                        f7 = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                str = bVar.f88974e;
                f7 = bVar.f88973d;
                Sc.s.b(obj);
                f7.f88963c.f(str);
                bVar.f88973d = null;
                bVar.f88974e = null;
                bVar.f88977h = 2;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f88975f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f88977h;
        if (i11 != 0) {
        }
        f7.f88963c.f(str);
        bVar.f88973d = null;
        bVar.f88974e = null;
        bVar.f88977h = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, kotlin.coroutines.jvm.internal.c cVar) {
        G g10;
        int i11;
        kotlin.jvm.internal.I i12;
        if (cVar instanceof G) {
            g10 = (G) cVar;
            int i13 = g10.f88981g;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                g10.f88981g = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = g10.f88979e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = g10.f88981g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.I i14 = new kotlin.jvm.internal.I();
                    H h11 = new H(this, i14, str);
                    g10.f88978d = i14;
                    g10.f88981g = 1;
                    if (this.f88962b.i(h11, g10) == aVar) {
                        return aVar;
                    }
                    i12 = i14;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = g10.f88978d;
                    Sc.s.b(obj);
                }
                return Boolean.valueOf(i12.f71783a);
            }
        }
        g10 = new G(this, cVar);
        Object obj2 = g10.f88979e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = g10.f88981g;
        if (i11 != 0) {
        }
        return Boolean.valueOf(i12.f71783a);
    }

    public final Object g(@NotNull ru.ozon.android.messenger.framework.domain.model.f fVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (fVar instanceof f.c) {
            Object i11 = i(((f.c) fVar).a(), dVar);
            return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
        }
        if (fVar instanceof f.b) {
            Object h11 = h(((f.b) fVar).a(), dVar);
            return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : Unit.f71690a;
        }
        if (!(fVar instanceof f.a)) {
            throw new Sc.o();
        }
        Object d11 = this.f88967g.d(((f.a) fVar).a(), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
