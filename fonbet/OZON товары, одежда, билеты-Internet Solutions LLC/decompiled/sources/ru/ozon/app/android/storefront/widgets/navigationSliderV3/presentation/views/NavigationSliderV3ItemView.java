package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.vo.NavigationSliderV3VO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/views/NavigationSliderV3ItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "setContent", "", "item", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO$NavigationItemV3;", "createImage", "createTitle", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderV3ItemView extends LinearLayout {

    @NotNull
    private final Image imageView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable | Image.$stable;
    private static final int imageBottomMargin = UiExtKt.toPx(4);
    private static final int minItemHeight = UiExtKt.toPx(104);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/views/NavigationSliderV3ItemView$Companion;", "", "<init>", "()V", "", "MIN_LINES", "I", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavigationSliderV3ItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Image createImage() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.navSliderImage);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = imageBottomMargin;
        image.setLayoutParams(layoutParams);
        image.setAdjustViewBounds(true);
        return image;
    }

    private final TextAtomV2View createTitle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.navSliderTitle);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setMinLines(2);
        return textAtomV2View;
    }

    public final void setContent(@NotNull NavigationSliderV3VO.NavigationItemV3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = item.getItemWidth();
        setLayoutParams(layoutParams);
        Image image = this.imageView;
        ViewGroup.LayoutParams layoutParams2 = image.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.width = item.getItemWidth();
        layoutParams3.height = item.getItemWidth();
        image.setLayoutParams(layoutParams3);
        ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        this.titleView.setMovementMethod(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV3ItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Image createImage = createImage();
        this.imageView = createImage;
        TextAtomV2View createTitle = createTitle();
        this.titleView = createTitle;
        setId(R$id.navSliderItem);
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setMinimumHeight(minItemHeight);
        addView(createImage);
        addView(createTitle);
    }
}
