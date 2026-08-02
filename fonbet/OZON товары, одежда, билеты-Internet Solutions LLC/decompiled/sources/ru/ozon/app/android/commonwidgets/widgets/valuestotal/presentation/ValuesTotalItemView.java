package ru.ozon.app.android.commonwidgets.widgets.valuestotal.presentation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.databinding.WidgetValuesTotalItemBinding;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.data.ValuesTotalDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/valuestotal/presentation/ValuesTotalItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/commonwidgets/databinding/WidgetValuesTotalItemBinding;", "bind", "", "item", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/data/ValuesTotalDTO$Item;", "bindTitle", "bindSubtitle", "bindValue", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ValuesTotalItemView extends ConstraintLayout {

    @NotNull
    private final WidgetValuesTotalItemBinding binding;

    public /* synthetic */ ValuesTotalItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindSubtitle(ValuesTotalDTO.Item item) {
        TextAtom subtitle = item.getSubtitle();
        if (subtitle == null) {
            TextAtomView subtitleTav = this.binding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
            ViewExtKt.gone(subtitleTav);
        } else {
            TextAtomView subtitleTav2 = this.binding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav2, "subtitleTav");
            TextAtomHolderKt.bind$default(subtitleTav2, subtitle, null, 2, null);
            TextAtomView subtitleTav3 = this.binding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav3, "subtitleTav");
            ViewExtKt.show(subtitleTav3);
        }
    }

    private final void bindTitle(ValuesTotalDTO.Item item) {
        TextAtomView titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
    }

    private final void bindValue(ValuesTotalDTO.Item item) {
        TextAtomView valueTav = this.binding.valueTav;
        Intrinsics.checkNotNullExpressionValue(valueTav, "valueTav");
        TextAtomHolderKt.bind$default(valueTav, item.getValue(), null, 2, null);
    }

    public final void bind(@NotNull ValuesTotalDTO.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindTitle(item);
        bindSubtitle(item);
        bindValue(item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuesTotalItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = WidgetValuesTotalItemBinding.bind(ViewGroupExtKt.inflate(this, R$layout.widget_values_total_item, true));
        setMinHeight(ResourceExtKt.toPx(44));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
