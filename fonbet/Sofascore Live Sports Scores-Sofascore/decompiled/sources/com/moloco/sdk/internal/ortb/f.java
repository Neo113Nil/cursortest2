package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.model.c0;
import com.moloco.sdk.internal.ortb.model.j;
import com.moloco.sdk.internal.ortb.model.y;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class f {
    public static final Regex a = new Regex("\\$\\{AUCTION_PRICE\\}");

    public static final c0 a(c0 c0Var) {
        String str;
        c0Var.getClass();
        List list = c0Var.a;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<y> list2 = ((j) it.next()).a;
            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
            for (y yVar : list2) {
                float f = yVar.b;
                String str2 = yVar.e;
                String str3 = yVar.a;
                Float valueOf = Float.valueOf(f);
                str3.getClass();
                String f2 = valueOf.toString();
                if (f2 == null) {
                    f2 = "";
                }
                Regex regex = a;
                String replace = regex.replace(str3, f2);
                String str4 = yVar.c;
                if (str4 != null) {
                    String f3 = Float.valueOf(f).toString();
                    str = regex.replace(str4, f3 != null ? f3 : "");
                } else {
                    str = null;
                }
                arrayList2.add(new y(replace, f, str, yVar.d, str2, yVar.f, yVar.g, yVar.h));
            }
            arrayList.add(new j(arrayList2));
        }
        return new c0(arrayList);
    }
}
