package com.margelo.nitro.playagerangedeclaration;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DeclaredAgeRangeResult.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "", "isEligible", "", "status", "Lcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;", "parentControls", "", "lowerBound", "", "upperBound", "<init>", "(ZLcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "()Z", "getStatus", "()Lcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;", "getParentControls", "()Ljava/lang/String;", "getLowerBound", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUpperBound", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeclaredAgeRangeResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isEligible;
    private final Double lowerBound;
    private final String parentControls;
    private final AppleAgeRangeDeclarationUserStatusValues status;
    private final Double upperBound;

    public static /* synthetic */ DeclaredAgeRangeResult copy$default(DeclaredAgeRangeResult declaredAgeRangeResult, boolean z, AppleAgeRangeDeclarationUserStatusValues appleAgeRangeDeclarationUserStatusValues, String str, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = declaredAgeRangeResult.isEligible;
        }
        if ((i & 2) != 0) {
            appleAgeRangeDeclarationUserStatusValues = declaredAgeRangeResult.status;
        }
        if ((i & 4) != 0) {
            str = declaredAgeRangeResult.parentControls;
        }
        if ((i & 8) != 0) {
            d = declaredAgeRangeResult.lowerBound;
        }
        if ((i & 16) != 0) {
            d2 = declaredAgeRangeResult.upperBound;
        }
        Double d3 = d2;
        String str2 = str;
        return declaredAgeRangeResult.copy(z, appleAgeRangeDeclarationUserStatusValues, str2, d, d3);
    }

    @JvmStatic
    private static final DeclaredAgeRangeResult fromCpp(boolean z, AppleAgeRangeDeclarationUserStatusValues appleAgeRangeDeclarationUserStatusValues, String str, Double d, Double d2) {
        return INSTANCE.fromCpp(z, appleAgeRangeDeclarationUserStatusValues, str, d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component2, reason: from getter */
    public final AppleAgeRangeDeclarationUserStatusValues getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParentControls() {
        return this.parentControls;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getLowerBound() {
        return this.lowerBound;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getUpperBound() {
        return this.upperBound;
    }

    public final DeclaredAgeRangeResult copy(boolean isEligible, AppleAgeRangeDeclarationUserStatusValues status, String parentControls, Double lowerBound, Double upperBound) {
        return new DeclaredAgeRangeResult(isEligible, status, parentControls, lowerBound, upperBound);
    }

    public String toString() {
        return "DeclaredAgeRangeResult(isEligible=" + this.isEligible + ", status=" + this.status + ", parentControls=" + this.parentControls + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ")";
    }

    public DeclaredAgeRangeResult(boolean z, AppleAgeRangeDeclarationUserStatusValues appleAgeRangeDeclarationUserStatusValues, String str, Double d, Double d2) {
        this.isEligible = z;
        this.status = appleAgeRangeDeclarationUserStatusValues;
        this.parentControls = str;
        this.lowerBound = d;
        this.upperBound = d2;
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public final AppleAgeRangeDeclarationUserStatusValues getStatus() {
        return this.status;
    }

    public final String getParentControls() {
        return this.parentControls;
    }

    public final Double getLowerBound() {
        return this.lowerBound;
    }

    public final Double getUpperBound() {
        return this.upperBound;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeclaredAgeRangeResult)) {
            return false;
        }
        DeclaredAgeRangeResult declaredAgeRangeResult = (DeclaredAgeRangeResult) other;
        return Objects.deepEquals(Boolean.valueOf(this.isEligible), Boolean.valueOf(declaredAgeRangeResult.isEligible)) && Objects.deepEquals(this.status, declaredAgeRangeResult.status) && Objects.deepEquals(this.parentControls, declaredAgeRangeResult.parentControls) && Objects.deepEquals(this.lowerBound, declaredAgeRangeResult.lowerBound) && Objects.deepEquals(this.upperBound, declaredAgeRangeResult.upperBound);
    }

    public int hashCode() {
        return ArraysKt.contentDeepHashCode(new Object[]{Boolean.valueOf(this.isEligible), this.status, this.parentControls, this.lowerBound, this.upperBound});
    }

    /* compiled from: DeclaredAgeRangeResult.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "isEligible", "", "status", "Lcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;", "parentControls", "", "lowerBound", "", "upperBound", "(ZLcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final DeclaredAgeRangeResult fromCpp(boolean isEligible, AppleAgeRangeDeclarationUserStatusValues status, String parentControls, Double lowerBound, Double upperBound) {
            return new DeclaredAgeRangeResult(isEligible, status, parentControls, lowerBound, upperBound);
        }
    }
}
