package defpackage;

import androidx.media3.common.b;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ozf {
    public final b a;
    public final hv9 b;
    public final long c;
    public final List d;
    public final jlf e;

    public ozf(b bVar, List list, i1h i1hVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        z1a.s(!list.isEmpty());
        this.a = bVar;
        this.b = hv9.v(list);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = i1hVar.a(this);
        long j = i1hVar.c;
        long j2 = i1hVar.b;
        String str = nik.a;
        this.c = nik.b0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract jd4 b();

    public abstract jlf c();
}
