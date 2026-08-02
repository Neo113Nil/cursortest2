package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.coupleNew;

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
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.ItemPosition;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/coupleNew/CoupleViewNew;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "topItemView", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/coupleNew/CoupleBlockItemViewNew;", "bottomItemView", "setOnAction", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bind", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoupleViewNew extends LinearLayout {

    @NotNull
    private final CoupleBlockItemViewNew bottomItemView;

    @NotNull
    private final CoupleBlockItemViewNew topItemView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp4 = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/coupleNew/CoupleViewNew$Companion;", "", "<init>", "()V", "dp4", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CoupleViewNew(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
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
    public CoupleViewNew(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        CoupleBlockItemViewNew coupleBlockItemViewNew = new CoupleBlockItemViewNew(context, attributeSet2, i13, i12, defaultConstructorMarker);
        coupleBlockItemViewNew.setId(R$id.topCoupleBlock);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i14 = dp4;
        layoutParams.bottomMargin = i14;
        coupleBlockItemViewNew.setLayoutParams(layoutParams);
        coupleBlockItemViewNew.setItemPosition(ItemPosition.TOP);
        this.topItemView = coupleBlockItemViewNew;
        CoupleBlockItemViewNew coupleBlockItemViewNew2 = new CoupleBlockItemViewNew(context, attributeSet2, i13, i12, defaultConstructorMarker);
        coupleBlockItemViewNew2.setId(R$id.bottomCoupleBlock);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = i14;
        coupleBlockItemViewNew2.setLayoutParams(layoutParams2);
        coupleBlockItemViewNew2.setItemPosition(ItemPosition.BOTTOM);
        this.bottomItemView = coupleBlockItemViewNew2;
        setOrientation(1);
        addView(coupleBlockItemViewNew);
        addView(coupleBlockItemViewNew2);
    }
}
