package ru.ozon.app.android.network.abtool.di;

import Jb.e;
import Jb.j;
import Ld0.c;
import ru.ozon.app.android.abtool.AbTool;

/* loaded from: classes6.dex */
public final class AbToolModule_Companion_ProvideAbToolFactory implements e<AbTool> {
    public static AbTool provideAbTool(c cVar) {
        AbTool provideAbTool = AbToolModule.INSTANCE.provideAbTool(cVar);
        j.d(provideAbTool);
        return provideAbTool;
    }
}
