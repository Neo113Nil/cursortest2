package ru.ozon.fintech.features.camera.presentation.qrconfirm;

import Jb.e;
import Pc.a;
import S80.b;
import d40.InterfaceC6083a;

/* loaded from: classes3.dex */
public final class QrScannerResultViewModel_Factory implements e<QrScannerResultViewModel> {
    private final a<InterfaceC6083a> exchangerProvider;
    private final a<b> fintechNavigationProvider;

    public QrScannerResultViewModel_Factory(a<InterfaceC6083a> aVar, a<b> aVar2) {
        this.exchangerProvider = aVar;
        this.fintechNavigationProvider = aVar2;
    }

    public static QrScannerResultViewModel_Factory create(a<InterfaceC6083a> aVar, a<b> aVar2) {
        return new QrScannerResultViewModel_Factory(aVar, aVar2);
    }

    public static QrScannerResultViewModel newInstance(InterfaceC6083a interfaceC6083a, b bVar) {
        return new QrScannerResultViewModel(interfaceC6083a, bVar);
    }

    @Override // Pc.a
    public QrScannerResultViewModel get() {
        return newInstance(this.exchangerProvider.get(), this.fintechNavigationProvider.get());
    }
}
