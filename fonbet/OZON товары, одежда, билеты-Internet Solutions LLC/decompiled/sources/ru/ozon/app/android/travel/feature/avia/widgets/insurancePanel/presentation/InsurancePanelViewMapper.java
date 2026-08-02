package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation;

import A00.a;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data.InsurancePanelDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.di.InsurancePanelComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelVO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R0\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060*j\u0002`+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\"¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/di/InsurancePanelComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;)Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InsurancePanelViewMapper extends WidgetViewMapper2<InsurancePanelComponent, InsurancePanelDTO, InsurancePanelVO> {
    private final int layout = R$layout.widget_insurance_panel;

    @NotNull
    private final Function2<View, ComposerReferences, InsurancePanelWidgetViewHolder> holderProducer = new InsurancePanelViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<InsurancePanelUpdate>> supportedUpdates = C7714v.a0(InsurancePanelUpdate.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, InsurancePanelWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<InsurancePanelDTO, d, List<InsurancePanelVO>> getMapper() {
        return component().getInsurancePanelMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<InsurancePanelUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<InsurancePanelComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return InsurancePanelComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull InsurancePanelVO oldItem, @NotNull InsurancePanelVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getSelectedInsuranceInd() != newItem.getSelectedInsuranceInd()) {
            return newItem;
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public InsurancePanelVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull InsurancePanelVO oldItem) {
        InsurancePanelVO.InsuranceVO copy;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof InsurancePanelUpdate)) {
            return null;
        }
        Integer valueOf = Integer.valueOf(((InsurancePanelUpdate) update).getSelectedInsuranceInd());
        int intValue = valueOf.intValue();
        if (intValue == -1 || intValue >= oldItem.getInsurances().size()) {
            valueOf = null;
        }
        int intValue2 = valueOf != null ? valueOf.intValue() : 0;
        List<InsurancePanelVO.InsuranceVO> insurances = oldItem.getInsurances();
        ArrayList arrayList = new ArrayList(C7714v.z(insurances, 10));
        int i11 = 0;
        for (Object obj : insurances) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            copy = r9.copy((r27 & 1) != 0 ? r9.id : 0L, (r27 & 2) != 0 ? r9.title : null, (r27 & 4) != 0 ? r9.price : null, (r27 & 8) != 0 ? r9.subtitle : null, (r27 & 16) != 0 ? r9.logoLink : null, (r27 & 32) != 0 ? r9.selectButton : null, (r27 & 64) != 0 ? r9.benefits : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r9.badge : null, (r27 & 256) != 0 ? r9.isSelected : i11 == intValue2, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r9.trackingInfo : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r9.isSingleItem : false, (r27 & 2048) != 0 ? ((InsurancePanelVO.InsuranceVO) obj).detailedConditionsButton : null);
            arrayList.add(copy);
            i11 = i12;
        }
        return InsurancePanelVO.copy$default(oldItem, 0L, null, null, arrayList, intValue2, oldItem.getInsurances().get(intValue2).getSelectButton(), null, 71, null);
    }
}
