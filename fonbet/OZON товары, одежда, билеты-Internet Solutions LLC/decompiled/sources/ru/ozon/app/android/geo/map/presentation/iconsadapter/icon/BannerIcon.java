package ru.ozon.app.android.geo.map.presentation.iconsadapter.icon;

import AE.a;
import Az.ViewOnClickListenerC2453a;
import B90.RunnableC2599a;
import Sc.o;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.geo.R$drawable;
import ru.ozon.app.android.geo.databinding.MapBannerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.BannerIcon;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B;\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\b*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\b*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/iconsadapter/icon/BannerIcon;", "", "Lru/ozon/app/android/geo/databinding/MapBannerBinding;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "", "onAction", "", "onBannerLoaded", "<init>", "(LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "bannerIcon", "", "withAnimation", "fadeIn", "(Landroid/view/View;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;Z)V", "fadeOut", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "icon", "isSelectApp", "bind", "(Lru/ozon/app/android/geo/databinding/MapBannerBinding;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;Z)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "bannerState", "updateState", "(Lru/ozon/app/android/geo/databinding/MapBannerBinding;Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;Z)V", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BannerIcon {

    @NotNull
    private final Function1<AddressEditMapVO.MapIcon.BannerIcon, Unit> onAction;

    @NotNull
    private final Function1<Long, Unit> onBannerLoaded;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressEditMapViewModel.BannerState.values().length];
            try {
                iArr[AddressEditMapViewModel.BannerState.SHOW_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressEditMapViewModel.BannerState.SHOW_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressEditMapViewModel.BannerState.HIDE_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerIcon(@NotNull l tokenizedAnalytics, @NotNull Function1<? super AddressEditMapVO.MapIcon.BannerIcon, Unit> onAction, @NotNull Function1<? super Long, Unit> onBannerLoaded) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onBannerLoaded, "onBannerLoaded");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAction = onAction;
        this.onBannerLoaded = onBannerLoaded;
    }

    private final void fadeIn(final View view, final AddressEditMapVO.MapIcon.BannerIcon bannerIcon, boolean z11) {
        if (!z11) {
            view.setAlpha(1.0f);
            view.setOnClickListener(new a(2, bannerIcon, this));
            return;
        }
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(1.0f);
        animate.setDuration(200L);
        animate.setInterpolator(new DecelerateInterpolator());
        animate.withEndAction(new Runnable() { // from class: Cy.a
            @Override // java.lang.Runnable
            public final void run() {
                BannerIcon.fadeIn$lambda$7(view, bannerIcon, this);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeIn$lambda$7(View view, AddressEditMapVO.MapIcon.BannerIcon bannerIcon, BannerIcon bannerIcon2) {
        view.setOnClickListener(new ViewOnClickListenerC2453a(1, bannerIcon, bannerIcon2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeIn$lambda$7$lambda$6(AddressEditMapVO.MapIcon.BannerIcon bannerIcon, BannerIcon bannerIcon2, View view) {
        if (bannerIcon != null) {
            bannerIcon2.onAction.invoke(bannerIcon);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeIn$lambda$9(AddressEditMapVO.MapIcon.BannerIcon bannerIcon, BannerIcon bannerIcon2, View view) {
        if (bannerIcon != null) {
            bannerIcon2.onAction.invoke(bannerIcon);
        }
    }

    private final void fadeOut(View view) {
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(0.0f);
        animate.setDuration(200L);
        animate.setInterpolator(new AccelerateInterpolator());
        animate.withEndAction(new RunnableC2599a(view, 2)).start();
    }

    public static /* synthetic */ void updateState$default(BannerIcon bannerIcon, MapBannerBinding mapBannerBinding, AddressEditMapViewModel.BannerState bannerState, AddressEditMapVO.MapIcon.BannerIcon bannerIcon2, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        bannerIcon.updateState(mapBannerBinding, bannerState, bannerIcon2, z11);
    }

    public void bind(@NotNull MapBannerBinding binding, AddressEditMapVO.MapIcon icon, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        if (icon == null) {
            ViewExtKt.gone(constraintLayout);
            return;
        }
        ViewExtKt.show(constraintLayout);
        AddressEditMapVO.MapIcon.BannerIcon bannerIcon = (AddressEditMapVO.MapIcon.BannerIcon) icon;
        t event = bannerIcon.getEvent();
        if (event != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, event, null, 2, null);
        }
        binding.hintTv.setText(bannerIcon.getHintText());
        if (isSelectApp) {
            binding.hintTv.setBackgroundResource(R$drawable.bg_banner_hint_select);
            binding.arrow.setImageResource(R$drawable.bg_banner_arrow_select);
        }
        ImageView bannerIv = binding.bannerIv;
        Intrinsics.checkNotNullExpressionValue(bannerIv, "bannerIv");
        ImageViewExtKt.load$default(bannerIv, bannerIcon.getIconLink(), null, new BannerIcon$bind$2$1(icon, this, binding), null, null, false, null, 122, null);
    }

    public final void updateState(@NotNull MapBannerBinding binding, @NotNull AddressEditMapViewModel.BannerState bannerState, AddressEditMapVO.MapIcon.BannerIcon bannerIcon, boolean withAnimation) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(bannerState, "bannerState");
        int i11 = WhenMappings.$EnumSwitchMapping$0[bannerState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                CharSequence text = binding.hintTv.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (h.K(text)) {
                    return;
                }
                ImageView arrow = binding.arrow;
                Intrinsics.checkNotNullExpressionValue(arrow, "arrow");
                fadeIn(arrow, bannerIcon, withAnimation);
                AppCompatTextView hintTv = binding.hintTv;
                Intrinsics.checkNotNullExpressionValue(hintTv, "hintTv");
                fadeIn(hintTv, bannerIcon, withAnimation);
                return;
            }
            if (i11 != 3) {
                throw new o();
            }
            ImageView bannerIv = binding.bannerIv;
            Intrinsics.checkNotNullExpressionValue(bannerIv, "bannerIv");
            fadeOut(bannerIv);
            ImageView arrow2 = binding.arrow;
            Intrinsics.checkNotNullExpressionValue(arrow2, "arrow");
            fadeOut(arrow2);
            AppCompatTextView hintTv2 = binding.hintTv;
            Intrinsics.checkNotNullExpressionValue(hintTv2, "hintTv");
            fadeOut(hintTv2);
        }
    }
}
