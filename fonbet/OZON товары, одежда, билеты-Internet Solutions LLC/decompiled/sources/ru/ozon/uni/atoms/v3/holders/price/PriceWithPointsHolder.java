package ru.ozon.uni.atoms.v3.holders.price;

import Am.C2438a;
import B0.C2454a;
import Pk0.b;
import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithPointsView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.price.PriceWithPoints;
import ru.ozon.uni.atoms.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001.B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010%\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u0010+\u001a\u00020\u000e2\b\b\u0001\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/price/PriceWithPointsHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/price/PriceWithPoints;", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceWithPointsView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/price/PriceWithPointsView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "dp16", "", "dp20", "dp6", "dp4", "dp2", "dp4F", "", "dp6F", "onBind", "", "item", "bindPrice", "priceModel", "Lru/ozon/uni/atoms/data/price/PriceWithPoints$Price;", "bindPoints", "pointsModel", "Lru/ozon/uni/atoms/data/price/PriceWithPoints$Points;", "bindPointsText", "points", "pointsThemesParameters", "Lru/ozon/uni/atoms/v3/holders/price/PriceWithPointsHolder$PointsThemesParameters;", "bindIcons", "bindFirstIcon", "bindSecondIcon", "extractPointsThemeParameters", "themeType", "Lru/ozon/uni/atoms/data/price/PriceWithPoints$ThemeType;", "hasSecondIcon", "", "extractIconsEndMargin", "baseMargin", "extractPriceStyle", "PointsThemesParameters", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceWithPointsHolder extends AtomV3<PriceWithPoints, PriceWithPointsView> implements WrappedAtomHolder {
    private final int dp16;
    private final int dp2;
    private final int dp20;
    private final int dp4;
    private final float dp4F;
    private final int dp6;
    private final float dp6F;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/price/PriceWithPointsHolder$PointsThemesParameters;", "", "", "pointsTextAppearance", "iconSize", "", "iconCornerRadius", "iconsEndMargin", "<init>", "(IIFI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPointsTextAppearance", "getIconSize", "F", "getIconCornerRadius", "()F", "getIconsEndMargin", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointsThemesParameters {
        private final float iconCornerRadius;
        private final int iconSize;
        private final int iconsEndMargin;
        private final int pointsTextAppearance;

        public PointsThemesParameters(int i11, int i12, float f7, int i13) {
            this.pointsTextAppearance = i11;
            this.iconSize = i12;
            this.iconCornerRadius = f7;
            this.iconsEndMargin = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointsThemesParameters)) {
                return false;
            }
            PointsThemesParameters pointsThemesParameters = (PointsThemesParameters) other;
            return this.pointsTextAppearance == pointsThemesParameters.pointsTextAppearance && this.iconSize == pointsThemesParameters.iconSize && Float.compare(this.iconCornerRadius, pointsThemesParameters.iconCornerRadius) == 0 && this.iconsEndMargin == pointsThemesParameters.iconsEndMargin;
        }

        public final float getIconCornerRadius() {
            return this.iconCornerRadius;
        }

        public final int getIconSize() {
            return this.iconSize;
        }

        public final int getIconsEndMargin() {
            return this.iconsEndMargin;
        }

        public final int getPointsTextAppearance() {
            return this.pointsTextAppearance;
        }

        public int hashCode() {
            return Integer.hashCode(this.iconsEndMargin) + b.a(this.iconCornerRadius, C2454a.a(this.iconSize, Integer.hashCode(this.pointsTextAppearance) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.pointsTextAppearance;
            int i12 = this.iconSize;
            float f7 = this.iconCornerRadius;
            int i13 = this.iconsEndMargin;
            StringBuilder a11 = C2438a.a("PointsThemesParameters(pointsTextAppearance=", i11, ", iconSize=", ", iconCornerRadius=", i12);
            a11.append(f7);
            a11.append(", iconsEndMargin=");
            a11.append(i13);
            a11.append(")");
            return a11.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceWithPoints.ThemeType.values().length];
            try {
                iArr[PriceWithPoints.ThemeType.THEME_TYPE_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceWithPoints.ThemeType.THEME_TYPE_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceWithPoints.ThemeType.THEME_TYPE_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceWithPoints.ThemeType.THEME_TYPE_X_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithPointsHolder(@NotNull PriceWithPointsView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.dp16 = ResourceExtKt.toPx(16);
        this.dp20 = ResourceExtKt.toPx(20);
        this.dp6 = ResourceExtKt.toPx(6);
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp2 = ResourceExtKt.toPx(2);
        this.dp4F = ResourceExtKt.toPxF(4);
        this.dp6F = ResourceExtKt.toPxF(6);
    }

    private final void bindFirstIcon(PriceWithPoints.Points points, PointsThemesParameters pointsThemesParameters) {
        PriceWithPointsView containerView = getContainerView();
        String firstIcon = points.getFirstIcon();
        if (firstIcon == null) {
            containerView.setFirstIconVisibility(false);
            return;
        }
        int iconSize = pointsThemesParameters.getIconSize();
        float iconCornerRadius = pointsThemesParameters.getIconCornerRadius();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, points.getFirstIconBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_NOTIFICATION);
        String secondIcon = points.getSecondIcon();
        containerView.setFirstIconsParams(iconSize, iconCornerRadius, parseColor, !(secondIcon == null || h.K(secondIcon)));
        ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageLoader.load(context2, firstIcon, pointsThemesParameters.getIconSize(), pointsThemesParameters.getIconSize(), new PriceWithPointsHolder$bindFirstIcon$1$1$1(containerView));
    }

    private final void bindIcons(PriceWithPoints.Points points, PointsThemesParameters pointsThemesParameters) {
        bindFirstIcon(points, pointsThemesParameters);
        bindSecondIcon(points, pointsThemesParameters);
    }

    private final void bindPoints(PriceWithPoints.Points pointsModel) {
        PriceWithPoints.ThemeType themeType;
        if (pointsModel == null || (themeType = pointsModel.getTheme()) == null) {
            themeType = PriceWithPoints.ThemeType.THEME_TYPE_SMALL;
        }
        String secondIcon = pointsModel != null ? pointsModel.getSecondIcon() : null;
        PointsThemesParameters extractPointsThemeParameters = extractPointsThemeParameters(themeType, !(secondIcon == null || h.K(secondIcon)));
        if (pointsModel != null) {
            bindPointsText(pointsModel, extractPointsThemeParameters);
            bindIcons(pointsModel, extractPointsThemeParameters);
            getContainerView().setIconsBlockMargin(extractPointsThemeParameters.getIconsEndMargin());
        } else {
            getContainerView().setPointsTextVisibility(false);
            getContainerView().setFirstIconVisibility(false);
            getContainerView().setSecondIconVisibility(false);
        }
    }

    private final void bindPointsText(PriceWithPoints.Points points, PointsThemesParameters pointsThemesParameters) {
        PriceWithPointsView containerView = getContainerView();
        String text = points.getText();
        int pointsTextAppearance = pointsThemesParameters.getPointsTextAppearance();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setPointsText(text, pointsTextAppearance, styleParser.parseColor(context, points.getColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
    }

    private final void bindSecondIcon(PriceWithPoints.Points points, PointsThemesParameters pointsThemesParameters) {
        PriceWithPointsView containerView = getContainerView();
        String secondIcon = points.getSecondIcon();
        if (secondIcon == null) {
            containerView.setSecondIconVisibility(false);
            return;
        }
        int iconSize = pointsThemesParameters.getIconSize();
        float iconCornerRadius = pointsThemesParameters.getIconCornerRadius();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setSecondIconsParams(iconSize, iconCornerRadius, styleParser.parseColor(context, points.getSecondIconBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_CTRL_MARKETING));
        ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageLoader.load(context2, secondIcon, pointsThemesParameters.getIconSize(), pointsThemesParameters.getIconSize(), new PriceWithPointsHolder$bindSecondIcon$1$1$1(containerView));
    }

    private final int extractIconsEndMargin(int baseMargin, boolean hasSecondIcon) {
        return hasSecondIcon ? baseMargin - this.dp2 : baseMargin;
    }

    private final PointsThemesParameters extractPointsThemeParameters(PriceWithPoints.ThemeType themeType, boolean hasSecondIcon) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i11 == 1) {
            return new PointsThemesParameters(R$style.TextStyle_Caption_Bold, this.dp16, this.dp4F, extractIconsEndMargin(this.dp4, hasSecondIcon));
        }
        if (i11 == 2) {
            return new PointsThemesParameters(R$style.TextStyle_Body_M_Bold, this.dp20, this.dp6F, extractIconsEndMargin(this.dp4, hasSecondIcon));
        }
        if (i11 == 3) {
            return new PointsThemesParameters(R$style.TextStyle_Body_L_Bold, this.dp20, this.dp6F, extractIconsEndMargin(this.dp4, hasSecondIcon));
        }
        if (i11 == 4) {
            return new PointsThemesParameters(R$style.TextStyle_Body_XL_Bold, this.dp20, this.dp6F, extractIconsEndMargin(this.dp6, hasSecondIcon));
        }
        throw new o();
    }

    private final int extractPriceStyle(PriceWithPoints.ThemeType themeType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i11 == 1) {
            return R$style.TextStyle_Body_M_Bold;
        }
        if (i11 == 2) {
            return R$style.TextStyle_Body_L_Bold;
        }
        if (i11 == 3) {
            return R$style.TextStyle_Body_XL_Bold;
        }
        if (i11 == 4) {
            return R$style.TextStyle_Head_XL;
        }
        throw new o();
    }

    public final void bindPrice(PriceWithPoints.Price priceModel) {
        PriceWithPointsView containerView = getContainerView();
        if (priceModel == null) {
            containerView.setPriceVisibility(false);
            return;
        }
        String text = priceModel.getText();
        PriceWithPoints.ThemeType theme = priceModel.getTheme();
        if (theme == null) {
            theme = PriceWithPoints.ThemeType.THEME_TYPE_MEDIUM;
        }
        int extractPriceStyle = extractPriceStyle(theme);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setPrice(text, extractPriceStyle, styleParser.parseColor(context, priceModel.getColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull PriceWithPoints item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((PriceWithPointsHolder) item);
        bindPrice(item.getPrice());
        bindPoints(item.getPoints());
        PriceWithPointsView containerView = getContainerView();
        TestInfo testInfo = item.getTestInfo();
        containerView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceWithPointsHolder(@NotNull Context context, String str) {
        this(new PriceWithPointsView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
