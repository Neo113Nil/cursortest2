package V1;

import b1.C2333B;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12331b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12332c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12333d;
    public final byte[] pictureData;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f12331b = str;
        this.f12332c = str2;
        this.f12333d = i10;
        this.pictureData = bArr;
    }

    @Override // b1.C2334C.a
    public void b(C2333B.b bVar) {
        bVar.K(this.pictureData, this.f12333d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12333d == aVar.f12333d && Objects.equals(this.f12331b, aVar.f12331b) && Objects.equals(this.f12332c, aVar.f12332c) && Arrays.equals(this.pictureData, aVar.pictureData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f12333d) * 31;
        String str = this.f12331b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12332c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.pictureData);
    }

    @Override // V1.i
    public String toString() {
        return this.f12353a + ": mimeType=" + this.f12331b + ", description=" + this.f12332c;
    }
}
