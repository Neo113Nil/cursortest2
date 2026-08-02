package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.R$drawable;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.AdditionalServicesTotalVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/view/AdditionalServicesTotalView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp12", "dp54", "dp74", "titleTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "serviceItemsFL", "Lcom/google/android/flexbox/FlexboxLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$ServiceItem;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalServicesTotalView extends LinearLayout {
    private final int dp12;
    private final int dp54;
    private final int dp74;

    @NotNull
    private final FlexboxLayout serviceItemsFL;

    @NotNull
    private final TextAtomView titleTAV;

    public /* synthetic */ AdditionalServicesTotalView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull AdditionalServicesTotalVO.ServiceItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bind$default(this.titleTAV, item.getServiceKey(), null, 2, null);
        this.serviceItemsFL.removeAllViews();
        for (TextAtom textAtom : item.getServiceValues()) {
            q qVar = q.f64554a;
            d b11 = N.b(TextAtomView.class);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
            textAtomView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textAtomView.setMinWidth(this.dp54);
            TextAtomHolderKt.bind$default(textAtomView, textAtom, null, 2, null);
            this.serviceItemsFL.addView(textAtomView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServicesTotalView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        this.dp54 = ResourceExtKt.toPx(54, context);
        int px2 = ResourceExtKt.toPx(74, context);
        this.dp74 = px2;
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        textAtomView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomView.setMinWidth(px2);
        this.titleTAV = textAtomView;
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(px);
        flexboxLayout.setLayoutParams(layoutParams);
        flexboxLayout.setFlexWrap(1);
        flexboxLayout.setFlexDirection(0);
        flexboxLayout.setShowDivider(2);
        flexboxLayout.setDividerDrawable(a.getDrawable(context, R$drawable.divider_service_item));
        this.serviceItemsFL = flexboxLayout;
        setOrientation(0);
        addView(textAtomView);
        addView(flexboxLayout);
    }
}
