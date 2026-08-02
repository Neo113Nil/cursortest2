package com.moloco.sdk.internal.utils;

import android.content.Context;
import android.os.StatFs;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.RedirectEvent;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class f {
    public static final f a = new f();
    public static final int b = 50;
    public static final int c = 75;
    public static final int d = 33;
    public static final int e = 66;
    public static final int f = 0;

    public final e a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            String parent = file.getParent();
            if (parent == null) {
                parent = file.getAbsolutePath();
            }
            StatFs statFs = new StatFs(parent);
            return new e(statFs.getAvailableBytes(), statFs.getTotalBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b(int i) {
        return i < 50 ? m.aa : i < 75 ? "medium" : "high";
    }

    public final String a(File file, Context context) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(context, "context");
        File externalCacheDir = context.getExternalCacheDir();
        String absolutePath = file.getAbsolutePath();
        if (externalCacheDir != null) {
            Intrinsics.checkNotNull(absolutePath);
            String absolutePath2 = externalCacheDir.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
            if (StringsKt.startsWith$default(absolutePath, absolutePath2, false, 2, (Object) null)) {
                return "external";
            }
        }
        Intrinsics.checkNotNull(absolutePath);
        String absolutePath3 = context.getCacheDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
        if (StringsKt.startsWith$default(absolutePath, absolutePath3, false, 2, (Object) null)) {
            return RedirectEvent.i;
        }
        return null;
    }

    public final String a(int i) {
        if (i <= 33) {
            return "0-33";
        }
        if (i <= 66) {
            return "34-66";
        }
        if (i < 100) {
            return "67-99";
        }
        return "100";
    }
}
