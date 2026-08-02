package ru.ozon.app.android.analytics.firebase.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class FirebaseAnalyticsModule_ProvideFirebaseAnalyticsFactory implements e<FirebaseAnalytics> {
    public static FirebaseAnalytics provideFirebaseAnalytics(Context context) {
        FirebaseAnalytics provideFirebaseAnalytics = FirebaseAnalyticsModule.INSTANCE.provideFirebaseAnalytics(context);
        j.d(provideFirebaseAnalytics);
        return provideFirebaseAnalytics;
    }
}
