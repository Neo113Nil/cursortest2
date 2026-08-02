package c;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.twilio.voice.PublisherMetadata;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26713a;

    public w0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26713a = context;
    }

    public final Map a() {
        long j10;
        String str = "";
        Pair pair = TuplesKt.to("manufacturer", Build.MANUFACTURER);
        Pair pair2 = TuplesKt.to("model", Build.MODEL);
        Pair pair3 = TuplesKt.to("brand", Build.BRAND);
        Pair pair4 = TuplesKt.to(PublisherMetadata.OS_VERSION, Build.VERSION.RELEASE);
        try {
            String string = Settings.Secure.getString(this.f26713a.getContentResolver(), "android_id");
            if (string != null) {
                str = string;
            }
        } catch (Exception unused) {
        }
        Pair pair5 = TuplesKt.to("android_id", str);
        Object systemService = this.f26713a.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        Pair pair6 = TuplesKt.to("screen_width", Integer.valueOf(displayMetrics.widthPixels));
        Object systemService2 = this.f26713a.getSystemService("window");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics2);
        Pair pair7 = TuplesKt.to("screen_height", Integer.valueOf(displayMetrics2.heightPixels));
        Object systemService3 = this.f26713a.getSystemService("window");
        Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics3 = new DisplayMetrics();
        ((WindowManager) systemService3).getDefaultDisplay().getMetrics(displayMetrics3);
        Pair pair8 = TuplesKt.to("density", Float.valueOf(displayMetrics3.density));
        long j11 = 0;
        try {
            Object systemService4 = this.f26713a.getSystemService("activity");
            Intrinsics.checkNotNull(systemService4, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService4).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j10 = 0;
        }
        Pair pair9 = TuplesKt.to("total_memory", Long.valueOf(j10));
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j11 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (Exception unused3) {
        }
        return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to("total_storage", Long.valueOf(j11)));
    }
}
