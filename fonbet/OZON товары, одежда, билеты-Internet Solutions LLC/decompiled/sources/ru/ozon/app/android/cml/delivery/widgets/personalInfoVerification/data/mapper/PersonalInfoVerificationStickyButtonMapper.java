package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.button.data.CmlButtonMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.model.PersonalInfoVerificationStickyButtonModel;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons.PersonalInfoVerificationStickyButtonVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationStickyButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationStickyButtonModel;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;", "cmlButtonMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;)V", "model", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationStickyButtonModel;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationStickyButtonMapper implements Function2<PersonalInfoVerificationStickyButtonModel, d, List<? extends PersonalInfoVerificationStickyButtonVO>> {

    @NotNull
    private final CmlButtonMapper cmlButtonMapper;

    public PersonalInfoVerificationStickyButtonMapper(@NotNull CmlButtonMapper cmlButtonMapper) {
        Intrinsics.checkNotNullParameter(cmlButtonMapper, "cmlButtonMapper");
        this.cmlButtonMapper = cmlButtonMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PersonalInfoVerificationStickyButtonVO> invoke(@NotNull PersonalInfoVerificationStickyButtonModel model, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new PersonalInfoVerificationStickyButtonVO(WidgetExtKt.getWidgetId(widgetInfo), this.cmlButtonMapper.map(model.getConfirmButton())));
    }
}
