package com.inmobi.ads.core;

import androidx.annotation.Keep;
import defpackage.km5;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/inmobi/ads/core/Trackers;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "imExts", "", "getImExts", "()Ljava/util/List;", "url", "getUrl", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Trackers {

    @NotNull
    private final List<String> imExts;

    @NotNull
    private final String type = "";

    @NotNull
    private final List<String> url;

    public Trackers() {
        km5 km5Var = km5.a;
        this.imExts = km5Var;
        this.url = km5Var;
    }

    @NotNull
    public final List<String> getImExts() {
        return this.imExts;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> getUrl() {
        return this.url;
    }
}
