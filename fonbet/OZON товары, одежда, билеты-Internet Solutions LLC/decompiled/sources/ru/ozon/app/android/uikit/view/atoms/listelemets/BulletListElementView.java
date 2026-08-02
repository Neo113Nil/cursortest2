package ru.ozon.app.android.uikit.view.atoms.listelemets;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.ListElementBulletBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010&\u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/listelemets/BulletListElementView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setElementColor", "(I)V", "", "isVisible", "showSeparator", "(Z)V", "", "testId", "setTestId", "(Ljava/lang/String;)V", "Lru/ozon/app/android/uikit/databinding/ListElementBulletBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/ListElementBulletBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "Landroid/text/method/MovementMethod;", "getMovementMethod", "()Landroid/text/method/MovementMethod;", "setMovementMethod", "(Landroid/text/method/MovementMethod;)V", "movementMethod", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BulletListElementView extends ConstraintLayout implements AtomView {

    @NotNull
    private final ListElementBulletBinding binding;

    public /* synthetic */ BulletListElementView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setElementColor(int color) {
        this.binding.textTav.setTextColor(color);
        this.binding.bulletTav.setTextColor(color);
    }

    public final void setMovementMethod(MovementMethod movementMethod) {
        this.binding.textTav.setMovementMethod(movementMethod);
    }

    public final void setTestId(String testId) {
        this.binding.textTav.setContentDescription(testId);
    }

    public final void setText(CharSequence charSequence) {
        this.binding.textTav.setText(charSequence);
    }

    public final void showSeparator(boolean isVisible) {
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(isVisible));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletListElementView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ListElementBulletBinding.bind(View.inflate(context, R$layout.list_element_bullet, this));
    }
}
