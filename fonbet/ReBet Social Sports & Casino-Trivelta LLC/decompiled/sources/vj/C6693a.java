package vj;

import org.spongycastle.crypto.params.AbstractC5975b;

/* renamed from: vj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6693a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5975b f67185a;
    private final byte[] shared;

    public C6693a(AbstractC5975b abstractC5975b, byte[] bArr) {
        this.f67185a = abstractC5975b;
        this.shared = Aj.a.d(bArr);
    }

    public AbstractC5975b a() {
        return this.f67185a;
    }

    public byte[] b() {
        return Aj.a.d(this.shared);
    }
}
