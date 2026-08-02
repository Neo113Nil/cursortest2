package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.p1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class zzav extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.core.internal.gestures.c f4127a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(Handler handler, io.sentry.android.core.internal.gestures.c cVar) {
        super(handler);
        this.f4127a = cVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        int i10 = p1.f5547a;
        j it = bundle == null ? new j(0, null) : new j(bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
        yb.i iVar = (yb.i) this.f4127a.f15641b;
        Intrinsics.checkNotNullParameter(it, "it");
        iVar.e(it.f4033a, "OnServiceShowInAppMessages", it.f4034b);
    }
}
