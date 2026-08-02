package cd0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import xc0.C10702a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.AuthViewModel$handleMobileId$1", f = "AuthViewModel.kt", l = {284}, m = "invokeSuspend")
/* renamed from: cd0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5811f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56951d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5806a f56952e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FastEntryActionDTO.FastEntryDataDTO.MobileId f56953f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7735q f56954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5811f(C5806a c5806a, FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId, Function1<? super FastEntryActionDTO, Unit> function1, kotlin.coroutines.d<? super C5811f> dVar) {
        super(2, dVar);
        this.f56952e = c5806a;
        this.f56953f = mobileId;
        this.f56954g = (C7735q) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5811f(this.f56952e, this.f56953f, this.f56954g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5811f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56951d;
        if (i11 == 0) {
            s.b(obj);
            C10702a m02 = C5806a.m0(this.f56952e);
            this.f56951d = 1;
            obj = m02.c(this.f56953f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.f56954g.invoke((FastEntryActionDTO) obj);
        return Unit.f71690a;
    }
}
