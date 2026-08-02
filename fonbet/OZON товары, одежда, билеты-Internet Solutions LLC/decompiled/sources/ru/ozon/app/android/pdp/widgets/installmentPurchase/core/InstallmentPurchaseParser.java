package ru.ozon.app.android.pdp.widgets.installmentPurchase.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentDtoWrapper$Periods;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentDtoWrapper$Purchase;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentDtoWrapper$Title;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentPurchaseDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005B\u0015\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/InstallmentPurchaseParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstallmentPurchaseParser implements Function2<String, String, List<Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public InstallmentPurchaseParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        InstallmentPurchaseDTO installmentPurchaseDTO = (InstallmentPurchaseDTO) jsonParser.fromJson(state, InstallmentPurchaseDTO.class);
        ArrayList arrayList = new ArrayList();
        if (installmentPurchaseDTO.getTitleBlock() != null) {
            arrayList.add(new InstallmentDtoWrapper$Title(installmentPurchaseDTO.getTitleBlock().getTitle(), installmentPurchaseDTO.getTitleBlock().getBadge(), installmentPurchaseDTO.getAction(), installmentPurchaseDTO.getTrackingInfo()));
        }
        arrayList.add(new InstallmentDtoWrapper$Purchase(installmentPurchaseDTO.getPrice(), installmentPurchaseDTO.getAction(), installmentPurchaseDTO.getAnimationTimer(), installmentPurchaseDTO.getAnimationTrackingInfo(), installmentPurchaseDTO.getTrackingInfo(), installmentPurchaseDTO.getOnboarding(), installmentPurchaseDTO.getShowTopRounding(), installmentPurchaseDTO.getBadges() != null, installmentPurchaseDTO.getPriceIcon(), installmentPurchaseDTO.getInnerBackground(), installmentPurchaseDTO.getChevronIcon()));
        if (installmentPurchaseDTO.getBadges() != null) {
            arrayList.add(new InstallmentDtoWrapper$Periods(installmentPurchaseDTO.getBadges(), installmentPurchaseDTO.getAction(), installmentPurchaseDTO.getTrackingInfo(), installmentPurchaseDTO.getInnerBackground()));
        }
        return arrayList;
    }
}
