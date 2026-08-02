package ru.ozon.app.android.cabinet.di;

import Fb0.a;
import Jb.e;
import Jb.j;

/* loaded from: classes6.dex */
public final class BiometryModule_ProvideBiometryAuthFactory implements e<a> {
    public static a provideBiometryAuth(Ob0.a aVar) {
        a provideBiometryAuth = BiometryModule.INSTANCE.provideBiometryAuth(aVar);
        j.d(provideBiometryAuth);
        return provideBiometryAuth;
    }
}
