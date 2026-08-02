package u2;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.time.DurationKt;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6487a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6487a f65958a = new C6487a();

    /* renamed from: u2.a$a, reason: collision with other inner class name */
    public static final class C0918a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0918a f65959a = new C0918a();

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            return extensionVersion;
        }
    }

    /* renamed from: u2.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f65960a = new b();

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
            return extensionVersion;
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f65960a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C0918a.f65959a.a();
        }
        return 0;
    }
}
