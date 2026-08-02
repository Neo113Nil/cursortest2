package ru.ozon.app.android.utils;

import M4.c;
import M4.e;
import Mw.C3641a;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/utils/SoftInputChangeDelegate;", "", "", "fragmentSoftInputMode", "<init>", "(I)V", "LM4/c;", "savedStateRegistry", "restoreInputMode", "(LM4/c;)Ljava/lang/Integer;", "Landroid/app/Activity;", "activity", "", "setNewInputMode", "(Landroid/app/Activity;)V", "resetToDefaultInputMode", "LM4/e;", "owner", "register", "(Landroid/app/Activity;LM4/e;)V", "I", "oldSoftInputMode", "Ljava/lang/Integer;", "Companion", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SoftInputChangeDelegate {
    private final int fragmentSoftInputMode;
    private Integer oldSoftInputMode;

    public SoftInputChangeDelegate(int i11) {
        this.fragmentSoftInputMode = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle register$lambda$1(SoftInputChangeDelegate softInputChangeDelegate) {
        Bundle bundle = new Bundle();
        Integer num = softInputChangeDelegate.oldSoftInputMode;
        bundle.putInt("SOFT_INPUT_MODE_KEY", num != null ? num.intValue() : -1);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetToDefaultInputMode(Activity activity) {
        Integer num = this.oldSoftInputMode;
        if (num != null) {
            int intValue = num.intValue();
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(intValue);
            }
        }
    }

    private final Integer restoreInputMode(c savedStateRegistry) {
        Bundle b11 = savedStateRegistry.b("BUNDLE_SOFT_INPUT_MODE");
        if (b11 != null) {
            Integer valueOf = Integer.valueOf(b11.getInt("SOFT_INPUT_MODE_KEY"));
            if (valueOf.intValue() != -1) {
                return valueOf;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNewInputMode(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.setSoftInputMode(this.fragmentSoftInputMode);
        }
    }

    public final void register(@NotNull final Activity activity, @NotNull final e owner) {
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.utils.SoftInputChangeDelegate$register$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J ownerParam) {
                Intrinsics.checkNotNullParameter(ownerParam, "ownerParam");
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner2) {
                Intrinsics.checkNotNullParameter(owner2, "owner");
                SoftInputChangeDelegate.this.setNewInputMode(activity);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner2) {
                Intrinsics.checkNotNullParameter(owner2, "owner");
                SoftInputChangeDelegate.this.resetToDefaultInputMode(activity);
            }
        });
        c savedStateRegistry = owner.getSavedStateRegistry();
        Integer restoreInputMode = restoreInputMode(savedStateRegistry);
        if (restoreInputMode != null) {
            this.oldSoftInputMode = restoreInputMode;
        } else if (this.oldSoftInputMode == null) {
            Window window = activity.getWindow();
            this.oldSoftInputMode = (window == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        }
        savedStateRegistry.i("BUNDLE_SOFT_INPUT_MODE");
        savedStateRegistry.g("BUNDLE_SOFT_INPUT_MODE", new C3641a(this, 2));
    }
}
