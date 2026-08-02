package ru.ozon.fintech.analytic.domain.config;

import E0.C2942q;
import Fm.C3051a;
import Pk0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/analytic/domain/config/MobileHealthFeatureData;", "", "countEventsForSend", "", "aliveTickerTimeout", "", "clearSingleEventsTimeout", "eventLifeTimeMills", "<init>", "(IJJLjava/lang/Long;)V", "getCountEventsForSend", "()I", "getAliveTickerTimeout", "()J", "getClearSingleEventsTimeout", "getEventLifeTimeMills", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(IJJLjava/lang/Long;)Lru/ozon/fintech/analytic/domain/config/MobileHealthFeatureData;", "equals", "", "other", "hashCode", "toString", "", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MobileHealthFeatureData {
    private final long aliveTickerTimeout;
    private final long clearSingleEventsTimeout;
    private final int countEventsForSend;
    private final Long eventLifeTimeMills;

    public MobileHealthFeatureData() {
        this(0, 0L, 0L, null, 15, null);
    }

    public static /* synthetic */ MobileHealthFeatureData copy$default(MobileHealthFeatureData mobileHealthFeatureData, int i11, long j11, long j12, Long l11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mobileHealthFeatureData.countEventsForSend;
        }
        if ((i12 & 2) != 0) {
            j11 = mobileHealthFeatureData.aliveTickerTimeout;
        }
        if ((i12 & 4) != 0) {
            j12 = mobileHealthFeatureData.clearSingleEventsTimeout;
        }
        if ((i12 & 8) != 0) {
            l11 = mobileHealthFeatureData.eventLifeTimeMills;
        }
        Long l12 = l11;
        return mobileHealthFeatureData.copy(i11, j11, j12, l12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCountEventsForSend() {
        return this.countEventsForSend;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAliveTickerTimeout() {
        return this.aliveTickerTimeout;
    }

    /* renamed from: component3, reason: from getter */
    public final long getClearSingleEventsTimeout() {
        return this.clearSingleEventsTimeout;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getEventLifeTimeMills() {
        return this.eventLifeTimeMills;
    }

    @NotNull
    public final MobileHealthFeatureData copy(int countEventsForSend, long aliveTickerTimeout, long clearSingleEventsTimeout, Long eventLifeTimeMills) {
        return new MobileHealthFeatureData(countEventsForSend, aliveTickerTimeout, clearSingleEventsTimeout, eventLifeTimeMills);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileHealthFeatureData)) {
            return false;
        }
        MobileHealthFeatureData mobileHealthFeatureData = (MobileHealthFeatureData) other;
        return this.countEventsForSend == mobileHealthFeatureData.countEventsForSend && this.aliveTickerTimeout == mobileHealthFeatureData.aliveTickerTimeout && this.clearSingleEventsTimeout == mobileHealthFeatureData.clearSingleEventsTimeout && Intrinsics.d(this.eventLifeTimeMills, mobileHealthFeatureData.eventLifeTimeMills);
    }

    public final long getAliveTickerTimeout() {
        return this.aliveTickerTimeout;
    }

    public final long getClearSingleEventsTimeout() {
        return this.clearSingleEventsTimeout;
    }

    public final int getCountEventsForSend() {
        return this.countEventsForSend;
    }

    public final Long getEventLifeTimeMills() {
        return this.eventLifeTimeMills;
    }

    public int hashCode() {
        int a11 = c.a(c.a(Integer.hashCode(this.countEventsForSend) * 31, 31, this.aliveTickerTimeout), 31, this.clearSingleEventsTimeout);
        Long l11 = this.eventLifeTimeMills;
        return a11 + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.countEventsForSend;
        long j11 = this.aliveTickerTimeout;
        long j12 = this.clearSingleEventsTimeout;
        Long l11 = this.eventLifeTimeMills;
        StringBuilder sb2 = new StringBuilder("MobileHealthFeatureData(countEventsForSend=");
        sb2.append(i11);
        sb2.append(", aliveTickerTimeout=");
        sb2.append(j11);
        C2942q.f(sb2, ", clearSingleEventsTimeout=", j12, ", eventLifeTimeMills=");
        return C3051a.d(sb2, l11, ")");
    }

    public MobileHealthFeatureData(int i11, long j11, long j12, Long l11) {
        this.countEventsForSend = i11;
        this.aliveTickerTimeout = j11;
        this.clearSingleEventsTimeout = j12;
        this.eventLifeTimeMills = l11;
    }

    public /* synthetic */ MobileHealthFeatureData(int i11, long j11, long j12, Long l11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 15 : i11, (i12 & 2) != 0 ? 30000L : j11, (i12 & 4) != 0 ? 5000L : j12, (i12 & 8) != 0 ? null : l11);
    }
}
