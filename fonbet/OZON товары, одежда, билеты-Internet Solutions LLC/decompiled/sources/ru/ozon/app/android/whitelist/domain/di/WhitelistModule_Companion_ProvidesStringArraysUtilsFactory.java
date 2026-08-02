package ru.ozon.app.android.whitelist.domain.di;

import Jb.e;
import Jb.j;
import android.app.Application;
import ru.ozon.app.android.whitelist.common.utils.StringArraysUtils;

/* loaded from: classes7.dex */
public final class WhitelistModule_Companion_ProvidesStringArraysUtilsFactory implements e<StringArraysUtils> {
    public static StringArraysUtils providesStringArraysUtils(Application application) {
        StringArraysUtils providesStringArraysUtils = WhitelistModule.INSTANCE.providesStringArraysUtils(application);
        j.d(providesStringArraysUtils);
        return providesStringArraysUtils;
    }
}
