package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bvm {
    public final String a;

    public bvm(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    public static bvm copy$default(bvm bvmVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bvmVar.a;
        }
        bvmVar.getClass();
        str.getClass();
        return new bvm(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvm) && Intrinsics.c(this.a, ((bvm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("StorageFileModel(imageUrl="), this.a, ')');
    }
}
