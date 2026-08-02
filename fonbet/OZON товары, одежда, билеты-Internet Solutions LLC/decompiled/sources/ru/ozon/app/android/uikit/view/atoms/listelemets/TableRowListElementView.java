package ru.ozon.app.android.uikit.view.atoms.listelemets;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.ListElementTableRowBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010%\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010\u001d\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010.\u001a\u0004\u0018\u00010&2\b\u0010\u001d\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u0006/"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/listelemets/TableRowListElementView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isVisible", "", "showSeparator", "(Z)V", "", "style", "setTextStyle", "(Ljava/lang/String;)V", "(Ljava/lang/Integer;)V", "color", "setTextColor", "rightIcon", "setRightIcon", "Lru/ozon/app/android/uikit/databinding/ListElementTableRowBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/ListElementTableRowBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getLeftText", "()Ljava/lang/CharSequence;", "setLeftText", "(Ljava/lang/CharSequence;)V", "leftText", "getRightText", "setRightText", "rightText", "Landroid/text/method/MovementMethod;", "getLeftMovementMethod", "()Landroid/text/method/MovementMethod;", "setLeftMovementMethod", "(Landroid/text/method/MovementMethod;)V", "leftMovementMethod", "getRightMovementMethod", "setRightMovementMethod", "rightMovementMethod", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TableRowListElementView extends ConstraintLayout implements AtomView {

    @NotNull
    private final ListElementTableRowBinding binding;

    public /* synthetic */ TableRowListElementView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setLeftMovementMethod(MovementMethod movementMethod) {
        this.binding.leftTav.setMovementMethod(movementMethod);
    }

    public final void setLeftText(CharSequence charSequence) {
        this.binding.leftTav.setText(charSequence);
    }

    public final void setRightIcon(String rightIcon) {
        if (rightIcon == null) {
            AppCompatImageView rightIconIv = this.binding.rightIconIv;
            Intrinsics.checkNotNullExpressionValue(rightIconIv, "rightIconIv");
            ViewExtKt.gone(rightIconIv);
            return;
        }
        AppCompatImageView appCompatImageView = this.binding.rightIconIv;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatImageView.setImageDrawable(ExtensionsKt.loadDrawableByName(context, rightIcon));
        AppCompatImageView rightIconIv2 = this.binding.rightIconIv;
        Intrinsics.checkNotNullExpressionValue(rightIconIv2, "rightIconIv");
        ViewExtKt.show(rightIconIv2);
    }

    public final void setRightMovementMethod(MovementMethod movementMethod) {
        this.binding.rightTav.setMovementMethod(movementMethod);
    }

    public final void setRightText(CharSequence charSequence) {
        this.binding.rightTav.setText(charSequence);
    }

    public final void setTextColor(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setTextColor(styleParser.parseColor(context, color));
    }

    public final void setTextStyle(String style) {
        setTextStyle(StyleParser.INSTANCE.parseTextStyle(style));
    }

    public final void showSeparator(boolean isVisible) {
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(isVisible));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableRowListElementView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.binding = ListElementTableRowBinding.bind(View.inflate(context, R$layout.list_element_table_row, this));
    }

    public final void setTextColor(Integer color) {
        this.binding.leftTav.setTextColorOrDefault(color);
        this.binding.rightTav.setTextColorOrDefault(color);
    }

    public final void setTextStyle(Integer style) {
        this.binding.leftTav.setStyleOrDefault(style);
        this.binding.rightTav.setStyleOrDefault(style);
    }
}
