package ru.ozon.app.android.sellerproducts.sellerProducts.videocover;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.videocover.VideoTile;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/videocover/VideoTileView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/videocover/VideoTile;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "playerView", "Landroidx/media3/ui/PlayerView;", "imageView", "Lru/ozon/app/android/cscore/adultimage/DeliveryAdultImageView;", "getPlayerView", "showPreview", "", "hidePreview", "onVideoStart", "onVideoStop", "bind", "item", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$VideoItem;", "removeVideo", "addVideo", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoTileView extends FrameLayout implements VideoTile {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float VIDEO_CORNER_RADIUS = ResourceExtKt.toPxF(12);

    @NotNull
    private final DeliveryAdultImageView imageView;

    @NotNull
    private final PlayerView playerView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/videocover/VideoTileView$Companion;", "", "<init>", "()V", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoTileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addVideo() {
        if (this.playerView.getParent() == null) {
            addView(this.playerView, 0);
        }
    }

    private final void removeVideo() {
        removeView(this.playerView);
    }

    public final void bind(@NotNull ProductVO.GalleryItem.VideoItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DeliveryAdultImageView.bind$default(this.imageView, item.getImage().getUrl(), item.getIsAdult(), null, 4, null);
        removeVideo();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    @NotNull
    public PlayerView getPlayerView() {
        return this.playerView;
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void hidePreview() {
        this.imageView.setVisibility(8);
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStart() {
        addVideo();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStop() {
        removeVideo();
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void showPreview() {
        this.imageView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        PlayerView playerView = new PlayerView(context);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playerView.E();
        playerView.C(4);
        playerView.setClipToOutline(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f7 = VIDEO_CORNER_RADIUS;
        gradientDrawable.setCornerRadius(f7);
        gradientDrawable.setColor(-1);
        playerView.setBackground(gradientDrawable);
        playerView.A();
        this.playerView = playerView;
        DeliveryAdultImageView deliveryAdultImageView = new DeliveryAdultImageView(context, null, 0, 6, null);
        deliveryAdultImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        deliveryAdultImageView.setCornerRadius(f7);
        this.imageView = deliveryAdultImageView;
        addView(playerView);
        addView(deliveryAdultImageView);
    }
}
