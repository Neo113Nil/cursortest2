package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.image.Image;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class InfoPopupV4View$special$$inlined$preCreationViewPool$default$2 extends AbstractC7737t implements Function1<Image, Unit> {
    final /* synthetic */ InfoPopupV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPopupV4View$special$$inlined$preCreationViewPool$default$2(InfoPopupV4View infoPopupV4View) {
        super(1);
        this.this$0 = infoPopupV4View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Image image) {
        invoke(image);
        return Unit.f71690a;
    }

    public final void invoke(Image PreCreationViewPoolDelegate) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        i11 = this.this$0.dp8;
        i12 = this.this$0.dp8;
        i13 = this.this$0.dp8;
        layoutParams.setMargins(i11, i12, i13, 0);
        layoutParams.gravity = 17;
        PreCreationViewPoolDelegate.setLayoutParams(layoutParams);
    }
}
