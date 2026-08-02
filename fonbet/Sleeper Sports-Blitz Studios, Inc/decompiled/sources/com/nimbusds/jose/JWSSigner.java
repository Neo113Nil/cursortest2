package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;

/* loaded from: classes8.dex */
public interface JWSSigner extends JWSProvider {
    Base64URL sign(JWSHeader jWSHeader, byte[] bArr) throws JOSEException;
}
