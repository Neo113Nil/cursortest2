package ru.ozon.app.android.composer.view.multiframebinder;

import Ql.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/BindStepInfo;", "", "", "avgStepDuration", "", "callCount", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getAvgStepDuration", "()J", "setAvgStepDuration", "(J)V", "I", "getCallCount", "setCallCount", "(I)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BindStepInfo {
    private long avgStepDuration;
    private int callCount;

    public BindStepInfo() {
        this(0L, 0, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindStepInfo)) {
            return false;
        }
        BindStepInfo bindStepInfo = (BindStepInfo) other;
        return this.avgStepDuration == bindStepInfo.avgStepDuration && this.callCount == bindStepInfo.callCount;
    }

    public final long getAvgStepDuration() {
        return this.avgStepDuration;
    }

    public final int getCallCount() {
        return this.callCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.callCount) + (Long.hashCode(this.avgStepDuration) * 31);
    }

    public final void setAvgStepDuration(long j11) {
        this.avgStepDuration = j11;
    }

    public final void setCallCount(int i11) {
        this.callCount = i11;
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = c.b(this.avgStepDuration, "BindStepInfo(avgStepDuration=", this.callCount, ", callCount=");
        b11.append(")");
        return b11.toString();
    }

    public BindStepInfo(long j11, int i11) {
        this.avgStepDuration = j11;
        this.callCount = i11;
    }

    public /* synthetic */ BindStepInfo(long j11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j11, (i12 & 2) != 0 ? 0 : i11);
    }
}
