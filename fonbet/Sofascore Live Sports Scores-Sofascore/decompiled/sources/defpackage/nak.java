package defpackage;

import com.sofascore.model.mvvm.model.UniqueStage;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nak implements Serializable {
    public UniqueStage a;
    public jfj b;
    public jfj c;
    public wu d;
    public boolean e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nak)) {
            return false;
        }
        nak nakVar = (nak) obj;
        return this.a.equals(nakVar.a) && Intrinsics.c(this.b, nakVar.b) && this.c.equals(nakVar.c) && this.d == nakVar.d && this.e == nakVar.e && this.f == nakVar.f;
    }

    public final int hashCode() {
        int e = dmi.e(this.a.hashCode() * 961, 31, false);
        jfj jfjVar = this.b;
        int hashCode = (this.c.hashCode() + ((e + (jfjVar == null ? 0 : jfjVar.hashCode())) * 31)) * 961;
        wu wuVar = this.d;
        return Boolean.hashCode(this.f) + dmi.e((hashCode + (wuVar != null ? wuVar.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        UniqueStage uniqueStage = this.a;
        jfj jfjVar = this.b;
        jfj jfjVar2 = this.c;
        wu wuVar = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        StringBuilder sb = new StringBuilder("UniqueStageListItem(uniqueStage=");
        sb.append(uniqueStage);
        sb.append(", placeholderOverride=null, topDividerVisible=false, textUpper1=");
        sb.append(jfjVar);
        sb.append(", textUpper2=");
        sb.append(jfjVar2);
        sb.append(", textLower=null, bellButtonLocation=");
        sb.append(wuVar);
        sb.append(", roundTop=");
        return w1l.i(", roundBottom=", ")", sb, z, z2);
    }
}
