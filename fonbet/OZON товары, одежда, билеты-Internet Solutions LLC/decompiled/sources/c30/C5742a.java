package c30;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5742a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f56446a;

    public C5742a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56446a = context;
    }

    public final int a() {
        Intent registerReceiver = this.f56446a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra == -1 || intExtra2 == -1) {
            return -1;
        }
        return (intExtra * 100) / intExtra2;
    }
}
