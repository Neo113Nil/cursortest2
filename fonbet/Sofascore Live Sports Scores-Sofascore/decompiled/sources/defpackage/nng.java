package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nng implements hmg {
    public final ArrayList a;
    public float b;
    public float c;
    public ong d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public nng(vng vngVar, j12 j12Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (j12Var == null) {
            return;
        }
        j12Var.r(this);
        if (this.h) {
            this.d.b((ong) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        ong ongVar = this.d;
        if (ongVar != null) {
            arrayList.add(ongVar);
        }
    }

    @Override // defpackage.hmg
    public final void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2);
        this.a.add(this.d);
        this.d = new ong(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }

    @Override // defpackage.hmg
    public final void c(float f, float f2) {
        boolean z = this.h;
        ArrayList arrayList = this.a;
        if (z) {
            this.d.b((ong) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        ong ongVar = this.d;
        if (ongVar != null) {
            arrayList.add(ongVar);
        }
        this.b = f;
        this.c = f2;
        this.d = new ong(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g = arrayList.size();
    }

    @Override // defpackage.hmg
    public final void close() {
        this.a.add(this.d);
        g(this.b, this.c);
        this.h = true;
    }

    @Override // defpackage.hmg
    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new ong(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // defpackage.hmg
    public final void f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        ong ongVar = this.d;
        vng.n(ongVar.a, ongVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // defpackage.hmg
    public final void g(float f, float f2) {
        this.d.a(f, f2);
        this.a.add(this.d);
        ong ongVar = this.d;
        this.d = new ong(f, f2, f - ongVar.a, f2 - ongVar.b);
        this.h = false;
    }
}
