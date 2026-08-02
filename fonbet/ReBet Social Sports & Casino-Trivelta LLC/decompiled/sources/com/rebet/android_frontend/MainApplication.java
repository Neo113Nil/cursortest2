package com.rebet.android_frontend;

import android.app.Application;
import android.content.Context;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeApplicationEntryPoint;
import com.facebook.react.ReactPackage;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.defaults.DefaultReactHost;
import com.rebet.android_frontend.MainApplication;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.wonday.orientation.a;
import uc.C6544b;
import uc.C6545c;
import uc.C6546d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/rebet/android_frontend/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "", "onCreate", "Lcom/facebook/react/ReactHost;", "a", "Lkotlin/Lazy;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost", "app_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainApplication extends Application implements ReactApplication {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Lazy reactHost = LazyKt.lazy(new Function0() { // from class: tc.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ReactHost b10;
            b10 = MainApplication.b(MainApplication.this);
            return b10;
        }
    });

    public static final ReactHost b(MainApplication mainApplication) {
        ReactHost defaultReactHost;
        Context applicationContext = mainApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ArrayList<ReactPackage> packages = new PackageList(mainApplication).getPackages();
        packages.add(new C6546d());
        packages.add(new C6544b());
        packages.add(new C6545c());
        Intrinsics.checkNotNullExpressionValue(packages, "apply(...)");
        defaultReactHost = DefaultReactHost.getDefaultReactHost(applicationContext, packages, (r19 & 4) != 0 ? "index" : null, (r19 & 8) != 0 ? "index.android.bundle" : null, (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? ReactBuildConfig.DEBUG : false, (r19 & 128) != 0 ? CollectionsKt.emptyList() : null, (r19 & 256) != 0 ? new Function1() { // from class: com.facebook.react.defaults.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit defaultReactHost$lambda$0;
                defaultReactHost$lambda$0 = DefaultReactHost.getDefaultReactHost$lambda$0((Exception) obj);
                return defaultReactHost$lambda$0;
            }
        } : null, (r19 & 512) != 0 ? null : null);
        return defaultReactHost;
    }

    @Override // com.facebook.react.ReactApplication
    public ReactHost getReactHost() {
        return (ReactHost) this.reactHost.getValue();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(false, false, null, null, 15, null));
        registerActivityLifecycleCallbacks(a.a());
        ReactNativeApplicationEntryPoint.loadReactNative(this);
    }
}
