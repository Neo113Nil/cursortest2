package ru.ozon.app.android.fresh.main.widgets.customCell.presentation;

import B3.D;
import Kk.C3531a;
import Sc.o;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.customCell.data.CustomCellDTO;
import ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellVO;
import ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellView;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.IslandDrawable;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "constraintLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "icon1", "Lru/ozon/uni/android/atom/icon/IconView;", "icon2", "icon3", "largeImage", "Lru/ozon/uni/android/atom/image/Image;", "paranjaView", "Landroid/view/View;", "paranjaDrawable", "Landroid/graphics/drawable/GradientDrawable;", "contentGradientDrawable", "bind", "", "customCellVO", "Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO;", "clickListener", "Landroid/view/View$OnClickListener;", "bindBackground", "setPaddings", "bindCellView", "bindImagesBlock", "imagesBlock", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock$ImagesBlock;", "bindParanja", "gradient", "", "bindImageUrl", "imageUrl", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$RightBlock$SingleImage;", "calculateHeight", "calculateWidthCellView", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomCellView extends FrameLayout {

    @NotNull
    private static final float[] islandCorners;

    @NotNull
    private static final ShapeDrawable roundedDrawable;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final ConstraintLayout constraintLayout;

    @NotNull
    private final GradientDrawable contentGradientDrawable;

    @NotNull
    private final IconView icon1;

    @NotNull
    private final IconView icon2;

    @NotNull
    private final IconView icon3;

    @NotNull
    private final Image largeImage;

    @NotNull
    private final GradientDrawable paranjaDrawable;

    @NotNull
    private final View paranjaView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int imageHeight = UiExtKt.toPx(44);
    private static final int imageWidthLarge = UiExtKt.toPx(108);
    private static final int imageContainerHeight = UiExtKt.toPx(54);
    private static final int imageContainerWidth = UiExtKt.toPx(120);
    private static final int imagesSpaceBetween = UiExtKt.toPx(2);
    private static final int imagesStartMargin = UiExtKt.toPx(8);
    private static final int paranjaWidth = UiExtKt.toPx(20);
    private static final float DP_16F = UiExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellView$Companion;", "", "<init>", "()V", "", "DP_16F", "F", "getDP_16F", "()F", "", "CUSTOM_CELL_RIGHT_AREA", "Ljava/lang/String;", "", "INDEX_FIRST_IMAGE", "I", "INDEX_SECOND_IMAGE", "INDEX_THIRD_IMAGE", "COUNT_HORIZONTAL_PADDINGS", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getDP_16F() {
            return CustomCellView.DP_16F;
        }

        private Companion() {
        }
    }

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = UiExtKt.toPxF(12);
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(0);
        roundedDrawable = shapeDrawable;
        float[] fArr2 = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr2[i12] = DP_16F;
        }
        islandCorners = fArr2;
    }

    public /* synthetic */ CustomCellView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(CustomCellVO customCellVO) {
        Color.Gradient gradient;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String backgroundColor = customCellVO.getBackgroundColor();
        UniColors uniColors = UniColors.CLEAR_LIGHT_KEY_0;
        setBackground(new ColorDrawable(styleParser.parseColor(context, backgroundColor, uniColors.getResId())));
        if (customCellVO.getContentColor().getColor() != null) {
            ConstraintLayout constraintLayout = this.constraintLayout;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int parseColor = styleParser.parseColor(context2, customCellVO.getBackgroundColor(), uniColors.getResId());
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            constraintLayout.setBackground(new IslandDrawable(parseColor, styleParser.parseColor(context3, customCellVO.getContentColor().getColor(), uniColors.getResId()), islandCorners, customCellVO.getSpacers().getHorizontal(), customCellVO.getSpacers().getTop(), customCellVO.getSpacers().getHorizontal(), customCellVO.getSpacers().getBottom()));
            return;
        }
        if (customCellVO.getContentColor().getGradient() != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(customCellVO.getContentColor().getGradient());
            if (gradientByToken != null) {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                gradient = TokensExtKt.toGradient(gradientByToken, context4);
            } else {
                gradient = null;
            }
            GradientDrawable gradientDrawable = this.contentGradientDrawable;
            gradientDrawable.setOrientation(gradient != null ? gradient.getOrientation() : null);
            gradientDrawable.setColors(gradient != null ? gradient.getColors() : null);
            gradientDrawable.setCornerRadii(islandCorners);
            this.constraintLayout.setBackground(new InsetDrawable((Drawable) this.contentGradientDrawable, customCellVO.getSpacers().getHorizontal(), customCellVO.getSpacers().getTop(), customCellVO.getSpacers().getHorizontal(), customCellVO.getSpacers().getBottom()));
        }
    }

    private final void bindCellView(CustomCellVO customCellVO, View.OnClickListener clickListener) {
        CellView cellView = this.cellView;
        ConstraintLayout.b bVar = new ConstraintLayout.b(calculateWidthCellView(customCellVO), 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41628e = 0;
        cellView.setLayoutParams(bVar);
        this.constraintLayout.addView(this.cellView);
        CellHolderKt.bindOrGone$default(this.cellView, customCellVO.getCell(), null, 2, null);
        this.cellView.setOnClickListener(clickListener);
        this.cellView.setAnimation(null);
    }

    private final void bindImageUrl(CustomCellDTO.RightBlock.SingleImage imageUrl, View.OnClickListener clickListener) {
        this.constraintLayout.addView(this.largeImage);
        ImageHolderKt.bindOrGone$default(this.largeImage, imageUrl.getImage(), null, 2, null);
        this.largeImage.setOnClickListener(clickListener);
        this.largeImage.setLocatorTag("CUSTOM_CELL_RIGHT_BLOCK_LARGE_IMAGE");
    }

    private final void bindImagesBlock(CustomCellDTO.RightBlock.ImagesBlock imagesBlock, View.OnClickListener clickListener) {
        int i11 = (imageContainerWidth - imageHeight) - imagesStartMargin;
        IconView iconView = this.icon1;
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMargins(0, 0, i11, 0);
        iconView.setLayoutParams(bVar);
        this.constraintLayout.addView(this.icon1);
        IconHolderKt.bindOrGone$default(this.icon1, imagesBlock.getIcons().get(0), null, 2, null);
        this.icon1.setOnClickListener(clickListener);
        this.constraintLayout.addView(this.icon2);
        if (imagesBlock.getIcons().size() > 1) {
            IconHolderKt.bindOrGone$default(this.icon2, imagesBlock.getIcons().get(1), null, 2, null);
        }
        this.icon2.setOnClickListener(clickListener);
        this.constraintLayout.addView(this.icon3);
        if (imagesBlock.getIcons().size() > 2) {
            IconHolderKt.bindOrGone$default(this.icon3, imagesBlock.getIcons().get(2), null, 2, null);
        }
        this.icon3.setOnClickListener(clickListener);
        this.icon1.setLocatorTag("CUSTOM_CELL_RIGHT_BLOCK_ICON1");
        this.icon2.setLocatorTag("CUSTOM_CELL_RIGHT_BLOCK_ICON2");
        this.icon3.setLocatorTag("CUSTOM_CELL_RIGHT_BLOCK_ICON3");
    }

    private final void bindParanja(String gradient, View.OnClickListener clickListener) {
        Color.Gradient gradient2;
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(gradient);
        if (gradientByToken != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradient2 = TokensExtKt.toGradient(gradientByToken, context);
        } else {
            gradient2 = null;
        }
        GradientDrawable gradientDrawable = this.paranjaDrawable;
        gradientDrawable.setOrientation(gradient2 != null ? gradient2.getOrientation() : null);
        gradientDrawable.setColors(gradient2 != null ? gradient2.getColors() : null);
        this.paranjaView.setBackground(this.paranjaDrawable);
        this.constraintLayout.addView(this.paranjaView);
        this.paranjaView.setOnClickListener(clickListener);
    }

    private final int calculateHeight(CustomCellVO customCellVO) {
        return customCellVO.getSpacers().getBottom() + customCellVO.getSpacers().getTop() + imageContainerHeight;
    }

    private final int calculateWidthCellView(CustomCellVO customCellVO) {
        int horizontal = getContext().getResources().getDisplayMetrics().widthPixels - (customCellVO.getSpacers().getHorizontal() * 2);
        return customCellVO.getBlock() != null ? horizontal - imageContainerWidth : horizontal;
    }

    private final void setPaddings(CustomCellVO customCellVO) {
        CustomCellVO.PaddingsVO spacers = customCellVO.getSpacers();
        this.constraintLayout.setPadding(spacers.getHorizontal(), spacers.getTop(), spacers.getHorizontal(), spacers.getBottom());
    }

    public final void bind(@NotNull final CustomCellVO customCellVO, @NotNull View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(customCellVO, "customCellVO");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.constraintLayout.removeAllViews();
        removeAllViews();
        this.constraintLayout.setOnClickListener(clickListener);
        addView(this.constraintLayout);
        this.constraintLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellView$bind$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                CustomCellView.Companion companion;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                int horizontal = CustomCellVO.this.getSpacers().getHorizontal();
                int top = CustomCellVO.this.getSpacers().getTop();
                int width = view.getWidth() - CustomCellVO.this.getSpacers().getHorizontal();
                int height = view.getHeight() - CustomCellVO.this.getSpacers().getBottom();
                companion = CustomCellView.Companion;
                outline.setRoundRect(horizontal, top, width, height, companion.getDP_16F());
            }
        });
        getLayoutParams().height = calculateHeight(customCellVO);
        setPaddings(customCellVO);
        bindBackground(customCellVO);
        bindCellView(customCellVO, clickListener);
        CustomCellDTO.RightBlock block = customCellVO.getBlock();
        if (block instanceof CustomCellDTO.RightBlock.SingleImage) {
            bindImageUrl((CustomCellDTO.RightBlock.SingleImage) customCellVO.getBlock(), clickListener);
        } else if (block instanceof CustomCellDTO.RightBlock.ImagesBlock) {
            bindImagesBlock((CustomCellDTO.RightBlock.ImagesBlock) customCellVO.getBlock(), clickListener);
            bindParanja(((CustomCellDTO.RightBlock.ImagesBlock) customCellVO.getBlock()).getGradient(), clickListener);
        } else if (block != null) {
            throw new o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCellView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R$id.customCellContent);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        constraintLayout.setClipToOutline(true);
        this.constraintLayout = constraintLayout;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.cell);
        this.cellView = cellView;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.image1);
        int i12 = imageHeight;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i12, i12);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41634h = 0;
        iconView.setLayoutParams(bVar);
        ShapeDrawable shapeDrawable = roundedDrawable;
        iconView.setBackground(shapeDrawable);
        iconView.setClipToOutline(true);
        this.icon1 = iconView;
        IconView iconView2 = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView2, R$id.image2, i12, i12);
        a11.f41636i = 0;
        a11.f41642l = 0;
        a11.f41630f = iconView.getId();
        int i13 = imagesSpaceBetween;
        a11.setMargins(i13, 0, 0, 0);
        iconView2.setLayoutParams(a11);
        iconView2.setBackground(shapeDrawable);
        iconView2.setClipToOutline(true);
        this.icon2 = iconView2;
        IconView iconView3 = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a12 = C3531a.a(iconView3, R$id.image3, i12, i12);
        a12.f41636i = 0;
        a12.f41642l = 0;
        a12.f41630f = iconView2.getId();
        a12.setMargins(i13, 0, 0, 0);
        iconView3.setLayoutParams(a12);
        iconView3.setBackground(shapeDrawable);
        iconView3.setClipToOutline(true);
        this.icon3 = iconView3;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.image1);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(imageWidthLarge, 0);
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        bVar2.f41634h = 0;
        image.setLayoutParams(bVar2);
        image.setClipToOutline(true);
        this.largeImage = image;
        View view = new View(context);
        view.setId(R$id.paranja);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(paranjaWidth, 0);
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        bVar3.f41634h = 0;
        view.setLayoutParams(bVar3);
        this.paranjaView = view;
        this.paranjaDrawable = D.b(0);
        this.contentGradientDrawable = D.b(0);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToOutline(true);
    }
}
