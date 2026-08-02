package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewHolder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesView;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewItem.ElementVI;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewHolder/ElementView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cell", "Lru/ozon/uni/android/cell/CellView;", "imagesView", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;", "getImagesView", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "element", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewItem/ElementVI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setIsActive", "isActive", "", "addViews", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ElementView extends LinearLayout {

    @NotNull
    private final BadgeView badge;

    @NotNull
    private final CellView cell;

    @NotNull
    private final ImagesView imagesView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = (BadgeView.$stable | ImagesView.$stable) | CellView.$stable;
    private static final int ID_CELL = View.generateViewId();
    private static final int ID_IMAGES = View.generateViewId();
    private static final int ID_BADGE = View.generateViewId();
    private static final int HORIZONTAL_MARGIN = UiExtKt.toPx(32);
    private static final int TOP_IMAGES_MARGIN = UiExtKt.toPx(6);
    private static final int TOP_BADGE_MARGIN = UiExtKt.toPx(14);
    private static final int CONTAINER_PADDING = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewHolder/ElementView$Companion;", "", "<init>", "()V", "", "DISABLED_OPACITY", "F", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ElementView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.cell);
        addView(this.imagesView);
        addView(this.badge);
    }

    private final void setIsActive(boolean isActive) {
        setEnabled(isActive);
        float f7 = isActive ? 1.0f : 0.45f;
        this.cell.setAlpha(f7);
        this.imagesView.setAlpha(f7);
    }

    public final void bind(@NotNull ElementVI element, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellHolderKt.bind(this.cell, element.getCell(), actionHandler);
        BadgeHolderKt.bindOrGone(this.badge, element.getBadge(), actionHandler);
        setIsActive(element.getIsActive());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, element.getBackgroundColor());
        if (parseColor != null) {
            setBackgroundColor(parseColor.intValue());
        }
    }

    @NotNull
    public final ImagesView getImagesView() {
        return this.imagesView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElementView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(ID_CELL);
        cellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.cell = cellView;
        ImagesView imagesView = new ImagesView(context, null, 0, 0, 14, null);
        imagesView.setId(ID_IMAGES);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i12 = HORIZONTAL_MARGIN;
        layoutParams.setMargins(i12, TOP_IMAGES_MARGIN, 0, 0);
        imagesView.setLayoutParams(layoutParams);
        this.imagesView = imagesView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(ID_BADGE);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(i12, TOP_BADGE_MARGIN, 0, 0);
        badgeView.setLayoutParams(layoutParams2);
        this.badge = badgeView;
        setOrientation(1);
        addViews();
        int i13 = CONTAINER_PADDING;
        setPadding(i13, i13, i13, i13);
    }
}
