package bo.app;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f25401a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f25402b;

    /* renamed from: c, reason: collision with root package name */
    public final List f25403c;

    public e0(JSONObject bannersData, Long l10, List acknowledgedDismissals) {
        Intrinsics.checkNotNullParameter(bannersData, "bannersData");
        Intrinsics.checkNotNullParameter(acknowledgedDismissals, "acknowledgedDismissals");
        this.f25401a = bannersData;
        this.f25402b = l10;
        this.f25403c = acknowledgedDismissals;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f25401a, e0Var.f25401a) && Intrinsics.areEqual(this.f25402b, e0Var.f25402b) && Intrinsics.areEqual(this.f25403c, e0Var.f25403c);
    }

    public final int hashCode() {
        int hashCode = this.f25401a.hashCode() * 31;
        Long l10 = this.f25402b;
        return this.f25403c.hashCode() + ((hashCode + (l10 == null ? 0 : l10.hashCode())) * 31);
    }

    public final String toString() {
        return "BannersReceivedEvent(bannersData=" + this.f25401a + ", requestTime=" + this.f25402b + ", acknowledgedDismissals=" + this.f25403c + ")";
    }
}
