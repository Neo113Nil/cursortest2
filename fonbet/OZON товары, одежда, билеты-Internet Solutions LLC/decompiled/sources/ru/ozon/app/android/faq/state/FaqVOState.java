package ru.ozon.app.android.faq.state;

import Ep.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/faq/state/FaqVOState;", "", "", "isDisclosureOpen", "", "initialHeight", "expandedHeight", "<init>", "(ZLjava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/faq/state/FaqVOState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/Integer;", "getInitialHeight", "()Ljava/lang/Integer;", "getExpandedHeight", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FaqVOState {
    private final Integer expandedHeight;
    private final Integer initialHeight;
    private final boolean isDisclosureOpen;

    public FaqVOState(boolean z11, Integer num, Integer num2) {
        this.isDisclosureOpen = z11;
        this.initialHeight = num;
        this.expandedHeight = num2;
    }

    public static /* synthetic */ FaqVOState copy$default(FaqVOState faqVOState, boolean z11, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = faqVOState.isDisclosureOpen;
        }
        if ((i11 & 2) != 0) {
            num = faqVOState.initialHeight;
        }
        if ((i11 & 4) != 0) {
            num2 = faqVOState.expandedHeight;
        }
        return faqVOState.copy(z11, num, num2);
    }

    @NotNull
    public final FaqVOState copy(boolean isDisclosureOpen, Integer initialHeight, Integer expandedHeight) {
        return new FaqVOState(isDisclosureOpen, initialHeight, expandedHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaqVOState)) {
            return false;
        }
        FaqVOState faqVOState = (FaqVOState) other;
        return this.isDisclosureOpen == faqVOState.isDisclosureOpen && Intrinsics.d(this.initialHeight, faqVOState.initialHeight) && Intrinsics.d(this.expandedHeight, faqVOState.expandedHeight);
    }

    public final Integer getExpandedHeight() {
        return this.expandedHeight;
    }

    public final Integer getInitialHeight() {
        return this.initialHeight;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isDisclosureOpen) * 31;
        Integer num = this.initialHeight;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expandedHeight;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    /* renamed from: isDisclosureOpen, reason: from getter */
    public final boolean getIsDisclosureOpen() {
        return this.isDisclosureOpen;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isDisclosureOpen;
        Integer num = this.initialHeight;
        Integer num2 = this.expandedHeight;
        StringBuilder sb2 = new StringBuilder("FaqVOState(isDisclosureOpen=");
        sb2.append(z11);
        sb2.append(", initialHeight=");
        sb2.append(num);
        sb2.append(", expandedHeight=");
        return a.c(sb2, num2, ")");
    }
}
