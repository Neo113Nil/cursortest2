package defpackage;

import com.sofascore.model.profile.UserBadge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d9f {
    public final UserBadge a;
    public final List b;

    public d9f(UserBadge userBadge, List list) {
        list.getClass();
        this.a = userBadge;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9f)) {
            return false;
        }
        d9f d9fVar = (d9f) obj;
        return this.a == d9fVar.a && Intrinsics.c(this.b, d9fVar.b);
    }

    public final int hashCode() {
        UserBadge userBadge = this.a;
        return this.b.hashCode() + ((userBadge == null ? 0 : userBadge.hashCode()) * 31);
    }

    public final String toString() {
        return "UserBadgeWrapper(selectedUserBadge=" + this.a + ", availableBadges=" + this.b + ")";
    }
}
