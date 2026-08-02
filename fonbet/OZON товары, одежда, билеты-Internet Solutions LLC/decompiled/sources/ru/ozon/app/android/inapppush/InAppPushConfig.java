package ru.ozon.app.android.inapppush;

import Fm.C3051a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/inapppush/InAppPushConfig;", "", "", "delayAfterInitSdk", "delayAfterScreenOpen", "pollingInterval", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getDelayAfterInitSdk", "()Ljava/lang/Long;", "getDelayAfterScreenOpen", "getPollingInterval", "in-app-push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InAppPushConfig {
    private final Long delayAfterInitSdk;
    private final Long delayAfterScreenOpen;
    private final Long pollingInterval;

    public InAppPushConfig() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppPushConfig)) {
            return false;
        }
        InAppPushConfig inAppPushConfig = (InAppPushConfig) other;
        return Intrinsics.d(this.delayAfterInitSdk, inAppPushConfig.delayAfterInitSdk) && Intrinsics.d(this.delayAfterScreenOpen, inAppPushConfig.delayAfterScreenOpen) && Intrinsics.d(this.pollingInterval, inAppPushConfig.pollingInterval);
    }

    public final Long getDelayAfterInitSdk() {
        return this.delayAfterInitSdk;
    }

    public final Long getDelayAfterScreenOpen() {
        return this.delayAfterScreenOpen;
    }

    public final Long getPollingInterval() {
        return this.pollingInterval;
    }

    public int hashCode() {
        Long l11 = this.delayAfterInitSdk;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.delayAfterScreenOpen;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.pollingInterval;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l11 = this.delayAfterInitSdk;
        Long l12 = this.delayAfterScreenOpen;
        Long l13 = this.pollingInterval;
        StringBuilder sb2 = new StringBuilder("InAppPushConfig(delayAfterInitSdk=");
        sb2.append(l11);
        sb2.append(", delayAfterScreenOpen=");
        sb2.append(l12);
        sb2.append(", pollingInterval=");
        return C3051a.d(sb2, l13, ")");
    }

    public InAppPushConfig(Long l11, Long l12, Long l13) {
        this.delayAfterInitSdk = l11;
        this.delayAfterScreenOpen = l12;
        this.pollingInterval = l13;
    }

    public /* synthetic */ InAppPushConfig(Long l11, Long l12, Long l13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12, (i11 & 4) != 0 ? null : l13);
    }
}
