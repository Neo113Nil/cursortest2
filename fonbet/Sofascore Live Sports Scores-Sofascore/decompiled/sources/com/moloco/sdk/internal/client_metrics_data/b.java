package com.moloco.sdk.internal.client_metrics_data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public static final /* synthetic */ b[] a = {new b("Reason", 0), new b("AdType", 1), new b("Result", 2), new b("Country", 3), new b("RetryAttempt", 4), new b("Step", 5), new b("CreativeType", 6), new b("MissingFields", 7), new b("ParentViewType", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    b EF5;

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) a.clone();
    }
}
