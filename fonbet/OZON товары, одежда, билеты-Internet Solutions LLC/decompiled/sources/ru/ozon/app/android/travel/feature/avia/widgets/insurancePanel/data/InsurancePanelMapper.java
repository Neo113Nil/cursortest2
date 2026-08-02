package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data.InsurancePanelDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelVO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Insurance;", "insurance", "", "isSingle", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$InsuranceVO;", "mapToInsuranceVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Insurance;Z)Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$InsuranceVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Benefit;", "benefit", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$BenefitVO;", "mapToBenefitVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Benefit;)Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$BenefitVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsurancePanelMapper implements Function2<InsurancePanelDTO, d, List<? extends InsurancePanelVO>> {
    private final InsurancePanelVO.BenefitVO mapToBenefitVO(InsurancePanelDTO.Benefit benefit) {
        return new InsurancePanelVO.BenefitVO(benefit.getTitle().hashCode(), benefit.getStatusIcon(), benefit.getTitle(), benefit.getSubtitle());
    }

    private final InsurancePanelVO.InsuranceVO mapToInsuranceVO(InsurancePanelDTO.Insurance insurance, boolean isSingle) {
        long hashCode = TextUtils.concat(insurance.getTitle().getText(), insurance.getPrice().getPrice()).hashCode();
        TextAtom title = insurance.getTitle();
        Price price = insurance.getPrice();
        TextAtom subtitle = insurance.getSubtitle();
        String logoLink = insurance.getLogoLink();
        ButtonV3Atom.LargeButton selectButton = insurance.getSelectButton();
        List<InsurancePanelDTO.Benefit> benefits = insurance.getBenefits();
        ArrayList arrayList = new ArrayList(C7714v.z(benefits, 10));
        Iterator<T> it = benefits.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToBenefitVO((InsurancePanelDTO.Benefit) it.next()));
        }
        return new InsurancePanelVO.InsuranceVO(hashCode, title, price, subtitle, logoLink, selectButton, arrayList, insurance.getBadge(), insurance.isSelected(), insurance.getTrackingInfo(), isSingle, insurance.getDetailedConditionsButton());
    }

    private final InsurancePanelVO mapToVO(InsurancePanelDTO dto, String stateId) {
        Iterator<InsurancePanelDTO.Insurance> it = dto.getInsurances().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().isSelected()) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        long hashCode = stateId.hashCode();
        TextAtom title = dto.getTitle();
        LinkButtonDTO moreInfoButton = dto.getMoreInfoButton();
        LinkButtonVO vo = moreInfoButton != null ? MapperExtKt.toVO(moreInfoButton) : null;
        List<InsurancePanelDTO.Insurance> insurances = dto.getInsurances();
        ArrayList arrayList = new ArrayList(C7714v.z(insurances, 10));
        for (InsurancePanelDTO.Insurance insurance : insurances) {
            boolean z11 = true;
            if (dto.getInsurances().size() != 1) {
                z11 = false;
            }
            arrayList.add(mapToInsuranceVO(insurance, z11));
        }
        return new InsurancePanelVO(hashCode, title, vo, arrayList, intValue, dto.getInsurances().isEmpty() ? null : dto.getInsurances().get(intValue).getSelectButton(), dto.getCancelButton());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InsurancePanelVO> invoke(@NotNull InsurancePanelDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapToVO(state, widgetInfo.d()));
    }
}
