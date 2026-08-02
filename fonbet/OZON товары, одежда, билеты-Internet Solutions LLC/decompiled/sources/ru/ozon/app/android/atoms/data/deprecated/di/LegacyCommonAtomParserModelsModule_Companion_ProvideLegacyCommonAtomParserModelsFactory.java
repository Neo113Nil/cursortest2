package ru.ozon.app.android.atoms.data.deprecated.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.uni.atoms.parsing.AtomParserModel;

/* loaded from: classes6.dex */
public final class LegacyCommonAtomParserModelsModule_Companion_ProvideLegacyCommonAtomParserModelsFactory implements e<Set<AtomParserModel>> {
    public static Set<AtomParserModel> provideLegacyCommonAtomParserModels() {
        Set<AtomParserModel> provideLegacyCommonAtomParserModels = LegacyCommonAtomParserModelsModule.INSTANCE.provideLegacyCommonAtomParserModels();
        j.d(provideLegacyCommonAtomParserModels);
        return provideLegacyCommonAtomParserModels;
    }
}
