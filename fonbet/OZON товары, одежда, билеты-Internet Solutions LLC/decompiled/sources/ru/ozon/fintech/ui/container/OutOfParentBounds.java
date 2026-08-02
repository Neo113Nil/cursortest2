package ru.ozon.fintech.ui.container;

import T7.E;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/container/OutOfParentBounds;", "", "width", "", "<init>", "(I)V", "getWidth", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OutOfParentBounds {
    private final int width;

    public OutOfParentBounds(int i11) {
        this.width = i11;
    }

    public static /* synthetic */ OutOfParentBounds copy$default(OutOfParentBounds outOfParentBounds, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = outOfParentBounds.width;
        }
        return outOfParentBounds.copy(i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final OutOfParentBounds copy(int width) {
        return new OutOfParentBounds(width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OutOfParentBounds) && this.width == ((OutOfParentBounds) other).width;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.width);
    }

    @NotNull
    public String toString() {
        return E.a(this.width, "OutOfParentBounds(width=", ")");
    }
}
