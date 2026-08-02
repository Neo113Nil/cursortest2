package ru.ozon.app.android.ugc.di.modules;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

/* loaded from: classes7.dex */
public final class UgcWidgetsModule_ProvideComposeWidgets$ugc_prodGoogleAllVendorsReleaseFactory implements e<Set<i>> {
    public static Set<i> provideComposeWidgets$ugc_prodGoogleAllVendorsRelease(UgcWidgetsModule ugcWidgetsModule, SeparatorViewMapper separatorViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, PlainTextViewMapper2 plainTextViewMapper2, JsonParser jsonParser) {
        Set<i> provideComposeWidgets$ugc_prodGoogleAllVendorsRelease = ugcWidgetsModule.provideComposeWidgets$ugc_prodGoogleAllVendorsRelease(separatorViewMapper, commonIslandSeparatorViewMapper2, plainTextViewMapper2, jsonParser);
        j.d(provideComposeWidgets$ugc_prodGoogleAllVendorsRelease);
        return provideComposeWidgets$ugc_prodGoogleAllVendorsRelease;
    }
}
