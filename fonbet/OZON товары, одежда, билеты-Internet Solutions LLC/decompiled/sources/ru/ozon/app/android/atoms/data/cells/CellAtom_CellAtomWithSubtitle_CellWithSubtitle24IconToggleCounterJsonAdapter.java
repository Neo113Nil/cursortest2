package ru.ozon.app.android.atoms.data.cells;

import Ak.b;
import Y9.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom_CellAtomWithSubtitle_CellWithSubtitle24IconToggleCounterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconToggleCounter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconToggleCounter;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconToggleCounter;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "iconPositionAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "alignAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellAtom_CellAtomWithSubtitle_CellWithSubtitle24IconToggleCounterJsonAdapter extends JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter> {

    @NotNull
    private final JsonAdapter<CellAtom.Align> alignAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter> constructorRef;

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

    public CellAtom_CellAtomWithSubtitle_CellWithSubtitle24IconToggleCounterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isSelected", "counter", "counterColor", "counterBackground", "counterIcon", "counterIconPosition", "selectedTrackingInfo", "icon", "iconTintColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "subtitle", "subtitleColor", "align", "maxLines", "action", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "trackingInfo");
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
        return b.c(87, "GeneratedJsonAdapter(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        String str = null;
        Boolean bool2 = bool;
        Boolean bool3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Badge.IconPosition iconPosition = null;
        CellAtom.Align align = null;
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        Integer num = null;
        AtomActionDTO atomActionDTO = null;
        String str6 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str7 = null;
        String str8 = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        int i12 = -1;
        String str9 = null;
        while (true) {
            Boolean bool4 = bool3;
            String str10 = str2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i12 == -4192383) {
                    String str11 = str6;
                    if (bool4 == null) {
                        throw c.j("isSelected", "isSelected", reader);
                    }
                    TestInfo testInfo2 = testInfo;
                    boolean booleanValue = bool4.booleanValue();
                    Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.g(iconPosition, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.badge.Badge.IconPosition");
                    if (str7 == null) {
                        throw c.j("icon", "icon", reader);
                    }
                    if (ozonSpannableString == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
                    return new CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter(booleanValue, str10, str3, str4, str5, iconPosition, map, str7, str8, false, ozonSpannableString, str, ozonSpannableString2, str9, align, num, atomActionDTO, HY.b.e(str9, "null cannot be cast to non-null type kotlin.String", align, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.cells.CellAtom.Align", bool), bool2.booleanValue(), str11, testInfo2, map2, UserVerificationMethods.USER_VERIFY_NONE, null);
                }
                String str12 = str;
                String str13 = str9;
                Badge.IconPosition iconPosition2 = iconPosition;
                CellAtom.Align align2 = align;
                String str14 = str6;
                TestInfo testInfo3 = testInfo;
                Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Boolean.TYPE;
                    constructor = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter.class.getDeclaredConstructor(cls2, String.class, String.class, String.class, String.class, Badge.IconPosition.class, Map.class, String.class, String.class, cls2, OzonSpannableString.class, String.class, OzonSpannableString.class, String.class, CellAtom.Align.class, Integer.class, AtomActionDTO.class, cls2, cls2, String.class, TestInfo.class, Map.class, Integer.TYPE, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                }
                if (bool4 == null) {
                    throw c.j("isSelected", "isSelected", reader);
                }
                if (str7 == null) {
                    throw c.j("icon", "icon", reader);
                }
                Boolean bool5 = Boolean.FALSE;
                if (ozonSpannableString == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter newInstance = constructor.newInstance(bool4, str10, str3, str4, str5, iconPosition2, map, str7, str8, bool5, ozonSpannableString, str12, ozonSpannableString2, str13, align2, num, atomActionDTO, bool, bool2, str14, testInfo3, map2, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool3 = bool4;
                    str2 = str10;
                case 0:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    str2 = str10;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                    bool3 = bool4;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("counterColor", "counterColor", reader);
                    }
                    i12 &= -5;
                    bool3 = bool4;
                    str2 = str10;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("counterBackground", "counterBackground", reader);
                    }
                    i12 &= -9;
                    bool3 = bool4;
                    str2 = str10;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    bool3 = bool4;
                    str2 = str10;
                case 5:
                    iconPosition = this.iconPositionAdapter.fromJson(reader);
                    if (iconPosition == null) {
                        throw c.q("counterIconPosition", "counterIconPosition", reader);
                    }
                    i12 &= -33;
                    bool3 = bool4;
                    str2 = str10;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -65;
                    bool3 = bool4;
                    str2 = str10;
                case 7:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    bool3 = bool4;
                    str2 = str10;
                case 8:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    bool3 = bool4;
                    str2 = str10;
                case 9:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool3 = bool4;
                    str2 = str10;
                case 10:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("titleColor", "titleColor", reader);
                    }
                    i12 &= -2049;
                    bool3 = bool4;
                    str2 = str10;
                case 11:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                    bool3 = bool4;
                    str2 = str10;
                case 12:
                    str9 = this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw c.q("subtitleColor", "subtitleColor", reader);
                    }
                    i12 &= -8193;
                    bool3 = bool4;
                    str2 = str10;
                case 13:
                    align = this.alignAdapter.fromJson(reader);
                    if (align == null) {
                        throw c.q("align", "align", reader);
                    }
                    i12 &= -16385;
                    bool3 = bool4;
                    str2 = str10;
                case 14:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 = -32769;
                    i12 &= i11;
                    bool3 = bool4;
                    str2 = str10;
                case 15:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 = -65537;
                    i12 &= i11;
                    bool3 = bool4;
                    str2 = str10;
                case 16:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("hideSeparator", "hideSeparator", reader);
                    }
                    i11 = -131073;
                    i12 &= i11;
                    bool3 = bool4;
                    str2 = str10;
                case 17:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("colorDisabledAsEnabled", "colorDisabledAsEnabled", reader);
                    }
                    i11 = -262145;
                    i12 &= i11;
                    bool3 = bool4;
                    str2 = str10;
                case 18:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -524289;
                    i12 &= i11;
                    bool3 = bool4;
                    str2 = str10;
                case 19:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 = -1048577;
                    i12 &= i11;
                    bool3 = bool4;
                    str2 = str10;
                case 20:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 = -2097153;
                    i12 &= i11;
                    bool3 = bool4;
                    str2 = str10;
                default:
                    bool3 = bool4;
                    str2 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
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
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIconTintColor());
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
