package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation;

import Bl.C2639a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/Timer;", "", "", "timerStopsAt", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtom", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimerStopsAt", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTextAtom", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Timer {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final TextAtom textAtom;
    private final long timerStopsAt;

    public Timer(long j11, @NotNull TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(textAtom, "textAtom");
        this.timerStopsAt = j11;
        this.textAtom = textAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Timer)) {
            return false;
        }
        Timer timer = (Timer) other;
        return this.timerStopsAt == timer.timerStopsAt && Intrinsics.d(this.textAtom, timer.textAtom);
    }

    @NotNull
    public final TextAtom getTextAtom() {
        return this.textAtom;
    }

    public final long getTimerStopsAt() {
        return this.timerStopsAt;
    }

    public int hashCode() {
        return this.textAtom.hashCode() + (Long.hashCode(this.timerStopsAt) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = C2639a.c("Timer(timerStopsAt=", this.timerStopsAt, ", textAtom=", this.textAtom);
        c11.append(")");
        return c11.toString();
    }
}
