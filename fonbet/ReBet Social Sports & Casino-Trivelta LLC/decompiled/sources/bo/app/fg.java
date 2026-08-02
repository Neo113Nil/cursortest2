package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fg {

    /* renamed from: a, reason: collision with root package name */
    public final String f25465a;

    /* renamed from: b, reason: collision with root package name */
    public final y8 f25466b;

    public fg(String campaignId, y8 pushClickEvent) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pushClickEvent, "pushClickEvent");
        this.f25465a = campaignId;
        this.f25466b = pushClickEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        return Intrinsics.areEqual(this.f25465a, fgVar.f25465a) && Intrinsics.areEqual(this.f25466b, fgVar.f25466b);
    }

    public final int hashCode() {
        return this.f25466b.hashCode() + (this.f25465a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f25465a + ", pushClickEvent=" + this.f25466b + ")";
    }
}
