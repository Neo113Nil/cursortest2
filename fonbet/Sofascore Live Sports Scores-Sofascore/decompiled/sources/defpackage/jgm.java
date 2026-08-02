package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jgm {
    public static final Double b;
    public final Context a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        b = Double.valueOf(3.0d);
    }

    public jgm(@NotNull Context context) {
        context.getClass();
        this.a = context;
    }

    public static final int a(jgm jgmVar, List list, Uri uri, int i, String str, pe2 pe2Var) {
        pe2 pe2Var2;
        Long l;
        jgmVar.getClass();
        list.size();
        str.getClass();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            wc9 wc9Var = (wc9) it.next();
            try {
                hqm hqmVar = hqm.a;
                String str2 = wc9Var.a;
                str2.getClass();
                Uri a2 = hqm.a(uri, str2);
                Double d = b;
                if (d != null) {
                    l = Long.valueOf((long) ((((int) (i * 1000.0f)) * ((float) d.doubleValue())) / 8.0f));
                } else {
                    l = null;
                }
                Long l2 = l;
                pe2Var2 = pe2Var;
                try {
                    hqm.downloadSegment$default(hqmVar, a2, pe2Var2, 0L, l2, null, 16, null);
                    i2++;
                    list.size();
                } catch (Exception unused) {
                    String str3 = wc9Var.a;
                    pe2Var = pe2Var2;
                }
            } catch (Exception unused2) {
                pe2Var2 = pe2Var;
            }
            pe2Var = pe2Var2;
        }
        return i2;
    }

    public static ed9 b(pe2 pe2Var, Uri uri, String str) {
        qe2 createDataSource = pe2Var.createDataSource();
        Map map = Collections.EMPTY_MAP;
        z1a.y(uri, "The uri must be set.");
        ue4 ue4Var = new ue4(createDataSource, new xe4(uri, 0L, 1, null, map, 0L, -1L, str, 0));
        try {
            ed9 e = new gd9().e(uri, ue4Var);
            ue4Var.close();
            return e;
        } finally {
        }
    }

    public static final List c(jgm jgmVar, String str, String str2, pe2 pe2Var) {
        List<cd9> list;
        jgmVar.getClass();
        Uri parse = Uri.parse(str);
        ed9 b2 = b(pe2Var, parse, str2);
        if (!(b2 instanceof dd9)) {
            return b2 instanceof zc9 ? kotlin.collections.a.c(new am6((zc9) b2, parse, 2000000)) : km5.a;
        }
        List list2 = ((dd9) b2).e;
        if (list2.isEmpty()) {
            list = km5.a;
        } else {
            List L0 = CollectionsKt.L0(CollectionsKt.H0(list2, new dkm()), Integer.MAX_VALUE);
            CollectionsKt.f0(L0, ", ", null, null, new w5m(4), 30);
            L0.size();
            list = L0;
        }
        ArrayList arrayList = new ArrayList();
        for (cd9 cd9Var : list) {
            Uri uri = cd9Var.a;
            uri.getClass();
            am6 am6Var = null;
            ed9 b3 = b(pe2Var, uri, null);
            zc9 zc9Var = b3 instanceof zc9 ? (zc9) b3 : null;
            if (zc9Var != null) {
                Uri uri2 = cd9Var.a;
                uri2.getClass();
                am6Var = new am6(zc9Var, uri2, cd9Var.b.j);
            }
            if (am6Var != null) {
                arrayList.add(am6Var);
            }
        }
        return arrayList;
    }
}
