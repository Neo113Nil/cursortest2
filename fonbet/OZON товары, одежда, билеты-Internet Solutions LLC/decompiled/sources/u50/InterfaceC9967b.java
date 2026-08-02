package u50;

import android.app.Activity;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* renamed from: u50.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9967b {

    /* renamed from: u50.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static WeakReference<Activity> f100321a;

        public static WeakReference a() {
            return f100321a;
        }

        public static void b(WeakReference weakReference) {
            f100321a = weakReference;
        }
    }

    @NotNull
    Set<String> a();

    void b();

    void c(@NotNull String str, @NotNull String str2);

    void d(Parcelable parcelable, @NotNull String str);
}
