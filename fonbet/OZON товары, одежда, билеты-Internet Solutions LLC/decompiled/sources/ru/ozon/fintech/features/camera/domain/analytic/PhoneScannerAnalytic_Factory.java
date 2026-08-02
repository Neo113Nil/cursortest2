package ru.ozon.fintech.features.camera.domain.analytic;

import Jb.e;
import Pc.a;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class PhoneScannerAnalytic_Factory implements e<PhoneScannerAnalytic> {
    private final a<InterfaceC6618a> fintechAnalyticInteractorProvider;

    public PhoneScannerAnalytic_Factory(a<InterfaceC6618a> aVar) {
        this.fintechAnalyticInteractorProvider = aVar;
    }

    public static PhoneScannerAnalytic_Factory create(a<InterfaceC6618a> aVar) {
        return new PhoneScannerAnalytic_Factory(aVar);
    }

    public static PhoneScannerAnalytic newInstance(InterfaceC6618a interfaceC6618a) {
        return new PhoneScannerAnalytic(interfaceC6618a);
    }

    @Override // Pc.a
    public PhoneScannerAnalytic get() {
        return newInstance(this.fintechAnalyticInteractorProvider.get());
    }
}
