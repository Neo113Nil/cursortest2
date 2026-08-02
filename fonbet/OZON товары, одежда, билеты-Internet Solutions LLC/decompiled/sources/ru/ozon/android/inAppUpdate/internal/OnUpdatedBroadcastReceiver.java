package ru.ozon.android.inAppUpdate.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ij.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.C8938a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/inAppUpdate/internal/OnUpdatedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OnUpdatedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context != null) {
            if (Intrinsics.d(intent != null ? intent.getAction() : null, "android.intent.action.MY_PACKAGE_REPLACED")) {
                int i11 = C8938a.f81237c;
                C8938a.b("Got intent with action android.intent.action.MY_PACKAGE_REPLACED. Clearing DownloadStore.");
                new d(context).a();
            }
        }
    }
}
