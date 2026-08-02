package ru.ozon.app.android.advertising.di.module;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.advertising.FirebaseAdvertisingService;
import ru.ozon.app.android.advertising.GooglePlayServicesUtilsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/advertising/di/module/FirebaseAdvertisingServiceModule;", "", "<init>", "()V", "provideFirebaseAdvertisingService", "Lru/ozon/app/android/advertising/FirebaseAdvertisingService;", "context", "Landroid/content/Context;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseAdvertisingServiceModule {

    @NotNull
    public static final FirebaseAdvertisingServiceModule INSTANCE = new FirebaseAdvertisingServiceModule();

    private FirebaseAdvertisingServiceModule() {
    }

    public final FirebaseAdvertisingService provideFirebaseAdvertisingService(@NotNull Context context, @NotNull FirebaseAnalytics firebaseAnalytics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        if (GooglePlayServicesUtilsKt.areGooglePlayServicesAvailable(context)) {
            return new FirebaseAdvertisingService(context, firebaseAnalytics);
        }
        return null;
    }
}
