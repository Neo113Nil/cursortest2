package defpackage;

import com.google.android.gms.internal.ads.zzatb;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzauo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class akn {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public akn(String str, zzatb zzatbVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzatbVar.b;
        long j = zzatbVar.c;
        long j2 = zzatbVar.d;
        long j3 = zzatbVar.e;
        long j4 = zzatbVar.f;
        List list = zzatbVar.h;
        if (list == 0) {
            Map map = zzatbVar.g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzatk((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static akn a(sb2 sb2Var) {
        if (zzauo.g(sb2Var) != 538247942) {
            throw new IOException();
        }
        String k = zzauo.k(sb2Var);
        String k2 = zzauo.k(sb2Var);
        long i = zzauo.i(sb2Var);
        long i2 = zzauo.i(sb2Var);
        long i3 = zzauo.i(sb2Var);
        long i4 = zzauo.i(sb2Var);
        int g = zzauo.g(sb2Var);
        if (g < 0) {
            is8.e(me4.g(g, "readHeaderList size=", new StringBuilder(String.valueOf(g).length() + 20)));
            return null;
        }
        List arrayList = g == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i5 = 0; i5 < g; i5++) {
            arrayList.add(new zzatk(zzauo.k(sb2Var).intern(), zzauo.k(sb2Var).intern()));
        }
        return new akn(k, k2, i, i2, i3, i4, arrayList);
    }

    public akn(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
