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

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom_CellAtomWithSubtitle_CellWithSubtitle24IconCounterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "iconPositionAdapter", "nullableStringAdapter", "", "booleanAdapter", "nullableOzonSpannableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "alignAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellAtom_CellAtomWithSubtitle_CellWithSubtitle24IconCounterJsonAdapter extends JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> {

    @NotNull
    private final JsonAdapter<CellAtom.Align> alignAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> constructorRef;

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

    public CellAtom_CellAtomWithSubtitle_CellWithSubtitle24IconCounterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "counterColor", "counterBackground", "counterIconPosition", "iconTintColor", "counter", "counterIcon", "disclosureTintColor", "hideDisclosure", "subtitle", "action", "trackingInfo", "testInfo", "maxLines", "context", "titleColor", "subtitleColor", "hideSeparator", "colorDisabledAsEnabled", "align");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "icon");
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.iconPositionAdapter = moshi.f(Badge.IconPosition.class, m11, "counterIconPosition");
        this.nullableStringAdapter = moshi.f(String.class, m11, "iconTintColor");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hideDisclosure");
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "subtitle");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxLines");
        this.alignAdapter = moshi.f(CellAtom.Align.class, m11, "align");
    }

    @NotNull
    public String toString() {
        return b.c(81, "GeneratedJsonAdapter(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter fromJson(@NotNull n reader) {
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
        OzonSpannableString ozonSpannableString = null;
        String str4 = null;
        String str5 = null;
        Badge.IconPosition iconPosition = null;
        OzonSpannableString ozonSpannableString2 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        Integer num = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i12 = -1;
        CellAtom.Align align = null;
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
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    continue;
                case 2:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("counterColor", "counterColor", reader);
                    }
                    i12 &= -5;
                    continue;
                case 3:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("counterBackground", "counterBackground", reader);
                    }
                    i12 &= -9;
                    continue;
                case 4:
                    iconPosition = this.iconPositionAdapter.fromJson(reader);
                    if (iconPosition == null) {
                        throw c.q("counterIconPosition", "counterIconPosition", reader);
                    }
                    i12 &= -17;
                    continue;
                case 5:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    continue;
                case 6:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                    continue;
                case 7:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    continue;
                case 8:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    continue;
                case 9:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("hideDisclosure", "hideDisclosure", reader);
                    }
                    i12 &= -513;
                    continue;
                case 10:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i12 &= -2049;
                    continue;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -4097;
                    continue;
                case 13:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -8193;
                    continue;
                case 14:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -16385;
                    continue;
                case 15:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -32769;
                    break;
                case 16:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("titleColor", "titleColor", reader);
                    }
                    i11 = -65537;
                    break;
                case 17:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("subtitleColor", "subtitleColor", reader);
                    }
                    i11 = -131073;
                    break;
                case 18:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("hideSeparator", "hideSeparator", reader);
                    }
                    i11 = -262145;
                    break;
                case 19:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("colorDisabledAsEnabled", "colorDisabledAsEnabled", reader);
                    }
                    i11 = -524289;
                    break;
                case 20:
                    align = this.alignAdapter.fromJson(reader);
                    if (align == null) {
                        throw c.q("align", "align", reader);
                    }
                    i11 = -1048577;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 != -2097149) {
            String str11 = str2;
            String str12 = str;
            CellAtom.Align align2 = align;
            Badge.IconPosition iconPosition2 = iconPosition;
            Constructor<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> constructor = this.constructorRef;
            if (constructor == null) {
                Class<?> cls = c.f34864d;
                Class cls2 = Boolean.TYPE;
                constructor = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter.class.getDeclaredConstructor(String.class, OzonSpannableString.class, String.class, String.class, Badge.IconPosition.class, String.class, String.class, String.class, String.class, cls2, OzonSpannableString.class, AtomActionDTO.class, Map.class, TestInfo.class, Integer.class, String.class, String.class, String.class, cls2, cls2, CellAtom.Align.class, Integer.TYPE, cls);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            if (str3 == null) {
                throw c.j("icon", "icon", reader);
            }
            if (ozonSpannableString == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter newInstance = constructor.newInstance(str3, ozonSpannableString, str4, str5, iconPosition2, str7, str8, str9, str10, bool2, ozonSpannableString2, atomActionDTO, map, testInfo, num, str6, str12, str11, bool3, bool4, align2, Integer.valueOf(i12), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        if (str3 == null) {
            throw c.j("icon", "icon", reader);
        }
        if (ozonSpannableString == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(str5, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(iconPosition, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.badge.Badge.IconPosition");
        boolean booleanValue = bool2.booleanValue();
        Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
        boolean booleanValue2 = bool3.booleanValue();
        boolean booleanValue3 = bool4.booleanValue();
        Intrinsics.g(align, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.cells.CellAtom.Align");
        return new CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter(str3, ozonSpannableString, str4, str5, iconPosition, str7, str8, str9, str10, booleanValue, ozonSpannableString2, atomActionDTO, map, testInfo, num, str6, str, str2, booleanValue2, booleanValue3, align);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("counterColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getCounterColor());
        writer.w("counterBackground");
        this.stringAdapter.mo44toJson(writer, (x) value.getCounterBackground());
        writer.w("counterIconPosition");
        this.iconPositionAdapter.mo44toJson(writer, (x) value.getCounterIconPosition());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIconTintColor());
        writer.w("counter");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCounter());
        writer.w("counterIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCounterIcon());
        writer.w("disclosureTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDisclosureTintColor());
        writer.w("hideDisclosure");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHideDisclosure()));
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("maxLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxLines());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.w("titleColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTitleColor());
        writer.w("subtitleColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtitleColor());
        writer.w("hideSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHideSeparator()));
        writer.w("colorDisabledAsEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getColorDisabledAsEnabled()));
        writer.w("align");
        this.alignAdapter.mo44toJson(writer, (x) value.getAlign());
        writer.p();
    }
}
