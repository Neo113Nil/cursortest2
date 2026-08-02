package V1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends i {
    public final byte[] data;

    public b(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f12353a.equals(bVar.f12353a) && Arrays.equals(this.data, bVar.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f12353a.hashCode()) * 31) + Arrays.hashCode(this.data);
    }
}
