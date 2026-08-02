package ru.ozon.app.android.atoms.v3.holders.listelements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.databinding.AtomListElementBinding;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0015J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u000fJ\u001d\u0010!\u001a\u00020\r2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u00103\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/listelements/ListElementView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tintColor", "", "setImageTint", "(I)V", "", "isVisible", "showSeparator", "(Z)V", "setBullet", "()V", "", "text", "setText", "(Ljava/lang/String;)V", "showTextMarker", "showImageMarker", "color", "setElementColor", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "items", "bindAtomsOrGone", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView$n;", "decoration", "addItemDecoration", "(Landroidx/recyclerview/widget/RecyclerView$n;)V", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Lru/ozon/app/android/atoms/databinding/AtomListElementBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomListElementBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ListElementView extends ConstraintLayout implements AtomView {

    @NotNull
    private final AtomListElementBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListElementView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void addItemDecoration(@NotNull RecyclerView.n decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        this.binding.listElementAtomsVRC.addItemDecoration(decoration);
    }

    public final void bindAtomsOrGone(List<? extends AtomDTO> items) {
        if (items == null) {
            VerticalRecyclerContainer listElementAtomsVRC = this.binding.listElementAtomsVRC;
            Intrinsics.checkNotNullExpressionValue(listElementAtomsVRC, "listElementAtomsVRC");
            ViewExtKt.gone(listElementAtomsVRC);
        } else {
            VerticalRecyclerContainer listElementAtomsVRC2 = this.binding.listElementAtomsVRC;
            Intrinsics.checkNotNullExpressionValue(listElementAtomsVRC2, "listElementAtomsVRC");
            ViewExtKt.show(listElementAtomsVRC2);
            this.binding.listElementAtomsVRC.bind(items);
        }
    }

    @NotNull
    public final ImageView getIcon() {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        return iconIv;
    }

    public final void setBullet() {
        this.binding.markerTav.setText(R$string.common_message_bullet);
    }

    public final void setElementColor(int color) {
        this.binding.markerTav.setTextColor(color);
    }

    public void setImageTint(int tintColor) {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ThemeExtKt.tint(iconIv, Integer.valueOf(tintColor));
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.binding.markerTav.setText(text);
    }

    public final void setTitle(CharSequence charSequence) {
        this.binding.titleTav.setText(charSequence);
    }

    public final void showImageMarker() {
        TextAtomView markerTav = this.binding.markerTav;
        Intrinsics.checkNotNullExpressionValue(markerTav, "markerTav");
        ViewExtKt.gone(markerTav);
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ViewExtKt.show(iconIv);
    }

    public final void showSeparator(boolean isVisible) {
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(isVisible));
    }

    public final void showTextMarker() {
        TextAtomView markerTav = this.binding.markerTav;
        Intrinsics.checkNotNullExpressionValue(markerTav, "markerTav");
        ViewExtKt.show(markerTav);
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ViewExtKt.gone(iconIv);
    }

    public /* synthetic */ ListElementView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListElementView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = AtomListElementBinding.inflate(LayoutInflater.from(context), this);
    }
}
