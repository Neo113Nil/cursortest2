package c0;

import android.content.ComponentName;
import android.os.PowerManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final PowerManager.WakeLock f3275a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f3276b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3277c;

    public j(o oVar, ComponentName componentName) {
        oVar.getApplicationContext();
        PowerManager powerManager = (PowerManager) oVar.getSystemService("power");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f3275a = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f3276b = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f3277c) {
                    this.f3277c = false;
                    this.f3276b.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this) {
        }
    }
}
