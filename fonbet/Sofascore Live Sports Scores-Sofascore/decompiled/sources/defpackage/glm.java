package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class glm {
    public final bvm a;
    public final umm b;
    public final String c;
    public final String d;

    public glm(@NotNull bvm bvmVar, @NotNull umm ummVar, @NotNull String str, @NotNull String str2) {
        bvmVar.getClass();
        ummVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = bvmVar;
        this.b = ummVar;
        this.c = str;
        this.d = str2;
    }

    public static glm copy$default(glm glmVar, bvm bvmVar, umm ummVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bvmVar = glmVar.a;
        }
        if ((i & 2) != 0) {
            ummVar = glmVar.b;
        }
        if ((i & 4) != 0) {
            str = glmVar.c;
        }
        if ((i & 8) != 0) {
            str2 = glmVar.d;
        }
        glmVar.getClass();
        bvmVar.getClass();
        ummVar.getClass();
        str.getClass();
        str2.getClass();
        return new glm(bvmVar, ummVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glm)) {
            return false;
        }
        glm glmVar = (glm) obj;
        return Intrinsics.c(this.a, glmVar.a) && this.b == glmVar.b && Intrinsics.c(this.c, glmVar.c) && Intrinsics.c(this.d, glmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + o6a.k(this.c, (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowEntityModel(storageFile=");
        sb.append(this.a);
        sb.append(", entityType=");
        sb.append(this.b);
        sb.append(", entityId=");
        sb.append(this.c);
        sb.append(", description=");
        return lnb.q(sb, this.d, ')');
    }
}
