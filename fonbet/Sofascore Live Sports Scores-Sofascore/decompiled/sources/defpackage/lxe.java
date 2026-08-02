package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lxe {
    public final int a;
    public final Integer b;
    public final String c;
    public final Gender d;
    public final mxe e;
    public final String f;

    public lxe(int i, Integer num, String str, Gender gender, mxe mxeVar, String str2) {
        str.getClass();
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = gender;
        this.e = mxeVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxe)) {
            return false;
        }
        lxe lxeVar = (lxe) obj;
        return this.a == lxeVar.a && Intrinsics.c(this.b, lxeVar.b) && Intrinsics.c(this.c, lxeVar.c) && this.d == lxeVar.d && this.e.equals(lxeVar.e) && this.f.equals(lxeVar.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Gender gender = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((c + (gender != null ? gender.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = fc6.r("PlayerUpdateData(teamId=", ", playerId=", ", playerName=", this.b, this.a);
        r.append(this.c);
        r.append(", gender=");
        r.append(this.d);
        r.append(", status=");
        r.append(this.e);
        r.append(", date=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
