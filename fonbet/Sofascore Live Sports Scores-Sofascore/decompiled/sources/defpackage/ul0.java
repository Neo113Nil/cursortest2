package defpackage;

import com.google.android.gms.internal.ads.zzagl;
import com.google.android.gms.internal.ads.zzeu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ul0 {
    public final /* synthetic */ int a = 2;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public ul0(zzeu zzeuVar, zzeu zzeuVar2, boolean z) {
        this.j = zzeuVar;
        this.i = zzeuVar2;
        this.f = z;
        zzeuVar2.D(12);
        this.b = zzeuVar2.h();
        zzeuVar.D(12);
        this.h = zzeuVar.h();
        zzagl.a("first_chunk must be 1", zzeuVar.b() == 1);
        this.c = -1;
    }

    public boolean a() {
        int i = this.a;
        Object obj = this.i;
        boolean z = this.f;
        int i2 = this.b;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                nkk nkkVar = (nkk) obj2;
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 != i2) {
                    nkk nkkVar2 = (nkk) obj;
                    this.e = z ? nkkVar2.w() : nkkVar2.t();
                    if (this.c == this.g) {
                        this.d = nkkVar.v();
                        nkkVar.F(4);
                        int i4 = this.h - 1;
                        this.h = i4;
                        this.g = i4 > 0 ? nkkVar.v() - 1 : -1;
                    }
                    break;
                }
                break;
            default:
                j9e j9eVar = (j9e) obj2;
                int i5 = this.c + 1;
                this.c = i5;
                if (i5 != i2) {
                    j9e j9eVar2 = (j9e) obj;
                    this.e = z ? j9eVar2.G() : j9eVar2.C();
                    if (this.c == this.g) {
                        this.d = j9eVar.E();
                        j9eVar.O(4);
                        int i6 = this.h - 1;
                        this.h = i6;
                        this.g = i6 > 0 ? j9eVar.E() - 1 : -1;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    public boolean b() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.b) {
            return false;
        }
        zzeu zzeuVar = (zzeu) this.i;
        this.e = this.f ? zzeuVar.j() : zzeuVar.N();
        if (this.c == this.g) {
            zzeu zzeuVar2 = (zzeu) this.j;
            this.d = zzeuVar2.h();
            zzeuVar2.E(4);
            int i2 = this.h - 1;
            this.h = i2;
            this.g = i2 > 0 ? (-1) + zzeuVar2.h() : -1;
        }
        return true;
    }

    public ul0(nkk nkkVar, nkk nkkVar2, boolean z) {
        this.j = nkkVar;
        this.i = nkkVar2;
        this.f = z;
        nkkVar2.E(12);
        this.b = nkkVar2.v();
        nkkVar.E(12);
        this.h = nkkVar.v();
        u6h.F("first_chunk must be 1", nkkVar.f() == 1);
        this.c = -1;
    }

    public ul0(j9e j9eVar, j9e j9eVar2, boolean z) {
        this.j = j9eVar;
        this.i = j9eVar2;
        this.f = z;
        j9eVar2.N(12);
        this.b = j9eVar2.E();
        j9eVar.N(12);
        this.h = j9eVar.E();
        o1j.s("first_chunk must be 1", j9eVar.m() == 1);
        this.c = -1;
    }
}
