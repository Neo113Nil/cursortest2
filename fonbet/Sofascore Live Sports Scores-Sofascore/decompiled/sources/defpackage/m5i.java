package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m5i implements Serializable {
    public Stage a;
    public jfj b;
    public jfj c;
    public jfj d;
    public jfj e;
    public wu f;
    public boolean g;
    public boolean h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5i)) {
            return false;
        }
        m5i m5iVar = (m5i) obj;
        return Intrinsics.c(this.a, m5iVar.a) && this.b.equals(m5iVar.b) && this.c.equals(m5iVar.c) && this.d.equals(m5iVar.d) && this.e.equals(m5iVar.e) && this.f == m5iVar.f && this.g == m5iVar.g && this.h == m5iVar.h;
    }

    public final int hashCode() {
        int e = dmi.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, true);
        wu wuVar = this.f;
        return Boolean.hashCode(this.h) + dmi.e((e + (wuVar == null ? 0 : wuVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        Stage stage = this.a;
        jfj jfjVar = this.b;
        jfj jfjVar2 = this.c;
        jfj jfjVar3 = this.d;
        jfj jfjVar4 = this.e;
        wu wuVar = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("StageListItem(stage=");
        sb.append(stage);
        sb.append(", statusTextUpper=");
        sb.append(jfjVar);
        sb.append(", statusTextLower=");
        sb.append(jfjVar2);
        sb.append(", textUpper=");
        sb.append(jfjVar3);
        sb.append(", textLower=");
        sb.append(jfjVar4);
        sb.append(", showBellButton=true, bellButtonLocation=");
        sb.append(wuVar);
        sb.append(", roundTop=");
        return w1l.i(", roundBottom=", ")", sb, z, z2);
    }
}
