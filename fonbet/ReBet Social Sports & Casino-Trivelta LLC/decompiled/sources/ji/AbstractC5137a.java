package ji;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import hi.b;
import java.util.Collections;
import java.util.List;

/* renamed from: ji.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5137a {
    public static List a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.EMPTY_LIST;
    }

    public static void b(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                c(context, intent2);
                return;
            } catch (b unused) {
            }
        }
        c(context, intent);
    }

    public static void c(Context context, Intent intent) {
        List<ResolveInfo> a10 = a(context, intent);
        if (a10.size() == 0) {
            throw new b("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : a10) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}
