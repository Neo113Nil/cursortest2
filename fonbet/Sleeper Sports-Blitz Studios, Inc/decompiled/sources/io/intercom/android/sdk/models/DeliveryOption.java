package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageStyle.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/models/DeliveryOption;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "SUMMARY", "BADGE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveryOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeliveryOption[] $VALUES;

    @SerializedName("full")
    public static final DeliveryOption FULL = new DeliveryOption("FULL", 0);

    @SerializedName("summary")
    public static final DeliveryOption SUMMARY = new DeliveryOption("SUMMARY", 1);

    @SerializedName(MetricTracker.Object.BADGE)
    public static final DeliveryOption BADGE = new DeliveryOption("BADGE", 2);

    private static final /* synthetic */ DeliveryOption[] $values() {
        return new DeliveryOption[]{FULL, SUMMARY, BADGE};
    }

    public static EnumEntries<DeliveryOption> getEntries() {
        return $ENTRIES;
    }

    private DeliveryOption(String str, int i) {
    }

    static {
        DeliveryOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeliveryOption valueOf(String str) {
        return (DeliveryOption) Enum.valueOf(DeliveryOption.class, str);
    }

    public static DeliveryOption[] values() {
        return (DeliveryOption[]) $VALUES.clone();
    }
}
