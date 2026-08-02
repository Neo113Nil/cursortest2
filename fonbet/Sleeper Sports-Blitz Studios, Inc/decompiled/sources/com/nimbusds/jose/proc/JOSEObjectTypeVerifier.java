package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.proc.SecurityContext;

/* loaded from: classes8.dex */
public interface JOSEObjectTypeVerifier<C extends SecurityContext> {
    void verify(JOSEObjectType jOSEObjectType, C c) throws BadJOSEException;
}
