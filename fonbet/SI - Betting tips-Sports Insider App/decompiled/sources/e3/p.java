package e3;

import android.app.Notification;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f8557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8558b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f8559c;

    public p(int i5, Notification notification, int i10) {
        this.f8557a = i5;
        this.f8559c = notification;
        this.f8558b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f8557a == pVar.f8557a && this.f8558b == pVar.f8558b) {
            return this.f8559c.equals(pVar.f8559c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8559c.hashCode() + (((this.f8557a * 31) + this.f8558b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f8557a + ", mForegroundServiceType=" + this.f8558b + ", mNotification=" + this.f8559c + '}';
    }
}
