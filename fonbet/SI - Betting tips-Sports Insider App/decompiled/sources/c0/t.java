package c0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f3303b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f3304c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3305d;

    @Override // c0.x
    public final void g(com.google.firebase.messaging.x xVar) {
        Bitmap a7;
        Notification.Builder builder = (Notification.Builder) xVar.f6183b;
        Context context = (Context) xVar.f6182a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f3303b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                s.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f3303b;
                int i5 = iconCompat2.f1269a;
                if (i5 == -1) {
                    Object obj = iconCompat2.f1270b;
                    a7 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i5 == 1) {
                    a7 = (Bitmap) iconCompat2.f1270b;
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a7 = IconCompat.a((Bitmap) iconCompat2.f1270b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a7);
            }
        }
        if (this.f3305d) {
            IconCompat iconCompat3 = this.f3304c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                r.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            s.c(bigContentTitle, false);
            s.b(bigContentTitle, null);
        }
    }

    @Override // c0.x
    public final String h() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
