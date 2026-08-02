package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data.PassengersMatcherV2DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.PassengersMatcherV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO$CategoryDTO;", "category", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$CategoryVO;", "mapCategoryToVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO$CategoryDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$CategoryVO;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cell", "", "indexCategory", "indexCell", "cellsSize", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$PassengerCellVO;", "mapPassengerCellsToVO", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;III)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$PassengerCellVO;", "index", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel;", "determineLayoutModel", "(II)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO;Ll20/d;)Ljava/util/List;", "", "cellsRadius", "F", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersMatcherV2Mapper implements Function2<PassengersMatcherV2DTO, d, List<? extends PassengersMatcherV2VO>> {
    private final float cellsRadius;

    public PassengersMatcherV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cellsRadius = ResourceExtKt.toPxF(16, context);
    }

    private final PassengersMatcherV2VO.LayoutModel determineLayoutModel(int index, int cellsSize) {
        if (cellsSize != 1) {
            return index == 0 ? new PassengersMatcherV2VO.LayoutModel(this.cellsRadius, 0.0f, PassengersMatcherV2VO.LayoutModel.Position.START) : index == cellsSize - 1 ? new PassengersMatcherV2VO.LayoutModel(0.0f, this.cellsRadius, PassengersMatcherV2VO.LayoutModel.Position.END) : new PassengersMatcherV2VO.LayoutModel(0.0f, 0.0f, PassengersMatcherV2VO.LayoutModel.Position.MIDDLE);
        }
        float f7 = this.cellsRadius;
        return new PassengersMatcherV2VO.LayoutModel(f7, f7, PassengersMatcherV2VO.LayoutModel.Position.SINGLE);
    }

    private final PassengersMatcherV2VO.PassengersMatcherItemVO.CategoryVO mapCategoryToVO(PassengersMatcherV2DTO.CategoryDTO category) {
        return new PassengersMatcherV2VO.PassengersMatcherItemVO.CategoryVO(String.valueOf(category.getCategoryTitle()).hashCode(), category.getCategoryTitle());
    }

    private final PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO mapPassengerCellsToVO(CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell, int indexCategory, int indexCell, int cellsSize) {
        OzonSpannableString title = cell.getTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(indexCategory);
        sb2.append(indexCell);
        sb2.append((Object) title);
        return new PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO(sb2.toString().hashCode(), cell, determineLayoutModel(indexCell, cellsSize));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PassengersMatcherV2VO> invoke(@NotNull PassengersMatcherV2DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : dto.getCategories()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            PassengersMatcherV2DTO.CategoryDTO categoryDTO = (PassengersMatcherV2DTO.CategoryDTO) obj;
            arrayList.add(mapCategoryToVO(categoryDTO));
            int i13 = 0;
            for (Object obj2 : categoryDTO.getPassengerCells()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(mapPassengerCellsToVO((CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault) obj2, i11, i13, categoryDTO.getPassengerCells().size()));
                i13 = i14;
            }
            i11 = i12;
        }
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        TextAtom subtitle = dto.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new PassengersMatcherV2VO(hashCode, title, subtitle, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
