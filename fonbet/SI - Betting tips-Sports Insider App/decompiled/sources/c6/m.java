package c6;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f3678h;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3678h = bArr;
    }

    @Override // c6.l
    public final byte[] V() {
        return this.f3678h;
    }
}
