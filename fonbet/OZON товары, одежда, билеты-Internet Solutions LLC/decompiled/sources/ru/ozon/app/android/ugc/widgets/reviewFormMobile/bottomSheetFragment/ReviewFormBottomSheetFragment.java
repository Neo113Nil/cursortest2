package ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment;

import A00.a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Hj.C3143a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.w;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.a;
import hd.C6915b;
import i10.C6997c;
import i10.k;
import j10.InterfaceC7238a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.ranges.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$style;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaUpdateKey;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import uZ.C9992d;
import xe.C10727i;

@Metadata(d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\r*\u0001p\b\u0001\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J)\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b)\u0010\u001fJ\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010\u0004J\u001d\u0010/\u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b1\u0010\u0014J\u001f\u00106\u001a\u00020\u000f2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u000f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020408H\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020408H\u0002¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u000fH\u0002¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u000fH\u0002¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010?\u001a\u00020\u000fH\u0002¢\u0006\u0004\b?\u0010\u0004J\u001f\u0010C\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\r2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020AH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020AH\u0002¢\u0006\u0004\bI\u0010GJ\u000f\u0010J\u001a\u00020\u000fH\u0002¢\u0006\u0004\bJ\u0010\u0004J\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u0005H\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010N\u001a\u00020\u000f*\u000204H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000fH\u0002¢\u0006\u0004\bP\u0010\u0004J\u0015\u0010Q\u001a\u0004\u0018\u000104*\u000202H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020#H\u0002¢\u0006\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010[R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010nR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u0004\u0018\u0001028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0016\u00105\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001c\u0010z\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006|"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormBottomSheetFragment;", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "<init>", "()V", "", "getTheme", "()I", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/appcompat/app/w;", "onCreateDialog", "(Landroid/os/Bundle;)Landroidx/appcompat/app/w;", "Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "Ll10/i;", "composerContainer", "onComposerCreated", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerFragmentController;Ll10/i;)V", "observeComposerItems", "(Lru/ozon/app/android/composer/ComposerFragmentController;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lru/ozon/composer/ui/widget/l;", "items", "", "filterHidableIfNeeded", "(Ljava/util/List;)Z", "visible", "setHidableVisible", "(Z)V", "observeComposerEvents", "LA00/a$J;", "event", "handleMediaPickerVisibility", "(LA00/a$J;Lru/ozon/app/android/composer/ComposerFragmentController;)V", "revealSheetIfReady", "updateItems", "(Ljava/util/List;)V", "setupBottomSheet", "Lcom/google/android/material/bottomsheet/a;", "dialog", "Landroid/widget/FrameLayout;", "bottomSheet", "configureDialogWindow", "(Lcom/google/android/material/bottomsheet/a;Landroid/widget/FrameLayout;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "configureBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "trackDynamicHeightChanges", "onFullScreen", "onCollapsed", "syncPeekHeightIfConsistent", "sheet", "", "fraction", "onSheetSlide", "(Landroid/view/View;F)V", "progress", "applySheetProgress", "(F)V", "radius", "updateClipRadius", "clearRootBackground", "offsetPx", "setContentTopOffset", "(I)V", "clipTopCorners", "(Landroid/widget/FrameLayout;)V", "keyboardGlobalListener", "findBottomSheet", "(Lcom/google/android/material/bottomsheet/a;)Landroid/widget/FrameLayout;", "isGlobalKeyboardListenerRequired", "()Z", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormModalViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormModalViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerFragmentController;", "Ll10/i;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/StatusBarBackgroundController;", "statusBarController", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/StatusBarBackgroundController;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/SheetHeightController;", "heightController", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/SheetHeightController;", "clipRadius", "F", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "keyboardWatcher", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "currentImeHeight", "I", "isUserDragging", "Z", "pendingCollapsedSync", "ru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormBottomSheetFragment$bottomSheetCallback$1", "bottomSheetCallback", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormBottomSheetFragment$bottomSheetCallback$1;", "getBottomSheetDialog", "()Lcom/google/android/material/bottomsheet/a;", "bottomSheetDialog", "getBottomSheet", "()Landroid/widget/FrameLayout;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sheetBehavior", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"LifecycleMethodsOrder"})
/* loaded from: classes2.dex */
public final class ReviewFormBottomSheetFragment extends BottomSheetComposerFragment implements ComposerFragment.Host {
    private static final float CORNER_RADIUS_COLLAPSED;
    private static final int TOP_TRANSITION_ZONE;

    @NotNull
    private final ReviewFormBottomSheetFragment$bottomSheetCallback$1 bottomSheetCallback;
    private float clipRadius;
    private ComposerFragmentController composer;
    private i composerContainer;
    private RecyclerView composerRecycler;
    private int currentImeHeight;
    private SheetHeightController heightController;
    private boolean isUserDragging;
    private ViewTreeObserver.OnGlobalLayoutListener keyboardWatcher;
    private boolean pendingCollapsedSync;
    private StatusBarBackgroundController statusBarController;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_CONFIG", "", "NAVIGATION_MODE_CONFIG", "STATE_PEEK_HEIGHT", "TOP_TRANSITION_ZONE", "", "CORNER_RADIUS_COLLAPSED", "", "newInstance", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormBottomSheetFragment;", "config", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReviewFormBottomSheetFragment newInstance(@NotNull ComposerScreenConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            ReviewFormBottomSheetFragment reviewFormBottomSheetFragment = new ReviewFormBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_CONFIG", config);
            bundle.putParcelable("NAVIGATION_MODE_CONFIG", C9992d.b.c.f100438a);
            reviewFormBottomSheetFragment.setArguments(bundle);
            return reviewFormBottomSheetFragment;
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        TOP_TRANSITION_ZONE = dimens.getDP_48();
        CORNER_RADIUS_COLLAPSED = dimens.getDPF_24();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$bottomSheetCallback$1] */
    public ReviewFormBottomSheetFragment() {
        InterfaceC4008j a11 = k.a(n.NONE, new ReviewFormBottomSheetFragment$special$$inlined$viewModels$default$2(new ReviewFormBottomSheetFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(ReviewFormModalViewModel.class), new ReviewFormBottomSheetFragment$special$$inlined$viewModels$default$3(a11), new ReviewFormBottomSheetFragment$special$$inlined$viewModels$default$4(null, a11), new ReviewFormBottomSheetFragment$special$$inlined$viewModels$default$5(this, a11));
        this.clipRadius = CORNER_RADIUS_COLLAPSED;
        this.bottomSheetCallback = new BottomSheetBehavior.f() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$bottomSheetCallback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View view, float slideOffset) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (Float.isNaN(slideOffset)) {
                    return;
                }
                ReviewFormBottomSheetFragment.this.onSheetSlide(view, h.d(slideOffset, 0.0f, 1.0f));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View view, int newState) {
                ReviewFormModalViewModel viewModel;
                Intrinsics.checkNotNullParameter(view, "view");
                if (newState == 1) {
                    ReviewFormBottomSheetFragment.this.isUserDragging = true;
                    return;
                }
                if (newState != 3 && newState != 4) {
                    if (newState != 5) {
                        return;
                    }
                    ReviewFormBottomSheetFragment.this.isUserDragging = false;
                    return;
                }
                boolean z11 = newState == 3;
                viewModel = ReviewFormBottomSheetFragment.this.getViewModel();
                viewModel.setExpanded(z11);
                ReviewFormBottomSheetFragment.this.isUserDragging = false;
                if (z11) {
                    ReviewFormBottomSheetFragment.this.onFullScreen();
                } else {
                    ReviewFormBottomSheetFragment.this.onCollapsed();
                }
            }
        };
    }

    private final void applySheetProgress(float progress) {
        float f7 = 1.0f - progress;
        updateClipRadius(CORNER_RADIUS_COLLAPSED * f7);
        setContentTopOffset(C6915b.c(Dimens.INSTANCE.getDP_10() * f7));
        StatusBarBackgroundController statusBarBackgroundController = this.statusBarController;
        if (statusBarBackgroundController != null) {
            statusBarBackgroundController.setProgress(progress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearRootBackground() {
        CoordinatorLayout composerCoordinatorLayout;
        requireView().setBackground(null);
        View view = getView();
        if (view == null || (composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(view)) == null) {
            return;
        }
        composerCoordinatorLayout.setBackground(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clipTopCorners(FrameLayout frameLayout) {
        frameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$clipTopCorners$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                float f11;
                int f12 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = ReviewFormBottomSheetFragment.this.clipRadius;
                f11 = ReviewFormBottomSheetFragment.this.clipRadius;
                outline.setRoundRect(0, 0, f12, height + ((int) f7), f11);
            }
        });
        frameLayout.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureBehavior(BottomSheetBehavior<FrameLayout> behavior) {
        behavior.setFitToContents(true);
        behavior.setHideable(true);
        behavior.setSkipCollapsed(false);
        behavior.addBottomSheetCallback(this.bottomSheetCallback);
        int i11 = getViewModel().getIsExpanded() ? 3 : 4;
        if (behavior.getState() != i11) {
            behavior.setState(i11);
        }
        if (behavior.getState() == 3) {
            onFullScreen();
        }
    }

    private final void configureDialogWindow(a dialog, FrameLayout bottomSheet) {
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(R.id.coordinator);
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(0);
        }
        Y.J(bottomSheet, new com.google.android.gms.internal.mlkit_common.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 configureDialogWindow$lambda$9(View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        view.setPadding(0, 0, 0, 0);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean filterHidableIfNeeded(List<l> items) {
        if (getViewModel().getIsFiltered()) {
            return false;
        }
        boolean filterItems = getViewModel().filterItems(items);
        if (filterItems) {
            updateItems(getViewModel().getDisplayedItems());
        }
        return filterItems;
    }

    private final FrameLayout findBottomSheet(a aVar) {
        return (FrameLayout) aVar.findViewById(R.id.design_bottom_sheet);
    }

    private final FrameLayout getBottomSheet() {
        a bottomSheetDialog = getBottomSheetDialog();
        if (bottomSheetDialog != null) {
            return findBottomSheet(bottomSheetDialog);
        }
        return null;
    }

    private final a getBottomSheetDialog() {
        Dialog dialog = getDialog();
        if (dialog instanceof a) {
            return (a) dialog;
        }
        return null;
    }

    private final BottomSheetBehavior<FrameLayout> getSheetBehavior() {
        FrameLayout bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return BottomSheetBehavior.from(bottomSheet);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewFormModalViewModel getViewModel() {
        return (ReviewFormModalViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPickerVisibility(a.J event, ComposerFragmentController composer) {
        boolean isVisible;
        a.J.InterfaceC0007a d11 = event.d();
        MediaPickerVisibilityStateKey mediaPickerVisibilityStateKey = d11 instanceof MediaPickerVisibilityStateKey ? (MediaPickerVisibilityStateKey) d11 : null;
        if (mediaPickerVisibilityStateKey == null || (isVisible = mediaPickerVisibilityStateKey.getIsVisible()) == getViewModel().getIsMediaPickerVisible()) {
            return;
        }
        getViewModel().setMediaPickerVisible(isVisible);
        if (getViewModel().getOriginalItems().isEmpty()) {
            return;
        }
        ReviewFormModalViewModel viewModel = getViewModel();
        k.a<l> e11 = composer.getComposerStore().b().e();
        List<l> a11 = e11 != null ? e11.a() : null;
        if (a11 == null) {
            a11 = K.f71697a;
        }
        viewModel.updateItems(a11);
        updateItems(getViewModel().getDisplayedItems());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isGlobalKeyboardListenerRequired() {
        return Build.VERSION.SDK_INT < 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void keyboardGlobalListener() {
        Window window;
        final View decorView;
        final View findViewById;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null || (findViewById = decorView.findViewById(android.R.id.content)) == null) {
            return;
        }
        final Rect rect = new Rect();
        this.keyboardWatcher = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qW.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ReviewFormBottomSheetFragment.keyboardGlobalListener$lambda$17(decorView, rect, findViewById, this);
            }
        };
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.keyboardWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keyboardGlobalListener$lambda$17(View view, Rect rect, View view2, ReviewFormBottomSheetFragment reviewFormBottomSheetFragment) {
        view.getWindowVisibleDisplayFrame(rect);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        int stableInsetBottom = rootWindowInsets != null ? rootWindowInsets.getStableInsetBottom() : 0;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int height = ((view2.getHeight() + iArr[1]) - rect.bottom) - stableInsetBottom;
        if (height < 0) {
            height = 0;
        }
        int i11 = ((float) height) > ((float) view.getHeight()) * 0.1f ? height : 0;
        if (i11 != reviewFormBottomSheetFragment.currentImeHeight) {
            reviewFormBottomSheetFragment.currentImeHeight = i11;
            i iVar = reviewFormBottomSheetFragment.composerContainer;
            if (iVar != null) {
                iVar.j0(i11);
            }
            reviewFormBottomSheetFragment.syncPeekHeightIfConsistent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeComposerEvents(final ComposerFragmentController composerFragmentController, d<? super Unit> dVar) {
        revealSheetIfReady();
        Object collect = composerFragmentController.getComposerStore().getEvents().collect(new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerEvents$2
            @Override // Ae.InterfaceC2397i
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar2) {
                return emit((A00.a) obj, (d<? super Unit>) dVar2);
            }

            public final Object emit(A00.a aVar, d<? super Unit> dVar2) {
                ReviewFormModalViewModel viewModel;
                boolean z11;
                final View view;
                if (aVar instanceof a.C2372m) {
                    ReviewFormBottomSheetFragment.this.revealSheetIfReady();
                    z11 = ReviewFormBottomSheetFragment.this.pendingCollapsedSync;
                    if (z11 && (view = ReviewFormBottomSheetFragment.this.getView()) != null) {
                        final ReviewFormBottomSheetFragment reviewFormBottomSheetFragment = ReviewFormBottomSheetFragment.this;
                        G.a(view, new Runnable() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerEvents$2$emit$$inlined$doOnPreDraw$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                reviewFormBottomSheetFragment.syncPeekHeightIfConsistent();
                            }
                        });
                    }
                } else if (aVar instanceof a.J) {
                    a.J j11 = (a.J) aVar;
                    a.J.InterfaceC0007a d11 = j11.d();
                    if (d11 instanceof MediaPickerVisibilityStateKey) {
                        ReviewFormBottomSheetFragment.this.handleMediaPickerVisibility(j11, composerFragmentController);
                    } else if (d11 instanceof MediaUpdateKey) {
                        viewModel = ReviewFormBottomSheetFragment.this.getViewModel();
                        a.J.InterfaceC0007a d12 = j11.d();
                        Intrinsics.g(d12, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaUpdateKey");
                        viewModel.syncMediaPickerItems(((MediaUpdateKey) d12).getMedia());
                    }
                }
                return Unit.f71690a;
            }
        }, dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeComposerItems(ComposerFragmentController composerFragmentController, d<? super Unit> dVar) {
        final InterfaceC2395h<C6997c<l>> state = composerFragmentController.getComposerStore().getState();
        final InterfaceC2395h<List<? extends l>> interfaceC2395h = new InterfaceC2395h<List<? extends l>>() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$mapNotNull$1$2", f = "ReviewFormBottomSheetFragment.kt", l = {52}, m = "emit")
                /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                k.a e11 = ((C6997c) obj).e();
                                List a11 = e11 != null ? e11.a() : null;
                                if (a11 != null) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(a11, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super List<? extends l>> interfaceC2397i, d dVar2) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar2);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
        Object collect = new InterfaceC2395h<List<? extends l>>() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$filter$1$2", f = "ReviewFormBottomSheetFragment.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (!((List) obj).isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super List<? extends l>> interfaceC2397i, d dVar2) {
                Object collect2 = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar2);
                return collect2 == Wc.a.COROUTINE_SUSPENDED ? collect2 : Unit.f71690a;
            }
        }.collect(new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$observeComposerItems$4
            @Override // Ae.InterfaceC2397i
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar2) {
                return emit((List<l>) obj, (d<? super Unit>) dVar2);
            }

            public final Object emit(List<l> list, d<? super Unit> dVar2) {
                boolean filterHidableIfNeeded;
                ReviewFormModalViewModel viewModel;
                filterHidableIfNeeded = ReviewFormBottomSheetFragment.this.filterHidableIfNeeded(list);
                if (!filterHidableIfNeeded) {
                    ReviewFormBottomSheetFragment reviewFormBottomSheetFragment = ReviewFormBottomSheetFragment.this;
                    viewModel = reviewFormBottomSheetFragment.getViewModel();
                    reviewFormBottomSheetFragment.setHidableVisible(viewModel.getIsExpanded());
                }
                return Unit.f71690a;
            }
        }, dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCollapsed() {
        applySheetProgress(0.0f);
        StatusBarBackgroundController statusBarBackgroundController = this.statusBarController;
        if (statusBarBackgroundController != null) {
            statusBarBackgroundController.setActive(false);
        }
        setHidableVisible(false);
        syncPeekHeightIfConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFullScreen() {
        int i11;
        applySheetProgress(1.0f);
        StatusBarBackgroundController statusBarBackgroundController = this.statusBarController;
        if (statusBarBackgroundController != null) {
            statusBarBackgroundController.setActive(true);
        }
        setHidableVisible(true);
        SheetHeightController sheetHeightController = this.heightController;
        if (sheetHeightController != null) {
            FrameLayout bottomSheet = getBottomSheet();
            if (bottomSheet != null) {
                Integer valueOf = Integer.valueOf(bottomSheet.getHeight());
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i11 = valueOf.intValue();
                    sheetHeightController.setCoordinatorHeight(i11);
                }
            }
            i11 = -1;
            sheetHeightController.setCoordinatorHeight(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSheetSlide(View sheet, float fraction) {
        float top = sheet.getTop();
        int i11 = TOP_TRANSITION_ZONE;
        applySheetProgress(h.d(1.0f - (top / i11), 0.0f, 1.0f));
        if (this.isUserDragging) {
            boolean isExpanded = sheet.getTop() <= i11 ? true : sheet.getTop() >= i11 * 2 ? false : getViewModel().getIsExpanded();
            getViewModel().setExpanded(isExpanded);
            setHidableVisible(isExpanded);
            StatusBarBackgroundController statusBarBackgroundController = this.statusBarController;
            if (statusBarBackgroundController != null) {
                statusBarBackgroundController.setActive(isExpanded);
            }
        }
        FrameLayout bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            Integer valueOf = Integer.valueOf(bottomSheet.getHeight());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                SheetHeightController sheetHeightController = this.heightController;
                if (sheetHeightController != null) {
                    sheetHeightController.applySlideHeight(fraction, intValue);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (getViewModel().isExpanded() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void revealSheetIfReady() {
        BottomSheetBehavior<FrameLayout> sheetBehavior;
        Integer num;
        SheetHeightController sheetHeightController = this.heightController;
        if (sheetHeightController == null || !sheetHeightController.isAwaitingReveal() || (sheetBehavior = getSheetBehavior()) == null) {
            return;
        }
        ReviewFormModalViewModel viewModel = getViewModel();
        List<l> originalItems = viewModel.getIsExpanded() ? viewModel.getOriginalItems() : viewModel.getDisplayedItems();
        if (originalItems.isEmpty()) {
            return;
        }
        if (getViewModel().getIsExpanded() || sheetHeightController.committedItemCount() == originalItems.size()) {
            RecyclerView recyclerView = this.composerRecycler;
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
            FrameLayout bottomSheet = getBottomSheet();
            if (bottomSheet != null) {
                num = Integer.valueOf(bottomSheet.getHeight());
                if (num.intValue() > 0) {
                }
            }
            num = null;
            sheetHeightController.revealSheet(sheetBehavior, num, getViewModel().getHasRevealed(), new ReviewFormBottomSheetFragment$revealSheetIfReady$2(this), new ReviewFormBottomSheetFragment$revealSheetIfReady$3(this));
        }
    }

    private final void setContentTopOffset(int offsetPx) {
        LinearLayout composerTopContainer;
        View view = getView();
        if (view == null || (composerTopContainer = ComposerViewExtensionKt.composerTopContainer(view)) == null) {
            return;
        }
        ViewExtKt.updatePadding$default(composerTopContainer, 0, offsetPx, 0, 0, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHidableVisible(boolean visible) {
        ComposerFragmentController composerFragmentController = this.composer;
        if (composerFragmentController == null || !getViewModel().getHasHidable() || getViewModel().getOriginalItems().isEmpty() || getViewModel().getAreHidableVisible() == visible) {
            return;
        }
        ReviewFormModalViewModel viewModel = getViewModel();
        k.a<l> e11 = composerFragmentController.getComposerStore().b().e();
        List<l> a11 = e11 != null ? e11.a() : null;
        if (a11 == null) {
            a11 = K.f71697a;
        }
        viewModel.updateItems(a11);
        getViewModel().setHidableVisible(visible);
        updateItems(getViewModel().getDisplayedItems());
        composerFragmentController.getController().update(new ReviewFormModalStateKey(visible));
    }

    private final void setupBottomSheet(Bundle savedInstanceState) {
        final FrameLayout bottomSheet;
        final com.google.android.material.bottomsheet.a bottomSheetDialog = getBottomSheetDialog();
        if (bottomSheetDialog == null || (bottomSheet = getBottomSheet()) == null) {
            return;
        }
        final BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(bottomSheet);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        configureDialogWindow(bottomSheetDialog, bottomSheet);
        View requireView = requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        SheetHeightController sheetHeightController = new SheetHeightController(requireView, requireContext().getResources().getDisplayMetrics().heightPixels, savedInstanceState != null ? savedInstanceState.getInt("STATE_PEEK_HEIGHT", 0) : 0);
        this.heightController = sheetHeightController;
        bottomSheet.getLayoutParams().height = -1;
        requireView().getLayoutParams().height = -1;
        sheetHeightController.setCoordinatorHeight(sheetHeightController.getPeekContentHeight());
        from.setPeekHeight(sheetHeightController.getPeekContentHeight());
        if (!bottomSheet.isLaidOut() || bottomSheet.isLayoutRequested()) {
            bottomSheet.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$setupBottomSheet$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ReviewFormBottomSheetFragment.this.clearRootBackground();
                    ReviewFormBottomSheetFragment.this.clipTopCorners(bottomSheet);
                    Window window = bottomSheetDialog.getWindow();
                    if (window != null) {
                        ReviewFormBottomSheetFragment reviewFormBottomSheetFragment = ReviewFormBottomSheetFragment.this;
                        Context requireContext = reviewFormBottomSheetFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        reviewFormBottomSheetFragment.statusBarController = new StatusBarBackgroundController(window, requireContext);
                        StatusBarBackgroundController statusBarBackgroundController = ReviewFormBottomSheetFragment.this.statusBarController;
                        if (statusBarBackgroundController != null) {
                            statusBarBackgroundController.attach();
                        }
                    }
                    ReviewFormBottomSheetFragment.this.configureBehavior(from);
                    if (ReviewFormBottomSheetFragment.this.isGlobalKeyboardListenerRequired()) {
                        ReviewFormBottomSheetFragment.this.keyboardGlobalListener();
                    }
                }
            });
        } else {
            clearRootBackground();
            clipTopCorners(bottomSheet);
            Window window = bottomSheetDialog.getWindow();
            if (window != null) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                this.statusBarController = new StatusBarBackgroundController(window, requireContext);
                StatusBarBackgroundController statusBarBackgroundController = this.statusBarController;
                if (statusBarBackgroundController != null) {
                    statusBarBackgroundController.attach();
                }
            }
            configureBehavior(from);
            if (isGlobalKeyboardListenerRequired()) {
                keyboardGlobalListener();
            }
        }
        trackDynamicHeightChanges(from);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncPeekHeightIfConsistent() {
        BottomSheetBehavior<FrameLayout> sheetBehavior;
        SheetHeightController sheetHeightController = this.heightController;
        if (sheetHeightController == null || (sheetBehavior = getSheetBehavior()) == null || sheetBehavior.getState() != 4) {
            return;
        }
        if (sheetHeightController.committedItemCount() != getViewModel().getDisplayedItems().size()) {
            this.pendingCollapsedSync = true;
        } else {
            this.pendingCollapsedSync = false;
            sheetHeightController.syncPeekHeight(sheetBehavior);
        }
    }

    private final void trackDynamicHeightChanges(final BottomSheetBehavior<FrameLayout> behavior) {
        requireView().addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: qW.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewFormBottomSheetFragment f81777b;

            {
                this.f81777b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                ReviewFormBottomSheetFragment.trackDynamicHeightChanges$lambda$13(behavior, this.f81777b, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackDynamicHeightChanges$lambda$13(BottomSheetBehavior bottomSheetBehavior, ReviewFormBottomSheetFragment reviewFormBottomSheetFragment, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int state = bottomSheetBehavior.getState();
        if (state != 3) {
            if (state != 4) {
                return;
            }
            reviewFormBottomSheetFragment.syncPeekHeightIfConsistent();
            return;
        }
        FrameLayout bottomSheet = reviewFormBottomSheetFragment.getBottomSheet();
        if (bottomSheet != null) {
            Integer valueOf = Integer.valueOf(bottomSheet.getHeight());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                SheetHeightController sheetHeightController = reviewFormBottomSheetFragment.heightController;
                if (sheetHeightController != null) {
                    sheetHeightController.setCoordinatorHeight(intValue);
                }
            }
        }
    }

    private final void updateClipRadius(float radius) {
        this.clipRadius = radius;
        FrameLayout bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            bottomSheet.invalidateOutline();
        }
    }

    private final void updateItems(List<l> items) {
        InterfaceC7238a<l> composerStore;
        ComposerFragmentController composerFragmentController = this.composer;
        if (composerFragmentController == null || (composerStore = composerFragmentController.getComposerStore()) == null) {
            return;
        }
        composerStore.c(new a.K(items));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.Theme_ReviewFormBottomSheetDialog;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    @InterfaceC3999a
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull ComposerFragmentController composerFragmentController) {
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, componentCallbacksC5392m, composerFragmentController);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.keyboardWatcher);
        }
        this.keyboardWatcher = null;
        this.currentImeHeight = 0;
        BottomSheetBehavior<FrameLayout> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            sheetBehavior.removeBottomSheetCallback(this.bottomSheetCallback);
        }
        StatusBarBackgroundController statusBarBackgroundController = this.statusBarController;
        if (statusBarBackgroundController != null) {
            statusBarBackgroundController.detach();
        }
        SheetHeightController sheetHeightController = this.heightController;
        if (sheetHeightController != null) {
            sheetHeightController.clear();
        }
        this.statusBarController = null;
        this.heightController = null;
        this.composerContainer = null;
        this.composer = null;
        this.composerRecycler = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        SheetHeightController sheetHeightController = this.heightController;
        if (sheetHeightController != null) {
            Integer valueOf = Integer.valueOf(sheetHeightController.getPeekContentHeight());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                outState.putInt("STATE_PEEK_HEIGHT", valueOf.intValue());
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupBottomSheet(savedInstanceState);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer, i composerContainer) {
        SheetHeightController sheetHeightController;
        View Y11;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(composer, "composer");
        this.composer = composer;
        this.composerContainer = composerContainer;
        this.composerRecycler = (composerContainer == null || (Y11 = composerContainer.Y()) == null) ? null : ComposerViewExtensionKt.composerRecyclerViewOrNull(Y11);
        if (!getViewModel().getHasRevealed() && (sheetHeightController = this.heightController) != null) {
            sheetHeightController.hideContentViews();
        }
        setContentTopOffset(Dimens.INSTANCE.getDP_10());
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new ReviewFormBottomSheetFragment$onComposerCreated$1(this, composer, null), 3);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment, com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public w onCreateDialog(Bundle savedInstanceState) {
        return new com.google.android.material.bottomsheet.a(requireContext(), getTheme());
    }
}
