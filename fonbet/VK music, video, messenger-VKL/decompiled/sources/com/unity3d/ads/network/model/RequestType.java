package com.unity3d.ads.network.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequestType.kt */
/* loaded from: classes14.dex */
public final class RequestType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RequestType[] $VALUES;
    public static final RequestType POST = new RequestType("POST", 0);
    public static final RequestType GET = new RequestType("GET", 1);
    public static final RequestType HEAD = new RequestType("HEAD", 2);

    private static final /* synthetic */ RequestType[] $values() {
        return new RequestType[]{POST, GET, HEAD};
    }

    static {
        RequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private RequestType(String str, int i) {
    }

    public static zrp<RequestType> getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }
}
