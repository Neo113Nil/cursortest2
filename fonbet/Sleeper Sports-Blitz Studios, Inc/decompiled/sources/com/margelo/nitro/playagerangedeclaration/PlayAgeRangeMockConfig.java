package com.margelo.nitro.playagerangedeclaration;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayAgeRangeMockConfig.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeMockConfig;", "", "userStatus", "", "ageLower", "ageUpper", "installId", "", "mostRecentApprovalDate", "Ljava/util/Date;", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)V", "getUserStatus", "()I", "getAgeLower", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAgeUpper", "getInstallId", "()Ljava/lang/String;", "getMostRecentApprovalDate", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeMockConfig;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PlayAgeRangeMockConfig {
    private final Integer ageLower;
    private final Integer ageUpper;
    private final String installId;
    private final Date mostRecentApprovalDate;
    private final int userStatus;

    public static /* synthetic */ PlayAgeRangeMockConfig copy$default(PlayAgeRangeMockConfig playAgeRangeMockConfig, int i, Integer num, Integer num2, String str, Date date, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = playAgeRangeMockConfig.userStatus;
        }
        if ((i2 & 2) != 0) {
            num = playAgeRangeMockConfig.ageLower;
        }
        if ((i2 & 4) != 0) {
            num2 = playAgeRangeMockConfig.ageUpper;
        }
        if ((i2 & 8) != 0) {
            str = playAgeRangeMockConfig.installId;
        }
        if ((i2 & 16) != 0) {
            date = playAgeRangeMockConfig.mostRecentApprovalDate;
        }
        Date date2 = date;
        Integer num3 = num2;
        return playAgeRangeMockConfig.copy(i, num, num3, str, date2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUserStatus() {
        return this.userStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAgeLower() {
        return this.ageLower;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getAgeUpper() {
        return this.ageUpper;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInstallId() {
        return this.installId;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getMostRecentApprovalDate() {
        return this.mostRecentApprovalDate;
    }

    public final PlayAgeRangeMockConfig copy(int userStatus, Integer ageLower, Integer ageUpper, String installId, Date mostRecentApprovalDate) {
        return new PlayAgeRangeMockConfig(userStatus, ageLower, ageUpper, installId, mostRecentApprovalDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayAgeRangeMockConfig)) {
            return false;
        }
        PlayAgeRangeMockConfig playAgeRangeMockConfig = (PlayAgeRangeMockConfig) other;
        return this.userStatus == playAgeRangeMockConfig.userStatus && Intrinsics.areEqual(this.ageLower, playAgeRangeMockConfig.ageLower) && Intrinsics.areEqual(this.ageUpper, playAgeRangeMockConfig.ageUpper) && Intrinsics.areEqual(this.installId, playAgeRangeMockConfig.installId) && Intrinsics.areEqual(this.mostRecentApprovalDate, playAgeRangeMockConfig.mostRecentApprovalDate);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.userStatus) * 31;
        Integer num = this.ageLower;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ageUpper;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.installId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.mostRecentApprovalDate;
        return hashCode4 + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "PlayAgeRangeMockConfig(userStatus=" + this.userStatus + ", ageLower=" + this.ageLower + ", ageUpper=" + this.ageUpper + ", installId=" + this.installId + ", mostRecentApprovalDate=" + this.mostRecentApprovalDate + ")";
    }

    public PlayAgeRangeMockConfig(int i, Integer num, Integer num2, String str, Date date) {
        this.userStatus = i;
        this.ageLower = num;
        this.ageUpper = num2;
        this.installId = str;
        this.mostRecentApprovalDate = date;
    }

    public /* synthetic */ PlayAgeRangeMockConfig(int i, Integer num, Integer num2, String str, Date date, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : date);
    }

    public final int getUserStatus() {
        return this.userStatus;
    }

    public final Integer getAgeLower() {
        return this.ageLower;
    }

    public final Integer getAgeUpper() {
        return this.ageUpper;
    }

    public final String getInstallId() {
        return this.installId;
    }

    public final Date getMostRecentApprovalDate() {
        return this.mostRecentApprovalDate;
    }
}
