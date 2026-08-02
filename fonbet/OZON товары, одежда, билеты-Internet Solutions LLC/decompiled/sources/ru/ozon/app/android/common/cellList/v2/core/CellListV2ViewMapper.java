package ru.ozon.app.android.common.cellList.v2.core;

import A00.a;
import Bl.b;
import Dq.C2878a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.actionHandlers.UpdateCellRadioSelectionKey;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingUpdateVO;
import ru.ozon.app.android.common.actionHandlers.setPublicProfile.UpdateCellToggleKey;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.common.cellList.v2.presentation.CellV2VO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.storefront.domain.events.DisableActionUpdate;
import ru.ozon.app.android.storefront.domain.events.UpdateCellRightIcon;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001fj\b\u0012\u0004\u0012\u00020\u0002` 2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&R7\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060(j\u0002`)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040*0'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00101\u001a\u0004\u0018\u0001008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R<\u00108\u001a$\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u000205\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000406j\b\u0012\u0004\u0012\u00020\u0004`70'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010.R(\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130;0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/common/cellList/v2/core/CellListWidgetComponent;", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;", "<init>", "()V", "oldItem", "revertCellToggle", "(Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;)Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;", "", "selectedId", "updateCellRadioSelection", "(Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;J)Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "isSelected", "selectControl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;)Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper$delegate", "LSc/j;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "cell-list_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CellListV2ViewMapper extends WidgetViewMapper2<CellListWidgetComponent, CellListV2DTO, CellV2VO> {
    private final Integer layout;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = LazyUtilsKt.unsafeLazy(CellListV2ViewMapper$mapper$2.INSTANCE);

    @NotNull
    private final Function2<View, ComposerReferences, k<CellV2VO>> holderProducer = new CellListV2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ApplySortingUpdateVO.class, UpdateCellRadioSelectionKey.class, UpdateCellToggleKey.class, UpdateCellRightIcon.class, DisableActionUpdate.class);

    private final CellV2VO revertCellToggle(CellV2VO oldItem) {
        Boolean isSelected;
        AtomDTO cell = oldItem.getCell();
        CellDTO.RightBlock rightBlock = null;
        r2 = null;
        Boolean bool = null;
        ToggleDTO toggleDTO = null;
        CellDTO cellDTO = cell instanceof CellDTO ? (CellDTO) cell : null;
        if (cellDTO == null) {
            return oldItem;
        }
        CellDTO.RightBlock rightBlock2 = cellDTO.getRightBlock();
        if (rightBlock2 != null) {
            CellDTO.RightBlock rightBlock3 = cellDTO.getRightBlock();
            AtomDTO control = rightBlock3 != null ? rightBlock3.getControl() : null;
            ToggleDTO toggleDTO2 = control instanceof ToggleDTO ? (ToggleDTO) control : null;
            if (toggleDTO2 != null) {
                CellDTO.RightBlock rightBlock4 = cellDTO.getRightBlock();
                AtomDTO control2 = rightBlock4 != null ? rightBlock4.getControl() : null;
                ToggleDTO toggleDTO3 = control2 instanceof ToggleDTO ? (ToggleDTO) control2 : null;
                if (toggleDTO3 != null && (isSelected = toggleDTO3.isSelected()) != null) {
                    bool = Boolean.valueOf(!isSelected.booleanValue());
                }
                toggleDTO = ToggleDTO.copy$default(toggleDTO2, bool, null, null, null, null, null, 62, null);
            }
            rightBlock = CellDTO.RightBlock.copy$default(rightBlock2, null, null, null, null, null, null, null, null, null, null, toggleDTO, null, 3071, null);
        }
        return CellV2VO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, CellDTO.copy$default(cellDTO, null, null, null, rightBlock, null, 23, null), null, null, 1791, null);
    }

    private final CellDTO selectControl(CellDTO cellDTO, boolean z11) {
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        AtomDTO control = rightBlock != null ? rightBlock.getControl() : null;
        if (!(control instanceof RadioDTO)) {
            return cellDTO;
        }
        CellDTO.RightBlock rightBlock2 = cellDTO.getRightBlock();
        return CellDTO.copy$default(cellDTO, null, null, null, rightBlock2 != null ? CellDTO.RightBlock.copy$default(rightBlock2, null, null, null, null, null, null, null, null, null, null, RadioDTO.copy$default((RadioDTO) control, null, Boolean.valueOf(z11), null, null, null, null, 61, null), null, 3071, null) : null, null, 23, null);
    }

    private final CellV2VO updateCellRadioSelection(CellV2VO oldItem, long selectedId) {
        return oldItem.getCell() instanceof CellDTO ? CellV2VO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, selectControl((CellDTO) oldItem.getCell(), oldItem.getId() == selectedId), null, null, 1791, null) : oldItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CellListWidgetComponent widgetComponent$lambda$1(C7475g c7475g) {
        return DaggerCellListWidgetComponent.factory().create((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CellListV2DTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SingleAtom singleAtom = (SingleAtom) b.a(SingleAtom.class, "type", q.f64554a, null);
        if (singleAtom == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        }
        singleAtom.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return singleAtom;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CellV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CellListV2DTO, d, List<CellV2VO>> getMapper() {
        return (Function2) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CellListWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CellListWidgetComponent.class), new C2878a(storage, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r1 != null) goto L18;
     */
    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CellV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CellV2VO oldItem) {
        AtomActionDTO action;
        AtomDTO cell;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        RadioDTO radioDTO = null;
        r4 = null;
        String str = null;
        CommonControlSettings common = null;
        if (update instanceof ApplySortingUpdateVO) {
            AtomDTO cell2 = oldItem.getCell();
            RadioTitleSubtitleCellDTO radioTitleSubtitleCellDTO = cell2 instanceof RadioTitleSubtitleCellDTO ? (RadioTitleSubtitleCellDTO) cell2 : null;
            if (radioTitleSubtitleCellDTO != null) {
                RadioDTO radio = ((RadioTitleSubtitleCellDTO) oldItem.getCell()).getRadio();
                if (radio != null) {
                    radioDTO = RadioDTO.copy$default(radio, null, Boolean.valueOf(oldItem.getId() == ((ApplySortingUpdateVO) update).getId()), null, null, null, null, 61, null);
                }
                cell = RadioTitleSubtitleCellDTO.copy$default(radioTitleSubtitleCellDTO, null, null, null, null, radioDTO, 15, null);
            }
            cell = oldItem.getCell();
            return CellV2VO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, cell, null, null, 1791, null);
        }
        if (update instanceof UpdateCellRadioSelectionKey) {
            return updateCellRadioSelection(oldItem, ((UpdateCellRadioSelectionKey) update).getId());
        }
        if (update instanceof UpdateCellToggleKey) {
            AtomDTO cell3 = oldItem.getCell();
            CellDTO cellDTO = cell3 instanceof CellDTO ? (CellDTO) cell3 : null;
            if (cellDTO != null) {
                CommonControlSettings common2 = cellDTO.getCommon();
                if (common2 != null && (action = common2.getAction()) != null) {
                    str = action.getId();
                }
                if (Intrinsics.d(str, ((UpdateCellToggleKey) update).getAction().getId())) {
                    return revertCellToggle(oldItem);
                }
            }
            return oldItem;
        }
        if (!(update instanceof UpdateCellRightIcon)) {
            if ((update instanceof DisableActionUpdate) && oldItem.getId() == ((DisableActionUpdate) update).getId()) {
                AtomDTO cell4 = oldItem.getCell();
                CellDTO cellDTO2 = cell4 instanceof CellDTO ? (CellDTO) cell4 : null;
                if (cellDTO2 != null) {
                    CommonControlSettings common3 = cellDTO2.getCommon();
                    return CellV2VO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, CellDTO.copy$default(cellDTO2, null, null, null, null, common3 != null ? CommonControlSettings.copy$default(common3, null, null, null, 6, null) : null, 15, null), null, null, 1791, null);
                }
            }
            return oldItem;
        }
        UpdateCellRightIcon updateCellRightIcon = (UpdateCellRightIcon) update;
        if (oldItem.getId() == updateCellRightIcon.getId()) {
            AtomDTO cell5 = oldItem.getCell();
            CellDTO cellDTO3 = cell5 instanceof CellDTO ? (CellDTO) cell5 : null;
            if (cellDTO3 != null) {
                CellDTO.RightBlock rightBlock = updateCellRightIcon.getRightBlock();
                if (updateCellRightIcon.getDisableClick()) {
                    CommonControlSettings common4 = cellDTO3.getCommon();
                    if (common4 != null) {
                        common = CommonControlSettings.copy$default(common4, null, null, null, 6, null);
                    }
                } else {
                    common = cellDTO3.getCommon();
                }
                return CellV2VO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, CellDTO.copy$default(cellDTO3, null, null, null, rightBlock, common, 7, null), null, null, 1791, null);
            }
        }
        return oldItem;
    }
}
