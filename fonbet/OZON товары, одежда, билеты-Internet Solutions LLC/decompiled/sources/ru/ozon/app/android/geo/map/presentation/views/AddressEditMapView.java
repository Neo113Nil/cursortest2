package ru.ozon.app.android.geo.map.presentation.views;

import B90.I;
import Hy.RunnableC3170a;
import Ql.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.databinding.WidgetNouiAddressEditMapBinding;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/views/AddressEditMapView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/geo/databinding/WidgetNouiAddressEditMapBinding;", "getBinding", "()Lru/ozon/app/android/geo/databinding/WidgetNouiAddressEditMapBinding;", "applyInsets", "", "isEdgeToEdgeSupportEnabled", "", "applyInsets$geo_prodGoogleAllVendorsRelease", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapView extends ConstraintLayout {

    @NotNull
    private final WidgetNouiAddressEditMapBinding binding;

    public /* synthetic */ AddressEditMapView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 applyInsets$lambda$0(AddressEditMapView addressEditMapView, View view, C5353y0 c5353y0) {
        d a11 = c.a(view, "<unused var>", c5353y0, "windowInsets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        LinearLayout filtersContainerFl = addressEditMapView.binding.filtersContainerFl;
        Intrinsics.checkNotNullExpressionValue(filtersContainerFl, "filtersContainerFl");
        filtersContainerFl.setPadding(filtersContainerFl.getPaddingLeft(), a11.f42127b, filtersContainerFl.getPaddingRight(), filtersContainerFl.getPaddingBottom());
        return c5353y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyInsets$lambda$1(AddressEditMapView addressEditMapView) {
        Y.A(addressEditMapView.binding.getConstraintLayout());
    }

    public final void applyInsets$geo_prodGoogleAllVendorsRelease(boolean isEdgeToEdgeSupportEnabled) {
        if (isEdgeToEdgeSupportEnabled) {
            Y.J(this.binding.getConstraintLayout(), new I(this, 1));
            this.binding.getConstraintLayout().post(new RunnableC3170a(this, 0));
        }
    }

    @NotNull
    public final WidgetNouiAddressEditMapBinding getBinding() {
        return this.binding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressEditMapView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetNouiAddressEditMapBinding inflate = WidgetNouiAddressEditMapBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setId(R$id.containerLayout);
    }
}
