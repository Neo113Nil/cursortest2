package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes5.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    private SubsequentMessage(int i10) {
        super(i10);
    }

    public static SubsequentMessage valueOf(int i10) {
        if (i10 == 0) {
            return encrCert;
        }
        if (i10 == 1) {
            return challengeResp;
        }
        throw new IllegalArgumentException("unknown value: " + i10);
    }
}
