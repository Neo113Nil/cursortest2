package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.model.h;
import ru.ozon.android.messenger.framework.domain.usecases.E;
import ru.ozon.android.messenger.framework.domain.usecases.P;
import ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.android.messenger.utils.i;
import xe.C10727i;
import xe.M;
import xe.U;

/* loaded from: classes10.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f88872a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0 f88873b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f88874c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M f88875d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f88876e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a f88877f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC9383a f88878g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c f88879h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {93, 95}, m = "removeMessagesByChatId")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        g f88880d;

        /* renamed from: e, reason: collision with root package name */
        String f88881e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88882f;

        /* renamed from: h, reason: collision with root package name */
        int f88884h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f88882f = obj;
            this.f88884h |= LinearLayoutManager.INVALID_OFFSET;
            return g.this.d(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl$resendMessageAfterConfirmation$1", f = "ChatSendMessageDelegate.kt", l = {104, 111}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88885d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ v0 f88887f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v0 v0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f88887f = v0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new b(this.f88887f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            if (r13 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88885d;
            v0 v0Var = this.f88887f;
            g gVar = g.this;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    g gVar2 = g.this;
                    String d11 = v0Var.e().d();
                    z.c cVar = z.c.f91565a;
                    this.f88885d = 1;
                    bVar = this;
                    if (g.u(gVar2, d11, cVar, null, bVar, 4) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        gVar.f88873b.p(false);
                        return Unit.f71690a;
                    }
                    Sc.s.b(obj);
                    bVar = this;
                }
                ru.ozon.android.messenger.framework.presentation.models.q c11 = v0Var.c();
                g gVar3 = g.this;
                ru.ozon.android.messenger.framework.data.remote.models.c e11 = v0Var.e();
                String d12 = v0Var.d();
                bVar.f88885d = 2;
                obj = gVar3.q(e11, c11, true, d12, bVar);
            } catch (Throwable th2) {
                gVar.f88873b.p(false);
                throw th2;
            }
        }
    }

    public g(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull x0 issueMessagesHandler, @NotNull E oldSendMessageUseCase, @NotNull M sendMessageScope, @NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a chatLoadingDelegate, @NotNull InterfaceC9383a logger, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c inputModeStore) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(issueMessagesHandler, "issueMessagesHandler");
        Intrinsics.checkNotNullParameter(oldSendMessageUseCase, "oldSendMessageUseCase");
        Intrinsics.checkNotNullParameter(sendMessageScope, "sendMessageScope");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(chatLoadingDelegate, "chatLoadingDelegate");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(inputModeStore, "inputModeStore");
        this.f88872a = repository;
        this.f88873b = issueMessagesHandler;
        this.f88874c = oldSendMessageUseCase;
        this.f88875d = sendMessageScope;
        this.f88876e = messagesRepository;
        this.f88877f = chatLoadingDelegate;
        this.f88878g = logger;
        this.f88879h = inputModeStore;
    }

    public static final ru.ozon.android.messenger.framework.presentation.models.g j(g gVar, ru.ozon.android.messenger.framework.presentation.models.u uVar, ru.ozon.android.messenger.framework.presentation.models.u uVar2) {
        ru.ozon.android.messenger.framework.presentation.models.g c11;
        gVar.getClass();
        ru.ozon.android.messenger.framework.presentation.models.g c12 = uVar != null ? uVar.c() : null;
        ru.ozon.android.messenger.blocks.messageimage.c cVar = c12 instanceof ru.ozon.android.messenger.blocks.messageimage.c ? (ru.ozon.android.messenger.blocks.messageimage.c) c12 : null;
        if (cVar != null) {
            ru.ozon.android.messenger.framework.presentation.models.g c13 = uVar2.c();
            Intrinsics.g(c13, "null cannot be cast to non-null type ru.ozon.android.messenger.blocks.messageimage.ImageVO");
            String e11 = ((ru.ozon.android.messenger.blocks.messageimage.c) c13).e();
            String c14 = ((ru.ozon.android.messenger.blocks.messageimage.c) uVar2.c()).c();
            ru.ozon.android.messenger.framework.presentation.models.g c15 = uVar2.c();
            ru.ozon.android.messenger.framework.presentation.models.j jVar = c15 instanceof ru.ozon.android.messenger.framework.presentation.models.j ? (ru.ozon.android.messenger.framework.presentation.models.j) c15 : null;
            return ru.ozon.android.messenger.blocks.messageimage.c.a(cVar, e11, c14, jVar != null ? jVar.getSendTime() : null, 249);
        }
        if (uVar == null || (c11 = uVar.c()) == null) {
            return uVar2.c();
        }
        ru.ozon.android.messenger.framework.presentation.models.i iVar = c11 instanceof ru.ozon.android.messenger.framework.presentation.models.i ? (ru.ozon.android.messenger.framework.presentation.models.i) c11 : null;
        if (iVar != null) {
            ru.ozon.android.messenger.framework.presentation.models.g c16 = uVar2.c();
            ru.ozon.android.messenger.framework.presentation.models.i iVar2 = c16 instanceof ru.ozon.android.messenger.framework.presentation.models.i ? (ru.ozon.android.messenger.framework.presentation.models.i) c16 : null;
            iVar.b(iVar2 != null ? iVar2.a() : null);
        }
        ru.ozon.android.messenger.framework.presentation.models.j jVar2 = c11 instanceof ru.ozon.android.messenger.framework.presentation.models.j ? (ru.ozon.android.messenger.framework.presentation.models.j) c11 : null;
        if (jVar2 != null) {
            ru.ozon.android.messenger.framework.presentation.models.g c17 = uVar2.c();
            ru.ozon.android.messenger.framework.presentation.models.j jVar3 = c17 instanceof ru.ozon.android.messenger.framework.presentation.models.j ? (ru.ozon.android.messenger.framework.presentation.models.j) c17 : null;
            jVar2.setSendTime(jVar3 != null ? jVar3.getSendTime() : null);
        }
        return c11;
    }

    public static final P.a k(g gVar, ru.ozon.android.messenger.framework.data.remote.models.c cVar) {
        return new P.a(Sh.b.c("InputVO is null, chatId=", cVar.b(), ", guid=", cVar.c().getGuid()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        String str2;
        Iterator it;
        g gVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f88870i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f88870i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f88868g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f88870i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    str2 = str;
                    it = this.f88876e.j(f.f88871b).iterator();
                    gVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = eVar.f88867f;
                    String str3 = eVar.f88866e;
                    gVar = eVar.f88865d;
                    Sc.s.b(obj);
                    str2 = str3;
                }
                while (it.hasNext()) {
                    ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) it.next();
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = gVar.f88872a;
                    String d11 = ru.ozon.android.messenger.framework.presentation.models.r.d(qVar);
                    eVar.f88865d = gVar;
                    eVar.f88866e = str2;
                    eVar.f88867f = it;
                    eVar.f88870i = 1;
                    if (bVar.m(str2, d11, eVar) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f88868g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f88870i;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02b8, code lost:
    
        if (r13 == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x024a, code lost:
    
        if (r15 != r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d7, code lost:
    
        if (r15 == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b0, code lost:
    
        if (r11.r("", null, r15, r5) == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
    
        if (r1.t(r5) == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017d, code lost:
    
        if (u(r1, r2, r3, r4, r5, 8) == r0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ru.ozon.android.messenger.framework.data.remote.models.c cVar, ru.ozon.android.messenger.framework.presentation.models.q qVar, boolean z11, String str, kotlin.coroutines.jvm.internal.c cVar2) {
        l lVar;
        l lVar2;
        g gVar;
        String str2;
        boolean z12;
        ru.ozon.android.messenger.framework.presentation.models.q qVar2;
        ru.ozon.android.messenger.framework.data.remote.models.c cVar3;
        ru.ozon.android.messenger.framework.data.remote.models.c cVar4;
        boolean z13;
        g gVar2;
        ru.ozon.android.messenger.framework.data.remote.models.c cVar5;
        ru.ozon.android.messenger.utils.i iVar;
        ru.ozon.android.messenger.utils.i iVar2;
        g gVar3;
        ru.ozon.android.messenger.framework.presentation.models.responses.l lVar3;
        ru.ozon.android.messenger.framework.data.remote.models.c cVar6;
        ru.ozon.android.messenger.framework.data.remote.models.c cVar7;
        g gVar4;
        Object b11;
        Object obj;
        Object b12;
        if (cVar2 instanceof l) {
            lVar = (l) cVar2;
            int i11 = lVar.f88918l;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f88918l = i11 - LinearLayoutManager.INVALID_OFFSET;
                lVar2 = lVar;
                Object obj2 = lVar2.f88916j;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                switch (lVar2.f88918l) {
                    case 0:
                        Sc.s.b(obj2);
                        String d11 = cVar.d();
                        z.c cVar8 = z.c.f91565a;
                        lVar2.f88910d = this;
                        lVar2.f88911e = cVar;
                        lVar2.f88912f = qVar;
                        lVar2.f88913g = str;
                        lVar2.f88914h = cVar;
                        lVar2.f88915i = z11;
                        lVar2.f88918l = 1;
                        if (u(this, d11, cVar8, null, lVar2, 12) != aVar) {
                            gVar = this;
                            str2 = str;
                            z12 = z11;
                            qVar2 = qVar;
                            cVar3 = cVar;
                            E e11 = gVar.f88874c;
                            lVar2.f88910d = gVar;
                            lVar2.f88911e = cVar;
                            lVar2.f88912f = cVar3;
                            lVar2.f88913g = null;
                            lVar2.f88914h = null;
                            lVar2.f88915i = z12;
                            lVar2.f88918l = 2;
                            obj2 = e11.a(cVar, qVar2, str2, lVar2);
                            if (obj2 != aVar) {
                                boolean z14 = z12;
                                cVar4 = cVar;
                                z13 = z14;
                                gVar2 = gVar;
                                cVar5 = cVar3;
                                iVar = (ru.ozon.android.messenger.utils.i) obj2;
                                if (!(iVar instanceof i.b)) {
                                    ru.ozon.android.messenger.framework.presentation.models.responses.l lVar4 = (ru.ozon.android.messenger.framework.presentation.models.responses.l) ((i.b) iVar).b();
                                    if (lVar4.c() != ru.ozon.android.messenger.framework.presentation.models.responses.j.OK) {
                                        String d12 = cVar5.d();
                                        lVar2.f88910d = gVar2;
                                        lVar2.f88911e = cVar4;
                                        lVar2.f88912f = cVar5;
                                        lVar2.f88913g = iVar;
                                        lVar2.f88914h = lVar4;
                                        lVar2.f88918l = 7;
                                        gVar2.getClass();
                                        Object i12 = gVar2.f88876e.i(new d(d12), lVar2);
                                        if (i12 != aVar) {
                                            i12 = Unit.f71690a;
                                        }
                                        if (i12 != aVar) {
                                            lVar3 = lVar4;
                                            lVar2.f88910d = gVar2;
                                            lVar2.f88911e = cVar4;
                                            lVar2.f88912f = cVar5;
                                            lVar2.f88913g = iVar;
                                            lVar2.f88914h = lVar3;
                                            lVar2.f88918l = 8;
                                            gVar2.getClass();
                                            if (!(cVar4.f() instanceof y0.d)) {
                                                obj = gVar2.f88876e.r(((y0.d) cVar4.f()).b(), ((y0.d) cVar4.f()).a(), new i(gVar2, cVar4, null), lVar2);
                                                if (obj != aVar) {
                                                    obj = Unit.f71690a;
                                                    break;
                                                }
                                            } else {
                                                obj = Unit.f71690a;
                                                break;
                                            }
                                        }
                                    } else {
                                        String d13 = cVar5.d();
                                        z.f fVar = z.f.f91568a;
                                        ru.ozon.android.messenger.framework.presentation.models.q a11 = lVar4.a();
                                        lVar2.f88910d = gVar2;
                                        lVar2.f88911e = cVar4;
                                        lVar2.f88912f = cVar5;
                                        lVar2.f88913g = iVar;
                                        lVar2.f88915i = z13;
                                        lVar2.f88918l = 3;
                                        break;
                                    }
                                } else {
                                    iVar2 = iVar;
                                    gVar3 = gVar2;
                                    if (iVar2 instanceof i.a) {
                                        Lm0.a.f17149a.w("Failed to send message of type " + cVar4 + "\n " + ((i.a) iVar2), new Object[0]);
                                        String d14 = cVar5.d();
                                        lVar2.f88910d = gVar3;
                                        lVar2.f88911e = iVar2;
                                        lVar2.f88912f = null;
                                        lVar2.f88913g = null;
                                        lVar2.f88918l = 10;
                                        gVar3.getClass();
                                        Object i13 = gVar3.f88876e.i(new d(d14), lVar2);
                                        if (i13 != aVar) {
                                            i13 = Unit.f71690a;
                                            break;
                                        }
                                    }
                                    return iVar2;
                                }
                            }
                        }
                        return aVar;
                    case 1:
                        boolean z15 = lVar2.f88915i;
                        ru.ozon.android.messenger.framework.data.remote.models.c cVar9 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88914h;
                        String str3 = (String) lVar2.f88913g;
                        ru.ozon.android.messenger.framework.presentation.models.q qVar3 = (ru.ozon.android.messenger.framework.presentation.models.q) lVar2.f88912f;
                        ru.ozon.android.messenger.framework.data.remote.models.c cVar10 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        gVar = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        str2 = str3;
                        z12 = z15;
                        qVar2 = qVar3;
                        cVar3 = cVar9;
                        cVar = cVar10;
                        E e112 = gVar.f88874c;
                        lVar2.f88910d = gVar;
                        lVar2.f88911e = cVar;
                        lVar2.f88912f = cVar3;
                        lVar2.f88913g = null;
                        lVar2.f88914h = null;
                        lVar2.f88915i = z12;
                        lVar2.f88918l = 2;
                        obj2 = e112.a(cVar, qVar2, str2, lVar2);
                        if (obj2 != aVar) {
                        }
                        return aVar;
                    case 2:
                        z13 = lVar2.f88915i;
                        cVar3 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88912f;
                        ru.ozon.android.messenger.framework.data.remote.models.c cVar11 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        g gVar5 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        gVar2 = gVar5;
                        cVar4 = cVar11;
                        cVar5 = cVar3;
                        iVar = (ru.ozon.android.messenger.utils.i) obj2;
                        if (!(iVar instanceof i.b)) {
                        }
                        break;
                    case 3:
                        z13 = lVar2.f88915i;
                        iVar = (ru.ozon.android.messenger.utils.i) lVar2.f88913g;
                        cVar5 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88912f;
                        cVar4 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        gVar2 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        lVar2.f88910d = gVar2;
                        lVar2.f88911e = cVar4;
                        lVar2.f88912f = cVar5;
                        lVar2.f88913g = iVar;
                        lVar2.f88915i = z13;
                        lVar2.f88918l = 4;
                        break;
                    case 4:
                        z13 = lVar2.f88915i;
                        iVar = (ru.ozon.android.messenger.utils.i) lVar2.f88913g;
                        cVar5 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88912f;
                        cVar4 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        gVar2 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        if (z13) {
                            ru.ozon.android.messenger.framework.domain.repository.d dVar = gVar2.f88876e;
                            m mVar = new m(gVar2, cVar4, null);
                            lVar2.f88910d = gVar2;
                            lVar2.f88911e = cVar4;
                            lVar2.f88912f = cVar5;
                            lVar2.f88913g = iVar;
                            lVar2.f88918l = 5;
                            break;
                        }
                        iVar2 = iVar;
                        cVar6 = cVar5;
                        cVar7 = cVar4;
                        gVar4 = gVar2;
                        if (gVar4.f88879h.e().getValue() instanceof b.c) {
                            lVar2.f88910d = gVar4;
                            lVar2.f88911e = cVar7;
                            lVar2.f88912f = cVar6;
                            lVar2.f88913g = iVar2;
                            lVar2.f88918l = 6;
                            b11 = gVar4.f88879h.b((r4 & 1) != 0, false, lVar2);
                            break;
                        }
                        ru.ozon.android.messenger.framework.data.remote.models.c cVar12 = cVar7;
                        cVar5 = cVar6;
                        gVar3 = gVar4;
                        cVar4 = cVar12;
                        if (iVar2 instanceof i.a) {
                        }
                        return iVar2;
                    case 5:
                        iVar2 = (ru.ozon.android.messenger.utils.i) lVar2.f88913g;
                        cVar6 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88912f;
                        cVar7 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        gVar4 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        if (gVar4.f88879h.e().getValue() instanceof b.c) {
                        }
                        ru.ozon.android.messenger.framework.data.remote.models.c cVar122 = cVar7;
                        cVar5 = cVar6;
                        gVar3 = gVar4;
                        cVar4 = cVar122;
                        if (iVar2 instanceof i.a) {
                        }
                        return iVar2;
                    case 6:
                    case 9:
                        iVar2 = (ru.ozon.android.messenger.utils.i) lVar2.f88913g;
                        cVar6 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88912f;
                        cVar7 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        gVar4 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        ru.ozon.android.messenger.framework.data.remote.models.c cVar1222 = cVar7;
                        cVar5 = cVar6;
                        gVar3 = gVar4;
                        cVar4 = cVar1222;
                        if (iVar2 instanceof i.a) {
                        }
                        return iVar2;
                    case 7:
                        lVar3 = (ru.ozon.android.messenger.framework.presentation.models.responses.l) lVar2.f88914h;
                        iVar = (ru.ozon.android.messenger.utils.i) lVar2.f88913g;
                        cVar5 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88912f;
                        cVar4 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        gVar2 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        lVar2.f88910d = gVar2;
                        lVar2.f88911e = cVar4;
                        lVar2.f88912f = cVar5;
                        lVar2.f88913g = iVar;
                        lVar2.f88914h = lVar3;
                        lVar2.f88918l = 8;
                        gVar2.getClass();
                        if (!(cVar4.f() instanceof y0.d)) {
                        }
                        break;
                    case 8:
                        lVar3 = (ru.ozon.android.messenger.framework.presentation.models.responses.l) lVar2.f88914h;
                        iVar = (ru.ozon.android.messenger.utils.i) lVar2.f88913g;
                        cVar5 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88912f;
                        cVar4 = (ru.ozon.android.messenger.framework.data.remote.models.c) lVar2.f88911e;
                        gVar2 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        ru.ozon.android.messenger.framework.presentation.models.q a12 = lVar3.a();
                        lVar2.f88910d = gVar2;
                        lVar2.f88911e = cVar4;
                        lVar2.f88912f = cVar5;
                        lVar2.f88913g = iVar;
                        lVar2.f88914h = null;
                        lVar2.f88918l = 9;
                        if (gVar2.s(a12, lVar2) != aVar) {
                            iVar2 = iVar;
                            cVar6 = cVar5;
                            cVar7 = cVar4;
                            gVar4 = gVar2;
                            ru.ozon.android.messenger.framework.data.remote.models.c cVar12222 = cVar7;
                            cVar5 = cVar6;
                            gVar3 = gVar4;
                            cVar4 = cVar12222;
                            if (iVar2 instanceof i.a) {
                            }
                            return iVar2;
                        }
                        return aVar;
                    case 10:
                        iVar2 = (ru.ozon.android.messenger.utils.i) lVar2.f88911e;
                        gVar3 = (g) lVar2.f88910d;
                        Sc.s.b(obj2);
                        if (gVar3.f88879h.e().getValue() instanceof b.c) {
                            lVar2.f88910d = iVar2;
                            lVar2.f88911e = null;
                            lVar2.f88918l = 11;
                            b12 = gVar3.f88879h.b((r4 & 1) != 0, false, lVar2);
                            if (b12 == aVar) {
                                return aVar;
                            }
                        }
                        return iVar2;
                    case 11:
                        ru.ozon.android.messenger.utils.i iVar3 = (ru.ozon.android.messenger.utils.i) lVar2.f88910d;
                        Sc.s.b(obj2);
                        return iVar3;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        lVar = new l(this, cVar2);
        lVar2 = lVar;
        Object obj22 = lVar2.f88916j;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        switch (lVar2.f88918l) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ru.ozon.android.messenger.framework.presentation.models.q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        g gVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i12 = nVar.f88925h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f88925h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f88923f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f88925h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if ((qVar != null ? ru.ozon.android.messenger.framework.presentation.models.r.b(qVar) : null) instanceof ru.ozon.android.messenger.blocks.alert.g) {
                        nVar.f88921d = this;
                        nVar.f88922e = qVar;
                        nVar.f88925h = 1;
                        if (this.f88876e.c(new ru.ozon.android.messenger.framework.presentation.models.q[]{qVar}, nVar) == aVar) {
                            return aVar;
                        }
                        gVar = this;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = nVar.f88922e;
                gVar = nVar.f88921d;
                Sc.s.b(obj);
                x0 x0Var = gVar.f88873b;
                x0Var.n(qVar);
                x0Var.c();
                return Unit.f71690a;
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f88923f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f88925h;
        if (i11 != 0) {
        }
        x0 x0Var2 = gVar.f88873b;
        x0Var2.n(qVar);
        x0Var2.c();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        int i11;
        x0 x0Var;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i12 = oVar.f88929g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oVar.f88929g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = oVar.f88927e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = oVar.f88929g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    x0 x0Var2 = this.f88873b;
                    x0Var2.k();
                    p pVar = new p(this);
                    oVar.f88926d = x0Var2;
                    oVar.f88929g = 1;
                    if (this.f88876e.i(pVar, oVar) == aVar) {
                        return aVar;
                    }
                    x0Var = x0Var2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x0Var = oVar.f88926d;
                    Sc.s.b(obj);
                }
                x0Var.b();
                return Unit.f71690a;
            }
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.f88927e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oVar.f88929g;
        if (i11 != 0) {
        }
        x0Var.b();
        return Unit.f71690a;
    }

    static Object u(g gVar, String str, ru.ozon.android.messenger.framework.presentation.models.z zVar, ru.ozon.android.messenger.framework.presentation.models.q qVar, kotlin.coroutines.jvm.internal.c cVar, int i11) {
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar2 = qVar;
        boolean z11 = (i11 & 8) == 0;
        gVar.getClass();
        if (str != null) {
            Object i12 = gVar.f88876e.i(new w(str, qVar2, z11, zVar, gVar), cVar);
            if (i12 == Wc.a.COROUTINE_SUSPENDED) {
                return i12;
            }
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // ru.ozon.android.messenger.framework.domain.service.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, boolean z11, boolean z12, boolean z13, @NotNull kotlin.coroutines.jvm.internal.c cVar2) {
        j jVar;
        int i11;
        g gVar;
        I i12;
        I i13;
        ru.ozon.android.messenger.utils.i iVar;
        g gVar2;
        I i14;
        ru.ozon.android.messenger.utils.i iVar2;
        boolean z14;
        if (cVar2 instanceof j) {
            jVar = (j) cVar2;
            int i15 = jVar.f88900j;
            if ((i15 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f88900j = i15 - LinearLayoutManager.INVALID_OFFSET;
                j jVar2 = jVar;
                Object obj = jVar2.f88898h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar2.f88900j;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    I i16 = new I();
                    I i17 = new I();
                    U a11 = C10727i.a(this.f88875d, null, null, new k(this, z12, i16, z13, qVar, cVar, z11, null), 3);
                    jVar2.f88894d = this;
                    jVar2.f88895e = i16;
                    jVar2.f88896f = i17;
                    jVar2.f88900j = 1;
                    obj = a11.s(jVar2);
                    if (obj != aVar) {
                        gVar = this;
                        i12 = i16;
                        i13 = i17;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = jVar2.f88897g;
                    i13 = jVar2.f88896f;
                    i14 = jVar2.f88895e;
                    gVar2 = jVar2.f88894d;
                    Sc.s.b(obj);
                    iVar = iVar2;
                    i12 = i14;
                    gVar = gVar2;
                    z14 = iVar instanceof i.a;
                    if (z14) {
                        gVar.f88873b.k();
                    }
                    if (iVar instanceof i.b) {
                        return new i.b(new h.c(i13.f71783a, i12.f71783a));
                    }
                    if (z14) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                I i18 = jVar2.f88896f;
                I i19 = jVar2.f88895e;
                gVar = jVar2.f88894d;
                Sc.s.b(obj);
                i13 = i18;
                i12 = i19;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.l lVar = (ru.ozon.android.messenger.framework.presentation.models.responses.l) ((i.b) iVar).b();
                    i13.f71783a = !i12.f71783a;
                    if (lVar.c() == ru.ozon.android.messenger.framework.presentation.models.responses.j.Error) {
                        gVar.f88873b.a(lVar.b());
                    }
                    ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar2 = gVar.f88877f;
                    if (!i12.f71783a && !aVar2.z()) {
                        jVar2.f88894d = gVar;
                        jVar2.f88895e = i12;
                        jVar2.f88896f = i13;
                        jVar2.f88897g = (i.b) iVar;
                        jVar2.f88900j = 2;
                        if (aVar2.F(jVar2) != aVar) {
                            gVar2 = gVar;
                            i14 = i12;
                            iVar2 = iVar;
                            iVar = iVar2;
                            i12 = i14;
                            gVar = gVar2;
                        }
                        return aVar;
                    }
                }
                z14 = iVar instanceof i.a;
                if (z14) {
                }
                if (iVar instanceof i.b) {
                }
            }
        }
        jVar = new j(this, cVar2);
        j jVar22 = jVar;
        Object obj2 = jVar22.f88898h;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar22.f88900j;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
        z14 = iVar instanceof i.a;
        if (z14) {
        }
        if (iVar instanceof i.b) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.c
    public final void b(@NotNull v0 failedMessage) {
        Intrinsics.checkNotNullParameter(failedMessage, "failedMessage");
        x0 x0Var = this.f88873b;
        if (x0Var.i()) {
            return;
        }
        x0Var.p(true);
        C10727i.c(this.f88875d, null, null, new b(failedMessage, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.android.messenger.framework.domain.service.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        g gVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f88891g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f88891g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f88889e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f88891g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    x0 x0Var = this.f88873b;
                    v0 j11 = x0Var.j();
                    if (j11 == null) {
                        return new i.a.e("No update payload to retry");
                    }
                    ru.ozon.android.messenger.framework.domain.model.j f7 = j11.f();
                    if (f7 == null) {
                        return new i.a.e("Last message is not an update");
                    }
                    if (!Intrinsics.d(f7.d(), str)) {
                        return new i.a.e("messageId mismatch on retry");
                    }
                    if (x0Var.i()) {
                        return new i.b(new h.c(false, false));
                    }
                    x0Var.p(true);
                    try {
                        String d11 = j11.d();
                        hVar.f88888d = this;
                        hVar.f88891g = 1;
                        obj = e(f7, d11, hVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        gVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = this;
                        gVar.f88873b.p(false);
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = hVar.f88888d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.f88873b.p(false);
                        throw th;
                    }
                }
                gVar.f88873b.p(false);
                return obj;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f88889e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f88891g;
        if (i11 != 0) {
        }
        gVar.f88873b.p(false);
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r2.f88872a.a(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.android.messenger.framework.domain.service.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        g gVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f88884h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f88884h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f88882f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f88884h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    aVar.f88880d = this;
                    aVar.f88881e = str;
                    aVar.f88884h = 1;
                    if (this.f88876e.e(aVar) != aVar2) {
                        gVar = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                str = aVar.f88881e;
                gVar = aVar.f88880d;
                Sc.s.b(obj);
                gVar.f88873b.b();
                aVar.f88880d = null;
                aVar.f88881e = null;
                aVar.f88884h = 2;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f88882f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f88884h;
        if (i11 != 0) {
        }
        gVar.f88873b.b();
        aVar.f88880d = null;
        aVar.f88881e = null;
        aVar.f88884h = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0156, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1 != null ? r1.d() : null, r12.d()) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0324, code lost:
    
        if (r3.f88876e.c(new ru.ozon.android.messenger.framework.presentation.models.q[]{r12}, r5) == r0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02fd, code lost:
    
        if (r14.a(r2, r5) != r0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a6, code lost:
    
        if (r1.a(r14, r5) != r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0240, code lost:
    
        if (r3.p(r14, r5) != r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e0, code lost:
    
        if (r14 == r0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c5, code lost:
    
        if (u(r1, r2, r3, null, r5, 4) == r0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a3, code lost:
    
        if (r12 == r0) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // ru.ozon.android.messenger.framework.domain.service.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull ru.ozon.android.messenger.framework.domain.model.j jVar, String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        q qVar2;
        g gVar;
        ru.ozon.android.messenger.framework.domain.model.j jVar2;
        v0 v0Var;
        String str2;
        ru.ozon.android.messenger.framework.domain.model.j jVar3;
        g gVar2;
        Object b11;
        ru.ozon.android.messenger.utils.i iVar;
        ru.ozon.android.messenger.utils.i iVar2;
        ru.ozon.android.messenger.framework.domain.model.j jVar4;
        ru.ozon.android.messenger.utils.i iVar3;
        g gVar3;
        ru.ozon.android.messenger.framework.presentation.models.responses.n nVar;
        ru.ozon.android.messenger.utils.i iVar4;
        ru.ozon.android.messenger.framework.presentation.models.responses.n nVar2;
        ru.ozon.android.messenger.utils.i iVar5;
        String str3;
        Object b12;
        ru.ozon.android.messenger.framework.domain.model.j jVar5;
        g gVar4;
        g gVar5;
        ru.ozon.android.messenger.framework.presentation.models.q b13;
        ru.ozon.android.messenger.utils.i iVar6;
        ru.ozon.android.messenger.utils.i iVar7;
        ru.ozon.android.messenger.framework.domain.model.j jVar6;
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c cVar2;
        g gVar6;
        v0 j11;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i11 = qVar.f88938k;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qVar.f88938k = i11 - LinearLayoutManager.INVALID_OFFSET;
                qVar2 = qVar;
                Object obj = qVar2.f88936i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                switch (qVar2.f88938k) {
                    case 0:
                        Sc.s.b(obj);
                        v0 j12 = this.f88873b.j();
                        if (j12 != null) {
                            ru.ozon.android.messenger.framework.domain.model.j f7 = j12.f();
                            break;
                        }
                        j12 = null;
                        r rVar = new r(jVar);
                        qVar2.f88931d = this;
                        qVar2.f88932e = jVar;
                        qVar2.f88933f = str;
                        qVar2.f88934g = j12;
                        qVar2.f88938k = 1;
                        if (this.f88876e.i(rVar, qVar2) != aVar) {
                            gVar = this;
                            jVar2 = jVar;
                            v0Var = j12;
                            if (v0Var != null) {
                                gVar.f88873b.f(new v0(jVar2.e(), jVar2.c(), jVar2, 12));
                            } else {
                                gVar.f88873b.m(jVar2);
                            }
                            if (str == null) {
                                ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c cVar3 = gVar.f88879h;
                                qVar2.f88931d = gVar;
                                qVar2.f88932e = jVar2;
                                qVar2.f88933f = str;
                                qVar2.f88934g = null;
                                qVar2.f88938k = 2;
                                b11 = cVar3.b((r4 & 1) != 0, false, qVar2);
                                break;
                            }
                            str2 = str;
                            jVar3 = jVar2;
                            gVar2 = gVar;
                            String d11 = jVar3.c().d();
                            z.c cVar4 = z.c.f91565a;
                            qVar2.f88931d = gVar2;
                            qVar2.f88932e = jVar3;
                            qVar2.f88933f = str2;
                            qVar2.f88934g = null;
                            qVar2.f88938k = 3;
                            break;
                        }
                        return aVar;
                    case 1:
                        v0Var = (v0) qVar2.f88934g;
                        str = (String) qVar2.f88933f;
                        jVar2 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar = qVar2.f88931d;
                        Sc.s.b(obj);
                        if (v0Var != null) {
                        }
                        if (str == null) {
                        }
                        str2 = str;
                        jVar3 = jVar2;
                        gVar2 = gVar;
                        String d112 = jVar3.c().d();
                        z.c cVar42 = z.c.f91565a;
                        qVar2.f88931d = gVar2;
                        qVar2.f88932e = jVar3;
                        qVar2.f88933f = str2;
                        qVar2.f88934g = null;
                        qVar2.f88938k = 3;
                        break;
                    case 2:
                        str2 = (String) qVar2.f88933f;
                        jVar3 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar2 = qVar2.f88931d;
                        Sc.s.b(obj);
                        String d1122 = jVar3.c().d();
                        z.c cVar422 = z.c.f91565a;
                        qVar2.f88931d = gVar2;
                        qVar2.f88932e = jVar3;
                        qVar2.f88933f = str2;
                        qVar2.f88934g = null;
                        qVar2.f88938k = 3;
                        break;
                    case 3:
                        str2 = (String) qVar2.f88933f;
                        jVar3 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar2 = qVar2.f88931d;
                        Sc.s.b(obj);
                        ru.ozon.android.messenger.framework.domain.repository.b bVar = gVar2.f88872a;
                        ru.ozon.android.messenger.framework.data.remote.models.c c11 = jVar3.c();
                        String d12 = jVar3.d();
                        qVar2.f88931d = gVar2;
                        qVar2.f88932e = jVar3;
                        qVar2.f88933f = str2;
                        qVar2.f88938k = 4;
                        obj = bVar.k(c11, d12, str2, qVar2);
                        break;
                    case 4:
                        str2 = (String) qVar2.f88933f;
                        jVar3 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar2 = qVar2.f88931d;
                        Sc.s.b(obj);
                        iVar = (ru.ozon.android.messenger.utils.i) obj;
                        if (!(iVar instanceof i.b)) {
                            iVar2 = iVar;
                            if (iVar2 instanceof i.a) {
                                ru.ozon.android.messenger.framework.domain.repository.d dVar = gVar2.f88876e;
                                v vVar = new v(jVar3);
                                qVar2.f88931d = gVar2;
                                qVar2.f88932e = jVar3;
                                qVar2.f88933f = iVar;
                                qVar2.f88934g = iVar2;
                                qVar2.f88935h = null;
                                qVar2.f88938k = 13;
                                if (dVar.i(vVar, qVar2) != aVar) {
                                    ru.ozon.android.messenger.framework.domain.model.j jVar7 = jVar3;
                                    iVar6 = iVar2;
                                    iVar7 = iVar;
                                    jVar6 = jVar7;
                                    cVar2 = gVar2.f88879h;
                                    qVar2.f88931d = gVar2;
                                    qVar2.f88932e = iVar7;
                                    qVar2.f88933f = iVar6;
                                    qVar2.f88934g = null;
                                    qVar2.f88938k = 14;
                                    if (cVar2.a(jVar6, qVar2) != aVar) {
                                        gVar6 = gVar2;
                                        j11 = gVar6.f88873b.j();
                                        if ((j11 != null ? j11.d() : null) == null) {
                                            gVar6.f88873b.k();
                                        }
                                        iVar = iVar7;
                                    }
                                }
                                return aVar;
                            }
                            if (iVar instanceof i.b) {
                                return new i.b(new h.c(false, false));
                            }
                            if (iVar instanceof i.a) {
                                return iVar;
                            }
                            throw new Sc.o();
                        }
                        ru.ozon.android.messenger.framework.presentation.models.responses.n nVar3 = (ru.ozon.android.messenger.framework.presentation.models.responses.n) ((i.b) iVar).b();
                        if (nVar3.d() != ru.ozon.android.messenger.framework.presentation.models.responses.j.OK) {
                            if (nVar3.a() == null) {
                                gVar2.f88873b.a(nVar3.c());
                                t tVar = new t(jVar3);
                                qVar2.f88931d = gVar2;
                                qVar2.f88932e = jVar3;
                                qVar2.f88933f = iVar;
                                qVar2.f88934g = iVar;
                                qVar2.f88935h = nVar3;
                                qVar2.f88938k = 10;
                                if (gVar2.f88876e.i(tVar, qVar2) != aVar) {
                                    jVar4 = jVar3;
                                    iVar3 = iVar;
                                    gVar3 = gVar2;
                                    nVar = nVar3;
                                    iVar4 = iVar3;
                                    ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c cVar5 = gVar3.f88879h;
                                    qVar2.f88931d = gVar3;
                                    qVar2.f88932e = jVar4;
                                    qVar2.f88933f = iVar4;
                                    qVar2.f88934g = iVar3;
                                    qVar2.f88935h = nVar;
                                    qVar2.f88938k = 11;
                                    break;
                                }
                            } else {
                                ru.ozon.android.messenger.framework.domain.repository.d dVar2 = gVar2.f88876e;
                                s sVar = new s(jVar3);
                                qVar2.f88931d = gVar2;
                                qVar2.f88932e = jVar3;
                                qVar2.f88933f = nVar3;
                                qVar2.f88938k = 8;
                                if (dVar2.i(sVar, qVar2) != aVar) {
                                    nVar2 = nVar3;
                                    ru.ozon.android.messenger.framework.domain.model.j jVar8 = jVar3;
                                    gVar5 = gVar2;
                                    ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c cVar6 = gVar5.f88879h;
                                    qVar2.f88931d = gVar5;
                                    qVar2.f88932e = nVar2;
                                    qVar2.f88933f = null;
                                    qVar2.f88938k = 9;
                                    break;
                                }
                            }
                        } else {
                            String d13 = jVar3.c().d();
                            z.f fVar = z.f.f91568a;
                            ru.ozon.android.messenger.framework.presentation.models.q b14 = nVar3.b();
                            qVar2.f88931d = gVar2;
                            qVar2.f88932e = jVar3;
                            qVar2.f88933f = str2;
                            qVar2.f88934g = iVar;
                            qVar2.f88935h = iVar;
                            qVar2.f88938k = 5;
                            if (u(gVar2, d13, fVar, b14, qVar2, 8) != aVar) {
                                jVar4 = jVar3;
                                iVar5 = iVar;
                                gVar3 = gVar2;
                                str3 = str2;
                                iVar2 = iVar5;
                                String b15 = jVar4.c().b();
                                qVar2.f88931d = gVar3;
                                qVar2.f88932e = jVar4;
                                qVar2.f88933f = str3;
                                qVar2.f88934g = iVar5;
                                qVar2.f88935h = iVar2;
                                qVar2.f88938k = 6;
                                break;
                            }
                        }
                        return aVar;
                    case 5:
                        iVar2 = (ru.ozon.android.messenger.utils.i) qVar2.f88935h;
                        iVar5 = (ru.ozon.android.messenger.utils.i) qVar2.f88934g;
                        str3 = (String) qVar2.f88933f;
                        jVar4 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar3 = qVar2.f88931d;
                        Sc.s.b(obj);
                        String b152 = jVar4.c().b();
                        qVar2.f88931d = gVar3;
                        qVar2.f88932e = jVar4;
                        qVar2.f88933f = str3;
                        qVar2.f88934g = iVar5;
                        qVar2.f88935h = iVar2;
                        qVar2.f88938k = 6;
                        break;
                    case 6:
                        iVar2 = (ru.ozon.android.messenger.utils.i) qVar2.f88935h;
                        iVar5 = (ru.ozon.android.messenger.utils.i) qVar2.f88934g;
                        str3 = (String) qVar2.f88933f;
                        jVar4 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar3 = qVar2.f88931d;
                        Sc.s.b(obj);
                        gVar3.f88873b.k();
                        gVar3.f88873b.n(null);
                        if (str3 != null) {
                            qVar2.f88931d = gVar3;
                            qVar2.f88932e = jVar4;
                            qVar2.f88933f = iVar5;
                            qVar2.f88934g = iVar2;
                            qVar2.f88935h = null;
                            qVar2.f88938k = 7;
                            b12 = gVar3.f88879h.b((r4 & 1) != 0, false, qVar2);
                            if (b12 != aVar) {
                                jVar5 = jVar4;
                                gVar4 = gVar3;
                                g gVar7 = gVar4;
                                jVar4 = jVar5;
                                gVar2 = gVar7;
                                iVar = iVar5;
                                jVar3 = jVar4;
                                if (iVar2 instanceof i.a) {
                                }
                                if (iVar instanceof i.b) {
                                }
                            }
                            return aVar;
                        }
                        iVar = iVar5;
                        gVar2 = gVar3;
                        jVar3 = jVar4;
                        if (iVar2 instanceof i.a) {
                        }
                        if (iVar instanceof i.b) {
                        }
                        break;
                    case 7:
                        iVar2 = (ru.ozon.android.messenger.utils.i) qVar2.f88934g;
                        iVar5 = (ru.ozon.android.messenger.utils.i) qVar2.f88933f;
                        jVar5 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar4 = qVar2.f88931d;
                        Sc.s.b(obj);
                        g gVar72 = gVar4;
                        jVar4 = jVar5;
                        gVar2 = gVar72;
                        iVar = iVar5;
                        jVar3 = jVar4;
                        if (iVar2 instanceof i.a) {
                        }
                        if (iVar instanceof i.b) {
                        }
                        break;
                    case 8:
                        nVar2 = (ru.ozon.android.messenger.framework.presentation.models.responses.n) qVar2.f88933f;
                        jVar3 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar2 = qVar2.f88931d;
                        Sc.s.b(obj);
                        ru.ozon.android.messenger.framework.domain.model.j jVar82 = jVar3;
                        gVar5 = gVar2;
                        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c cVar62 = gVar5.f88879h;
                        qVar2.f88931d = gVar5;
                        qVar2.f88932e = nVar2;
                        qVar2.f88933f = null;
                        qVar2.f88938k = 9;
                        break;
                    case 9:
                        nVar2 = (ru.ozon.android.messenger.framework.presentation.models.responses.n) qVar2.f88932e;
                        gVar5 = qVar2.f88931d;
                        Sc.s.b(obj);
                        gVar5.f88873b.k();
                        gVar5.f88873b.n(null);
                        return new i.a.k(nVar2.a());
                    case 10:
                        nVar = (ru.ozon.android.messenger.framework.presentation.models.responses.n) qVar2.f88935h;
                        iVar3 = (ru.ozon.android.messenger.utils.i) qVar2.f88934g;
                        iVar4 = (ru.ozon.android.messenger.utils.i) qVar2.f88933f;
                        jVar4 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar3 = qVar2.f88931d;
                        Sc.s.b(obj);
                        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c cVar52 = gVar3.f88879h;
                        qVar2.f88931d = gVar3;
                        qVar2.f88932e = jVar4;
                        qVar2.f88933f = iVar4;
                        qVar2.f88934g = iVar3;
                        qVar2.f88935h = nVar;
                        qVar2.f88938k = 11;
                        break;
                    case 11:
                        nVar = (ru.ozon.android.messenger.framework.presentation.models.responses.n) qVar2.f88935h;
                        iVar3 = (ru.ozon.android.messenger.utils.i) qVar2.f88934g;
                        iVar4 = (ru.ozon.android.messenger.utils.i) qVar2.f88933f;
                        jVar4 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar3 = qVar2.f88931d;
                        Sc.s.b(obj);
                        b13 = nVar.b();
                        if (b13 != null) {
                            gVar3.f88876e.j(u.f88942b);
                            qVar2.f88931d = gVar3;
                            qVar2.f88932e = jVar4;
                            qVar2.f88933f = iVar4;
                            qVar2.f88934g = iVar3;
                            qVar2.f88935h = b13;
                            qVar2.f88938k = 12;
                            break;
                        }
                        iVar2 = iVar3;
                        iVar = iVar4;
                        gVar2 = gVar3;
                        jVar3 = jVar4;
                        if (iVar2 instanceof i.a) {
                        }
                        if (iVar instanceof i.b) {
                        }
                        break;
                    case 12:
                        b13 = (ru.ozon.android.messenger.framework.presentation.models.q) qVar2.f88935h;
                        iVar3 = (ru.ozon.android.messenger.utils.i) qVar2.f88934g;
                        iVar4 = (ru.ozon.android.messenger.utils.i) qVar2.f88933f;
                        jVar4 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        gVar3 = qVar2.f88931d;
                        Sc.s.b(obj);
                        gVar3.f88873b.n(b13);
                        iVar2 = iVar3;
                        iVar = iVar4;
                        gVar2 = gVar3;
                        jVar3 = jVar4;
                        if (iVar2 instanceof i.a) {
                        }
                        if (iVar instanceof i.b) {
                        }
                        break;
                    case 13:
                        ru.ozon.android.messenger.utils.i iVar8 = (ru.ozon.android.messenger.utils.i) qVar2.f88934g;
                        ru.ozon.android.messenger.utils.i iVar9 = (ru.ozon.android.messenger.utils.i) qVar2.f88933f;
                        ru.ozon.android.messenger.framework.domain.model.j jVar9 = (ru.ozon.android.messenger.framework.domain.model.j) qVar2.f88932e;
                        g gVar8 = qVar2.f88931d;
                        Sc.s.b(obj);
                        iVar6 = iVar8;
                        iVar7 = iVar9;
                        jVar6 = jVar9;
                        gVar2 = gVar8;
                        cVar2 = gVar2.f88879h;
                        qVar2.f88931d = gVar2;
                        qVar2.f88932e = iVar7;
                        qVar2.f88933f = iVar6;
                        qVar2.f88934g = null;
                        qVar2.f88938k = 14;
                        if (cVar2.a(jVar6, qVar2) != aVar) {
                        }
                        return aVar;
                    case 14:
                        iVar7 = (ru.ozon.android.messenger.utils.i) qVar2.f88932e;
                        gVar6 = qVar2.f88931d;
                        Sc.s.b(obj);
                        j11 = gVar6.f88873b.j();
                        if ((j11 != null ? j11.d() : null) == null) {
                        }
                        iVar = iVar7;
                        if (iVar instanceof i.b) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        qVar = new q(this, cVar);
        qVar2 = qVar;
        Object obj2 = qVar2.f88936i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        switch (qVar2.f88938k) {
        }
    }
}
