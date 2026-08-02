package defpackage;

import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideTextStyle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fwl {
    public final BlazeFirstTimeSlideTextStyle a;
    public final BlazeFirstTimeSlideTextStyle b;
    public final int c;

    public fwl(@NotNull BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle, @NotNull BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle2, int i) {
        blazeFirstTimeSlideTextStyle.getClass();
        blazeFirstTimeSlideTextStyle2.getClass();
        this.a = blazeFirstTimeSlideTextStyle;
        this.b = blazeFirstTimeSlideTextStyle2;
        this.c = i;
    }

    public static fwl copy$default(fwl fwlVar, BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle, BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeFirstTimeSlideTextStyle = fwlVar.a;
        }
        if ((i2 & 2) != 0) {
            blazeFirstTimeSlideTextStyle2 = fwlVar.b;
        }
        if ((i2 & 4) != 0) {
            i = fwlVar.c;
        }
        fwlVar.getClass();
        blazeFirstTimeSlideTextStyle.getClass();
        blazeFirstTimeSlideTextStyle2.getClass();
        return new fwl(blazeFirstTimeSlideTextStyle, blazeFirstTimeSlideTextStyle2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwl)) {
            return false;
        }
        fwl fwlVar = (fwl) obj;
        return Intrinsics.c(this.a, fwlVar.a) && Intrinsics.c(this.b, fwlVar.b) && this.c == fwlVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerFirstTimeSlideItem(header=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", icon=");
        return wv8.j(sb, this.c, ')');
    }
}
