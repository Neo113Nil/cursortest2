package ru.ozon.uni.android.uikit.appearance.atom;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonWithIconView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/atom/SmallButtonWithIconAppearance;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonWithIconView;", "<init>", "()V", "styleableId", "", "getStyleableId", "()[I", "textColor", "Landroid/content/res/ColorStateList;", "text", "", "titleStyle", "", "Ljava/lang/Integer;", "gravity", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "Landroid/widget/TextView;", "readAttribute", "", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "reset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SmallButtonWithIconAppearance extends AttributesAppearance<SmallButtonWithIconView> {
    private String text;
    private ColorStateList textColor;
    private Integer titleStyle;
    private int gravity = -1;

    @NotNull
    private final StyleAppearance<TextView> appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        int[] SmallButtonWithIconView = R$styleable.SmallButtonWithIconView;
        Intrinsics.checkNotNullExpressionValue(SmallButtonWithIconView, "SmallButtonWithIconView");
        return SmallButtonWithIconView;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.SmallButtonWithIconView_textColor) {
            this.textColor = typedAttributes.getColorStateList(attr);
            return;
        }
        if (attr == R$styleable.SmallButtonWithIconView_text) {
            this.text = typedAttributes.getString(attr);
        } else if (attr == R$styleable.SmallButtonWithIconView_android_gravity) {
            this.gravity = typedAttributes.getInt(attr, -1);
        } else if (attr == R$styleable.SmallButtonWithIconView_titleTextAppearance) {
            this.titleStyle = Integer.valueOf(typedAttributes.getResourceId(attr, -1));
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.textColor = null;
        this.text = null;
        this.titleStyle = null;
        this.gravity = -1;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull SmallButtonWithIconView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Integer num = this.titleStyle;
        if (num != null) {
            if (num.intValue() == -1) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                StyleAppearance<TextView> styleAppearance = this.appearance;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                styleAppearance.read(context, intValue);
                StyleAppearance<TextView> styleAppearance2 = this.appearance;
                TextView titleTv = view.getBinding().titleTv;
                Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
                styleAppearance2.apply(titleTv);
            }
        }
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            view.setTextColor(colorStateList);
        }
        String str = this.text;
        if (str != null) {
            view.setText(str);
        }
        Integer valueOf = Integer.valueOf(this.gravity);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            if (view == null) {
                view = null;
            }
            if (view != null) {
                view.setGravity(this.gravity);
            }
        }
    }
}
