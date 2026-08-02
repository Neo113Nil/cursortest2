package defpackage;

import com.appsflyer.internal.i;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class fai implements Serializable {

    @NotNull
    public static final eai Companion = new eai();
    public final int a;
    public final String b;
    public boolean c;

    public /* synthetic */ fai(int i, int i2, String str, boolean z) {
        if (3 != (i & 3)) {
            oea.z(i, 3, dai.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fai)) {
            return false;
        }
        fai faiVar = (fai) obj;
        return this.a == faiVar.a && Intrinsics.c(this.b, faiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "StandingsPromotionLegendRow(color=", ", description=", this.b, ")");
    }

    public fai(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
