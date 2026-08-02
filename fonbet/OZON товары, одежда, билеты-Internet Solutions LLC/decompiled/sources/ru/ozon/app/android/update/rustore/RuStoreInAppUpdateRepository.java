package ru.ozon.app.android.update.rustore;

import B90.C2621x;
import Sc.InterfaceC4008j;
import Sc.k;
import Ve.Bd;
import Ve.C4611s9;
import android.app.Activity;
import android.content.Context;
import jm0.e;
import jm0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import lm0.b;
import lm0.h;
import lm0.i;
import lm0.m;
import lm0.q;
import lm0.t;
import nm0.y;
import org.jetbrains.annotations.NotNull;
import rl0.C;
import rl0.C9291b;
import rl0.C9294e;
import rl0.C9295f;
import rl0.C9300k;
import rl0.C9308t;
import rl0.C9313y;
import rl0.C9314z;
import rl0.Y;
import rl0.c0;
import rl0.f0;
import rl0.i0;
import rl0.j0;
import rl0.k0;
import rl0.l0;
import rl0.r;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.RuStoreAppUpdateEnabledFlag;
import ru.ozon.app.android.update.InAppUpdateInfo;
import ru.ozon.app.android.update.InAppUpdateIntervalStorage;
import ru.ozon.app.android.update.InAppUpdateRepository;
import ru.ozon.app.android.update.InAppUpdateType;
import ru.ozon.app.android.update.analytics.InAppUpdateAnalyticsDelegate;
import ru.ozon.app.android.update.custom.CustomInAppUpdateRepository;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import sl0.InterfaceC9702a;
import tl0.InterfaceC9885a;
import ul0.C10067a;
import ul0.C10068b;
import wl0.c;
import yl0.C10923h;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/update/rustore/RuStoreInAppUpdateRepository;", "Lru/ozon/app/android/update/InAppUpdateRepository;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/update/custom/CustomInAppUpdateRepository;", "next", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "inAppUpdateIntervalStorage", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;", "inAppUpdateAnalyticsDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/update/custom/CustomInAppUpdateRepository;Lru/ozon/app/android/update/InAppUpdateIntervalStorage;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;)V", "", "register", "()V", "unregister", "Lru/ozon/app/android/update/InAppUpdateInfo;", "getUpdateState", "()Lru/ozon/app/android/update/InAppUpdateInfo;", "Landroid/app/Activity;", "activity", "info", "startUpdate", "(Landroid/app/Activity;Lru/ozon/app/android/update/InAppUpdateInfo;)V", "Lru/ozon/app/android/update/InAppUpdateType;", "type", "completeUpdate", "(Lru/ozon/app/android/update/InAppUpdateType;)V", "", "requestCode", "resultCode", "handleResult", "(II)V", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;", "Ltl0/a;", "appUpdateManager", "Ltl0/a;", "Lsl0/a;", "inAppUpdateListener$delegate", "LSc/j;", "getInAppUpdateListener", "()Lsl0/a;", "inAppUpdateListener", "Companion", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RuStoreInAppUpdateRepository extends InAppUpdateRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final InterfaceC9885a appUpdateManager;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate;

    @NotNull
    private final InAppUpdateIntervalStorage inAppUpdateIntervalStorage;

    /* renamed from: inAppUpdateListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j inAppUpdateListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/update/rustore/RuStoreInAppUpdateRepository$Companion;", "", "<init>", "()V", "RUSTORE_UPDATE_REQUEST_CODE", "", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuStoreInAppUpdateRepository(@NotNull Context context, @NotNull CustomInAppUpdateRepository next, @NotNull InAppUpdateIntervalStorage inAppUpdateIntervalStorage, @NotNull FeatureChecker featureChecker, @NotNull InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate) {
        super(next);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(inAppUpdateIntervalStorage, "inAppUpdateIntervalStorage");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(inAppUpdateAnalyticsDelegate, "inAppUpdateAnalyticsDelegate");
        this.inAppUpdateIntervalStorage = inAppUpdateIntervalStorage;
        this.featureChecker = featureChecker;
        this.inAppUpdateAnalyticsDelegate = inAppUpdateAnalyticsDelegate;
        Intrinsics.checkNotNullParameter(context, "context");
        C10067a source = new C10067a(context);
        Intrinsics.checkNotNullParameter(source, "source");
        i iVar = new i(source);
        int i11 = e.f70218e;
        q.a(t.a(iVar, e.c()), j.a(), C10068b.f100836b);
        this.appUpdateManager = new C9291b(context);
        this.inAppUpdateListener = k.b(new RuStoreInAppUpdateRepository$inAppUpdateListener$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void completeUpdate$lambda$2(RuStoreInAppUpdateRepository ruStoreInAppUpdateRepository, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InAppUpdateRepository.InAppUpdateResultListener resultListener = ruStoreInAppUpdateRepository.getResultListener();
        if (resultListener != null) {
            resultListener.onFailure(InAppUpdateType.RUSTORE);
        }
    }

    private final InterfaceC9702a getInAppUpdateListener() {
        return (InterfaceC9702a) this.inAppUpdateListener.getValue();
    }

    private final void register() {
        unregister();
        InterfaceC9885a interfaceC9885a = this.appUpdateManager;
        InterfaceC9702a listener = getInAppUpdateListener();
        C9291b c9291b = (C9291b) interfaceC9885a;
        c9291b.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c9291b.f83667b.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startUpdate$lambda$1(RuStoreInAppUpdateRepository ruStoreInAppUpdateRepository, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ruStoreInAppUpdateRepository.unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregister() {
        InterfaceC9885a interfaceC9885a = this.appUpdateManager;
        InterfaceC9702a listener = getInAppUpdateListener();
        C9291b c9291b = (C9291b) interfaceC9885a;
        c9291b.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c9291b.f83667b.remove(listener);
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void completeUpdate(@NotNull InAppUpdateType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type != InAppUpdateType.RUSTORE) {
            if (getNext() != null) {
                getNext().completeUpdate(type);
                return;
            }
            return;
        }
        InterfaceC9885a interfaceC9885a = this.appUpdateManager;
        AppUpdateOptions appUpdateOptions = new AppUpdateOptions.Builder().appUpdateType(1).build();
        C9291b c9291b = (C9291b) interfaceC9885a;
        c9291b.getClass();
        Intrinsics.checkNotNullParameter(appUpdateOptions, "appUpdateOptions");
        int appUpdateType = appUpdateOptions.getAppUpdateType();
        C9300k c9300k = c9291b.f83668c;
        c9300k.getClass();
        Bd source = new Bd(2, c9300k, new C9313y("updateStart.update", c9300k.a(appUpdateType)));
        Intrinsics.checkNotNullParameter(source, "source");
        i iVar = new i(source);
        int i11 = e.f70218e;
        q.a(t.a(iVar, e.c()), j.a(), C9294e.f83676b);
        Y y11 = (Y) c9291b.f83666a.getValue();
        y11.getClass();
        c0.a(t.a(h.a(y11.b(new f0(y11)), new l0(y11, appUpdateType)), e.c())).h(new Zl0.j(this));
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public InAppUpdateInfo getUpdateState() {
        InAppUpdateRepository next;
        if (!this.featureChecker.isEnabled(RuStoreAppUpdateEnabledFlag.INSTANCE)) {
            InAppUpdateRepository next2 = getNext();
            if (next2 != null) {
                return next2.getUpdateState();
            }
            return null;
        }
        try {
            Y y11 = (Y) ((C9291b) this.appUpdateManager).f83666a.getValue();
            y11.getClass();
            AbstractC7971a b11 = y11.b(new C9295f(y11));
            int i11 = e.f70218e;
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) c0.a(t.a(b11, e.c())).j();
            if (appUpdateInfo.getUpdateAvailability() == 2) {
                return new RuStoreInAppUpdateInfo(appUpdateInfo);
            }
            return null;
        } catch (Exception e11) {
            if (!(e11 instanceof c) || (next = getNext()) == null) {
                return null;
            }
            return next.getUpdateState();
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void handleResult(int requestCode, int resultCode) {
        if (requestCode != -1920) {
            InAppUpdateRepository next = getNext();
            if (next != null) {
                next.handleResult(requestCode, resultCode);
                return;
            }
            return;
        }
        if (resultCode == -1) {
            InAppUpdateAnalyticsDelegate.track$default(this.inAppUpdateAnalyticsDelegate, ActionType.CLICK.INSTANCE, InAppUpdateType.RUSTORE, null, 4, null);
            this.inAppUpdateIntervalStorage.clear();
        } else {
            if (resultCode != 0) {
                return;
            }
            InAppUpdateAnalyticsDelegate.track$default(this.inAppUpdateAnalyticsDelegate, ActionType.CLOSE.INSTANCE, InAppUpdateType.RUSTORE, null, 4, null);
            unregister();
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void startUpdate(@NotNull Activity activity, @NotNull InAppUpdateInfo info) {
        AbstractC7971a a11;
        int i11 = 1;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        if (!(info instanceof RuStoreInAppUpdateInfo)) {
            InAppUpdateRepository next = getNext();
            if (next != null) {
                next.startUpdate(activity, info);
                return;
            }
            return;
        }
        register();
        this.inAppUpdateIntervalStorage.nextInterval();
        InAppUpdateAnalyticsDelegate.track$default(this.inAppUpdateAnalyticsDelegate, ActionType.PAGE_VIEW.INSTANCE, InAppUpdateType.RUSTORE, null, 4, null);
        InterfaceC9885a interfaceC9885a = this.appUpdateManager;
        AppUpdateInfo appUpdateInfo = ((RuStoreInAppUpdateInfo) info).getInfo();
        AppUpdateOptions appUpdateOptions = new AppUpdateOptions.Builder().build();
        C9291b c9291b = (C9291b) interfaceC9885a;
        c9291b.getClass();
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        Intrinsics.checkNotNullParameter(appUpdateOptions, "appUpdateOptions");
        c9291b.f83669d = appUpdateOptions;
        int updateAvailability = appUpdateInfo.getUpdateAvailability();
        C9300k c9300k = c9291b.f83668c;
        if (updateAvailability != 2) {
            c9300k.b(appUpdateOptions.getAppUpdateType(), "update not available");
            i0 source = new i0();
            Intrinsics.checkNotNullParameter(source, "source");
            a11 = new b(source);
        } else if (appUpdateInfo.getIsUsed()) {
            c9300k.b(appUpdateOptions.getAppUpdateType(), "AppUpdateInfo object is already used. Call the method getAppUpdateInfo() again");
            j0 source2 = new j0();
            Intrinsics.checkNotNullParameter(source2, "source");
            a11 = new b(source2);
        } else {
            int appUpdateType = appUpdateOptions.getAppUpdateType();
            c9300k.getClass();
            C4611s9 source3 = new C4611s9(i11, c9300k, new C9313y("updateStart.request", c9300k.a(appUpdateType)));
            Intrinsics.checkNotNullParameter(source3, "source");
            i iVar = new i(source3);
            int i12 = e.f70218e;
            q.a(t.a(iVar, e.c()), j.a(), C9308t.f83716b);
            int appUpdateType2 = appUpdateOptions.getAppUpdateType();
            InterfaceC4008j interfaceC4008j = c9291b.f83666a;
            if (appUpdateType2 == 1) {
                Y y11 = (Y) interfaceC4008j.getValue();
                y11.getClass();
                Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
                r source4 = new r(y11, appUpdateInfo);
                Intrinsics.checkNotNullParameter(source4, "source");
                a11 = t.a(new b(source4), e.c());
            } else if (appUpdateType2 != 2) {
                Y y12 = (Y) interfaceC4008j.getValue();
                y12.getClass();
                Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
                a11 = t.a(h.a(y12.b(new y(y12, i11)), new C(y12, appUpdateInfo)), e.c());
            } else {
                Y y13 = (Y) interfaceC4008j.getValue();
                y13.getClass();
                Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
                a11 = m.a(t.a(y13.b(new C9314z(y13, appUpdateInfo)), e.c()), k0.f83694b);
            }
        }
        C10923h a12 = c0.a(a11);
        a12.i(new DL.a(this, 5));
        a12.h(new C2621x(this));
    }
}
