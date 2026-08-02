package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.utils.RoundedViewCorners;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfItemVO;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfRowVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/optimized/CatalogShelfRowView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "firstItemView", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/optimized/CatalogShelfItemViewNew;", "secondItemView", "thirdItemView", "listOfView", "", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "bindItems", "", "item", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setCorners", "bottomCorners", "", "topCorners", "applyTopCorners", "applyBottomCorners", "applyFullCorners", "clearCorners", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfRowView extends LinearLayout {

    @NotNull
    private static final LinearLayout.LayoutParams BASE_LAYOUT_PARAMS;

    @NotNull
    private final CatalogShelfItemViewNew firstItemView;

    @NotNull
    private final List<CatalogShelfItemViewNew> listOfView;

    @NotNull
    private final CatalogShelfItemViewNew secondItemView;

    @NotNull
    private final CatalogShelfItemViewNew thirdItemView;

    @NotNull
    private final GradientDrawable topBackgroundLayer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int MARGIN_12 = ResourceExtKt.toPx(12);
    private static final int topPadding = ResourceExtKt.toPx(12);
    private static final int bottomPadding = ResourceExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/optimized/CatalogShelfRowView$Companion;", "", "<init>", "()V", "", "WEIGHT_SUM", "F", "LAYOUT_WEIGHT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(ResourceExtKt.toPx(4), 0, ResourceExtKt.toPx(4), 0);
        BASE_LAYOUT_PARAMS = layoutParams;
    }

    public /* synthetic */ CatalogShelfRowView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void applyBottomCorners() {
        ViewExtKt.updatePadding$default(this, 0, 0, 0, bottomPadding, 7, null);
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getBottomCorners());
    }

    private final void applyFullCorners() {
        ViewExtKt.updatePadding$default(this, 0, topPadding, 0, bottomPadding, 5, null);
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getFullCorners());
    }

    private final void applyTopCorners() {
        ViewExtKt.updatePadding$default(this, 0, topPadding, 0, 0, 13, null);
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getTopCorners());
    }

    private final void clearCorners() {
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getNoneCorners());
    }

    private final void setCorners(boolean bottomCorners, boolean topCorners) {
        clearCorners();
        if (topCorners) {
            applyTopCorners();
        }
        if (bottomCorners) {
            applyBottomCorners();
        }
        if (bottomCorners && topCorners) {
            applyFullCorners();
        }
    }

    public final void bindItems(@NotNull CatalogShelfRowVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setTag(item.getCatalogueTabsConnectionTag());
        setBackground(new LayerDrawable(new GradientDrawable[]{this.topBackgroundLayer}));
        setCorners(item.getBottomCorners(), item.getTopCorners());
        int i11 = 0;
        for (Object obj : this.listOfView) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CatalogShelfItemViewNew catalogShelfItemViewNew = (CatalogShelfItemViewNew) obj;
            CatalogShelfItemVO catalogShelfItemVO = (CatalogShelfItemVO) C7714v.Q(i11, item.getList());
            if (catalogShelfItemVO != null && indexOfChild(catalogShelfItemViewNew) == -1) {
                addView(catalogShelfItemViewNew);
            }
            catalogShelfItemViewNew.bindOrGone(catalogShelfItemVO, actionHandler);
            i11 = i12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogShelfRowView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i14 = 0;
        int i15 = 0;
        CatalogShelfItemViewNew catalogShelfItemViewNew = new CatalogShelfItemViewNew(context, attributeSet2, i14, i15, i13, defaultConstructorMarker);
        catalogShelfItemViewNew.setId(R$id.firstCategoryItem);
        catalogShelfItemViewNew.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = BASE_LAYOUT_PARAMS;
        catalogShelfItemViewNew.setLayoutParams(layoutParams);
        this.firstItemView = catalogShelfItemViewNew;
        CatalogShelfItemViewNew catalogShelfItemViewNew2 = new CatalogShelfItemViewNew(context, attributeSet2, i14, i15, i13, defaultConstructorMarker);
        catalogShelfItemViewNew2.setId(R$id.secondCategoryItem);
        catalogShelfItemViewNew2.setVisibility(8);
        catalogShelfItemViewNew2.setLayoutParams(layoutParams);
        this.secondItemView = catalogShelfItemViewNew2;
        CatalogShelfItemViewNew catalogShelfItemViewNew3 = new CatalogShelfItemViewNew(context, attributeSet2, i14, i15, i13, defaultConstructorMarker);
        catalogShelfItemViewNew3.setId(R$id.thirdCategoryItem);
        catalogShelfItemViewNew3.setVisibility(8);
        catalogShelfItemViewNew3.setLayoutParams(layoutParams);
        this.thirdItemView = catalogShelfItemViewNew3;
        this.listOfView = C7714v.b0(catalogShelfItemViewNew, catalogShelfItemViewNew2, catalogShelfItemViewNew3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, UniColors.LAYER_FLOOR_1.getResId()));
        this.topBackgroundLayer = gradientDrawable;
        setId(R$id.shelfRowLl);
        int i16 = MARGIN_12;
        ViewExtKt.updatePadding(this, i16, 0, i16, 0);
        setOrientation(0);
        setWeightSum(3.0f);
    }
}
