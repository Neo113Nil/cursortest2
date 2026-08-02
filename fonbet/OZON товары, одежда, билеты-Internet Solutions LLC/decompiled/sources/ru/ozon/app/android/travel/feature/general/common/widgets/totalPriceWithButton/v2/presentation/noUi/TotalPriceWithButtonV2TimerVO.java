package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.noUi;

import C.C2702w;
import P4.f;
import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/noUi/TotalPriceWithButtonV2TimerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "deadline", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getDeadline", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TotalPriceWithButtonV2TimerVO implements c {
    private final long deadline;
    private final long id;

    public TotalPriceWithButtonV2TimerVO(long j11, long j12) {
        this.id = j11;
        this.deadline = j12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalPriceWithButtonV2TimerVO)) {
            return false;
        }
        TotalPriceWithButtonV2TimerVO totalPriceWithButtonV2TimerVO = (TotalPriceWithButtonV2TimerVO) other;
        return this.id == totalPriceWithButtonV2TimerVO.id && this.deadline == totalPriceWithButtonV2TimerVO.deadline;
    }

    public final long getDeadline() {
        return this.deadline;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Long.hashCode(this.deadline) + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return f.a(this.deadline, ")", C2702w.d(this.id, "TotalPriceWithButtonV2TimerVO(id=", ", deadline="));
    }
}
