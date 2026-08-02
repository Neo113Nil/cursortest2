package com.vk.biometric.auth.impl.di;

import com.vk.biometric.auth.api.di.BiometricAuthComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.k47;
import xsna.l35;
import xsna.nwy;
import xsna.qcy;

/* compiled from: BiometricAuthComponentImpl.kt */
/* loaded from: classes15.dex */
public final class BiometricAuthComponentImpl implements BiometricAuthComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new l35(2));

    /* compiled from: BiometricAuthComponentImpl.kt */
    public static final class a implements b7m<BiometricAuthComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new BiometricAuthComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BiometricAuthComponentImpl.class, "biometric", "getBiometric()Lcom/vk/biometric/auth/api/domain/interactor/BiometricAuthHandler;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.biometric.auth.api.di.BiometricAuthComponent
    public final k47 Y6() {
        qcy<Object> qcyVar = b[0];
        return (k47) this.a.c();
    }
}
