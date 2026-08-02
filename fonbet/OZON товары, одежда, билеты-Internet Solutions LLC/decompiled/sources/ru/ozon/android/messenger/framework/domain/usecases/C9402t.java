package ru.ozon.android.messenger.framework.domain.usecases;

import C.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.domain.model.c;
import ru.ozon.android.messenger.utils.i;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9402t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f89126a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a f89127b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o f89128c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final K f89129d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9385b f89130e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.a f89131f;

    /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.t$a */
    public static abstract class a {

        /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.t$a$a, reason: collision with other inner class name */
        public static final class C1638a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final ru.ozon.android.messenger.framework.presentation.models.q f89132a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final ru.ozon.android.messenger.framework.presentation.models.x f89133b;

            /* renamed from: c, reason: collision with root package name */
            private final String f89134c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1638a(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item, @NotNull ru.ozon.android.messenger.framework.presentation.models.x place, String str) {
                super(0);
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(place, "place");
                this.f89132a = item;
                this.f89133b = place;
                this.f89134c = str;
            }

            public final String a() {
                return this.f89134c;
            }

            @NotNull
            public final ru.ozon.android.messenger.framework.presentation.models.q b() {
                return this.f89132a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1638a)) {
                    return false;
                }
                C1638a c1638a = (C1638a) obj;
                return Intrinsics.d(this.f89132a, c1638a.f89132a) && this.f89133b == c1638a.f89133b && Intrinsics.d(this.f89134c, c1638a.f89134c);
            }

            public final int hashCode() {
                int hashCode = (this.f89133b.hashCode() + (this.f89132a.hashCode() * 31)) * 31;
                String str = this.f89134c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AddItem(item=");
                sb2.append(this.f89132a);
                sb2.append(", place=");
                sb2.append(this.f89133b);
                sb2.append(", id=");
                return o0.c(sb2, this.f89134c, ")");
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.t$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final ru.ozon.android.messenger.framework.presentation.models.q f89135a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
                super(0);
                Intrinsics.checkNotNullParameter(item, "item");
                this.f89135a = item;
            }

            public final Object a(@NotNull C9402t c9402t, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<Unit>> dVar) {
                return c9402t.h(this.f89135a, dVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.f89135a, ((b) obj).f89135a);
            }

            public final int hashCode() {
                return this.f89135a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "UpdateBlock(item=" + this.f89135a + ")";
            }
        }

        public a(int i11) {
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.HandleChatEventsUseCase", f = "HandleChatEventsUseCase.kt", l = {53, 54}, m = "handleItemUpdate")
    /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.t$b */
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89136d;

        /* renamed from: f, reason: collision with root package name */
        int f89138f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f89136d = obj;
            this.f89138f |= LinearLayoutManager.INVALID_OFFSET;
            return C9402t.this.h(null, this);
        }
    }

    public C9402t(@NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a loadingDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o unreadMessagesDelegate, @NotNull K resolveMessageInfoUseCase, @NotNull C9385b appendDateWidgetsUseCase, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(loadingDelegate, "loadingDelegate");
        Intrinsics.checkNotNullParameter(unreadMessagesDelegate, "unreadMessagesDelegate");
        Intrinsics.checkNotNullParameter(resolveMessageInfoUseCase, "resolveMessageInfoUseCase");
        Intrinsics.checkNotNullParameter(appendDateWidgetsUseCase, "appendDateWidgetsUseCase");
        Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
        this.f89126a = messagesRepository;
        this.f89127b = loadingDelegate;
        this.f89128c = unreadMessagesDelegate;
        this.f89129d = resolveMessageInfoUseCase;
        this.f89130e = appendDateWidgetsUseCase;
        this.f89131f = chatArgs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r7.h(r8, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r2.c(r7, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(C9402t c9402t, a.C1638a c1638a, kotlin.coroutines.d dVar) {
        C9403u c9403u;
        int i11;
        c9402t.getClass();
        if (dVar instanceof C9403u) {
            c9403u = (C9403u) dVar;
            int i12 = c9403u.f89141f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9403u.f89141f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9403u.f89139d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9403u.f89141f;
                if (i11 == 0) {
                    if (i11 == 1) {
                        Sc.s.b(obj);
                        return new i.b(null);
                    }
                    if (i11 == 2) {
                        Sc.s.b(obj);
                        return (ru.ozon.android.messenger.utils.i) obj;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return new i.b(null);
                }
                Sc.s.b(obj);
                String a11 = c1638a.a();
                ru.ozon.android.messenger.framework.domain.repository.d dVar2 = c9402t.f89126a;
                if (a11 == null || !dVar2.p(a11)) {
                    ru.ozon.android.messenger.framework.core.viewmapper.e d11 = c1638a.b().d();
                    if (Intrinsics.d(d11, e.a.f87374a)) {
                        ru.ozon.android.messenger.framework.presentation.models.q b11 = c1638a.b();
                        c9403u.f89141f = 2;
                        obj = c9402t.i(b11, c9403u);
                    } else {
                        if (!Intrinsics.d(d11, e.b.f87375a)) {
                            throw new Sc.o();
                        }
                        ru.ozon.android.messenger.framework.presentation.models.q[] qVarArr = {c1638a.b()};
                        c9403u.f89141f = 3;
                    }
                } else {
                    ru.ozon.android.messenger.framework.presentation.models.q b12 = c1638a.b();
                    c9403u.f89141f = 1;
                }
                return obj2;
            }
        }
        c9403u = new C9403u(c9402t, dVar);
        Object obj3 = c9403u.f89139d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9403u.f89141f;
        if (i11 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r5.l(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ru.ozon.android.messenger.framework.presentation.models.q qVar, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<Unit>> dVar) {
        b bVar;
        int i11;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.f89138f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f89138f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f89136d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f89138f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.core.viewmapper.e d11 = qVar.d();
                    boolean d12 = Intrinsics.d(d11, e.a.f87374a);
                    ru.ozon.android.messenger.framework.domain.repository.d dVar2 = this.f89126a;
                    if (d12) {
                        bVar.f89138f = 1;
                        Object i13 = dVar2.i(new C9405w(qVar, this), bVar);
                        if (i13 != aVar) {
                            i13 = Unit.f71690a;
                        }
                    } else {
                        if (!Intrinsics.d(d11, e.b.f87375a)) {
                            throw new Sc.o();
                        }
                        bVar.f89138f = 2;
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return new i.b(null);
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f89136d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f89138f;
        if (i11 != 0) {
        }
        return new i.b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ru.ozon.android.messenger.framework.presentation.models.q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        C9404v c9404v;
        int i11;
        if (cVar instanceof C9404v) {
            c9404v = (C9404v) cVar;
            int i12 = c9404v.f89144f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9404v.f89144f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9404v.f89142d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9404v.f89144f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.domain.repository.d dVar = this.f89126a;
                    if (dVar.n(qVar)) {
                        return new i.b(null);
                    }
                    this.f89128c.j(qVar);
                    if (!this.f89127b.O()) {
                        return new i.b(null);
                    }
                    c.d dVar2 = new c.d(qVar.c());
                    List a02 = C7714v.a0(qVar);
                    c9404v.f89144f = 1;
                    if (dVar.a(dVar2, a02, c9404v) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return new i.b(null);
            }
        }
        c9404v = new C9404v(this, cVar);
        Object obj2 = c9404v.f89142d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9404v.f89144f;
        if (i11 != 0) {
        }
        return new i.b(null);
    }
}
