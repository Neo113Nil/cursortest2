package org.bouncycastle.pqc.crypto.lms;

import com.plaid.internal.EnumC3631g;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* loaded from: classes5.dex */
public class LMOtsParameters {
    public static final int reserved = 0;
    public static final LMOtsParameters sha256_n32_w1;
    public static final LMOtsParameters sha256_n32_w2;
    public static final LMOtsParameters sha256_n32_w4;
    public static final LMOtsParameters sha256_n32_w8;
    private static final Map<Object, LMOtsParameters> suppliers;
    private final ASN1ObjectIdentifier digestOID;
    private final int ls;

    /* renamed from: n, reason: collision with root package name */
    private final int f62049n;

    /* renamed from: p, reason: collision with root package name */
    private final int f62050p;
    private final int sigLen;
    private final int type;

    /* renamed from: w, reason: collision with root package name */
    private final int f62051w;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        sha256_n32_w1 = new LMOtsParameters(1, 32, 1, EnumC3631g.SDK_ASSET_HEADER_SHIELD_VALUE, 7, 8516, aSN1ObjectIdentifier);
        sha256_n32_w2 = new LMOtsParameters(2, 32, 2, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 6, 4292, aSN1ObjectIdentifier);
        sha256_n32_w4 = new LMOtsParameters(3, 32, 4, 67, 4, 2180, aSN1ObjectIdentifier);
        sha256_n32_w8 = new LMOtsParameters(4, 32, 8, 34, 0, RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_EVENT, aSN1ObjectIdentifier);
        suppliers = new HashMap<Object, LMOtsParameters>() { // from class: org.bouncycastle.pqc.crypto.lms.LMOtsParameters.1
            {
                LMOtsParameters lMOtsParameters = LMOtsParameters.sha256_n32_w1;
                put(Integer.valueOf(lMOtsParameters.type), lMOtsParameters);
                LMOtsParameters lMOtsParameters2 = LMOtsParameters.sha256_n32_w2;
                put(Integer.valueOf(lMOtsParameters2.type), lMOtsParameters2);
                LMOtsParameters lMOtsParameters3 = LMOtsParameters.sha256_n32_w4;
                put(Integer.valueOf(lMOtsParameters3.type), lMOtsParameters3);
                LMOtsParameters lMOtsParameters4 = LMOtsParameters.sha256_n32_w8;
                put(Integer.valueOf(lMOtsParameters4.type), lMOtsParameters4);
            }
        };
    }

    public LMOtsParameters(int i10, int i11, int i12, int i13, int i14, int i15, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.type = i10;
        this.f62049n = i11;
        this.f62051w = i12;
        this.f62050p = i13;
        this.ls = i14;
        this.sigLen = i15;
        this.digestOID = aSN1ObjectIdentifier;
    }

    public static LMOtsParameters getParametersForType(int i10) {
        return suppliers.get(Integer.valueOf(i10));
    }

    public ASN1ObjectIdentifier getDigestOID() {
        return this.digestOID;
    }

    public int getLs() {
        return this.ls;
    }

    public int getN() {
        return this.f62049n;
    }

    public int getP() {
        return this.f62050p;
    }

    public int getSigLen() {
        return this.sigLen;
    }

    public int getType() {
        return this.type;
    }

    public int getW() {
        return this.f62051w;
    }
}
