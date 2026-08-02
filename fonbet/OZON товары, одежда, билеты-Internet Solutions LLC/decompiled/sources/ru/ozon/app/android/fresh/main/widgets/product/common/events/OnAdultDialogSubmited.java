package ru.ozon.app.android.fresh.main.widgets.product.common.events;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/events/OnAdultDialogSubmited;", "LA00/a$J$a;", "", "isFavorite", "<init>", "(Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OnAdultDialogSubmited implements a.J.InterfaceC0007a {
    private final Boolean isFavorite;

    /* JADX WARN: Multi-variable type inference failed */
    public OnAdultDialogSubmited() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnAdultDialogSubmited) && Intrinsics.d(this.isFavorite, ((OnAdultDialogSubmited) other).isFavorite);
    }

    public int hashCode() {
        Boolean bool = this.isFavorite;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* renamed from: isFavorite, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        return "OnAdultDialogSubmited(isFavorite=" + this.isFavorite + ")";
    }

    public OnAdultDialogSubmited(Boolean bool) {
        this.isFavorite = bool;
    }

    public /* synthetic */ OnAdultDialogSubmited(Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool);
    }
}
