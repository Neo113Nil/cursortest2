package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jic extends mic {
    public final kic e;

    public jic(String str, kic kicVar) {
        super(kicVar, str, false);
        z1a.u(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        z1a.y(kicVar, "marshaller");
        this.e = kicVar;
    }

    @Override // defpackage.mic
    public final Object a(byte[] bArr) {
        return this.e.k(new String(bArr, xp2.a));
    }

    @Override // defpackage.mic
    public final byte[] b(Object obj) {
        String d = this.e.d(obj);
        z1a.y(d, "null marshaller.toAsciiString()");
        return d.getBytes(xp2.a);
    }
}
