package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gm8 {
    public final int a;
    public final int b;
    public final Notification c;

    public gm8(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gm8.class != obj.getClass()) {
            return false;
        }
        gm8 gm8Var = (gm8) obj;
        if (this.a == gm8Var.a && this.b == gm8Var.b) {
            return this.c.equals(gm8Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
