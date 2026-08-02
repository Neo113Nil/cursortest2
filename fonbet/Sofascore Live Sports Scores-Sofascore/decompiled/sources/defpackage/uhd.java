package defpackage;

import android.graphics.Bitmap;
import com.sofascore.model.notifications.NotificationData;
import com.sofascore.model.notifications.NotificationOpen;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uhd extends mw1 {
    public static String g(NotificationData notificationData) {
        String j = ljg.j(notificationData.getGroupKey(), "notification_");
        String rating = notificationData.getRating();
        if (rating == null) {
            return j;
        }
        return ((Object) j) + "_" + c.r(rating, ".", "_", false);
    }

    public final Bitmap f(NotificationData notificationData) {
        notificationData.getClass();
        if (notificationData.getOpen() == NotificationOpen.DETAILS || notificationData.getOpen() == NotificationOpen.HIGHLIGHTS || notificationData.getOpen() == NotificationOpen.LINEUPS) {
            return c(g(notificationData));
        }
        return null;
    }
}
