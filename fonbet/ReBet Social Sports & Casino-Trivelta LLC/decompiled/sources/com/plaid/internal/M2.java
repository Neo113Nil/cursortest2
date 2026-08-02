package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.Plaid;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class M2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3677l0 f39370a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f39371b;

    public M2(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C3677l0 c3677l0 = new C3677l0();
        this.f39370a = c3677l0;
        this.f39371b = CollectionsKt.listOf(LinkActivity.class.getName());
        application.registerActivityLifecycleCallbacks(c3677l0);
    }

    public final boolean a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Activity activity = this.f39370a.f40741a.get();
        if (activity == null || !this.f39371b.contains(activity.getClass().getName())) {
            return false;
        }
        Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(activity, 6148, L2.b(throwable, null));
        C3677l0 c3677l0 = this.f39370a;
        WeakReference<Activity> weakReference = new WeakReference<>(null);
        c3677l0.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        c3677l0.f40741a = weakReference;
        return true;
    }
}
