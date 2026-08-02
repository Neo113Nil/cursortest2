package ru.ozon.app.android.orderdetails.orderTimeline.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTimeline/data/OrderTimelineDTO;", "", "currentStep", "", "steps", "", "Lru/ozon/app/android/orderdetails/orderTimeline/data/StepsItem;", "<init>", "(ILjava/util/List;)V", "getCurrentStep", "()I", "getSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTimelineDTO {
    public static final int $stable = 8;
    private final int currentStep;

    @NotNull
    private final List<StepsItem> steps;

    public OrderTimelineDTO(int i11, @NotNull List<StepsItem> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.currentStep = i11;
        this.steps = steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderTimelineDTO copy$default(OrderTimelineDTO orderTimelineDTO, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = orderTimelineDTO.currentStep;
        }
        if ((i12 & 2) != 0) {
            list = orderTimelineDTO.steps;
        }
        return orderTimelineDTO.copy(i11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    @NotNull
    public final List<StepsItem> component2() {
        return this.steps;
    }

    @NotNull
    public final OrderTimelineDTO copy(int currentStep, @NotNull List<StepsItem> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new OrderTimelineDTO(currentStep, steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTimelineDTO)) {
            return false;
        }
        OrderTimelineDTO orderTimelineDTO = (OrderTimelineDTO) other;
        return this.currentStep == orderTimelineDTO.currentStep && Intrinsics.d(this.steps, orderTimelineDTO.steps);
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    @NotNull
    public final List<StepsItem> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return this.steps.hashCode() + (Integer.hashCode(this.currentStep) * 31);
    }

    @NotNull
    public String toString() {
        return "OrderTimelineDTO(currentStep=" + this.currentStep + ", steps=" + this.steps + ")";
    }
}
