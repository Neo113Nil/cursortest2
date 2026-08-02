package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.ItemNavSliderV3Binding;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3ItemVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001aJ\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/fresh/main/databinding/ItemNavSliderV3Binding;", "maxRightIndent", "", "backgroundImageHeight", "backgroundImageFullWidth", "backgroundImageHalfWidth", "imageSizeFullWidth", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSizeOtherWidth", "bindOrGone", "", "item", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getImageSize", "position", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType;", "defineCellSize", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationSliderV3ItemView extends ConstraintLayout {
    private final int backgroundImageFullWidth;
    private final int backgroundImageHalfWidth;
    private final int backgroundImageHeight;

    @NotNull
    private final ItemNavSliderV3Binding binding;

    @NotNull
    private final ImageSize imageSizeFullWidth;

    @NotNull
    private final ImageSize imageSizeOtherWidth;
    private final float maxRightIndent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationSliderV3ItemVO.PositionType.values().length];
            try {
                iArr[NavigationSliderV3ItemVO.PositionType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV3ItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void defineCellSize(NavigationSliderV3ItemVO.PositionType position) {
        if (position == NavigationSliderV3ItemVO.PositionType.FULL_WIDTH) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 2.0f;
            setLayoutParams(layoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.weight = 1.0f;
        setLayoutParams(layoutParams4);
    }

    private final ImageSize getImageSize(NavigationSliderV3ItemVO.PositionType position) {
        return WhenMappings.$EnumSwitchMapping$0[position.ordinal()] == 1 ? this.imageSizeFullWidth : this.imageSizeOtherWidth;
    }

    public final void bindOrGone(@NotNull NavigationSliderV3ItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        defineCellSize(item.getSettings().getPosition());
        TextAtomView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextAtomHolderKt.bindOrGone$default(titleTv, item.getData().getTitle(), null, 2, null);
        this.binding.rightIndent.c(1 - (item.getSettings().getRightIndent() / this.maxRightIndent));
        AspectRatioImageView aspectRatioImageView = this.binding.backgroundIv;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        aspectRatioImageView.setBackgroundColor(styleParser.parseColor(context, item.getData().getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE));
        this.binding.backgroundIv.setRatio(Float.valueOf(item.getRatio()));
        AspectRatioImageView backgroundIv = this.binding.backgroundIv;
        Intrinsics.checkNotNullExpressionValue(backgroundIv, "backgroundIv");
        ImageViewExtKt.load$default(backgroundIv, item.getData().getImage(), null, null, null, getImageSize(item.getSettings().getPosition()), false, null, 110, null);
        BadgeView advBadgeV2 = this.binding.advBadgeV2;
        Intrinsics.checkNotNullExpressionValue(advBadgeV2, "advBadgeV2");
        BadgeHolderKt.bindOrGone(advBadgeV2, item.getData().getAdvBadgeV2(), actionHandler);
    }

    public /* synthetic */ NavigationSliderV3ItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV3ItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxRightIndent = 100.0f;
        int px = ResourceExtKt.toPx(80);
        this.backgroundImageHeight = px;
        int px2 = ResourceExtKt.toPx(328);
        this.backgroundImageFullWidth = px2;
        int px3 = ResourceExtKt.toPx(158);
        this.backgroundImageHalfWidth = px3;
        this.imageSizeFullWidth = new ImageSize(px2, px);
        this.imageSizeOtherWidth = new ImageSize(px3, px);
        this.binding = ItemNavSliderV3Binding.inflate(LayoutInflater.from(context), this, true);
    }
}
