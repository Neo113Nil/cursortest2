package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iw7 implements pw7 {
    public final int a;
    public final int b;
    public final List c;
    public final String d;

    public iw7(int i, int i2, String str, List list) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw7)) {
            return false;
        }
        iw7 iw7Var = (iw7) obj;
        return this.a == iw7Var.a && this.b == iw7Var.b && Intrinsics.c(this.c, iw7Var.c) && this.d.equals(iw7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.d(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "OpenShortVideoAction(postId=", ", position=", ", shorts=");
        s.append(this.c);
        s.append(", clickedShortUrl=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
