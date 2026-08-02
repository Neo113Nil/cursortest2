package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uof {
    public final Context a;
    public final jt9 b;
    public final mqi c;
    public final mqi d;
    public final joa e;
    public final ic3 f;

    public uof(Context context, jt9 jt9Var, mqi mqiVar, mqi mqiVar2, joa joaVar, ic3 ic3Var) {
        this.a = context;
        this.b = jt9Var;
        this.c = mqiVar;
        this.d = mqiVar2;
        this.e = joaVar;
        this.f = ic3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uof) {
            uof uofVar = (uof) obj;
            return Intrinsics.c(this.a, uofVar.a) && this.b.equals(uofVar.b) && this.c == uofVar.c && this.d == uofVar.d && this.e.equals(uofVar.e) && this.f == uofVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((hc5.c.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + hc5.c + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
