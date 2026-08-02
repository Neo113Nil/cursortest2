package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image.TileGrid2AdultImageView;
import ru.ozon.app.android.videocover.VideoTile;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/VideoTileView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/videocover/VideoTile;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "playerView", "Landroidx/media3/ui/PlayerView;", "imageView", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/TileGrid2AdultImageView;", "getImageView", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/TileGrid2AdultImageView;", "getPlayerView", "showPreview", "", "hidePreview", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoTileView extends FrameLayout implements VideoTile {

    @NotNull
    private final TileGrid2AdultImageView imageView;

    @NotNull
    private final PlayerView playerView;

    public /* synthetic */ VideoTileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final TileGrid2AdultImageView getImageView() {
        return this.imageView;
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
        VideoTile.DefaultImpls.onVideoStart(this);
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void onVideoStop() {
        VideoTile.DefaultImpls.onVideoStop(this);
    }

    @Override // ru.ozon.app.android.videocover.VideoTile
    public void showPreview() {
        this.imageView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.tile_grid_2_video_tile_with_tv_with_shrinked_player, this);
        PlayerView playerView = (PlayerView) findViewById(R$id.playerView);
        playerView.setClipToOutline(true);
        playerView.A();
        this.playerView = playerView;
        this.imageView = (TileGrid2AdultImageView) findViewById(R$id.imageView);
    }
}
