package V1;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12346c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12347d;
    public final byte[] data;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12345b = str;
        this.f12346c = str2;
        this.f12347d = str3;
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f12345b, fVar.f12345b) && Objects.equals(this.f12346c, fVar.f12346c) && Objects.equals(this.f12347d, fVar.f12347d) && Arrays.equals(this.data, fVar.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12345b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12346c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12347d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.data);
    }

    @Override // V1.i
    public String toString() {
        return this.f12353a + ": mimeType=" + this.f12345b + ", filename=" + this.f12346c + ", description=" + this.f12347d;
    }
}
