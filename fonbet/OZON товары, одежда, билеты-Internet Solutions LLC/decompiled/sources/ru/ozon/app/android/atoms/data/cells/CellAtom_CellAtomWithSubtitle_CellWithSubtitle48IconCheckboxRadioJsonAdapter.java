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
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom_CellAtomWithSubtitle_CellWithSubtitle48IconCheckboxRadioJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48IconCheckboxRadio;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48IconCheckboxRadio;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48IconCheckboxRadio;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "alignAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellAtom_CellAtomWithSubtitle_CellWithSubtitle48IconCheckboxRadioJsonAdapter extends JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio> {

    @NotNull
    private final JsonAdapter<CellAtom.Align> alignAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio> constructorRef;

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

    public CellAtom_CellAtomWithSubtitle_CellWithSubtitle48IconCheckboxRadioJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", "iconTintColor", "isSelected", "isRadio", "showParanjaAndPaddings", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "subtitle", "subtitleColor", "align", "maxLines", "action", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "icon");
        this.nullableStringAdapter = moshi.f(String.class, m11, "iconTintColor");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "subtitle");
        this.alignAdapter = moshi.f(CellAtom.Align.class, m11, "align");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxLines");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(87, "GeneratedJsonAdapter(CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i12 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        String str = null;
        String str2 = null;
        CellAtom.Align align = null;
        String str3 = null;
        String str4 = null;
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        Integer num = null;
        AtomActionDTO atomActionDTO = null;
        String str5 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    continue;
                case 1:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    i12 &= -5;
                    continue;
                case 3:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isRadio", "isRadio", reader);
                    }
                    i12 &= -9;
                    continue;
                case 4:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("showParanjaAndPaddings", "showParanjaAndPaddings", reader);
                    }
                    i12 &= -17;
                    continue;
                case 5:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    continue;
                case 6:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("titleColor", "titleColor", reader);
                    }
                    i12 &= -65;
                    continue;
                case 7:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    continue;
                case 8:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("subtitleColor", "subtitleColor", reader);
                    }
                    i12 &= -257;
                    continue;
                case 9:
                    align = this.alignAdapter.fromJson(reader);
                    if (align == null) {
                        throw c.q("align", "align", reader);
                    }
                    i12 &= -513;
                    continue;
                case 10:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i12 &= -2049;
                    continue;
                case 12:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("hideSeparator", "hideSeparator", reader);
                    }
                    i12 &= -4097;
                    continue;
                case 13:
                    bool5 = this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        throw c.q("colorDisabledAsEnabled", "colorDisabledAsEnabled", reader);
                    }
                    i12 &= -8193;
                    continue;
                case 14:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -16385;
                    continue;
                case 15:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 = -32769;
                    break;
                case 16:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 = -65537;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 == -131037) {
            if (str3 == null) {
                throw c.j("icon", "icon", reader);
            }
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool3.booleanValue();
            boolean booleanValue3 = bool4.booleanValue();
            if (ozonSpannableString == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return new CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio(str3, str4, booleanValue, booleanValue2, booleanValue3, ozonSpannableString, str, ozonSpannableString2, str2, align, num, atomActionDTO, HY.b.e(str2, "null cannot be cast to non-null type kotlin.String", align, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.cells.CellAtom.Align", bool), bool5.booleanValue(), str5, testInfo, map);
        }
        String str6 = str;
        String str7 = str2;
        Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio.class.getDeclaredConstructor(String.class, String.class, cls2, cls2, cls2, OzonSpannableString.class, String.class, OzonSpannableString.class, String.class, CellAtom.Align.class, Integer.class, AtomActionDTO.class, cls2, cls2, String.class, TestInfo.class, Map.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str3 == null) {
            throw c.j("icon", "icon", reader);
        }
        if (ozonSpannableString == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio newInstance = constructor.newInstance(str3, str4, bool2, bool3, bool4, ozonSpannableString, str6, ozonSpannableString2, str7, align, num, atomActionDTO, bool, bool5, str5, testInfo, map, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIconTintColor());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("isRadio");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isRadio()));
        writer.w("showParanjaAndPaddings");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowParanjaAndPaddings()));
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
