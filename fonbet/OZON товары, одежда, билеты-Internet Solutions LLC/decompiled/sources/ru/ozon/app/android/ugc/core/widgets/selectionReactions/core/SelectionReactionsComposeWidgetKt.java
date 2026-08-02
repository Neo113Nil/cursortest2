package ru.ozon.app.android.ugc.core.widgets.selectionReactions.core;

import I0.C3173b;
import d00.C6020f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.data.SelectionReactionsDTO;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\n\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\n\u0010\u0010\u001a+\u0010\u0015\u001a\u00020\u0011*\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0019\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "SelectionReactionsWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$Reactions;", "", "voId", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;", "toVO", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$Reactions;J)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsVO;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsBlock;", "", "blockKey", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO$ReactionsBlock;Ljava/lang/String;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "", "selected", "actionId", "switchActionState", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "", "position", "switchControlState", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;ILjava/lang/Boolean;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsBlockVO;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionReactionsComposeWidgetKt {
    @NotNull
    public static final i SelectionReactionsWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("rpProduct", "selectionReactions", null, new SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1(jsonDeserializer), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionReactionsVO switchActionState(SelectionReactionsVO selectionReactionsVO, Boolean bool, String str) {
        AtomActionDTO action;
        String id2;
        SelectionReactionsVO.ReactionsBlockVO leftBlock = selectionReactionsVO.getReactions().getLeftBlock();
        SelectionReactionsVO.ReactionsBlockVO rightBlock = selectionReactionsVO.getReactions().getRightBlock();
        SelectionReactionsVO.ReactionsBlockVO[] elements = {selectionReactionsVO.getReactions().getLeftBlock(), selectionReactionsVO.getReactions().getRightBlock()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = C7705l.B(elements).iterator();
        while (it.hasNext()) {
            SelectionReactionsVO.ReactionsBlockVO reactionsBlockVO = (SelectionReactionsVO.ReactionsBlockVO) it.next();
            int i11 = 0;
            for (Object obj : reactionsBlockVO.getControls()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                CommonControlSettings common = ((SelectionReactionsVO.ReactionsControlVO) obj).getNormal().getCommon();
                if (common != null && (action = common.getAction()) != null) {
                    Map<String, String> params = action.getParams();
                    if (params == null || (id2 = params.get("reaction")) == null) {
                        id2 = action.getId();
                    }
                    if (id2 != null && id2.equals(str)) {
                        SelectionReactionsVO.ReactionsVO reactions = selectionReactionsVO.getReactions();
                        if (reactionsBlockVO.equals(leftBlock)) {
                            leftBlock = switchControlState(leftBlock, i11, bool);
                        }
                        if (reactionsBlockVO.equals(rightBlock)) {
                            rightBlock = switchControlState(rightBlock, i11, bool);
                        }
                        return SelectionReactionsVO.copy$default(selectionReactionsVO, 0L, reactions.copy(leftBlock, rightBlock), null, null, null, null, null, 125, null);
                    }
                }
                i11 = i12;
            }
        }
        return selectionReactionsVO;
    }

    private static final SelectionReactionsVO.ReactionsBlockVO switchControlState(SelectionReactionsVO.ReactionsBlockVO reactionsBlockVO, int i11, Boolean bool) {
        boolean z11;
        boolean z12;
        ArrayList W02 = C7714v.W0(reactionsBlockVO.getControls());
        SelectionReactionsVO.ReactionsControlVO reactionsControlVO = (SelectionReactionsVO.ReactionsControlVO) W02.get(i11);
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            if (reactionsControlVO.getIsSelected()) {
                z11 = false;
                W02.set(i11, SelectionReactionsVO.ReactionsControlVO.copy$default(reactionsControlVO, null, z11, null, null, null, 29, null));
                return SelectionReactionsVO.ReactionsBlockVO.copy$default(reactionsBlockVO, W02, 0, 2, null);
            }
            z12 = true;
        }
        z11 = z12;
        W02.set(i11, SelectionReactionsVO.ReactionsControlVO.copy$default(reactionsControlVO, null, z11, null, null, null, 29, null));
        return SelectionReactionsVO.ReactionsBlockVO.copy$default(reactionsBlockVO, W02, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionReactionsVO.ReactionsVO toVO(SelectionReactionsDTO.Reactions reactions, long j11) {
        SelectionReactionsDTO.ReactionsBlock leftBlock = reactions.getLeftBlock();
        SelectionReactionsVO.ReactionsBlockVO vo = leftBlock != null ? toVO(leftBlock, C3173b.b(j11, "left_")) : null;
        SelectionReactionsDTO.ReactionsBlock rightBlock = reactions.getRightBlock();
        return new SelectionReactionsVO.ReactionsVO(vo, rightBlock != null ? toVO(rightBlock, C3173b.b(j11, "right_")) : null);
    }

    private static final SelectionReactionsVO.ReactionsBlockVO toVO(SelectionReactionsDTO.ReactionsBlock reactionsBlock, String str) {
        IconButtonV3DTO.Sizes size;
        int size2;
        IconButtonV3DTO.Sizes size3;
        int size4;
        List<SelectionReactionsDTO.ReactionsControl> controls = reactionsBlock.getControls();
        ArrayList arrayList = new ArrayList(C7714v.z(controls, 10));
        int i11 = 0;
        for (Object obj : controls) {
            int i12 = i11 + 1;
            AtomAction atomAction = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SelectionReactionsDTO.ReactionsControl reactionsControl = (SelectionReactionsDTO.ReactionsControl) obj;
            String str2 = str + i11;
            boolean isSelected = reactionsControl.isSelected();
            ButtonsDTO normal = reactionsControl.getNormal();
            ButtonsDTO selected = reactionsControl.getSelected();
            AtomActionDTO longTapAction = reactionsControl.getLongTapAction();
            if (longTapAction != null) {
                atomAction = AtomActionMapperKt.toAtomAction(longTapAction, reactionsControl.getLongTapTracking());
            }
            arrayList.add(new SelectionReactionsVO.ReactionsControlVO(str2, isSelected, normal, selected, atomAction));
            i11 = i12;
        }
        Iterator<T> it = reactionsBlock.getControls().iterator();
        if (it.hasNext()) {
            ButtonsDTO normal2 = ((SelectionReactionsDTO.ReactionsControl) it.next()).getNormal();
            if (normal2 instanceof ButtonV3DTO) {
                ButtonV3DTO.Sizes size5 = ((ButtonV3DTO) normal2).getSize();
                if (size5 != null) {
                    size2 = size5.getHeight();
                }
                size2 = 0;
            } else {
                if ((normal2 instanceof IconButtonV3DTO) && (size = ((IconButtonV3DTO) normal2).getSize()) != null) {
                    size2 = size.getSize();
                }
                size2 = 0;
            }
            while (it.hasNext()) {
                ButtonsDTO normal3 = ((SelectionReactionsDTO.ReactionsControl) it.next()).getNormal();
                if (normal3 instanceof ButtonV3DTO) {
                    ButtonV3DTO.Sizes size6 = ((ButtonV3DTO) normal3).getSize();
                    if (size6 != null) {
                        size4 = size6.getHeight();
                    }
                    size4 = 0;
                } else {
                    if ((normal3 instanceof IconButtonV3DTO) && (size3 = ((IconButtonV3DTO) normal3).getSize()) != null) {
                        size4 = size3.getSize();
                    }
                    size4 = 0;
                }
                if (size2 < size4) {
                    size2 = size4;
                }
            }
            return new SelectionReactionsVO.ReactionsBlockVO(arrayList, size2);
        }
        throw new NoSuchElementException();
    }
}
