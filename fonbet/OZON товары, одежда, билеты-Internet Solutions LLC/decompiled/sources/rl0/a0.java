package rl0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.InstallState;

/* loaded from: classes8.dex */
public final class a0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Z f83665a;

    public a0(@NotNull Z installStateProvider) {
        Intrinsics.checkNotNullParameter(installStateProvider, "installStateProvider");
        this.f83665a = installStateProvider;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        InstallState state;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || (state = InstallState.INSTANCE.of$sdk_public_appupdate_release(extras)) == null) {
            return;
        }
        Z z11 = this.f83665a;
        z11.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        z11.f83662a.b(state);
    }
}
