package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gqj {
    public static WeakReference c;
    public ejg a;
    public final ScheduledThreadPoolExecutor b;

    public gqj(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized eqj a() {
        String str;
        eqj eqjVar;
        ejg ejgVar = this.a;
        synchronized (((ArrayDeque) ejgVar.b)) {
            str = (String) ((ArrayDeque) ejgVar.b).peek();
        }
        Pattern pattern = eqj.d;
        eqjVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                eqjVar = new eqj(split[0], split[1]);
            }
        }
        return eqjVar;
    }
}
