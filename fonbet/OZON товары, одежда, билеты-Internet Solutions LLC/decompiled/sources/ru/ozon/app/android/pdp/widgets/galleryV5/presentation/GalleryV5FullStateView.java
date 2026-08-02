package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5ButtonsRv;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5RightAlignedLinearLayoutManager;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5SimpleStateView;
import ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0006J\b\u0010 \u001a\u00020\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "context", "Landroid/content/Context;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;)V", "galleryRv", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5SimpleStateView;", "getGalleryRv", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5SimpleStateView;", "buttonsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getButtonsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "singleButtonFL", "getSingleButtonFL", "()Landroid/widget/FrameLayout;", "preCreationGalleryResources", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "getPreCreationGalleryResources", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "isLastVisibleState", "", "Ljava/lang/Boolean;", "updateButtons", "", "isVisible", "updateLayoutParams", "config", "createSingleButtonContainer", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV5FullStateView extends FrameLayout implements GalleryV5Utils {

    @NotNull
    private final RecyclerView buttonsRv;

    @NotNull
    private final Context context;

    @NotNull
    private final GalleryV5SimpleStateView galleryRv;
    private Boolean isLastVisibleState;

    @NotNull
    private final GalleryV5PreCreationConfig preCreationConfig;

    @NotNull
    private final GalleryV5Resources preCreationGalleryResources;

    @NotNull
    private final FrameLayout singleButtonFL;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float defaultBgItemsRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_400.getPx());
    private static final float selectBgItemsRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_450.getPx());
    private static final float selectBgRoundItemsRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_525.getPx());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5FullStateView$Companion;", "", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5FullStateView(@NotNull Context context, @NotNull GalleryV5PreCreationConfig preCreationConfig) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        LinkedHashMap linkedHashMap = null;
        this.context = context;
        this.preCreationConfig = preCreationConfig;
        setBackgroundColor(a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
        setId(R$id.galleryV5ContainerV);
        setLayoutParams(new FrameLayout.LayoutParams(preCreationConfig.getWidth(), preCreationConfig.getHeight()));
        GalleryV5SimpleStateView galleryV5SimpleStateView = new GalleryV5SimpleStateView(context, preCreationConfig);
        this.galleryRv = galleryV5SimpleStateView;
        GalleryV5Resources preCreationGalleryResources = galleryV5SimpleStateView.getPreCreationGalleryResources();
        float f7 = preCreationConfig.getIsSelect() ? selectBgRoundItemsRadius : defaultBgItemsRadius;
        CornersConfig cornersConfig = CornersConfig.ALL;
        String buttonsBg = preCreationConfig.getButtonsBg();
        ShapeDrawable createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(context, f7, cornersConfig, 0, ContextExtKt.parseColor(context, buttonsBg == null ? galleryV5SimpleStateView.getPreCreationGalleryResources().getDefaultButtonsBg() : buttonsBg), null, 20, null);
        float f11 = preCreationConfig.getIsSelect() ? selectBgItemsRadius : defaultBgItemsRadius;
        String buttonsBg2 = preCreationConfig.getButtonsBg();
        ShapeDrawable createRoundRectShape$default2 = ContextExtKt.createRoundRectShape$default(context, f11, cornersConfig, 0, ContextExtKt.parseColor(context, buttonsBg2 == null ? galleryV5SimpleStateView.getPreCreationGalleryResources().getDefaultButtonsBg() : buttonsBg2), null, 20, null);
        List<String> icons = preCreationConfig.getIcons();
        if (icons != null) {
            List<String> list = icons;
            int h11 = U.h(C7714v.z(list, 10));
            linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (Object obj : list) {
                linkedHashMap.put(obj, ExtensionsKt.loadDrawableByName(this.context, (String) obj));
            }
        }
        this.preCreationGalleryResources = GalleryV5Resources.copy$default(preCreationGalleryResources, null, 0.0f, createRoundRectShape$default, createRoundRectShape$default2, null, linkedHashMap, null, 83, null);
        GalleryV5ButtonsRv galleryV5ButtonsRv = new GalleryV5ButtonsRv(this.context, this.preCreationConfig);
        this.buttonsRv = galleryV5ButtonsRv;
        FrameLayout createSingleButtonContainer = createSingleButtonContainer();
        this.singleButtonFL = createSingleButtonContainer;
        View view = this.galleryRv;
        addViewInLayout(view, 0, view.getLayoutParams());
        if (this.preCreationConfig.getIsSingleButton()) {
            addViewInLayout(createSingleButtonContainer, 1, createSingleButtonContainer.getLayoutParams());
        } else {
            addViewInLayout(galleryV5ButtonsRv, 1, galleryV5ButtonsRv.getLayoutParams());
        }
        setMeasuredDimension(this.preCreationConfig.getWidth(), this.preCreationConfig.getHeight());
        requestLayout();
    }

    private final FrameLayout createSingleButtonContainer() {
        FrameLayout frameLayout = new FrameLayout(this.context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        int dp12 = getDp12();
        layoutParams.setMargins(getDp8(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, dp12, getDp8());
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils
    public int calculateHeight(Double d11, @NotNull Context context, double d12) {
        return GalleryV5Utils.DefaultImpls.calculateHeight(this, d11, context, d12);
    }

    @NotNull
    public final RecyclerView getButtonsRv() {
        return this.buttonsRv;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getDefaultGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    public int getDp12() {
        return GalleryV5Utils.DefaultImpls.getDp12(this);
    }

    public int getDp8() {
        return GalleryV5Utils.DefaultImpls.getDp8(this);
    }

    @NotNull
    public final GalleryV5SimpleStateView getGalleryRv() {
        return this.galleryRv;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxVerticalStateRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinContainerRatio() {
        return GalleryV5Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @NotNull
    public final GalleryV5Resources getPreCreationGalleryResources() {
        return this.preCreationGalleryResources;
    }

    @NotNull
    public final FrameLayout getSingleButtonFL() {
        return this.singleButtonFL;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public float getWavesAmount() {
        return GalleryV5Utils.DefaultImpls.getWavesAmount(this);
    }

    public final void updateButtons(boolean isVisible) {
        if (Intrinsics.d(this.isLastVisibleState, Boolean.FALSE) && isVisible) {
            this.buttonsRv.requestLayout();
        }
        this.isLastVisibleState = Boolean.valueOf(isVisible);
    }

    public final void updateLayoutParams(@NotNull GalleryV5PreCreationConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getHeight() != getMeasuredHeight() || config.getWidth() != getMeasuredWidth()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = config.getHeight();
            layoutParams.width = config.getWidth();
            setLayoutParams(layoutParams);
            this.galleryRv.updateLayoutParams(config);
        }
        if (config.getIsCreateOnBoarding() != this.preCreationConfig.getIsCreateOnBoarding()) {
            this.buttonsRv.setLayoutManager(config.getIsCreateOnBoarding() ? new GalleryV5RightAlignedLinearLayoutManager(this.context) : new LinearLayoutManager(this.context, 1, false));
        }
    }
}
