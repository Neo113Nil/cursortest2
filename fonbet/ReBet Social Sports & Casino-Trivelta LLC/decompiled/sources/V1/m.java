package V1;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12361b;
    public final byte[] privateData;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f12361b = str;
        this.privateData = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f12361b, mVar.f12361b) && Arrays.equals(this.privateData, mVar.privateData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12361b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.privateData);
    }

    @Override // V1.i
    public String toString() {
        return this.f12353a + ": owner=" + this.f12361b;
    }
}
