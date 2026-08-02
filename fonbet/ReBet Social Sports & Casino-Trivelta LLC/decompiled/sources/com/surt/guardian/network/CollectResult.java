package com.surt.guardian.network;

import com.surt.guardian.models.GuardianDiagnostics;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/surt/guardian/network/CollectResult;", "", EventKeys.PAYLOAD, "", "diagnostics", "Lcom/surt/guardian/models/GuardianDiagnostics;", "(Ljava/lang/String;Lcom/surt/guardian/models/GuardianDiagnostics;)V", "getDiagnostics", "()Lcom/surt/guardian/models/GuardianDiagnostics;", "getPayload", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "securitysdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollectResult {

    @NotNull
    private final GuardianDiagnostics diagnostics;

    @NotNull
    private final String payload;

    public CollectResult(@NotNull String payload, @NotNull GuardianDiagnostics diagnostics) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.payload = payload;
        this.diagnostics = diagnostics;
    }

    public static /* synthetic */ CollectResult copy$default(CollectResult collectResult, String str, GuardianDiagnostics guardianDiagnostics, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collectResult.payload;
        }
        if ((i10 & 2) != 0) {
            guardianDiagnostics = collectResult.diagnostics;
        }
        return collectResult.copy(str, guardianDiagnostics);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final GuardianDiagnostics getDiagnostics() {
        return this.diagnostics;
    }

    @NotNull
    public final CollectResult copy(@NotNull String payload, @NotNull GuardianDiagnostics diagnostics) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        return new CollectResult(payload, diagnostics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectResult)) {
            return false;
        }
        CollectResult collectResult = (CollectResult) other;
        return Intrinsics.areEqual(this.payload, collectResult.payload) && Intrinsics.areEqual(this.diagnostics, collectResult.diagnostics);
    }

    @NotNull
    public final GuardianDiagnostics getDiagnostics() {
        return this.diagnostics;
    }

    @NotNull
    public final String getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.diagnostics.hashCode() + (this.payload.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CollectResult(payload=" + this.payload + ", diagnostics=" + this.diagnostics + ')';
    }

    public /* synthetic */ CollectResult(String str, GuardianDiagnostics guardianDiagnostics, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? new GuardianDiagnostics(null, null, null, null, null, null, 63, null) : guardianDiagnostics);
    }
}
