package ru.ozon.app.android.marketing.common.timer;

import C.C2702w;
import Pk0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/common/timer/WidgetTimerDTO;", "", "serverTimestamp", "", "startTimestamp", "endTimestamp", "<init>", "(JJJ)V", "getServerTimestamp", "()J", "getStartTimestamp", "getEndTimestamp", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WidgetTimerDTO {
    public static final int $stable = 0;
    private final long endTimestamp;
    private final long serverTimestamp;
    private final long startTimestamp;

    public WidgetTimerDTO(long j11, long j12, long j13) {
        this.serverTimestamp = j11;
        this.startTimestamp = j12;
        this.endTimestamp = j13;
    }

    public static /* synthetic */ WidgetTimerDTO copy$default(WidgetTimerDTO widgetTimerDTO, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = widgetTimerDTO.serverTimestamp;
        }
        long j14 = j11;
        if ((i11 & 2) != 0) {
            j12 = widgetTimerDTO.startTimestamp;
        }
        long j15 = j12;
        if ((i11 & 4) != 0) {
            j13 = widgetTimerDTO.endTimestamp;
        }
        return widgetTimerDTO.copy(j14, j15, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getServerTimestamp() {
        return this.serverTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    public final WidgetTimerDTO copy(long serverTimestamp, long startTimestamp, long endTimestamp) {
        return new WidgetTimerDTO(serverTimestamp, startTimestamp, endTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetTimerDTO)) {
            return false;
        }
        WidgetTimerDTO widgetTimerDTO = (WidgetTimerDTO) other;
        return this.serverTimestamp == widgetTimerDTO.serverTimestamp && this.startTimestamp == widgetTimerDTO.startTimestamp && this.endTimestamp == widgetTimerDTO.endTimestamp;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final long getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.endTimestamp) + c.a(Long.hashCode(this.serverTimestamp) * 31, 31, this.startTimestamp);
    }

    @NotNull
    public String toString() {
        long j11 = this.serverTimestamp;
        long j12 = this.startTimestamp;
        long j13 = this.endTimestamp;
        StringBuilder d11 = C2702w.d(j11, "WidgetTimerDTO(serverTimestamp=", ", startTimestamp=");
        d11.append(j12);
        d11.append(", endTimestamp=");
        d11.append(j13);
        d11.append(")");
        return d11.toString();
    }
}
