package Fj;

import android.os.PowerManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Fj.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1160f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3747b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final PowerManager.WakeLock f3748a;

    /* renamed from: Fj.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C1160f(PowerManager powerManager) {
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        this.f3748a = powerManager.isWakeLockLevelSupported(32) ? powerManager.newWakeLock(32, "talk_sdk:proximity_lock") : null;
    }

    public final void a() {
        PowerManager.WakeLock wakeLock = this.f3748a;
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        wakeLock.acquire();
    }

    public final void b() {
        PowerManager.WakeLock wakeLock = this.f3748a;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        wakeLock.release(1);
    }
}
