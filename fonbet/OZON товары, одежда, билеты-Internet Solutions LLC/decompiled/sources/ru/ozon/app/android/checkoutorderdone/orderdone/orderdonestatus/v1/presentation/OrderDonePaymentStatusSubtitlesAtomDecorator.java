package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation;

import android.content.Context;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdone.R$drawable;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusSubtitlesAtomDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "horizontalDividerDrawable", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDonePaymentStatusSubtitlesAtomDecorator extends AtomDecorator implements HorizontalFlexAtomsDecorator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDonePaymentStatusSubtitlesAtomDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int horizontalDividerDrawable() {
        return R$drawable.small_space_divider;
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int justifyContent() {
        return HorizontalFlexAtomsDecorator.DefaultImpls.justifyContent(this);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    @NotNull
    public FlexboxLayout.a modifyVerticalLayoutParams(@NotNull FlexboxLayout.a aVar, @NotNull AtomDTO atomDTO, int i11, boolean z11) {
        return HorizontalFlexAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, aVar, atomDTO, i11, z11);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int showDividerHorizontal() {
        return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerHorizontal(this);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int showDividerVertical() {
        return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerVertical(this);
    }
}
