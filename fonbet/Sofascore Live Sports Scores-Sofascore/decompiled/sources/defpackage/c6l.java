package defpackage;

import com.sofascore.model.mvvm.model.Batsman;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class c6l implements Serializable, zi5 {

    @NotNull
    public static final b6l Companion = new b6l();
    public final int a;
    public final Batsman b;
    public boolean c;

    public /* synthetic */ c6l(int i, int i2, Batsman batsman, boolean z) {
        if (3 != (i & 3)) {
            oea.z(i, 3, a6l.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = batsman;
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
        if (!(obj instanceof c6l)) {
            return false;
        }
        c6l c6lVar = (c6l) obj;
        return this.a == c6lVar.a && Intrinsics.c(this.b, c6lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WicketRow(rank=" + this.a + ", batsman=" + this.b + ")";
    }

    public c6l(int i, Batsman batsman) {
        batsman.getClass();
        this.a = i;
        this.b = batsman;
    }
}
