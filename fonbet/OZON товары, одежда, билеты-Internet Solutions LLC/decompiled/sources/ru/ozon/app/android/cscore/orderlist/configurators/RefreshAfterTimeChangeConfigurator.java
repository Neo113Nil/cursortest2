package ru.ozon.app.android.cscore.orderlist.configurators;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cscore/orderlist/configurators/RefreshAfterTimeChangeConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroid/content/Context;", "getContext", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;)Landroid/content/Context;", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "onStop", "onDestroy", "Lru/ozon/app/android/cscore/orderlist/configurators/OnTimeChangeReciever;", "timeChangeBroadcastReceiver", "Lru/ozon/app/android/cscore/orderlist/configurators/OnTimeChangeReciever;", "Lkotlin/Function0;", "onTimeUpdated", "Lkotlin/jvm/functions/Function0;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshAfterTimeChangeConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final OnTimeChangeReciever timeChangeBroadcastReceiver = new OnTimeChangeReciever();

    @NotNull
    private final Function0<Unit> onTimeUpdated = new RefreshAfterTimeChangeConfigurator$onTimeUpdated$1(this);

    private final Context getContext(ComposerScreenConfig.PageConfigurator pageConfigurator) {
        ComponentCallbacksC5392m c11 = pageConfigurator.getContainer().c();
        if (c11 != null) {
            return c11.requireContext();
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Context context = getContext(this);
        if (context == null) {
            return;
        }
        a.registerReceiver(context, this.timeChangeBroadcastReceiver, new IntentFilter("android.intent.action.TIME_SET"), 2);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Context context = getContext(this);
        if (context != null) {
            context.unregisterReceiver(this.timeChangeBroadcastReceiver);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.timeChangeBroadcastReceiver.setOnTimeUpdated(this.onTimeUpdated);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.timeChangeBroadcastReceiver.setOnTimeUpdated(null);
    }
}
