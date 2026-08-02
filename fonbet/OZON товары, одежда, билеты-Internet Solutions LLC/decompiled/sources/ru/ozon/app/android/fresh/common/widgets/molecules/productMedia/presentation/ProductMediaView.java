package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation;

import Hj.C3143a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.C7232a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.R$drawable;
import ru.ozon.app.android.fresh.common.widgets.UtilsKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010(\"\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ImageVO;", "collageImages", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "model", "parsedBgColor", "", "bindCollage", "(Ljava/util/List;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;I)V", "bindSingleImage", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "bind", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;)V", "Landroid/graphics/drawable/ColorDrawable;", "backgroundLayer", "Landroid/graphics/drawable/ColorDrawable;", "backgroundParanjaLayer", "Landroid/graphics/drawable/LayerDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "Landroid/view/View;", "foregroundParanjaLayer", "Landroid/view/View;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "outerRadius", "F", "setOuterRadius", "(F)V", "contentRadius", "setContentRadius", "Landroidx/appcompat/widget/AppCompatImageView;", "singleImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageGroupView;", "collageGroupView$delegate", "LSc/j;", "getCollageGroupView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageGroupView;", "collageGroupView", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductMediaView extends FrameLayout {

    @NotNull
    private final LayerDrawable backgroundDrawable;

    @NotNull
    private final ColorDrawable backgroundLayer;

    @NotNull
    private final ColorDrawable backgroundParanjaLayer;

    /* renamed from: collageGroupView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j collageGroupView;
    private float contentRadius;

    @NotNull
    private final View foregroundParanjaLayer;
    private float outerRadius;

    @NotNull
    private final AppCompatImageView singleImageView;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<Integer> blurDrawableIdList = C7714v.b0(Integer.valueOf(R$drawable.blur_gray), Integer.valueOf(R$drawable.blur_pink), Integer.valueOf(R$drawable.blur_green));

    @NotNull
    private static final Map<String, Integer> blurCache = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView$Companion;", "", "<init>", "()V", "", "IMAGE_OUT_OF_STOCK_OPACITY", "F", "", "MAX_IMAGES_IN_COLLAGE", "I", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProductMediaView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindCollage(List<ImageVO> collageImages, ProductMediaVO model, int parsedBgColor) {
        Float collageItemRadius;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, model.getBackgroundParanja(), UniColors.BG_SECONDARY.getResId());
        this.singleImageView.setVisibility(8);
        List<ImageVO> list = collageImages;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ImageVO) it.next()).getUrl());
        }
        List<String> K02 = C7714v.K0(arrayList, 4);
        CollageVO collage = model.getCollage();
        if (collage != null && (collageItemRadius = collage.getCollageItemRadius()) != null) {
            setContentRadius(collageItemRadius.floatValue());
        }
        getCollageGroupView().setVisibility(0);
        getCollageGroupView().setData(K02, Float.valueOf(this.contentRadius), parsedBgColor, parseColor);
    }

    private final void bindSingleImage(ProductMediaVO model, int parsedBgColor) {
        getCollageGroupView().setVisibility(8);
        this.backgroundLayer.setColor(parsedBgColor);
        if (model.getBackgroundParanja() != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.backgroundParanjaLayer.setColor(styleParser.parseColor(context, model.getBackgroundParanja(), UniColors.BG_LIGHT_KEY.getResId()));
        }
        this.singleImageView.setVisibility(0);
        if (model.getImageUrl() != null) {
            if (!model.getHasBlurAndNoise()) {
                this.singleImageView.setAlpha(model.getIsSemiTransparent() ? 0.4f : 1.0f);
                ImageViewExtKt.load$default(this.singleImageView, model.getImageUrl(), null, null, null, null, false, null, 126, null);
                return;
            }
            Map<String, Integer> map = blurCache;
            String imageUrl = model.getImageUrl();
            Integer num = map.get(imageUrl);
            if (num == null) {
                num = Integer.valueOf(((Number) C7714v.r0(blurDrawableIdList, c.INSTANCE)).intValue());
                map.put(imageUrl, num);
            }
            this.singleImageView.setImageDrawable(C7232a.a(getContext(), num.intValue()));
        }
    }

    private final CollageGroupView getCollageGroupView() {
        return (CollageGroupView) this.collageGroupView.getValue();
    }

    private final void setContentRadius(float f7) {
        this.contentRadius = f7;
        invalidateOutline();
    }

    private final void setOuterRadius(float f7) {
        this.outerRadius = f7;
        invalidateOutline();
    }

    public final void bind(@NotNull ProductMediaVO model) {
        Intrinsics.checkNotNullParameter(model, "model");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, model.getBackgroundColor(), UniColors.BG_LIGHT_KEY.getResId());
        CollageVO collage = model.getCollage();
        List<ImageVO> images = collage != null ? collage.getImages() : null;
        if (images == null) {
            images = K.f71697a;
        }
        Float radius = model.getRadius();
        if (radius != null) {
            setOuterRadius(radius.floatValue());
        }
        if (!model.getHasDefaultParanja()) {
            removeView(this.foregroundParanjaLayer);
        } else if (indexOfChild(this.foregroundParanjaLayer) == -1) {
            addView(this.foregroundParanjaLayer);
        }
        if (images.isEmpty()) {
            bindSingleImage(model, parseColor);
        } else {
            bindCollage(images, model, parseColor);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMediaView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ColorDrawable colorDrawable = new ColorDrawable();
        this.backgroundLayer = colorDrawable;
        ColorDrawable colorDrawable2 = new ColorDrawable();
        this.backgroundParanjaLayer = colorDrawable2;
        LayerDrawable layerDrawable = new LayerDrawable(new ColorDrawable[]{colorDrawable, colorDrawable2});
        this.backgroundDrawable = layerDrawable;
        View view = new View(context);
        view.setBackground(new ColorDrawable(UniColors.LAYER_OVERLAY_PARANJA.getResId()));
        view.setAlpha(0.04f);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.foregroundParanjaLayer = view;
        this.outerRadius = UiExtKt.toPxF(CornerRadius.RADIUS_650.getPx());
        this.contentRadius = UiExtKt.toPxF(CornerRadius.RADIUS_300.getPx());
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.singleImageView = appCompatImageView;
        this.collageGroupView = UtilsKt.unsafeLazy(new ProductMediaView$collageGroupView$2(context, this));
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view2, "view", outline, "outline"), view2.getHeight(), ProductMediaView.this.outerRadius);
            }
        });
        setClipToOutline(true);
        setBackground(layerDrawable);
        addView(appCompatImageView);
    }
}
