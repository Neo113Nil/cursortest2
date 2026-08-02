package io.sentry.android.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.e;
import io.sentry.h0;
import io.sentry.i1;
import io.sentry.q6;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends FragmentManager$FragmentLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f15912a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f15913b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15914c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f15915d;

    public d(b1 scopes, Set filterFragmentLifecycleBreadcrumbs, boolean z5) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(filterFragmentLifecycleBreadcrumbs, "filterFragmentLifecycleBreadcrumbs");
        this.f15912a = scopes;
        this.f15913b = filterFragmentLifecycleBreadcrumbs;
        this.f15914c = z5;
        this.f15915d = new WeakHashMap();
    }

    public static String b(Fragment fragment) {
        String canonicalName = fragment.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String simpleName = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final void a(Fragment fragment, b bVar) {
        if (this.f15913b.contains(bVar)) {
            e eVar = new e();
            eVar.f16334e = "navigation";
            eVar.c(bVar.getBreadcrumbName$sentry_android_fragment_release(), "state");
            eVar.c(b(fragment), "screen");
            eVar.f16336g = "ui.fragment.lifecycle";
            eVar.f16338i = b5.INFO;
            h0 h0Var = new h0();
            h0Var.d(fragment, "android:fragment");
            this.f15912a.h(eVar, h0Var);
        }
    }

    public final void c(Fragment fragment) {
        i1 i1Var;
        if (this.f15912a.m().isTracingEnabled() && this.f15914c) {
            WeakHashMap weakHashMap = this.f15915d;
            if (weakHashMap.containsKey(fragment) && (i1Var = (i1) weakHashMap.get(fragment)) != null) {
                q6 status = i1Var.getStatus();
                if (status == null) {
                    status = q6.OK;
                }
                i1Var.h(status);
            }
        }
    }
}
