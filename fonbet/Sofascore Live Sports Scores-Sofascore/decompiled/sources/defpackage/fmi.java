package defpackage;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fmi extends xt9 {
    public final Drawable a;
    public final ot9 b;
    public final int c;
    public final MemoryCache$Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public fmi(Drawable drawable, ot9 ot9Var, int i, MemoryCache$Key memoryCache$Key, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = ot9Var;
        this.c = i;
        this.d = memoryCache$Key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.xt9
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.xt9
    public final ot9 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmi)) {
            return false;
        }
        fmi fmiVar = (fmi) obj;
        return Intrinsics.c(this.a, fmiVar.a) && Intrinsics.c(this.b, fmiVar.b) && this.c == fmiVar.c && Intrinsics.c(this.d, fmiVar.d) && Intrinsics.c(this.e, fmiVar.e) && this.f == fmiVar.f && this.g == fmiVar.g;
    }

    public final int hashCode() {
        int C = (wt3.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        MemoryCache$Key memoryCache$Key = this.d;
        int hashCode = (C + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + dmi.e((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
