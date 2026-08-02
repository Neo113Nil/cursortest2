package e0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class m {
    public static final long a(long j10, float f10) {
        return l.b(j10 | (Float.floatToIntBits(f10) & BodyPartID.bodyIdMax));
    }
}
