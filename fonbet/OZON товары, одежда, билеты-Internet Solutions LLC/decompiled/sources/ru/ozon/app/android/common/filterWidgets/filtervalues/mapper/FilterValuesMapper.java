package ru.ozon.app.android.common.filterWidgets.filtervalues.mapper;

import Sc.InterfaceC4008j;
import Sc.k;
import T00.a;
import Tc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsDTO;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsVO;
import ru.ozon.app.android.common.domain.roundcellsutils.RounderCellsUtilsKt;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesVO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBox;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBoxWithIcon;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.DescriptionCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.MegaCellCheckboxFilter;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.RoundedCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.TitleCell;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 O2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001OB\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004*\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004*\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u000b*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u001e\u001a\u00020\u000b*\u00020 H\u0002¢\u0006\u0004\b\u001e\u0010!J\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u000b*\u00020\"H\u0002¢\u0006\u0004\b\u001e\u0010#J\u0013\u0010\u001e\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b\u001e\u0010&J\u0013\u0010)\u001a\u00020(*\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010.\u001a\u00020-*\u00020'2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J/\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004*\b\u0012\u0004\u0012\u0002000\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00102JU\u00109\u001a\u00020\u001a*\u00020\u00182\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0004\u0018\u00010'*\u0004\u0018\u000105H\u0002¢\u0006\u0004\b;\u0010<J*\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u00104\u001a\u00020\u00022\n\u0010>\u001a\u00060\u0003j\u0002`=H\u0096\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010\u001e\u001a\u00020\u0005*\u00020\u00022\u0006\u0010A\u001a\u00020'H\u0000¢\u0006\u0004\bB\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010DR\u001b\u0010G\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010HR\u0014\u0010N\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010H¨\u0006P"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/mapper/FilterValuesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "extractModels", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;)Ljava/util/List;", "", "mapToCells", "(Ljava/util/List;)Ljava/util/List;", "mapToCell", "(Ljava/lang/Object;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lru/ozon/app/android/atoms/data/cells/CellAtom;", "", "isNeedRoundTop", "isNeedRoundBottom", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/AtomDTO;", "cellTransform", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/RoundedCell;", "atomsToRoundedCells", "(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "toVO", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$WrappedCell;", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$WrappedCell;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/DescriptionCell;", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/DescriptionCell;", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/HeaderCell;", "toHeaderCell", "(Ljava/lang/String;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/HeaderCell;", "", "topCornersRadius", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/TitleCell;", "toTitleCell", "(Ljava/lang/String;F)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/TitleCell;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "toRoundedCells", "(Ljava/util/List;ZZ)Ljava/util/List;", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsDTO;", "state", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "index", "toVo", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;IZZLkotlin/jvm/functions/Function1;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/RoundedCell;", "getId", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Ljava/lang/String;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;Ll20/d;)Ljava/util/List;", "stateId", "toVO$filter_widgets_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;Ljava/lang/String;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "Lru/ozon/app/android/utils/AppType;", "isSelect$delegate", "LSc/j;", "isSelect", "()Z", "defaultHorizontalMargin", "I", "deeplink", "Ljava/lang/String;", "isSelectFilterValues", "isSelectCurrencyValues", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesMapper implements Function2<FilterValuesDTO, d, List<? extends FilterValuesVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float ROUNDED_CORNER_SIZE = UiExtKt.toPxF(24.0f);

    @NotNull
    private final AppType appType;
    private String deeplink;
    private final int defaultHorizontalMargin;

    /* renamed from: isSelect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSelect;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/mapper/FilterValuesMapper$Companion;", "", "<init>", "()V", "", "DEFAULT_ROUNDED_CELLS_TOP_MARGIN", "I", "DEFAULT_ROUNDED_CELLS_BOTTOM_MARGIN", "", "IS_SELECTED_PROPERTY_NAME", "Ljava/lang/String;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FilterValuesMapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.isSelect = k.b(new FilterValuesMapper$isSelect$2(this));
        this.defaultHorizontalMargin = ResourceExtKt.toPx(16);
    }

    private final List<RoundedCell> atomsToRoundedCells(List<? extends CellAtom> list, boolean z11, boolean z12, Function1<? super AtomDTO, ? extends AtomDTO> function1) {
        RoundedCellsDTO roundedCellsDTO = new RoundedCellsDTO(isSelectFilterValues() ? UniColorsSelect.LAYER_FLOOR_0_SELECT.getToken() : null, isSelectFilterValues() ? UniColors.LAYER_FLOOR_1.getToken() : null, list);
        List<AtomDTO> cells = roundedCellsDTO.getCells();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cells) {
            if (obj instanceof CellAtom) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellAtom cellAtom = (CellAtom) obj2;
            boolean z13 = z11;
            arrayList2.add(toVo(cellAtom, roundedCellsDTO, cellAtom.getAction(), i11, z13, z12, function1));
            z11 = z13;
            i11 = i12;
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List atomsToRoundedCells$default(FilterValuesMapper filterValuesMapper, List list, boolean z11, boolean z12, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return filterValuesMapper.atomsToRoundedCells(list, z11, z12, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0072, code lost:
    
        if (r1 != kotlin.collections.C7714v.P(r14.getSections())) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<FilterValuesCell> extractModels(FilterValuesDTO filterValuesDTO) {
        FilterValuesDTO.Section section;
        boolean z11;
        float f7;
        Object obj;
        b builder = C7714v.B();
        TextAtom description = filterValuesDTO.getDescription();
        if (description != null) {
            builder.add(toVO(description));
        }
        int i11 = 0;
        for (Object obj2 : filterValuesDTO.getSections()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FilterValuesDTO.Section section2 = (FilterValuesDTO.Section) obj2;
            boolean z12 = true;
            if (section2.getTitle() == null) {
                section = section2;
                z11 = true;
            } else {
                section = section2;
                z11 = false;
            }
            List<FilterValuesDTO.Section> sections = filterValuesDTO.getSections();
            if (!(sections instanceof Collection) || !sections.isEmpty()) {
                Iterator<T> it = sections.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((FilterValuesDTO.Section) it.next()).getHeader() != null) {
                        if (section.getTitle() != null) {
                        }
                    }
                }
            }
            z12 = false;
            String header = section.getHeader();
            if (header != null) {
                builder.add(toHeaderCell(header));
            }
            String title = section.getTitle();
            if (title != null) {
                if (isSelectFilterValues()) {
                    Iterator<T> it2 = filterValuesDTO.getSections().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((FilterValuesDTO.Section) obj).getTitle() != null) {
                            break;
                        }
                    }
                    FilterValuesDTO.Section section3 = (FilterValuesDTO.Section) obj;
                    if (Intrinsics.d(section3 != null ? section3.getTitle() : null, title)) {
                        f7 = ROUNDED_CORNER_SIZE;
                        builder.add(toTitleCell(title, f7));
                    }
                }
                f7 = 0.0f;
                builder.add(toTitleCell(title, f7));
            }
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> roundedCells = section.getRoundedCells();
            if (roundedCells != null) {
                builder.addAll(toRoundedCells(roundedCells, z11, z12));
            }
            List<? extends Object> values = section.getValues();
            if (values != null) {
                if (isSelectFilterValues()) {
                    List<? extends Object> list = values;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
                            arrayList.add(obj3);
                        }
                    }
                    boolean z13 = z12;
                    builder.addAll(atomsToRoundedCells$default(this, arrayList, z11, z13, null, 4, null));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
                            arrayList2.add(obj4);
                        }
                    }
                    builder.addAll(atomsToRoundedCells(arrayList2, z11, z13, new FilterValuesMapper$extractModels$1$2$4$1(this)));
                }
                builder.addAll(mapToCells(values));
            }
            i11 = i12;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final String getId(AtomActionDTO atomActionDTO) {
        Map<String, String> params;
        if (atomActionDTO == null || (params = atomActionDTO.getParams()) == null) {
            return null;
        }
        String str = params.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (str == null && (str = params.get("currency_code")) == null) ? params.get("locale") : str;
    }

    private final boolean isSelect() {
        return ((Boolean) this.isSelect.getValue()).booleanValue();
    }

    private final boolean isSelectCurrencyValues() {
        String str;
        return isSelect() && (str = this.deeplink) != null && h.t(str, "/modal/currencySelector", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSelectFilterValues() {
        String str;
        return isSelect() && (str = this.deeplink) != null && h.t(str, "/modal/filterValues", false);
    }

    private final FilterValuesCell mapToCell(Object obj) {
        if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
            return toVO((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) obj);
        }
        if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
            return toVO((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) obj);
        }
        if (obj instanceof FilterValuesDTO.WrappedCell) {
            return toVO((FilterValuesDTO.WrappedCell) obj);
        }
        return null;
    }

    private final List<FilterValuesCell> mapToCells(List<? extends Object> list) {
        if (!isSelectFilterValues()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                FilterValuesCell mapToCell = mapToCell(it.next());
                if (mapToCell != null) {
                    arrayList.add(mapToCell);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FilterValuesDTO) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            FilterValuesCell mapToCell2 = mapToCell((FilterValuesDTO) it2.next());
            if (mapToCell2 != null) {
                arrayList3.add(mapToCell2);
            }
        }
        return arrayList3;
    }

    private final HeaderCell toHeaderCell(String str) {
        return new HeaderCell(String.valueOf(str.hashCode()), isSelectFilterValues(), str, true, false);
    }

    private final List<RoundedCell> toRoundedCells(List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> list, boolean z11, boolean z12) {
        String token = isSelectFilterValues() ? UniColorsSelect.LAYER_FLOOR_0_SELECT.getToken() : UniColors.LAYER_FLOOR_1.getToken();
        String token2 = isSelectFilterValues() ? UniColors.LAYER_FLOOR_1.getToken() : UniColors.BG_SECONDARY.getToken();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) it.next(), null, null, false, false, false, null, true, null, null, null, null, null, null, null, false, false, null, null, null, 524223, null));
        }
        RoundedCellsDTO roundedCellsDTO = new RoundedCellsDTO(token, token2, arrayList);
        List<AtomDTO> cells = roundedCellsDTO.getCells();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : cells) {
            if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
        int i11 = 0;
        for (Object obj2 : arrayList2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio = (CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) obj2;
            arrayList3.add(toVo(cellWithSubtitle40IconCheckboxRadio, roundedCellsDTO, cellWithSubtitle40IconCheckboxRadio.getAction(), i11, z11, z12, new FilterValuesMapper$toRoundedCells$1$1(this)));
            i11 = i12;
        }
        return arrayList3;
    }

    private final TitleCell toTitleCell(String str, float f7) {
        return new TitleCell(String.valueOf(str.hashCode()), isSelect(), str, f7, isSelectFilterValues(), isSelectCurrencyValues());
    }

    private final FilterValuesCell toVO(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter cellWithSubtitle24IconCheckboxRadioCounter) {
        String id2 = getId(cellWithSubtitle24IconCheckboxRadioCounter.getAction());
        if (id2 == null) {
            id2 = String.valueOf(cellWithSubtitle24IconCheckboxRadioCounter.hashCode());
        }
        return new CheckBoxWithIcon(id2, isSelectFilterValues(), cellWithSubtitle24IconCheckboxRadioCounter);
    }

    private final RoundedCell toVo(AtomDTO atomDTO, RoundedCellsDTO roundedCellsDTO, AtomActionDTO atomActionDTO, int i11, boolean z11, boolean z12, Function1<? super AtomDTO, ? extends AtomDTO> function1) {
        Float f7;
        AtomDTO invoke;
        String id2 = getId(atomActionDTO);
        if (id2 == null) {
            id2 = String.valueOf(atomDTO.hashCode());
        }
        String str = id2;
        boolean z13 = (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) && isSelectFilterValues();
        Float f11 = null;
        RoundedCellsVO roundedCellsVO = new RoundedCellsVO(0L, (function1 == null || (invoke = function1.invoke(atomDTO)) == null) ? atomDTO : invoke, RounderCellsUtilsKt.determineLayoutModel$default(roundedCellsDTO.getCells(), i11, null, null, Integer.valueOf(isSelectFilterValues() ? 0 : 8), 8, Integer.valueOf(isSelectFilterValues() ? 0 : this.defaultHorizontalMargin), Integer.valueOf(isSelectFilterValues() ? 0 : this.defaultHorizontalMargin), isSelectFilterValues() ? Float.valueOf(UiExtKt.toPxF(0.0f)) : null, isSelectFilterValues() ? Float.valueOf(UiExtKt.toPxF(0.0f)) : null, 12, null), roundedCellsDTO.getWidgetBackgroundColor(), roundedCellsDTO.getCellsBackgroundColor());
        RoundedCellsVO.LayoutModel.Companion companion = RoundedCellsVO.LayoutModel.INSTANCE;
        Integer valueOf = Integer.valueOf(i11 == 0 ? ResourceExtKt.toPx(16) : ResourceExtKt.toPx(8));
        if (!z13) {
            valueOf = null;
        }
        Integer valueOf2 = Integer.valueOf(i11 == C7714v.P(roundedCellsDTO.getCells()) ? ResourceExtKt.toPx(16) : ResourceExtKt.toPx(8));
        if (!z13) {
            valueOf2 = null;
        }
        Integer valueOf3 = Integer.valueOf(isSelectFilterValues() ? 0 : 8);
        Integer valueOf4 = Integer.valueOf(isSelectFilterValues() ? 0 : 8);
        Integer valueOf5 = Integer.valueOf(isSelectFilterValues() ? 0 : this.defaultHorizontalMargin);
        Integer valueOf6 = Integer.valueOf(isSelectFilterValues() ? 0 : this.defaultHorizontalMargin);
        if (isSelectFilterValues()) {
            f7 = Float.valueOf(z11 ? ROUNDED_CORNER_SIZE : UiExtKt.toPxF(0.0f));
        } else {
            f7 = null;
        }
        if (isSelectFilterValues()) {
            f11 = Float.valueOf(z12 ? ROUNDED_CORNER_SIZE : UiExtKt.toPxF(0.0f));
        }
        return new RoundedCell(str, isSelectFilterValues(), roundedCellsVO, companion.createWithDefaultValues(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, f7, f11));
    }

    @NotNull
    public final FilterValuesVO toVO$filter_widgets_prodGoogleAllVendorsRelease(@NotNull FilterValuesDTO filterValuesDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(filterValuesDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        List<FilterValuesCell> extractModels = extractModels(filterValuesDTO);
        return new FilterValuesVO(hashCode, filterValuesDTO.getFilter(), filterValuesDTO.getDescription(), filterValuesDTO.getSearchBar(), filterValuesDTO.getApplyButton(), extractModels, isSelect());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FilterValuesVO> invoke(@NotNull FilterValuesDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        a b11 = widgetInfo.b();
        this.deeplink = b11 != null ? b11.c() : null;
        return C7714v.a0(toVO$filter_widgets_prodGoogleAllVendorsRelease(state, widgetInfo.d()));
    }

    private final FilterValuesCell toVO(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter) {
        String id2 = getId(cellWithSubtitleCheckboxRadioCounter.getAction());
        if (id2 == null) {
            id2 = String.valueOf(cellWithSubtitleCheckboxRadioCounter.hashCode());
        }
        return new CheckBox(id2, isSelectFilterValues(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default(cellWithSubtitleCheckboxRadioCounter, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 1048575, null));
    }

    private final FilterValuesCell toVO(FilterValuesDTO.WrappedCell wrappedCell) {
        AtomActionDTO action;
        String id2;
        AtomActionDTO action2;
        Map<String, String> params;
        String str;
        CommonControlSettings common = wrappedCell.getCell().getCommon();
        if (common == null || (action = common.getAction()) == null || (id2 = getId(action)) == null) {
            return null;
        }
        CellDTO cell = wrappedCell.getCell();
        Map<String, TokenizedTrackingInfo> trackingInfo = wrappedCell.getTrackingInfo();
        Map<String, TokenizedTrackingInfo> selectedTrackingInfo = wrappedCell.getSelectedTrackingInfo();
        CommonControlSettings common2 = wrappedCell.getCell().getCommon();
        return new MegaCellCheckboxFilter(id2, isSelect(), cell, trackingInfo, selectedTrackingInfo, (common2 == null || (action2 = common2.getAction()) == null || (params = action2.getParams()) == null || (str = params.get("isSelected")) == null) ? false : Boolean.parseBoolean(str));
    }

    private final DescriptionCell toVO(TextAtom textAtom) {
        return new DescriptionCell(String.valueOf(textAtom.hashCode()), isSelect(), textAtom);
    }
}
