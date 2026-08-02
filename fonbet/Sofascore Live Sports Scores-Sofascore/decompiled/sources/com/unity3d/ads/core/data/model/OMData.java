package com.unity3d.ads.core.data.model;

import com.ironsource.C4259pg;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.me4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/model/OMData;", "", "version", "", HandleInvocationsFromAdViewer.KEY_OM_PARTNER, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", C4259pg.b, "()Ljava/lang/String;", "getPartnerName", "getPartnerVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OMData {

    @NotNull
    private final String partnerName;

    @NotNull
    private final String partnerVersion;

    @NotNull
    private final String version;

    public OMData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        me4.p(str, str2, str3);
        this.version = str;
        this.partnerName = str2;
        this.partnerVersion = str3;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oMData.version;
        }
        if ((i & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    @NotNull
    public final OMData copy(@NotNull String version, @NotNull String partnerName, @NotNull String partnerVersion) {
        version.getClass();
        partnerName.getClass();
        partnerVersion.getClass();
        return new OMData(version, partnerName, partnerVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) other;
        return Intrinsics.c(this.version, oMData.version) && Intrinsics.c(this.partnerName, oMData.partnerName) && Intrinsics.c(this.partnerVersion, oMData.partnerVersion);
    }

    @NotNull
    public final String getPartnerName() {
        return this.partnerName;
    }

    @NotNull
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.partnerVersion.hashCode() + dmi.c(this.version.hashCode() * 31, 31, this.partnerName);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OMData(version=");
        sb.append(this.version);
        sb.append(", partnerName=");
        sb.append(this.partnerName);
        sb.append(", partnerVersion=");
        return lnb.q(sb, this.partnerVersion, ')');
    }
}
