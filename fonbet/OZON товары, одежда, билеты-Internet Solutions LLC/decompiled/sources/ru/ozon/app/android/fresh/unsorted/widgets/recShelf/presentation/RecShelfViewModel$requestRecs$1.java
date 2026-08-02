package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.GetRecShelfRequest;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.GetRecShelfResponse;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfApi;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewModel$requestRecs$1", f = "RecShelfViewModel.kt", l = {32, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RecShelfViewModel$requestRecs$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Object $deliverySchema;
    final /* synthetic */ String $miniapp;
    final /* synthetic */ Object $shelfId;
    final /* synthetic */ Object $sku;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RecShelfViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecShelfViewModel$requestRecs$1(RecShelfViewModel recShelfViewModel, String str, Object obj, Object obj2, Object obj3, d<? super RecShelfViewModel$requestRecs$1> dVar) {
        super(2, dVar);
        this.this$0 = recShelfViewModel;
        this.$miniapp = str;
        this.$sku = obj;
        this.$deliverySchema = obj2;
        this.$shelfId = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RecShelfViewModel$requestRecs$1 recShelfViewModel$requestRecs$1 = new RecShelfViewModel$requestRecs$1(this.this$0, this.$miniapp, this.$sku, this.$deliverySchema, this.$shelfId, dVar);
        recShelfViewModel$requestRecs$1.L$0 = obj;
        return recShelfViewModel$requestRecs$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r10.emit(r6, r9) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        GetRecShelfResponse getRecShelfResponse;
        w0 w0Var;
        Throwable b11;
        w0 w0Var2;
        Throwable th2;
        RecShelfApi recShelfApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th3) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th3);
        }
        if (i11 == 0) {
            s.b(obj);
            RecShelfViewModel recShelfViewModel = this.this$0;
            String str = this.$miniapp;
            Object obj3 = this.$sku;
            Object obj4 = this.$deliverySchema;
            r.Companion companion2 = r.INSTANCE;
            recShelfApi = recShelfViewModel.api;
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
            GetRecShelfRequest getRecShelfRequest = new GetRecShelfRequest((String) obj3, obj4 instanceof String ? (String) obj4 : null);
            this.label = 1;
            obj = recShelfApi.requestRecShelf(str, getRecShelfRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.L$1;
                    s.b(obj);
                    Lm0.a.f17149a.e(th2);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                RecShelfViewModel recShelfViewModel2 = this.this$0;
                Object obj5 = this.$shelfId;
                b11 = r.b(obj2);
                if (b11 != null) {
                    w0Var2 = recShelfViewModel2._widgetUpdates;
                    RecShelfState.Close close = new RecShelfState.Close(obj5.toString());
                    this.L$0 = obj2;
                    this.L$1 = b11;
                    this.label = 3;
                    if (w0Var2.emit(close, this) != aVar) {
                        th2 = b11;
                        Lm0.a.f17149a.e(th2);
                    }
                    return aVar;
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ActionV2Response) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        RecShelfViewModel recShelfViewModel3 = this.this$0;
        Object obj6 = this.$shelfId;
        if (!(obj2 instanceof r.b) && (getRecShelfResponse = (GetRecShelfResponse) ((ActionV2Response) obj2).getData()) != null) {
            w0Var = recShelfViewModel3._widgetUpdates;
            RecShelfState.ShowSkus showSkus = new RecShelfState.ShowSkus(obj6.toString(), getRecShelfResponse.getShelf());
            this.L$0 = obj2;
            this.label = 2;
        }
        RecShelfViewModel recShelfViewModel22 = this.this$0;
        Object obj52 = this.$shelfId;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RecShelfViewModel$requestRecs$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
