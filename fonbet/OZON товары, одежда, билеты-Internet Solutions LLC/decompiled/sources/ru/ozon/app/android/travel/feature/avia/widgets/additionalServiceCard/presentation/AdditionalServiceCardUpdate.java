package ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation.AdditionalServiceCardVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardUpdate;", "LA00/a$J$a;", "", "widgetId", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "newState", "<init>", "(JLru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "getNewState", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdditionalServiceCardUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final AdditionalServiceCardVO.State newState;
    private final long widgetId;

    public AdditionalServiceCardUpdate(long j11, @NotNull AdditionalServiceCardVO.State newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.widgetId = j11;
        this.newState = newState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServiceCardUpdate)) {
            return false;
        }
        AdditionalServiceCardUpdate additionalServiceCardUpdate = (AdditionalServiceCardUpdate) other;
        return this.widgetId == additionalServiceCardUpdate.widgetId && Intrinsics.d(this.newState, additionalServiceCardUpdate.newState);
    }

    @NotNull
    public final AdditionalServiceCardVO.State getNewState() {
        return this.newState;
    }

    public final long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return this.newState.hashCode() + (Long.hashCode(this.widgetId) * 31);
    }

    @NotNull
    public String toString() {
        return "AdditionalServiceCardUpdate(widgetId=" + this.widgetId + ", newState=" + this.newState + ")";
    }
}
