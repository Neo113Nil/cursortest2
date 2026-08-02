package ru.ozon.app.android.ui.widgets.textWidget.data;

import Lh.b;
import Lm0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;
import ru.ozon.uni.android.cell.listItem.data.ListCellWrapperPreset;
import ru.ozon.uni.android.cell.listItem.data.ListCellWrapperPresets;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.OrderedListCellDTO;
import ru.ozon.uni.atoms.data.cell.UnorderedListCellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0011J1\u0010\r\u001a\u00020\u0016*\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0017J)\u0010\r\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0002¢\u0006\u0004\b\r\u0010\u001aJ\u001b\u0010\r\u001a\u00020\u001c*\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u001dJ-\u0010!\u001a\u00020 2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020\u00022\n\u0010%\u001a\u00060\u0003j\u0002`$H\u0096\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/data/TextWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ui/widgets/textWidget/data/TextWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "", "index", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextVO;", "toVO", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextVO;", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "(Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;I)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "Lru/ozon/uni/atoms/data/cell/OrderedListCellDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atoms", "numberOfItem", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$OrderedListCellVO;", "(Lru/ozon/uni/atoms/data/cell/OrderedListCellDTO;ILjava/util/List;I)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$OrderedListCellVO;", "Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$UnorderedListCellVO;", "(Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;ILjava/util/List;)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$UnorderedListCellVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$ImageVO;", "(Lru/ozon/uni/atoms/data/image/ImageDTO;I)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$ImageVO;", "", "isOrdered", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "getPreset", "(Ljava/util/List;IZ)Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ui/widgets/textWidget/data/TextWidgetDTO;Ll20/d;)Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextWidgetMapper implements Function2<TextWidgetDTO, d, List<? extends TextWidgetVO>> {
    private final ListCellWrapperPreset getPreset(List<? extends AtomDTO> atoms, int index, boolean isOrdered) {
        return (index == C7714v.P(atoms) || (isOrdered && !(atoms.get(index + 1) instanceof OrderedListCellDTO))) ? ListCellWrapperPresets.INSTANCE.getCenterEndTrailing500() : (index == C7714v.P(atoms) || !(isOrdered || (atoms.get(index + 1) instanceof UnorderedListCellDTO))) ? ListCellWrapperPresets.INSTANCE.getCenterEndTrailing500() : ListCellWrapperPresets.INSTANCE.getCenterEndNoTrailing500();
    }

    private final TextWidgetVO.TextWidgetItemVO.TextVO toVO(TextDTO textDTO, int i11) {
        int hashCode = (((Object) textDTO.getText()) + " " + i11).hashCode();
        textDTO.setTagSupported(true);
        Unit unit = Unit.f71690a;
        return new TextWidgetVO.TextWidgetItemVO.TextVO(hashCode, textDTO);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextWidgetVO> invoke(@NotNull TextWidgetDTO state, @NotNull d widgetInfo) {
        Object obj;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ArrayList arrayList = new ArrayList();
        List<AtomDTO> atoms = state.getAtoms();
        ArrayList arrayList2 = new ArrayList(C7714v.z(atoms, 10));
        Iterator<T> it = atoms.iterator();
        int i11 = 1;
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                long hashCode = widgetInfo.d().hashCode();
                CommonCellSettings.LayoutPadding leftPadding = state.getLeftPadding();
                CommonCellSettings.LayoutPadding rightPadding = state.getRightPadding();
                String backgroundColor = state.getBackgroundColor();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new TextWidgetVO(hashCode, arrayList, leftPadding, rightPadding, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            AtomDTO atomDTO = (AtomDTO) next;
            if (atomDTO instanceof TextDTO) {
                arrayList.add(toVO((TextDTO) atomDTO, i12));
                obj = Unit.f71690a;
            } else if (atomDTO instanceof ExpandableTextDTO) {
                arrayList.add(toVO((ExpandableTextDTO) atomDTO, i12));
                obj = Unit.f71690a;
            } else {
                if (atomDTO instanceof OrderedListCellDTO) {
                    TextWidgetVO.TextWidgetItemVO.OrderedListCellVO vo = toVO((OrderedListCellDTO) atomDTO, i12, state.getAtoms(), i11);
                    i11++;
                    obj = Boolean.valueOf(arrayList.add(vo));
                } else if (atomDTO instanceof UnorderedListCellDTO) {
                    arrayList.add(toVO((UnorderedListCellDTO) atomDTO, i12, state.getAtoms()));
                    obj = Unit.f71690a;
                } else if (atomDTO instanceof ImageDTO) {
                    arrayList.add(toVO((ImageDTO) atomDTO, i12));
                    obj = Unit.f71690a;
                } else if (atomDTO instanceof ImageFixedDTO) {
                    arrayList.add(toVO(ImageDTO.INSTANCE.toImage((ImageFixedDTO) atomDTO), i12));
                    obj = Unit.f71690a;
                } else {
                    a.f17149a.e("Wrong item type", new Object[0]);
                    obj = Unit.f71690a;
                }
                arrayList2.add(obj);
                i12 = i13;
            }
            i11 = 1;
            arrayList2.add(obj);
            i12 = i13;
        }
    }

    private final TextWidgetVO.TextWidgetItemVO.TextExpandableVO toVO(ExpandableTextDTO expandableTextDTO, int i11) {
        int hashCode = (((Object) expandableTextDTO.getText()) + " " + i11).hashCode();
        expandableTextDTO.setTagSupported(true);
        Unit unit = Unit.f71690a;
        return new TextWidgetVO.TextWidgetItemVO.TextExpandableVO(hashCode, expandableTextDTO);
    }

    private final TextWidgetVO.TextWidgetItemVO.OrderedListCellVO toVO(OrderedListCellDTO orderedListCellDTO, int i11, List<? extends AtomDTO> list, int i12) {
        return new TextWidgetVO.TextWidgetItemVO.OrderedListCellVO((orderedListCellDTO.getTitle() + " " + i11).hashCode(), orderedListCellDTO, i12, getPreset(list, i11, true));
    }

    private final TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO toVO(UnorderedListCellDTO unorderedListCellDTO, int i11, List<? extends AtomDTO> list) {
        return new TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO((unorderedListCellDTO.getTitle() + " " + i11).hashCode(), unorderedListCellDTO, getPreset(list, i11, false));
    }

    private final TextWidgetVO.TextWidgetItemVO.ImageVO toVO(ImageDTO imageDTO, int i11) {
        return new TextWidgetVO.TextWidgetItemVO.ImageVO(b.a(i11, imageDTO.getImage(), " "), imageDTO);
    }
}
