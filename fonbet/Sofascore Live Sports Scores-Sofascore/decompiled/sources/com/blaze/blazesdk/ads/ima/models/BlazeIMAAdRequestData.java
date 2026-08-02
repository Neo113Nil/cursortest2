package com.blaze.blazesdk.ads.ima.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeAdProvider;
import defpackage.dmi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/blaze/blazesdk/ads/ima/models/BlazeIMAAdRequestData;", "", "adTag", "", "adProvider", "Lcom/blaze/blazesdk/ads/models/ui/BlazeAdProvider;", "context", "", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/ads/models/ui/BlazeAdProvider;Ljava/util/Map;)V", "getAdTag", "()Ljava/lang/String;", "getAdProvider", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeAdProvider;", "getContext", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeIMAAdRequestData {
    public static final int $stable = 8;

    @Nullable
    private final BlazeAdProvider adProvider;

    @NotNull
    private final String adTag;

    @NotNull
    private final Map<String, String> context;

    public BlazeIMAAdRequestData(@NotNull String str, @Nullable BlazeAdProvider blazeAdProvider, @NotNull Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.adTag = str;
        this.adProvider = blazeAdProvider;
        this.context = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlazeIMAAdRequestData copy$default(BlazeIMAAdRequestData blazeIMAAdRequestData, String str, BlazeAdProvider blazeAdProvider, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeIMAAdRequestData.adTag;
        }
        if ((i & 2) != 0) {
            blazeAdProvider = blazeIMAAdRequestData.adProvider;
        }
        if ((i & 4) != 0) {
            map = blazeIMAAdRequestData.context;
        }
        return blazeIMAAdRequestData.copy(str, blazeAdProvider, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAdTag() {
        return this.adTag;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BlazeAdProvider getAdProvider() {
        return this.adProvider;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.context;
    }

    @NotNull
    public final BlazeIMAAdRequestData copy(@NotNull String adTag, @Nullable BlazeAdProvider adProvider, @NotNull Map<String, String> context) {
        adTag.getClass();
        context.getClass();
        return new BlazeIMAAdRequestData(adTag, adProvider, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeIMAAdRequestData)) {
            return false;
        }
        BlazeIMAAdRequestData blazeIMAAdRequestData = (BlazeIMAAdRequestData) other;
        return Intrinsics.c(this.adTag, blazeIMAAdRequestData.adTag) && this.adProvider == blazeIMAAdRequestData.adProvider && Intrinsics.c(this.context, blazeIMAAdRequestData.context);
    }

    @Nullable
    public final BlazeAdProvider getAdProvider() {
        return this.adProvider;
    }

    @NotNull
    public final String getAdTag() {
        return this.adTag;
    }

    @NotNull
    public final Map<String, String> getContext() {
        return this.context;
    }

    public int hashCode() {
        int hashCode = this.adTag.hashCode() * 31;
        BlazeAdProvider blazeAdProvider = this.adProvider;
        return this.context.hashCode() + ((hashCode + (blazeAdProvider == null ? 0 : blazeAdProvider.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeIMAAdRequestData(adTag=");
        sb.append(this.adTag);
        sb.append(", adProvider=");
        sb.append(this.adProvider);
        sb.append(", context=");
        return dmi.s(sb, this.context, ')');
    }
}
