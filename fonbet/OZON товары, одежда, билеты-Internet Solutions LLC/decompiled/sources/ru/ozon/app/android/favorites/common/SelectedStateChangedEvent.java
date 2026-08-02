package ru.ozon.app.android.favorites.common;

import A00.a;
import Bl.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/favorites/common/SelectedStateChangedEvent;", "LA00/a$J$a;", "", "sku", "", "isSelected", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Z", "()Z", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SelectedStateChangedEvent implements a.J.InterfaceC0007a {
    private final boolean isSelected;
    private final long sku;

    public SelectedStateChangedEvent(long j11, boolean z11) {
        this.sku = j11;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedStateChangedEvent)) {
            return false;
        }
        SelectedStateChangedEvent selectedStateChangedEvent = (SelectedStateChangedEvent) other;
        return this.sku == selectedStateChangedEvent.sku && this.isSelected == selectedStateChangedEvent.isSelected;
    }

    public final long getSku() {
        return this.sku;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + (Long.hashCode(this.sku) * 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = b.c(this.sku, "SelectedStateChangedEvent(sku=", ", isSelected=", this.isSelected);
        c11.append(")");
        return c11.toString();
    }
}
