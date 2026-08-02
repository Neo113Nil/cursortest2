package ru.ozon.app.android.videomolecule.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;

/* loaded from: classes7.dex */
public final class VideoMoleculeDeeplinkHandlersModule_ProvideDeeplinkHandlersFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlers() {
        Set<a> provideDeeplinkHandlers = VideoMoleculeDeeplinkHandlersModule.INSTANCE.provideDeeplinkHandlers();
        j.d(provideDeeplinkHandlers);
        return provideDeeplinkHandlers;
    }
}
