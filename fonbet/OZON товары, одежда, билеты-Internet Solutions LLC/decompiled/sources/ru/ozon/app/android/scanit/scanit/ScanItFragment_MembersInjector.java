package ru.ozon.app.android.scanit.scanit;

import GZ.g;

/* loaded from: classes13.dex */
public final class ScanItFragment_MembersInjector implements Ib.b<ScanItFragment> {
    public static void injectPViewModel(ScanItFragment scanItFragment, Pc.a<ScanItViewModel> aVar) {
        scanItFragment.pViewModel = aVar;
    }

    public static void injectScanItAnalytics(ScanItFragment scanItFragment, ScanItAnalytics scanItAnalytics) {
        scanItFragment.scanItAnalytics = scanItAnalytics;
    }

    public static void injectScreenRouter(ScanItFragment scanItFragment, g gVar) {
        scanItFragment.screenRouter = gVar;
    }
}
