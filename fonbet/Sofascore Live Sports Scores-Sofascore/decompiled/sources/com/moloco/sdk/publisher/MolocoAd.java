package com.moloco.sdk.publisher;

import defpackage.dmi;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAd;", "", "networkName", "", "adUnitId", "revenue", "", "creativeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "getNetworkName", "()Ljava/lang/String;", "getAdUnitId", "getRevenue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCreativeId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/moloco/sdk/publisher/MolocoAd;", "equals", "", "other", "hashCode", "", "toString", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MolocoAd {
    public static final int $stable = 0;

    @NotNull
    private final String adUnitId;

    @Nullable
    private final String creativeId;

    @NotNull
    private final String networkName;

    @Nullable
    private final Float revenue;

    public MolocoAd(@NotNull String str, @NotNull String str2, @Nullable Float f, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.networkName = str;
        this.adUnitId = str2;
        this.revenue = f;
        this.creativeId = str3;
    }

    public static /* synthetic */ MolocoAd copy$default(MolocoAd molocoAd, String str, String str2, Float f, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = molocoAd.networkName;
        }
        if ((i & 2) != 0) {
            str2 = molocoAd.adUnitId;
        }
        if ((i & 4) != 0) {
            f = molocoAd.revenue;
        }
        if ((i & 8) != 0) {
            str3 = molocoAd.creativeId;
        }
        return molocoAd.copy(str, str2, f, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getRevenue() {
        return this.revenue;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final MolocoAd copy(@NotNull String networkName, @NotNull String adUnitId, @Nullable Float revenue, @Nullable String creativeId) {
        networkName.getClass();
        adUnitId.getClass();
        return new MolocoAd(networkName, adUnitId, revenue, creativeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MolocoAd)) {
            return false;
        }
        MolocoAd molocoAd = (MolocoAd) other;
        return Intrinsics.c(this.networkName, molocoAd.networkName) && Intrinsics.c(this.adUnitId, molocoAd.adUnitId) && Intrinsics.c(this.revenue, molocoAd.revenue) && Intrinsics.c(this.creativeId, molocoAd.creativeId);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final Float getRevenue() {
        return this.revenue;
    }

    public int hashCode() {
        int c = dmi.c(this.networkName.hashCode() * 31, 31, this.adUnitId);
        Float f = this.revenue;
        int hashCode = (c + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.creativeId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MolocoAd(networkName=");
        sb.append(this.networkName);
        sb.append(", adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", revenue=");
        sb.append(this.revenue);
        sb.append(", creativeId=");
        return lnb.q(sb, this.creativeId, ')');
    }

    public /* synthetic */ MolocoAd(String str, String str2, Float f, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : str3);
    }
}
