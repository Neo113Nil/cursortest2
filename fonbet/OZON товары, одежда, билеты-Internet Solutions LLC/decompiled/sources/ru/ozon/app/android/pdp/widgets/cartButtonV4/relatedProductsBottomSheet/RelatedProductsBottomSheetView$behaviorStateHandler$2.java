package ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet;

import Sc.o;
import WZ.l;
import WZ.t;
import android.os.Handler;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsState;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsState;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RelatedProductsBottomSheetView$behaviorStateHandler$2 extends AbstractC7737t implements Function1<RelatedProductsState, Unit> {
    final /* synthetic */ RelatedProductsBottomSheetView this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RelatedProductsState.Close.CloseType.values().length];
            try {
                iArr[RelatedProductsState.Close.CloseType.TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RelatedProductsState.Close.CloseType.SWIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RelatedProductsState.Close.CloseType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RelatedProductsBottomSheetView$behaviorStateHandler$2(RelatedProductsBottomSheetView relatedProductsBottomSheetView) {
        super(1);
        this.this$0 = relatedProductsBottomSheetView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RelatedProductsState relatedProductsState) {
        invoke2(relatedProductsState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RelatedProductsState state) {
        CurtainTrackingInfoVO curtainTrackingInfoVO;
        t reopenFull;
        l lVar;
        Function1 function1;
        CurtainTrackingInfoVO curtainTrackingInfoVO2;
        t miniCloseTap;
        l lVar2;
        CurtainTrackingInfoVO curtainTrackingInfoVO3;
        CurtainTrackingInfoVO curtainTrackingInfoVO4;
        CurtainTrackingInfoVO curtainTrackingInfoVO5;
        t openFull;
        l lVar3;
        Function1 function12;
        CurtainTrackingInfoVO curtainTrackingInfoVO6;
        t open;
        Function1 function13;
        l lVar4;
        boolean z11;
        Float f7;
        Float f11;
        PageIssueStateView screenStateView;
        AppCompatImageView snapshotView;
        AppCompatImageView snapshotView2;
        PageIssueStateView screenStateView2;
        boolean z12;
        Handler handler;
        Runnable runnable;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof RelatedProductsState.AnimationUp) {
            this.this$0.animation(true, ((RelatedProductsState.AnimationUp) state).getSlideOffset());
            return;
        }
        if (state instanceof RelatedProductsState.AnimationDown) {
            this.this$0.animation(false, ((RelatedProductsState.AnimationDown) state).getSlideOffset());
            return;
        }
        if (Intrinsics.d(state, RelatedProductsState.ExternalTapEvent.INSTANCE)) {
            z12 = this.this$0.isSnapshotOutsideScreenEnabled;
            if (z12) {
                this.this$0.onExternalTapEvent();
                return;
            }
            handler = this.this$0.handler;
            runnable = this.this$0.runnableExternalTapEvent;
            handler.postDelayed(runnable, 100L);
            return;
        }
        if (Intrinsics.d(state, RelatedProductsState.Open.INSTANCE)) {
            curtainTrackingInfoVO6 = this.this$0.analytics;
            if (curtainTrackingInfoVO6 != null && (open = curtainTrackingInfoVO6.getOpen()) != null) {
                RelatedProductsBottomSheetView relatedProductsBottomSheetView = this.this$0;
                function13 = relatedProductsBottomSheetView.onVisibleBottomSheet;
                function13.invoke(Boolean.TRUE);
                lVar4 = relatedProductsBottomSheetView.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar4, open, null, 2, null);
                z11 = relatedProductsBottomSheetView.isSnapshotOutsideScreenEnabled;
                if (z11) {
                    return;
                }
                f7 = relatedProductsBottomSheetView.composerLoaderElevation;
                if (f7 == null) {
                    f11 = relatedProductsBottomSheetView.composerSnapshotElevation;
                    if (f11 == null) {
                        screenStateView = relatedProductsBottomSheetView.getScreenStateView();
                        relatedProductsBottomSheetView.composerLoaderElevation = screenStateView != null ? Float.valueOf(screenStateView.getElevation()) : null;
                        snapshotView = relatedProductsBottomSheetView.getSnapshotView();
                        relatedProductsBottomSheetView.composerSnapshotElevation = snapshotView != null ? Float.valueOf(snapshotView.getElevation()) : null;
                        snapshotView2 = relatedProductsBottomSheetView.getSnapshotView();
                        if (snapshotView2 != null) {
                            snapshotView2.setElevation(3.0f);
                        }
                        screenStateView2 = relatedProductsBottomSheetView.getScreenStateView();
                        if (screenStateView2 != null) {
                            screenStateView2.setElevation(3.0f);
                        }
                    }
                }
                Unit unit = Unit.f71690a;
            }
            this.this$0.isShownBottomSheet = true;
            return;
        }
        if (Intrinsics.d(state, RelatedProductsState.Reopen.INSTANCE)) {
            function12 = this.this$0.onVisibleBottomSheet;
            function12.invoke(Boolean.TRUE);
            return;
        }
        if (Intrinsics.d(state, RelatedProductsState.OpenFull.INSTANCE)) {
            curtainTrackingInfoVO5 = this.this$0.analytics;
            if (curtainTrackingInfoVO5 == null || (openFull = curtainTrackingInfoVO5.getOpenFull()) == null) {
                return;
            }
            lVar3 = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar3, openFull, null, 2, null);
            return;
        }
        if (!(state instanceof RelatedProductsState.Close)) {
            if (!Intrinsics.d(state, RelatedProductsState.ReopenFull.INSTANCE)) {
                if (!Intrinsics.d(state, RelatedProductsState.Detach.INSTANCE)) {
                    throw new o();
                }
                this.this$0.onDetach();
                return;
            } else {
                curtainTrackingInfoVO = this.this$0.analytics;
                if (curtainTrackingInfoVO == null || (reopenFull = curtainTrackingInfoVO.getReopenFull()) == null) {
                    return;
                }
                lVar = this.this$0.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, reopenFull, null, 2, null);
                return;
            }
        }
        this.this$0.isShownBottomSheet = false;
        function1 = this.this$0.onVisibleBottomSheet;
        function1.invoke(Boolean.FALSE);
        int i11 = WhenMappings.$EnumSwitchMapping$0[((RelatedProductsState.Close) state).getType().ordinal()];
        if (i11 == 1) {
            curtainTrackingInfoVO2 = this.this$0.analytics;
            if (curtainTrackingInfoVO2 != null) {
                miniCloseTap = curtainTrackingInfoVO2.getMiniCloseTap();
            }
            miniCloseTap = null;
        } else if (i11 == 2) {
            curtainTrackingInfoVO3 = this.this$0.analytics;
            if (curtainTrackingInfoVO3 != null) {
                miniCloseTap = curtainTrackingInfoVO3.getMiniCloseSwipe();
            }
            miniCloseTap = null;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            curtainTrackingInfoVO4 = this.this$0.analytics;
            if (curtainTrackingInfoVO4 != null) {
                miniCloseTap = curtainTrackingInfoVO4.getCloseFull();
            }
            miniCloseTap = null;
        }
        if (miniCloseTap != null) {
            lVar2 = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar2, miniCloseTap, null, 2, null);
        }
    }
}
