package defpackage;

import com.sofascore.model.mvvm.model.UniqueStage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d7i implements e7i {
    public final UniqueStage a;
    public final boolean b;

    public d7i(UniqueStage uniqueStage, boolean z) {
        this.a = uniqueStage;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7i)) {
            return false;
        }
        d7i d7iVar = (d7i) obj;
        return this.a.equals(d7iVar.a) && this.b == d7iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UniqueStageItem(uniqueStage=" + this.a + ", hasNext=" + this.b + ")";
    }
}
