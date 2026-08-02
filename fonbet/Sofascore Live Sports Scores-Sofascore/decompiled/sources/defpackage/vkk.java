package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vkk {
    public final ArrayList a;
    public final mlk b;
    public final String c;
    public final String d;

    public vkk(ArrayList arrayList, mlk mlkVar, String str, String str2) {
        this.a = arrayList;
        this.b = mlkVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkk)) {
            return false;
        }
        vkk vkkVar = (vkk) obj;
        return this.a.equals(vkkVar.a) && Intrinsics.c(this.b, vkkVar.b) && Intrinsics.c(this.c, vkkVar.c) && Intrinsics.c(this.d, vkkVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mlk mlkVar = this.b;
        int hashCode2 = (hashCode + (mlkVar == null ? 0 : mlkVar.a.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdVerification(javascriptResource=");
        sb.append(this.a);
        sb.append(", trackingEvents=");
        sb.append(this.b);
        sb.append(", vendor=");
        sb.append(this.c);
        sb.append(", verificationParameters=");
        return lnb.q(sb, this.d, ')');
    }
}
