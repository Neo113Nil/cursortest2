package com.braze.dispatch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.coroutine.BrazeCoroutineScope;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f497a;

    public d(f fVar) {
        this.f497a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new c(this.f497a, intent, goAsync(), null), 3, null);
    }
}
