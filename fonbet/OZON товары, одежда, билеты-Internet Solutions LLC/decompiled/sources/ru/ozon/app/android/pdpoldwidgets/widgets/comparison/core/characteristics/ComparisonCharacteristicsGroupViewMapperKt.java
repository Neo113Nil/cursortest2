package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicType;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicsGroupVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.CharacteristicsGroupDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"toViewObject", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO;", "stateId", "", "isExpanded", "", "columnToViewObject", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicType;", "column", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonCharacteristicsGroupViewMapperKt {
    public static final CharacteristicType columnToViewObject(@NotNull Object column) {
        Intrinsics.checkNotNullParameter(column, "column");
        if (column instanceof Badge) {
            return new CharacteristicType.Badge(BadgeMapperKt.mapToDsBadge((Badge) column));
        }
        if (column instanceof CharacteristicsGroupDTO.Characteristic.Color) {
            CharacteristicsGroupDTO.Characteristic.Color color = (CharacteristicsGroupDTO.Characteristic.Color) column;
            return new CharacteristicType.Color(color.getTitle(), color.getColors());
        }
        if (column instanceof CharacteristicsGroupDTO.Characteristic.Image) {
            CharacteristicsGroupDTO.Characteristic.Image image = (CharacteristicsGroupDTO.Characteristic.Image) column;
            return new CharacteristicType.Image(image.getTitle(), image.getUrl());
        }
        if (column instanceof CharacteristicsGroupDTO.Characteristic.Rating) {
            CharacteristicsGroupDTO.Characteristic.Rating rating = (CharacteristicsGroupDTO.Characteristic.Rating) column;
            return new CharacteristicType.Rating(rating.getRatingAtom(), rating.getDeeplink());
        }
        if (!(column instanceof CharacteristicsGroupDTO.Characteristic.TextCharacteristics)) {
            return null;
        }
        List<CharacteristicsGroupDTO.Characteristic.TextCharacteristics.Text> values = ((CharacteristicsGroupDTO.Characteristic.TextCharacteristics) column).getValues();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        for (CharacteristicsGroupDTO.Characteristic.TextCharacteristics.Text text : values) {
            arrayList.add(new CharacteristicType.TextCharacteristics.Text(text.getValue(), text.getTrackingInfo()));
        }
        return new CharacteristicType.TextCharacteristics(arrayList);
    }

    @NotNull
    public static final CharacteristicsGroupVO toViewObject(@NotNull CharacteristicsGroupDTO characteristicsGroupDTO, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(characteristicsGroupDTO, "<this>");
        String title = characteristicsGroupDTO.getTitle();
        List<CharacteristicsGroupDTO.Characteristic> characteristics = characteristicsGroupDTO.getCharacteristics();
        ArrayList arrayList = new ArrayList(C7714v.z(characteristics, 10));
        for (CharacteristicsGroupDTO.Characteristic characteristic : characteristics) {
            String title2 = characteristic.getTitle();
            List<Object> columns = characteristic.getColumns();
            ArrayList arrayList2 = new ArrayList(C7714v.z(columns, 10));
            Iterator<T> it = columns.iterator();
            while (it.hasNext()) {
                arrayList2.add(columnToViewObject(it.next()));
            }
            arrayList.add(new CharacteristicsGroupVO.Characteristic(title2, arrayList2));
        }
        return new CharacteristicsGroupVO(j11, title, arrayList, z11);
    }
}
