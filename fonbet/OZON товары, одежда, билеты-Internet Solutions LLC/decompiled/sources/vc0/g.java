package vc0;

import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.core.FeatureFlagConf;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.OzonIdPageEntryFeatureFlagRepository$saveFlags$1", f = "OzonIdPageEntryFeatureFlagRepository.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f102843d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f102844e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FeatureFlagConf f102845f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.OzonIdPageEntryFeatureFlagRepository$saveFlags$1$1", f = "OzonIdPageEntryFeatureFlagRepository.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f102846d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f102847e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FeatureFlagConf f102848f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, FeatureFlagConf featureFlagConf, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f102847e = eVar;
            this.f102848f = featureFlagConf;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f102847e, this.f102848f, dVar);
            aVar.f102846d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            W2.b bVar = (W2.b) this.f102846d;
            e eVar = this.f102847e;
            bVar.i(e.c(eVar), e.a(eVar).toJson(this.f102848f));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, FeatureFlagConf featureFlagConf, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f102844e = eVar;
        this.f102845f = featureFlagConf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f102844e, this.f102845f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f102843d;
        if (i11 == 0) {
            s.b(obj);
            e eVar = this.f102844e;
            interfaceC4008j = eVar.f102832a;
            InterfaceC3917k interfaceC3917k = (InterfaceC3917k) interfaceC4008j.getValue();
            a aVar2 = new a(eVar, this.f102845f, null);
            this.f102843d = 1;
            if (W2.j.a(interfaceC3917k, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
