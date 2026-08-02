package Q2;

import android.app.Notification;

/* renamed from: Q2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498i {

    /* renamed from: a, reason: collision with root package name */
    public final int f9286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9287b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f9288c;

    public C1498i(int i10, Notification notification, int i11) {
        this.f9286a = i10;
        this.f9288c = notification;
        this.f9287b = i11;
    }

    public int a() {
        return this.f9287b;
    }

    public Notification b() {
        return this.f9288c;
    }

    public int c() {
        return this.f9286a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1498i.class != obj.getClass()) {
            return false;
        }
        C1498i c1498i = (C1498i) obj;
        if (this.f9286a == c1498i.f9286a && this.f9287b == c1498i.f9287b) {
            return this.f9288c.equals(c1498i.f9288c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f9286a * 31) + this.f9287b) * 31) + this.f9288c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f9286a + ", mForegroundServiceType=" + this.f9287b + ", mNotification=" + this.f9288c + '}';
    }
}
