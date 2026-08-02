package ru.ozon.app.android.fresh.navigation.di.modules;

import Jb.e;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.platform.image.ImageResizer;

/* loaded from: classes6.dex */
public final class FreshNavigationModule_Companion_ProvideImageResizerFactory implements e<ImageResizer> {
    private final a<Context> contextProvider;

    public FreshNavigationModule_Companion_ProvideImageResizerFactory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static FreshNavigationModule_Companion_ProvideImageResizerFactory create(a<Context> aVar) {
        return new FreshNavigationModule_Companion_ProvideImageResizerFactory(aVar);
    }

    public static ImageResizer provideImageResizer(Context context) {
        ImageResizer provideImageResizer = FreshNavigationModule.INSTANCE.provideImageResizer(context);
        j.d(provideImageResizer);
        return provideImageResizer;
    }

    @Override // Pc.a
    public ImageResizer get() {
        return provideImageResizer(this.contextProvider.get());
    }
}
