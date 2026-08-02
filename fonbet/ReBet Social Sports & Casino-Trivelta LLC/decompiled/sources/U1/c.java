package U1;

import b1.C2333B;
import b1.C2334C;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12010a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12011b;
    public final byte[] rawMetadata;

    public c(byte[] bArr, String str, String str2) {
        this.rawMetadata = bArr;
        this.f12010a = str;
        this.f12011b = str2;
    }

    @Override // b1.C2334C.a
    public void b(C2333B.b bVar) {
        String str = this.f12010a;
        if (str != null) {
            bVar.p0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.rawMetadata, ((c) obj).rawMetadata);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawMetadata);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f12010a, this.f12011b, Integer.valueOf(this.rawMetadata.length));
    }
}
