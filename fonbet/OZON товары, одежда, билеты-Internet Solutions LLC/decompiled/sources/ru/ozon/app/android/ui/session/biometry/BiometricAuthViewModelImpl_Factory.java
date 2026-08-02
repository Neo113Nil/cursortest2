package ru.ozon.app.android.ui.session.biometry;

import Jb.e;
import Pc.a;

/* loaded from: classes2.dex */
public final class BiometricAuthViewModelImpl_Factory implements e<BiometricAuthViewModelImpl> {
    private final a<Fb0.a> biometryAuthProvider;

    public BiometricAuthViewModelImpl_Factory(a<Fb0.a> aVar) {
        this.biometryAuthProvider = aVar;
    }

    public static BiometricAuthViewModelImpl_Factory create(a<Fb0.a> aVar) {
        return new BiometricAuthViewModelImpl_Factory(aVar);
    }

    public static BiometricAuthViewModelImpl newInstance(Fb0.a aVar) {
        return new BiometricAuthViewModelImpl(aVar);
    }

    @Override // Pc.a
    public BiometricAuthViewModelImpl get() {
        return newInstance(this.biometryAuthProvider.get());
    }
}
