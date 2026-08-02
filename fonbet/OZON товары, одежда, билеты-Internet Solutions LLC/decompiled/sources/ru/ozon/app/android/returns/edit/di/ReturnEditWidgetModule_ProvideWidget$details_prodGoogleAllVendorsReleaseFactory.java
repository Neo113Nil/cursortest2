package ru.ozon.app.android.returns.edit.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.edit.data.ReturnEditConfig;
import ru.ozon.app.android.returns.edit.presentation.comment.ReturnTextEditBlockViewMapper;
import ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditViewMapper;
import ru.ozon.app.android.returns.edit.presentation.sticky.ReturnEditStickyViewMapper;

/* loaded from: classes7.dex */
public final class ReturnEditWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideWidget$details_prodGoogleAllVendorsRelease(ReturnEditWidgetModule returnEditWidgetModule, ReturnEditConfig returnEditConfig, ReturnTextEditBlockViewMapper returnTextEditBlockViewMapper, ReturnImageEditViewMapper returnImageEditViewMapper, ReturnEditStickyViewMapper returnEditStickyViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2) {
        Widget2 provideWidget$details_prodGoogleAllVendorsRelease = returnEditWidgetModule.provideWidget$details_prodGoogleAllVendorsRelease(returnEditConfig, returnTextEditBlockViewMapper, returnImageEditViewMapper, returnEditStickyViewMapper, commonIslandSeparatorViewMapper2);
        j.d(provideWidget$details_prodGoogleAllVendorsRelease);
        return provideWidget$details_prodGoogleAllVendorsRelease;
    }
}
