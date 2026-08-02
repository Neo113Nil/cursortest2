package ru.ozon.app.android.ugc.core.di.modules;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV3ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

/* loaded from: classes7.dex */
public final class UgcCoreWidgetsModule_ProvideComposeWidgets$core_prodGoogleAllVendorsReleaseFactory implements e<Set<i>> {
    public static Set<i> provideComposeWidgets$core_prodGoogleAllVendorsRelease(UgcCoreWidgetsModule ugcCoreWidgetsModule, CellListV2ViewMapper cellListV2ViewMapper, JsonParser jsonParser, SeparatorViewMapper separatorViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, PlainTextViewMapper2 plainTextViewMapper2, ButtonV3ViewMapper buttonV3ViewMapper) {
        Set<i> provideComposeWidgets$core_prodGoogleAllVendorsRelease = ugcCoreWidgetsModule.provideComposeWidgets$core_prodGoogleAllVendorsRelease(cellListV2ViewMapper, jsonParser, separatorViewMapper, commonIslandSeparatorViewMapper2, plainTextViewMapper2, buttonV3ViewMapper);
        j.d(provideComposeWidgets$core_prodGoogleAllVendorsRelease);
        return provideComposeWidgets$core_prodGoogleAllVendorsRelease;
    }
}
