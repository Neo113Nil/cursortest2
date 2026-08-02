package c0;

import android.app.Notification;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f3306b;

    @Override // c0.x
    public final void g(com.google.firebase.messaging.x xVar) {
        new Notification.BigTextStyle((Notification.Builder) xVar.f6183b).setBigContentTitle(null).bigText(this.f3306b);
    }

    @Override // c0.x
    public final String h() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
