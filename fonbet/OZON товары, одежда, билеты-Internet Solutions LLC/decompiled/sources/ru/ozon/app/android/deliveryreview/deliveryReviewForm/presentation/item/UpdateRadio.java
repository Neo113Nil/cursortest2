package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateRadio;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateComponent;", "", "groupRadioId", "", "componentId", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGroupRadioId", "Ljava/lang/String;", "getComponentId", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UpdateRadio extends UpdateComponent {

    @NotNull
    private final String componentId;
    private final int groupRadioId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRadio(int i11, @NotNull String componentId) {
        super(i11, null);
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.groupRadioId = i11;
        this.componentId = componentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateRadio)) {
            return false;
        }
        UpdateRadio updateRadio = (UpdateRadio) other;
        return this.groupRadioId == updateRadio.groupRadioId && Intrinsics.d(this.componentId, updateRadio.componentId);
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    public int hashCode() {
        return this.componentId.hashCode() + (Integer.hashCode(this.groupRadioId) * 31);
    }

    @NotNull
    public String toString() {
        return a.c(this.groupRadioId, "UpdateRadio(groupRadioId=", ", componentId=", this.componentId, ")");
    }
}
