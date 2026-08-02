package defpackage;

import com.sofascore.model.mvvm.model.Batsman;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class lt1 implements Serializable, zi5 {

    @NotNull
    public static final kt1 Companion = new kt1();
    public final boolean a;
    public final boolean b;
    public final Batsman c;
    public boolean d;

    public /* synthetic */ lt1(int i, boolean z, boolean z2, Batsman batsman, boolean z3) {
        if (7 != (i & 7)) {
            oea.z(i, 7, jt1.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = batsman;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
    }

    @Override // defpackage.zi5
    public final void d() {
        this.d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt1)) {
            return false;
        }
        lt1 lt1Var = (lt1) obj;
        return this.a == lt1Var.a && this.b == lt1Var.b && Intrinsics.c(this.c, lt1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder k = w1l.k("BatsmanRow(currentBatsman=", this.a, ", isFirst=", this.b, ", batsman=");
        k.append(this.c);
        k.append(")");
        return k.toString();
    }

    public lt1(boolean z, boolean z2, Batsman batsman) {
        batsman.getClass();
        this.a = z;
        this.b = z2;
        this.c = batsman;
    }
}
