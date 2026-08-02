package com.vk.libvideo.autoplay;

import com.vk.core.preference.Preference;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import xsna.fxc0;
import xsna.lz2;
import xsna.msy;
import xsna.ri50;

/* compiled from: PlaySettings.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final e a = new e();
    public static final Object b = msy.a(LazyThreadSafetyMode.NONE, new lz2(22));
    public static WeakReference<a> c;

    /* compiled from: PlaySettings.kt */
    public interface a {
        void onMuteChange(boolean z);
    }

    public static boolean a() {
        if (!fxc0.B().J().D()) {
            return Preference.d("PlaySettingsPrefs", "PlaySettingsPrefs.auto_scroll_in_video_feed", true);
        }
        fxc0.B().getClass();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean b() {
        return ((ri50) b.getValue()).d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean c() {
        return ((ri50) b.getValue()).b();
    }

    public static void d(boolean z) {
        if (fxc0.B().J().D()) {
            fxc0.B().getClass();
        } else {
            Preference.I("PlaySettingsPrefs", "PlaySettingsPrefs.auto_scroll_in_video_feed", z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static void e(boolean z) {
        ((ri50) b.getValue()).c(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static void f(boolean z) {
        ((ri50) b.getValue()).a(z);
    }

    public static boolean g() {
        return fxc0.B().o();
    }
}
