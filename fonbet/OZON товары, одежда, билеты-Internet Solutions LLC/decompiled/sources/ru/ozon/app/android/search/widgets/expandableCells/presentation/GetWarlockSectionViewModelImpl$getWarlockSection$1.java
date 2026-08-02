package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionResponse;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.WarlockResult;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.expandableCells.presentation.GetWarlockSectionViewModelImpl$getWarlockSection$1", f = "GetWarlockSectionViewModel.kt", l = {59, 43, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 49}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class GetWarlockSectionViewModelImpl$getWarlockSection$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $actionRequest;
    final /* synthetic */ ExpandableCellVO $item;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GetWarlockSectionViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetWarlockSectionViewModelImpl$getWarlockSection$1(GetWarlockSectionViewModelImpl getWarlockSectionViewModelImpl, ActionV2Request actionV2Request, ExpandableCellVO expandableCellVO, d<? super GetWarlockSectionViewModelImpl$getWarlockSection$1> dVar) {
        super(2, dVar);
        this.this$0 = getWarlockSectionViewModelImpl;
        this.$actionRequest = actionV2Request;
        this.$item = expandableCellVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        GetWarlockSectionViewModelImpl$getWarlockSection$1 getWarlockSectionViewModelImpl$getWarlockSection$1 = new GetWarlockSectionViewModelImpl$getWarlockSection$1(this.this$0, this.$actionRequest, this.$item, dVar);
        getWarlockSectionViewModelImpl$getWarlockSection$1.L$0 = obj;
        return getWarlockSectionViewModelImpl$getWarlockSection$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r9.emit(r4, r8) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r9.emit(r3, r8) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r9.emit(r6, r8) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        w0 w0Var;
        w0 w0Var2;
        w0 w0Var3;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            GetWarlockSectionViewModelImpl getWarlockSectionViewModelImpl = this.this$0;
            ActionV2Request actionV2Request = this.$actionRequest;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = getWarlockSectionViewModelImpl.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, GetWarlockSectionResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                GetWarlockSectionViewModelImpl getWarlockSectionViewModelImpl2 = this.this$0;
                ExpandableCellVO expandableCellVO = this.$item;
                if (r.b(obj2) != null) {
                    w0Var3 = getWarlockSectionViewModelImpl2.sharedFlow;
                    WarlockResult.WarlockFailure warlockFailure = new WarlockResult.WarlockFailure(expandableCellVO);
                    this.L$0 = obj2;
                    this.label = 4;
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ActionV2Response) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        GetWarlockSectionViewModelImpl getWarlockSectionViewModelImpl3 = this.this$0;
        ExpandableCellVO expandableCellVO2 = this.$item;
        if (!(obj2 instanceof r.b)) {
            ActionV2Response actionV2Response = (ActionV2Response) obj2;
            if (actionV2Response.getError() != null) {
                w0Var2 = getWarlockSectionViewModelImpl3.sharedFlow;
                WarlockResult.WarlockFailure warlockFailure2 = new WarlockResult.WarlockFailure(expandableCellVO2);
                this.L$0 = obj2;
                this.label = 2;
            } else {
                GetWarlockSectionResponse getWarlockSectionResponse = (GetWarlockSectionResponse) actionV2Response.getData();
                if (getWarlockSectionResponse != null) {
                    w0Var = getWarlockSectionViewModelImpl3.sharedFlow;
                    WarlockResult.WarlockSuccess warlockSuccess = new WarlockResult.WarlockSuccess(getWarlockSectionResponse, expandableCellVO2);
                    this.L$0 = obj2;
                    this.label = 3;
                }
            }
            return Unit.f71690a;
        }
        GetWarlockSectionViewModelImpl getWarlockSectionViewModelImpl22 = this.this$0;
        ExpandableCellVO expandableCellVO3 = this.$item;
        if (r.b(obj2) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GetWarlockSectionViewModelImpl$getWarlockSection$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
