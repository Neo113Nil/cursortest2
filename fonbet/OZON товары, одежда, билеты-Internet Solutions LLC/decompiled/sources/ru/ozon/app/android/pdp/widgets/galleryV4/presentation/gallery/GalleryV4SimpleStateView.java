package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4Resources;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4SimpleStateView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;)V", "preCreationGalleryResources", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "getPreCreationGalleryResources", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "updateLayoutParams", "", "config", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4SimpleStateView extends RecyclerView {

    @NotNull
    private final GalleryV4Resources preCreationGalleryResources;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float bgItemsRadius = Dimens.INSTANCE.getDPF_20();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4SimpleStateView$Companion;", "", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4SimpleStateView(@NotNull Context context, @NotNull GalleryV4PreCreationConfig preCreationConfig) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        GradientDrawable gradientDrawable = new GradientDrawable();
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgLightKey);
        float f7 = bgItemsRadius;
        gradientDrawable.setCornerRadius(f7);
        gradientDrawable.setStroke(Dimens.INSTANCE.getDP_1(), themeColor);
        gradientDrawable.setColor(themeColor);
        this.preCreationGalleryResources = new GalleryV4Resources(gradientDrawable, f7, C7232a.a(context, R$drawable.bg_round_gallery_v4_button_item), C7232a.a(context, R$color.layer_overlay_paranja), null, null, preCreationConfig.getHasWave() ? C7232a.a(context, R$drawable.fg_round_gallery_v4_wave_item) : null, (preCreationConfig.getHasWave() && preCreationConfig.getHasVideoContent()) ? C7232a.a(context, R$drawable.bg_round_gallery_v4_wave_item) : null, 48, null);
        setId(R$id.galleryV4Rv);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setLayoutParams(new RecyclerView.p(preCreationConfig.getWidth(), preCreationConfig.getHeight()));
        setOverScrollMode(2);
        setItemAnimator(null);
        addItemDecoration(new GalleryV4ItemDecorator());
        setMeasuredDimension(preCreationConfig.getWidth(), preCreationConfig.getHeight());
    }

    @NotNull
    public final GalleryV4Resources getPreCreationGalleryResources() {
        return this.preCreationGalleryResources;
    }

    public final void updateLayoutParams(@NotNull GalleryV4PreCreationConfig config) {
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
