package io.intercom.android.sdk.lightcompressor;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCompressor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "", "<init>", "(Ljava/lang/String;I)V", "VERY_HIGH", "HIGH", "MEDIUM", "LOW", "VERY_LOW", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VideoQuality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;
    public static final VideoQuality VERY_HIGH = new VideoQuality("VERY_HIGH", 0);
    public static final VideoQuality HIGH = new VideoQuality("HIGH", 1);
    public static final VideoQuality MEDIUM = new VideoQuality("MEDIUM", 2);
    public static final VideoQuality LOW = new VideoQuality("LOW", 3);
    public static final VideoQuality VERY_LOW = new VideoQuality("VERY_LOW", 4);

    private static final /* synthetic */ VideoQuality[] $values() {
        return new VideoQuality[]{VERY_HIGH, HIGH, MEDIUM, LOW, VERY_LOW};
    }

    public static EnumEntries<VideoQuality> getEntries() {
        return $ENTRIES;
    }

    private VideoQuality(String str, int i) {
    }

    static {
        VideoQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }
}
