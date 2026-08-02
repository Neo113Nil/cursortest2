package defpackage;

import com.sofascore.model.mvvm.model.Partnership;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class fae implements Serializable, zi5 {

    @NotNull
    public static final eae Companion = new eae();
    public final int a;
    public final Partnership b;
    public boolean c;

    public /* synthetic */ fae(int i, int i2, Partnership partnership, boolean z) {
        if (3 != (i & 3)) {
            oea.z(i, 3, dae.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = partnership;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    @Override // defpackage.zi5
    public final void d() {
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fae)) {
            return false;
        }
        fae faeVar = (fae) obj;
        return this.a == faeVar.a && Intrinsics.c(this.b, faeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PartnershipRow(position=" + this.a + ", partnership=" + this.b + ")";
    }

    public fae(int i, Partnership partnership) {
        partnership.getClass();
        this.a = i;
        this.b = partnership;
    }
}
