package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nic extends mic {
    public final oic e;

    public nic(String str, boolean z, oic oicVar) {
        super(oicVar, str, z);
        z1a.u(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.e = oicVar;
    }

    @Override // defpackage.mic
    public final Object a(byte[] bArr) {
        return this.e.p(bArr);
    }

    @Override // defpackage.mic
    public final byte[] b(Object obj) {
        byte[] d = this.e.d(obj);
        z1a.y(d, "null marshaller.toAsciiString()");
        return d;
    }
}
