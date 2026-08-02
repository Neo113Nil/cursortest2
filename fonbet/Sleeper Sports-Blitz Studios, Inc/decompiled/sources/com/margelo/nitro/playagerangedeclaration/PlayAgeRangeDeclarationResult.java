package com.margelo.nitro.playagerangedeclaration;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PlayAgeRangeDeclarationResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010&J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006)"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "", "isEligible", "", "installId", "", "userStatus", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;", "error", "ageLower", "", "ageUpper", "mostRecentApprovalDate", "<init>", "(ZLjava/lang/String;Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "()Z", "getInstallId", "()Ljava/lang/String;", "getUserStatus", "()Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;", "getError", "getAgeLower", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAgeUpper", "getMostRecentApprovalDate", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/String;Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PlayAgeRangeDeclarationResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double ageLower;
    private final Double ageUpper;
    private final String error;
    private final String installId;
    private final boolean isEligible;
    private final String mostRecentApprovalDate;
    private final PlayAgeRangeDeclarationUserStatus userStatus;

    public static /* synthetic */ PlayAgeRangeDeclarationResult copy$default(PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult, boolean z, String str, PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus, String str2, Double d, Double d2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = playAgeRangeDeclarationResult.isEligible;
        }
        if ((i & 2) != 0) {
            str = playAgeRangeDeclarationResult.installId;
        }
        if ((i & 4) != 0) {
            playAgeRangeDeclarationUserStatus = playAgeRangeDeclarationResult.userStatus;
        }
        if ((i & 8) != 0) {
            str2 = playAgeRangeDeclarationResult.error;
        }
        if ((i & 16) != 0) {
            d = playAgeRangeDeclarationResult.ageLower;
        }
        if ((i & 32) != 0) {
            d2 = playAgeRangeDeclarationResult.ageUpper;
        }
        if ((i & 64) != 0) {
            str3 = playAgeRangeDeclarationResult.mostRecentApprovalDate;
        }
        Double d3 = d2;
        String str4 = str3;
        Double d4 = d;
        PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus2 = playAgeRangeDeclarationUserStatus;
        return playAgeRangeDeclarationResult.copy(z, str, playAgeRangeDeclarationUserStatus2, str2, d4, d3, str4);
    }

    @JvmStatic
    private static final PlayAgeRangeDeclarationResult fromCpp(boolean z, String str, PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus, String str2, Double d, Double d2, String str3) {
        return INSTANCE.fromCpp(z, str, playAgeRangeDeclarationUserStatus, str2, d, d2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInstallId() {
        return this.installId;
    }

    /* renamed from: component3, reason: from getter */
    public final PlayAgeRangeDeclarationUserStatus getUserStatus() {
        return this.userStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getAgeLower() {
        return this.ageLower;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getAgeUpper() {
        return this.ageUpper;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMostRecentApprovalDate() {
        return this.mostRecentApprovalDate;
    }

    public final PlayAgeRangeDeclarationResult copy(boolean isEligible, String installId, PlayAgeRangeDeclarationUserStatus userStatus, String error, Double ageLower, Double ageUpper, String mostRecentApprovalDate) {
        return new PlayAgeRangeDeclarationResult(isEligible, installId, userStatus, error, ageLower, ageUpper, mostRecentApprovalDate);
    }

    public String toString() {
        return "PlayAgeRangeDeclarationResult(isEligible=" + this.isEligible + ", installId=" + this.installId + ", userStatus=" + this.userStatus + ", error=" + this.error + ", ageLower=" + this.ageLower + ", ageUpper=" + this.ageUpper + ", mostRecentApprovalDate=" + this.mostRecentApprovalDate + ")";
    }

    public PlayAgeRangeDeclarationResult(boolean z, String str, PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus, String str2, Double d, Double d2, String str3) {
        this.isEligible = z;
        this.installId = str;
        this.userStatus = playAgeRangeDeclarationUserStatus;
        this.error = str2;
        this.ageLower = d;
        this.ageUpper = d2;
        this.mostRecentApprovalDate = str3;
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public final String getInstallId() {
        return this.installId;
    }

    public final PlayAgeRangeDeclarationUserStatus getUserStatus() {
        return this.userStatus;
    }

    public final String getError() {
        return this.error;
    }

    public final Double getAgeLower() {
        return this.ageLower;
    }

    public final Double getAgeUpper() {
        return this.ageUpper;
    }

    public final String getMostRecentApprovalDate() {
        return this.mostRecentApprovalDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayAgeRangeDeclarationResult)) {
            return false;
        }
        PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult = (PlayAgeRangeDeclarationResult) other;
        return Objects.deepEquals(Boolean.valueOf(this.isEligible), Boolean.valueOf(playAgeRangeDeclarationResult.isEligible)) && Objects.deepEquals(this.installId, playAgeRangeDeclarationResult.installId) && Objects.deepEquals(this.userStatus, playAgeRangeDeclarationResult.userStatus) && Objects.deepEquals(this.error, playAgeRangeDeclarationResult.error) && Objects.deepEquals(this.ageLower, playAgeRangeDeclarationResult.ageLower) && Objects.deepEquals(this.ageUpper, playAgeRangeDeclarationResult.ageUpper) && Objects.deepEquals(this.mostRecentApprovalDate, playAgeRangeDeclarationResult.mostRecentApprovalDate);
    }

    public int hashCode() {
        return ArraysKt.contentDeepHashCode(new Object[]{Boolean.valueOf(this.isEligible), this.installId, this.userStatus, this.error, this.ageLower, this.ageUpper, this.mostRecentApprovalDate});
    }

    /* compiled from: PlayAgeRangeDeclarationResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "isEligible", "", "installId", "", "userStatus", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;", "error", "ageLower", "", "ageUpper", "mostRecentApprovalDate", "(ZLjava/lang/String;Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final PlayAgeRangeDeclarationResult fromCpp(boolean isEligible, String installId, PlayAgeRangeDeclarationUserStatus userStatus, String error, Double ageLower, Double ageUpper, String mostRecentApprovalDate) {
            return new PlayAgeRangeDeclarationResult(isEligible, installId, userStatus, error, ageLower, ageUpper, mostRecentApprovalDate);
        }
    }
}
