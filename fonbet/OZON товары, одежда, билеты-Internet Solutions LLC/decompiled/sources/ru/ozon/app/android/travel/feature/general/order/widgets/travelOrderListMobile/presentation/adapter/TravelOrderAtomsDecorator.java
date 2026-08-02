package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.adapter;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/adapter/TravelOrderAtomsDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "topTextMarginS", "", "dp12", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderAtomsDecorator extends AtomDecorator implements VerticalAtomsDecorator {
    private final int dp12;
    private final int topTextMarginS;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelOrderAtomsDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.topTextMarginS = ResourceExtKt.toPx(4, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
    }

    @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof TextAtom) {
            if (last) {
                setTop(lp, this.dp12);
                return lp;
            }
            if (position > 0) {
                setTop(lp, this.topTextMarginS);
                return lp;
            }
        } else {
            if (!(data instanceof ButtonV3DTO) && !(data instanceof ButtonV3Atom)) {
                VerticalAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, lp, data, position, last);
                return lp;
            }
            lp.width = -2;
            if (position > 0) {
                setTop(lp, this.dp12);
            }
        }
        return lp;
    }
}
