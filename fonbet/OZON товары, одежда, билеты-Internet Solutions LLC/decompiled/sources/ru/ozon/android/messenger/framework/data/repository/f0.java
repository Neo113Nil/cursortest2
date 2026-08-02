package ru.ozon.android.messenger.framework.data.repository;

import Sc.r;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UndeliveredMessagesRepositoryImpl$loadUndeliveredMessagesByChat$2", f = "UndeliveredMessagesRepository.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends List<? extends UndeliveredMessageEntity>>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88520d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h0 f88521e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f88522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(h0 h0Var, String str, kotlin.coroutines.d<? super f0> dVar) {
        super(2, dVar);
        this.f88521e = h0Var;
        this.f88522f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f0(this.f88521e, this.f88522f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends List<? extends UndeliveredMessageEntity>>> dVar) {
        return ((f0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88520d;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                h0 h0Var = this.f88521e;
                String str = this.f88522f;
                r.Companion companion = Sc.r.INSTANCE;
                ru.ozon.android.messenger.framework.data.local.database.c cVar = h0Var.f88534a;
                this.f88520d = 1;
                obj = cVar.d(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            a11 = new i.b(obj);
            r.Companion companion2 = Sc.r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        return b11 == null ? a11 : new i.a.d("UndeliveredMessagesRepository, loadUndeliveredMessagesByChat failed", b11);
    }
}
