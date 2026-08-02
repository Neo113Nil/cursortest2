package defpackage;

import com.google.android.gms.internal.identity.zzer;
import com.google.android.gms.internal.identity.zzex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l6o extends zzex {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzex e;

    public l6o(zzex zzexVar, int i, int i2) {
        this.e = zzexVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzer.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final Object[] m() {
        return this.e.m();
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int o() {
        return this.e.n() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.internal.identity.zzex, java.util.List
    /* renamed from: s */
    public final zzex subList(int i, int i2) {
        zzer.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
