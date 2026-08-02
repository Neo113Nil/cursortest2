package h3;

import java.util.Arrays;

/* renamed from: h3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4435d extends AbstractC4436e {
    private final byte[] bytes;

    public C4435d(byte[] bArr) {
        super(EnumC4441j.BYTE_STRING);
        if (bArr == null) {
            this.bytes = null;
        } else {
            this.bytes = bArr;
        }
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof C4435d) {
            C4435d c4435d = (C4435d) obj;
            if (super.equals(obj) && Arrays.equals(this.bytes, c4435d.bytes)) {
                return true;
            }
        }
        return false;
    }

    @Override // h3.AbstractC4436e
    public /* bridge */ /* synthetic */ AbstractC4436e g(boolean z10) {
        return super.g(z10);
    }

    public byte[] h() {
        byte[] bArr = this.bytes;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.bytes);
    }
}
