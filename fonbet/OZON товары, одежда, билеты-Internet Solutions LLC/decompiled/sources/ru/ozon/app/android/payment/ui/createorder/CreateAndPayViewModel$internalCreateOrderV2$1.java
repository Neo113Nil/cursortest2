package ru.ozon.app.android.payment.ui.createorder;

import Sc.o;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.payment.ui.createOrderV2.CreateOrderV2Response;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$internalCreateOrderV2$1", f = "CreateAndPayViewModel.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateAndPayViewModel$internalCreateOrderV2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $body;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ CreateAndPayViewModel this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$internalCreateOrderV2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Result<CreateOrderV2Response> $result;
        final /* synthetic */ CreateAndPayViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CreateAndPayViewModel createAndPayViewModel, Result<CreateOrderV2Response> result) {
            super(0);
            this.this$0 = createAndPayViewModel;
            this.$result = result;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.processOrderV2Error(((Result.Failure) this.$result).getThrowable());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayViewModel$internalCreateOrderV2$1(CreateAndPayViewModel createAndPayViewModel, String str, c cVar, Map<String, String> map, d<? super CreateAndPayViewModel$internalCreateOrderV2$1> dVar) {
        super(2, dVar);
        this.this$0 = createAndPayViewModel;
        this.$actionName = str;
        this.$trackingData = cVar;
        this.$body = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CreateAndPayViewModel$internalCreateOrderV2$1(this.this$0, this.$actionName, this.$trackingData, this.$body, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CreateAndPayRepository createAndPayRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.showLoading();
            createAndPayRepository = this.this$0.repository;
            String str = this.$actionName;
            c cVar = this.$trackingData;
            Map<String, String> map = this.$body;
            this.label = 1;
            obj = createAndPayRepository.createOrderV2(str, cVar, map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            this.this$0.processOrderV2Response((CreateOrderV2Response) ((Result.Success) result).getValue());
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            CreateAndPayViewModel createAndPayViewModel = this.this$0;
            createAndPayViewModel.hideLoading(new AnonymousClass1(createAndPayViewModel, result));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CreateAndPayViewModel$internalCreateOrderV2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
