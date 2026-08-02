package ru.ozon.app.android.returns.edit.presentation.sticky;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import y7.k;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/sticky/ReturnEditStickyView;", "Lcom/google/android/material/card/MaterialCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "marinTop", "marinHorizontal", "marinBottom", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnEditStickyView extends MaterialCardView {
    public static final int $stable = ButtonV3View.$stable;

    @NotNull
    private final ButtonV3View button;
    private final int marinBottom;
    private final int marinHorizontal;
    private final int marinTop;

    public /* synthetic */ ReturnEditStickyView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final ButtonV3View getButton() {
        return this.button;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnEditStickyView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.marinTop = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.marinHorizontal = px2;
        int px3 = ResourceExtKt.toPx(8, context);
        this.marinBottom = px3;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(px2, px, px2, px3);
        buttonV3View.setLayoutParams(marginLayoutParams);
        this.button = buttonV3View;
        setCardBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        float pxF = ResourceExtKt.toPxF(24, context);
        k.a aVar = new k.a();
        aVar.n(pxF);
        aVar.r(pxF);
        setShapeAppearanceModel(aVar.a());
        setCardElevation(ResourceExtKt.toPxF(8, context));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, ResourceExtKt.toPx(4, context), marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        setLayoutParams(marginLayoutParams2);
        addView(buttonV3View);
    }
}
