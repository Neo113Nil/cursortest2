package defpackage;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class afd extends r9 {
    public final /* synthetic */ int c;
    public Object d;

    public afd(int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.d = new ArrayList();
                break;
        }
    }

    @Override // defpackage.r9
    public final void c(ujg ujgVar) {
        switch (this.c) {
            case 0:
                new Notification.BigTextStyle((Notification.Builder) ujgVar.c).setBigContentTitle((CharSequence) this.b).bigText((CharSequence) this.d);
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) ujgVar.c).setBigContentTitle((CharSequence) this.b);
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // defpackage.r9
    public final String i() {
        switch (this.c) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
