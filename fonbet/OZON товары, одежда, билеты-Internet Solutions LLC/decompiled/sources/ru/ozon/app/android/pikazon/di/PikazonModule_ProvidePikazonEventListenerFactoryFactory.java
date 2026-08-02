package ru.ozon.app.android.pikazon.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.PikazonEventListenerInterceptor;
import ru.ozon.app.android.pikazon.performance.PikazonEventListenerFactory;

/* loaded from: classes7.dex */
public final class PikazonModule_ProvidePikazonEventListenerFactoryFactory implements e<PikazonEventListenerFactory> {
    public static PikazonEventListenerFactory providePikazonEventListenerFactory(PikazonModule pikazonModule, Context context, FeatureChecker featureChecker, PikazonEventListenerInterceptor pikazonEventListenerInterceptor) {
        PikazonEventListenerFactory providePikazonEventListenerFactory = pikazonModule.providePikazonEventListenerFactory(context, featureChecker, pikazonEventListenerInterceptor);
        j.d(providePikazonEventListenerFactory);
        return providePikazonEventListenerFactory;
    }
}
