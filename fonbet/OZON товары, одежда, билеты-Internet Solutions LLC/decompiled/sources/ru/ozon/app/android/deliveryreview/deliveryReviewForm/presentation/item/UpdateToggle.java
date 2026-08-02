package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import Cm.e;
import G.g;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateToggle;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateComponent;", "", "groupToggleId", "", "componentId", "", "isSelected", "<init>", "(ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getGroupToggleId", "Ljava/lang/String;", "getComponentId", "Z", "()Z", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UpdateToggle extends UpdateComponent {

    @NotNull
    private final String componentId;
    private final int groupToggleId;
    private final boolean isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateToggle(int i11, @NotNull String componentId, boolean z11) {
        super(i11, null);
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.groupToggleId = i11;
        this.componentId = componentId;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateToggle)) {
            return false;
        }
        UpdateToggle updateToggle = (UpdateToggle) other;
        return this.groupToggleId == updateToggle.groupToggleId && Intrinsics.d(this.componentId, updateToggle.componentId) && this.isSelected == updateToggle.isSelected;
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + g.a(Integer.hashCode(this.groupToggleId) * 31, 31, this.componentId);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        int i11 = this.groupToggleId;
        String str = this.componentId;
        return a.a(")", e.g(i11, "UpdateToggle(groupToggleId=", ", componentId=", str, ", isSelected="), this.isSelected);
    }
}
