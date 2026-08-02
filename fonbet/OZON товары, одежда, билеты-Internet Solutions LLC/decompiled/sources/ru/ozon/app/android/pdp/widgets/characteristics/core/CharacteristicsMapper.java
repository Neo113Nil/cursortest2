package ru.ozon.app.android.pdp.widgets.characteristics.core;

import WZ.t;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.characteristics.data.CharacteristicsDTO;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsButton;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsHeader;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsItem;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsType;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsVO;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsValues;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJC\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u0010*\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004*\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001b\u0010\u0012\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u001aJ\u0013\u0010\u0012\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u0012\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/core/CharacteristicsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "", "isSelect", "<init>", "(Z)V", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$Characteristics;", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$ShortHeightButton;", "shortHeightButton", "", "widgetId", "Lkotlin/Pair;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsItem;", "toVo", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$ShortHeightButton;J)Lkotlin/Pair;", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$Characteristics$ValuesDto;", "", "characteristicsLimit", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsValues;", "(Ljava/util/List;IJ)Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsButton;", "(Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$ShortHeightButton;J)Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsButton;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsHeader;", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsHeader;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "toHtmlSpannable", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO;Ll20/d;)Ljava/util/List;", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsMapper implements Function2<CharacteristicsDTO, d, List<? extends CharacteristicsVO>> {
    private final boolean isSelect;

    public CharacteristicsMapper(boolean z11) {
        this.isSelect = z11;
    }

    private final OzonSpannableString toHtmlSpannable(OzonSpannableString ozonSpannableString) {
        OzonSpannableString ozonSpannableString2 = new OzonSpannableString(ozonSpannableString);
        ozonSpannableString2.setSpan(new URLSpan(""), 0, ozonSpannableString2.length(), 33);
        ozonSpannableString2.setSpan(new UnderlineSpan(), 0, ozonSpannableString2.length(), 33);
        return ozonSpannableString2;
    }

    private final Pair<List<CharacteristicsItem>, List<CharacteristicsItem>> toVo(List<CharacteristicsDTO.Characteristics> list, CharacteristicsDTO.ShortHeightButton shortHeightButton, long j11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CharacteristicsDTO.Characteristics characteristics : list) {
            CharacteristicsHeader vo = toVo(characteristics.getHeader());
            List<CharacteristicsValues> vo2 = toVo(characteristics.getValues(), characteristics.getValues().size(), j11);
            arrayList2.add(vo);
            C7714v.p(vo2, arrayList2);
            if (shortHeightButton != null && arrayList.isEmpty()) {
                int characteristicsLimit = shortHeightButton.getCharacteristicsLimit();
                int size = characteristics.getValues().size();
                if (characteristicsLimit > size) {
                    characteristicsLimit = size;
                }
                List<CharacteristicsValues> vo3 = toVo(characteristics.getValues(), characteristicsLimit, j11);
                arrayList.add(vo);
                C7714v.p(vo3, arrayList);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CharacteristicsVO> invoke(@NotNull CharacteristicsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Pair<List<CharacteristicsItem>, List<CharacteristicsItem>> vo = toVo(state.getCharacteristics(), state.getShortHeightButton(), hashCode);
        List<CharacteristicsItem> a11 = vo.a();
        List<CharacteristicsItem> b11 = vo.b();
        boolean isEmpty = a11.isEmpty();
        String tabGroupId = state.getTabGroupId();
        String backgroundColor = state.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        CharacteristicsDTO.ShortHeightButton shortHeightButton = state.getShortHeightButton();
        return C7714v.a0(new CharacteristicsVO(hashCode, tabGroupId, str, a11, b11, shortHeightButton != null ? toVo(shortHeightButton, hashCode) : null, isEmpty, isEmpty, tokenizedEvent$default));
    }

    private final List<CharacteristicsValues> toVo(List<CharacteristicsDTO.Characteristics.ValuesDto> list, int i11, long j11) {
        List K02 = C7714v.K0(list, i11);
        ArrayList arrayList = new ArrayList(C7714v.z(K02, 10));
        int i12 = 1;
        int i13 = 0;
        for (Object obj : K02) {
            int i14 = i13 + 1;
            String str = null;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            CharacteristicsDTO.Characteristics.ValuesDto valuesDto = (CharacteristicsDTO.Characteristics.ValuesDto) obj;
            TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(valuesDto.getValue());
            TextDTO copy$default = TextDTO.copy$default(dsTextAtom, (!this.isSelect || valuesDto.getAction() == null) ? dsTextAtom.getText() : toHtmlSpannable(dsTextAtom.getText()), null, null, null, null, null, null, null, null, null, null, null, null, this.isSelect && valuesDto.getAction() != null, null, null, null, null, null, 516094, null);
            CharacteristicsType characteristicsType = valuesDto.getAction() == null ? CharacteristicsType.SIMPLE_VALUE : CharacteristicsType.VALUE;
            long j12 = i13;
            TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(valuesDto.getName(), null, null, null, CommonCellSettings.LayoutPadding.PADDING_300, null, null, null, null, null, null, null, true, 2039, null);
            Icon icon = valuesDto.getIcon();
            AtomActionDTO action = valuesDto.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, valuesDto.getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = valuesDto.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            if (valuesDto.getIcon() != null && valuesDto.getAction() != null) {
                str = String.valueOf(i12);
                i12++;
            }
            arrayList.add(new CharacteristicsValues(j12, characteristicsType, dsTextAtom$default, copy$default, icon, atomAction, tokenizedEvent$default, str));
            i13 = i14;
        }
        return arrayList;
    }

    private final CharacteristicsButton toVo(CharacteristicsDTO.ShortHeightButton shortHeightButton, long j11) {
        TextDTO copy$default = TextDTO.copy$default(TextMapperKt.dsTextAtom$default(shortHeightButton.getText(), null, null, null, null, null, null, null, null, null, 1, null, true, 1535, null), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, shortHeightButton.getIcon().getImage(), shortHeightButton.getIcon().getTintColor(), CommonAtomLabelDTO.IconPosition.END, null, 294911, null);
        Map<String, TokenizedTrackingInfo> trackingInfo = shortHeightButton.getTrackingInfo();
        return new CharacteristicsButton(copy$default, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final CharacteristicsHeader toVo(TextAtom textAtom) {
        return new CharacteristicsHeader(textAtom.getText().hashCode(), CharacteristicsType.HEADER, TextMapperKt.dsTextAtom$default(textAtom, null, null, null, null, null, null, null, null, null, null, null, true, 2047, null));
    }
}
