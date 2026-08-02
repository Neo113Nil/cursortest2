package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vaj extends sdi {
    public CharSequence c;
    public List d;
    public pej e;
    public dfj f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public ema k;
    public sf8 l;
    public long m;
    public aej n;

    public vaj() {
        super(snh.h().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = cn3.b(0, 0, 0, 0, 15);
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        sdiVar.getClass();
        vaj vajVar = (vaj) sdiVar;
        this.c = vajVar.c;
        this.d = vajVar.d;
        this.e = vajVar.e;
        this.f = vajVar.f;
        this.g = vajVar.g;
        this.h = vajVar.h;
        this.i = vajVar.i;
        this.j = vajVar.j;
        this.k = vajVar.k;
        this.l = vajVar.l;
        this.m = vajVar.m;
        this.n = vajVar.n;
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return new vaj();
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.c) + ", annotations=" + this.d + ", composition=" + this.e + ", textStyle=" + this.f + ", singleLine=" + this.g + ", softWrap=" + this.h + ", densityValue=" + this.i + ", fontScale=" + this.j + ", layoutDirection=" + this.k + ", fontFamilyResolver=" + this.l + ", constraints=" + ((Object) an3.l(this.m)) + ", layoutResult=" + this.n + ')';
    }
}
