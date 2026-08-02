package ru.ozon.app.android.select.feature.entry.splash.view;

import Sc.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.select.feature.entry.R$color;
import ru.ozon.app.android.select.feature.entry.R$drawable;
import ru.ozon.app.android.select.feature.entry.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0!¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102¨\u00068"}, d2 = {"Lru/ozon/app/android/select/feature/entry/splash/view/SelectSplashScreenView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/B;", "lifecycleScope", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/B;)V", "", "startAnimation", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/View;", "", "parentWidth", "parentHeight", "topOffset", "layoutCenter", "(Landroid/view/View;III)V", "Landroid/view/ViewGroup$LayoutParams;", "getWrapContentLp", "()Landroid/view/ViewGroup$LayoutParams;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lkotlin/Function0;", "onStartNavigate", "onAnimationEnded", "playAnimation", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/B;", "Lxe/B0;", "animateJob", "Lxe/B0;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitleDTO", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/select/feature/entry/splash/view/RadialGradientView;", "gradientSpot", "Lru/ozon/app/android/select/feature/entry/splash/view/RadialGradientView;", "Landroid/widget/ImageView;", "mainLogo", "Landroid/widget/ImageView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ivSubtitleIcon", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ivBrandIcon", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CustomSplashScreen", "ViewConstructor"})
/* loaded from: classes13.dex */
public final class SelectSplashScreenView extends FrameLayout {
    private B0 animateJob;

    @NotNull
    private final RadialGradientView gradientSpot;

    @NotNull
    private final ImageView ivBrandIcon;

    @NotNull
    private final TextAtomV2View ivSubtitleIcon;

    @NotNull
    private final B lifecycleScope;

    @NotNull
    private final ImageView mainLogo;

    @NotNull
    private final TextDTO subtitleDTO;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int BRANDING_IMAGE_MARGIN = UiExtKt.toPx(60);
    private static final int SUBTITLE_TOP_MARGIN = UiExtKt.toPx(30);
    private static final int LOGO_HORIZONTAL_EXTRA_SPACE = UiExtKt.toPx(6);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lru/ozon/app/android/select/feature/entry/splash/view/SelectSplashScreenView$Companion;", "", "<init>", "()V", "", "BRANDING_IMAGE_ANIM_DURATION", "J", "BRANDING_IMAGE_ANIM_DELAY", "SUBTITLE_ANIM_DURATION", "SUBTITLE_ANIM_DELAY", "AFTER_ANIM_DELAY", "NAVIGATION_DELAY", "ALPHA_HIDE_DURATION", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSplashScreenView(@NotNull Context context, @NotNull B lifecycleScope) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.lifecycleScope = lifecycleScope;
        TextDTO textDTO = new TextDTO(OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.select_splash_screen_description)), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_300_X_SMALL.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), null, null, null, null, false, null, null, null, null, 1, 261694, null);
        this.subtitleDTO = textDTO;
        RadialGradientView radialGradientView = new RadialGradientView(context, null, 0, 6, null);
        radialGradientView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(radialGradientView);
        this.gradientSpot = radialGradientView;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(getWrapContentLp());
        imageView.setImageResource(R$drawable.splash_logo_select_fake);
        addView(imageView);
        this.mainLogo = imageView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(getWrapContentLp());
        textAtomV2View.setAlpha(0.0f);
        TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
        addView(textAtomV2View);
        this.ivSubtitleIcon = textAtomV2View;
        ImageView imageView2 = new ImageView(context);
        imageView2.setLayoutParams(getWrapContentLp());
        imageView2.setAlpha(0.0f);
        imageView2.setImageResource(R$drawable.splash_brand_logo_select);
        addView(imageView2);
        this.ivBrandIcon = imageView2;
        setFocusable(true);
        setClickable(true);
        setBackgroundColor(androidx.core.content.a.getColor(context, R$color.select_splash_screen_background));
    }

    private final ViewGroup.LayoutParams getWrapContentLp() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    private final void layoutCenter(View view, int i11, int i12, int i13) {
        LayoutExtKt.layoutLeftTop(view, (i11 / 2) - ((view.getWidth() + 1) / 2), ((i12 / 2) - (view.getHeight() / 2)) + i13);
    }

    static /* synthetic */ void layoutCenter$default(SelectSplashScreenView selectSplashScreenView, View view, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        selectSplashScreenView.layoutCenter(view, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (ru.ozon.app.android.select.feature.entry.splash.view.AnimUtils.startAlphaAnimation$default(r13, 10, 900, null, r7, r8, 4, null) != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startAnimation(d<? super Unit> dVar) {
        SelectSplashScreenView$startAnimation$1 selectSplashScreenView$startAnimation$1;
        int i11;
        SelectSplashScreenView selectSplashScreenView;
        if (dVar instanceof SelectSplashScreenView$startAnimation$1) {
            selectSplashScreenView$startAnimation$1 = (SelectSplashScreenView$startAnimation$1) dVar;
            int i12 = selectSplashScreenView$startAnimation$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                selectSplashScreenView$startAnimation$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                SelectSplashScreenView$startAnimation$1 selectSplashScreenView$startAnimation$12 = selectSplashScreenView$startAnimation$1;
                Object obj = selectSplashScreenView$startAnimation$12.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = selectSplashScreenView$startAnimation$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    AnimUtils animUtils = AnimUtils.INSTANCE;
                    SelectSplashScreenView$startAnimation$2 selectSplashScreenView$startAnimation$2 = new SelectSplashScreenView$startAnimation$2(this);
                    selectSplashScreenView$startAnimation$12.L$0 = this;
                    selectSplashScreenView$startAnimation$12.label = 1;
                    if (AnimUtils.startAlphaAnimation$default(animUtils, 100L, 1500L, null, selectSplashScreenView$startAnimation$2, selectSplashScreenView$startAnimation$12, 4, null) != aVar) {
                        selectSplashScreenView = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                selectSplashScreenView = (SelectSplashScreenView) selectSplashScreenView$startAnimation$12.L$0;
                s.b(obj);
                AnimUtils animUtils2 = AnimUtils.INSTANCE;
                SelectSplashScreenView$startAnimation$3 selectSplashScreenView$startAnimation$3 = new SelectSplashScreenView$startAnimation$3(selectSplashScreenView);
                selectSplashScreenView$startAnimation$12.L$0 = null;
                selectSplashScreenView$startAnimation$12.label = 2;
            }
        }
        selectSplashScreenView$startAnimation$1 = new SelectSplashScreenView$startAnimation$1(this, dVar);
        SelectSplashScreenView$startAnimation$1 selectSplashScreenView$startAnimation$122 = selectSplashScreenView$startAnimation$1;
        Object obj2 = selectSplashScreenView$startAnimation$122.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = selectSplashScreenView$startAnimation$122.label;
        if (i11 != 0) {
        }
        AnimUtils animUtils22 = AnimUtils.INSTANCE;
        SelectSplashScreenView$startAnimation$3 selectSplashScreenView$startAnimation$32 = new SelectSplashScreenView$startAnimation$3(selectSplashScreenView);
        selectSplashScreenView$startAnimation$122.L$0 = null;
        selectSplashScreenView$startAnimation$122.label = 2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        LayoutExtKt.layoutLeftTop(this.gradientSpot, 0, 0);
        layoutCenter$default(this, this.mainLogo, getWidth(), getHeight(), 0, 4, null);
        layoutCenter(this.ivSubtitleIcon, getWidth(), getHeight(), SUBTITLE_TOP_MARGIN);
        LayoutExtKt.layoutLeftTop(this.ivBrandIcon, (getWidth() / 2) - (this.ivBrandIcon.getWidth() / 2), (getHeight() - this.ivBrandIcon.getHeight()) - BRANDING_IMAGE_MARGIN);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.gradientSpot.measure(widthMeasureSpec, heightMeasureSpec);
        MeasureExtKt.measure(this.mainLogo, getMeasuredWidth() + LOGO_HORIZONTAL_EXTRA_SPACE, 0, getMeasuredHeight(), 0);
        MeasureExtKt.measureUnspecified(this.ivSubtitleIcon);
        MeasureExtKt.measureUnspecified(this.ivBrandIcon);
    }

    public final void playAnimation(@NotNull Function0<Unit> onStartNavigate, @NotNull Function0<Unit> onAnimationEnded) {
        Intrinsics.checkNotNullParameter(onStartNavigate, "onStartNavigate");
        Intrinsics.checkNotNullParameter(onAnimationEnded, "onAnimationEnded");
        B0 b02 = this.animateJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.animateJob = C10727i.c(this.lifecycleScope, null, null, new SelectSplashScreenView$playAnimation$1(onStartNavigate, this, onAnimationEnded, null), 3);
    }
}
