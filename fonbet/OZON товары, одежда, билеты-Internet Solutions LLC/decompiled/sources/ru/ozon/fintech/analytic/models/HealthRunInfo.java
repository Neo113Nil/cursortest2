package ru.ozon.fintech.analytic.models;

import G.g;
import Nh.a;
import Tz.C4055a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0001,BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017¨\u0006-"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthRunInfo;", "", "", "", "debugLabels", "frontSharedId", "runId", "runType", "Lru/ozon/fintech/analytic/models/HealthPermissions;", "permissions", "", "ultra", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/analytic/models/HealthPermissions;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lru/ozon/fintech/analytic/models/HealthPermissions;", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/analytic/models/HealthPermissions;Ljava/lang/Boolean;)Lru/ozon/fintech/analytic/models/HealthRunInfo;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDebugLabels", "Ljava/lang/String;", "getFrontSharedId", "getRunId", "getRunType", "Lru/ozon/fintech/analytic/models/HealthPermissions;", "getPermissions", "Ljava/lang/Boolean;", "getUltra", "Companion", "a", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthRunInfo {

    @i(name = "debug_labels")
    @NotNull
    private final List<String> debugLabels;

    @i(name = "front_shared_id")
    @NotNull
    private final String frontSharedId;

    @i(name = "permissions")
    private final HealthPermissions permissions;

    @i(name = "run_id")
    @NotNull
    private final String runId;

    @i(name = "run_type")
    @NotNull
    private final String runType;

    @i(name = "ultra")
    private final Boolean ultra;

    public HealthRunInfo(@NotNull List<String> debugLabels, @NotNull String frontSharedId, @NotNull String runId, @NotNull String runType, HealthPermissions healthPermissions, Boolean bool) {
        Intrinsics.checkNotNullParameter(debugLabels, "debugLabels");
        Intrinsics.checkNotNullParameter(frontSharedId, "frontSharedId");
        Intrinsics.checkNotNullParameter(runId, "runId");
        Intrinsics.checkNotNullParameter(runType, "runType");
        this.debugLabels = debugLabels;
        this.frontSharedId = frontSharedId;
        this.runId = runId;
        this.runType = runType;
        this.permissions = healthPermissions;
        this.ultra = bool;
    }

    public static /* synthetic */ HealthRunInfo copy$default(HealthRunInfo healthRunInfo, List list, String str, String str2, String str3, HealthPermissions healthPermissions, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = healthRunInfo.debugLabels;
        }
        if ((i11 & 2) != 0) {
            str = healthRunInfo.frontSharedId;
        }
        if ((i11 & 4) != 0) {
            str2 = healthRunInfo.runId;
        }
        if ((i11 & 8) != 0) {
            str3 = healthRunInfo.runType;
        }
        if ((i11 & 16) != 0) {
            healthPermissions = healthRunInfo.permissions;
        }
        if ((i11 & 32) != 0) {
            bool = healthRunInfo.ultra;
        }
        HealthPermissions healthPermissions2 = healthPermissions;
        Boolean bool2 = bool;
        return healthRunInfo.copy(list, str, str2, str3, healthPermissions2, bool2);
    }

    @NotNull
    public final List<String> component1() {
        return this.debugLabels;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFrontSharedId() {
        return this.frontSharedId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRunId() {
        return this.runId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRunType() {
        return this.runType;
    }

    /* renamed from: component5, reason: from getter */
    public final HealthPermissions getPermissions() {
        return this.permissions;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getUltra() {
        return this.ultra;
    }

    @NotNull
    public final HealthRunInfo copy(@NotNull List<String> debugLabels, @NotNull String frontSharedId, @NotNull String runId, @NotNull String runType, HealthPermissions permissions, Boolean ultra) {
        Intrinsics.checkNotNullParameter(debugLabels, "debugLabels");
        Intrinsics.checkNotNullParameter(frontSharedId, "frontSharedId");
        Intrinsics.checkNotNullParameter(runId, "runId");
        Intrinsics.checkNotNullParameter(runType, "runType");
        return new HealthRunInfo(debugLabels, frontSharedId, runId, runType, permissions, ultra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthRunInfo)) {
            return false;
        }
        HealthRunInfo healthRunInfo = (HealthRunInfo) other;
        return Intrinsics.d(this.debugLabels, healthRunInfo.debugLabels) && Intrinsics.d(this.frontSharedId, healthRunInfo.frontSharedId) && Intrinsics.d(this.runId, healthRunInfo.runId) && Intrinsics.d(this.runType, healthRunInfo.runType) && Intrinsics.d(this.permissions, healthRunInfo.permissions) && Intrinsics.d(this.ultra, healthRunInfo.ultra);
    }

    @NotNull
    public final List<String> getDebugLabels() {
        return this.debugLabels;
    }

    @NotNull
    public final String getFrontSharedId() {
        return this.frontSharedId;
    }

    public final HealthPermissions getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final String getRunId() {
        return this.runId;
    }

    @NotNull
    public final String getRunType() {
        return this.runType;
    }

    public final Boolean getUltra() {
        return this.ultra;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(this.debugLabels.hashCode() * 31, 31, this.frontSharedId), 31, this.runId), 31, this.runType);
        HealthPermissions healthPermissions = this.permissions;
        int hashCode = (a11 + (healthPermissions == null ? 0 : healthPermissions.hashCode())) * 31;
        Boolean bool = this.ultra;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<String> list = this.debugLabels;
        String str = this.frontSharedId;
        String str2 = this.runId;
        String str3 = this.runType;
        HealthPermissions healthPermissions = this.permissions;
        Boolean bool = this.ultra;
        StringBuilder a11 = C4055a.a("HealthRunInfo(debugLabels=", ", frontSharedId=", str, ", runId=", list);
        a.h(a11, str2, ", runType=", str3, ", permissions=");
        a11.append(healthPermissions);
        a11.append(", ultra=");
        a11.append(bool);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ HealthRunInfo(List list, String str, String str2, String str3, HealthPermissions healthPermissions, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i11 & 16) != 0 ? null : healthPermissions, (i11 & 32) != 0 ? null : bool);
    }
}
