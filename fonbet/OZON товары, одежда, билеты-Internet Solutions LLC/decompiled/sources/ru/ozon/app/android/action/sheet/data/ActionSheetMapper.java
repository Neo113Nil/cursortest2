package ru.ozon.app.android.action.sheet.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.sheet.ActionSheetVO;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005*\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u000f0\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/action/sheet/data/ActionSheetMapper;", "", "<init>", "()V", "customBehaviors", "", "Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", "map", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "widgetId", "", "dto", "Lru/ozon/app/android/action/sheet/data/ActionSheetDTO;", "(Ljava/lang/Long;Lru/ozon/app/android/action/sheet/data/ActionSheetDTO;)Lru/ozon/app/android/action/sheet/ActionSheetVO;", "createCells", "Lru/ozon/uni/atoms/data/AtomDTO;", "hasCancelButtonCell", "", "createCancelButtonCell", "isSupported", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionSheetMapper {

    @NotNull
    private final List<AtomActionDTO.Behavior> customBehaviors = C7714v.b0(AtomActionDTO.Behavior.CUSTOM, AtomActionDTO.Behavior.COMPOSER_ACTION);

    private final AtomDTO createCancelButtonCell() {
        StyleParser.OzColor ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY;
        return new CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon("ic_m_cross", ozColor.getValue(), true, null, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_button_cancel)), ozColor.getValue(), null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), true, false, null, null, null, 124824, null);
    }

    private final List<AtomDTO> createCells(ActionSheetDTO actionSheetDTO) {
        List<AtomDTO> cells = actionSheetDTO.getCells();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cells) {
            AtomDTO atomDTO = (AtomDTO) obj;
            if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon ? isSupported((CellAtom.CellAtomWithSubtitle) atomDTO) : atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon ? isSupported((CellAtom.CellAtomWithSubtitle) atomDTO) : atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault ? isSupported((CellAtom.CellAtomWithSubtitle) atomDTO) : false) {
                arrayList.add(obj);
            }
        }
        return hasCancelButtonCell(arrayList) ? arrayList : C7714v.q0(createCancelButtonCell(), arrayList);
    }

    private final boolean hasCancelButtonCell(List<? extends AtomDTO> list) {
        C7747g.a aVar;
        Iterator it = l.w(l.h(C7714v.w(list), ActionSheetMapper$hasCancelButtonCell$$inlined$filterIsInstance$1.INSTANCE), ActionSheetMapper$hasCancelButtonCell$1.INSTANCE).iterator();
        do {
            aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return false;
            }
        } while (((AtomActionDTO.Behavior) aVar.next()) != AtomActionDTO.Behavior.DISMISS);
        return true;
    }

    private final boolean isSupported(CellAtom.CellAtomWithSubtitle cellAtomWithSubtitle) {
        AtomActionDTO action = cellAtomWithSubtitle.getAction();
        if (!C7714v.A(this.customBehaviors, action != null ? action.getBehavior() : null)) {
            AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.INVALID_ACTION;
            return true;
        }
        Map<String, AtomActionSheetHandler.SheetAction> values = AtomActionSheetHandler.SheetAction.INSTANCE.getValues();
        AtomActionDTO action2 = cellAtomWithSubtitle.getAction();
        return values.containsKey(action2 != null ? action2.getId() : null);
    }

    @NotNull
    public final ActionSheetVO map(Long widgetId, @NotNull ActionSheetDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String title = dto.getTitle();
        List<AtomDTO> createCells = createCells(dto);
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new ActionSheetVO(title, createCells, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, widgetId, null, 2, null) : null);
    }
}
