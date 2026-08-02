package ru.ozon.app.android.scanit.scanit;

import Jb.e;
import android.content.Context;

/* loaded from: classes13.dex */
public final class ScanItViewModel_Factory implements e<ScanItViewModel> {
    private final Pc.a<Context> contextProvider;
    private final Pc.a<ScanItApi> restApiProvider;

    public ScanItViewModel_Factory(Pc.a<Context> aVar, Pc.a<ScanItApi> aVar2) {
        this.contextProvider = aVar;
        this.restApiProvider = aVar2;
    }

    public static ScanItViewModel_Factory create(Pc.a<Context> aVar, Pc.a<ScanItApi> aVar2) {
        return new ScanItViewModel_Factory(aVar, aVar2);
    }

    public static ScanItViewModel newInstance(Context context, ScanItApi scanItApi) {
        return new ScanItViewModel(context, scanItApi);
    }

    @Override // Pc.a
    public ScanItViewModel get() {
        return newInstance(this.contextProvider.get(), this.restApiProvider.get());
    }
}
