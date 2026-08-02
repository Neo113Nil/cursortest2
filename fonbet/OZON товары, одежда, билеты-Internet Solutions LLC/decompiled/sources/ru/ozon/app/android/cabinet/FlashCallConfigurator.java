package ru.ozon.app.android.cabinet;

import android.content.IntentFilter;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cabinet/FlashCallConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "Lru/ozon/app/android/cabinet/FlashCallBroadcastReceiver;", "flashCallBroadcastReceiver", "Lru/ozon/app/android/cabinet/FlashCallBroadcastReceiver;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlashCallConfigurator extends ComposerScreenConfig.PageConfigurator {
    private FlashCallBroadcastReceiver flashCallBroadcastReceiver;

    @NotNull
    private final IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 != null && PermissionExtensionsKt.isPermissionGranted(a11, "android.permission.READ_PHONE_STATE") && PermissionExtensionsKt.isPermissionGranted(a11, "android.permission.READ_CALL_LOG")) {
            FlashCallBroadcastReceiver flashCallBroadcastReceiver = new FlashCallBroadcastReceiver(new FlashCallConfigurator$onCreate$1$1(new I(), this));
            this.flashCallBroadcastReceiver = flashCallBroadcastReceiver;
            a11.registerReceiver(flashCallBroadcastReceiver, this.intentFilter);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        r a11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        FlashCallBroadcastReceiver flashCallBroadcastReceiver = this.flashCallBroadcastReceiver;
        if (flashCallBroadcastReceiver == null || (a11 = getContainer().a()) == null) {
            return;
        }
        a11.unregisterReceiver(flashCallBroadcastReceiver);
    }
}
