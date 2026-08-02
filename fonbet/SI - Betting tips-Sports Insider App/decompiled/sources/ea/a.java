package ea;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f8781b;

    /* renamed from: c, reason: collision with root package name */
    public static String f8782c;

    /* renamed from: a, reason: collision with root package name */
    public Context f8783a;

    public static String a(ContentResolver contentResolver) {
        try {
            return Settings.Secure.getString(contentResolver, "android_id").toString();
        } catch (Exception e7) {
            zc.d.b(4, "Settings.Secure.ANDROID_ID", e7);
            return null;
        }
    }

    public static String b(ContentResolver contentResolver) {
        String a7 = a(contentResolver);
        if (a7 != null) {
            return a7;
        }
        try {
            return kotlin.text.d.d(System.currentTimeMillis());
        } catch (Exception e7) {
            zc.d.b(4, "ExperimentalStdlibApi.toHexString", e7);
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            String substring = z.m(uuid, "-", "").substring(0, 16);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
    }

    public final String c() {
        Context context = this.f8783a;
        if (f8782c == null) {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            f8782c = a(contentResolver);
        }
        String str = f8782c;
        if (str != null) {
            return str;
        }
        ContentResolver contentResolver2 = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
        return a(contentResolver2);
    }

    public final String d() {
        if (f8781b == null) {
            ContentResolver contentResolver = this.f8783a.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            f8781b = b(contentResolver);
        }
        String str = f8781b;
        if (str != null) {
            return str;
        }
        ContentResolver contentResolver2 = this.f8783a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
        return b(contentResolver2);
    }
}
