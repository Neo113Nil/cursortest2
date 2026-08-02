package ru.ozon.app.android.ugcratingmolecule.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.o;
import U7.d;
import UZ.a;
import WZ.e;
import WZ.g;
import WZ.m;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule;
import ru.ozon.app.android.ugcratingmolecule.data.TrackViewInfo;
import ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegateImpl;
import ru.ozon.app.android.ugcratingmolecule.presentation.UiRatingState;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n*\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n*\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010 \u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R'\u0010:\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\n0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateImpl;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "ugcRatingService", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugcratingservice/UgcRatingService;)V", "", "sku", "", "observeUiRatingState", "(Ljava/lang/String;)V", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;", "uiRatingState", "handleRatingState", "(Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;)V", "Lru/ozon/uni/android/atom/rating/RatingView;", "enable", "(Lru/ozon/uni/android/atom/rating/RatingView;)V", "disable", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateViewModel;", "delegateViewModel", "(Ljava/lang/String;)Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateViewModel;", "", "widgetId", "ratingView", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "ugcRatingMolecule", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindOrGone", "(JLru/ozon/uni/android/atom/rating/RatingView;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;Lkotlin/jvm/functions/Function1;)V", "trackView", "()V", "onAttach", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateViewModel;", "currentRatingView", "Lru/ozon/uni/android/atom/rating/RatingView;", "currentSku", "Ljava/lang/String;", "Lxe/B0;", "currentObserveJob", "Lxe/B0;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegatePageViewModel;", "pageViewModel$delegate", "LSc/j;", "getPageViewModel", "()Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegatePageViewModel;", "pageViewModel", "", "currentRatingClickCallback$delegate", "getCurrentRatingClickCallback", "()Lkotlin/jvm/functions/Function1;", "currentRatingClickCallback", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes7.dex */
public final class UgcRatingDelegateImpl implements UgcRatingDelegate {
    private B0 currentObserveJob;

    /* renamed from: currentRatingClickCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j currentRatingClickCallback;
    private RatingView currentRatingView;
    private String currentSku;
    private UgcRatingDelegateViewModel delegateViewModel;

    /* renamed from: pageViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pageViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final UgcRatingService ugcRatingService;

    public UgcRatingDelegateImpl(@NotNull ComposerReferences refs, @NotNull UgcRatingService ugcRatingService) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(ugcRatingService, "ugcRatingService");
        this.refs = refs;
        this.ugcRatingService = ugcRatingService;
        this.pageViewModel = UtilsKt.unsafeLazy(new UgcRatingDelegateImpl$pageViewModel$2(this));
        this.currentRatingClickCallback = UtilsKt.unsafeLazy(new UgcRatingDelegateImpl$currentRatingClickCallback$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UgcRatingDelegateViewModel delegateViewModel(String sku) {
        UgcRatingDelegateViewModel ugcRatingDelegateViewModel = this.delegateViewModel;
        if (ugcRatingDelegateViewModel != null) {
            return ugcRatingDelegateViewModel;
        }
        UgcRatingDelegateViewModel delegateViewModelBySku = getPageViewModel().getDelegateViewModelBySku(sku);
        this.delegateViewModel = delegateViewModelBySku;
        return delegateViewModelBySku;
    }

    private final void disable(RatingView ratingView) {
        if (ratingView == null) {
            return;
        }
        ratingView.setOnTouchListener(new View.OnTouchListener() { // from class: fX.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean disable$lambda$5;
                disable$lambda$5 = UgcRatingDelegateImpl.disable$lambda$5(view, motionEvent);
                return disable$lambda$5;
            }
        });
        ratingView.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disable$lambda$5(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void enable(RatingView ratingView) {
        if (ratingView == null) {
            return;
        }
        ratingView.setOnTouchListener(null);
        ratingView.setClickable(true);
    }

    private final Function1<Integer, Unit> getCurrentRatingClickCallback() {
        return (Function1) this.currentRatingClickCallback.getValue();
    }

    private final UgcRatingDelegatePageViewModel getPageViewModel() {
        return (UgcRatingDelegatePageViewModel) this.pageViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRatingState(UiRatingState uiRatingState) {
        RatingDTO rating;
        RatingView ratingView;
        if (uiRatingState instanceof UiRatingState.PendingState) {
            RatingView ratingView2 = this.currentRatingView;
            if (ratingView2 != null) {
                ratingView2.setTotalRating(((UiRatingState.PendingState) uiRatingState).getPendingRatingValue());
            }
            disable(this.currentRatingView);
            return;
        }
        if (uiRatingState instanceof UiRatingState.FailedState) {
            Float previousRating = ((UiRatingState.FailedState) uiRatingState).getPreviousRating();
            if (previousRating != null) {
                float floatValue = previousRating.floatValue();
                RatingView ratingView3 = this.currentRatingView;
                if (ratingView3 != null) {
                    ratingView3.setTotalRating(floatValue);
                }
            }
            enable(this.currentRatingView);
            return;
        }
        if (!(uiRatingState instanceof UiRatingState.UpdatedState)) {
            throw new o();
        }
        UgcRatingMolecule updatedMolecule = ((UiRatingState.UpdatedState) uiRatingState).getUpdatedMolecule();
        if (updatedMolecule != null && (rating = updatedMolecule.getRating()) != null && (ratingView = this.currentRatingView) != null) {
            DsRatingHolderKt.bind$default(ratingView, rating, null, 2, null);
        }
        enable(this.currentRatingView);
    }

    private final void observeUiRatingState(String sku) {
        this.currentObserveJob = C2399j.C(new C2408n0(new C2406m0(C5427n.a(delegateViewModel(sku).getUiRatingState(), d.c(this.refs), AbstractC5434v.b.STARTED)), new UgcRatingDelegateImpl$observeUiRatingState$1(this, null)), K.a(this.refs.getContainer().g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g trackView$lambda$2$lambda$1(Map map, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    @Override // ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegate
    public void bindOrGone(long widgetId, @NotNull RatingView ratingView, UgcRatingMolecule ugcRatingMolecule, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(ratingView, "ratingView");
        if (ugcRatingMolecule == null) {
            ViewExtKt.gone(ratingView);
            this.currentRatingView = null;
            this.currentSku = null;
            return;
        }
        ViewExtKt.show(ratingView);
        this.currentSku = ugcRatingMolecule.getSku();
        UgcRatingDelegateViewModel delegateViewModel = delegateViewModel(ugcRatingMolecule.getSku());
        delegateViewModel.onBindWidgetWithMolecule(widgetId, ugcRatingMolecule);
        delegateViewModel.onBindAction(actionHandler);
        DsRatingHolderKt.bind$default(ratingView, ugcRatingMolecule.getRating(), null, 2, null);
        ratingView.setContentDescription(ugcRatingMolecule.getFormattedLocator());
        enable(ratingView);
    }

    @Override // ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegate
    public void onAttach(RatingView ratingView) {
        String str = this.currentSku;
        if (str == null) {
            return;
        }
        this.currentRatingView = ratingView;
        if (ratingView != null) {
            ratingView.setRatingClickCallback(getCurrentRatingClickCallback());
        }
        RatingView ratingView2 = this.currentRatingView;
        if (ratingView2 != null) {
            enable(ratingView2);
        }
        observeUiRatingState(str);
    }

    @Override // ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegate
    public void onDetach() {
        B0 b02 = this.currentObserveJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.currentObserveJob = null;
        RatingView ratingView = this.currentRatingView;
        if (ratingView != null) {
            ratingView.setRatingClickCallback(null);
        }
        RatingView ratingView2 = this.currentRatingView;
        if (ratingView2 != null) {
            ratingView2.setOnTouchListener(null);
        }
        this.currentRatingView = null;
        this.delegateViewModel = null;
    }

    @Override // ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegate
    public void trackView() {
        TrackViewInfo trackViewInfo;
        RatingDTO ratingDTO;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Float total;
        String str = this.currentSku;
        if (str == null || (trackViewInfo = delegateViewModel(str).getTrackViewInfo()) == null || (common = (ratingDTO = trackViewInfo.getRatingDTO()).getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null || (total = ratingDTO.getTotal()) == null) {
            return;
        }
        final Map i11 = U.i(new Pair(trackViewInfo.getReviewScoreKey(), Integer.valueOf((int) total.floatValue())));
        m.c(this.refs.getTokenizedAnalytics(), TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, trackViewInfo.getWidgetId(), null, 2, null), new e() { // from class: fX.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g trackView$lambda$2$lambda$1;
                trackView$lambda$2$lambda$1 = UgcRatingDelegateImpl.trackView$lambda$2$lambda$1(i11, (UZ.d) aVar, gVar);
                return trackView$lambda$2$lambda$1;
            }
        });
    }
}
