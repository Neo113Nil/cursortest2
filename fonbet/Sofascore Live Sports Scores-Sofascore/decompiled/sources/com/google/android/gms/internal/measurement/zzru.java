package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.a02;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.hv9;
import defpackage.ica;
import defpackage.ip2;
import defpackage.p03;
import defpackage.qyh;
import defpackage.vvf;
import defpackage.zu9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzru {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public zzru(ArrayList arrayList) {
        zztc zztcVar;
        zzsx zzsxVar;
        List<zztc> list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzsx zzsxVar2 = (zzsx) it.next();
            if (!TextUtils.isEmpty(zzsxVar2.zzc()) && (zzsxVar = (zzsx) this.a.put(zzsxVar2.zzc(), zzsxVar2)) != null) {
                String canonicalName = zzsxVar.getClass().getCanonicalName();
                String canonicalName2 = zzsxVar2.getClass().getCanonicalName();
                a70.p(fc6.o(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                throw null;
            }
        }
        for (zztc zztcVar2 : list) {
            if (!TextUtils.isEmpty(zztcVar2.zza()) && (zztcVar = (zztc) this.b.put(zztcVar2.zza(), zztcVar2)) != null) {
                String canonicalName3 = zztcVar.getClass().getCanonicalName();
                String canonicalName4 = zztcVar2.getClass().getCanonicalName();
                a70.p(fc6.o(new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length()), "Cannot to override Transform ", canonicalName3, " with ", canonicalName4));
                throw null;
            }
        }
        this.c.addAll(list);
    }

    public final Object a(Uri uri, zzrt zzrtVar) {
        List list;
        zzrs zzrsVar;
        zu9 s = hv9.s();
        zu9 s2 = hv9.s();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            list = vvf.e;
        } else {
            String substring = encodedFragment.substring(10);
            a02 d = a02.d("+");
            list = hv9.u(new ica(new a02((qyh) d.e, true, (ip2) d.d, d.b), substring));
        }
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            zzrsVar = null;
            if (i < size) {
                String str = (String) list.get(i);
                Matcher matcher = zzsp.a.matcher(str);
                if (!matcher.matches()) {
                    a70.p("Invalid fragment spec: ".concat(String.valueOf(str)));
                    break;
                }
                s2.c(matcher.group(1));
                i++;
            } else {
                vvf g = s2.g();
                int i2 = g.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    String str2 = (String) g.get(i3);
                    zztc zztcVar = (zztc) this.b.get(str2);
                    if (zztcVar == null) {
                        String valueOf = String.valueOf(uri);
                        throw new zzsk(fc6.o(new StringBuilder(str2.length() + 40 + valueOf.length()), "Requested transform isn't registered: ", str2, ": ", valueOf));
                    }
                    s.c(zztcVar);
                }
                hv9 C = s.g().C();
                p03 p03Var = new p03(29, z);
                String scheme = uri.getScheme();
                zzsx zzsxVar = (zzsx) this.a.get(scheme);
                if (zzsxVar == null) {
                    throw new zzsk(dmi.q("Requested backend isn't registered: ", scheme));
                }
                p03Var.b = zzsxVar;
                p03Var.d = this.c;
                p03Var.c = C;
                p03Var.e = uri;
                if (!C.isEmpty()) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                        String str3 = (String) arrayList.get(arrayList.size() - 1);
                        ListIterator listIterator = C.listIterator(C.size());
                        while (listIterator.hasPrevious()) {
                        }
                        arrayList.set(arrayList.size() - 1, str3);
                        uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                    }
                }
                p03Var.f = uri;
                zzrsVar = new zzrs(p03Var);
            }
        }
        return zzrtVar.a(zzrsVar);
    }
}
