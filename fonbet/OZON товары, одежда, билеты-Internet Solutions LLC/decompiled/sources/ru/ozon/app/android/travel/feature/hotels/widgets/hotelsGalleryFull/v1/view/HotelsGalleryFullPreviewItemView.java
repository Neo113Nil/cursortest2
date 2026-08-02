package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ImageExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020'H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPreviewItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp64", "", "dp86", "cornerRadius", "", "strokeWidth", "stroke", "Landroid/graphics/drawable/GradientDrawable;", "previewIv", "Lru/ozon/uni/android/atom/image/Image;", "getPreviewIv", "()Lru/ozon/uni/android/atom/image/Image;", "previewIv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "getIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "icon$delegate", "adaptiveImageCallback", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "Landroid/graphics/drawable/Drawable;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "updateSelection", "isSelected", "", "addViews", "bindPhoto", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Photo;", "bindVideo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Video;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullPreviewItemView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsGalleryFullPreviewItemView.class, "previewIv", "getPreviewIv()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(HotelsGalleryFullPreviewItemView.class, "icon", "getIcon()Lru/ozon/uni/android/atom/icon/IconView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final PikazonLoaderCallback<Drawable> adaptiveImageCallback;
    private final float cornerRadius;
    private final int dp64;
    private final int dp86;

    /* renamed from: icon$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate icon;

    /* renamed from: previewIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate previewIv;

    @NotNull
    private final GradientDrawable stroke;
    private final int strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullPreviewItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp64 = ResourceExtKt.toPx(64, context);
        this.dp86 = ResourceExtKt.toPx(86, context);
        float pxF = ResourceExtKt.toPxF(8, context);
        this.cornerRadius = pxF;
        int px = ResourceExtKt.toPx(2, context);
        this.strokeWidth = px;
        this.stroke = new RoundedBackgroundProducer().produce(0, ThemeExtKt.themeColor(context, R$attr.graphicActionOnLight), px, pxF);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.previewIv = new PreCreationViewPoolDelegate(context2, N.b(Image.class), new HotelsGalleryFullPreviewItemView$special$$inlined$preCreationViewPool$default$1(this), new HotelsGalleryFullPreviewItemView$special$$inlined$preCreationViewPool$default$2(this, context));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.icon = new PreCreationViewPoolDelegate(context3, N.b(IconView.class), new HotelsGalleryFullPreviewItemView$special$$inlined$preCreationViewPool$default$3(this), new HotelsGalleryFullPreviewItemView$special$$inlined$preCreationViewPool$default$4());
        this.adaptiveImageCallback = ImageExtensionsKt.createAdaptiveImageCallback(getPreviewIv());
        addViews();
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullPreviewItemView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), HotelsGalleryFullPreviewItemView.this.cornerRadius + (HotelsGalleryFullPreviewItemView.this.strokeWidth / 2));
            }
        });
        setClipToOutline(true);
    }

    private final void addViews() {
        addView(getPreviewIv());
        addView(getIcon());
    }

    private final void bindPhoto(HotelsGalleryFullVI.Photo item) {
        ImageExtensionsKt.bindWithCallback(getPreviewIv(), item.getImage(), this.adaptiveImageCallback);
        ViewExtKt.gone(getIcon());
    }

    private final void bindVideo(HotelsGalleryFullVI.Video item) {
        ImageExtensionsKt.bindWithCallback(getPreviewIv(), item.getPreviewImage(), this.adaptiveImageCallback);
        IconHolderKt.bind$default(getIcon(), item.getVideoControlIcon(), null, 2, null);
    }

    private final IconView getIcon() {
        return (IconView) this.icon.getValue(this, $$delegatedProperties[1]);
    }

    private final Image getPreviewIv() {
        return (Image) this.previewIv.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull HotelsGalleryFullVI.GalleryItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof HotelsGalleryFullVI.Photo) {
            bindPhoto((HotelsGalleryFullVI.Photo) item);
        } else {
            if (!(item instanceof HotelsGalleryFullVI.Video)) {
                throw new o();
            }
            bindVideo((HotelsGalleryFullVI.Video) item);
        }
    }

    public final void updateSelection(boolean isSelected) {
        setForeground(isSelected ? this.stroke : null);
    }
}
