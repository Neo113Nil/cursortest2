package defpackage;

import com.google.android.gms.internal.ads.zzide;
import com.google.android.gms.internal.pal.zzzr;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class lbb implements Iterator {
    public int b;
    public Map.Entry c;
    public final /* synthetic */ AbstractMap e;
    public final /* synthetic */ int a = 1;
    public Map.Entry d = null;

    public lbb(zzide zzideVar) {
        this.e = zzideVar;
        this.c = (mbb) zzideVar.f.i;
        this.b = zzideVar.e;
    }

    public mbb a() {
        mbb mbbVar = (mbb) this.c;
        nbb nbbVar = (nbb) this.e;
        if (mbbVar == nbbVar.f) {
            yhk.d();
            return null;
        }
        if (nbbVar.e != this.b) {
            a70.o();
            return null;
        }
        this.c = (mbb) mbbVar.i;
        this.d = mbbVar;
        return mbbVar;
    }

    public mbb b() {
        zzide zzideVar = (zzide) this.e;
        mbb mbbVar = (mbb) this.c;
        if (mbbVar == zzideVar.f) {
            yhk.d();
            return null;
        }
        if (zzideVar.e != this.b) {
            a70.o();
            return null;
        }
        this.c = (mbb) mbbVar.i;
        this.d = mbbVar;
        return mbbVar;
    }

    public xfp c() {
        xfp xfpVar = (xfp) this.c;
        zzzr zzzrVar = (zzzr) this.e;
        if (xfpVar == zzzrVar.e) {
            yhk.d();
            return null;
        }
        if (zzzrVar.d != this.b) {
            a70.o();
            return null;
        }
        this.c = xfpVar.d;
        this.d = xfpVar;
        return xfpVar;
    }

    public mbb d() {
        gcp gcpVar = (gcp) this.e;
        mbb mbbVar = (mbb) this.c;
        if (mbbVar == gcpVar.f) {
            yhk.d();
            return null;
        }
        if (gcpVar.e != this.b) {
            a70.o();
            return null;
        }
        this.c = (mbb) mbbVar.i;
        this.d = mbbVar;
        return mbbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                if (((mbb) this.c) != ((nbb) abstractMap).f) {
                    break;
                }
                break;
            case 1:
                if (((mbb) this.c) != ((zzide) abstractMap).f) {
                    break;
                }
                break;
            case 2:
                if (((mbb) this.c) != ((gcp) abstractMap).f) {
                    break;
                }
                break;
            default:
                if (((xfp) this.c) != ((zzzr) abstractMap).e) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return d();
            default:
                return c();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                nbb nbbVar = (nbb) abstractMap;
                mbb mbbVar = (mbb) this.d;
                if (mbbVar == null) {
                    zzl.s();
                    break;
                } else {
                    nbbVar.d(mbbVar, true);
                    this.d = null;
                    this.b = nbbVar.e;
                    break;
                }
            case 1:
                mbb mbbVar2 = (mbb) this.d;
                if (mbbVar2 == null) {
                    zzl.s();
                    break;
                } else {
                    zzide zzideVar = (zzide) abstractMap;
                    zzideVar.c(mbbVar2, true);
                    this.d = null;
                    this.b = zzideVar.e;
                    break;
                }
            case 2:
                mbb mbbVar3 = (mbb) this.d;
                if (mbbVar3 == null) {
                    zzl.s();
                    break;
                } else {
                    gcp gcpVar = (gcp) abstractMap;
                    gcpVar.c(mbbVar3, true);
                    this.d = null;
                    this.b = gcpVar.e;
                    break;
                }
            default:
                zzzr zzzrVar = (zzzr) abstractMap;
                xfp xfpVar = (xfp) this.d;
                if (xfpVar == null) {
                    zzl.s();
                    break;
                } else {
                    zzzrVar.c(xfpVar, true);
                    this.d = null;
                    this.b = zzzrVar.d;
                    break;
                }
        }
    }

    public lbb(zzzr zzzrVar) {
        this.e = zzzrVar;
        this.c = zzzrVar.e.d;
        this.b = zzzrVar.d;
    }

    public lbb(gcp gcpVar) {
        this.e = gcpVar;
        this.c = (mbb) gcpVar.f.i;
        this.b = gcpVar.e;
    }

    public lbb(nbb nbbVar) {
        this.e = nbbVar;
        this.c = (mbb) nbbVar.f.i;
        this.b = nbbVar.e;
    }
}
