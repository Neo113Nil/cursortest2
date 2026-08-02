package org.aspectj.runtime.reflect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.UnlockSignature;

/* loaded from: classes10.dex */
class UnlockSignatureImpl extends SignatureImpl implements UnlockSignature {
    private Class parameterType;

    UnlockSignatureImpl(Class cls) {
        super(8, JoinPoint.SYNCHRONIZATION_UNLOCK, cls);
        this.parameterType = cls;
    }

    UnlockSignatureImpl(String str) {
        super(str);
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker) {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        return "unlock(" + stringMaker.makeTypeName(this.parameterType) + ")";
    }

    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        return this.parameterType;
    }
}
