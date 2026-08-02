package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarVO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateSectionDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/core/RateMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO;", "sections", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "mapSections", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtom", "", "maxLines", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$HeaderText;", "getTextSection", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$HeaderText;", "sectionValue", "getSection", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO;)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateMapper implements Function2<RateDTO, d, List<? extends RateVO>> {

    @NotNull
    private final AppType appType;

    public RateMapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
    }

    private final List<RateSection> getSection(RateSectionDTO sectionValue) {
        int hashCode = sectionValue.getKey().hashCode();
        Object body = sectionValue.getBody();
        if (body instanceof RateSectionDTO.CheckboxIconSection) {
            List<RateSectionDTO.CheckboxIconValue> cells = ((RateSectionDTO.CheckboxIconSection) body).getCells();
            ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
            for (RateSectionDTO.CheckboxIconValue checkboxIconValue : cells) {
                String key = sectionValue.getKey();
                Boolean isRequired = sectionValue.getIsRequired();
                arrayList.add(new RateSection.RequiredSection.SectionCheckboxIcon(hashCode, key, isRequired != null ? isRequired.booleanValue() : false, checkboxIconValue.getIndex(), checkboxIconValue.getCell()));
            }
            return arrayList;
        }
        if (body instanceof RateSectionDTO.IconSection) {
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon> cells2 = ((RateSectionDTO.IconSection) body).getCells();
            ArrayList arrayList2 = new ArrayList(C7714v.z(cells2, 10));
            Iterator<T> it = cells2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new RateSection.SectionIcon(hashCode, (CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon) it.next()));
            }
            return arrayList2;
        }
        if (!(body instanceof RateSectionDTO.CheckboxSection)) {
            if (body instanceof TextAtom) {
                return C7714v.a0(new RateSection.SectionText(hashCode, (TextAtom) body));
            }
            if (!(body instanceof RateSectionDTO.TextInputSection)) {
                return K.f71697a;
            }
            String key2 = sectionValue.getKey();
            Boolean isRequired2 = sectionValue.getIsRequired();
            RateSectionDTO.TextInputSection textInputSection = (RateSectionDTO.TextInputSection) body;
            return C7714v.a0(new RateSection.RequiredSection.SectionTextInput(hashCode, key2, isRequired2 != null ? isRequired2.booleanValue() : false, textInputSection.getPlaceholder(), textInputSection.getMaxCharactersNumber()));
        }
        List<RateSectionDTO.CheckboxValue> cells3 = ((RateSectionDTO.CheckboxSection) body).getCells();
        ArrayList arrayList3 = new ArrayList(C7714v.z(cells3, 10));
        for (RateSectionDTO.CheckboxValue checkboxValue : cells3) {
            String key3 = sectionValue.getKey();
            Boolean isRequired3 = sectionValue.getIsRequired();
            arrayList3.add(new RateSection.RequiredSection.SectionCheckbox(hashCode, key3, isRequired3 != null ? isRequired3.booleanValue() : false, checkboxValue.getIndex(), checkboxValue.getCell()));
        }
        return arrayList3;
    }

    private final RateSection.HeaderText getTextSection(TextAtom textAtom, Integer maxLines) {
        if (textAtom == null) {
            return null;
        }
        int hashCode = textAtom.getText().hashCode();
        Integer maxLines2 = textAtom.getMaxLines();
        return new RateSection.HeaderText(hashCode, TextAtom.copy$default(textAtom, null, null, null, maxLines2 == null ? maxLines : maxLines2, null, null, null, 119, null));
    }

    private final List<RateSection> mapSections(List<RateSectionDTO> sections) {
        List<RateSectionDTO> list = sections;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getSection((RateSectionDTO) it.next()));
        }
        return C7714v.N(arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RateVO> invoke(@NotNull RateDTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String c11 = widgetInfo.c().c();
        long hashCode = c11 != null ? c11.hashCode() : 0;
        ButtonV3Atom.SmallIconButton backButton = state.getNavbar().getBackButton();
        TextAtom title = state.getNavbar().getTitle();
        Integer maxLines = state.getNavbar().getTitle().getMaxLines();
        TextAtom copy$default = TextAtom.copy$default(title, null, null, null, Integer.valueOf(maxLines != null ? maxLines.intValue() : 1), null, null, null, 119, null);
        ButtonV3Atom.SmallIconButton exitButton = state.getNavbar().getExitButton();
        ButtonV3Atom.SmallIconButton exitButton2 = state.getNavbar().getExitButton();
        FeedbackNavbarVO feedbackNavbarVO = new FeedbackNavbarVO(hashCode, backButton, copy$default, exitButton, (exitButton2 == null || (action = exitButton2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()));
        RateDTO.PageHeader pageHeader = state.getPageHeader();
        RateSection.HeaderText textSection = getTextSection(pageHeader != null ? pageHeader.getTitle() : null, 2);
        RateDTO.PageHeader pageHeader2 = state.getPageHeader();
        ArrayList I11 = C7714v.I(C7714v.p0(mapSections(state.getSections()), C7714v.b0(textSection, getTextSection(pageHeader2 != null ? pageHeader2.getSubtitle() : null, 3))));
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new RateVO(hashCode, feedbackNavbarVO, I11, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, this.appType == AppType.SELECT));
    }
}
