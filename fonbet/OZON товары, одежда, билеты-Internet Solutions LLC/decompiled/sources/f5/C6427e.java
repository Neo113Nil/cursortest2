package f5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6427e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC6428f<Object> f62734a;

    C6427e(AbstractC6428f<Object> abstractC6428f) {
        this.f62734a = abstractC6428f;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f62734a.j(intent);
    }
}
