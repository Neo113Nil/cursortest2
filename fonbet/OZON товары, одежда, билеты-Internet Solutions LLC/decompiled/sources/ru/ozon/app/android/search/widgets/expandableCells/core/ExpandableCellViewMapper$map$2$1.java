package ru.ozon.app.android.search.widgets.expandableCells.core;

import Sc.r;
import Sc.s;
import Wc.a;
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
import ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellVO;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellViewMapper$map$2$1", f = "ExpandableCellViewMapper.kt", l = {118, 86}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ExpandableCellViewMapper$map$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $actionRequest;
    final /* synthetic */ ExpandableCellVO $expandableCellVO;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ExpandableCellViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpandableCellViewMapper$map$2$1(ExpandableCellViewMapper expandableCellViewMapper, ActionV2Request actionV2Request, ExpandableCellVO expandableCellVO, d<? super ExpandableCellViewMapper$map$2$1> dVar) {
        super(2, dVar);
        this.this$0 = expandableCellViewMapper;
        this.$actionRequest = actionV2Request;
        this.$expandableCellVO = expandableCellVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ExpandableCellViewMapper$map$2$1 expandableCellViewMapper$map$2$1 = new ExpandableCellViewMapper$map$2$1(this.this$0, this.$actionRequest, this.$expandableCellVO, dVar);
        expandableCellViewMapper$map$2$1.L$0 = obj;
        return expandableCellViewMapper$map$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (xe.C10727i.f(r4, r5, r7) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            ExpandableCellViewMapper expandableCellViewMapper = this.this$0;
            ActionV2Request actionV2Request = this.$actionRequest;
            r.Companion companion2 = r.INSTANCE;
            ActionV2Repository actionV2Repository = expandableCellViewMapper.component().getActionV2Repository();
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, GetWarlockSectionResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ActionV2Response) obj;
        r.Companion companion3 = r.INSTANCE;
        ExpandableCellVO expandableCellVO = this.$expandableCellVO;
        if (!(a11 instanceof r.b)) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            ExpandableCellViewMapper$map$2$1$2$1 expandableCellViewMapper$map$2$1$2$1 = new ExpandableCellViewMapper$map$2$1$2$1(expandableCellVO, (ActionV2Response) a11, null);
            this.L$0 = a11;
            this.label = 2;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ExpandableCellViewMapper$map$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
