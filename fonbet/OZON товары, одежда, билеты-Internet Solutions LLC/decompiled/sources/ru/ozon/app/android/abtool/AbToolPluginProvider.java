package ru.ozon.app.android.abtool;

import Ld0.c;
import Ld0.f;
import Od0.a;
import Od0.b;
import Od0.e;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.di.DiStoreWrapper;
import ru.ozon.app.android.abtool.presentation.AbToolDebugMenu;
import ru.ozon.app.android.abtool.utils.LimbExtKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001b\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/abtool/AbToolPluginProvider;", "LOd0/e;", "Lru/ozon/app/android/abtool/AbToolBaseApi;", "LOd0/b;", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "featureServiceConfig", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;)V", "LLd0/c;", "diStore", "", "onDiStoreCreated", "(LLd0/c;)V", "store", "create", "(LLd0/c;)Lru/ozon/app/android/abtool/AbToolBaseApi;", "", "LLd0/f;", "createPluginProviderIntegration", "(LLd0/c;)Ljava/util/List;", "LOd0/c;", "deeplink", "", "canHandle", "(LOd0/c;)Z", "LOd0/e$b;", "LOd0/e$a;", "handleDeeplink", "(LLd0/c;LOd0/e$b;)LOd0/e$a;", "Landroid/content/Context;", "activityContext", "LOd0/a;", "(LLd0/c;LOd0/c;Landroid/content/Context;)LOd0/a;", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "Lru/ozon/app/android/abtool/AbToolDeeplinkHandler;", "deeplinkHandler$delegate", "LSc/j;", "getDeeplinkHandler", "()Lru/ozon/app/android/abtool/AbToolDeeplinkHandler;", "deeplinkHandler", "Ljava/lang/Class;", "key", "Ljava/lang/Class;", "getKey", "()Ljava/lang/Class;", "", "libraryVersion", "Ljava/lang/String;", "getLibraryVersion", "()Ljava/lang/String;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolPluginProvider extends e<AbToolBaseApi> implements b {

    /* renamed from: deeplinkHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j deeplinkHandler;

    @NotNull
    private final FeatureServiceConfig featureServiceConfig;

    @NotNull
    private final Class<? extends AbToolBaseApi> key;

    @NotNull
    private final String libraryVersion;

    public AbToolPluginProvider(@NotNull FeatureServiceConfig featureServiceConfig) {
        Intrinsics.checkNotNullParameter(featureServiceConfig, "featureServiceConfig");
        this.featureServiceConfig = featureServiceConfig;
        this.deeplinkHandler = k.b(new AbToolPluginProvider$deeplinkHandler$2(this));
        this.key = AbToolBaseApi.class;
        this.libraryVersion = "4.9.2";
    }

    private final AbToolDeeplinkHandler getDeeplinkHandler() {
        return (AbToolDeeplinkHandler) this.deeplinkHandler.getValue();
    }

    @Override // Od0.b
    public void beforeHandleDeeplink(@NotNull c store, @NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // Od0.b
    public boolean canHandle(@NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return getDeeplinkHandler().canHandle(deeplink);
    }

    @Override // Od0.d
    @NotNull
    public List<f> createPluginProviderIntegration(@NotNull c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        return C7714v.a0(new AbToolDebugMenu(diStore));
    }

    @Override // Od0.d
    @NotNull
    public Class<? extends AbToolBaseApi> getKey() {
        return this.key;
    }

    @Override // Od0.e
    @InterfaceC3999a
    public e.a handleDeeplink(c store, e.b deeplink) {
        Uri a11;
        e.a handleLegacy;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Od0.c ozonLimbDeeplink = LimbExtKt.toOzonLimbDeeplink(deeplink);
        if (ozonLimbDeeplink != null) {
            if (!canHandle(ozonLimbDeeplink)) {
                ozonLimbDeeplink = null;
            }
            if (ozonLimbDeeplink != null && (a11 = ozonLimbDeeplink.a()) != null && (handleLegacy = getDeeplinkHandler().handleLegacy(store, a11)) != null) {
                return handleLegacy;
            }
        }
        return new e.a.c();
    }

    @Override // Od0.d
    public void onDiStoreCreated(@NotNull c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        DiStoreWrapper.INSTANCE.init(diStore, this.featureServiceConfig);
    }

    @Override // Od0.d
    @NotNull
    public AbToolBaseApi create(@NotNull c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new AbToolImpl(this.featureServiceConfig, store);
    }

    @Override // Od0.b
    @NotNull
    public a handleDeeplink(@NotNull c store, @NotNull Od0.c deeplink, @NotNull Context activityContext) {
        a handle;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Uri a11 = deeplink.a();
        return (a11 == null || (handle = getDeeplinkHandler().handle(store, a11, activityContext)) == null) ? new a.c() : handle;
    }
}
