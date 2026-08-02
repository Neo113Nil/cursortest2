package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources;
import ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5SimpleStateView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "context", "Landroid/content/Context;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;)V", "preCreationGalleryResources", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "getPreCreationGalleryResources", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "updateLayoutParams", "", "config", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV5SimpleStateView extends RecyclerView implements GalleryV5Utils {

    @NotNull
    private final GalleryV5Resources preCreationGalleryResources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5SimpleStateView(@NotNull Context context, @NotNull GalleryV5PreCreationConfig preCreationConfig) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        GradientDrawable gradientDrawable = new GradientDrawable();
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgLightKey);
        float selectBgTopRadius = preCreationConfig.getIsSelect() ? GalleryV5Const.INSTANCE.getSelectBgTopRadius() : GalleryV5Const.INSTANCE.getDefaultBgTopRadius();
        float defaultBgTopRadius = preCreationConfig.getIsSelect() ? 0.0f : GalleryV5Const.INSTANCE.getDefaultBgTopRadius();
        gradientDrawable.setCornerRadii(new float[]{selectBgTopRadius, selectBgTopRadius, selectBgTopRadius, selectBgTopRadius, defaultBgTopRadius, defaultBgTopRadius, defaultBgTopRadius, defaultBgTopRadius});
        gradientDrawable.setStroke(Dimens.INSTANCE.getDP_1(), themeColor);
        gradientDrawable.setColor(themeColor);
        this.preCreationGalleryResources = new GalleryV5Resources(gradientDrawable, preCreationConfig.getIsSelect() ? GalleryV5Const.INSTANCE.getSelectBgTopRadius() : GalleryV5Const.INSTANCE.getDefaultBgTopRadius(), null, null, C7232a.a(context, R$color.layer_overlay_paranja), null, (preCreationConfig.getHasWave() && preCreationConfig.getHasVideoContent()) ? createBgRoundItems(context, preCreationConfig.getIsSelect()) : null, 32, null);
        setId(R$id.galleryV5Rv);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setLayoutParams(new RecyclerView.p(preCreationConfig.getWidth(), preCreationConfig.getHeight()));
        setOverScrollMode(2);
        setItemAnimator(null);
        addItemDecoration(new GalleryV5ItemDecorator());
        setMeasuredDimension(preCreationConfig.getWidth(), preCreationConfig.getHeight());
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils
    public int calculateHeight(Double d11, @NotNull Context context, double d12) {
        return GalleryV5Utils.DefaultImpls.calculateHeight(this, d11, context, d12);
    }

    @NotNull
    public GradientDrawable createBgRoundItems(@NotNull Context context, boolean z11) {
        return GalleryV5Utils.DefaultImpls.createBgRoundItems(this, context, z11);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getDefaultGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getDefaultGalleryRatio(this);
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

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public float getWavesAmount() {
        return GalleryV5Utils.DefaultImpls.getWavesAmount(this);
    }

    public final void updateLayoutParams(@NotNull GalleryV5PreCreationConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getHeight() == getMeasuredHeight() && config.getWidth() == getMeasuredWidth()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = config.getHeight();
        layoutParams.width = config.getWidth();
        setLayoutParams(layoutParams);
    }
}
