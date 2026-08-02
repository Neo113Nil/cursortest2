package ru.ozon.app.android.update.gp;

import C7.C2731a;
import C7.b;
import C7.c;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.update.InAppUpdateInfo;
import ru.ozon.app.android.update.InAppUpdateIntervalStorage;
import ru.ozon.app.android.update.InAppUpdateRepository;
import ru.ozon.app.android.update.InAppUpdateType;
import ru.ozon.app.android.update.analytics.InAppUpdateAnalyticsDelegate;
import ru.ozon.app.android.update.gp.GpInAppUpdateRepository;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/update/gp/GpInAppUpdateRepository;", "Lru/ozon/app/android/update/InAppUpdateRepository;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "inAppUpdateIntervalStorage", "Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;", "inAppUpdateAnalyticsDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/update/InAppUpdateIntervalStorage;Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;)V", "", "register", "()V", "unregister", "Lru/ozon/app/android/update/InAppUpdateInfo;", "getUpdateState", "()Lru/ozon/app/android/update/InAppUpdateInfo;", "Landroid/app/Activity;", "activity", "info", "startUpdate", "(Landroid/app/Activity;Lru/ozon/app/android/update/InAppUpdateInfo;)V", "Lru/ozon/app/android/update/InAppUpdateType;", "type", "completeUpdate", "(Lru/ozon/app/android/update/InAppUpdateType;)V", "", "requestCode", "resultCode", "handleResult", "(II)V", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;", "LC7/b;", "appUpdateManager", "LC7/b;", "LE7/b;", "inAppUpdateListener", "LE7/b;", "Companion", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GpInAppUpdateRepository extends InAppUpdateRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final b appUpdateManager;

    @NotNull
    private final InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate;

    @NotNull
    private final InAppUpdateIntervalStorage inAppUpdateIntervalStorage;

    @NotNull
    private final E7.b inAppUpdateListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/update/gp/GpInAppUpdateRepository$Companion;", "", "<init>", "()V", "GP_UPDATE_REQUEST_CODE", "", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpInAppUpdateRepository(@NotNull Context context, @NotNull InAppUpdateIntervalStorage inAppUpdateIntervalStorage, @NotNull InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppUpdateIntervalStorage, "inAppUpdateIntervalStorage");
        Intrinsics.checkNotNullParameter(inAppUpdateAnalyticsDelegate, "inAppUpdateAnalyticsDelegate");
        this.inAppUpdateIntervalStorage = inAppUpdateIntervalStorage;
        this.inAppUpdateAnalyticsDelegate = inAppUpdateAnalyticsDelegate;
        b a11 = c.a(context);
        Intrinsics.checkNotNullExpressionValue(a11, "create(...)");
        this.appUpdateManager = a11;
        this.inAppUpdateListener = new E7.b() { // from class: sY.a
            @Override // I7.a
            public final void a(InstallState installState) {
                GpInAppUpdateRepository.inAppUpdateListener$lambda$0(GpInAppUpdateRepository.this, installState);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inAppUpdateListener$lambda$0(GpInAppUpdateRepository gpInAppUpdateRepository, InstallState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.c() == 11) {
            gpInAppUpdateRepository.unregister();
            InAppUpdateRepository.InAppUpdateResultListener resultListener = gpInAppUpdateRepository.getResultListener();
            if (resultListener != null) {
                resultListener.onSuccess(InAppUpdateType.GP);
            }
        }
    }

    private final void register() {
        unregister();
        this.appUpdateManager.b(this.inAppUpdateListener);
    }

    private final void unregister() {
        this.appUpdateManager.a(this.inAppUpdateListener);
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void completeUpdate(@NotNull InAppUpdateType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == InAppUpdateType.GP) {
            this.appUpdateManager.d();
        } else if (getNext() != null) {
            getNext().completeUpdate(type);
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public InAppUpdateInfo getUpdateState() {
        Task<C2731a> c11 = this.appUpdateManager.c();
        Intrinsics.checkNotNullExpressionValue(c11, "getAppUpdateInfo(...)");
        C2731a c2731a = (C2731a) Tasks.await(c11);
        if (c2731a.c() == 2 && c2731a.a()) {
            return new GpInAppUpdateInfo(c2731a);
        }
        InAppUpdateRepository next = getNext();
        if (next != null) {
            return next.getUpdateState();
        }
        return null;
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void handleResult(int requestCode, int resultCode) {
        if (requestCode != 1820) {
            InAppUpdateRepository next = getNext();
            if (next != null) {
                next.handleResult(requestCode, resultCode);
                return;
            }
            return;
        }
        if (resultCode == -1) {
            InAppUpdateAnalyticsDelegate.track$default(this.inAppUpdateAnalyticsDelegate, ActionType.CLICK.INSTANCE, InAppUpdateType.GP, null, 4, null);
            this.inAppUpdateIntervalStorage.clear();
            return;
        }
        if (resultCode == 0) {
            InAppUpdateAnalyticsDelegate.track$default(this.inAppUpdateAnalyticsDelegate, ActionType.CLOSE.INSTANCE, InAppUpdateType.GP, null, 4, null);
            unregister();
        } else {
            if (resultCode != 1) {
                return;
            }
            unregister();
            InAppUpdateRepository.InAppUpdateResultListener resultListener = getResultListener();
            if (resultListener != null) {
                resultListener.onFailure(InAppUpdateType.GP);
            }
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void startUpdate(@NotNull Activity activity, @NotNull InAppUpdateInfo info) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        if (!(info instanceof GpInAppUpdateInfo)) {
            InAppUpdateRepository next = getNext();
            if (next != null) {
                next.startUpdate(activity, info);
                return;
            }
            return;
        }
        register();
        this.inAppUpdateIntervalStorage.nextInterval();
        InAppUpdateAnalyticsDelegate.track$default(this.inAppUpdateAnalyticsDelegate, ActionType.PAGE_VIEW.INSTANCE, InAppUpdateType.GP, null, 4, null);
        try {
            this.appUpdateManager.e(((GpInAppUpdateInfo) info).getInfo(), activity);
        } catch (IntentSender.SendIntentException unused) {
            unregister();
        }
    }
}
