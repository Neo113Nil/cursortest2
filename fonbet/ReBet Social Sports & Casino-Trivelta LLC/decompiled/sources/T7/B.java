package T7;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public Fragment f10977a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.Fragment f10978b;

    public B(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f10977a = fragment;
    }

    public final Activity a() {
        Fragment fragment = this.f10977a;
        if (fragment != null) {
            if (fragment == null) {
                return null;
            }
            return fragment.getActivity();
        }
        android.app.Fragment fragment2 = this.f10978b;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }

    public final android.app.Fragment b() {
        return this.f10978b;
    }

    public final Fragment c() {
        return this.f10977a;
    }

    public final void d(Intent intent, int i10) {
        Fragment fragment = this.f10977a;
        if (fragment != null) {
            if (fragment == null) {
                return;
            }
            fragment.startActivityForResult(intent, i10);
        } else {
            android.app.Fragment fragment2 = this.f10978b;
            if (fragment2 == null) {
                return;
            }
            fragment2.startActivityForResult(intent, i10);
        }
    }

    public B(android.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f10978b = fragment;
    }
}
