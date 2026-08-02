package ru.ozon.android.messenger.framework.domain.usecases;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatGroups.grouplist.j;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.responses.g;
import ru.ozon.android.messenger.utils.i;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9394k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89091a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W<ru.ozon.android.messenger.framework.presentation.models.responses.g> f89092b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B f89093c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.GetChatsUseCase$invoke$2", f = "GetChatsUseCase.kt", l = {19}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.k$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.g>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89094d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ GetChatsRequest f89096f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f89097g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(GetChatsRequest getChatsRequest, String str, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f89096f = getChatsRequest;
            this.f89097g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C9394k.this.new a(this.f89096f, this.f89097g, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.g>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89094d;
            C9394k c9394k = C9394k.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                ru.ozon.android.messenger.framework.domain.repository.b bVar = c9394k.f89091a;
                this.f89094d = 1;
                obj = bVar.j(this.f89096f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
            if (!(iVar instanceof i.b)) {
                if (iVar instanceof i.a) {
                    return iVar;
                }
                throw new Sc.o();
            }
            ru.ozon.android.messenger.framework.presentation.models.responses.g gVar = (ru.ozon.android.messenger.framework.presentation.models.responses.g) ((i.b) iVar).b();
            g.a d11 = gVar.d();
            if ((d11 != null ? d11.b() : null) != null && (str = this.f89097g) != null) {
                gVar = C9394k.b(c9394k, gVar, str);
            }
            return new i.b(gVar);
        }
    }

    public C9394k(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, @NotNull W<ru.ozon.android.messenger.framework.presentation.models.responses.g> sendRequestWhenChatInitializedUseCase, @NotNull B mapBlockUpdateUseCase) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(sendRequestWhenChatInitializedUseCase, "sendRequestWhenChatInitializedUseCase");
        Intrinsics.checkNotNullParameter(mapBlockUpdateUseCase, "mapBlockUpdateUseCase");
        this.f89091a = chatRepository;
        this.f89092b = sendRequestWhenChatInitializedUseCase;
        this.f89093c = mapBlockUpdateUseCase;
    }

    public static final ru.ozon.android.messenger.framework.presentation.models.responses.g b(C9394k c9394k, ru.ozon.android.messenger.framework.presentation.models.responses.g gVar, String str) {
        ru.ozon.android.messenger.framework.presentation.models.q b11;
        c9394k.getClass();
        g.a d11 = gVar.d();
        return (d11 == null || (b11 = d11.b()) == null) ? gVar : ru.ozon.android.messenger.framework.presentation.models.responses.g.a(gVar, null, g.a.a(gVar.d(), c9394k.f89093c.a(new d.w(new j.b(str)), b11)), 31);
    }

    public final Object c(@NotNull GetChatsRequest getChatsRequest, String str, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.g>> dVar) {
        return this.f89092b.a(new a(getChatsRequest, str, null), (kotlin.coroutines.jvm.internal.c) dVar);
    }
}
