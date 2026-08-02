package ru.ozon.app.android.storefront.widgets.appOnboarding.data;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes7.dex */
public final class AppOnboardingStorage_Factory implements e<AppOnboardingStorage> {
    private final a<Context> contextProvider;

    public AppOnboardingStorage_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static AppOnboardingStorage_Factory create(a<Context> aVar) {
        return new AppOnboardingStorage_Factory(aVar);
    }

    public static AppOnboardingStorage newInstance(Context context) {
        return new AppOnboardingStorage(context);
    }

    @Override // Pc.a
    public AppOnboardingStorage get() {
        return newInstance(this.contextProvider.get());
    }
}
