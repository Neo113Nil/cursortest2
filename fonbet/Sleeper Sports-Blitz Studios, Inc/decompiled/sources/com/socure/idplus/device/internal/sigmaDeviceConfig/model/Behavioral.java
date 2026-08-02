package com.socure.idplus.device.internal.sigmaDeviceConfig.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0001.B;\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Behavioral;", "", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsBehavior;", "component1", "", "component2", "", "component3", "", "component4", "component5", "", "component6", "flags", "host", "sessionDuration", "sampleRate", "bundleGenerationInterval", "sessionIdleTimeoutSeconds", "copy", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "other", "", "equals", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsBehavior;", "getFlags", "()Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsBehavior;", "setFlags", "(Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsBehavior;)V", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "J", "getSessionDuration", "()J", "F", "getSampleRate", "()F", "getBundleGenerationInterval", "I", "getSessionIdleTimeoutSeconds", "()I", "<init>", "(Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsBehavior;Ljava/lang/String;JFJI)V", "Companion", "com/socure/idplus/device/internal/sigmaDeviceConfig/model/a", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class Behavioral {
    public static final a Companion = new a();
    private static final int DEFAULT_SESSION_IDLE_TIMEOUT_SECONDS = 600;

    @SerializedName("bundleGenerationInterval")
    private final long bundleGenerationInterval;

    @SerializedName("flags")
    private FlagsBehavior flags;

    @SerializedName("host")
    private final String host;

    @SerializedName("sampleRate")
    private final float sampleRate;

    @SerializedName("sessionDuration")
    private final long sessionDuration;

    @SerializedName("sessionIdleTimeoutSeconds")
    private final int sessionIdleTimeoutSeconds;

    public Behavioral(FlagsBehavior flags, String host, long j, float f, long j2, int i) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(host, "host");
        this.flags = flags;
        this.host = host;
        this.sessionDuration = j;
        this.sampleRate = f;
        this.bundleGenerationInterval = j2;
        this.sessionIdleTimeoutSeconds = i;
    }

    public static /* synthetic */ Behavioral copy$default(Behavioral behavioral, FlagsBehavior flagsBehavior, String str, long j, float f, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flagsBehavior = behavioral.flags;
        }
        if ((i2 & 2) != 0) {
            str = behavioral.host;
        }
        if ((i2 & 4) != 0) {
            j = behavioral.sessionDuration;
        }
        if ((i2 & 8) != 0) {
            f = behavioral.sampleRate;
        }
        if ((i2 & 16) != 0) {
            j2 = behavioral.bundleGenerationInterval;
        }
        if ((i2 & 32) != 0) {
            i = behavioral.sessionIdleTimeoutSeconds;
        }
        float f2 = f;
        long j3 = j;
        return behavioral.copy(flagsBehavior, str, j3, f2, j2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final FlagsBehavior getFlags() {
        return this.flags;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component5, reason: from getter */
    public final long getBundleGenerationInterval() {
        return this.bundleGenerationInterval;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public final Behavioral copy(FlagsBehavior flags, String host, long sessionDuration, float sampleRate, long bundleGenerationInterval, int sessionIdleTimeoutSeconds) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(host, "host");
        return new Behavioral(flags, host, sessionDuration, sampleRate, bundleGenerationInterval, sessionIdleTimeoutSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Behavioral)) {
            return false;
        }
        Behavioral behavioral = (Behavioral) other;
        return Intrinsics.areEqual(this.flags, behavioral.flags) && Intrinsics.areEqual(this.host, behavioral.host) && this.sessionDuration == behavioral.sessionDuration && Float.compare(this.sampleRate, behavioral.sampleRate) == 0 && this.bundleGenerationInterval == behavioral.bundleGenerationInterval && this.sessionIdleTimeoutSeconds == behavioral.sessionIdleTimeoutSeconds;
    }

    public final long getBundleGenerationInterval() {
        return this.bundleGenerationInterval;
    }

    public final FlagsBehavior getFlags() {
        return this.flags;
    }

    public final String getHost() {
        return this.host;
    }

    public final float getSampleRate() {
        return this.sampleRate;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final int getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionIdleTimeoutSeconds) + ((Long.hashCode(this.bundleGenerationInterval) + ((Float.hashCode(this.sampleRate) + ((Long.hashCode(this.sessionDuration) + com.socure.idplus.device.internal.behavior.model.a.a(this.host, this.flags.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    public final void setFlags(FlagsBehavior flagsBehavior) {
        Intrinsics.checkNotNullParameter(flagsBehavior, "<set-?>");
        this.flags = flagsBehavior;
    }

    public String toString() {
        return "Behavioral(flags=" + this.flags + ", host=" + this.host + ", sessionDuration=" + this.sessionDuration + ", sampleRate=" + this.sampleRate + ", bundleGenerationInterval=" + this.bundleGenerationInterval + ", sessionIdleTimeoutSeconds=" + this.sessionIdleTimeoutSeconds + ")";
    }

    public /* synthetic */ Behavioral(FlagsBehavior flagsBehavior, String str, long j, float f, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new FlagsBehavior(false, 1, null) : flagsBehavior, str, j, f, j2, (i2 & 32) != 0 ? 600 : i);
    }
}
