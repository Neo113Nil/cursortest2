package ru.ozon.app.android.common.progressivemolecula.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.progressive_molecula.databinding.ViewProgressiveTextBinding;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveTextView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/common/progressive_molecula/databinding/ViewProgressiveTextBinding;", "bind", "", "data", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveTextView extends FrameLayout {

    @NotNull
    private final ViewProgressiveTextBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressiveTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull ProgressiveTextWidgetVO.ProgressiveTextVO data) {
        CommonCellSettings.LayoutPadding bottomPadding;
        CommonCellSettings.LayoutPadding rightPadding;
        CommonCellSettings.LayoutPadding topPadding;
        CommonCellSettings.LayoutPadding leftPadding;
        Intrinsics.checkNotNullParameter(data, "data");
        ConstraintLayout constraintLayout = this.binding.container;
        constraintLayout.setForeground(a.getDrawable(constraintLayout.getContext(), R$drawable.selector_standard));
        GradientDrawable gradientDrawable = new GradientDrawable();
        String backgroundColor = data.getBackgroundColor();
        if (backgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(styleParser.parseColor(context, backgroundColor, R.color.transparent));
        }
        String borderColor = data.getBorderColor();
        if (borderColor != null) {
            int px = UiExtKt.toPx(1);
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gradientDrawable.setStroke(px, styleParser2.parseColor(context2, borderColor, R.color.transparent));
        }
        Integer cornerRadius = data.getCornerRadius();
        if (cornerRadius != null) {
            gradientDrawable.setCornerRadius(UiExtKt.toPxF(cornerRadius.intValue()));
        }
        constraintLayout.setBackground(gradientDrawable);
        Resources resources = constraintLayout.getResources();
        ProgressiveTextWidgetDTO.Paddings paddings = data.getPaddings();
        int dimension = (int) resources.getDimension((paddings == null || (leftPadding = paddings.getLeftPadding()) == null) ? CommonCellSettingsKt.getNone() : leftPadding.getCellLayoutPadding());
        Resources resources2 = constraintLayout.getResources();
        ProgressiveTextWidgetDTO.Paddings paddings2 = data.getPaddings();
        int dimension2 = (int) resources2.getDimension((paddings2 == null || (topPadding = paddings2.getTopPadding()) == null) ? CommonCellSettingsKt.getNone() : topPadding.getCellLayoutPadding());
        Resources resources3 = constraintLayout.getResources();
        ProgressiveTextWidgetDTO.Paddings paddings3 = data.getPaddings();
        int dimension3 = (int) resources3.getDimension((paddings3 == null || (rightPadding = paddings3.getRightPadding()) == null) ? CommonCellSettingsKt.getNone() : rightPadding.getCellLayoutPadding());
        Resources resources4 = constraintLayout.getResources();
        ProgressiveTextWidgetDTO.Paddings paddings4 = data.getPaddings();
        constraintLayout.setPadding(dimension, dimension2, dimension3, (int) resources4.getDimension((paddings4 == null || (bottomPadding = paddings4.getBottomPadding()) == null) ? CommonCellSettingsKt.getNone() : bottomPadding.getCellLayoutPadding()));
        IconView icon = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        IconHolderKt.bindOrGone$default(icon, data.getIcon(), null, 2, null);
        TextAtomV2View text = this.binding.text;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        TextHolderKt.bindOrGone$default(text, data.getTitle(), null, 2, null);
        this.binding.badge.bindOrGone(data.getBadge());
    }

    public /* synthetic */ ProgressiveTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveTextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewProgressiveTextBinding inflate = ViewProgressiveTextBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.text.setTextIsSelectable(false);
    }
}
