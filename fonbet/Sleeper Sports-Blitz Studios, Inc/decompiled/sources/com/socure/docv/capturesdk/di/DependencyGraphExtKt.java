package com.socure.docv.capturesdk.di;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.MimeTypes;
import com.socure.docv.capturesdk.di.activity.ActivityComponent;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import com.socure.docv.capturesdk.di.fragment.FragmentComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DependencyGraphExt.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0000\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "obtainApplicationComponent", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "buildActivityComponent", "Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;", "Landroidx/appcompat/app/AppCompatActivity;", "buildFragmentComponent", "Lcom/socure/docv/capturesdk/di/fragment/FragmentComponent;", "Landroidx/fragment/app/Fragment;", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DependencyGraphExtKt {
    private static ApplicationComponent applicationComponent;

    public static final ApplicationComponent obtainApplicationComponent(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        ApplicationComponent applicationComponent2 = applicationComponent;
        if (applicationComponent2 != null) {
            return applicationComponent2;
        }
        ApplicationComponent build = ApplicationComponent.INSTANCE.build(application);
        applicationComponent = build;
        return build;
    }

    public static final ActivityComponent buildActivityComponent(AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        ActivityComponent.Companion companion = ActivityComponent.INSTANCE;
        Application application = appCompatActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "this.application");
        return companion.build(appCompatActivity, obtainApplicationComponent(application));
    }

    public static final FragmentComponent buildFragmentComponent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentComponent.Companion companion = FragmentComponent.INSTANCE;
        FragmentActivity requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return companion.build(fragment, buildActivityComponent((AppCompatActivity) requireActivity));
    }
}
