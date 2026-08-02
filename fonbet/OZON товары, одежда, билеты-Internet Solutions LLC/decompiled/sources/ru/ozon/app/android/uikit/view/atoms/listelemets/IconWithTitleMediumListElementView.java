package ru.ozon.app.android.uikit.view.atoms.listelemets;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.ListElementIconWithTitleMediumBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010)\u001a\u0004\u0018\u00010$2\b\u0010\u001b\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010,\u001a\u0004\u0018\u00010$2\b\u0010\u001b\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/listelemets/IconWithTitleMediumListElementView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tintColor", "", "setImageTint", "(I)V", "", "isVisible", "showSeparator", "(Z)V", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Lru/ozon/app/android/uikit/databinding/ListElementIconWithTitleMediumBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/ListElementIconWithTitleMediumBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "getSubtitle", "setSubtitle", "subtitle", "Landroid/text/method/MovementMethod;", "getTitleMovementMethod", "()Landroid/text/method/MovementMethod;", "setTitleMovementMethod", "(Landroid/text/method/MovementMethod;)V", "titleMovementMethod", "getSubtitleMovementMethod", "setSubtitleMovementMethod", "subtitleMovementMethod", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconWithTitleMediumListElementView extends ConstraintLayout implements AtomView {

    @NotNull
    private final ListElementIconWithTitleMediumBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconWithTitleMediumListElementView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ImageView getIcon() {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        return iconIv;
    }

    public void setImageTint(int tintColor) {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ThemeExtKt.tint(iconIv, Integer.valueOf(tintColor));
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextAtomView subtitleTav = this.binding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextViewExtKt.setTextOrGone(subtitleTav, charSequence);
    }

    public final void setSubtitleMovementMethod(MovementMethod movementMethod) {
        this.binding.subtitleTav.setMovementMethod(movementMethod);
    }

    public final void setTitle(CharSequence charSequence) {
        this.binding.titleTav.setText(charSequence);
    }

    public final void setTitleMovementMethod(MovementMethod movementMethod) {
        this.binding.titleTav.setMovementMethod(movementMethod);
    }

    public final void showSeparator(boolean isVisible) {
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(isVisible));
    }

    public /* synthetic */ IconWithTitleMediumListElementView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconWithTitleMediumListElementView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ListElementIconWithTitleMediumBinding.bind(View.inflate(context, R$layout.list_element_icon_with_title_medium, this));
    }
}
