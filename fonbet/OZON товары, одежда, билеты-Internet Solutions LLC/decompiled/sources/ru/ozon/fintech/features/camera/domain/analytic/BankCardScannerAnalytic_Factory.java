package ru.ozon.fintech.features.camera.domain.analytic;

import Jb.e;
import Pc.a;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class BankCardScannerAnalytic_Factory implements e<BankCardScannerAnalytic> {
    private final a<InterfaceC6618a> fintechAnalyticInteractorProvider;

    public BankCardScannerAnalytic_Factory(a<InterfaceC6618a> aVar) {
        this.fintechAnalyticInteractorProvider = aVar;
    }

    public static BankCardScannerAnalytic_Factory create(a<InterfaceC6618a> aVar) {
        return new BankCardScannerAnalytic_Factory(aVar);
    }

    public static BankCardScannerAnalytic newInstance(InterfaceC6618a interfaceC6618a) {
        return new BankCardScannerAnalytic(interfaceC6618a);
    }

    @Override // Pc.a
    public BankCardScannerAnalytic get() {
        return newInstance(this.fintechAnalyticInteractorProvider.get());
    }
}
