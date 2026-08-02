package com.blaze.blazesdk.features.shared.models.ui_shared;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamStatus;", "", "", "rawVal", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "LIVE", "UPCOMING", "ENDED", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeLiveStreamStatus {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeLiveStreamStatus[] $VALUES;
    public static final BlazeLiveStreamStatus LIVE = new BlazeLiveStreamStatus("LIVE", 0, "LIVE");
    public static final BlazeLiveStreamStatus UPCOMING = new BlazeLiveStreamStatus("UPCOMING", 1, "UPCOMING");
    public static final BlazeLiveStreamStatus ENDED = new BlazeLiveStreamStatus("ENDED", 2, "ENDED");

    private static final /* synthetic */ BlazeLiveStreamStatus[] $values() {
        return new BlazeLiveStreamStatus[]{LIVE, UPCOMING, ENDED};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus$a] */
    static {
        BlazeLiveStreamStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Object(null) { // from class: com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus.a
        };
    }

    private BlazeLiveStreamStatus(String str, int i, String str2) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeLiveStreamStatus valueOf(String str) {
        return (BlazeLiveStreamStatus) Enum.valueOf(BlazeLiveStreamStatus.class, str);
    }

    public static BlazeLiveStreamStatus[] values() {
        return (BlazeLiveStreamStatus[]) $VALUES.clone();
    }
}
