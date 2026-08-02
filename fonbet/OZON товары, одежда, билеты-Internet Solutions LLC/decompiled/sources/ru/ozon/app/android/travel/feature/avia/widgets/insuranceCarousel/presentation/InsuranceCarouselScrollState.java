package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation;

import Am.C2438a;
import B0.C2454a;
import K00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselScrollState;", "", "", "lastSelectedIndex", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLastSelectedIndex", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InsuranceCarouselScrollState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int firstVisibleItemIndex;
    private final int firstVisibleItemScrollOffset;
    private final int lastSelectedIndex;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselScrollState$Companion;", "", "<init>", "()V", "initial", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselScrollState;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InsuranceCarouselScrollState initial() {
            return new InsuranceCarouselScrollState(-1, 0, 0);
        }

        private Companion() {
        }
    }

    public InsuranceCarouselScrollState(int i11, int i12, int i13) {
        this.lastSelectedIndex = i11;
        this.firstVisibleItemIndex = i12;
        this.firstVisibleItemScrollOffset = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceCarouselScrollState)) {
            return false;
        }
        InsuranceCarouselScrollState insuranceCarouselScrollState = (InsuranceCarouselScrollState) other;
        return this.lastSelectedIndex == insuranceCarouselScrollState.lastSelectedIndex && this.firstVisibleItemIndex == insuranceCarouselScrollState.firstVisibleItemIndex && this.firstVisibleItemScrollOffset == insuranceCarouselScrollState.firstVisibleItemScrollOffset;
    }

    public final int getFirstVisibleItemIndex() {
        return this.firstVisibleItemIndex;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    public final int getLastSelectedIndex() {
        return this.lastSelectedIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.firstVisibleItemScrollOffset) + C2454a.a(this.firstVisibleItemIndex, Integer.hashCode(this.lastSelectedIndex) * 31, 31);
    }

    @NotNull
    public String toString() {
        return b.e(this.firstVisibleItemScrollOffset, ")", C2438a.a("InsuranceCarouselScrollState(lastSelectedIndex=", this.lastSelectedIndex, ", firstVisibleItemIndex=", ", firstVisibleItemScrollOffset=", this.firstVisibleItemIndex));
    }
}
