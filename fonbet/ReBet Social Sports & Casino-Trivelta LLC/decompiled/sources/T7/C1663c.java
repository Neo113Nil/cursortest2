package T7;

import a1.C1908a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import h6.C4470F;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: T7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1663c extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static C1663c f11073c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11075a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f11072b = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f11074d = "com.parse.bolts.measurement_event";

    /* renamed from: T7.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1663c a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C1663c.a() != null) {
                return C1663c.a();
            }
            C1663c c1663c = new C1663c(context, null);
            C1663c.b(c1663c);
            C1663c.c(c1663c);
            return C1663c.a();
        }

        public a() {
        }
    }

    public /* synthetic */ C1663c(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ C1663c a() {
        if (Y7.a.d(C1663c.class)) {
            return null;
        }
        try {
            return f11073c;
        } catch (Throwable th2) {
            Y7.a.b(th2, C1663c.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(C1663c c1663c) {
        if (Y7.a.d(C1663c.class)) {
            return;
        }
        try {
            c1663c.e();
        } catch (Throwable th2) {
            Y7.a.b(th2, C1663c.class);
        }
    }

    public static final /* synthetic */ void c(C1663c c1663c) {
        if (Y7.a.d(C1663c.class)) {
            return;
        }
        try {
            f11073c = c1663c;
        } catch (Throwable th2) {
            Y7.a.b(th2, C1663c.class);
        }
    }

    public final void d() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            C1908a b10 = C1908a.b(this.f11075a);
            Intrinsics.checkNotNullExpressionValue(b10, "getInstance(applicationContext)");
            b10.e(this);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void e() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            C1908a b10 = C1908a.b(this.f11075a);
            Intrinsics.checkNotNullExpressionValue(b10, "getInstance(applicationContext)");
            b10.c(this, new IntentFilter(f11074d));
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void finalize() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            C4470F c4470f = new C4470F(context);
            Set<String> set = null;
            String stringPlus = Intrinsics.stringPlus("bf_", intent == null ? null : intent.getStringExtra("event_name"));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            c4470f.d(stringPlus, bundle);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public C1663c(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f11075a = applicationContext;
    }
}
