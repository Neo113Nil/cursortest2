package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes13.dex */
public final class CharacteristicsPickBottomSheetFragment_MembersInjector implements b<CharacteristicsPickBottomSheetFragment> {
    public static void injectAppType(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment, AppType appType) {
        characteristicsPickBottomSheetFragment.appType = appType;
    }

    public static void injectProvider(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment, a<ComparisonBottomSheetViewModel> aVar) {
        characteristicsPickBottomSheetFragment.provider = aVar;
    }
}
