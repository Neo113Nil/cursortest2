package ru.ozon.uni.android.uikit.view.atoms.tabs;

import B3.D;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/tabs/TabItemElement;", "Landroidx/appcompat/widget/AppCompatButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tabBg", "Landroid/graphics/drawable/GradientDrawable;", "onAttachedToWindow", "", "setBackgroundColor", "activated", "", "selectedBackgroundColor", "", "applyTabItemParams", "applyStyle", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabItemElement extends AppCompatButton {

    @NotNull
    private final GradientDrawable tabBg;
    public static final int $stable = 8;

    public /* synthetic */ TabItemElement(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyStyle() {
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
        setLines(1);
        setElevation(ResourceExtKt.toPxF(2));
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(a.getColor(getContext(), R$color.transparent));
        }
        setSingleLine(true);
        setAllCaps(false);
        setTextAppearance(R$style.TextStyle_Body_L);
        setTextColor(a.getColorStateList(getContext(), R$color.tab_item_color));
        setBackground(this.tabBg);
    }

    private final void applyTabItemParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams2.height = ResourceExtKt.toPx(context, 36.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(context2, 2.0f);
        layoutParams2.setMargins(px, px, px, px);
        layoutParams2.weight = 1.0f;
        setLayoutParams(layoutParams2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px2 = ResourceExtKt.toPx(context3, 8.0f);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        setPadding(px2, 0, ResourceExtKt.toPx(context4, 8.0f), 0);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyTabItemParams();
    }

    public final void setBackgroundColor(boolean activated, String selectedBackgroundColor) {
        int i11;
        if (activated) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = styleParser.parseColor(context, selectedBackgroundColor, StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY);
        } else {
            i11 = 0;
        }
        this.tabBg.setColor(i11);
        setActivated(activated);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabItemElement(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadius(UniGlobalConfigKt.getRoundCornersFlag(context) ? ResourceExtKt.toPxF(30) : ResourceExtKt.toPxF(12));
        this.tabBg = b11;
        applyStyle();
    }
}
