package D5;

import D5.d;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class e extends FragmentManager.k {

    /* renamed from: a, reason: collision with root package name */
    public final b5.d f2557a;

    public e(b5.d monitorListener) {
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        this.f2557a = monitorListener;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment attached: " + fragment.getClass().getSimpleName());
            p(new d.b(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment created: " + fragment.getClass().getSimpleName());
            p(new d.c(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void d(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment destroyed: " + fragment.getClass().getSimpleName());
            p(new d.C0052d(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void e(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment detached: " + fragment.getClass().getSimpleName());
            p(new d.e(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void f(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment paused: " + fragment.getClass().getSimpleName());
            p(new d.f(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void i(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment resumed: " + fragment.getClass().getSimpleName());
            p(new d.g(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void j(FragmentManager fragmentManager, Fragment fragment, Bundle outState) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment save instance state: " + fragment.getClass().getSimpleName());
            p(new d.h(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void k(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment started: " + fragment.getClass().getSimpleName());
            p(new d.i(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void l(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment stopped: " + fragment.getClass().getSimpleName());
            p(new d.j(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(view, "view");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment view created: " + fragment.getClass().getSimpleName());
            p(new d.k(fragment));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void n(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (o(fragment)) {
            E5.b.f3006a.a("fragment view destroyed: " + fragment.getClass().getSimpleName());
            p(new d.l(fragment));
        }
    }

    public final boolean o(Fragment fragment) {
        String str;
        Context applicationContext;
        Context context = fragment.getContext();
        String packageName = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageName();
        if (packageName == null) {
            E5.b.f3006a.b("fragment context or package name is null, skipping...");
            return false;
        }
        Package r52 = fragment.getClass().getPackage();
        if (r52 == null || (str = r52.getName()) == null) {
            str = "";
        }
        return StringsKt.startsWith$default(str, packageName, false, 2, (Object) null);
    }

    public void p(f lifecycleEvent) {
        Intrinsics.checkNotNullParameter(lifecycleEvent, "lifecycleEvent");
        this.f2557a.a(lifecycleEvent);
    }
}
