package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.data.HelpInsuranceDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.HelpInsuranceVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020\u00022\n\u0010%\u001a\u00060\u0003j\u0002`$H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Case;", "case", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$CaseVO;", "mapCase", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Case;)Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$CaseVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Tab;", "tab", "", "iconSelectedTabTintColor", "", "textSelectedTintColor", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$TabVO;", "mapTab", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Tab;ILjava/lang/String;)Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$TabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Step;", "step", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$StepVO;", "mapStep", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Step;)Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$StepVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Warning;", "warning", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$WarningVO;", "mapWarning", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Warning;)Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$WarningVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HelpInsuranceMapper implements Function2<HelpInsuranceDTO, d, List<? extends HelpInsuranceVO>> {

    @NotNull
    private final Context context;

    public HelpInsuranceMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final HelpInsuranceVO.CaseVO mapCase(HelpInsuranceDTO.Case r62) {
        TextAtom title = r62.getTitle();
        TextAtom subtitle = r62.getSubtitle();
        List<HelpInsuranceDTO.Step> instructions = r62.getInstructions();
        ArrayList arrayList = new ArrayList(C7714v.z(instructions, 10));
        Iterator<T> it = instructions.iterator();
        while (it.hasNext()) {
            arrayList.add(mapStep((HelpInsuranceDTO.Step) it.next()));
        }
        return new HelpInsuranceVO.CaseVO(title, subtitle, arrayList, r62.getWarning() != null ? mapWarning(r62.getWarning()) : null);
    }

    private final HelpInsuranceVO.StepVO mapStep(HelpInsuranceDTO.Step step) {
        OzonSpannableString text = step.getTitle().getText();
        OzonSpannableString text2 = step.getDescription().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        return new HelpInsuranceVO.StepVO(sb2.toString().hashCode(), step.getTitle(), step.getDescription());
    }

    private final HelpInsuranceVO.TabVO mapTab(HelpInsuranceDTO.Tab tab, int iconSelectedTabTintColor, String textSelectedTintColor) {
        return new HelpInsuranceVO.TabVO(tab.getTitle().hashCode(), tab.getTitle(), tab.isSelected(), iconSelectedTabTintColor, textSelectedTintColor, tab.getTabIcon() != null, tab.getTabIcon() != null ? new HelpInsuranceVO.IconVO(tab.getTabIcon().getImage(), Integer.valueOf(StyleParser.INSTANCE.parseColor(this.context, tab.getTabIcon().getTintColor(), R$color.graphic_secondary))) : null);
    }

    private final HelpInsuranceVO.WarningVO mapWarning(HelpInsuranceDTO.Warning warning) {
        return new HelpInsuranceVO.WarningVO(new HelpInsuranceVO.IconVO(warning.getIcon().getImage(), Integer.valueOf(StyleParser.INSTANCE.parseColor(this.context, warning.getIcon().getTintColor(), R$color.graphic_secondary))), warning.getTitle());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HelpInsuranceVO> invoke(@NotNull HelpInsuranceDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int parseColor = StyleParser.INSTANCE.parseColor(this.context, state.getSelectedTintColor(), R$color.graphic_primary);
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        List<HelpInsuranceDTO.Case> cases = state.getCases();
        ArrayList arrayList = new ArrayList(C7714v.z(cases, 10));
        Iterator<T> it = cases.iterator();
        while (it.hasNext()) {
            arrayList.add(mapCase((HelpInsuranceDTO.Case) it.next()));
        }
        List<HelpInsuranceDTO.Case> cases2 = state.getCases();
        ArrayList arrayList2 = new ArrayList(C7714v.z(cases2, 10));
        Iterator<T> it2 = cases2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(mapTab(((HelpInsuranceDTO.Case) it2.next()).getTab(), parseColor, state.getSelectedTintColor()));
        }
        ButtonV3Atom.LargeButton closeButton = state.getCloseButton();
        Iterator<HelpInsuranceDTO.Case> it3 = state.getCases().iterator();
        int i11 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i11 = -1;
                break;
            }
            if (it3.next().getTab().isSelected()) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        return C7714v.a0(new HelpInsuranceVO(hashCode, title, arrayList, arrayList2, closeButton, valueOf != null ? valueOf.intValue() : 0, -1, -1));
    }
}
