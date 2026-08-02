package w4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6702a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6703b f67397a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f67398b;

    public C6702a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67397a = InterfaceC6703b.f67399O4.a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f67398b = applicationContext;
    }

    public final void a() {
        this.f67397a = InterfaceC6703b.f67399O4.a();
        try {
            this.f67398b.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    public final void b(InterfaceC6703b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f67397a = listener;
        AbstractC5338c.registerReceiver(this.f67398b, this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 4);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !Intrinsics.areEqual("android.media.AUDIO_BECOMING_NOISY", intent.getAction())) {
            return;
        }
        this.f67397a.m();
    }
}
