package defpackage;

import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzzj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tyo extends zziz {
    public static final /* synthetic */ int k = 0;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final zzbf[] h;
    public final Object[] i;
    public final HashMap j;

    public tyo(zzbf[] zzbfVarArr, Object[] objArr, zzzj zzzjVar) {
        super(zzzjVar);
        this.h = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i];
            this.h[i4] = zzbfVar;
            this.g[i4] = i2;
            this.f[i4] = i3;
            i2 += zzbfVar.a();
            i3 += this.h[i4].c();
            this.j.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.d = i2;
        this.e = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final int p(int i) {
        return zzfm.r(this.f, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final int q(int i) {
        return zzfm.r(this.g, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final int r(Object obj) {
        Integer num = (Integer) this.j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final zzbf s(int i) {
        return this.h[i];
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final int t(int i) {
        return this.f[i];
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final int u(int i) {
        return this.g[i];
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final Object v(int i) {
        return this.i[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tyo(ArrayList arrayList, zzzj zzzjVar) {
        this(r0, r1, zzzjVar);
        zzbf[] zzbfVarArr = new zzbf[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i2] = ((nxo) it.next()).zzb();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((nxo) it2.next()).zza();
            i++;
        }
    }
}
