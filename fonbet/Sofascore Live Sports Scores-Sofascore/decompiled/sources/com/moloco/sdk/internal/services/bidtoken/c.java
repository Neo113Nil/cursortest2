package com.moloco.sdk.internal.services.bidtoken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c {
    public static final /* synthetic */ c[] a = {new c("UNKNOWN", 0), new c("HTTP_REQUEST_TIMEOUT", 1), new c("UNKNOWN_HOST", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    c EF5;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) a.clone();
    }
}
