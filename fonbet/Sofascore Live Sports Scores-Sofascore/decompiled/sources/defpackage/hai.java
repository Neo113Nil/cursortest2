package defpackage;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hai {
    public static final /* synthetic */ hai[] a = {new hai("SWITCHER", 0), new hai("TOURNAMENT", 1), new hai("TABLE_HEADER", 2), new hai("DATA", 3), new hai(NativeAdContent.ViewTag.AD_DESCRIPTION, 4), new hai("LAST_UPDATE", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    hai EF5;

    public static hai valueOf(String str) {
        return (hai) Enum.valueOf(hai.class, str);
    }

    public static hai[] values() {
        return (hai[]) a.clone();
    }
}
