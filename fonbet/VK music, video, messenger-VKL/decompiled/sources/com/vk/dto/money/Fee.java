package com.vk.dto.money;

import java.io.Serializable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.shy;
import xsna.vu5;

/* compiled from: Fee.kt */
/* loaded from: classes18.dex */
public final class Fee implements Serializable {
    private final int addAmount;
    private final int freeAmount;
    private final int freeAmountRest;
    private final int minAmount;
    private final double percent;

    public Fee(int i, int i2, int i3, double d, int i4) {
        this.percent = d;
        this.minAmount = i;
        this.addAmount = i2;
        this.freeAmount = i3;
        this.freeAmountRest = i4;
    }

    public final double a(int i) {
        int i2 = this.freeAmount;
        int i3 = this.freeAmountRest;
        return (i > i3 || i2 > i) ? i < i2 ? b(i) : b(i - i3) : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    public final double b(int i) {
        return Math.rint((Math.max(i * this.percent, this.minAmount) + this.addAmount) * 100) / 100.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fee)) {
            return false;
        }
        Fee fee = (Fee) obj;
        return Double.compare(this.percent, fee.percent) == 0 && this.minAmount == fee.minAmount && this.addAmount == fee.addAmount && this.freeAmount == fee.freeAmount && this.freeAmountRest == fee.freeAmountRest;
    }

    public final int hashCode() {
        return Integer.hashCode(this.freeAmountRest) + shy.a(this.freeAmount, shy.a(this.addAmount, shy.a(this.minAmount, Double.hashCode(this.percent) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Fee(percent=");
        sb.append(this.percent);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", addAmount=");
        sb.append(this.addAmount);
        sb.append(", freeAmount=");
        sb.append(this.freeAmount);
        sb.append(", freeAmountRest=");
        return vu5.b(sb, this.freeAmountRest, ')');
    }
}
