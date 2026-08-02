package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.data.InstallmentPurchaseV5DTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\rB\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5ProductsListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;Ll20/d;)Ljava/util/List;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5ProductsListMapper implements Function2<InstallmentPurchaseV5DTO, d, List<? extends InstallmentPurchaseV5VO.CreditProductsList>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5ProductsListMapper$Companion;", "", "<init>", "()V", "PRODUCTS_MAX_COUNT", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InstallmentPurchaseV5VO.CreditProductsList> invoke(@NotNull InstallmentPurchaseV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        Object content = state.getContentBlock().getContent();
        InstallmentPurchaseV5DTO.CreditProductsList creditProductsList = content instanceof InstallmentPurchaseV5DTO.CreditProductsList ? (InstallmentPurchaseV5DTO.CreditProductsList) content : null;
        if (creditProductsList != null) {
            String background = state.getBackground();
            Paddings horizontalPaddings = state.getContentBlock().getHorizontalPaddings();
            Paddings topPadding = state.getContentBlock().getTopPadding();
            Paddings bottomPadding = state.getContentBlock().getBottomPadding();
            CommonControlSettings common = creditProductsList.getCommon();
            InstallmentPurchaseV5VO.CommonVO vo = common != null ? InstallmentV5ExtKt.toVO(common, widgetId) : null;
            List<InstallmentPurchaseV5DTO.CreditProductsList.CreditProduct> K02 = C7714v.K0(creditProductsList.getCreditProducts(), 2);
            ArrayList arrayList = new ArrayList(C7714v.z(K02, 10));
            for (InstallmentPurchaseV5DTO.CreditProductsList.CreditProduct creditProduct : K02) {
                TextDTO title = creditProduct.getTitle();
                TextDTO subtitle = creditProduct.getSubtitle();
                ButtonV3DTO copy$default = ButtonV3DTO.copy$default(creditProduct.getButton(), null, null, null, null, null, null, null, null, null, null, null, null, null, creditProduct.getCommon(), null, null, null, 122879, null);
                CommonAtomIconDTO icon = creditProduct.getIcon();
                String background2 = creditProduct.getBackground();
                CommonControlSettings common2 = creditProduct.getCommon();
                arrayList.add(new InstallmentPurchaseV5VO.CreditProductsList.CreditProduct(title, subtitle, copy$default, icon, background2, common2 != null ? InstallmentV5ExtKt.toVO(common2, widgetId) : null));
            }
            List<InstallmentPurchaseV5VO.CreditProductsList> a02 = C7714v.a0(new InstallmentPurchaseV5VO.CreditProductsList(widgetId, background, horizontalPaddings, topPadding, bottomPadding, arrayList, vo));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
