package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class asg {
    public final ArrayList a;
    public final ArrayList b;
    public final trg c;
    public final ArrayList d;

    public asg(ArrayList arrayList, ArrayList arrayList2, trg trgVar, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = trgVar;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || asg.class != obj.getClass()) {
            return false;
        }
        asg asgVar = (asg) obj;
        return this.a.equals(asgVar.a) && this.b.equals(asgVar.b) && Intrinsics.c(this.c, asgVar.c) && this.d.equals(asgVar.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + ')';
    }
}
