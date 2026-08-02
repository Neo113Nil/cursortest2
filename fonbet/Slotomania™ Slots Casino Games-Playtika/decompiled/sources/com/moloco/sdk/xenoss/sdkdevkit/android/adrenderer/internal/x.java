package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class x {
    public static final String a = "START_MUTED";
    public static final String b = "CLOSE_DELAY_SECONDS";
    public static final String c = "DEC_DELAY_SECONDS";
    public static final String d = "SKIP_DELAY_SECONDS";
    public static final String e = "SKIP_ENABLED";
    public static final String f = "AUTO_STORE_ON_SKIP";
    public static final String g = "AUTO_STORE_ON_COMPLETE";
    public static final String h = "ANDROID_INLINE_ENABLED";
    public static final String i = "ANDROID_INLINE_URL";
    public static final String j = "BUNDLE_ID";
    public static final String k = "ANDROID_AUTOINLINE_ENABLED";
    public static final String l = "ANDROID_AUTOINLINE_EVENTLINK";
    public static final String m = "ANDROID_AUTOINLINE_SKIP";
    public static final String n = "ANDROID_AUTOINLINE_CLICKTHROUGH";
    public static final String o = "ANDROID_AUTOINLINE_FORCE_FULLSCREEN";

    public static final void a(Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(b, i2);
    }

    public static final void b(Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(c, i2);
    }

    public static final void c(Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(d, i2);
    }

    public static final void d(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(h, z);
    }

    public static final void e(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(g, z);
    }

    public static final void f(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(f, z);
    }

    public static final void g(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(a, z);
    }

    public static final boolean h(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(g, false);
    }

    public static final boolean i(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(f, false);
    }

    public static final String j(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(j);
    }

    public static final int k(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(b, 0);
    }

    public static final int l(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(c, 0);
    }

    public static final Boolean m(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra(e)) {
            return Boolean.valueOf(intent.getBooleanExtra(e, false));
        }
        return null;
    }

    public static final int n(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(d, 0);
    }

    public static final boolean o(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(a, true);
    }

    public static final void a(Intent intent, Boolean bool) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (bool != null) {
            intent.putExtra(e, bool.booleanValue());
        }
    }

    public static final boolean b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(k, false);
    }

    public static final void c(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(i, value);
    }

    public static final void d(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(j, value);
    }

    public static final boolean e(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(m, false);
    }

    public static final boolean f(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(h, false);
    }

    public static final String g(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(i);
    }

    public static final void a(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(k, z);
    }

    public static final void b(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(l, value);
    }

    public static final String c(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(l);
    }

    public static final boolean d(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(o, false);
    }

    public static final String a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(n);
    }

    public static final void b(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(o, z);
    }

    public static final void c(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(m, z);
    }

    public static final void a(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(n, value);
    }
}
