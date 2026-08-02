package ru.ozon.app.android.atoms.data.cells;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom_CellAtomWithSubtitle_CellWithSubtitleCheckboxRadioCounterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "iconPositionAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "alignAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellAtom_CellAtomWithSubtitle_CellWithSubtitleCheckboxRadioCounterJsonAdapter extends JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> {

    @NotNull
    private final JsonAdapter<CellAtom.Align> alignAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> constructorRef;

    @NotNull
    private final JsonAdapter<Badge.IconPosition> iconPositionAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CellAtom_CellAtomWithSubtitle_CellWithSubtitleCheckboxRadioCounterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isSelected", "isRadio", "counter", "counterColor", "counterBackground", "counterIcon", "counterIconPosition", "selectedTrackingInfo", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "subtitle", "subtitleColor", "align", "maxLines", "action", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "trackingInfo");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.nullableStringAdapter = moshi.f(String.class, m11, "counter");
        this.stringAdapter = moshi.f(String.class, m11, "counterColor");
        this.iconPositionAdapter = moshi.f(Badge.IconPosition.class, m11, "counterIconPosition");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "selectedTrackingInfo");
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "subtitle");
        this.alignAdapter = moshi.f(CellAtom.Align.class, m11, "align");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxLines");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(88, "GeneratedJsonAdapter(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        String str = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Badge.IconPosition iconPosition = null;
        String str6 = null;
        OzonSpannableString ozonSpannableString = null;
        Integer num = null;
        AtomActionDTO atomActionDTO = null;
        String str7 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        OzonSpannableString ozonSpannableString2 = null;
        int i12 = -1;
        CellAtom.Align align = null;
        while (true) {
            Boolean bool5 = bool2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i12 != -1048320) {
                    String str8 = str;
                    CellAtom.Align align2 = align;
                    String str9 = str7;
                    TestInfo testInfo2 = testInfo;
                    Map<String, TokenizedTrackingInfo> map3 = map;
                    Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> constructor = this.constructorRef;
                    if (constructor == null) {
                        Class<?> cls = c.f34864d;
                        Class cls2 = Boolean.TYPE;
                        constructor = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.class.getDeclaredConstructor(cls2, cls2, String.class, String.class, String.class, String.class, Badge.IconPosition.class, Map.class, OzonSpannableString.class, String.class, OzonSpannableString.class, String.class, CellAtom.Align.class, Integer.class, AtomActionDTO.class, cls2, cls2, String.class, TestInfo.class, Map.class, Integer.TYPE, cls);
                        this.constructorRef = constructor;
                        Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                    }
                    if (ozonSpannableString2 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter newInstance = constructor.newInstance(bool5, bool3, str2, str3, str4, str5, iconPosition, map2, ozonSpannableString2, str6, ozonSpannableString, str8, align2, num, atomActionDTO, bool, bool4, str9, testInfo2, map3, Integer.valueOf(i12), null);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                    return newInstance;
                }
                String str10 = str7;
                TestInfo testInfo3 = testInfo;
                boolean booleanValue = bool5.booleanValue();
                Map<String, TokenizedTrackingInfo> map4 = map;
                boolean booleanValue2 = bool3.booleanValue();
                Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.g(iconPosition, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.badge.Badge.IconPosition");
                if (ozonSpannableString2 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                Intrinsics.g(str6, "null cannot be cast to non-null type kotlin.String");
                return new CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter(booleanValue, booleanValue2, str2, str3, str4, str5, iconPosition, map2, ozonSpannableString2, str6, ozonSpannableString, str, align, num, atomActionDTO, HY.b.e(str, "null cannot be cast to non-null type kotlin.String", align, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.cells.CellAtom.Align", bool), bool4.booleanValue(), str10, testInfo3, map4);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool2 = bool5;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    i12 &= -2;
                case 1:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isRadio", "isRadio", reader);
                    }
                    i12 &= -3;
                    bool2 = bool5;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    bool2 = bool5;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("counterColor", "counterColor", reader);
                    }
                    i12 &= -9;
                    bool2 = bool5;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("counterBackground", "counterBackground", reader);
                    }
                    i12 &= -17;
                    bool2 = bool5;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    bool2 = bool5;
                case 6:
                    iconPosition = this.iconPositionAdapter.fromJson(reader);
                    if (iconPosition == null) {
                        throw c.q("counterIconPosition", "counterIconPosition", reader);
                    }
                    i12 &= -65;
                    bool2 = bool5;
                case 7:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -129;
                    bool2 = bool5;
                case 8:
                    ozonSpannableString2 = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString2 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool2 = bool5;
                case 9:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("titleColor", "titleColor", reader);
                    }
                    i12 &= -513;
                    bool2 = bool5;
                case 10:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    bool2 = bool5;
                case 11:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("subtitleColor", "subtitleColor", reader);
                    }
                    i12 &= -2049;
                    bool2 = bool5;
                case 12:
                    align = this.alignAdapter.fromJson(reader);
                    if (align == null) {
                        throw c.q("align", "align", reader);
                    }
                    i12 &= -4097;
                    bool2 = bool5;
                case 13:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -8193;
                    bool2 = bool5;
                case 14:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i12 &= -16385;
                    bool2 = bool5;
                case 15:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("hideSeparator", "hideSeparator", reader);
                    }
                    i11 = -32769;
                    i12 &= i11;
                    bool2 = bool5;
                case 16:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("colorDisabledAsEnabled", "colorDisabledAsEnabled", reader);
                    }
                    i11 = -65537;
                    i12 &= i11;
                    bool2 = bool5;
                case 17:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -131073;
                    i12 &= i11;
                    bool2 = bool5;
                case 18:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 = -262145;
                    i12 &= i11;
                    bool2 = bool5;
                case 19:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 = -524289;
                    i12 &= i11;
                    bool2 = bool5;
                default:
                    bool2 = bool5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("isRadio");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isRadio()));
        writer.w("counter");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCounter());
        writer.w("counterColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getCounterColor());
        writer.w("counterBackground");
        this.stringAdapter.mo44toJson(writer, (x) value.getCounterBackground());
        writer.w("counterIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCounterIcon());
        writer.w("counterIconPosition");
        this.iconPositionAdapter.mo44toJson(writer, (x) value.getCounterIconPosition());
        writer.w("selectedTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSelectedTrackingInfo());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("titleColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTitleColor());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("subtitleColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtitleColor());
        writer.w("align");
        this.alignAdapter.mo44toJson(writer, (x) value.getAlign());
        writer.w("maxLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxLines());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("hideSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHideSeparator()));
        writer.w("colorDisabledAsEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getColorDisabledAsEnabled()));
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
