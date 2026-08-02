package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetLegalDocsViewOrderStatusBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order.LegalDocsOrderVO;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDocsViewOrderStatusBinding;", "bind", "", "status", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO$Status;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDocsOrderStatusView extends ConstraintLayout {

    @NotNull
    private final WidgetLegalDocsViewOrderStatusBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegalDocsOrderStatusView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull LegalDocsOrderVO.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, status.getStateTintColor(), UniColors.TEXT_PRIMARY.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable loadIconByString = ContextExtKt.loadIconByString(context2, status.getStateIcon());
        WidgetLegalDocsViewOrderStatusBinding widgetLegalDocsViewOrderStatusBinding = this.binding;
        TextAtomV2View orderStateTAV = widgetLegalDocsViewOrderStatusBinding.orderStateTAV;
        Intrinsics.checkNotNullExpressionValue(orderStateTAV, "orderStateTAV");
        TextHolderKt.bind$default(orderStateTAV, status.getTitle(), null, 2, null);
        widgetLegalDocsViewOrderStatusBinding.stateDescriptionTV.setText(status.getStateDescription());
        widgetLegalDocsViewOrderStatusBinding.stateDescriptionTV.setTextColor(parseColor);
        widgetLegalDocsViewOrderStatusBinding.stateIconIV.setImageDrawable(loadIconByString);
        ImageView stateIconIV = widgetLegalDocsViewOrderStatusBinding.stateIconIV;
        Intrinsics.checkNotNullExpressionValue(stateIconIV, "stateIconIV");
        ThemeExtKt.tint(stateIconIV, Integer.valueOf(parseColor));
    }

    public /* synthetic */ LegalDocsOrderStatusView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegalDocsOrderStatusView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetLegalDocsViewOrderStatusBinding inflate = WidgetLegalDocsViewOrderStatusBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }
}
