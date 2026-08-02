package ru.ozon.uni.android.ds.compose.component.selectionControls.radio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsRadioAtomKt$radioLocator$1 extends AbstractC7737t implements Function1<TestInfo, Locator> {
    public static final DsRadioAtomKt$radioLocator$1 INSTANCE = new DsRadioAtomKt$radioLocator$1();

    DsRadioAtomKt$radioLocator$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Locator invoke(TestInfo testInfo) {
        return AtomLocatorKt.getBaseLocator().invoke(testInfo, FormPageDTO.Field.FIELD_TYPE_RADIO);
    }
}
