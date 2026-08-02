package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.model;

import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/model/ComponentUpdateModel;", "T", "", "", "changedComponentId", "", "isHiddenForControlledComponents", "Lkotlin/Function1;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "elementUpdate", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChangedComponentId", "Z", "()Z", "Lkotlin/jvm/functions/Function1;", "getElementUpdate", "()Lkotlin/jvm/functions/Function1;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComponentUpdateModel<T> {

    @NotNull
    private final String changedComponentId;

    @NotNull
    private final Function1<T, ElementVO> elementUpdate;
    private final boolean isHiddenForControlledComponents;

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentUpdateModel(@NotNull String changedComponentId, boolean z11, @NotNull Function1<? super T, ? extends ElementVO> elementUpdate) {
        Intrinsics.checkNotNullParameter(changedComponentId, "changedComponentId");
        Intrinsics.checkNotNullParameter(elementUpdate, "elementUpdate");
        this.changedComponentId = changedComponentId;
        this.isHiddenForControlledComponents = z11;
        this.elementUpdate = elementUpdate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentUpdateModel)) {
            return false;
        }
        ComponentUpdateModel componentUpdateModel = (ComponentUpdateModel) other;
        return Intrinsics.d(this.changedComponentId, componentUpdateModel.changedComponentId) && this.isHiddenForControlledComponents == componentUpdateModel.isHiddenForControlledComponents && Intrinsics.d(this.elementUpdate, componentUpdateModel.elementUpdate);
    }

    @NotNull
    public final String getChangedComponentId() {
        return this.changedComponentId;
    }

    @NotNull
    public final Function1<T, ElementVO> getElementUpdate() {
        return this.elementUpdate;
    }

    public int hashCode() {
        return this.elementUpdate.hashCode() + C3532b.a(this.changedComponentId.hashCode() * 31, 31, this.isHiddenForControlledComponents);
    }

    /* renamed from: isHiddenForControlledComponents, reason: from getter */
    public final boolean getIsHiddenForControlledComponents() {
        return this.isHiddenForControlledComponents;
    }

    @NotNull
    public String toString() {
        String str = this.changedComponentId;
        boolean z11 = this.isHiddenForControlledComponents;
        Function1<T, ElementVO> function1 = this.elementUpdate;
        StringBuilder b11 = C4636t5.b("ComponentUpdateModel(changedComponentId=", str, ", isHiddenForControlledComponents=", ", elementUpdate=", z11);
        b11.append(function1);
        b11.append(")");
        return b11.toString();
    }
}
