package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020$H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2PreviewItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ds", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "cornerRadius", "", "strokeWidth", "", "stroke", "Landroid/graphics/drawable/GradientDrawable;", "previewIv", "Lru/ozon/uni/android/atom/image/Image;", "getPreviewIv", "()Lru/ozon/uni/android/atom/image/Image;", "previewIv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "getIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "icon$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "updateSelection", "isSelected", "", "addViews", "bindPhoto", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$Photo;", "bindVideo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$Video;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2PreviewItemView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsGalleryFullV2PreviewItemView.class, "previewIv", "getPreviewIv()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(HotelsGalleryFullV2PreviewItemView.class, "icon", "getIcon()Lru/ozon/uni/android/atom/icon/IconView;", 0)};
    public static final int $stable = 8;
    private final float cornerRadius;

    @NotNull
    private final DesignSystemDimensProvider ds;

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
    public HotelsGalleryFullV2PreviewItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider designSystemDimensProvider = new DesignSystemDimensProvider(context, null, 2, null);
        this.ds = designSystemDimensProvider;
        float radius8 = designSystemDimensProvider.getRadius8();
        this.cornerRadius = radius8;
        int px = ResourceExtKt.toPx(2, context);
        this.strokeWidth = px;
        this.stroke = new RoundedBackgroundProducer().produce(0, ThemeExtKt.themeColor(context, R$attr.graphicActionOnLight), px, radius8);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.previewIv = new PreCreationViewPoolDelegate(context2, N.b(Image.class), new HotelsGalleryFullV2PreviewItemView$special$$inlined$preCreationViewPool$default$1(this), new HotelsGalleryFullV2PreviewItemView$special$$inlined$preCreationViewPool$default$2(context));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.icon = new PreCreationViewPoolDelegate(context3, N.b(IconView.class), new HotelsGalleryFullV2PreviewItemView$special$$inlined$preCreationViewPool$default$3(this), new HotelsGalleryFullV2PreviewItemView$special$$inlined$preCreationViewPool$default$4());
        addViews();
        ViewExtensionsKt.applyRoundedOutline(this, radius8 + (px / 2));
    }

    private final void addViews() {
        addView(getPreviewIv());
        addView(getIcon());
    }

    private final void bindPhoto(HotelsGalleryFullV2VI.Photo item) {
        ImageHolderKt.bind$default(getPreviewIv(), item.getImage(), null, 2, null);
        ViewExtKt.gone(getIcon());
    }

    private final void bindVideo(HotelsGalleryFullV2VI.Video item) {
        ImageHolderKt.bind$default(getPreviewIv(), item.getPreviewImage(), null, 2, null);
        IconHolderKt.bind$default(getIcon(), item.getVideoControlIcon(), null, 2, null);
        ViewExtKt.show(getIcon());
    }

    private final IconView getIcon() {
        return (IconView) this.icon.getValue(this, $$delegatedProperties[1]);
    }

    private final Image getPreviewIv() {
        return (Image) this.previewIv.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull HotelsGalleryFullV2VI.GalleryItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof HotelsGalleryFullV2VI.Photo) {
            bindPhoto((HotelsGalleryFullV2VI.Photo) item);
        } else {
            if (!(item instanceof HotelsGalleryFullV2VI.Video)) {
                throw new o();
            }
            bindVideo((HotelsGalleryFullV2VI.Video) item);
        }
    }

    public final void updateSelection(boolean isSelected) {
        setForeground(isSelected ? this.stroke : null);
    }
}
