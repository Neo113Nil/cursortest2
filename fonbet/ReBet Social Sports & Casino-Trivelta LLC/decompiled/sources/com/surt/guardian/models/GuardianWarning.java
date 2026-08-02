package com.surt.guardian.models;

import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/surt/guardian/models/GuardianWarning;", "", EventKeys.ERROR_CODE, "", "signal", "detail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDetail", "getSignal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "securitysdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiagnostics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Diagnostics.kt\ncom/surt/guardian/models/GuardianWarning\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/* loaded from: classes4.dex */
public final /* data */ class GuardianWarning {

    @NotNull
    private final String code;

    @Nullable
    private final String detail;

    @NotNull
    private final String signal;

    public GuardianWarning(@NotNull String code, @NotNull String signal, @Nullable String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.code = code;
        this.signal = signal;
        this.detail = str;
    }

    public static /* synthetic */ GuardianWarning copy$default(GuardianWarning guardianWarning, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = guardianWarning.code;
        }
        if ((i10 & 2) != 0) {
            str2 = guardianWarning.signal;
        }
        if ((i10 & 4) != 0) {
            str3 = guardianWarning.detail;
        }
        return guardianWarning.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSignal() {
        return this.signal;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final GuardianWarning copy(@NotNull String code, @NotNull String signal, @Nullable String detail) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(signal, "signal");
        return new GuardianWarning(code, signal, detail);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuardianWarning)) {
            return false;
        }
        GuardianWarning guardianWarning = (GuardianWarning) other;
        return Intrinsics.areEqual(this.code, guardianWarning.code) && Intrinsics.areEqual(this.signal, guardianWarning.signal) && Intrinsics.areEqual(this.detail, guardianWarning.detail);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final String getSignal() {
        return this.signal;
    }

    public int hashCode() {
        int hashCode = (this.signal.hashCode() + (this.code.hashCode() * 31)) * 31;
        String str = this.detail;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final Map<String, Object> toMap() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(EventKeys.ERROR_CODE, this.code), TuplesKt.to("signal", this.signal));
        String str = this.detail;
        if (str != null) {
            mutableMapOf.put("detail", str);
        }
        return mutableMapOf;
    }

    @NotNull
    public String toString() {
        return "GuardianWarning(code=" + this.code + ", signal=" + this.signal + ", detail=" + this.detail + ')';
    }

    public /* synthetic */ GuardianWarning(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
