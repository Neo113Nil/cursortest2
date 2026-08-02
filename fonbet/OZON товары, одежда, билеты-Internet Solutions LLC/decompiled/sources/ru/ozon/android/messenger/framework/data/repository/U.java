package ru.ozon.android.messenger.framework.data.repository;

import Sc.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl$loadAllDraftsGroupedByChatId$2", f = "DraftsRepository.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class U extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Map<String, ? extends ru.ozon.android.messenger.blocks.input.b>>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    T f88426d;

    /* renamed from: e, reason: collision with root package name */
    int f88427e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ T f88428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(T t2, kotlin.coroutines.d<? super U> dVar) {
        super(2, dVar);
        this.f88428f = t2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new U(this.f88428f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Map<String, ? extends ru.ozon.android.messenger.blocks.input.b>>> dVar) {
        return ((U) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        T t2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88427e;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                T t11 = this.f88428f;
                r.Companion companion = Sc.r.INSTANCE;
                ru.ozon.android.messenger.framework.data.local.database.draft.s sVar = t11.f88394a;
                this.f88426d = t11;
                this.f88427e = 1;
                Object f7 = sVar.f(this);
                if (f7 == aVar) {
                    return aVar;
                }
                t2 = t11;
                obj = f7;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t2 = this.f88426d;
                Sc.s.b(obj);
            }
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.U.h(map.size()));
            for (Object obj2 : map.entrySet()) {
                Object key = ((Map.Entry) obj2).getKey();
                ru.ozon.android.messenger.framework.data.local.mapper.a aVar2 = t2.f88395b;
                ru.ozon.android.messenger.framework.data.local.database.draft.model.a aVar3 = (ru.ozon.android.messenger.framework.data.local.database.draft.model.a) ((Map.Entry) obj2).getValue();
                aVar2.getClass();
                linkedHashMap.put(key, ru.ozon.android.messenger.framework.data.local.mapper.a.b(aVar3));
            }
            a11 = new i.b(linkedHashMap);
            r.Companion companion2 = Sc.r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        return b11 == null ? a11 : new i.a.d("DraftsRepository, loadAllDraftsGroupedByChatId failed", b11);
    }
}
