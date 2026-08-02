package ru.ozon.app.android.network.websockets;

import Hc.AbstractC3137a;
import Nc.C3667a;
import Sc.o;
import android.app.Activity;
import android.os.Bundle;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.websockets.AppVisibility;
import sc.C9653a;
import zc.C11049k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0011R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00060\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00060\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/network/websockets/AppVisibilityImpl;", "Lru/ozon/app/android/network/websockets/AppVisibility;", "<init>", "()V", "", "emmitVisibility", "Lru/ozon/app/android/network/websockets/AppVisibility$State;", "state", "logState", "(Lru/ozon/app/android/network/websockets/AppVisibility$State;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "Lio/reactivex/p;", "observe", "()Lio/reactivex/p;", "onActivityPaused", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "onActivityResumed", "LNc/a;", "kotlin.jvm.PlatformType", "subject", "LNc/a;", "subscription", "Lio/reactivex/p;", "", "counter", "I", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppVisibilityImpl implements AppVisibility {
    private int counter;

    @NotNull
    private final C3667a<AppVisibility.State> subject;

    @NotNull
    private final p<AppVisibility.State> subscription;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppVisibility.State.values().length];
            try {
                iArr[AppVisibility.State.APP_FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppVisibility.State.APP_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppVisibilityImpl() {
        C3667a<AppVisibility.State> e11 = C3667a.e(AppVisibility.State.APP_BACKGROUND);
        Intrinsics.checkNotNullExpressionValue(e11, "createDefault(...)");
        this.subject = e11;
        AbstractC3137a<AppVisibility.State> replay = e11.doOnNext(new OJ.a(new AppVisibilityImpl$subscription$1(this), 1)).observeOn(Mc.a.b()).distinctUntilChanged().replay(1);
        replay.getClass();
        C11049k c11049k = new C11049k(replay, C9653a.g());
        Intrinsics.checkNotNullExpressionValue(c11049k, "autoConnect(...)");
        this.subscription = c11049k;
    }

    private final void emmitVisibility() {
        this.subject.onNext(this.counter > 0 ? AppVisibility.State.APP_FOREGROUND : AppVisibility.State.APP_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logState(AppVisibility.State state) {
        String str;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            str = "APP_VISIBILITY: Foreground";
        } else {
            if (i11 != 2) {
                throw new o();
            }
            str = "APP_VISIBILITY: Background";
        }
        Lm0.a.f17149a.d(str, new Object[0]);
    }

    @Override // ru.ozon.app.android.network.websockets.AppVisibility
    @NotNull
    public p<AppVisibility.State> observe() {
        return this.subscription;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.counter++;
        emmitVisibility();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.counter--;
        emmitVisibility();
    }
}
