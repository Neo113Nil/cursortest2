package com.evervault.sdk.core.services;

import com.evervault.sdk.core.models.Secp256r1Constants;
import com.evervault.sdk.core.utils.HexHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/evervault/sdk/core/services/DEREncoder;", "", "constants", "Lcom/evervault/sdk/core/models/Secp256r1Constants;", "(Lcom/evervault/sdk/core/models/Secp256r1Constants;)V", "curveValues", "getCurveValues", "()Lcom/evervault/sdk/core/models/Secp256r1Constants;", "publicKeyToDer", "", "decompressedPublicKey", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DEREncoder {

    @NotNull
    private final Secp256r1Constants curveValues;

    public DEREncoder(@NotNull Secp256r1Constants constants) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        this.curveValues = constants;
    }

    @NotNull
    public final Secp256r1Constants getCurveValues() {
        return this.curveValues;
    }

    @NotNull
    public final byte[] publicKeyToDer(@NotNull byte[] decompressedPublicKey) {
        Intrinsics.checkNotNullParameter(decompressedPublicKey, "decompressedPublicKey");
        ASN1 asn1 = ASN1.INSTANCE;
        String encode = asn1.encode("30", asn1.encode("06", "2A 86 48 CE 3D 02 01"), asn1.encode("30", asn1.UINT("01"), asn1.encode("30", asn1.encode("06", "2A 86 48 CE 3D 01 01"), asn1.UINT(this.curveValues.getP())), asn1.encode("30", asn1.encode("04", this.curveValues.getA()), asn1.encode("04", this.curveValues.getB()), asn1.BITSTR(this.curveValues.getSeed())), asn1.encode("04", this.curveValues.getGenerator()), asn1.UINT(this.curveValues.getN()), asn1.UINT(this.curveValues.getH())));
        HexHandler hexHandler = HexHandler.INSTANCE;
        return hexHandler.decode(asn1.encode("30", encode, asn1.BITSTR(HexHandler.encode$default(hexHandler, decompressedPublicKey, false, null, 6, null))));
    }
}
