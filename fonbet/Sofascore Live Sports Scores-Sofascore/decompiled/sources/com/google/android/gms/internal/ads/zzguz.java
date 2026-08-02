package com.google.android.gms.internal.ads;

import defpackage.ewm;
import defpackage.hho;
import defpackage.pyh;
import defpackage.sgo;
import defpackage.ugo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzguz {
    public final zzgty a;
    public final boolean b;
    public final hho c;

    public zzguz(hho hhoVar, boolean z, zzgty zzgtyVar) {
        this.c = hhoVar;
        this.b = z;
        this.a = zzgtyVar;
    }

    public static zzguz a(sgo sgoVar) {
        return new zzguz(new ewm(sgoVar, 28));
    }

    public final zzguz b(zzgty zzgtyVar) {
        zzgtyVar.getClass();
        return new zzguz(this.c, this.b, zzgtyVar);
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator i = this.c.i(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            pyh pyhVar = (pyh) i;
            if (!pyhVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) pyhVar.next());
        }
    }

    public zzguz(hho hhoVar) {
        this(hhoVar, false, ugo.b);
    }
}
