package ru.ozon.android.messenger.framework.data.repository;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.requests.AddFastAnswerResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$removeFastAnswerAction$2", f = "ActionRepositoryImpl.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class A extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends AddFastAnswerResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88252d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88253e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f88254f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f88255g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(C9351a c9351a, String str, Map<String, String> map, kotlin.coroutines.d<? super A> dVar) {
        super(2, dVar);
        this.f88253e = c9351a;
        this.f88254f = str;
        this.f88255g = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new A(this.f88253e, this.f88254f, this.f88255g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends AddFastAnswerResponseDTO>> dVar) {
        return ((A) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88252d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88253e.f88448b;
        this.f88252d = 1;
        Object o11 = yVar.o(this.f88254f, this.f88255g, this);
        return o11 == aVar ? aVar : o11;
    }
}
