package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data;

import Lh.b;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.utils.DecodeBitmapUtilKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$CarriageDTO;", "carriage", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "mapCarriage", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$CarriageDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$StoreyDTO;", "storey", "", "index", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "mapToVO", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$StoreyDTO;I)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "state", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "reqImageHeight", "I", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3Mapper implements Function2<TravelCarriageSelectV3DTO, d, List<? extends TravelCarriageSelectV3VO>> {

    @NotNull
    private final Context context;
    private final int reqImageHeight;

    public TravelCarriageSelectV3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.reqImageHeight = ResourceExtKt.toPx(44, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelCarriageSelectV3VO mapCarriage(TravelCarriageSelectV3DTO.CarriageDTO carriage, d widgetInfo) {
        AtomActionDTO action;
        long a11 = b.a(carriage.hashCode(), widgetInfo.d(), "-");
        TextDTO number = carriage.getNumber();
        TextDTO type = carriage.getType();
        TextDTO serviceType = carriage.getServiceType();
        TravelCarriageSelectV3DTO.PriceBlockDTO priceBlock = carriage.getPriceBlock();
        AtomAction atomAction = null;
        TravelCarriageSelectV3VO.PriceBlockVO priceBlockVO = priceBlock != null ? new TravelCarriageSelectV3VO.PriceBlockVO(MapperExtKt.toVO(priceBlock.getDiscountPriceCard(), this.context), MapperExtKt.toVO(priceBlock.getOriginalPriceCard(), this.context)) : null;
        TextDTO seatsCount = carriage.getSeatsCount();
        TextDTO seatsDetails = carriage.getSeatsDetails();
        List<IconButtonV3DTO> services = carriage.getServices();
        List<TravelCarriageSelectV3DTO.StoreyDTO> storeys = carriage.getStoreys();
        ArrayList arrayList = new ArrayList(C7714v.z(storeys, 10));
        int i11 = 0;
        for (Object obj : storeys) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapToVO((TravelCarriageSelectV3DTO.StoreyDTO) obj, i11));
            i11 = i12;
        }
        TextDTO additionalInfo = carriage.getAdditionalInfo();
        CommonControlSettings common = carriage.getCommon();
        if (common != null && (action = common.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, carriage.getCommon().getTrackingInfo());
        }
        return new TravelCarriageSelectV3VO(a11, number, type, serviceType, priceBlockVO, seatsCount, seatsDetails, services, arrayList, additionalInfo, atomAction, carriage.getPremiumBadge(), carriage.getOriginalPrice());
    }

    private final TravelCarriageSelectV3VO.StoreyVO mapToVO(TravelCarriageSelectV3DTO.StoreyDTO storey, int index) {
        Bitmap decodeBitmap = DecodeBitmapUtilKt.decodeBitmap(storey.getImage().getDarkImageUrl(), this.reqImageHeight);
        Bitmap decodeBitmap2 = DecodeBitmapUtilKt.decodeBitmap(storey.getImage().getLightImageUrl(), this.reqImageHeight);
        TravelCarriageSelectV3VO.StoreyVO storeyVO = new TravelCarriageSelectV3VO.StoreyVO(index, storey.getName());
        storeyVO.setDarkSchemeImage(decodeBitmap);
        storeyVO.setLightSchemeImage(decodeBitmap2);
        return storeyVO;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelCarriageSelectV3VO> invoke(@NotNull TravelCarriageSelectV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return (List) C10727i.d(C10720e0.a(), new TravelCarriageSelectV3Mapper$invoke$1(state, this, widgetInfo, null));
    }
}
