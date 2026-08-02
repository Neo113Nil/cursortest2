package ru.ozon.app.android.action.sheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.sheet.data.ActionSheetDTO;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\f\u001a\u00020\u0006*\u00020\rH\u0002\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"toVO", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "Lru/ozon/app/android/action/sheet/data/ActionSheetDTO;", "id", "", "addCancelButton", "", "createCells", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "customBehaviors", "Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", "isSupported", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "action_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionSheetVOKt {

    @NotNull
    private static final List<AtomActionDTO.Behavior> customBehaviors = C7714v.b0(AtomActionDTO.Behavior.CUSTOM, AtomActionDTO.Behavior.COMPOSER_ACTION);

    private static final List<AtomDTO> createCells(ActionSheetDTO actionSheetDTO, boolean z11) {
        List<AtomDTO> cells = actionSheetDTO.getCells();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cells) {
            AtomDTO atomDTO = (AtomDTO) obj;
            if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon ? isSupported((CellAtom.CellAtomWithSubtitle) atomDTO) : atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault ? isSupported((CellAtom.CellAtomWithSubtitle) atomDTO) : false) {
                arrayList.add(obj);
            }
        }
        if (!z11) {
            return arrayList;
        }
        StyleParser.OzColor ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY;
        return C7714v.q0(new CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon("ic_m_cross", ozColor.getValue(), true, null, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_button_cancel)), ozColor.getValue(), null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "cancel", null, 10, null), true, false, null, null, null, 124824, null), arrayList);
    }

    private static final boolean isSupported(CellAtom.CellAtomWithSubtitle cellAtomWithSubtitle) {
        AtomActionDTO action = cellAtomWithSubtitle.getAction();
        if (!C7714v.A(customBehaviors, action != null ? action.getBehavior() : null)) {
            return true;
        }
        Map<String, AtomActionSheetHandler.SheetAction> values = AtomActionSheetHandler.SheetAction.INSTANCE.getValues();
        AtomActionDTO action2 = cellAtomWithSubtitle.getAction();
        return values.containsKey(action2 != null ? action2.getId() : null);
    }

    @NotNull
    public static final ActionSheetVO toVO(@NotNull ActionSheetDTO actionSheetDTO, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(actionSheetDTO, "<this>");
        String title = actionSheetDTO.getTitle();
        List<AtomDTO> createCells = createCells(actionSheetDTO, z11);
        Map<String, TokenizedTrackingInfo> trackingInfo = actionSheetDTO.getTrackingInfo();
        return new ActionSheetVO(title, createCells, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    public static /* synthetic */ ActionSheetVO toVO$default(ActionSheetDTO actionSheetDTO, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return toVO(actionSheetDTO, j11, z11);
    }
}
