package wc0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.api.ActionApi;
import ru.ozon.id.nativeauth.data.models.PkceAuthParamEntryActionDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$getAuthParamVkIdAction$2", f = "ActionAuthRepositoryImpl.kt", l = {119}, m = "invokeSuspend")
/* renamed from: wc0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10507h extends j implements Function2<M, kotlin.coroutines.d<? super PkceAuthParamEntryActionDTO>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f104160d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10503d f104161e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f104162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10507h(String str, kotlin.coroutines.d dVar, C10503d c10503d) {
        super(2, dVar);
        this.f104161e = c10503d;
        this.f104162f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10507h(this.f104162f, dVar, this.f104161e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super PkceAuthParamEntryActionDTO> dVar) {
        return ((C10507h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104160d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        String str = this.f104162f;
        C10503d c10503d = this.f104161e;
        String u11 = C10503d.u(c10503d, str);
        ActionApi l11 = C10503d.l(c10503d);
        this.f104160d = 1;
        Object pkceAuthVkIdParam = l11.getPkceAuthVkIdParam(u11, this);
        return pkceAuthVkIdParam == aVar ? aVar : pkceAuthVkIdParam;
    }
}
