package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects;

import Kk.C3532b;
import Pk0.b;
import Pk0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u001d\"\u0004\b \u0010\u001fR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;", "", "", "groupId", "", "swipeOffset", "", "isOpen", "isAnimating", "maxSwipeDistance", "reachedOpenDuringSwipe", "<init>", "(Ljava/lang/String;FZZFZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGroupId", "F", "getSwipeOffset", "()F", "setSwipeOffset", "(F)V", "Z", "()Z", "setOpen", "(Z)V", "setAnimating", "getMaxSwipeDistance", "setMaxSwipeDistance", "getReachedOpenDuringSwipe", "setReachedOpenDuringSwipe", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SwipeGroupState {

    @NotNull
    private final String groupId;
    private boolean isAnimating;
    private boolean isOpen;
    private float maxSwipeDistance;
    private boolean reachedOpenDuringSwipe;
    private float swipeOffset;

    public SwipeGroupState(@NotNull String groupId, float f7, boolean z11, boolean z12, float f11, boolean z13) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.groupId = groupId;
        this.swipeOffset = f7;
        this.isOpen = z11;
        this.isAnimating = z12;
        this.maxSwipeDistance = f11;
        this.reachedOpenDuringSwipe = z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeGroupState)) {
            return false;
        }
        SwipeGroupState swipeGroupState = (SwipeGroupState) other;
        return Intrinsics.d(this.groupId, swipeGroupState.groupId) && Float.compare(this.swipeOffset, swipeGroupState.swipeOffset) == 0 && this.isOpen == swipeGroupState.isOpen && this.isAnimating == swipeGroupState.isAnimating && Float.compare(this.maxSwipeDistance, swipeGroupState.maxSwipeDistance) == 0 && this.reachedOpenDuringSwipe == swipeGroupState.reachedOpenDuringSwipe;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final float getMaxSwipeDistance() {
        return this.maxSwipeDistance;
    }

    public final boolean getReachedOpenDuringSwipe() {
        return this.reachedOpenDuringSwipe;
    }

    public final float getSwipeOffset() {
        return this.swipeOffset;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reachedOpenDuringSwipe) + b.a(this.maxSwipeDistance, C3532b.a(C3532b.a(b.a(this.swipeOffset, this.groupId.hashCode() * 31, 31), 31, this.isOpen), 31, this.isAnimating), 31);
    }

    /* renamed from: isAnimating, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    /* renamed from: isOpen, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    public final void setAnimating(boolean z11) {
        this.isAnimating = z11;
    }

    public final void setMaxSwipeDistance(float f7) {
        this.maxSwipeDistance = f7;
    }

    public final void setOpen(boolean z11) {
        this.isOpen = z11;
    }

    public final void setReachedOpenDuringSwipe(boolean z11) {
        this.reachedOpenDuringSwipe = z11;
    }

    public final void setSwipeOffset(float f7) {
        this.swipeOffset = f7;
    }

    @NotNull
    public String toString() {
        String str = this.groupId;
        float f7 = this.swipeOffset;
        boolean z11 = this.isOpen;
        boolean z12 = this.isAnimating;
        float f11 = this.maxSwipeDistance;
        boolean z13 = this.reachedOpenDuringSwipe;
        StringBuilder sb2 = new StringBuilder("SwipeGroupState(groupId=");
        sb2.append(str);
        sb2.append(", swipeOffset=");
        sb2.append(f7);
        sb2.append(", isOpen=");
        f.c(", isAnimating=", ", maxSwipeDistance=", sb2, z11, z12);
        sb2.append(f11);
        sb2.append(", reachedOpenDuringSwipe=");
        sb2.append(z13);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ SwipeGroupState(String str, float f7, boolean z11, boolean z12, float f11, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0.0f : f7, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? 0.0f : f11, (i11 & 32) != 0 ? false : z13);
    }
}
