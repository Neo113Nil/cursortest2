package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import Bi.b;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<TextAtomV2View, Unit> {
    final /* synthetic */ HotelsRoomsListV5View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$4(HotelsRoomsListV5View hotelsRoomsListV5View) {
        super(1);
        this.this$0 = hotelsRoomsListV5View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomV2View textAtomV2View) {
        invoke(textAtomV2View);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomV2View PreCreationViewPoolDelegate) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TextAtomV2View textAtomV2View = PreCreationViewPoolDelegate;
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.hotelsRoomsListV5NameTav, 0, -2);
        d11.f41657u = R$id.hotelsRoomsListV5DetailsBv;
        d11.f41656t = 0;
        d11.f41638j = R$id.hotelsRoomsListV5ImagesRv;
        i11 = this.this$0.dp16;
        d11.setMarginStart(i11);
        i12 = this.this$0.dp4;
        d11.setMarginEnd(i12);
        i13 = this.this$0.dp16;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = i13;
        i14 = this.this$0.dp16;
        d11.f41595B = i14;
        textAtomV2View.setLayoutParams(d11);
    }
}
