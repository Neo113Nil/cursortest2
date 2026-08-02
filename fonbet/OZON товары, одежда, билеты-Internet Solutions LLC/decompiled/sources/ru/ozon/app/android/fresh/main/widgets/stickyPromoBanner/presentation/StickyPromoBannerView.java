package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation;

import B5.g;
import B5.t;
import B5.u;
import Ck.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation.StickyPromoBannerView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\u001c\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017J\u0006\u0010\u001f\u001a\u00020\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "closeButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "blurredShadow", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/BlurredCircleView;", "shadowView", "Landroid/widget/FrameLayout;", "onFailureListener", "Lkotlin/Function1;", "", "", "onClickCallback", "Lkotlin/Function0;", "setOnClickCallback", "onClick", "setFailureListener", "onFailure", "bind", "data", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerVO;", "clear", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyPromoBannerView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int closeButtonMargin = UiExtKt.toPx(4);

    @NotNull
    private final LottieAnimationView animationView;

    @NotNull
    private final BlurredCircleView blurredShadow;

    @NotNull
    private final IconButtonV3View closeButton;
    private Function0<Unit> onClickCallback;
    private Function1<? super Throwable, Unit> onFailureListener;

    @NotNull
    private final FrameLayout shadowView;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerView$Companion;", "", "<init>", "()V", "MAX_WIDTH_IN_PERCENT", "", "closeButtonMargin", "", "create", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerView;", "context", "Landroid/content/Context;", "parentWidth", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StickyPromoBannerView create(@NotNull Context context, int parentWidth) {
            Intrinsics.checkNotNullParameter(context, "context");
            StickyPromoBannerView stickyPromoBannerView = new StickyPromoBannerView(context, null, 0, 6, null);
            stickyPromoBannerView.setLayoutParams(new ViewGroup.LayoutParams((int) (parentWidth * 0.38f), -2));
            stickyPromoBannerView.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
            return stickyPromoBannerView;
        }

        private Companion() {
        }
    }

    /* synthetic */ StickyPromoBannerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(StickyPromoBannerView stickyPromoBannerView, View view) {
        Function0<Unit> function0 = stickyPromoBannerView.onClickCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(StickyPromoBannerView stickyPromoBannerView, Throwable th2) {
        Function1<? super Throwable, Unit> function1 = stickyPromoBannerView.onFailureListener;
        if (function1 != null) {
            Intrinsics.f(th2);
            function1.invoke(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$10(StickyPromoBannerView stickyPromoBannerView, g gVar) {
        stickyPromoBannerView.setVisibility(0);
        stickyPromoBannerView.animationView.playAnimation();
    }

    public final void bind(@NotNull StickyPromoBannerVO data, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = data.getPosition();
        setLayoutParams(layoutParams2);
        this.animationView.setAnimationFromUrl(data.getAnimationURL(), data.getCacheId());
        this.animationView.addLottieOnCompositionLoadedListener(new u() { // from class: Jw.a
            @Override // B5.u
            public final void a(g gVar) {
                StickyPromoBannerView.bind$lambda$10(StickyPromoBannerView.this, gVar);
            }
        });
        if (data.getCloseIconButton() != null) {
            IconButtonV3HolderKt.bind$default(this.closeButton, data.getCloseIconButton(), null, 2, null);
            IconButtonV3View iconButtonV3View = this.closeButton;
            if (!iconButtonV3View.isLaidOut() || iconButtonV3View.isLayoutRequested()) {
                iconButtonV3View.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation.StickyPromoBannerView$bind$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        FrameLayout frameLayout = StickyPromoBannerView.this.shadowView;
                        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams3.width = StickyPromoBannerView.closeButtonMargin + view.getWidth();
                        layoutParams3.height = StickyPromoBannerView.closeButtonMargin + view.getHeight();
                        frameLayout.setLayoutParams(layoutParams3);
                    }
                });
            } else {
                FrameLayout frameLayout = this.shadowView;
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.width = closeButtonMargin + iconButtonV3View.getWidth();
                layoutParams3.height = closeButtonMargin + iconButtonV3View.getHeight();
                frameLayout.setLayoutParams(layoutParams3);
            }
        }
        this.closeButton.setOnClickListener(new a(onClick, 1));
    }

    public final void clear() {
        this.animationView.cancelAnimation();
    }

    public final void setFailureListener(@NotNull Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.onFailureListener = onFailure;
    }

    public final void setOnClickCallback(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClickCallback = onClick;
    }

    private StickyPromoBannerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -1);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41628e = 0;
        bVar.f41634h = 0;
        lottieAnimationView.setLayoutParams(bVar);
        this.animationView = lottieAnimationView;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41636i = 0;
        bVar2.f41658v = 0;
        int i12 = closeButtonMargin;
        bVar2.setMargins(0, 0, i12, 0);
        iconButtonV3View.setLayoutParams(bVar2);
        this.closeButton = iconButtonV3View;
        BlurredCircleView blurredCircleView = new BlurredCircleView(context, null, 0, 6, null);
        blurredCircleView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        this.blurredShadow = blurredCircleView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41636i = iconButtonV3View.getId();
        bVar3.f41656t = iconButtonV3View.getId();
        bVar3.f41658v = iconButtonV3View.getId();
        bVar3.setMargins(0, i12, 0, 0);
        frameLayout.setLayoutParams(bVar3);
        frameLayout.addView(blurredCircleView);
        this.shadowView = frameLayout;
        addView(lottieAnimationView);
        addView(frameLayout);
        addView(iconButtonV3View);
        setVisibility(4);
        setOnClickListener(new FG.a(this, 3));
        lottieAnimationView.setFailureListener(new t() { // from class: Jw.b
            @Override // B5.t
            public final void onResult(Object obj) {
                StickyPromoBannerView._init_$lambda$8(StickyPromoBannerView.this, (Throwable) obj);
            }
        });
    }
}
