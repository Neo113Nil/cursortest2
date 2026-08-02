package ru.ozon.fintech.features.camera.domain.analytic;

import Jb.e;
import Pc.a;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class QrScannerAnalytic_Factory implements e<QrScannerAnalytic> {
    private final a<InterfaceC6618a> fintechAnalyticInteractorProvider;

    public QrScannerAnalytic_Factory(a<InterfaceC6618a> aVar) {
        this.fintechAnalyticInteractorProvider = aVar;
    }

    public static QrScannerAnalytic_Factory create(a<InterfaceC6618a> aVar) {
        return new QrScannerAnalytic_Factory(aVar);
    }

    public static QrScannerAnalytic newInstance(InterfaceC6618a interfaceC6618a) {
        return new QrScannerAnalytic(interfaceC6618a);
    }

    @Override // Pc.a
    public QrScannerAnalytic get() {
        return newInstance(this.fintechAnalyticInteractorProvider.get());
    }
}
