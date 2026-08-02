package ru.ozon.app.android.initializers.lifecycle;

import Jb.e;
import Jb.j;
import android.app.Application;

/* loaded from: classes6.dex */
public final class ApplicationLifecycleModule_Companion_ProvideStyleParserLifecycleAdapterFactory implements e<Application.ActivityLifecycleCallbacks> {
    public static Application.ActivityLifecycleCallbacks provideStyleParserLifecycleAdapter() {
        Application.ActivityLifecycleCallbacks provideStyleParserLifecycleAdapter = ApplicationLifecycleModule.INSTANCE.provideStyleParserLifecycleAdapter();
        j.d(provideStyleParserLifecycleAdapter);
        return provideStyleParserLifecycleAdapter;
    }
}
