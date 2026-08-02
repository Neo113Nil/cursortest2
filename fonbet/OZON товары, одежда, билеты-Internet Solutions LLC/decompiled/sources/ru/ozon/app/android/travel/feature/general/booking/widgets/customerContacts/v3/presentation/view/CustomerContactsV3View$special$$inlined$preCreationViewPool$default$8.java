package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class CustomerContactsV3View$special$$inlined$preCreationViewPool$default$8 extends AbstractC7737t implements Function1<ButtonV3View, Unit> {
    final /* synthetic */ CustomerContactsV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerContactsV3View$special$$inlined$preCreationViewPool$default$8(CustomerContactsV3View customerContactsV3View) {
        super(1);
        this.this$0 = customerContactsV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ButtonV3View buttonV3View) {
        invoke(buttonV3View);
        return Unit.f71690a;
    }

    public final void invoke(ButtonV3View PreCreationViewPoolDelegate) {
        int i11;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        i11 = this.this$0.dp16;
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        PreCreationViewPoolDelegate.setLayoutParams(layoutParams);
    }
}
