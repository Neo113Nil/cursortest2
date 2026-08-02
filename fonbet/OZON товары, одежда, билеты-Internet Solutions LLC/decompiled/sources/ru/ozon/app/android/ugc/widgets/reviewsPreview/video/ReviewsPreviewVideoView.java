package ru.ozon.app.android.ugc.widgets.reviewsPreview.video;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdpvideomolecule.R$layout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewTileBinder;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0012\b\u0001\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010!J\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00101\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/VideoPreviewControl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "radius", "", "updateCornerRadius", "(I)V", "", "paranjaColor", "setParanjaBackground", "(ILjava/lang/String;)V", "", "radiusPx", "ru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoView$createOutlineProvider$1", "createOutlineProvider", "(F)Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoView$createOutlineProvider$1;", "colorRes", "Landroid/graphics/drawable/ShapeDrawable;", "getBackground", "(II)Landroid/graphics/drawable/ShapeDrawable;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "getDefaultLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "hidePreview", "()V", "showPreview", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;)V", "Landroid/view/View;", "paranjaView", "Landroid/view/View;", "Lru/ozon/uni/android/atom/image/Image;", "preview", "Lru/ozon/uni/android/atom/image/Image;", "cornerImage$delegate", "LSc/j;", "getCornerImage", "()Lru/ozon/uni/android/atom/image/Image;", "cornerImage", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileBinder;", "tileBinder", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileBinder;", "Landroidx/media3/ui/PlayerView;", "playerView", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewVideoView extends ConstraintLayout implements VideoPreviewControl {

    /* renamed from: cornerImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cornerImage;

    @NotNull
    private final View paranjaView;

    @NotNull
    private final PlayerView playerView;

    @NotNull
    private final Image preview;

    @NotNull
    private final ReviewsPreviewTileBinder tileBinder;
    public static final int $stable = 8;

    @NotNull
    private static final ImageAspectRatio ratio = ImageAspectRatio.RATIO_2_3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsPreviewVideoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(R$id.reviewsPreviewParanja);
        view.setLayoutParams(getDefaultLayoutParams());
        view.setBackground(getBackground(16, UniColors.LAYER_OVERLAY_PARANJA.getResId()));
        this.paranjaView = view;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.reviewsPreviewImage);
        image.setLayoutParams(getDefaultLayoutParams());
        this.preview = image;
        this.cornerImage = LazyUtilsKt.unsafeLazy(new ReviewsPreviewVideoView$cornerImage$2(context, this));
        this.tileBinder = new ReviewsPreviewTileBinder(this);
        View inflate = LayoutInflater.from(context).inflate(R$layout.view_video_molecule_player, (ViewGroup) this, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) inflate;
        playerView.setLayoutParams(getDefaultLayoutParams());
        playerView.setClipToOutline(true);
        playerView.C(4);
        playerView.A();
        playerView.setOutlineProvider(createOutlineProvider(ResourceExtKt.toPxF(16)));
        this.playerView = playerView;
        addView(playerView);
        addView(view);
        addView(image);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoView$createOutlineProvider$1] */
    private final ReviewsPreviewVideoView$createOutlineProvider$1 createOutlineProvider(final float radiusPx) {
        return new ViewOutlineProvider() { // from class: ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoView$createOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), radiusPx);
            }
        };
    }

    private final ShapeDrawable getBackground(int radius, int colorRes) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ContextExtKt.createRoundRectShape$default(context, ResourceExtKt.toPxF(radius), CornersConfig.ALL, colorRes, 0, null, 24, null);
    }

    private final Image getCornerImage() {
        return (Image) this.cornerImage.getValue();
    }

    private final ConstraintLayout.b getDefaultLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        return bVar;
    }

    private final void setParanjaBackground(int radius, String paranjaColor) {
        View view = this.paranjaView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, paranjaColor);
        view.setBackground(getBackground(radius, mapColor != null ? mapColor.intValue() : UniColors.LAYER_OVERLAY_PARANJA.getResId()));
    }

    private final void updateCornerRadius(int radius) {
        float pxF = ResourceExtKt.toPxF(radius);
        setOutlineProvider(createOutlineProvider(pxF));
        invalidateOutline();
        this.playerView.setOutlineProvider(createOutlineProvider(pxF));
        this.playerView.invalidateOutline();
    }

    public final void bind(@NotNull ReviewsPreviewVO.ReviewsPreviewVideoVO item) {
        int px;
        Intrinsics.checkNotNullParameter(item, "item");
        CornerRadius cornerRadius = item.getCornerRadius();
        if (cornerRadius != null) {
            px = cornerRadius.getPx();
        } else {
            ru.ozon.uni.atoms.data.image.CornerRadius cornerRadius2 = item.getPreview().getCornerRadius();
            px = cornerRadius2 != null ? cornerRadius2.getPx() : 16;
        }
        setParanjaBackground(px, item.getParanjaColor());
        updateCornerRadius(px);
        ImageHolderKt.bind$default(this.preview, item.getPreview(), null, 2, null);
        this.tileBinder.bindTile(item);
        ImageHolderKt.bindOrGone$default(getCornerImage(), item.getCornerImage(), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getWidgetBackgroundColor());
        if (parseColor != null) {
            setBackgroundColor(parseColor.intValue());
        }
    }

    @NotNull
    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.video.VideoPreviewControl
    public void hidePreview() {
        ViewExtKt.gone(this.preview);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        ImageAspectRatio imageAspectRatio = ratio;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((imageAspectRatio.getHeightRatio() * size) / imageAspectRatio.getWidthRatio(), 1073741824));
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.video.VideoPreviewControl
    public void showPreview() {
        ViewExtKt.show(this.preview);
    }
}
