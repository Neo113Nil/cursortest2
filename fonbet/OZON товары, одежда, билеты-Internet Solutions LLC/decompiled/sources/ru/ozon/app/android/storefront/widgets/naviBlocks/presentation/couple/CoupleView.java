package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp4", "topItemView", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleBlockItemView;", "bottomItemView", "setOnAction", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bind", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoupleView extends LinearLayout {

    @NotNull
    private final CoupleBlockItemView bottomItemView;
    private final int dp4;

    @NotNull
    private final CoupleBlockItemView topItemView;

    public /* synthetic */ CoupleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull CoupleNaviBlockVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.topItemView.bind(item.getTopItem());
        this.bottomItemView.bind(item.getBottomItem());
    }

    public final void setOnAction(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.topItemView.setOnAction(actionHandler);
        this.bottomItemView.setOnAction(actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoupleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4);
        this.dp4 = px;
        CoupleBlockItemView coupleBlockItemView = new CoupleBlockItemView(context, null, 0, 6, null);
        coupleBlockItemView.setId(R$id.topCoupleBlock);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = px;
        coupleBlockItemView.setLayoutParams(layoutParams);
        coupleBlockItemView.setItemPosition(ItemPosition.TOP);
        this.topItemView = coupleBlockItemView;
        CoupleBlockItemView coupleBlockItemView2 = new CoupleBlockItemView(context, null, 0, 6, null);
        coupleBlockItemView2.setId(R$id.bottomCoupleBlock);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = px;
        coupleBlockItemView2.setLayoutParams(layoutParams2);
        coupleBlockItemView2.setItemPosition(ItemPosition.BOTTOM);
        this.bottomItemView = coupleBlockItemView2;
        setOrientation(1);
        addView(coupleBlockItemView);
        addView(coupleBlockItemView2);
    }
}
