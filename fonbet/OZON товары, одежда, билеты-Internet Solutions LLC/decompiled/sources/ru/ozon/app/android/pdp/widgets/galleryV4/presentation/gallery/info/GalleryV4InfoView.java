package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/info/GalleryV4InfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "width", "", "height", "isBigState", "", "<init>", "(Landroid/content/Context;IIZ)V", "infoTitleIv", "Landroid/widget/ImageView;", "infoTitleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Info;", "createAtomView", "createImageView", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4InfoView extends LinearLayout {

    @NotNull
    private final ImageView infoTitleIv;

    @NotNull
    private final TextAtomV2View infoTitleTav;
    private final int width;
    public static final int $stable = 8;
    private static final int BIG_STATE_SIZE = UiExtKt.toPx(100);
    private static final int SMALL_STATE_SIZE = UiExtKt.toPx(86);
    private static final int TEXT_WIDTH = UiExtKt.toPx(204);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4InfoView(@NotNull Context context, int i11, int i12, boolean z11) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.width = i11;
        setId(R$id.galleryV4InfoV);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(i11, i12));
        setBackground(g.d(context.getResources(), R$drawable.bg_round_gallery_v4_other_item, context.getTheme()));
        ImageView createImageView = createImageView(z11);
        this.infoTitleIv = createImageView;
        TextAtomV2View createAtomView = createAtomView();
        this.infoTitleTav = createAtomView;
        addViewInLayout(createImageView, 0, createImageView.getLayoutParams());
        addViewInLayout(createAtomView, 1, createAtomView.getLayoutParams());
        requestLayout();
    }

    private final TextAtomV2View createAtomView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.infoTitleTav);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(TEXT_WIDTH, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Dimens.INSTANCE.getDP_8(), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setGravity(17);
        return textAtomV2View;
    }

    private final ImageView createImageView(boolean isBigState) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.infoIconIv);
        int i11 = isBigState ? BIG_STATE_SIZE : SMALL_STATE_SIZE;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i11, i11));
        setGravity(17);
        return imageView;
    }

    public final void bind(@NotNull GalleryV4VO.Item.Info item) {
        Intrinsics.checkNotNullParameter(item, "item");
        GalleryV4VO.ContainerConfig containerConfig = item.getContainerConfig();
        if (containerConfig.getContainerWidth() != null) {
            Integer containerWidth = containerConfig.getContainerWidth();
            int i11 = this.width;
            if (containerWidth == null || containerWidth.intValue() != i11) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = containerConfig.getContainerWidth().intValue();
                setLayoutParams(layoutParams);
            }
        }
        int i12 = item.getIsBigState() ? BIG_STATE_SIZE : SMALL_STATE_SIZE;
        if (this.infoTitleIv.getMeasuredHeight() != i12) {
            ImageView imageView = this.infoTitleIv;
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = i12;
            layoutParams2.width = i12;
            imageView.setLayoutParams(layoutParams2);
        }
        ImageView imageView2 = this.infoTitleIv;
        Icon icon = item.getIcon();
        ImageViewExtKt.load$default(imageView2, icon != null ? icon.getImage() : null, null, null, null, null, false, null, 126, null);
        TextHolderKt.bind$default(this.infoTitleTav, item.getTitle(), null, 2, null);
    }
}
