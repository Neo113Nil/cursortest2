package ru.ozon.app.android.account.orders.barcode.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.data.BarcodeDTO;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeVO;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/data/BarcodeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO$Shipment;", "list", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "toVO", "(Ljava/util/List;)Ljava/util/List;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeMapper implements Function2<BarcodeDTO, d, List<? extends BarcodeVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/data/BarcodeMapper$Companion;", "", "<init>", "()V", "SHARE_ICON_NAME", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final List<BarcodeVO.Shipment> toVO(@NotNull List<BarcodeDTO.Shipment> list) {
        List<BarcodeDTO.Shipment> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "list");
        List<BarcodeDTO.Shipment> list3 = list2;
        ArrayList arrayList = new ArrayList(C7714v.z(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            BarcodeDTO.Shipment shipment = (BarcodeDTO.Shipment) it.next();
            String packageTitle = shipment.getPackageTitle();
            String hint = shipment.getHint();
            String code = shipment.getCode();
            TextAtom description = shipment.getDescription();
            TextAtom info = shipment.getInfo();
            DisclaimerAtom annotation = shipment.getAnnotation();
            boolean z11 = list2.size() == 1;
            IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_450;
            ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.ACTION_SECONDARY;
            AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
            Iterator it2 = it;
            Pair pair = new Pair("code", shipment.getCode());
            Pair pair2 = new Pair("text", StringProvider.getString(R$string.barcode_sharing_message));
            String hint2 = shipment.getHint();
            if (hint2 == null) {
                hint2 = "";
            }
            arrayList.add(new BarcodeVO.Shipment(packageTitle, hint, code, description, info, annotation, z11, new IconButtonV3DTO(sizes, styleTypes, null, "ic_m_share_universal_filled", null, null, null, new CommonControlSettings(new AtomActionDTO(behavior, null, "shareBarcode", U.j(pair, pair2, new Pair("visibleCode", hint2), new Pair("propertiesTitle", StringProvider.getString(R$string.share_code))), 2, null), null, null, 6, null), null, null, null, null, null, null, 16244, null)));
            list2 = list;
            it = it2;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BarcodeVO> invoke(@NotNull BarcodeDTO state, @NotNull d widgetInfo) {
        Object obj;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<BarcodeVO.Shipment> vo = toVO(state.getShipments());
        Boolean isExpanded = state.isExpanded();
        boolean booleanValue = isExpanded != null ? isExpanded.booleanValue() : false;
        Iterator<T> it = state.getShipments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((BarcodeDTO.Shipment) obj).getOnboarding() != null) {
                break;
            }
        }
        BarcodeDTO.Shipment shipment = (BarcodeDTO.Shipment) obj;
        return C7714v.a0(new BarcodeVO(hashCode, vo, booleanValue, shipment != null ? shipment.getOnboarding() : null));
    }
}
