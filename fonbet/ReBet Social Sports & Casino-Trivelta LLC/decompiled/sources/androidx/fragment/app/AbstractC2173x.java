package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2173x extends AbstractC2170u {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f20235a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f20236b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f20237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20238d;

    /* renamed from: e, reason: collision with root package name */
    public final FragmentManager f20239e;

    public AbstractC2173x(Activity activity, Context context, Handler handler, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f20235a = activity;
        this.f20236b = context;
        this.f20237c = handler;
        this.f20238d = i10;
        this.f20239e = new G();
    }

    public final Activity e() {
        return this.f20235a;
    }

    public final Context f() {
        return this.f20236b;
    }

    public final FragmentManager g() {
        return this.f20239e;
    }

    public final Handler h() {
        return this.f20237c;
    }

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object j();

    public abstract LayoutInflater k();

    public void l(Fragment fragment, String[] permissions, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
    }

    public abstract boolean m(String str);

    public void n(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC5338c.startActivity(this.f20236b, intent, bundle);
    }

    public void o(Fragment fragment, IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.f20235a;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.k(activity, intent, i10, intent2, i11, i12, i13, bundle);
    }

    public abstract void p();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC2173x(AbstractActivityC2168s activity) {
        this(activity, activity, new Handler(), 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
