package ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.product.R$layout;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.imagesswipeview.AdultServerBlurImageView;
import ru.ozon.app.android.videocover.VideoTile;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/VideoTileView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/videocover/VideoTile;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "videoCornerRadius", "", "imageView", "Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;", "playerView", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "showPreview", "", "hidePreview", "onVideoStart", "onVideoStop", "bind", "item", "Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoTileView extends FrameLayout implements VideoTile {

    @NotNull
    private final AdultServerBlurImageView imageView;

    @NotNull
    private final PlayerView playerView;
    private final float videoCornerRadius;

    public /* synthetic */ VideoTileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull GalleryItem.VideoItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.imageView.bind(item.getImage());
        ViewExtKt.gone(this.playerView);
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
        ViewExtKt.show(this.playerView);
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStop() {
        ViewExtKt.gone(this.playerView);
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void showPreview() {
        this.imageView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(12);
        this.videoCornerRadius = pxF;
        View.inflate(context, R$layout.sku_video_tile_with_tv_with_shrinked_player, this);
        PlayerView playerView = (PlayerView) findViewById(R$id.playerView);
        playerView.setClipToOutline(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(pxF);
        gradientDrawable.setColor(-1);
        playerView.setBackground(gradientDrawable);
        this.playerView = playerView;
        this.imageView = (AdultServerBlurImageView) findViewById(R$id.imageView);
    }
}
