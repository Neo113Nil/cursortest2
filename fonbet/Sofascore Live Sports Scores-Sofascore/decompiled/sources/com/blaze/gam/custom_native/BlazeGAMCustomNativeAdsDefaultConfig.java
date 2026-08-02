package com.blaze.gam.custom_native;

import androidx.annotation.Keep;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDefaultConfig;", "", "adUnit", "", "templateId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdUnit", "()Ljava/lang/String;", "getTemplateId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeGAMCustomNativeAdsDefaultConfig {

    @NotNull
    private final String adUnit;

    @NotNull
    private final String templateId;

    public BlazeGAMCustomNativeAdsDefaultConfig(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.adUnit = str;
        this.templateId = str2;
    }

    public static /* synthetic */ BlazeGAMCustomNativeAdsDefaultConfig copy$default(BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeGAMCustomNativeAdsDefaultConfig.adUnit;
        }
        if ((i & 2) != 0) {
            str2 = blazeGAMCustomNativeAdsDefaultConfig.templateId;
        }
        return blazeGAMCustomNativeAdsDefaultConfig.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAdUnit() {
        return this.adUnit;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    @NotNull
    public final BlazeGAMCustomNativeAdsDefaultConfig copy(@NotNull String adUnit, @NotNull String templateId) {
        adUnit.getClass();
        templateId.getClass();
        return new BlazeGAMCustomNativeAdsDefaultConfig(adUnit, templateId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeGAMCustomNativeAdsDefaultConfig)) {
            return false;
        }
        BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig = (BlazeGAMCustomNativeAdsDefaultConfig) other;
        return Intrinsics.c(this.adUnit, blazeGAMCustomNativeAdsDefaultConfig.adUnit) && Intrinsics.c(this.templateId, blazeGAMCustomNativeAdsDefaultConfig.templateId);
    }

    @NotNull
    public final String getAdUnit() {
        return this.adUnit;
    }

    @NotNull
    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        return this.templateId.hashCode() + (this.adUnit.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeGAMCustomNativeAdsDefaultConfig(adUnit=");
        sb.append(this.adUnit);
        sb.append(", templateId=");
        return lnb.q(sb, this.templateId, ')');
    }
}
