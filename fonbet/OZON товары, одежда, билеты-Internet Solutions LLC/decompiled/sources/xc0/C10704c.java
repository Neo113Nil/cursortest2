package xc0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.api.ComposerAuthApi;
import ru.ozon.id.nativeauth.data.api.PageResponse;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import xe.M;

@e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getOtp$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
/* renamed from: xc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10704c extends j implements Function2<M, d<? super OtpDTO>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105365d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10702a f105366e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f105367f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ComposerAuthApi f105368g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10704c(C10702a c10702a, String str, d dVar, ComposerAuthApi composerAuthApi) {
        super(2, dVar);
        this.f105366e = c10702a;
        this.f105367f = str;
        this.f105368g = composerAuthApi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C10704c(this.f105366e, this.f105367f, dVar, this.f105368g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super OtpDTO> dVar) {
        return ((C10704c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105365d;
        if (i11 == 0) {
            s.b(obj);
            String l11 = C10702a.l(this.f105366e, this.f105367f);
            this.f105365d = 1;
            obj = this.f105368g.getOtp(l11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return ((PageResponse) obj).getData();
    }
}
