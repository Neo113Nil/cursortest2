package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ve {
    public final List a;
    public final boolean b;
    public final ActivityStack.Token c;

    public ve(List list, boolean z, ActivityStack.Token token) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return Intrinsics.c(this.a, veVar.a) && this.b == veVar.b && Intrinsics.c(this.c, veVar.c);
    }

    public final int hashCode() {
        int e = dmi.e(this.a.hashCode() * 31, 31, this.b);
        ActivityStack.Token token = this.c;
        return e + (token != null ? token.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityStack{activitiesInProcess=" + this.a + ", isEmpty=" + this.b + ", token=" + this.c + '}';
    }
}
