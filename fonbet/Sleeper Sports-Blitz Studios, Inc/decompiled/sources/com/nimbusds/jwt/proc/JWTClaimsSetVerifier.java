package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jwt.JWTClaimsSet;

/* loaded from: classes8.dex */
public interface JWTClaimsSetVerifier<C extends SecurityContext> {
    void verify(JWTClaimsSet jWTClaimsSet, C c) throws BadJWTException;
}
