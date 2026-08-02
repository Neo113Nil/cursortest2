package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import K00.a;
import We.E;
import android.app.Application;
import ru.ozon.app.android.composer.domain.api.ComposerJsonDeserializer;
import ru.ozon.app.android.composer.domain.api.ComposerJsonSerializer;
import ru.ozon.app.android.composer.domain.cache.ComposerCache;
import ru.ozon.app.android.composer.network.redirect.ComposerRedirectListener;
import ru.ozon.app.android.composer.tracker.ComposerNetworkMetricsProvider;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

/* loaded from: classes6.dex */
public final class ComposerNetworkModule_Companion_ProvideComposerNetworkFactory implements e<a> {
    public static a provideComposerNetwork(E e11, E e12, Application application, AppVersionStorage appVersionStorage, NetworkComponentConfig networkComponentConfig, FeatureService featureService, ComposerJsonSerializer composerJsonSerializer, ComposerJsonDeserializer composerJsonDeserializer, ComposerNetworkMetricsProvider composerNetworkMetricsProvider, ComposerRedirectListener composerRedirectListener, ComposerCache composerCache, GncOkHttpClientBuilder gncOkHttpClientBuilder) {
        a provideComposerNetwork = ComposerNetworkModule.INSTANCE.provideComposerNetwork(e11, e12, application, appVersionStorage, networkComponentConfig, featureService, composerJsonSerializer, composerJsonDeserializer, composerNetworkMetricsProvider, composerRedirectListener, composerCache, gncOkHttpClientBuilder);
        j.d(provideComposerNetwork);
        return provideComposerNetwork;
    }
}
