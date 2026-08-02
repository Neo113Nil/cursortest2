package ru.ozon.fintech.base.bottom;

import B90.b0;
import C.D;
import E30.h;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.lifecycle.z0;
import g30.InterfaceC6618a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u0002:\u0002\u0094\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0004J\u0019\u0010!\u001a\u00020 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0017¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0004J\u001f\u0010+\u001a\u00020\r2\u0006\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u0011\u00100\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b0\u0010/J\u0011\u00101\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b1\u0010/J\u0011\u00102\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b2\u0010/J\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010\u0004R\"\u00107\u001a\u0002068\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010HR$\u0010&\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010U\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010[\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR$\u0010_\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010%R$\u0010j\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010M\u001a\u0004\bk\u0010O\"\u0004\bl\u0010QR$\u0010m\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010M\u001a\u0004\bn\u0010O\"\u0004\bo\u0010QR$\u0010p\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010M\u001a\u0004\bq\u0010O\"\u0004\br\u0010QR$\u0010s\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010/\"\u0004\bv\u0010wR$\u0010y\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u007f\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010f\u001a\u0005\b\u0080\u0001\u0010h\"\u0005\b\u0081\u0001\u0010%R(\u0010\u0082\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010\n\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010\u0087\u0001\u001a\u00020\u00058\u0016X\u0096D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010E\u001a\u0005\b\u0087\u0001\u0010\u0007R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\u0092\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\n¨\u0006\u0095\u0001"}, d2 = {"Lru/ozon/fintech/base/bottom/m;", "Lru/ozon/fintech/base/bottom/h;", "LE30/h;", "<init>", "()V", "", "isExpanded", "()Z", "", "getTheme", "()I", "Landroid/content/DialogInterface$OnShowListener;", "showListener", "", "setShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "onDestroyView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getLayoutId", "()Ljava/lang/Integer;", "close", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "bottomRvAvailable", "disableDragFor", "(Landroid/view/View;)V", "bottomSheet", "setupFullHeight", "fillBottomView", "newPeekHeight", "isMakeExpanded", "animatePeekHeight", "(IZ)V", "Landroid/widget/LinearLayout;", "provideFragmentBottom", "()Landroid/widget/LinearLayout;", "provideFragmentTop", "provideWindowBottom", "provideWindowTop", "onStart", "onStop", "makeExpanded", "Landroidx/lifecycle/z0$b;", "factory", "Landroidx/lifecycle/z0$b;", "getFactory", "()Landroidx/lifecycle/z0$b;", "setFactory", "(Landroidx/lifecycle/z0$b;)V", "Lg30/a;", "analyticsInteractor", "Lg30/a;", "getAnalyticsInteractor", "()Lg30/a;", "setAnalyticsInteractor", "(Lg30/a;)V", "animatingButtonShow", "Z", "getAnimatingButtonShow", "setAnimatingButtonShow", "(Z)V", "animatingButtonHide", "getAnimatingButtonHide", "setAnimatingButtonHide", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "getBottomSheet", "()Landroid/widget/FrameLayout;", "setBottomSheet", "(Landroid/widget/FrameLayout;)V", "Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour;", "bottomSheetBehavior", "Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour;", "bottomFloating", "Landroid/view/ViewGroup;", "getBottomFloating", "()Landroid/view/ViewGroup;", "setBottomFloating", "(Landroid/view/ViewGroup;)V", "bottomFloatingLL", "getBottomFloatingLL", "setBottomFloatingLL", "Lru/ozon/fintech/base/NoScrollRecycler;", "bottomFloatingRv", "Lru/ozon/fintech/base/NoScrollRecycler;", "getBottomFloatingRv", "()Lru/ozon/fintech/base/NoScrollRecycler;", "setBottomFloatingRv", "(Lru/ozon/fintech/base/NoScrollRecycler;)V", "dragger", "Landroid/view/View;", "getDragger", "()Landroid/view/View;", "setDragger", "mainContainer", "getMainContainer", "setMainContainer", "topContainer", "getTopContainer", "setTopContainer", "bottomContainer", "getBottomContainer", "setBottomContainer", "baseTop", "Landroid/widget/LinearLayout;", "getBaseTop", "setBaseTop", "(Landroid/widget/LinearLayout;)V", "Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour$b;", "bottomSheetCallback", "Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour$b;", "getBottomSheetCallback", "()Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour$b;", "setBottomSheetCallback", "(Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour$b;)V", "focusedView", "getFocusedView", "setFocusedView", "bottomInsets", "I", "getBottomInsets", "setBottomInsets", "(I)V", "isNeedSendOnCreateAnalytic", "onShowListener", "Landroid/content/DialogInterface$OnShowListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "bottomFloatingListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "getFragmentName", "()Ljava/lang/String;", "fragmentName", "getInitPeekHeight", "initPeekHeight", "Companion", "a", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class m extends h implements E30.h {
    private static final long PEEK_HEIGHT_ANIMATION_DURATION = 250;
    public InterfaceC6618a analyticsInteractor;
    private boolean animatingButtonHide;
    private boolean animatingButtonShow;
    private LinearLayout baseTop;
    private FrameLayout bottomContainer;
    private ViewGroup bottomFloating;
    private ViewGroup bottomFloatingLL;
    private NoScrollRecycler bottomFloatingRv;
    private int bottomInsets;
    private FrameLayout bottomSheet;
    private BaseBottomSheetBehaviour<FrameLayout> bottomSheetBehavior;
    private BaseBottomSheetBehaviour.b bottomSheetCallback;
    private View dragger;
    public z0.b factory;
    private View focusedView;
    private FrameLayout mainContainer;
    private DialogInterface.OnShowListener onShowListener;
    private FrameLayout topContainer;
    private final boolean isNeedSendOnCreateAnalytic = true;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener bottomFloatingListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.base.bottom.l
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            m.bottomFloatingListener$lambda$1(m.this);
        }
    };

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseBottomSheetBehaviour f95012a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f95013b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f95014c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f95015d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BaseBottomSheetBehaviour f95016e;

        public b(BaseBottomSheetBehaviour baseBottomSheetBehaviour, boolean z11, boolean z12, m mVar, BaseBottomSheetBehaviour baseBottomSheetBehaviour2) {
            this.f95012a = baseBottomSheetBehaviour;
            this.f95013b = z11;
            this.f95014c = z12;
            this.f95015d = mVar;
            this.f95016e = baseBottomSheetBehaviour2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            this.f95012a.setDraggable(this.f95013b);
            if (this.f95014c) {
                this.f95015d.makeExpanded();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
            this.f95016e.setDraggable(false);
        }
    }

    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            m mVar = m.this;
            FrameLayout mainContainer = mVar.getMainContainer();
            if (mainContainer != null) {
                ViewGroup bottomFloating = mVar.getBottomFloating();
                mainContainer.setPadding(mainContainer.getPaddingLeft(), mainContainer.getPaddingTop(), mainContainer.getPaddingRight(), (bottomFloating != null ? bottomFloating.getMeasuredHeight() : 0) - mVar.getBottomInsets());
            }
        }
    }

    public static final class d extends BaseBottomSheetBehaviour.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f95019b;

        d(g gVar) {
            this.f95019b = gVar;
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void a(View bottomSheet, float f7) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator animate2;
            ViewPropertyAnimator animate3;
            ViewPropertyAnimator alpha2;
            ViewPropertyAnimator animate4;
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            m mVar = m.this;
            if (f7 < -0.6f && !mVar.getAnimatingButtonHide()) {
                mVar.setAnimatingButtonHide(true);
                mVar.setAnimatingButtonShow(false);
                ViewGroup bottomFloating = mVar.getBottomFloating();
                if (bottomFloating != null && (animate4 = bottomFloating.animate()) != null) {
                    animate4.cancel();
                }
                ViewGroup bottomFloating2 = mVar.getBottomFloating();
                if (bottomFloating2 != null && (animate3 = bottomFloating2.animate()) != null && (alpha2 = animate3.alpha(0.0f)) != null) {
                    alpha2.start();
                }
            } else if (f7 > -0.6f && !mVar.getAnimatingButtonShow()) {
                mVar.setAnimatingButtonHide(false);
                mVar.setAnimatingButtonShow(true);
                ViewGroup bottomFloating3 = mVar.getBottomFloating();
                if (bottomFloating3 != null && (animate2 = bottomFloating3.animate()) != null) {
                    animate2.cancel();
                }
                ViewGroup bottomFloating4 = mVar.getBottomFloating();
                if (bottomFloating4 != null && (animate = bottomFloating4.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
                    alpha.start();
                }
            }
            BaseBottomSheetBehaviour.b bottomSheetCallback = mVar.getBottomSheetCallback();
            if (bottomSheetCallback != null) {
                bottomSheetCallback.a(bottomSheet, f7);
            }
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void b(View bottomSheet, int i11) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            switch (i11) {
                case 1:
                    Log.d("Bottom", "STATE_DRAGGING");
                    break;
                case 2:
                    Log.d("Bottom", "STATE_SETTLING");
                    break;
                case 3:
                    Log.d("Bottom", "STATE_EXPANDED");
                    break;
                case 4:
                    Log.d("Bottom", "STATE_COLLAPSED");
                    break;
                case 5:
                    Log.d("Bottom", "STATE_HIDDEN");
                    this.f95019b.dismiss();
                    break;
                case 6:
                    Log.d("Bottom", "STATE_HALF_EXPANDED");
                    break;
            }
            BaseBottomSheetBehaviour.b bottomSheetCallback = m.this.getBottomSheetCallback();
            if (bottomSheetCallback != null) {
                bottomSheetCallback.b(bottomSheet, i11);
            }
        }
    }

    public static /* synthetic */ void animatePeekHeight$default(m mVar, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animatePeekHeight");
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        mVar.animatePeekHeight(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animatePeekHeight$lambda$13$lambda$12$lambda$9(BaseBottomSheetBehaviour baseBottomSheetBehaviour, ValueAnimator valueAnimator) {
        baseBottomSheetBehaviour.setPeekHeight(((Integer) Bi.a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomFloatingListener$lambda$1(m mVar) {
        NoScrollRecycler noScrollRecycler = mVar.bottomFloatingRv;
        if ((noScrollRecycler != null ? noScrollRecycler.getChildCount() : 0) > 0) {
            NoScrollRecycler noScrollRecycler2 = mVar.bottomFloatingRv;
            if (noScrollRecycler2 != null) {
                noScrollRecycler2.setPadding(noScrollRecycler2.getPaddingLeft(), noScrollRecycler2.getPaddingTop(), noScrollRecycler2.getPaddingRight(), mVar.bottomInsets);
            }
            if (mVar.bottomInsets != 0) {
                NoScrollRecycler noScrollRecycler3 = mVar.bottomFloatingRv;
                if (noScrollRecycler3 != null) {
                    noScrollRecycler3.addOnLayoutChangeListener(mVar.new c());
                    return;
                }
                return;
            }
            FrameLayout frameLayout = mVar.mainContainer;
            if (frameLayout != null) {
                ViewGroup viewGroup = mVar.bottomFloating;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), viewGroup != null ? viewGroup.getMeasuredHeight() : 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r3 != 3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean disableDragFor$lambda$8(m mVar, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                }
            }
            BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour = mVar.bottomSheetBehavior;
            if (baseBottomSheetBehaviour != null && !baseBottomSheetBehaviour.f94972u && baseBottomSheetBehaviour != null) {
                baseBottomSheetBehaviour.setHideable(true);
            }
            return false;
        }
        BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour2 = mVar.bottomSheetBehavior;
        if (baseBottomSheetBehaviour2 != null && baseBottomSheetBehaviour2.f94972u && baseBottomSheetBehaviour2 != null) {
            baseBottomSheetBehaviour2.setHideable(false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makeExpanded() {
        BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour = this.bottomSheetBehavior;
        if (baseBottomSheetBehaviour != null) {
            baseBottomSheetBehaviour.f94975x = 3;
            baseBottomSheetBehaviour.setSkipCollapsed(true);
            baseBottomSheetBehaviour.setHideable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$5(m mVar, DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver;
        if (dialogInterface instanceof g) {
            g gVar = (g) dialogInterface;
            mVar.bottomFloating = gVar.f94998c;
            mVar.bottomFloatingLL = gVar.f94999d;
            mVar.bottomFloatingRv = gVar.f95000e;
            mVar.bottomRvAvailable();
            ViewGroup viewGroup = (ViewGroup) gVar.findViewById(R.id.design_bottom_sheet);
            if (viewGroup == null || !(viewGroup instanceof FrameLayout)) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            mVar.bottomSheet = frameLayout;
            frameLayout.setBackgroundResource(android.R.color.transparent);
            BaseBottomSheetBehaviour<FrameLayout> h11 = BaseBottomSheetBehaviour.h(viewGroup);
            mVar.bottomSheetBehavior = h11;
            if (h11 != null) {
                h11.setPeekHeight(mVar.getInitPeekHeight());
            }
            if (mVar.isExpanded()) {
                mVar.makeExpanded();
                BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour = mVar.bottomSheetBehavior;
                if (baseBottomSheetBehaviour != null) {
                    baseBottomSheetBehaviour.setPeekHeight(D.c(1000.0f));
                }
            }
            BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour2 = mVar.bottomSheetBehavior;
            if (baseBottomSheetBehaviour2 != null) {
                baseBottomSheetBehaviour2.j(mVar.new d((g) dialogInterface));
            }
            mVar.fillBottomView();
            ViewGroup viewGroup2 = mVar.bottomFloating;
            if (viewGroup2 != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(mVar.bottomFloatingListener);
            }
            DialogInterface.OnShowListener onShowListener = mVar.onShowListener;
            if (onShowListener != null) {
                onShowListener.onShow(dialogInterface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 onViewCreated$lambda$3(m mVar, View view, C5353y0 c5353y0) {
        androidx.core.graphics.d a11 = Ql.c.a(view, "view", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        androidx.core.graphics.d f7 = c5353y0.f(8);
        Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
        int i11 = f7.f42129d;
        if (i11 == 0) {
            i11 = a11.f42129d;
        }
        mVar.bottomInsets = i11;
        int i12 = a11.f42128c;
        view.setPadding(a11.f42126a, view.getPaddingTop(), i12, i11);
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i13 = marginLayoutParams.topMargin;
            int i14 = a11.f42127b;
            if (i13 != i14) {
                marginLayoutParams.topMargin = i14;
                view.setLayoutParams(layoutParams);
            }
        }
        return c5353y0;
    }

    public final void animatePeekHeight(int newPeekHeight, boolean isMakeExpanded) {
        if (isExpanded()) {
            throw new IllegalStateException("Можно вызывать только, если bottom sheet не раскрыт по умолчанию");
        }
        if (getInitPeekHeight() == -1) {
            throw new IllegalStateException("Можно вызывать только, если bottom sheet имеет заданную начальную высоту (не автовысоту по умолчанию)");
        }
        final BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour = this.bottomSheetBehavior;
        if (baseBottomSheetBehaviour != null) {
            boolean isDraggable = baseBottomSheetBehaviour.isDraggable();
            ValueAnimator ofInt = ValueAnimator.ofInt(getInitPeekHeight(), newPeekHeight);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(PEEK_HEIGHT_ANIMATION_DURATION);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.base.bottom.j
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    m.animatePeekHeight$lambda$13$lambda$12$lambda$9(BaseBottomSheetBehaviour.this, valueAnimator);
                }
            });
            ofInt.addListener(new b(baseBottomSheetBehaviour, isDraggable, isMakeExpanded, this, baseBottomSheetBehaviour));
            ofInt.start();
        }
    }

    public void bottomRvAvailable() {
    }

    public final void close() {
        BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour = this.bottomSheetBehavior;
        if (baseBottomSheetBehaviour == null || !baseBottomSheetBehaviour.f94972u || baseBottomSheetBehaviour == null) {
            return;
        }
        baseBottomSheetBehaviour.setState(5);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void disableDragFor(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnTouchListener(new k(this, 0));
    }

    public void fillBottomView() {
    }

    @NotNull
    public final InterfaceC6618a getAnalyticsInteractor() {
        InterfaceC6618a interfaceC6618a = this.analyticsInteractor;
        if (interfaceC6618a != null) {
            return interfaceC6618a;
        }
        Intrinsics.n("analyticsInteractor");
        throw null;
    }

    public final boolean getAnimatingButtonHide() {
        return this.animatingButtonHide;
    }

    public final boolean getAnimatingButtonShow() {
        return this.animatingButtonShow;
    }

    public final LinearLayout getBaseTop() {
        return this.baseTop;
    }

    public final FrameLayout getBottomContainer() {
        return this.bottomContainer;
    }

    public final ViewGroup getBottomFloating() {
        return this.bottomFloating;
    }

    public final ViewGroup getBottomFloatingLL() {
        return this.bottomFloatingLL;
    }

    public final NoScrollRecycler getBottomFloatingRv() {
        return this.bottomFloatingRv;
    }

    public final int getBottomInsets() {
        return this.bottomInsets;
    }

    public final FrameLayout getBottomSheet() {
        return this.bottomSheet;
    }

    public final BaseBottomSheetBehaviour.b getBottomSheetCallback() {
        return this.bottomSheetCallback;
    }

    public final View getDragger() {
        return this.dragger;
    }

    @NotNull
    public z0.b getFactory() {
        z0.b bVar = this.factory;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("factory");
        throw null;
    }

    public final View getFocusedView() {
        return this.focusedView;
    }

    @NotNull
    public abstract String getFragmentName();

    public int getInitPeekHeight() {
        return -1;
    }

    public Integer getLayoutId() {
        return null;
    }

    public final FrameLayout getMainContainer() {
        return this.mainContainer;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R.style.BottomSheetDialog;
    }

    public final FrameLayout getTopContainer() {
        return this.topContainer;
    }

    public boolean isExpanded() {
        return false;
    }

    /* renamed from: isNeedSendOnCreateAnalytic, reason: from getter */
    public boolean getIsNeedSendOnCreateAnalytic() {
        return this.isNeedSendOnCreateAnalytic;
    }

    @Override // ru.ozon.fintech.base.bottom.h, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getIsNeedSendOnCreateAnalytic()) {
            getAnalyticsInteractor().a2(getFragmentName(), false);
        }
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.g(onCreateDialog, "null cannot be cast to non-null type ru.ozon.fintech.base.bottom.BaseBottomSheetDialog");
        g gVar = (g) onCreateDialog;
        Window window = gVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        gVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ru.ozon.fintech.base.bottom.i
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                m.onCreateDialog$lambda$5(m.this, dialogInterface);
            }
        });
        Window window2 = gVar.getWindow();
        if (window2 != null) {
            Intrinsics.checkNotNullParameter(window2, "<this>");
            window2.setNavigationBarColor(androidx.core.content.a.getColor(window2.getContext(), R.color.oz_semantic_bg_secondary));
            if ((window2.getContext().getResources().getConfiguration().uiMode & 48) == 16) {
                window2.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility() | 8208);
            }
        }
        return gVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.base_bottom_sheet_fragment, container, false);
        this.baseTop = (LinearLayout) inflate.findViewById(R.id.base_bottom_sheet_top);
        this.bottomContainer = (FrameLayout) inflate.findViewById(R.id.base_bottom_sheet_bottom_container);
        this.topContainer = (FrameLayout) inflate.findViewById(R.id.base_bottom_sheet_top_container);
        this.mainContainer = (FrameLayout) inflate.findViewById(R.id.base_bottom_sheet_main_container);
        this.dragger = inflate.findViewById(R.id.base_bottom_sheet_dragger);
        Integer layoutId = getLayoutId();
        if (layoutId != null) {
            View inflate2 = getLayoutInflater().inflate(layoutId.intValue(), container, false);
            FrameLayout frameLayout = this.mainContainer;
            if (frameLayout != null) {
                frameLayout.addView(inflate2);
            }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        ViewGroup viewGroup = this.bottomFloating;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.bottomFloatingListener);
        }
        this.onShowListener = null;
        this.baseTop = null;
        this.bottomContainer = null;
        this.topContainer = null;
        this.mainContainer = null;
        this.dragger = null;
        this.bottomSheetCallback = null;
        this.focusedView = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        View view = this.focusedView;
        if (view != null) {
            view.requestFocus();
        }
        this.focusedView = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        Window window;
        Dialog dialog = getDialog();
        this.focusedView = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getCurrentFocus();
        super.onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Y.J(view, new b0(this, 5));
    }

    @Override // E30.h
    public LinearLayout provideFragmentBottom() {
        Dialog dialog = getDialog();
        return h.a.c(dialog != null ? dialog.getWindow() : null);
    }

    @Override // E30.h
    public LinearLayout provideFragmentTop() {
        Dialog dialog = getDialog();
        return h.a.e(dialog != null ? dialog.getWindow() : null);
    }

    @Override // E30.h
    public LinearLayout provideWindowBottom() {
        Dialog dialog = getDialog();
        return h.a.c(dialog != null ? dialog.getWindow() : null);
    }

    @Override // E30.h
    public LinearLayout provideWindowTop() {
        Dialog dialog = getDialog();
        return h.a.e(dialog != null ? dialog.getWindow() : null);
    }

    public final void setAnalyticsInteractor(@NotNull InterfaceC6618a interfaceC6618a) {
        Intrinsics.checkNotNullParameter(interfaceC6618a, "<set-?>");
        this.analyticsInteractor = interfaceC6618a;
    }

    public final void setAnimatingButtonHide(boolean z11) {
        this.animatingButtonHide = z11;
    }

    public final void setAnimatingButtonShow(boolean z11) {
        this.animatingButtonShow = z11;
    }

    public final void setBaseTop(LinearLayout linearLayout) {
        this.baseTop = linearLayout;
    }

    public final void setBottomContainer(FrameLayout frameLayout) {
        this.bottomContainer = frameLayout;
    }

    public final void setBottomFloating(ViewGroup viewGroup) {
        this.bottomFloating = viewGroup;
    }

    public final void setBottomFloatingLL(ViewGroup viewGroup) {
        this.bottomFloatingLL = viewGroup;
    }

    public final void setBottomFloatingRv(NoScrollRecycler noScrollRecycler) {
        this.bottomFloatingRv = noScrollRecycler;
    }

    public final void setBottomInsets(int i11) {
        this.bottomInsets = i11;
    }

    public final void setBottomSheet(FrameLayout frameLayout) {
        this.bottomSheet = frameLayout;
    }

    public final void setBottomSheetCallback(BaseBottomSheetBehaviour.b bVar) {
        this.bottomSheetCallback = bVar;
    }

    public final void setDragger(View view) {
        this.dragger = view;
    }

    public void setFactory(@NotNull z0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.factory = bVar;
    }

    public final void setFocusedView(View view) {
        this.focusedView = view;
    }

    public final void setMainContainer(FrameLayout frameLayout) {
        this.mainContainer = frameLayout;
    }

    public final void setShowListener(@NotNull DialogInterface.OnShowListener showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.onShowListener = showListener;
    }

    public final void setTopContainer(FrameLayout frameLayout) {
        this.topContainer = frameLayout;
    }

    public final void setupFullHeight(@NotNull View bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        ViewGroup.LayoutParams layoutParams = bottomSheet.getLayoutParams();
        layoutParams.height = -1;
        bottomSheet.setLayoutParams(layoutParams);
    }
}
