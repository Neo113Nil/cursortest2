package kotlin;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int a(int i10, int i11) {
        return (int) ((i10 & BodyPartID.bodyIdMax) / (i11 & BodyPartID.bodyIdMax));
    }
}
