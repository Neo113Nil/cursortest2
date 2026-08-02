package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;

/* loaded from: classes6.dex */
public final class RetainComposerPerformanceModule_ProvideScrollStateListenerFactory implements e<ScrollStateListener> {
    public static ScrollStateListener provideScrollStateListener() {
        ScrollStateListener provideScrollStateListener = RetainComposerPerformanceModule.INSTANCE.provideScrollStateListener();
        j.d(provideScrollStateListener);
        return provideScrollStateListener;
    }
}
