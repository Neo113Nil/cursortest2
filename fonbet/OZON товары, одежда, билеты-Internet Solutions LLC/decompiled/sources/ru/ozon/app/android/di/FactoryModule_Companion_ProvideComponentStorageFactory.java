package ru.ozon.app.android.di;

import Jb.e;
import Jb.j;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FactoryModule_Companion_ProvideComponentStorageFactory implements e<C6740b> {
    public static C6740b provideComponentStorage(Map<Class<? extends InterfaceC6958a>, InterfaceC7081a<? extends InterfaceC6958a>> map) {
        C6740b provideComponentStorage = FactoryModule.INSTANCE.provideComponentStorage(map);
        j.d(provideComponentStorage);
        return provideComponentStorage;
    }
}
