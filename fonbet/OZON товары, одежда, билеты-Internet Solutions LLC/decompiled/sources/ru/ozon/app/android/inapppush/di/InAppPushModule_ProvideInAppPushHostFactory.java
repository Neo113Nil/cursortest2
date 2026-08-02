package ru.ozon.app.android.inapppush.di;

import GZ.g;
import Jb.e;
import Jb.j;
import Ld0.c;
import We.B;
import We.InterfaceC4875q;
import ei0.InterfaceC6369b;
import java.util.List;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.domain.GetPageNameFromDeeplinkOrJsonUseCase;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class InAppPushModule_ProvideInAppPushHostFactory implements e<InAppPushHost> {
    public static InAppPushHost provideInAppPushHost(GetPageNameFromDeeplinkOrJsonUseCase getPageNameFromDeeplinkOrJsonUseCase, g gVar, FeatureChecker featureChecker, InterfaceC4875q interfaceC4875q, InterfaceC6369b interfaceC6369b, JsonParser jsonParser, NetworkComponentConfig networkComponentConfig, AppType appType, List<B> list, c cVar) {
        InAppPushHost provideInAppPushHost = InAppPushModule.INSTANCE.provideInAppPushHost(getPageNameFromDeeplinkOrJsonUseCase, gVar, featureChecker, interfaceC4875q, interfaceC6369b, jsonParser, networkComponentConfig, appType, list, cVar);
        j.d(provideInAppPushHost);
        return provideInAppPushHost;
    }
}
