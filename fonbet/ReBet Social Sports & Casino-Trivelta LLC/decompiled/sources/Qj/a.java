package Qj;

import android.app.Activity;
import android.content.Context;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0191a f9896b = new C0191a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f9897a;

    /* renamed from: Qj.a$a, reason: collision with other inner class name */
    public static final class C0191a {
        public /* synthetic */ C0191a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0191a() {
        }
    }

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9897a = context;
    }

    public final boolean a() {
        return Xj.c.i(this.f9897a, "android.permission.RECORD_AUDIO");
    }

    public final c b(Activity activity, int i10, int[] grantResults) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i10 == 130 && grantResults.length != 0) {
            return d(activity) ? c.f9900b : ArraysKt.first(grantResults) == 0 ? c.f9899a : c.f9901c;
        }
        return null;
    }

    public final void c(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        androidx.core.app.b.f(activity, new String[]{"android.permission.RECORD_AUDIO"}, 130);
    }

    public final boolean d(Activity activity) {
        return androidx.core.app.b.i(activity, "android.permission.RECORD_AUDIO");
    }
}
