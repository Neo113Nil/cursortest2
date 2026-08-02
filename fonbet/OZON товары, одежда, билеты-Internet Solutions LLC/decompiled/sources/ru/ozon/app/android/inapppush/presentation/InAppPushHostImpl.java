package ru.ozon.app.android.inapppush.presentation;

import Ad0.a;
import Fb0.e;
import GZ.g;
import Ld0.c;
import Sc.o;
import We.B;
import We.InterfaceC4875q;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.lifecycle.J;
import i10.h;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.inapppush.InAppPushConfig;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.domain.GetPageNameFromDeeplinkOrJsonUseCase;
import ru.ozon.app.android.inapppush.presentation.page.Page;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import zd0.C11110a;
import zd0.b;
import zd0.c;
import zd0.f;
import zd0.g;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b%\u0010&J1\u0010'\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u00100\u001a\u00020/*\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u0004\u0018\u000102*\u00020\u000fH\u0002¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u00020\"2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J1\u0010>\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b>\u0010?J1\u0010>\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u00152\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b>\u0010AJ\u0017\u0010B\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u0015H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010B\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010HR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010IR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR0\u0010R\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020P0Oj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020P`Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lru/ozon/app/android/inapppush/presentation/InAppPushHostImpl;", "Lru/ozon/app/android/inapppush/InAppPushHost;", "Lru/ozon/app/android/inapppush/domain/GetPageNameFromDeeplinkOrJsonUseCase;", "getPageName", "LGZ/g;", "router", "LWe/q;", "cookieJar", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "", "LWe/B;", "mainInterceptors", "Lru/ozon/app/android/inapppush/presentation/InAppPushAnalyticsManager;", "analyticsManager", "Lru/ozon/app/android/utils/AppType;", "appType", "LLd0/c;", "diStore", "<init>", "(Lru/ozon/app/android/inapppush/domain/GetPageNameFromDeeplinkOrJsonUseCase;LGZ/g;LWe/q;Lru/ozon/app/android/network/di/NetworkComponentConfig;Ljava/util/List;Lru/ozon/app/android/inapppush/presentation/InAppPushAnalyticsManager;Lru/ozon/app/android/utils/AppType;LLd0/c;)V", "Li10/h$c;", "", "toDeeplinkOrJson", "(Li10/h$c;)Ljava/lang/String;", "pageName", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroid/widget/FrameLayout;", "container", "", "isDialog", "", "delayMs", "", "handlePage", "(Ljava/lang/String;Landroidx/lifecycle/J;Landroid/widget/FrameLayout;ZLjava/lang/Long;)V", "trackPage", "(Ljava/lang/String;ZLjava/lang/Long;)V", "receiveInAppPushInternal", "(Ljava/lang/String;Landroidx/lifecycle/J;Landroid/widget/FrameLayout;Ljava/lang/Long;)V", "onPageViewDestroyedInternal", "(Ljava/lang/String;)V", "Lzd0/a$b;", "getBuildType", "()Lzd0/a$b;", "LFb0/e;", "Lzd0/f$a;", "toInAppPushSdkDomain", "(LFb0/e;)Lzd0/f$a;", "Lzd0/a$a;", "toApplicationName", "(Lru/ozon/app/android/utils/AppType;)Lzd0/a$a;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/inapppush/InAppPushConfig;", "inAppPushConfig", "initInAppPushSdk", "(Landroid/content/Context;Lru/ozon/app/android/inapppush/InAppPushConfig;)V", "pageUrl", "Landroidx/fragment/app/m;", "fragment", "receiveInAppPush", "(Ljava/lang/String;Landroidx/fragment/app/m;Landroid/widget/FrameLayout;Ljava/lang/Long;)V", "pageRef", "(Li10/h$c;Landroidx/fragment/app/m;Landroid/widget/FrameLayout;Ljava/lang/Long;)V", "onPageViewDestroyed", "(Li10/h$c;)V", "Lru/ozon/app/android/inapppush/domain/GetPageNameFromDeeplinkOrJsonUseCase;", "LGZ/g;", "LWe/q;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "Ljava/util/List;", "Lru/ozon/app/android/inapppush/presentation/InAppPushAnalyticsManager;", "Lru/ozon/app/android/utils/AppType;", "LLd0/c;", "LAd0/a;", "inAppPushSdk", "LAd0/a;", "Ljava/util/LinkedHashMap;", "Lru/ozon/app/android/inapppush/presentation/page/Page;", "Lkotlin/collections/LinkedHashMap;", "pageStorage", "Ljava/util/LinkedHashMap;", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppPushHostImpl implements InAppPushHost {

    @NotNull
    private final InAppPushAnalyticsManager analyticsManager;

    @NotNull
    private final AppType appType;

    @NotNull
    private final InterfaceC4875q cookieJar;

    @NotNull
    private final c diStore;

    @NotNull
    private final GetPageNameFromDeeplinkOrJsonUseCase getPageName;
    private a inAppPushSdk;

    @NotNull
    private final List<B> mainInterceptors;

    @NotNull
    private final NetworkComponentConfig networkComponentConfig;

    @NotNull
    private final LinkedHashMap<String, Page> pageStorage;

    @NotNull
    private final g router;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.OZON_RU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.OZONRU_CN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.OZONRU_ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.OZONRUCN_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppType.values().length];
            try {
                iArr2[AppType.f94580BX.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AppType.SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AppType.TRAVEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AppType.FRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InAppPushHostImpl(@NotNull GetPageNameFromDeeplinkOrJsonUseCase getPageName, @NotNull g router, @NotNull InterfaceC4875q cookieJar, @NotNull NetworkComponentConfig networkComponentConfig, @NotNull List<? extends B> mainInterceptors, @NotNull InAppPushAnalyticsManager analyticsManager, @NotNull AppType appType, @NotNull c diStore) {
        Intrinsics.checkNotNullParameter(getPageName, "getPageName");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
        Intrinsics.checkNotNullParameter(mainInterceptors, "mainInterceptors");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.getPageName = getPageName;
        this.router = router;
        this.cookieJar = cookieJar;
        this.networkComponentConfig = networkComponentConfig;
        this.mainInterceptors = mainInterceptors;
        this.analyticsManager = analyticsManager;
        this.appType = appType;
        this.diStore = diStore;
        this.pageStorage = new LinkedHashMap<>();
    }

    private final C11110a.b getBuildType() {
        return BuildUtils.INSTANCE.isQaFlavor() ? C11110a.b.f108858QA : C11110a.b.PROD;
    }

    private final void handlePage(String pageName, J lifecycleOwner, FrameLayout container, boolean isDialog, Long delayMs) {
        if (!isDialog) {
            receiveInAppPushInternal(pageName, lifecycleOwner, container, delayMs);
        }
        trackPage(pageName, isDialog, delayMs);
    }

    private final void onPageViewDestroyedInternal(String pageName) {
        this.pageStorage.remove(pageName);
        Collection<Page> values = this.pageStorage.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Page page = (Page) C7714v.Y(values);
        if (page == null || page.getIsDialog() || !page.getIsPaused()) {
            return;
        }
        page.setPaused(false);
        a aVar = this.inAppPushSdk;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ru.ozon.app.android.inapppush.presentation.InAppPushHostImpl$receiveInAppPushInternal$1] */
    private final void receiveInAppPushInternal(String pageName, J lifecycleOwner, FrameLayout container, Long delayMs) {
        a aVar = this.inAppPushSdk;
        if (aVar != 0) {
            aVar.b(new g.a(pageName).a(), lifecycleOwner, container, delayMs, new InAppPushListener() { // from class: ru.ozon.app.android.inapppush.presentation.InAppPushHostImpl$receiveInAppPushInternal$1
                @Override // zd0.c
                public void onClick(c.b action) {
                    InAppPushAnalyticsManager inAppPushAnalyticsManager;
                    GZ.g gVar;
                    Intrinsics.checkNotNullParameter(action, "action");
                    inAppPushAnalyticsManager = InAppPushHostImpl.this.analyticsManager;
                    inAppPushAnalyticsManager.trackCLick(action.b());
                    gVar = InAppPushHostImpl.this.router;
                    g.a.a(gVar, action.a(), null, null, 6);
                }

                @Override // zd0.c
                public void onShow(Map<String, c.C2348c> trackingInfo) {
                    InAppPushAnalyticsManager inAppPushAnalyticsManager;
                    Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
                    inAppPushAnalyticsManager = InAppPushHostImpl.this.analyticsManager;
                    inAppPushAnalyticsManager.trackShow(trackingInfo);
                }
            });
        }
    }

    private final C11110a.EnumC2347a toApplicationName(AppType appType) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[appType.ordinal()];
        if (i11 == 1) {
            return C11110a.EnumC2347a.f108855BX;
        }
        if (i11 == 2) {
            return C11110a.EnumC2347a.SELECT;
        }
        if (i11 == 3) {
            return C11110a.EnumC2347a.TRAVEL;
        }
        if (i11 == 4) {
            return C11110a.EnumC2347a.FRESH;
        }
        throw new o();
    }

    private final String toDeeplinkOrJson(h.c cVar) {
        if (cVar instanceof h.c.a) {
            return ((h.c.a) cVar).f();
        }
        if (cVar instanceof h.c.b) {
            return ((h.c.b) cVar).a();
        }
        throw new o();
    }

    private final f.a toInAppPushSdkDomain(e eVar) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i11 == 1) {
            return f.a.OZON_RU;
        }
        if (i11 == 2) {
            return f.a.OZONRU_CN;
        }
        if (i11 == 3) {
            return f.a.OZONRU_ME;
        }
        if (i11 == 4) {
            return f.a.OZONRUCN_ME;
        }
        throw new o();
    }

    private final void trackPage(String pageName, boolean isDialog, Long delayMs) {
        if (isDialog) {
            a aVar = this.inAppPushSdk;
            if (aVar != null) {
                aVar.a();
            }
            Collection<Page> values = this.pageStorage.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Page page = (Page) C7714v.Y(values);
            if (page != null) {
                page.setPaused(true);
            }
        }
        this.pageStorage.put(pageName, new Page(pageName, isDialog, delayMs, false, 8, null));
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void initInAppPushSdk(@NotNull Context context, @NotNull InAppPushConfig inAppPushConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppPushConfig, "inAppPushConfig");
        if (this.inAppPushSdk != null) {
            return;
        }
        C11110a.b buildType = getBuildType();
        C11110a.EnumC2347a applicationName = toApplicationName(this.appType);
        if (applicationName == null) {
            return;
        }
        C11110a a11 = new C11110a.c(buildType, applicationName).a();
        f.b bVar = new f.b(toInAppPushSdkDomain(this.networkComponentConfig.getAppDomain()), this.cookieJar);
        bVar.a(this.mainInterceptors);
        b.a aVar = new b.a(context, a11, bVar.b());
        aVar.e(this.diStore);
        Long delayAfterInitSdk = inAppPushConfig.getDelayAfterInitSdk();
        if (delayAfterInitSdk != null) {
            aVar.d(delayAfterInitSdk.longValue());
        }
        Long pollingInterval = inAppPushConfig.getPollingInterval();
        if (pollingInterval != null) {
            aVar.b(pollingInterval.longValue());
        }
        Long delayAfterScreenOpen = inAppPushConfig.getDelayAfterScreenOpen();
        if (delayAfterScreenOpen != null) {
            aVar.c(delayAfterScreenOpen.longValue());
        }
        this.inAppPushSdk = new a(aVar.a());
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void onPageViewDestroyed(@NotNull h.c pageRef) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        onPageViewDestroyedInternal(this.getPageName.invoke(toDeeplinkOrJson(pageRef)));
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void receiveInAppPush(@NotNull String pageUrl, @NotNull ComponentCallbacksC5392m fragment, @NotNull FrameLayout container, Long delayMs) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        handlePage(this.getPageName.invoke(pageUrl), fragment, container, fragment.getParentFragment() instanceof DialogInterfaceOnCancelListenerC5390k, delayMs);
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void onPageViewDestroyed(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        onPageViewDestroyedInternal(this.getPageName.invoke(pageUrl));
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void receiveInAppPush(@NotNull h.c pageRef, @NotNull ComponentCallbacksC5392m fragment, @NotNull FrameLayout container, Long delayMs) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        handlePage(this.getPageName.invoke(toDeeplinkOrJson(pageRef)), fragment, container, fragment.getParentFragment() instanceof DialogInterfaceOnCancelListenerC5390k, delayMs);
    }
}
