package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a1k extends w0k {
    public final lee e;

    public a1k(lee leeVar) {
        super(1);
        this.e = leeVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new f0d(this.e, objArr[i], objArr[i + 1]);
    }
}
