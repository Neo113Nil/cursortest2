package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image;

import VD.a;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.BoundedLinkedHashMap;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B]\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/image/GalleryV4ImageVH;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "Landroid/widget/ImageView;", "imageView", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "", "", "containerSizeCache", "Lkotlin/Function1;", "", "onWidthUpdate", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/widget/ImageView;Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Image;)V", "updateImage", "updateVh", "Landroid/graphics/drawable/Drawable;", "resource", "containerHeight", "resizeViewByOriginalImageRatio", "(Landroid/graphics/drawable/Drawable;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Image;I)V", "width", "height", ImagesContract.URL, "updateView", "(IILjava/lang/String;)V", "Landroid/widget/ImageView;", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "", "previewParentId", "J", "getDisplayWidth", "()I", "displayWidth", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4ImageVH extends GalleryV4ViewHolder<GalleryV4VO.Item.Image> implements GalleryV4Utils {

    @NotNull
    private final BoundedLinkedHashMap<String, Integer> containerSizeCache;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final Function2<AtomAction, GallerySyncModel, Unit> onItemClick;
    private final Function1<Integer, Unit> onWidthUpdate;
    private long previewParentId;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    public /* synthetic */ GalleryV4ImageVH(ImageView imageView, BoundedLinkedHashMap boundedLinkedHashMap, Function1 function1, Function2 function2, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageView, boundedLinkedHashMap, (i11 & 4) != 0 ? null : function1, function2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(GalleryV4VO.Item.Image image, GalleryV4ImageVH galleryV4ImageVH, View view) {
        AtomAction action = image.getAction();
        if (action != null) {
            galleryV4ImageVH.onItemClick.invoke(action, new GallerySyncModel(galleryV4ImageVH.getAdapterPosition(), null));
        }
        t event = image.getEvent();
        if (event != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(galleryV4ImageVH.tokenizedAnalytics, event, null, 2, null);
        }
    }

    private final int getDisplayWidth() {
        return this.imageView.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resizeViewByOriginalImageRatio(Drawable resource, GalleryV4VO.Item.Image item, int containerHeight) {
        if (resource != null) {
            Integer valueOf = Integer.valueOf(resource.getIntrinsicHeight());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Integer valueOf2 = Integer.valueOf(resource.getIntrinsicWidth());
                if ((valueOf2.intValue() > 0 ? valueOf2 : null) != null) {
                    updateView(calculateWidth(r2.intValue() / intValue, item.getContainerConfig().getContainerHeight()), containerHeight, item.getUrl());
                }
            }
        }
    }

    private final void updateImage(GalleryV4VO.Item.Image item) {
        ImageViewExtKt.load$default(this.imageView, item.getUrl(), null, null, null, new ImageSize(this.imageView.getMeasuredWidth(), item.getContainerConfig().getContainerHeight()), false, null, 110, null);
        this.previewParentId = item.getParentId();
    }

    private final void updateVh(GalleryV4VO.Item.Image item) {
        final GalleryV4VO.Item.Image image;
        final GalleryV4VO.ContainerConfig containerConfig = item.getContainerConfig();
        if (containerConfig.getContainerWidth() == null) {
            image = item;
            ImageViewExtKt.load$default(this.imageView, item.getUrl(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image.GalleryV4ImageVH$updateVh$1$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    GalleryV4ImageVH.this.resizeViewByOriginalImageRatio(resource, image, containerConfig.getContainerHeight());
                }
            }, null, null, false, null, 122, null);
        } else {
            image = item;
            ImageViewExtKt.load$default(this.imageView, image.getUrl(), null, null, null, new ImageSize(containerConfig.getContainerWidth().intValue(), containerConfig.getContainerHeight()), false, null, 110, null);
            updateView(containerConfig.getContainerWidth().intValue(), containerConfig.getContainerHeight(), image.getUrl());
        }
        this.previewParentId = image.getParentId();
    }

    private final void updateView(int width, int height, String url) {
        if (getDisplayWidth() < width) {
            width = getDisplayWidth() - getDp4();
        }
        Function1<Integer, Unit> function1 = this.onWidthUpdate;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(width));
        }
        ImageView imageView = this.imageView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = width;
        layoutParams.height = height;
        imageView.setLayoutParams(layoutParams);
        this.containerSizeCache.put(url, Integer.valueOf(width));
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils
    public int calculateHeight(double d11, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.calculateHeight(this, d11, context);
    }

    public int calculateWidth(double d11, int i11) {
        return GalleryV4Utils.DefaultImpls.calculateWidth(this, d11, i11);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getDefaultGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    public int getDp4() {
        return GalleryV4Utils.DefaultImpls.getDp4(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Utils.DefaultImpls.getGalleryPadding(this);
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

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public float getWavesAmount() {
        return GalleryV4Utils.DefaultImpls.getWavesAmount(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV4ImageVH(@NotNull ImageView imageView, @NotNull BoundedLinkedHashMap<String, Integer> containerSizeCache, Function1<? super Integer, Unit> function1, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(containerSizeCache, "containerSizeCache");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.imageView = imageView;
        this.containerSizeCache = containerSizeCache;
        this.onWidthUpdate = function1;
        this.onItemClick = onItemClick;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder
    public void bind(@NotNull GalleryV4VO.Item.Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        GalleryV4VO.ContainerConfig containerConfig = item.getContainerConfig();
        if (this.previewParentId == item.getParentId() || this.previewParentId == 0) {
            Integer num = this.containerSizeCache.get(item.getUrl());
            int width = this.imageView.getWidth();
            if (num == null || num.intValue() != width) {
                Integer containerWidth = containerConfig.getContainerWidth();
                int measuredWidth = this.imageView.getMeasuredWidth();
                if (containerWidth == null || containerWidth.intValue() != measuredWidth) {
                    updateVh(item);
                }
            }
            updateImage(item);
        } else {
            updateVh(item);
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
        this.imageView.setOnClickListener(new a(0, item, this));
    }
}
