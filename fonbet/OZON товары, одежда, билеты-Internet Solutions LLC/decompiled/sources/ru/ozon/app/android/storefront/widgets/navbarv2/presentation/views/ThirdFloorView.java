package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarHorizontalPaddings;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0010\u001a\u00020\rH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ThirdFloorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalPaddings", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "resolvePaddings", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThirdFloorView extends FrameLayout {
    private ShellNavBarHorizontalPaddings horizontalPaddings;
    public static final int $stable = 8;
    private static final int defaultPadding = UiExtKt.toPx(Paddings.NONE.getPx());

    public /* synthetic */ ThirdFloorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        resolvePaddings();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void resolvePaddings(ShellNavBarHorizontalPaddings horizontalPaddings) {
        this.horizontalPaddings = horizontalPaddings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdFloorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void resolvePaddings() {
        Paddings rightPadding;
        Paddings leftPadding;
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings = this.horizontalPaddings;
        int px = (shellNavBarHorizontalPaddings == null || (leftPadding = shellNavBarHorizontalPaddings.getLeftPadding()) == null) ? defaultPadding : UiExtKt.toPx(leftPadding.getPx());
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings2 = this.horizontalPaddings;
        int px2 = (shellNavBarHorizontalPaddings2 == null || (rightPadding = shellNavBarHorizontalPaddings2.getRightPadding()) == null) ? defaultPadding : UiExtKt.toPx(rightPadding.getPx());
        if (px == getPaddingLeft() && px2 == getPaddingRight()) {
            return;
        }
        setPadding(px, 0, px2, 0);
    }
}
