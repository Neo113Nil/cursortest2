package defpackage;

import com.google.android.gms.internal.ads.zzanu;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzcx;
import com.google.android.gms.internal.ads.zzcy;
import com.google.android.gms.internal.ads.zzguk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k2l implements kli, zzanu {
    public final List a;
    public final long[] b;
    public final long[] c;

    public k2l(ArrayList arrayList, int i) {
        int i2 = 0;
        switch (i) {
            case 1:
                this.a = Collections.unmodifiableList(new ArrayList(arrayList));
                int size = arrayList.size();
                this.b = new long[size + size];
                while (i2 < arrayList.size()) {
                    zzapk zzapkVar = (zzapk) arrayList.get(i2);
                    long[] jArr = this.b;
                    int i3 = i2 + i2;
                    jArr[i3] = zzapkVar.b;
                    jArr[i3 + 1] = zzapkVar.c;
                    i2++;
                }
                long[] jArr2 = this.b;
                long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                this.c = copyOf;
                Arrays.sort(copyOf);
                break;
            default:
                this.a = Collections.unmodifiableList(new ArrayList(arrayList));
                this.b = new long[arrayList.size() * 2];
                while (i2 < arrayList.size()) {
                    u1l u1lVar = (u1l) arrayList.get(i2);
                    int i4 = i2 * 2;
                    long[] jArr3 = this.b;
                    jArr3[i4] = u1lVar.b;
                    jArr3[i4 + 1] = u1lVar.c;
                    i2++;
                }
                long[] jArr4 = this.b;
                long[] copyOf2 = Arrays.copyOf(jArr4, jArr4.length);
                this.c = copyOf2;
                Arrays.sort(copyOf2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public ArrayList b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i + i;
            long[] jArr = this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzapk zzapkVar = (zzapk) list.get(i);
                zzcy zzcyVar = zzapkVar.a;
                if (zzcyVar.e == -3.4028235E38f) {
                    arrayList2.add(zzapkVar);
                } else {
                    arrayList.add(zzcyVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, v4n.l);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzcy zzcyVar2 = ((zzapk) arrayList2.get(i3)).a;
            zzcx zzcxVar = new zzcx();
            zzcxVar.a = zzcyVar2.a;
            zzcxVar.b = zzcyVar2.d;
            zzcxVar.c = zzcyVar2.b;
            zzcxVar.d = zzcyVar2.c;
            zzcxVar.g = zzcyVar2.g;
            zzcxVar.h = zzcyVar2.h;
            zzcxVar.i = zzcyVar2.i;
            zzcxVar.j = zzcyVar2.l;
            zzcxVar.k = zzcyVar2.m;
            zzcxVar.l = zzcyVar2.j;
            zzcxVar.m = zzcyVar2.k;
            zzcxVar.n = zzcyVar2.n;
            zzcxVar.o = zzcyVar2.o;
            zzcxVar.p = zzcyVar2.p;
            zzcxVar.e = (-1) - i3;
            zzcxVar.f = 1;
            arrayList.add(zzcxVar.b());
        }
        return arrayList;
    }

    @Override // defpackage.kli
    public List getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                u1l u1lVar = (u1l) list.get(i);
                l74 l74Var = u1lVar.a;
                if (l74Var.e == -3.4028235E38f) {
                    arrayList2.add(u1lVar);
                } else {
                    arrayList.add(l74Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new m39(19));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            j74 a = ((u1l) arrayList2.get(i3)).a.a();
            a.e = (-1) - i3;
            a.f = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // defpackage.kli
    public long getEventTime(int i) {
        qx9.r(i >= 0);
        long[] jArr = this.c;
        qx9.r(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.kli
    public int getEventTimeCount() {
        return this.c.length;
    }

    @Override // defpackage.kli
    public int getNextEventTimeIndex(long j) {
        long[] jArr = this.c;
        int b = lik.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public int zza() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public long zzb(int i) {
        zzguk.a(i >= 0);
        long[] jArr = this.c;
        zzguk.a(i < jArr.length);
        return jArr[i];
    }
}
