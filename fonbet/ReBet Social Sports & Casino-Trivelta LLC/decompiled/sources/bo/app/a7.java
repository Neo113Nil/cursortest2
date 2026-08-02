package bo.app;

import android.content.Context;
import com.braze.storage.C2991e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public final C2991e f25250a;

    public a7(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25250a = new C2991e(context);
    }

    public static String a(String str) {
        return "uri-at-" + str.hashCode();
    }

    public static String b(String str) {
        return "uri-" + str.hashCode();
    }
}
