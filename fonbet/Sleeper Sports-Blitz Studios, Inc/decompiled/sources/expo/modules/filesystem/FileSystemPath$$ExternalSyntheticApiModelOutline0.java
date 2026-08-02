package expo.modules.filesystem;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import dalvik.system.DelegateLastClassLoader;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class FileSystemPath$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ Notification.Builder m(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ NotificationChannelGroup m(String str, CharSequence charSequence) {
        return new NotificationChannelGroup(str, charSequence);
    }

    public static /* synthetic */ ResourcesLoader m() {
        return new ResourcesLoader();
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable m(Object obj) {
        return (ColorStateListDrawable) obj;
    }

    public static /* synthetic */ DelegateLastClassLoader m(String str, ClassLoader classLoader) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m11830m() {
        return AclEntryPermission.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m11841m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m11843m(Object obj) {
        return obj instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return BasicFileAttributes.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m11846m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof NotificationChannelGroup;
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof NotificationChannel;
    }
}
