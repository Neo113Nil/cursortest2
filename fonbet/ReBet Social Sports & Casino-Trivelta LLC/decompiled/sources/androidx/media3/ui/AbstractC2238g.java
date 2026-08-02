package androidx.media3.ui;

import android.graphics.Color;

/* renamed from: androidx.media3.ui.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2238g {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return e1.Z.G("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
