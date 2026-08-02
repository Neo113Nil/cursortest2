package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.views;

import Bi.b;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.cml.orders.R$id;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesView;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.common.ext.Dimens;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data.TextIconDTO;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewItems.DeliveryOrderOnDetailsVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/views/DeliveryOrderOnDetailsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "()V", "setupConstraints", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "paddings", "setVerticalPaddings", "(Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "titleIconView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getTitleIconView", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "textAtomsVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getTextAtomsVAL", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;", "imagesView", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;", "getImagesView", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/views/BadgeTouchHelper;", "touchHelper$delegate", "LSc/j;", "getTouchHelper", "()Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/views/BadgeTouchHelper;", "touchHelper", "badgeTouchAreaRightInset", "I", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderOnDetailsView extends ConstraintLayout {
    private int badgeTouchAreaRightInset;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final ImagesView imagesView;

    @NotNull
    private final VerticalAtomsLayout textAtomsVAL;

    @NotNull
    private final IconButtonV3View titleIconView;

    @NotNull
    private final TextAtomV2View titleTextView;

    /* renamed from: touchHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j touchHelper;

    public /* synthetic */ DeliveryOrderOnDetailsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final BadgeTouchHelper getTouchHelper() {
        return (BadgeTouchHelper) this.touchHelper.getValue();
    }

    private final void initView() {
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDp16(), dimens.getDp8(), dimens.getDp16(), dimens.getDp6());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    private final void setVerticalPaddings(VerticalPadding paddings) {
        CommonCellSettings.LayoutPadding bottom;
        CommonCellSettings.LayoutPadding top;
        setPadding(getPaddingStart(), (paddings == null || (top = paddings.getTop()) == null) ? getPaddingTop() : (int) getContext().getResources().getDimension(top.getCellLayoutPadding()), getPaddingEnd(), (paddings == null || (bottom = paddings.getBottom()) == null) ? getPaddingBottom() : (int) getContext().getResources().getDimension(bottom.getCellLayoutPadding()));
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new DeliveryOrderOnDetailsView$setupConstraints$1(this));
    }

    public final void bind(@NotNull DeliveryOrderOnDetailsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setVerticalPaddings(item.getVerticalPadding());
        TextAtomV2View textAtomV2View = this.titleTextView;
        TextIconDTO titleTextIcon = item.getTitleTextIcon();
        TextHolderKt.bindOrGone$default(textAtomV2View, titleTextIcon != null ? titleTextIcon.getStatus() : null, null, 2, null);
        IconButtonV3View iconButtonV3View = this.titleIconView;
        TextIconDTO titleTextIcon2 = item.getTitleTextIcon();
        IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View, titleTextIcon2 != null ? titleTextIcon2.getIconButton() : null, null, 2, null);
        BadgeHolderKt.bindOrGone(this.badgeView, item.getBadge(), actionHandler);
        TextIconDTO titleTextIcon3 = item.getTitleTextIcon();
        IconButtonV3DTO iconButton = titleTextIcon3 != null ? titleTextIcon3.getIconButton() : null;
        Dimens dimens = Dimens.INSTANCE;
        this.badgeTouchAreaRightInset = iconButton != null ? dimens.getDp8() : dimens.getDp16();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (getTouchHelper().dispatchTouchEventToBadge(ev, this.badgeView, this.badgeTouchAreaRightInset)) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @NotNull
    public final BadgeView getBadgeView() {
        return this.badgeView;
    }

    @NotNull
    public final ImagesView getImagesView() {
        return this.imagesView;
    }

    @NotNull
    public final VerticalAtomsLayout getTextAtomsVAL() {
        return this.textAtomsVAL;
    }

    @NotNull
    public final IconButtonV3View getTitleIconView() {
        return this.titleIconView;
    }

    @NotNull
    public final TextAtomV2View getTitleTextView() {
        return this.titleTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryOrderOnDetailsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.deliveryOrderOnDetails_title, 0, -2);
        d11.f41595B = 0;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.titleTextView = textAtomV2View;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(R$id.deliveryOrderOnDetails_titleIcon);
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconButtonV3View);
        this.titleIconView = iconButtonV3View;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.deliveryOrderOnDetails_textAtoms);
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(verticalAtomsLayout);
        this.textAtomsVAL = verticalAtomsLayout;
        int i12 = 0;
        ImagesView imagesView = new ImagesView(context, null, 0, i12, 14, null);
        imagesView.setId(R$id.deliveryOrderOnDetails_images);
        imagesView.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(imagesView);
        this.imagesView = imagesView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.deliveryOrderOnDetails_badge, -2, -2);
        a11.f41595B = 0;
        badgeView.setLayoutParams(a11);
        addView(badgeView);
        this.badgeView = badgeView;
        this.touchHelper = UtilsKt.unsafeLazy(DeliveryOrderOnDetailsView$touchHelper$2.INSTANCE);
        initView();
        setupConstraints();
    }
}
