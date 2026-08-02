package T1;

import b1.AbstractC2335D;
import b1.C2333B;
import b1.C2334C;
import e1.J;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10851b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10852c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10853d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10854e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10855f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10856g;
    public final byte[] pictureData;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f10850a = i10;
        this.f10851b = str;
        this.f10852c = str2;
        this.f10853d = i11;
        this.f10854e = i12;
        this.f10855f = i13;
        this.f10856g = i14;
        this.pictureData = bArr;
    }

    public static a d(J j10) {
        int v10 = j10.v();
        String u10 = AbstractC2335D.u(j10.K(j10.v(), StandardCharsets.US_ASCII));
        String J10 = j10.J(j10.v());
        int v11 = j10.v();
        int v12 = j10.v();
        int v13 = j10.v();
        int v14 = j10.v();
        int v15 = j10.v();
        byte[] bArr = new byte[v15];
        j10.q(bArr, 0, v15);
        return new a(v10, u10, J10, v11, v12, v13, v14, bArr);
    }

    @Override // b1.C2334C.a
    public void b(C2333B.b bVar) {
        bVar.K(this.pictureData, this.f10850a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10850a == aVar.f10850a && this.f10851b.equals(aVar.f10851b) && this.f10852c.equals(aVar.f10852c) && this.f10853d == aVar.f10853d && this.f10854e == aVar.f10854e && this.f10855f == aVar.f10855f && this.f10856g == aVar.f10856g && Arrays.equals(this.pictureData, aVar.pictureData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f10850a) * 31) + this.f10851b.hashCode()) * 31) + this.f10852c.hashCode()) * 31) + this.f10853d) * 31) + this.f10854e) * 31) + this.f10855f) * 31) + this.f10856g) * 31) + Arrays.hashCode(this.pictureData);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f10851b + ", description=" + this.f10852c;
    }
}
