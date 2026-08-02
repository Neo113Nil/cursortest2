package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import Wc.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler;
import xe.M;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t*\u0002:=\b\u0001\u0018\u0000 J2\u00020\u0001:\u0001JB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010\u001cJ\u000f\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0018\u00103\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010\u0011\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u00106\"\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006K"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "Lcom/google/android/material/appbar/AppBarLayout;", "view", "Landroid/view/View;", "gradientView", "Landroid/view/ViewGroup;", "stickyContainer", "Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "Lxe/M;", "viewLifecycleScope", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "viewModel", "<init>", "(Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Lxe/M;Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;)V", "", "cornerRadius", "", "background", "", "opacityChangeLevel", "", "isBackgroundVisible", "", "bind", "(ILjava/lang/String;FZ)V", "onDetach", "()V", "newVisibleState", "updateState", "(Z)V", "computeCorners", "makeCorners", "removeCorners", "setToolbarOutlineProvider", "observeStickyContainer", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "Landroid/animation/ValueAnimator;", "currentAnimator", "Landroid/animation/ValueAnimator;", "Lkotlin/Pair;", "currentBackgroundColor", "Lkotlin/Pair;", "currentVisibleState", "Ljava/lang/Boolean;", "valueAnimator", "opacityChangeOffset", "Ljava/lang/Float;", "scrollOffset", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setCornerRadius", "(I)V", "ru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler$scrollOffsetListener$1", "scrollOffsetListener", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler$scrollOffsetListener$1;", "ru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler$scrollTargetViewListener$1", "scrollTargetViewListener", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler$scrollTargetViewListener$1;", "hasSticky", "Z", "Landroid/view/View$OnLayoutChangeListener;", "cornerRadiusListener", "Landroid/view/View$OnLayoutChangeListener;", "getCornerAnimator", "()Landroid/animation/ValueAnimator;", "cornerAnimator", "getReversCornerAnimator", "reversCornerAnimator", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarBackgroundHandler implements NavBarUtils {
    private final RecyclerView composerRv;
    private int cornerRadius;

    @NotNull
    private final View.OnLayoutChangeListener cornerRadiusListener;
    private ValueAnimator currentAnimator;

    @NotNull
    private Pair<String, Integer> currentBackgroundColor;
    private Boolean currentVisibleState;

    @NotNull
    private final View gradientView;
    private boolean hasSticky;
    private Float opacityChangeOffset;
    private int scrollOffset;

    @NotNull
    private final NavBarBackgroundHandler$scrollOffsetListener$1 scrollOffsetListener;

    @NotNull
    private final NavBarBackgroundHandler$scrollTargetViewListener$1 scrollTargetViewListener;
    private final ViewGroup stickyContainer;
    private ValueAnimator valueAnimator;

    @NotNull
    private final AppBarLayout view;

    @NotNull
    private final NavBarViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$1", f = "NavBarBackgroundHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = NavBarBackgroundHandler.this.new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (this.Z$0) {
                RecyclerView recyclerView = NavBarBackgroundHandler.this.composerRv;
                if (recyclerView != null) {
                    recyclerView.addOnScrollListener(NavBarBackgroundHandler.this.scrollOffsetListener);
                }
                RecyclerView recyclerView2 = NavBarBackgroundHandler.this.composerRv;
                if (recyclerView2 != null) {
                    recyclerView2.removeOnScrollListener(NavBarBackgroundHandler.this.scrollTargetViewListener);
                }
            } else {
                RecyclerView recyclerView3 = NavBarBackgroundHandler.this.composerRv;
                if (recyclerView3 != null) {
                    recyclerView3.addOnScrollListener(NavBarBackgroundHandler.this.scrollTargetViewListener);
                }
                RecyclerView recyclerView4 = NavBarBackgroundHandler.this.composerRv;
                if (recyclerView4 != null) {
                    recyclerView4.removeOnScrollListener(NavBarBackgroundHandler.this.scrollOffsetListener);
                }
                NavBarBackgroundHandler.this.scrollOffset = 0;
            }
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler$Companion;", "", "<init>", "()V", "ANIMATION_DURATION_MS", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$scrollOffsetListener$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$scrollTargetViewListener$1] */
    public NavBarBackgroundHandler(@NotNull AppBarLayout view, @NotNull View gradientView, ViewGroup viewGroup, RecyclerView recyclerView, @NotNull M viewLifecycleScope, @NotNull NavBarViewModel viewModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(gradientView, "gradientView");
        Intrinsics.checkNotNullParameter(viewLifecycleScope, "viewLifecycleScope");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.gradientView = gradientView;
        this.stickyContainer = viewGroup;
        this.composerRv = recyclerView;
        this.viewModel = viewModel;
        String navBarBackground = getNavBarBackground();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.currentBackgroundColor = new Pair<>(navBarBackground, Integer.valueOf(getColorIntByToken(context, getNavBarBackground())));
        this.scrollOffset = viewModel.getLastScrollOffset();
        this.cornerRadius = getNavbarBottomCornerRadius();
        this.scrollOffsetListener = new RecyclerView.t() { // from class: ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$scrollOffsetListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                int i11;
                Float f7;
                NavBarViewModel navBarViewModel;
                int i12;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (dy == 0 && recyclerView2.computeVerticalScrollOffset() == 0) {
                    NavBarBackgroundHandler.this.scrollOffset = 0;
                }
                NavBarBackgroundHandler navBarBackgroundHandler = NavBarBackgroundHandler.this;
                i11 = navBarBackgroundHandler.scrollOffset;
                navBarBackgroundHandler.scrollOffset = Math.max(i11 + dy, 0);
                f7 = NavBarBackgroundHandler.this.opacityChangeOffset;
                if (f7 != null) {
                    NavBarBackgroundHandler navBarBackgroundHandler2 = NavBarBackgroundHandler.this;
                    float floatValue = f7.floatValue();
                    navBarViewModel = navBarBackgroundHandler2.viewModel;
                    i12 = navBarBackgroundHandler2.scrollOffset;
                    navBarViewModel.setBackgroundVisibility(((float) i12) > floatValue);
                }
            }
        };
        this.scrollTargetViewListener = new RecyclerView.t() { // from class: ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$scrollTargetViewListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                NavBarViewModel navBarViewModel;
                NavBarViewModel navBarViewModel2;
                NavBarViewModel navBarViewModel3;
                View findViewByPosition;
                NavBarViewModel navBarViewModel4;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                navBarViewModel = NavBarBackgroundHandler.this.viewModel;
                Pair<Integer, Integer> targetScrollViewPos = navBarViewModel.getTargetScrollViewPos();
                if (targetScrollViewPos != null) {
                    NavBarBackgroundHandler navBarBackgroundHandler = NavBarBackgroundHandler.this;
                    RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        if (findFirstVisibleItemPosition <= 1 && recyclerView2.canScrollVertically(-1)) {
                            navBarViewModel4 = navBarBackgroundHandler.viewModel;
                            navBarViewModel4.setScrollOffsetMode(true);
                        } else if (findFirstVisibleItemPosition != targetScrollViewPos.e().intValue()) {
                            navBarViewModel2 = navBarBackgroundHandler.viewModel;
                            navBarViewModel2.setBackgroundVisibility(findFirstVisibleItemPosition > targetScrollViewPos.e().intValue());
                        } else {
                            navBarViewModel3 = navBarBackgroundHandler.viewModel;
                            RecyclerView.o layoutManager2 = recyclerView2.getLayoutManager();
                            navBarViewModel3.setBackgroundVisibility(((layoutManager2 == null || (findViewByPosition = layoutManager2.findViewByPosition(findFirstVisibleItemPosition)) == null) ? 0 : findViewByPosition.getTop()) < targetScrollViewPos.f().intValue());
                        }
                    }
                }
            }
        };
        this.cornerRadiusListener = new View.OnLayoutChangeListener() { // from class: rE.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                NavBarBackgroundHandler.cornerRadiusListener$lambda$6(NavBarBackgroundHandler.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        observeStickyContainer();
        C2399j.C(new C2408n0(viewModel.isScrollOffsetMode(), new AnonymousClass1(null)), viewLifecycleScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_cornerAnimator_$lambda$1$lambda$0(NavBarBackgroundHandler navBarBackgroundHandler, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        navBarBackgroundHandler.setCornerRadius(num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_reversCornerAnimator_$lambda$4$lambda$3(NavBarBackgroundHandler navBarBackgroundHandler, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        navBarBackgroundHandler.setCornerRadius(num != null ? num.intValue() : 0);
    }

    private final void computeCorners() {
        if (this.hasSticky) {
            removeCorners();
        } else {
            makeCorners();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cornerRadiusListener$lambda$6(NavBarBackgroundHandler navBarBackgroundHandler, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z11 = i14 - i12 != 0;
        if (z11 == navBarBackgroundHandler.hasSticky) {
            return;
        }
        navBarBackgroundHandler.hasSticky = z11;
        navBarBackgroundHandler.computeCorners();
    }

    private final ValueAnimator getCornerAnimator() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.cornerRadius, getNavbarBottomCornerRadius());
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new OM.a(this, 1));
        this.currentAnimator = ofInt;
        Intrinsics.checkNotNullExpressionValue(ofInt, "also(...)");
        return ofInt;
    }

    private final ValueAnimator getReversCornerAnimator() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.cornerRadius, 0);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rE.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NavBarBackgroundHandler._get_reversCornerAnimator_$lambda$4$lambda$3(NavBarBackgroundHandler.this, valueAnimator);
            }
        });
        this.currentAnimator = ofInt;
        Intrinsics.checkNotNullExpressionValue(ofInt, "also(...)");
        return ofInt;
    }

    private final void makeCorners() {
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        getCornerAnimator().start();
    }

    private final void observeStickyContainer() {
        ViewGroup viewGroup = this.stickyContainer;
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this.cornerRadiusListener);
        }
    }

    private final void removeCorners() {
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        getReversCornerAnimator().start();
    }

    private final void setCornerRadius(int i11) {
        int i12 = this.cornerRadius;
        this.cornerRadius = i11;
        if (i12 != i11) {
            this.view.invalidateOutline();
        }
    }

    private final void setToolbarOutlineProvider() {
        this.view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$setToolbarOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int i11;
                int i12;
                int width = view != null ? view.getWidth() : 0;
                int height = view != null ? view.getHeight() : 0;
                if (outline != null) {
                    i11 = NavBarBackgroundHandler.this.cornerRadius;
                    int i13 = 0 - i11;
                    i12 = NavBarBackgroundHandler.this.cornerRadius;
                    outline.setRoundRect(0, i13, width, height, i12);
                }
            }
        });
        this.view.setClipToOutline(true);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils
    @NotNull
    public ValueAnimator alphaAnimation(boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> function1) {
        return NavBarUtils.DefaultImpls.alphaAnimation(this, z11, i11, i12, j11, z12, function1);
    }

    public final void bind(int cornerRadius, @NotNull String background, final float opacityChangeLevel, boolean isBackgroundVisible) {
        int intValue;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(background, "background");
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.valueAnimator = null;
        if (this.viewModel.getIsBackgroundVisibilityConstant()) {
            RecyclerView recyclerView2 = this.composerRv;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.scrollTargetViewListener);
            }
            RecyclerView recyclerView3 = this.composerRv;
            if (recyclerView3 != null) {
                recyclerView3.removeOnScrollListener(this.scrollOffsetListener);
            }
        }
        if (this.viewModel.getTargetScrollViewPos() == null && ((recyclerView = this.composerRv) == null || recyclerView.computeVerticalScrollOffset() != 0)) {
            this.viewModel.setBackgroundVisibilityConstantly(isBackgroundVisible);
        }
        if (this.viewModel.getIsBackgroundVisibilityConstant()) {
            this.opacityChangeOffset = null;
        } else {
            final RecyclerView recyclerView4 = this.composerRv;
            if (recyclerView4 != null) {
                recyclerView4.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler$bind$$inlined$afterMeasured$1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        NavBarViewModel navBarViewModel;
                        View findChildViewUnder;
                        NavBarViewModel navBarViewModel2;
                        if (recyclerView4.getMeasuredWidth() <= 0 || recyclerView4.getMeasuredHeight() <= 0) {
                            return;
                        }
                        recyclerView4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        NavBarBackgroundHandler navBarBackgroundHandler = this;
                        Float valueOf = Float.valueOf(navBarBackgroundHandler.composerRv.getHeight() * opacityChangeLevel);
                        float floatValue = valueOf.floatValue();
                        navBarViewModel = this.viewModel;
                        if (navBarViewModel.getTargetScrollViewPos() == null && (findChildViewUnder = this.composerRv.findChildViewUnder(0.0f, floatValue)) != null) {
                            int childAdapterPosition = this.composerRv.getChildAdapterPosition(findChildViewUnder);
                            float bottom = (findChildViewUnder.getBottom() - floatValue) - findChildViewUnder.getHeight();
                            navBarViewModel2 = this.viewModel;
                            navBarViewModel2.setTargetScrollViewPos(new Pair<>(Integer.valueOf(childAdapterPosition), Integer.valueOf((int) bottom)));
                        }
                        navBarBackgroundHandler.opacityChangeOffset = valueOf;
                    }
                });
            }
        }
        if (Intrinsics.d(this.currentBackgroundColor.e(), background)) {
            intValue = this.currentBackgroundColor.f().intValue();
        } else {
            Context context = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            intValue = getColorIntByToken(context, background);
            this.currentBackgroundColor = new Pair<>(background, Integer.valueOf(intValue));
        }
        AppBarLayout appBarLayout = this.view;
        if (isBackgroundVisible) {
            appBarLayout.setBackgroundColor(intValue);
        } else {
            appBarLayout.setBackground(null);
        }
        Drawable background2 = this.gradientView.getBackground();
        GradientDrawable gradientDrawable = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(new int[]{0, intValue, intValue, intValue});
        }
        this.currentVisibleState = Boolean.valueOf(isBackgroundVisible);
        setToolbarOutlineProvider();
        setCornerRadius(cornerRadius);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants
    public long getAnimationDuration() {
        return NavBarUtils.DefaultImpls.getAnimationDuration(this);
    }

    public int getColorIntByToken(@NotNull Context context, @NotNull String str) {
        return NavBarUtils.DefaultImpls.getColorIntByToken(this, context, str);
    }

    public int getMinAlpha() {
        return NavBarUtils.DefaultImpls.getMinAlpha(this);
    }

    @NotNull
    public String getNavBarBackground() {
        return NavBarUtils.DefaultImpls.getNavBarBackground(this);
    }

    public int getNavbarBottomCornerRadius() {
        return NavBarUtils.DefaultImpls.getNavbarBottomCornerRadius(this);
    }

    public final void onDetach() {
        this.viewModel.setLastScrollOffset(this.scrollOffset);
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.valueAnimator = null;
        RecyclerView recyclerView = this.composerRv;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.scrollOffsetListener);
        }
        RecyclerView recyclerView2 = this.composerRv;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.scrollTargetViewListener);
        }
        ViewGroup viewGroup = this.stickyContainer;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.cornerRadiusListener);
        }
        this.view.setOutlineProvider(null);
    }

    public final void updateState(boolean newVisibleState) {
        if (!Intrinsics.d(this.currentVisibleState, Boolean.valueOf(newVisibleState))) {
            this.currentVisibleState = Boolean.valueOf(newVisibleState);
            ValueAnimator valueAnimator = this.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.valueAnimator = null;
            if (this.view.getBackground() == null) {
                this.view.setBackgroundColor(this.currentBackgroundColor.f().intValue());
            }
            Drawable background = this.view.getBackground();
            if (background != null) {
                ValueAnimator alphaAnimation$default = NavBarUtils.DefaultImpls.alphaAnimation$default(this, newVisibleState, 0, 0, getAnimationDuration(), false, new NavBarBackgroundHandler$updateState$1$1(newVisibleState, this, background), 22, null);
                this.valueAnimator = alphaAnimation$default;
                if (alphaAnimation$default != null) {
                    alphaAnimation$default.start();
                }
            }
        }
    }
}
