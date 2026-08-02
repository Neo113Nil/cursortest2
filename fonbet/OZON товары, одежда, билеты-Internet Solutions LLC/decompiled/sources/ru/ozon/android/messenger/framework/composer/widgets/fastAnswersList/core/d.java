package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core.k;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerTemplateListDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<FastAnswerTemplateListDTO, l20.d, ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> {
    @Override // kotlin.jvm.functions.Function2
    public final ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d invoke(FastAnswerTemplateListDTO fastAnswerTemplateListDTO, l20.d dVar) {
        int i11;
        int i12;
        int intValue;
        int intValue2;
        Integer physicalPartHeight;
        FastAnswerTemplateListDTO dto = fastAnswerTemplateListDTO;
        l20.d widgetInfo = dVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "info");
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<FastAnswerDTO> items = dto.getItems();
        String d11 = widgetInfo.d();
        ArrayList arrayList = new ArrayList();
        int size = items.size();
        for (int i13 = 0; i13 < size; i13++) {
            FastAnswerDTO fastAnswerDTO = items.get(i13);
            if (fastAnswerDTO.getCell() != null) {
                FastAnswerDTO fastAnswerDTO2 = (FastAnswerDTO) C7714v.Q(i13 - 1, items);
                IslandSeparatorDTO islandSeparator = fastAnswerDTO2 != null ? fastAnswerDTO2.getIslandSeparator() : null;
                FastAnswerDTO fastAnswerDTO3 = (FastAnswerDTO) C7714v.Q(i13 + 1, items);
                IslandSeparatorDTO islandSeparator2 = fastAnswerDTO3 != null ? fastAnswerDTO3.getIslandSeparator() : null;
                I i14 = new I();
                I i15 = new I();
                if (islandSeparator != null) {
                    l lVar = new l(i14);
                    IslandSeparatorDTO.Configuration configuration = islandSeparator.getConfiguration();
                    int i16 = configuration == null ? -1 : k.a.f86962a[configuration.ordinal()];
                    if (i16 == 1) {
                        lVar.invoke();
                        Integer physicalPartHeight2 = islandSeparator.getPhysicalPartHeight();
                        if (physicalPartHeight2 != null) {
                            intValue2 = physicalPartHeight2.intValue() / 2;
                            i11 = intValue2;
                        }
                        intValue2 = 0;
                        i11 = intValue2;
                    } else if (i16 != 2) {
                        if (i16 == 3 && (physicalPartHeight = islandSeparator.getPhysicalPartHeight()) != null) {
                            intValue2 = physicalPartHeight.intValue() / 2;
                            i11 = intValue2;
                        }
                        intValue2 = 0;
                        i11 = intValue2;
                    } else {
                        lVar.invoke();
                        Integer physicalPartHeight3 = islandSeparator.getPhysicalPartHeight();
                        if (physicalPartHeight3 != null) {
                            intValue2 = physicalPartHeight3.intValue();
                            i11 = intValue2;
                        }
                        intValue2 = 0;
                        i11 = intValue2;
                    }
                } else {
                    i11 = 0;
                }
                if (islandSeparator2 != null) {
                    m mVar = new m(i15);
                    IslandSeparatorDTO.Configuration configuration2 = islandSeparator2.getConfiguration();
                    int i17 = configuration2 == null ? -1 : k.a.f86962a[configuration2.ordinal()];
                    if (i17 == 1) {
                        mVar.invoke();
                        Integer physicalPartHeight4 = islandSeparator2.getPhysicalPartHeight();
                        if (physicalPartHeight4 != null) {
                            intValue = physicalPartHeight4.intValue() / 2;
                            i12 = intValue;
                        }
                        intValue = 0;
                        i12 = intValue;
                    } else if (i17 != 3) {
                        if (i17 == 4) {
                            mVar.invoke();
                            Integer physicalPartHeight5 = islandSeparator2.getPhysicalPartHeight();
                            if (physicalPartHeight5 != null) {
                                intValue = physicalPartHeight5.intValue();
                                i12 = intValue;
                            }
                        }
                        intValue = 0;
                        i12 = intValue;
                    } else {
                        Integer physicalPartHeight6 = islandSeparator2.getPhysicalPartHeight();
                        if (physicalPartHeight6 != null) {
                            intValue = physicalPartHeight6.intValue() / 2;
                            i12 = intValue;
                        }
                        intValue = 0;
                        i12 = intValue;
                    }
                } else {
                    i12 = 0;
                }
                arrayList.add(new ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.b((d11 + i13).hashCode(), fastAnswerDTO.getCell(), i14.f71783a, i15.f71783a, i11, i12));
            }
        }
        return new ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d(Kk.c.a(widgetInfo.d(), "fastAnswers"), arrayList);
    }
}
