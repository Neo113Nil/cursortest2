package ru.ozon.android.messenger.framework.data.repository;

import Sc.r;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$removeDraft$2", f = "DraftsRepository.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class V extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88429d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f88430e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ T f88431f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f88432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(T t2, String str, kotlin.coroutines.d<? super V> dVar) {
        super(2, dVar);
        this.f88431f = t2;
        this.f88432g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        V v11 = new V(this.f88431f, this.f88432g, dVar);
        v11.f88430e = obj;
        return v11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((V) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88429d;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                T t2 = this.f88431f;
                String str = this.f88432g;
                r.Companion companion = Sc.r.INSTANCE;
                ru.ozon.android.messenger.framework.data.local.database.draft.s sVar = t2.f88394a;
                this.f88429d = 1;
                if (sVar.d(str, this) == aVar) {
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
