package M;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class e {
    public static final long a(float f10, float f11) {
        return d.b((Float.floatToIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToIntBits(f10) << 32));
    }
}
