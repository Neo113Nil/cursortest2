package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x7a extends i13 {
    public final w7d r;

    public x7a(Class cls) {
        super(true);
        this.r = new w7d(cls);
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // defpackage.b8d
    public final String b() {
        return "List<" + this.r.s.getName() + "}>";
    }

    @Override // defpackage.b8d
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        w7d w7dVar = this.r;
        return list != null ? CollectionsKt.w0(a.c(w7dVar.d(str)), list) : a.c(w7dVar.d(str));
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        str.getClass();
        return a.c(this.r.d(str));
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7a)) {
            return false;
        }
        return this.r.equals(((x7a) obj).r);
    }

    @Override // defpackage.i13
    public final Object g() {
        return km5.a;
    }

    @Override // defpackage.i13
    public final List h(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.r.r.hashCode();
    }
}
