package defpackage;

import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeObjectXPosition;
import com.blaze.blazesdk.style.shared.models.BlazeObjectYPosition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o0m {
    public final BlazeObjectXPosition a;
    public final BlazeDp b;
    public final e4m c;
    public final BlazeObjectYPosition d;
    public final BlazeDp e;
    public final e4m f;

    public o0m(@NotNull BlazeObjectXPosition blazeObjectXPosition, @NotNull BlazeDp blazeDp, @NotNull e4m e4mVar, @NotNull BlazeObjectYPosition blazeObjectYPosition, @NotNull BlazeDp blazeDp2, @NotNull e4m e4mVar2) {
        blazeObjectXPosition.getClass();
        blazeDp.getClass();
        e4mVar.getClass();
        blazeObjectYPosition.getClass();
        blazeDp2.getClass();
        e4mVar2.getClass();
        this.a = blazeObjectXPosition;
        this.b = blazeDp;
        this.c = e4mVar;
        this.d = blazeObjectYPosition;
        this.e = blazeDp2;
        this.f = e4mVar2;
    }

    public static o0m copy$default(o0m o0mVar, BlazeObjectXPosition blazeObjectXPosition, BlazeDp blazeDp, e4m e4mVar, BlazeObjectYPosition blazeObjectYPosition, BlazeDp blazeDp2, e4m e4mVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeObjectXPosition = o0mVar.a;
        }
        if ((i & 2) != 0) {
            blazeDp = o0mVar.b;
        }
        if ((i & 4) != 0) {
            e4mVar = o0mVar.c;
        }
        if ((i & 8) != 0) {
            blazeObjectYPosition = o0mVar.d;
        }
        if ((i & 16) != 0) {
            blazeDp2 = o0mVar.e;
        }
        if ((i & 32) != 0) {
            e4mVar2 = o0mVar.f;
        }
        e4m e4mVar3 = e4mVar2;
        o0mVar.getClass();
        blazeObjectXPosition.getClass();
        blazeDp.getClass();
        e4mVar.getClass();
        blazeObjectYPosition.getClass();
        blazeDp2.getClass();
        e4mVar3.getClass();
        BlazeDp blazeDp3 = blazeDp2;
        e4m e4mVar4 = e4mVar;
        return new o0m(blazeObjectXPosition, blazeDp, e4mVar4, blazeObjectYPosition, blazeDp3, e4mVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0m)) {
            return false;
        }
        o0m o0mVar = (o0m) obj;
        return this.a == o0mVar.a && Intrinsics.c(this.b, o0mVar.b) && this.c == o0mVar.c && this.d == o0mVar.d && Intrinsics.c(this.e, o0mVar.e) && this.f == o0mVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + s6a.n(this.e, (this.d.hashCode() + ((this.c.hashCode() + s6a.n(this.b, this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InteractionPosition(xPosition=" + this.a + ", xOffset=" + this.b + ", xRelativeTo=" + this.c + ", yPosition=" + this.d + ", yOffset=" + this.e + ", yRelativeTo=" + this.f + ')';
    }
}
