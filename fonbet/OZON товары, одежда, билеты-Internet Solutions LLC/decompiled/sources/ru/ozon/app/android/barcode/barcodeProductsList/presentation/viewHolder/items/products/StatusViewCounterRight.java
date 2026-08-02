package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/StatusViewCounterRight;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/StatusView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "updateConstraints", "", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StatusViewCounterRight extends StatusView {
    public /* synthetic */ StatusViewCounterRight(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products.StatusView
    public void updateConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart(dVar, getTitleView().getId(), 0, getHorizontalMargin());
        ConstraintSetExtKt.topToTop(dVar, getTitleView().getId(), 0, getVerticalMargin());
        ConstraintSetExtKt.bottomToBottom$default(dVar, getTitleView().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd(dVar, getPriceView().getId(), getTitleView().getId(), getCountStartMargin());
        ConstraintSetExtKt.topToTop$default(dVar, getPriceView().getId(), getTitleView().getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, getPriceView().getId(), getTitleView().getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, getCountView().getId(), 0, getHorizontalMargin());
        ConstraintSetExtKt.topToTop(dVar, getCountView().getId(), 0, getVerticalPriceMargin());
        ConstraintSetExtKt.bottomToBottom$default(dVar, getCountView().getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusViewCounterRight(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
