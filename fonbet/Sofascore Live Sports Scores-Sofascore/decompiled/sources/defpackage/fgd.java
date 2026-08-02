package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fgd {
    public static String d;
    public static egd g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public fgd(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }
}
