package um0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f100837a;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f100837a = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @NotNull
    public final String a() {
        if (this.f100837a == null) {
            return "";
        }
        return String.valueOf((r0.getIntExtra("level", -1) * 100) / r0.getIntExtra("scale", -1));
    }
}
