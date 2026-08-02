package ru.ozon.app.android.messenger.initializer;

import We.E;
import android.content.Context;
import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.core.a;
import ru.ozon.android.messenger.framework.core.c;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.logger.b;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.bx.messenger.R$string;
import ru.ozon.app.android.messenger.flags.SnackbarForPushFlag;
import ru.ozon.app.android.messenger.utils.KeyboardVisibilityObserver;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.serialize.adapter.DateTimeTypeMoshiAdapter;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.MarkdownBlockFactory;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.TileScrollBlockFactory;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010P\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bU\u0010;R\u001a\u0010W\u001a\u00020V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lru/ozon/app/android/messenger/initializer/MessengerConfigImpl;", "Lru/ozon/android/messenger/framework/core/initialization/d;", "Landroid/content/Context;", "appContext", "LWe/E;", "okHttpClient", "Lru/ozon/android/messenger/framework/core/initialization/d$e;", "moshiAdapters", "Lru/ozon/android/messenger/framework/analytics/i;", "trackerAnalyticsAdapter", "Lru/ozon/android/messenger/framework/navigation/action/f;", "messengerExternalActionHandler", "Lru/ozon/android/messenger/framework/core/initialization/d$b;", "blockCustomSettings", "Lru/ozon/android/messenger/framework/core/initialization/d$f;", "networkConfig", "Lru/ozon/android/messenger/framework/logger/b;", "nonFatalLogger", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "ozonLoggerEnabled", "Lru/ozon/android/messenger/framework/core/initialization/d$c;", "composerDependencies", "isEdgeToEdgeEnabled", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/MarkdownBlockFactory;", "markdownBlockFactory", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/TileScrollBlockFactory;", "tileScrollBlockFactory", "<init>", "(Landroid/content/Context;LWe/E;Lru/ozon/android/messenger/framework/core/initialization/d$e;Lru/ozon/android/messenger/framework/analytics/i;Lru/ozon/android/messenger/framework/navigation/action/f;Lru/ozon/android/messenger/framework/core/initialization/d$b;Lru/ozon/android/messenger/framework/core/initialization/d$f;Lru/ozon/android/messenger/framework/logger/b;Lru/ozon/app/android/network/abtool/FeatureChecker;ZLru/ozon/android/messenger/framework/core/initialization/d$c;ZLru/ozon/app/android/storefrontcommonwidgets/core/messenger/MarkdownBlockFactory;Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/TileScrollBlockFactory;)V", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "LWe/E;", "getOkHttpClient", "()LWe/E;", "Lru/ozon/android/messenger/framework/core/initialization/d$e;", "getMoshiAdapters", "()Lru/ozon/android/messenger/framework/core/initialization/d$e;", "Lru/ozon/android/messenger/framework/analytics/i;", "getTrackerAnalyticsAdapter", "()Lru/ozon/android/messenger/framework/analytics/i;", "Lru/ozon/android/messenger/framework/navigation/action/f;", "getMessengerExternalActionHandler", "()Lru/ozon/android/messenger/framework/navigation/action/f;", "Lru/ozon/android/messenger/framework/core/initialization/d$b;", "getBlockCustomSettings", "()Lru/ozon/android/messenger/framework/core/initialization/d$b;", "setBlockCustomSettings", "(Lru/ozon/android/messenger/framework/core/initialization/d$b;)V", "Lru/ozon/android/messenger/framework/core/initialization/d$f;", "getNetworkConfig", "()Lru/ozon/android/messenger/framework/core/initialization/d$f;", "Lru/ozon/android/messenger/framework/logger/b;", "getNonFatalLogger", "()Lru/ozon/android/messenger/framework/logger/b;", "Z", "getOzonLoggerEnabled", "()Z", "Lru/ozon/android/messenger/framework/core/initialization/d$c;", "getComposerDependencies", "()Lru/ozon/android/messenger/framework/core/initialization/d$c;", "Lru/ozon/android/messenger/framework/core/initialization/d$d;", "messengerLifecycleCallback", "Lru/ozon/android/messenger/framework/core/initialization/d$d;", "getMessengerLifecycleCallback", "()Lru/ozon/android/messenger/framework/core/initialization/d$d;", "", "Lru/ozon/android/messenger/framework/core/a;", "blocks", "Ljava/util/Set;", "getBlocks", "()Ljava/util/Set;", "Lru/ozon/android/messenger/framework/core/initialization/d$g;", "unreadMsgCountChangedListener", "Lru/ozon/android/messenger/framework/core/initialization/d$g;", "getUnreadMsgCountChangedListener", "()Lru/ozon/android/messenger/framework/core/initialization/d$g;", "Lru/ozon/android/messenger/framework/core/c;", "featureProvider", "Lru/ozon/android/messenger/framework/core/c;", "getFeatureProvider", "()Lru/ozon/android/messenger/framework/core/c;", "enabledInsets", "getEnabledInsets", "Lru/ozon/android/messenger/framework/core/initialization/d$a;", "aiAssistantCustomSettings", "Lru/ozon/android/messenger/framework/core/initialization/d$a;", "getAiAssistantCustomSettings", "()Lru/ozon/android/messenger/framework/core/initialization/d$a;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerConfigImpl implements d {

    @NotNull
    private final d.a aiAssistantCustomSettings;

    @NotNull
    private final Context appContext;

    @NotNull
    private d.b blockCustomSettings;

    @NotNull
    private final Set<a> blocks;

    @NotNull
    private final d.c composerDependencies;
    private final boolean enabledInsets;

    @NotNull
    private final c featureProvider;

    @NotNull
    private final f messengerExternalActionHandler;

    @NotNull
    private final d.InterfaceC1560d messengerLifecycleCallback;

    @NotNull
    private final d.e moshiAdapters;

    @NotNull
    private final d.f networkConfig;
    private final b nonFatalLogger;

    @NotNull
    private final E okHttpClient;
    private final boolean ozonLoggerEnabled;

    @NotNull
    private final i trackerAnalyticsAdapter;

    @NotNull
    private final d.g unreadMsgCountChangedListener;

    public MessengerConfigImpl(@NotNull Context appContext, @NotNull E okHttpClient, @NotNull d.e moshiAdapters, @NotNull i trackerAnalyticsAdapter, @NotNull f messengerExternalActionHandler, @NotNull d.b blockCustomSettings, @NotNull d.f networkConfig, b bVar, @NotNull FeatureChecker featureChecker, boolean z11, @NotNull d.c composerDependencies, final boolean z12, @NotNull MarkdownBlockFactory markdownBlockFactory, @NotNull TileScrollBlockFactory tileScrollBlockFactory) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(moshiAdapters, "moshiAdapters");
        Intrinsics.checkNotNullParameter(trackerAnalyticsAdapter, "trackerAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(messengerExternalActionHandler, "messengerExternalActionHandler");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerDependencies, "composerDependencies");
        Intrinsics.checkNotNullParameter(markdownBlockFactory, "markdownBlockFactory");
        Intrinsics.checkNotNullParameter(tileScrollBlockFactory, "tileScrollBlockFactory");
        this.appContext = appContext;
        this.okHttpClient = okHttpClient;
        this.moshiAdapters = moshiAdapters;
        this.trackerAnalyticsAdapter = trackerAnalyticsAdapter;
        this.messengerExternalActionHandler = messengerExternalActionHandler;
        this.blockCustomSettings = blockCustomSettings;
        this.networkConfig = networkConfig;
        this.nonFatalLogger = bVar;
        this.ozonLoggerEnabled = z11;
        this.composerDependencies = composerDependencies;
        this.messengerLifecycleCallback = new d.InterfaceC1560d() { // from class: ru.ozon.app.android.messenger.initializer.MessengerConfigImpl$messengerLifecycleCallback$1
            @Override // ru.ozon.android.messenger.framework.core.initialization.d.InterfaceC1560d
            public void onCreate(ComponentCallbacksC5392m messengerFragment) {
                Intrinsics.checkNotNullParameter(messengerFragment, "messengerFragment");
                if (!z12) {
                    FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, messengerFragment, false, 0L, 6, null);
                    Unit unit = Unit.f71690a;
                    return;
                }
                M activity = messengerFragment.getActivity();
                BottomNavigationStateController bottomNavigationStateController = activity instanceof BottomNavigationStateController ? (BottomNavigationStateController) activity : null;
                if (bottomNavigationStateController == null) {
                    return;
                }
                new KeyboardVisibilityObserver(messengerFragment, new MessengerConfigImpl$messengerLifecycleCallback$1$onCreate$1(bottomNavigationStateController));
            }
        };
        a[] elements = {tileScrollBlockFactory.create(), markdownBlockFactory.create(getTrackerAnalyticsAdapter())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.blocks = C7705l.j0(elements);
        this.unreadMsgCountChangedListener = new d.g() { // from class: ru.ozon.app.android.messenger.initializer.MessengerConfigImpl$unreadMsgCountChangedListener$1
            @Override // ru.ozon.android.messenger.framework.core.initialization.d.g
            public void onChanged() {
            }
        };
        SnackbarForPushFlag snackbarForPushFlag = SnackbarForPushFlag.INSTANCE;
        this.featureProvider = new c(U.i(new Pair(snackbarForPushFlag.getFeatureName(), Boolean.valueOf(featureChecker.isEnabled(snackbarForPushFlag)))));
        this.enabledInsets = z12;
        UniTheme uniTheme = UniTheme.INSTANCE;
        this.aiAssistantCustomSettings = new d.a(uniTheme.getColorTokens().getLayerFloor1().getId(), new d.a.C1558a(new C9915y(uniTheme.getPaddings().getPadding400(), uniTheme.getPaddings().getPadding300(), uniTheme.getPaddings().getPadding400(), uniTheme.getPaddings().getPadding400()), new d.a.C1558a.C1559a(uniTheme.getRadii().getRadius550(), uniTheme.getRadii().getRadius550(), uniTheme.getRadii().getRadius550(), uniTheme.getRadii().getRadius200()), uniTheme.getColorTokens().getBgOpaqueActionSecondary().getId()), StringProvider.getString(R$string.default_header_title), StringProvider.getString(R$string.default_header_subtitle), ComposableSingletons$MessengerConfigImplKt.INSTANCE.m804getLambda1$messenger_prodGoogleAllVendorsRelease());
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public d.a getAiAssistantCustomSettings() {
        return this.aiAssistantCustomSettings;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public Context getAppContext() {
        return this.appContext;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public d.b getBlockCustomSettings() {
        return this.blockCustomSettings;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public Set<a> getBlocks() {
        return this.blocks;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public d.c getComposerDependencies() {
        return this.composerDependencies;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    public boolean getEnabledInsets() {
        return this.enabledInsets;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public c getFeatureProvider() {
        return this.featureProvider;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public f getMessengerExternalActionHandler() {
        return this.messengerExternalActionHandler;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public d.InterfaceC1560d getMessengerLifecycleCallback() {
        return this.messengerLifecycleCallback;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public d.e getMoshiAdapters() {
        return this.moshiAdapters;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public d.f getNetworkConfig() {
        return this.networkConfig;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    public b getNonFatalLogger() {
        return this.nonFatalLogger;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public E getOkHttpClient() {
        return this.okHttpClient;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    public boolean getOzonLoggerEnabled() {
        return this.ozonLoggerEnabled;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public i getTrackerAnalyticsAdapter() {
        return this.trackerAnalyticsAdapter;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.d
    @NotNull
    public d.g getUnreadMsgCountChangedListener() {
        return this.unreadMsgCountChangedListener;
    }

    public /* synthetic */ MessengerConfigImpl(Context context, E e11, d.e eVar, i iVar, f fVar, d.b bVar, d.f fVar2, b bVar2, FeatureChecker featureChecker, boolean z11, d.c cVar, boolean z12, MarkdownBlockFactory markdownBlockFactory, TileScrollBlockFactory tileScrollBlockFactory, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, e11, (i11 & 4) != 0 ? new d.e(C7714v.a0(new DateTimeTypeMoshiAdapter())) : eVar, iVar, fVar, bVar, fVar2, bVar2, featureChecker, z11, cVar, z12, markdownBlockFactory, tileScrollBlockFactory);
    }
}
