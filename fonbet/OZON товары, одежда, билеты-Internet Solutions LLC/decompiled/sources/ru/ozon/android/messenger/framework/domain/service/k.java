package ru.ozon.android.messenger.framework.domain.service;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.model.c;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl$sendMessage$sendResult$1", f = "ChatSendMessageDelegate.kt", l = {140, 147, 153}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.l>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88901d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f88902e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f88903f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ I f88904g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f88905h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f88906i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.models.c f88907j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ boolean f88908k;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f88909b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf((ru.ozon.android.messenger.framework.presentation.models.r.b(it) instanceof ru.ozon.android.messenger.blocks.emptystate.k) || (ru.ozon.android.messenger.framework.presentation.models.r.b(it) instanceof ru.ozon.android.messenger.blocks.emptystate.v2.g));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(g gVar, boolean z11, I i11, boolean z12, ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.data.remote.models.c cVar, boolean z13, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f88902e = gVar;
        this.f88903f = z11;
        this.f88904g = i11;
        this.f88905h = z12;
        this.f88906i = qVar;
        this.f88907j = cVar;
        this.f88908k = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f88902e, this.f88903f, this.f88904g, this.f88905h, this.f88906i, this.f88907j, this.f88908k, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.l>> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r9.a(r1, r6, r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r1.h(r9, r8) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.d dVar;
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
        v0 j11;
        ru.ozon.android.messenger.framework.domain.repository.d dVar2;
        ru.ozon.android.messenger.framework.domain.repository.d dVar3;
        Object q11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88901d;
        g gVar = this.f88902e;
        ru.ozon.android.messenger.framework.presentation.models.q qVar = this.f88906i;
        if (i11 == 0) {
            Sc.s.b(obj);
            dVar = gVar.f88876e;
            dVar.j(a.f88909b);
            aVar = gVar.f88877f;
            if (aVar.O()) {
                v0 j12 = gVar.f88873b.j();
                if (j12 != null && j12.b() && (j11 = gVar.f88873b.j()) != null) {
                    dVar2 = gVar.f88876e;
                    String d11 = ru.ozon.android.messenger.framework.presentation.models.r.d(j11.c());
                    this.f88901d = 1;
                }
                if (!this.f88903f) {
                }
                if (this.f88905h) {
                }
            }
            x0 x0Var = gVar.f88873b;
            ru.ozon.android.messenger.framework.data.remote.models.c cVar = this.f88907j;
            x0Var.f(new v0(qVar, cVar, null, 28));
            this.f88901d = 3;
            q11 = gVar.q(cVar, qVar, this.f88908k, null, this);
            if (q11 == aVar2) {
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                Sc.s.b(obj);
                x0 x0Var2 = gVar.f88873b;
                ru.ozon.android.messenger.framework.data.remote.models.c cVar2 = this.f88907j;
                x0Var2.f(new v0(qVar, cVar2, null, 28));
                this.f88901d = 3;
                q11 = gVar.q(cVar2, qVar, this.f88908k, null, this);
                return q11 == aVar2 ? aVar2 : q11;
            }
            Sc.s.b(obj);
            if (!this.f88903f) {
                this.f88904g.f71783a = true;
            }
            if (this.f88905h) {
                dVar3 = gVar.f88876e;
                c.d dVar4 = new c.d(qVar.c());
                List a02 = C7714v.a0(qVar);
                this.f88901d = 2;
            }
            x0 x0Var22 = gVar.f88873b;
            ru.ozon.android.messenger.framework.data.remote.models.c cVar22 = this.f88907j;
            x0Var22.f(new v0(qVar, cVar22, null, 28));
            this.f88901d = 3;
            q11 = gVar.q(cVar22, qVar, this.f88908k, null, this);
            if (q11 == aVar2) {
            }
        }
    }
}
