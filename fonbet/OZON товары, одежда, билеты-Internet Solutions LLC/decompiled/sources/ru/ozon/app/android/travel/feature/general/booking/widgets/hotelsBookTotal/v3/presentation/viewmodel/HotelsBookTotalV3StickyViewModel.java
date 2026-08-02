package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel;

import Ae.B0;
import Ae.C2399j;
import Ef0.c;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "isVisible", "", "onNonStickyVisibilityChanged", "(Z)V", "onKeyboardVisibilityChanged", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel$StickyContainerVisibilityState;", "mutableVisibilityStateFlow", "LAe/w0;", "LAe/B0;", "visibilityStateFlow", "LAe/B0;", "getVisibilityStateFlow", "()LAe/B0;", "cache", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel$StickyContainerVisibilityState;", "StickyContainerVisibilityState", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3StickyViewModel extends w0 {

    @NotNull
    private StickyContainerVisibilityState cache;

    @NotNull
    private final Ae.w0<StickyContainerVisibilityState> mutableVisibilityStateFlow;

    @NotNull
    private final B0<StickyContainerVisibilityState> visibilityStateFlow;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel$StickyContainerVisibilityState;", "", "", "isNonStickyVisible", "isImeVisible", "<init>", "(ZZ)V", "copy", "(ZZ)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel$StickyContainerVisibilityState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyContainerVisibilityState {
        private final boolean isImeVisible;
        private final boolean isNonStickyVisible;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StickyContainerVisibilityState() {
            this(r2, r2, 3, null);
            boolean z11 = false;
        }

        public static /* synthetic */ StickyContainerVisibilityState copy$default(StickyContainerVisibilityState stickyContainerVisibilityState, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = stickyContainerVisibilityState.isNonStickyVisible;
            }
            if ((i11 & 2) != 0) {
                z12 = stickyContainerVisibilityState.isImeVisible;
            }
            return stickyContainerVisibilityState.copy(z11, z12);
        }

        @NotNull
        public final StickyContainerVisibilityState copy(boolean isNonStickyVisible, boolean isImeVisible) {
            return new StickyContainerVisibilityState(isNonStickyVisible, isImeVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyContainerVisibilityState)) {
                return false;
            }
            StickyContainerVisibilityState stickyContainerVisibilityState = (StickyContainerVisibilityState) other;
            return this.isNonStickyVisible == stickyContainerVisibilityState.isNonStickyVisible && this.isImeVisible == stickyContainerVisibilityState.isImeVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isImeVisible) + (Boolean.hashCode(this.isNonStickyVisible) * 31);
        }

        /* renamed from: isImeVisible, reason: from getter */
        public final boolean getIsImeVisible() {
            return this.isImeVisible;
        }

        /* renamed from: isNonStickyVisible, reason: from getter */
        public final boolean getIsNonStickyVisible() {
            return this.isNonStickyVisible;
        }

        @NotNull
        public String toString() {
            return c.c("StickyContainerVisibilityState(isNonStickyVisible=", ", isImeVisible=", ")", this.isNonStickyVisible, this.isImeVisible);
        }

        public StickyContainerVisibilityState(boolean z11, boolean z12) {
            this.isNonStickyVisible = z11;
            this.isImeVisible = z12;
        }

        public /* synthetic */ StickyContainerVisibilityState(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
        }
    }

    public HotelsBookTotalV3StickyViewModel() {
        Ae.w0<StickyContainerVisibilityState> SingleEventsFlow = FlowUtilsKt.SingleEventsFlow();
        this.mutableVisibilityStateFlow = SingleEventsFlow;
        this.visibilityStateFlow = C2399j.a(SingleEventsFlow);
        boolean z11 = false;
        this.cache = new StickyContainerVisibilityState(z11, z11, 3, null);
    }

    @NotNull
    public final B0<StickyContainerVisibilityState> getVisibilityStateFlow() {
        return this.visibilityStateFlow;
    }

    public final void onKeyboardVisibilityChanged(boolean isVisible) {
        C10727i.c(x0.a(this), null, null, new HotelsBookTotalV3StickyViewModel$onKeyboardVisibilityChanged$1(this, isVisible, null), 3);
    }

    public final void onNonStickyVisibilityChanged(boolean isVisible) {
        C10727i.c(x0.a(this), null, null, new HotelsBookTotalV3StickyViewModel$onNonStickyVisibilityChanged$1(this, isVisible, null), 3);
    }
}
