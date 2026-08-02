package ru.ozon.app.android.storefront.core.atoms.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.uni.atoms.parsing.AtomParserModel;

/* loaded from: classes7.dex */
public final class LegacyStorefrontAtomParserModelsModule_Companion_ProvideLegacyStorefrontAtomParserModelsFactory implements e<Set<AtomParserModel>> {
    public static Set<AtomParserModel> provideLegacyStorefrontAtomParserModels() {
        Set<AtomParserModel> provideLegacyStorefrontAtomParserModels = LegacyStorefrontAtomParserModelsModule.INSTANCE.provideLegacyStorefrontAtomParserModels();
        j.d(provideLegacyStorefrontAtomParserModels);
        return provideLegacyStorefrontAtomParserModels;
    }
}
