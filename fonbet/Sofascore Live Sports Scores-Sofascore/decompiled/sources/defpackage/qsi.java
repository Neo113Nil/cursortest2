package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qsi {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public qsi(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsi)) {
            return false;
        }
        qsi qsiVar = (qsi) obj;
        if (Intrinsics.c(this.a, qsiVar.a) && Intrinsics.c(this.b, qsiVar.b) && Intrinsics.c(this.c, qsiVar.c) && Intrinsics.c(this.d, qsiVar.d)) {
            return Intrinsics.c(this.e, qsiVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.d(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return dii.b(dii.d("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + s6a.C(CollectionsKt.G0(this.d)) + "\n            |   referenceColumnNames = {" + s6a.B(CollectionsKt.G0(this.e)) + "\n            |}\n        "), "    ");
    }
}
