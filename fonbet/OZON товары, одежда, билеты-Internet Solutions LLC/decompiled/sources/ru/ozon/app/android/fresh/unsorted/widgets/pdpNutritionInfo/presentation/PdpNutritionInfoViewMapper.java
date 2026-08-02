package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.di.PdpNutritionInfoComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/di/PdpNutritionInfoComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoSwitched;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoMapper;", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpNutritionInfoViewMapper extends WidgetViewMapper2<PdpNutritionInfoComponent, PdpNutritionInfoDTO, PdpNutritionInfoVO> {

    @NotNull
    private final List<Class<PdpNutritionInfoSwitched>> supportedUpdates = C7714v.a0(PdpNutritionInfoSwitched.class);

    @NotNull
    private final Function2<View, ComposerReferences, PdpNutritionInfoViewHolder> holderProducer = new PdpNutritionInfoViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PdpNutritionInfoView pdpNutritionInfoView = new PdpNutritionInfoView(context, null, 0, 6, null);
        pdpNutritionInfoView.setId(R$id.pdpNutritionInfoView);
        pdpNutritionInfoView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        pdpNutritionInfoView.setBackgroundResource(UniColors.LAYER_FLOOR_1.getResId());
        return pdpNutritionInfoView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, PdpNutritionInfoViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<PdpNutritionInfoSwitched>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PdpNutritionInfoComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PdpNutritionInfoComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public PdpNutritionInfoMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public PdpNutritionInfoVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PdpNutritionInfoVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof PdpNutritionInfoSwitched)) {
            return oldItem;
        }
        PdpNutritionInfoVO.SauceInfo sauceInfo = oldItem.getSauceInfo();
        PdpNutritionInfoVO.SauceInfo sauceInfo2 = null;
        CheckBoxDTO checkBoxDTO = null;
        CellDTO.RightBlock rightBlock = null;
        CellDTO cellDTO = null;
        CellDTO checkBoxCell = sauceInfo != null ? sauceInfo.getCheckBoxCell() : null;
        PdpNutritionInfoSwitched pdpNutritionInfoSwitched = (PdpNutritionInfoSwitched) update;
        PdpNutritionInfoVO.PdpNutritionInfoState newState = pdpNutritionInfoSwitched.getNewState();
        PdpNutritionInfoVO.SauceInfo sauceInfo3 = oldItem.getSauceInfo();
        if (sauceInfo3 != null) {
            if (checkBoxCell != null) {
                CellDTO.RightBlock rightBlock2 = checkBoxCell.getRightBlock();
                if (rightBlock2 != null) {
                    CellDTO.RightBlock rightBlock3 = checkBoxCell.getRightBlock();
                    AtomDTO control = rightBlock3 != null ? rightBlock3.getControl() : null;
                    CheckBoxDTO checkBoxDTO2 = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
                    if (checkBoxDTO2 != null) {
                        checkBoxDTO = CheckBoxDTO.copy$default(checkBoxDTO2, null, pdpNutritionInfoSwitched.getNewState().hasSauce() ? CheckBoxDTO.CheckboxStatus.SELECTED : CheckBoxDTO.CheckboxStatus.EMPTY, null, null, null, null, null, null, null, null, 1021, null);
                    }
                    rightBlock = CellDTO.RightBlock.copy$default(rightBlock2, null, null, null, null, null, null, null, null, null, null, checkBoxDTO, null, 3071, null);
                }
                cellDTO = CellDTO.copy$default(checkBoxCell, null, null, null, rightBlock, null, 23, null);
            }
            sauceInfo2 = PdpNutritionInfoVO.SauceInfo.copy$default(sauceInfo3, cellDTO, null, null, null, 14, null);
        }
        return PdpNutritionInfoVO.copy$default(oldItem, 0L, null, null, null, null, null, sauceInfo2, newState, null, 319, null);
    }
}
