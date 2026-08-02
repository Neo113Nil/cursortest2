package ru.ozon.app.android.emptyscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z00.f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/emptyscreen/AntibotDefaultPageIssue;", "Lz00/f;", "", "isError", "", "incidentId", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getIncidentId", "emptyscreen_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AntibotDefaultPageIssue extends f {
    private final String incidentId;
    private final boolean isError;

    public /* synthetic */ AntibotDefaultPageIssue(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AntibotDefaultPageIssue)) {
            return false;
        }
        AntibotDefaultPageIssue antibotDefaultPageIssue = (AntibotDefaultPageIssue) other;
        return this.isError == antibotDefaultPageIssue.isError && Intrinsics.d(this.incidentId, antibotDefaultPageIssue.incidentId);
    }

    public final String getIncidentId() {
        return this.incidentId;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isError) * 31;
        String str = this.incidentId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // z00.f
    /* renamed from: isError, reason: from getter */
    public boolean getIsError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        return "AntibotDefaultPageIssue(isError=" + this.isError + ", incidentId=" + this.incidentId + ")";
    }

    public AntibotDefaultPageIssue(boolean z11, String str) {
        this.isError = z11;
        this.incidentId = str;
    }
}
