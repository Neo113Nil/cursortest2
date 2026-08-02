package ru.ozon.app.android.web.webview.di;

import Jb.e;
import Jb.j;
import io.reactivex.x;

/* loaded from: classes2.dex */
public final class WebViewModule_Companion_ProvideLoadWebViewSchedulerFactory implements e<x> {
    public static x provideLoadWebViewScheduler() {
        x provideLoadWebViewScheduler = WebViewModule.INSTANCE.provideLoadWebViewScheduler();
        j.d(provideLoadWebViewScheduler);
        return provideLoadWebViewScheduler;
    }
}
