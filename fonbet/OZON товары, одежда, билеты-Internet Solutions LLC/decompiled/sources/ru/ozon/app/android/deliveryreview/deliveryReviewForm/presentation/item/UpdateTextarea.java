package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import C.o0;
import Cm.e;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateTextarea;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateComponent;", "", "groupTextAreaId", "", "componentId", "newText", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGroupTextAreaId", "Ljava/lang/String;", "getComponentId", "getNewText", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UpdateTextarea extends UpdateComponent {

    @NotNull
    private final String componentId;
    private final int groupTextAreaId;
    private final String newText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTextarea(int i11, @NotNull String componentId, String str) {
        super(i11, null);
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.groupTextAreaId = i11;
        this.componentId = componentId;
        this.newText = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateTextarea)) {
            return false;
        }
        UpdateTextarea updateTextarea = (UpdateTextarea) other;
        return this.groupTextAreaId == updateTextarea.groupTextAreaId && Intrinsics.d(this.componentId, updateTextarea.componentId) && Intrinsics.d(this.newText, updateTextarea.newText);
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    public final String getNewText() {
        return this.newText;
    }

    public int hashCode() {
        int a11 = g.a(Integer.hashCode(this.groupTextAreaId) * 31, 31, this.componentId);
        String str = this.newText;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.groupTextAreaId;
        String str = this.componentId;
        return o0.c(e.g(i11, "UpdateTextarea(groupTextAreaId=", ", componentId=", str, ", newText="), this.newText, ")");
    }
}
