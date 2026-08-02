package t4;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6441a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6441a f65674a = new C6441a();

    /* renamed from: b, reason: collision with root package name */
    public static int f65675b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f65676c = true;

    public static final void a(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f65675b <= 3) {
            d(tag);
            c(msg);
        }
    }

    public static final void b(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f65675b <= 6) {
            Log.e(d(tag), c(msg));
        }
    }

    public static final String c(String str) {
        if (!f65676c) {
            return str;
        }
        return "[" + Thread.currentThread().getName() + "] " + str;
    }

    public static final String d(String str) {
        return "RNV" + str;
    }

    public static final void e(int i10, boolean z10) {
        f65675b = i10;
        f65676c = z10;
    }

    public static final void f(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f65675b <= 5) {
            Log.w(d(tag), c(msg));
        }
    }
}
