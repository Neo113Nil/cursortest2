package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.LockSignature;

/* loaded from: classes10.dex */
class LockSignatureImpl extends SignatureImpl implements LockSignature {
    private Class parameterType;

    LockSignatureImpl(Class cls) {
        super(8, "lock", cls);
        this.parameterType = cls;
    }

    LockSignatureImpl(String str) {
        super(str);
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker) {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        return "lock(" + stringMaker.makeTypeName(this.parameterType) + ")";
    }

    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        return this.parameterType;
    }
}
