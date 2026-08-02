package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo;

import A00.a;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.model.PersonalInfoVerificationDataModel;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationUpdate;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.view.PersonalInfoVerificationView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R(\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR<\u0010$\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\"j\b\u0012\u0004\u0012\u00020\u0003`#0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R,\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006+"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationDataModel;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;", "component", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;)V", "oldItem", "handlePatronymicSelectionUpdate", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;)Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;)Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "getMapper", "mapper", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationViewMapper extends WidgetViewMapper<PersonalInfoVerificationDataModel, PersonalInfoVerificationVO> {

    @NotNull
    private final PersonalInfoVerificationComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<PersonalInfoVerificationVO>> holderProducer;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckBoxDTO.CheckboxStatus.values().length];
            try {
                iArr[CheckBoxDTO.CheckboxStatus.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.INDETERMINATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PersonalInfoVerificationViewMapper(@NotNull PersonalInfoVerificationComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.b0(PersonalInfoVerificationUpdate.class, PatronymicSelectionUpdate.class);
        this.holderProducer = new PersonalInfoVerificationViewMapper$holderProducer$1(this);
    }

    private final PersonalInfoVerificationVO handlePatronymicSelectionUpdate(PersonalInfoVerificationVO oldItem) {
        CellDTO.LeftBlock leftBlock = oldItem.getPatronymicSettingsCell().getLeftBlock();
        CellDTO.LeftBlock leftBlock2 = null;
        CheckBoxDTO.CheckboxStatus checkboxStatus = null;
        CheckBoxDTO checkBoxDTO = null;
        AtomDTO control = leftBlock != null ? leftBlock.getControl() : null;
        CheckBoxDTO checkBoxDTO2 = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        CheckBoxDTO.CheckboxStatus status = checkBoxDTO2 != null ? checkBoxDTO2.getStatus() : null;
        CellDTO patronymicSettingsCell = oldItem.getPatronymicSettingsCell();
        CellDTO.LeftBlock leftBlock3 = oldItem.getPatronymicSettingsCell().getLeftBlock();
        if (leftBlock3 != null) {
            if (checkBoxDTO2 != null) {
                int i11 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                if (i11 != -1) {
                    if (i11 == 1) {
                        checkboxStatus = CheckBoxDTO.CheckboxStatus.SELECTED;
                    } else if (i11 == 2) {
                        checkboxStatus = CheckBoxDTO.CheckboxStatus.EMPTY;
                    } else {
                        if (i11 != 3) {
                            throw new o();
                        }
                        checkboxStatus = CheckBoxDTO.CheckboxStatus.INDETERMINATE;
                    }
                }
                checkBoxDTO = CheckBoxDTO.copy$default(checkBoxDTO2, null, checkboxStatus, null, null, null, null, null, null, null, null, 1021, null);
            }
            leftBlock2 = CellDTO.LeftBlock.copy$default(leftBlock3, null, null, null, null, null, null, null, checkBoxDTO, 127, null);
        }
        return PersonalInfoVerificationVO.copy$default(oldItem, 0L, null, null, null, null, null, null, CellDTO.copy$default(patronymicSettingsCell, null, null, leftBlock2, null, null, 27, null), null, null, null, 1919, null);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof PersonalInfoVerificationDataModel;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PersonalInfoVerificationView personalInfoVerificationView = new PersonalInfoVerificationView(context, null, 0, 6, null);
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) pVar).topMargin = dimens.getDp8();
        ((ViewGroup.MarginLayoutParams) pVar).bottomMargin = dimens.getDp8();
        personalInfoVerificationView.setLayoutParams(pVar);
        return personalInfoVerificationView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PersonalInfoVerificationVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PersonalInfoVerificationDataModel, d, List<PersonalInfoVerificationVO>> getMapper() {
        return this.component.getPersonalInfoMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public PersonalInfoVerificationVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PersonalInfoVerificationVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof PersonalInfoVerificationUpdate) {
            return ((PersonalInfoVerificationUpdate) update).getPersonalInfo();
        }
        if (update instanceof PatronymicSelectionUpdate) {
            return handlePatronymicSelectionUpdate(oldItem);
        }
        return null;
    }
}
