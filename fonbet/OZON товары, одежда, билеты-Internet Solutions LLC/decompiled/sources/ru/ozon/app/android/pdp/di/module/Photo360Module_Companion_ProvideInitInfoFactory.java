package ru.ozon.app.android.pdp.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;

/* loaded from: classes13.dex */
public final class Photo360Module_Companion_ProvideInitInfoFactory implements e<String> {
    public static String provideInitInfo(Photo360Activity photo360Activity) {
        String provideInitInfo = Photo360Module.INSTANCE.provideInitInfo(photo360Activity);
        j.d(provideInitInfo);
        return provideInitInfo;
    }
}
