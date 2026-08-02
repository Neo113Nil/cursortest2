package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import A00.a;
import Sc.o;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.widgets.coupon.common.CouponAction;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponUpdateState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponViewModel$onCouponApplied$1", f = "CouponViewModel.kt", l = {109, 115}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CouponViewModel$onCouponApplied$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CouponViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponViewModel$onCouponApplied$1(CouponViewModel couponViewModel, d<? super CouponViewModel$onCouponApplied$1> dVar) {
        super(2, dVar);
        this.this$0 = couponViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CouponViewModel$onCouponApplied$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0045, code lost:
    
        if (r8 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        HighlightsWrapperStateManager highlightsWrapperStateManager;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent2;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent3;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent4;
        CouponUpdateState createCouponState;
        HighlightsWrapperAsyncState highlightsWrapperAsyncState;
        CouponUpdateState createCouponState2;
        a.J.InterfaceC0007a parseNewWidgetState;
        a.J.InterfaceC0007a parseCartState;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent5;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            str = this.this$0.asyncData;
            if (str == null) {
                broadcastSingleLiveEvent = this.this$0._action;
                broadcastSingleLiveEvent.setValue(CouponAction.FullRefresh.INSTANCE);
                return Unit.f71690a;
            }
            highlightsWrapperStateManager = this.this$0.stateManager;
            this.label = 1;
            obj = highlightsWrapperStateManager.requestWidgetState(str, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                highlightsWrapperAsyncState = (HighlightsWrapperAsyncState) this.L$0;
                s.b(obj);
                HighlightsWrapperAsyncState.Success success = (HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState;
                createCouponState2 = this.this$0.createCouponState(success.getState().getCoupon(), success.getState().getCurrentMiniWidget());
                parseNewWidgetState = this.this$0.parseNewWidgetState(success);
                parseCartState = this.this$0.parseCartState(success);
                CouponAction.AsyncRefresh asyncRefresh = new CouponAction.AsyncRefresh(createCouponState2, parseNewWidgetState, parseCartState);
                broadcastSingleLiveEvent5 = this.this$0._action;
                broadcastSingleLiveEvent5.setValue(asyncRefresh);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        HighlightsWrapperAsyncState highlightsWrapperAsyncState2 = (HighlightsWrapperAsyncState) obj;
        if (!(highlightsWrapperAsyncState2 instanceof HighlightsWrapperAsyncState.Success)) {
            if (highlightsWrapperAsyncState2 instanceof HighlightsWrapperAsyncState.NetworkException) {
                broadcastSingleLiveEvent3 = this.this$0._action;
                broadcastSingleLiveEvent3.setValue(CouponAction.FullRefresh.INSTANCE);
            } else {
                if (!(highlightsWrapperAsyncState2 instanceof HighlightsWrapperAsyncState.ParseException) && !(highlightsWrapperAsyncState2 instanceof HighlightsWrapperAsyncState.WidgetSkippedException)) {
                    throw new o();
                }
                broadcastSingleLiveEvent2 = this.this$0._action;
                broadcastSingleLiveEvent2.setValue(CouponAction.FullRefresh.INSTANCE);
            }
            return Unit.f71690a;
        }
        broadcastSingleLiveEvent4 = this.this$0._action;
        createCouponState = this.this$0.createCouponState(((HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState2).getState().getCoupon(), HighlightsCurrentMiniWidget.COUPON);
        broadcastSingleLiveEvent4.setValue(new CouponAction.CouponAsyncRefresh(createCouponState));
        this.L$0 = highlightsWrapperAsyncState2;
        this.label = 2;
        if (Y.b(1000L, this) != aVar) {
            highlightsWrapperAsyncState = highlightsWrapperAsyncState2;
            HighlightsWrapperAsyncState.Success success2 = (HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState;
            createCouponState2 = this.this$0.createCouponState(success2.getState().getCoupon(), success2.getState().getCurrentMiniWidget());
            parseNewWidgetState = this.this$0.parseNewWidgetState(success2);
            parseCartState = this.this$0.parseCartState(success2);
            CouponAction.AsyncRefresh asyncRefresh2 = new CouponAction.AsyncRefresh(createCouponState2, parseNewWidgetState, parseCartState);
            broadcastSingleLiveEvent5 = this.this$0._action;
            broadcastSingleLiveEvent5.setValue(asyncRefresh2);
            return Unit.f71690a;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CouponViewModel$onCouponApplied$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
