package ru.ozon.app.android.pdp.widgets.galleryV4.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4ButtonsRv;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.RightAlignedLinearLayoutManager;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4SimpleStateView;
import ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4FullStateView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "context", "Landroid/content/Context;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;)V", "galleryRv", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4SimpleStateView;", "getGalleryRv", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4SimpleStateView;", "buttonsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getButtonsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "preCreationGalleryResources", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "getPreCreationGalleryResources", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "isLastVisibleState", "", "Ljava/lang/Boolean;", "updateButtons", "", "isVisible", "updateLayoutParams", "config", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4FullStateView extends FrameLayout implements GalleryV4Utils {

    @NotNull
    private final RecyclerView buttonsRv;

    @NotNull
    private final Context context;

    @NotNull
    private final GalleryV4SimpleStateView galleryRv;
    private Boolean isLastVisibleState;

    @NotNull
    private final GalleryV4PreCreationConfig preCreationConfig;

    @NotNull
    private final GalleryV4Resources preCreationGalleryResources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4FullStateView(@NotNull Context context, @NotNull GalleryV4PreCreationConfig preCreationConfig) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        LinkedHashMap linkedHashMap = null;
        this.context = context;
        this.preCreationConfig = preCreationConfig;
        setId(R$id.galleryV4ContainerV);
        setLayoutParams(new FrameLayout.LayoutParams(preCreationConfig.getWidth(), preCreationConfig.getHeight()));
        GalleryV4SimpleStateView galleryV4SimpleStateView = new GalleryV4SimpleStateView(context, preCreationConfig);
        this.galleryRv = galleryV4SimpleStateView;
        GalleryV4Resources preCreationGalleryResources = galleryV4SimpleStateView.getPreCreationGalleryResources();
        Integer buttonsTintRes = preCreationConfig.getButtonsTintRes();
        Integer valueOf = buttonsTintRes != null ? Integer.valueOf(a.getColor(context, buttonsTintRes.intValue())) : null;
        List<String> icons = preCreationConfig.getIcons();
        if (icons != null) {
            List<String> list = icons;
            int h11 = U.h(C7714v.z(list, 10));
            linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (Object obj : list) {
                linkedHashMap.put(obj, ExtensionsKt.loadDrawableByName(this.context, (String) obj));
            }
        }
        this.preCreationGalleryResources = GalleryV4Resources.copy$default(preCreationGalleryResources, null, 0.0f, null, null, valueOf, linkedHashMap, null, null, 207, null);
        GalleryV4ButtonsRv galleryV4ButtonsRv = new GalleryV4ButtonsRv(this.context, this.preCreationConfig);
        this.buttonsRv = galleryV4ButtonsRv;
        View view = this.galleryRv;
        addViewInLayout(view, 0, view.getLayoutParams());
        addViewInLayout(galleryV4ButtonsRv, 1, galleryV4ButtonsRv.getLayoutParams());
        setMeasuredDimension(this.preCreationConfig.getWidth(), this.preCreationConfig.getHeight());
        requestLayout();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils
    public int calculateHeight(double d11, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.calculateHeight(this, d11, context);
    }

    @NotNull
    public final RecyclerView getButtonsRv() {
        return this.buttonsRv;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getDefaultGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Utils.DefaultImpls.getGalleryPadding(this);
    }

    @NotNull
    public final GalleryV4SimpleStateView getGalleryRv() {
        return this.galleryRv;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxVerticalStateRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinContainerRatio() {
        return GalleryV4Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @NotNull
    public final GalleryV4Resources getPreCreationGalleryResources() {
        return this.preCreationGalleryResources;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public float getWavesAmount() {
        return GalleryV4Utils.DefaultImpls.getWavesAmount(this);
    }

    public final void updateButtons(boolean isVisible) {
        if (Intrinsics.d(this.isLastVisibleState, Boolean.FALSE) && isVisible) {
            this.buttonsRv.requestLayout();
        }
        this.isLastVisibleState = Boolean.valueOf(isVisible);
    }

    public final void updateLayoutParams(@NotNull GalleryV4PreCreationConfig config) {
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
            this.buttonsRv.setLayoutManager(config.getIsCreateOnBoarding() ? new RightAlignedLinearLayoutManager(this.context) : new LinearLayoutManager(this.context, 1, false));
        }
    }
}
