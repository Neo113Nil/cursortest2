package com.surt.guardian.network;

import com.surt.guardian.models.GuardianDiagnostics;
import com.twilio.voice.EventKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lcom/surt/guardian/network/VerificationResult;", "", "allowed", "", "riskLevel", "Lcom/surt/guardian/network/RiskLevel;", "sessionId", "", "errors", "", EventKeys.TIMESTAMP, "", "metadata", "", "diagnostics", "Lcom/surt/guardian/models/GuardianDiagnostics;", "(ZLcom/surt/guardian/network/RiskLevel;Ljava/lang/String;Ljava/util/List;JLjava/util/Map;Lcom/surt/guardian/models/GuardianDiagnostics;)V", "getAllowed", "()Z", "getDiagnostics", "()Lcom/surt/guardian/models/GuardianDiagnostics;", "getErrors", "()Ljava/util/List;", "getMetadata", "()Ljava/util/Map;", "getRiskLevel", "()Lcom/surt/guardian/network/RiskLevel;", "getSessionId", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "securitysdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VerificationResult {
    private final boolean allowed;

    @NotNull
    private final GuardianDiagnostics diagnostics;

    @Nullable
    private final List<String> errors;

    @Nullable
    private final Map<String, Object> metadata;

    @NotNull
    private final RiskLevel riskLevel;

    @NotNull
    private final String sessionId;
    private final long timestamp;

    public VerificationResult(boolean z10, @NotNull RiskLevel riskLevel, @NotNull String sessionId, @Nullable List<String> list, long j10, @Nullable Map<String, ? extends Object> map, @NotNull GuardianDiagnostics diagnostics) {
        Intrinsics.checkNotNullParameter(riskLevel, "riskLevel");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.allowed = z10;
        this.riskLevel = riskLevel;
        this.sessionId = sessionId;
        this.errors = list;
        this.timestamp = j10;
        this.metadata = map;
        this.diagnostics = diagnostics;
    }

    public static /* synthetic */ VerificationResult copy$default(VerificationResult verificationResult, boolean z10, RiskLevel riskLevel, String str, List list, long j10, Map map, GuardianDiagnostics guardianDiagnostics, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = verificationResult.allowed;
        }
        if ((i10 & 2) != 0) {
            riskLevel = verificationResult.riskLevel;
        }
        if ((i10 & 4) != 0) {
            str = verificationResult.sessionId;
        }
        if ((i10 & 8) != 0) {
            list = verificationResult.errors;
        }
        if ((i10 & 16) != 0) {
            j10 = verificationResult.timestamp;
        }
        if ((i10 & 32) != 0) {
            map = verificationResult.metadata;
        }
        if ((i10 & 64) != 0) {
            guardianDiagnostics = verificationResult.diagnostics;
        }
        long j11 = j10;
        String str2 = str;
        List list2 = list;
        return verificationResult.copy(z10, riskLevel, str2, list2, j11, map, guardianDiagnostics);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowed() {
        return this.allowed;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RiskLevel getRiskLevel() {
        return this.riskLevel;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final List<String> component4() {
        return this.errors;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Map<String, Object> component6() {
        return this.metadata;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final GuardianDiagnostics getDiagnostics() {
        return this.diagnostics;
    }

    @NotNull
    public final VerificationResult copy(boolean allowed, @NotNull RiskLevel riskLevel, @NotNull String sessionId, @Nullable List<String> errors, long timestamp, @Nullable Map<String, ? extends Object> metadata, @NotNull GuardianDiagnostics diagnostics) {
        Intrinsics.checkNotNullParameter(riskLevel, "riskLevel");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        return new VerificationResult(allowed, riskLevel, sessionId, errors, timestamp, metadata, diagnostics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationResult)) {
            return false;
        }
        VerificationResult verificationResult = (VerificationResult) other;
        return this.allowed == verificationResult.allowed && this.riskLevel == verificationResult.riskLevel && Intrinsics.areEqual(this.sessionId, verificationResult.sessionId) && Intrinsics.areEqual(this.errors, verificationResult.errors) && this.timestamp == verificationResult.timestamp && Intrinsics.areEqual(this.metadata, verificationResult.metadata) && Intrinsics.areEqual(this.diagnostics, verificationResult.diagnostics);
    }

    public final boolean getAllowed() {
        return this.allowed;
    }

    @NotNull
    public final GuardianDiagnostics getDiagnostics() {
        return this.diagnostics;
    }

    @Nullable
    public final List<String> getErrors() {
        return this.errors;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final RiskLevel getRiskLevel() {
        return this.riskLevel;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public int hashCode() {
        boolean z10 = this.allowed;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = (this.sessionId.hashCode() + ((this.riskLevel.hashCode() + (r02 * 31)) * 31)) * 31;
        List<String> list = this.errors;
        int hashCode2 = (Long.hashCode(this.timestamp) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Map<String, Object> map = this.metadata;
        return this.diagnostics.hashCode() + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "VerificationResult(allowed=" + this.allowed + ", riskLevel=" + this.riskLevel + ", sessionId=" + this.sessionId + ", errors=" + this.errors + ", timestamp=" + this.timestamp + ", metadata=" + this.metadata + ", diagnostics=" + this.diagnostics + ')';
    }

    public /* synthetic */ VerificationResult(boolean z10, RiskLevel riskLevel, String str, List list, long j10, Map map, GuardianDiagnostics guardianDiagnostics, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, riskLevel, str, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? System.currentTimeMillis() : j10, (i10 & 32) != 0 ? null : map, (i10 & 64) != 0 ? new GuardianDiagnostics(null, null, null, null, null, null, 63, null) : guardianDiagnostics);
    }
}
