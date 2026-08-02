package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.decorator;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/decorator/PlaceDescriptionsDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "Lru/ozon/uni/atoms/data/AtomDTO;", "data", "", "position", "", "last", "modifyVerticalLayoutParams", "(Landroid/widget/LinearLayout$LayoutParams;Lru/ozon/uni/atoms/data/AtomDTO;IZ)Landroid/widget/LinearLayout$LayoutParams;", "verticalOffset$delegate", "LSc/j;", "getVerticalOffset", "()I", "verticalOffset", "horizontalOffset$delegate", "getHorizontalOffset", "horizontalOffset", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaceDescriptionsDecorator extends AtomDecorator implements VerticalAtomsDecorator {

    /* renamed from: horizontalOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j horizontalOffset;

    /* renamed from: verticalOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j verticalOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceDescriptionsDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.verticalOffset = k.b(new PlaceDescriptionsDecorator$verticalOffset$2(context));
        this.horizontalOffset = k.b(new PlaceDescriptionsDecorator$horizontalOffset$2(context));
    }

    private final int getHorizontalOffset() {
        return ((Number) this.horizontalOffset.getValue()).intValue();
    }

    private final int getVerticalOffset() {
        return ((Number) this.verticalOffset.getValue()).intValue();
    }

    @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof ButtonV3Atom.SmallButton) {
            lp.leftMargin = getHorizontalOffset();
            lp.rightMargin = getHorizontalOffset();
            lp.topMargin = position > 0 ? getVerticalOffset() : 0;
            lp.bottomMargin = getVerticalOffset();
        }
        return lp;
    }
}
