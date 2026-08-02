package hi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import ii.AbstractC4549a;
import ii.AbstractC4550b;
import ii.d;
import ii.e;
import ii.f;
import ii.g;
import ii.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f47905a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f47906b;

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC4510a f47907c;

    /* renamed from: d, reason: collision with root package name */
    public static ComponentName f47908d;

    static {
        LinkedList linkedList = new LinkedList();
        f47905a = linkedList;
        f47906b = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AbstractC4549a.class);
        linkedList.add(ii.c.class);
        linkedList.add(d.class);
        linkedList.add(e.class);
        linkedList.add(h.class);
        linkedList.add(f.class);
        linkedList.add(g.class);
        linkedList.add(AbstractC4550b.class);
    }

    public static boolean a(Context context, int i10) {
        try {
            b(context, i10);
            return true;
        } catch (b unused) {
            Log.isLoggable("ShortcutBadger", 3);
            return false;
        }
    }

    public static void b(Context context, int i10) {
        if (f47907c == null && !c(context)) {
            throw new b("No default launcher available");
        }
        try {
            f47907c.b(context, f47908d, i10);
        } catch (Exception e10) {
            throw new b("Unable to execute badge", e10);
        }
    }

    public static boolean c(Context context) {
        InterfaceC4510a interfaceC4510a;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f47908d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, PKIFailureInfo.notAuthorized).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator it2 = f47905a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    interfaceC4510a = (InterfaceC4510a) ((Class) it2.next()).newInstance();
                } catch (Exception unused) {
                    interfaceC4510a = null;
                }
                if (interfaceC4510a != null && interfaceC4510a.a().contains(str)) {
                    f47907c = interfaceC4510a;
                    break;
                }
            }
            if (f47907c != null) {
                break;
            }
        }
        if (f47907c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f47907c = new h();
            return true;
        }
        if (str2.equalsIgnoreCase("OPPO")) {
            f47907c = new d();
            return true;
        }
        if (str2.equalsIgnoreCase("VIVO")) {
            f47907c = new f();
            return true;
        }
        if (str2.equalsIgnoreCase("ZTE")) {
            f47907c = new g();
            return true;
        }
        f47907c = new DefaultBadger();
        return true;
    }
}
