package defpackage;

import com.google.android.gms.internal.pal.zzip;
import com.google.android.gms.internal.pal.zziz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pro extends zziz {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zziz e;

    public pro(zziz zzizVar, int i, int i2) {
        this.e = zzizVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int d() {
        return this.e.m() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzip.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int m() {
        return this.e.m() + this.c;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final Object[] o() {
        return this.e.o();
    }

    @Override // com.google.android.gms.internal.pal.zziz, java.util.List
    /* renamed from: p */
    public final zziz subList(int i, int i2) {
        zzip.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
