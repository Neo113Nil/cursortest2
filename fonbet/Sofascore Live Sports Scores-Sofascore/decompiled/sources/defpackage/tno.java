package defpackage;

import com.google.android.gms.internal.cast.zzhd;
import com.google.android.gms.internal.cast.zzhv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tno extends zzhv {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzhv e;

    public tno(zzhv zzhvVar, int i, int i2) {
        this.e = zzhvVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzhd.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final Object[] m() {
        return this.e.m();
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int o() {
        return this.e.n() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.zzhv, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final zzhv subList(int i, int i2) {
        zzhd.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
