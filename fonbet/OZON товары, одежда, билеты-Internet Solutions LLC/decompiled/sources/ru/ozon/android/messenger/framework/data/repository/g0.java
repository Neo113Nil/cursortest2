package ru.ozon.android.messenger.framework.data.repository;

import Sc.r;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UndeliveredMessagesRepositoryImpl$removeUndeliveredMessage$2", f = "UndeliveredMessagesRepository.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88526d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f88527e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h0 f88528f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f88529g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(h0 h0Var, String str, kotlin.coroutines.d<? super g0> dVar) {
        super(2, dVar);
        this.f88528f = h0Var;
        this.f88529g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        g0 g0Var = new g0(this.f88528f, this.f88529g, dVar);
        g0Var.f88527e = obj;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88526d;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                h0 h0Var = this.f88528f;
                String str = this.f88529g;
                r.Companion companion = Sc.r.INSTANCE;
                ru.ozon.android.messenger.framework.data.local.database.c cVar = h0Var.f88534a;
                this.f88526d = 1;
                if (cVar.c(str, this) == aVar) {
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
