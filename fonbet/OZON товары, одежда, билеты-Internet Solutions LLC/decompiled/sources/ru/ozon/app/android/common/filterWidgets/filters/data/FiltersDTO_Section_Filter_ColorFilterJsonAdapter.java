package ru.ozon.app.android.common.filterWidgets.filters.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.color.ColorAtom;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018¨\u0006-"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO_Section_Filter_ColorFilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableLargeBorderlessButtonAdapter", "", "Lru/ozon/app/android/atoms/data/color/ColorAtom;", "nullableListOfColorAtomAdapter", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorIcon;", "nullableListOfColorIconAdapter", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "nullableListOfColorAspectAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiltersDTO_Section_Filter_ColorFilterJsonAdapter extends JsonAdapter<FiltersDTO.Section.Filter.ColorFilter> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> nullableLargeBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<List<FiltersDTO.ColorAspect>> nullableListOfColorAspectAdapter;

    @NotNull
    private final JsonAdapter<List<ColorAtom>> nullableListOfColorAtomAdapter;

    @NotNull
    private final JsonAdapter<List<FiltersDTO.ColorIcon>> nullableListOfColorIconAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FiltersDTO_Section_Filter_ColorFilterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "action", "trackingInfo", "rightButton", "colors", "colorIcons", "colorAspects", "scrollEnabled", "rightIcon");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "icon");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableLargeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "rightButton");
        this.nullableListOfColorAtomAdapter = moshi.f(D.e(List.class, ColorAtom.class), m11, "colors");
        this.nullableListOfColorIconAdapter = moshi.f(D.e(List.class, FiltersDTO.ColorIcon.class), m11, "colorIcons");
        this.nullableListOfColorAspectAdapter = moshi.f(D.e(List.class, FiltersDTO.ColorAspect.class), m11, "colorAspects");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "scrollEnabled");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "rightIcon");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(FiltersDTO.Section.Filter.ColorFilter)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FiltersDTO.Section.Filter.ColorFilter fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        Icon icon = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = null;
        List<ColorAtom> list = null;
        List<FiltersDTO.ColorIcon> list2 = null;
        List<FiltersDTO.ColorAspect> list3 = null;
        Boolean bool = null;
        IconDTO iconDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    largeBorderlessButton = this.nullableLargeBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.nullableListOfColorAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    list2 = this.nullableListOfColorIconAdapter.fromJson(reader);
                    break;
                case 7:
                    list3 = this.nullableListOfColorAspectAdapter.fromJson(reader);
                    break;
                case 8:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new FiltersDTO.Section.Filter.ColorFilter(str, icon, atomActionDTO, map, largeBorderlessButton, list, list2, list3, bool, iconDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FiltersDTO.Section.Filter.ColorFilter value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("icon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("rightButton");
        this.nullableLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getRightButton());
        writer.w("colors");
        this.nullableListOfColorAtomAdapter.mo44toJson(writer, (x) value.getColors());
        writer.w("colorIcons");
        this.nullableListOfColorIconAdapter.mo44toJson(writer, (x) value.getColorIcons());
        writer.w("colorAspects");
        this.nullableListOfColorAspectAdapter.mo44toJson(writer, (x) value.getColorAspects());
        writer.w("scrollEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getScrollEnabled());
        writer.w("rightIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getRightIcon());
        writer.p();
    }
}
