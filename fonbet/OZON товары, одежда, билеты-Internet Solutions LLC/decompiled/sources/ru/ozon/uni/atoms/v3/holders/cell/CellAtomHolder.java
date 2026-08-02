package ru.ozon.uni.atoms.v3.holders.cell;

import OD.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CellDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0019\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u00020\f\"\u0010\b\u0002\u0010\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010*\u0002H\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/cell/CellAtomHolder;", "DTO", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "V", "Landroid/view/View;", "Lru/ozon/uni/atoms/v3/AtomV3;", "view", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "onBind", "", "item", "(Lru/ozon/uni/atoms/data/cell/CellDTO;)V", "applySettings", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "commonCellSettings", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "(Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CellAtomHolder<DTO extends CellDTO, V extends View> extends AtomV3<DTO, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellAtomHolder(@NotNull V view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public static final void _init_$lambda$1(CellAtomHolder cellAtomHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CellDTO cellDTO = (CellDTO) cellAtomHolder.getData();
        CommonCellSettings common = cellDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, cellDTO.getTrackingInfo())) != null) {
            cellAtomHolder.handleAction(atomAction);
            return;
        }
        Object parent = cellAtomHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <V extends MainAddonWrapperV3<?, ?>> void applySettings(V v11, CommonCellSettings commonCellSettings) {
        Boolean hasSeparator = commonCellSettings.getHasSeparator();
        v11.setHasSeparator(hasSeparator != null ? hasSeparator.booleanValue() : false);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = v11.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        v11.setSeparatorColor(styleParser.parseColor(context, commonCellSettings.getSeparatorColor()));
        CommonCellSettings.LayoutPadding layoutPaddingLeft = commonCellSettings.getLayoutPaddingLeft();
        if (layoutPaddingLeft != null) {
            v11.m1862setCellPaddingLeftnOKZfEA(layoutPaddingLeft.getCellLayoutPadding());
        }
        CommonCellSettings.LayoutPadding layoutPaddingRight = commonCellSettings.getLayoutPaddingRight();
        if (layoutPaddingRight != null) {
            v11.m1863setCellPaddingRightnOKZfEA(layoutPaddingRight.getCellLayoutPadding());
        }
    }

    protected void onBind(@NotNull DTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellAtomHolder<DTO, V>) item);
        CommonCellSettings common = item.getCommon();
        if (common != null) {
            V containerView = getContainerView();
            MainAddonWrapperV3 mainAddonWrapperV3 = containerView instanceof MainAddonWrapperV3 ? (MainAddonWrapperV3) containerView : null;
            if (mainAddonWrapperV3 != null) {
                applySettings(mainAddonWrapperV3, common);
            }
        }
    }
}
