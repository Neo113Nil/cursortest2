package Tb;

import android.view.accessibility.AccessibilityManager;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AccessibilityManager f11395a = (AccessibilityManager) com.henninghall.date_picker.c.f38475a.getApplicationContext().getSystemService("accessibility");

    /* renamed from: b, reason: collision with root package name */
    public static Locale f11396b = Locale.getDefault();

    public static void a(Locale locale) {
        f11396b = locale;
    }
}
