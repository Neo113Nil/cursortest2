package bo.app;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l1 implements l9 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f25680a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25681b;

    public l1(LinkedHashSet eventsList) {
        Intrinsics.checkNotNullParameter(eventsList, "eventsList");
        this.f25680a = eventsList;
        this.f25681b = eventsList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.areEqual(this.f25680a, ((l1) obj).f25680a);
    }

    public final int hashCode() {
        return this.f25680a.hashCode();
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        return this.f25681b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.f25680a + ")";
    }
}
