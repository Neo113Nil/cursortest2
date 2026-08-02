package ru.ozon.app.android.video.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import o3.InterfaceC8635b;

/* loaded from: classes7.dex */
public final class VideoModule_Companion_ProvideDatabaseProviderFactory implements e<InterfaceC8635b> {
    public static InterfaceC8635b provideDatabaseProvider(Context context) {
        InterfaceC8635b provideDatabaseProvider = VideoModule.INSTANCE.provideDatabaseProvider(context);
        j.d(provideDatabaseProvider);
        return provideDatabaseProvider;
    }
}
