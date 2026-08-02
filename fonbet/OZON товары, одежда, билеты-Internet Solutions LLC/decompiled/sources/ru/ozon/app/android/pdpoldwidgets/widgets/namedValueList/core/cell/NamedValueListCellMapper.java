package ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.cell;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.data.NamedValueListDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.cell.NamedValueListCellVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/cell/NamedValueListCellMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/data/NamedValueListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/cell/NamedValueListCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/data/NamedValueListDTO;Ll20/d;)Ljava/util/List;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NamedValueListCellMapper implements Function2<NamedValueListDTO, d, List<? extends NamedValueListCellVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NamedValueListCellVO> invoke(@NotNull NamedValueListDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<NamedValueListDTO.NamedValue> namedValues = dto.getNamedValues();
        ArrayList arrayList = new ArrayList(C7714v.z(namedValues, 10));
        for (NamedValueListDTO.NamedValue namedValue : namedValues) {
            long hashCode = (namedValue.getName() + " " + widgetInfo.d()).hashCode();
            TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(namedValue.getName());
            TextAtom value = namedValue.getValue();
            arrayList.add(new NamedValueListCellVO(hashCode, dsTextAtom, value != null ? TextMapperKt.getDsTextAtom(value) : null));
        }
        return arrayList;
    }
}
