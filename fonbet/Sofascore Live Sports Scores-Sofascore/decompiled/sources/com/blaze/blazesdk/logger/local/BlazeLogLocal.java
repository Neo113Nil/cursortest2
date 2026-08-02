package com.blaze.blazesdk.logger.local;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.o6a;
import defpackage.u0a;
import defpackage.vul;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b&\u0010\u000e¨\u0006'"}, d2 = {"Lcom/blaze/blazesdk/logger/local/BlazeLogLocal;", "", "", "id", "request", "Lvul;", "level", "reportingTimestamp", "", "isImmediate", "apiSchemeVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lvul;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lvul;", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lvul;Ljava/lang/String;ZLjava/lang/String;)Lcom/blaze/blazesdk/logger/local/BlazeLogLocal;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getRequest", "Lvul;", "getLevel", "getReportingTimestamp", "Z", "getApiSchemeVersion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeLogLocal {
    public static final int $stable = 0;

    @NotNull
    private final String apiSchemeVersion;

    @NotNull
    private final String id;
    private final boolean isImmediate;

    @NotNull
    private final vul level;

    @Nullable
    private final String reportingTimestamp;

    @NotNull
    private final String request;

    public BlazeLogLocal(@NotNull String str, @NotNull String str2, @NotNull vul vulVar, @Nullable String str3, boolean z, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        vulVar.getClass();
        str4.getClass();
        this.id = str;
        this.request = str2;
        this.level = vulVar;
        this.reportingTimestamp = str3;
        this.isImmediate = z;
        this.apiSchemeVersion = str4;
    }

    public static /* synthetic */ BlazeLogLocal copy$default(BlazeLogLocal blazeLogLocal, String str, String str2, vul vulVar, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeLogLocal.id;
        }
        if ((i & 2) != 0) {
            str2 = blazeLogLocal.request;
        }
        if ((i & 4) != 0) {
            vulVar = blazeLogLocal.level;
        }
        if ((i & 8) != 0) {
            str3 = blazeLogLocal.reportingTimestamp;
        }
        if ((i & 16) != 0) {
            z = blazeLogLocal.isImmediate;
        }
        if ((i & 32) != 0) {
            str4 = blazeLogLocal.apiSchemeVersion;
        }
        boolean z2 = z;
        String str5 = str4;
        return blazeLogLocal.copy(str, str2, vulVar, str3, z2, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRequest() {
        return this.request;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final vul getLevel() {
        return this.level;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getReportingTimestamp() {
        return this.reportingTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsImmediate() {
        return this.isImmediate;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getApiSchemeVersion() {
        return this.apiSchemeVersion;
    }

    @NotNull
    public final BlazeLogLocal copy(@NotNull String id, @NotNull String request, @NotNull vul level, @Nullable String reportingTimestamp, boolean isImmediate, @NotNull String apiSchemeVersion) {
        id.getClass();
        request.getClass();
        level.getClass();
        apiSchemeVersion.getClass();
        return new BlazeLogLocal(id, request, level, reportingTimestamp, isImmediate, apiSchemeVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeLogLocal)) {
            return false;
        }
        BlazeLogLocal blazeLogLocal = (BlazeLogLocal) other;
        return Intrinsics.c(this.id, blazeLogLocal.id) && Intrinsics.c(this.request, blazeLogLocal.request) && this.level == blazeLogLocal.level && Intrinsics.c(this.reportingTimestamp, blazeLogLocal.reportingTimestamp) && this.isImmediate == blazeLogLocal.isImmediate && Intrinsics.c(this.apiSchemeVersion, blazeLogLocal.apiSchemeVersion);
    }

    @NotNull
    public final String getApiSchemeVersion() {
        return this.apiSchemeVersion;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final vul getLevel() {
        return this.level;
    }

    @Nullable
    public final String getReportingTimestamp() {
        return this.reportingTimestamp;
    }

    @NotNull
    public final String getRequest() {
        return this.request;
    }

    public int hashCode() {
        int hashCode = (this.level.hashCode() + o6a.k(this.request, this.id.hashCode() * 31)) * 31;
        String str = this.reportingTimestamp;
        return this.apiSchemeVersion.hashCode() + u0a.t((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.isImmediate);
    }

    public final boolean isImmediate() {
        return this.isImmediate;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeLogLocal(id=");
        sb.append(this.id);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", reportingTimestamp=");
        sb.append(this.reportingTimestamp);
        sb.append(", isImmediate=");
        sb.append(this.isImmediate);
        sb.append(", apiSchemeVersion=");
        return lnb.q(sb, this.apiSchemeVersion, ')');
    }

    public /* synthetic */ BlazeLogLocal(String str, String str2, vul vulVar, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, vulVar, str3, z, str4);
    }
}
