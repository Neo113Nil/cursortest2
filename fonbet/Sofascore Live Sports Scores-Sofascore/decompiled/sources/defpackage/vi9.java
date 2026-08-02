package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vi9 extends Exception {
    public final int a;
    public final String b;

    public vi9(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi9)) {
            return false;
        }
        vi9 vi9Var = (vi9) obj;
        return this.a == vi9Var.a && Intrinsics.c(this.b, vi9Var.b);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpException(code=");
        sb.append(this.a);
        sb.append(", message=");
        return lnb.q(sb, this.b, ')');
    }
}
