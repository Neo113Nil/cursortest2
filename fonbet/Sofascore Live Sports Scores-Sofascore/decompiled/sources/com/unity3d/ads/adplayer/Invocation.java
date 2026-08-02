package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/adplayer/Invocation;", "", "location", "", "parameters", "", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getLocation", "()Ljava/lang/String;", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Invocation {

    @NotNull
    private final String location;

    @NotNull
    private final Object[] parameters;

    public Invocation(@NotNull String str, @NotNull Object[] objArr) {
        str.getClass();
        objArr.getClass();
        this.location = str;
        this.parameters = objArr;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final Object[] getParameters() {
        return this.parameters;
    }
}
