package ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation;

import Sc.s;
import WZ.l;
import WZ.m;
import WZ.t;
import Wc.a;
import java.util.Map;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.C9115P;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import x1.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsKt$withInputAndTracking$1", f = "SelectionReactions.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionReactionsKt$withInputAndTracking$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ SelectionReactionsVO.ReactionsControlVO $controlVO;
    final /* synthetic */ ButtonsDTO $dto;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ long $voId;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/e;", "it", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsKt$withInputAndTracking$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7459e, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ SelectionReactionsVO.ReactionsControlVO $controlVO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(SelectionReactionsVO.ReactionsControlVO reactionsControlVO, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$controlVO = reactionsControlVO;
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7459e c7459e) {
            m1515invokek4lQ0M(c7459e.n());
            return Unit.f71690a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1515invokek4lQ0M(long j11) {
            AtomAction longTapAction = this.$controlVO.getLongTapAction();
            if (longTapAction != null) {
                this.$actionHandler.invoke(longTapAction);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/e;", "it", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsKt$withInputAndTracking$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<C7459e, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ ButtonsDTO $dto;
        final /* synthetic */ l $tokenizedAnalytics;
        final /* synthetic */ long $voId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ButtonsDTO buttonsDTO, Function1<? super AtomAction, Unit> function1, long j11, l lVar) {
            super(1);
            this.$dto = buttonsDTO;
            this.$actionHandler = function1;
            this.$voId = j11;
            this.$tokenizedAnalytics = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7459e c7459e) {
            m1516invokek4lQ0M(c7459e.n());
            return Unit.f71690a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1516invokek4lQ0M(long j11) {
            t mapToTokenizedEvent;
            AtomAction atomAction;
            CommonControlSettings common = this.$dto.getCommon();
            if (common != null) {
                Function1<AtomAction, Unit> function1 = this.$actionHandler;
                long j12 = this.$voId;
                l lVar = this.$tokenizedAnalytics;
                AtomActionDTO action = common.getAction();
                if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, null)) != null) {
                    function1.invoke(atomAction);
                }
                Map<String, TokenizedTrackingInfo> trackingInfo = common.getTrackingInfo();
                if (trackingInfo == null || (mapToTokenizedEvent = TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(j12), "click")) == null) {
                    return;
                }
                m.a(lVar, mapToTokenizedEvent, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SelectionReactionsKt$withInputAndTracking$1(SelectionReactionsVO.ReactionsControlVO reactionsControlVO, Function1<? super AtomAction, Unit> function1, ButtonsDTO buttonsDTO, long j11, l lVar, d<? super SelectionReactionsKt$withInputAndTracking$1> dVar) {
        super(2, dVar);
        this.$controlVO = reactionsControlVO;
        this.$actionHandler = function1;
        this.$dto = buttonsDTO;
        this.$voId = j11;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionReactionsKt$withInputAndTracking$1 selectionReactionsKt$withInputAndTracking$1 = new SelectionReactionsKt$withInputAndTracking$1(this.$controlVO, this.$actionHandler, this.$dto, this.$voId, this.$tokenizedAnalytics, dVar);
        selectionReactionsKt$withInputAndTracking$1.L$0 = obj;
        return selectionReactionsKt$withInputAndTracking$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object f7;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f11 = (F) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$controlVO, this.$actionHandler);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$dto, this.$actionHandler, this.$voId, this.$tokenizedAnalytics);
            this.label = 1;
            f7 = C9115P.f(C9115P.f82441a, this, null, (r12 & 2) != 0 ? null : anonymousClass1, (r12 & 8) != 0 ? null : anonymousClass2, f11);
            if (f7 == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((SelectionReactionsKt$withInputAndTracking$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
