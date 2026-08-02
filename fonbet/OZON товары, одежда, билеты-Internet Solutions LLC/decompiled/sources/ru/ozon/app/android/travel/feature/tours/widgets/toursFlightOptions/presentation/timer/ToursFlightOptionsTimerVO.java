package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.timer;

import C.C2702w;
import Lh.a;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/timer/ToursFlightOptionsTimerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "timeoutMs", "Lru/ozon/uni/atoms/af/AtomAction;", "timeoutAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JJLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getTimeoutMs", "Lru/ozon/uni/atoms/af/AtomAction;", "getTimeoutAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursFlightOptionsTimerVO implements c {
    private final long id;

    @NotNull
    private final AtomAction timeoutAction;
    private final long timeoutMs;
    private final t viewEvent;

    public ToursFlightOptionsTimerVO(long j11, long j12, @NotNull AtomAction timeoutAction, t tVar) {
        Intrinsics.checkNotNullParameter(timeoutAction, "timeoutAction");
        this.id = j11;
        this.timeoutMs = j12;
        this.timeoutAction = timeoutAction;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursFlightOptionsTimerVO)) {
            return false;
        }
        ToursFlightOptionsTimerVO toursFlightOptionsTimerVO = (ToursFlightOptionsTimerVO) other;
        return this.id == toursFlightOptionsTimerVO.id && this.timeoutMs == toursFlightOptionsTimerVO.timeoutMs && Intrinsics.d(this.timeoutAction, toursFlightOptionsTimerVO.timeoutAction) && Intrinsics.d(this.viewEvent, toursFlightOptionsTimerVO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final AtomAction getTimeoutAction() {
        return this.timeoutAction;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C4598rp.a(this.timeoutAction, Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.timeoutMs), 31);
        t tVar = this.viewEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.timeoutMs;
        AtomAction atomAction = this.timeoutAction;
        t tVar = this.viewEvent;
        StringBuilder d11 = C2702w.d(j11, "ToursFlightOptionsTimerVO(id=", ", timeoutMs=");
        d11.append(j12);
        d11.append(", timeoutAction=");
        d11.append(atomAction);
        return a.b(d11, ", viewEvent=", tVar, ")");
    }
}
