package ru.ozon.app.android.ui.session.biometry;

import Ib.b;
import Pc.a;

/* loaded from: classes2.dex */
public final class BiometricDialogFragment_MembersInjector implements b<BiometricDialogFragment> {
    public static void injectPViewModel(BiometricDialogFragment biometricDialogFragment, a<BiometricAuthViewModelImpl> aVar) {
        biometricDialogFragment.pViewModel = aVar;
    }
}
