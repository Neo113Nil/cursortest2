package com.unity3d.ads.network.model;

import com.ironsource.C4094gc;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/network/model/RequestType;", "", "<init>", "(Ljava/lang/String;I)V", C4094gc.b, C4094gc.a, "HEAD", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ RequestType[] $VALUES;
    public static final RequestType POST = new RequestType(C4094gc.b, 0);
    public static final RequestType GET = new RequestType(C4094gc.a, 1);
    public static final RequestType HEAD = new RequestType("HEAD", 2);

    private static final /* synthetic */ RequestType[] $values() {
        return new RequestType[]{POST, GET, HEAD};
    }

    static {
        RequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private RequestType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }
}
