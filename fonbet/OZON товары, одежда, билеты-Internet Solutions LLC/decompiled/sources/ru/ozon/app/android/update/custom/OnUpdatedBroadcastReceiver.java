package ru.ozon.app.android.update.custom;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.update.InAppUpdateIntervalStorage;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/update/custom/OnUpdatedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnUpdatedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!Intrinsics.d(intent != null ? intent.getAction() : null, "android.intent.action.MY_PACKAGE_REPLACED") || context == null) {
            return;
        }
        if (InAppUpdateComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppUpdateComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, InAppUpdateComponentApi.class).getDependencyStorage();
        if (InAppUpdateComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppUpdateComponentApi is not DiComponent");
        }
        InAppUpdateIntervalStorage intervalStorage = ((InAppUpdateComponentApi) dependencyStorage.b(InAppUpdateComponentApi.class)).getIntervalStorage();
        if (intervalStorage != null) {
            intervalStorage.clear();
        }
    }
}
