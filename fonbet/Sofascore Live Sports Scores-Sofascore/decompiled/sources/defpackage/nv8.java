package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nv8 {
    public final Runtime a = Runtime.getRuntime();
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;
    public final Context d;

    static {
        l10.c();
    }

    public nv8(Context context) {
        this.d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
